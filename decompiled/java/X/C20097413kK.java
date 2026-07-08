package X;

import Y.ARunnableS107S0100000_7;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import u4.q0;

/* JADX INFO: renamed from: X.13kK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20097413kK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        View currentFocus;
        Activity activityLIZ = C1388190mED.LIZ(view.getContext());
        if (activityLIZ != null && (currentFocus = activityLIZ.getCurrentFocus()) != null) {
            ((InputMethodManager) C786410Ut5.H2(view.getContext(), "input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            return;
        }
        C1A6V c1a6vLJIIJ = q0.LJIIJ(view);
        if (c1a6vLJIIJ == null) {
            return;
        }
        c1a6vLJIIJ.LIZ(8);
    }

    public static boolean LIZIZ(View view) {
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(view);
        if (c20246014JuLIZ != null) {
            return c20246014JuLIZ.LJIIIIZZ(8);
        }
        return false;
    }

    public static void LIZLLL(C20584715gj c20584715gj) {
        c20584715gj.setFocusable(true);
        c20584715gj.setFocusableInTouchMode(true);
        c20584715gj.requestFocus();
        if (Build.VERSION.SDK_INT >= 29) {
            C1A6V c1a6vLJIIJ = q0.LJIIJ(c20584715gj);
            if (c1a6vLJIIJ != null) {
                c1a6vLJIIJ.LIZLLL(8);
                return;
            }
            return;
        }
        HandlerHook.viewPostDelay(c20584715gj, new ARunnableS107S0100000_7(c20584715gj, 276), 300L);
    }

    public static void LIZJ(final Window window, final View view, final Function1 function1, final Function2 function2) {
        boolean zLJI = MethodIDManager.LJI(202095);
        if (Build.VERSION.SDK_INT >= 29) {
            final C118300cf c118300cf = new C118300cf();
            final C013C c013c = new C013C();
            C786410Ut5.x3(window.getDecorView().getViewTreeObserver(), new C12YY(window, c013c, c118300cf, view, 1));
            window.setSoftInputMode(48);
            final C259800zU c259800zU = new C259800zU();
            q0.LJJII(window.getDecorView(), new C14JJ() { // from class: X.13jU
                @Override // X.C14JJ
                public final void LIZ(C14JM c14jm) {
                    boolean zLIZIZ = C20097413kK.LIZIZ(view);
                    Float fValueOf = Float.valueOf(1.0f);
                    Float fValueOf2 = Float.valueOf(0.0f);
                    if (zLIZIZ) {
                        Function2<Boolean, Float, Unit> function22 = function2;
                        if (function22 != null) {
                            function22.invoke(Boolean.TRUE, fValueOf);
                        }
                        Function1<Boolean, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(Boolean.TRUE);
                        }
                    } else {
                        view.setPadding(0, 0, 0, 0);
                        Function2<Boolean, Float, Unit> function23 = function2;
                        if (function23 != null) {
                            function23.invoke(Boolean.FALSE, fValueOf2);
                        }
                        Function1<Boolean, Unit> function13 = function1;
                        if (function13 != null) {
                            function13.invoke(Boolean.FALSE);
                        }
                    }
                    if (C20097413kK.LIZIZ(window.getDecorView())) {
                        Function2<Boolean, Float, Unit> function24 = function2;
                        if (function24 != null) {
                            function24.invoke(Boolean.TRUE, fValueOf);
                        }
                    } else {
                        Function2<Boolean, Float, Unit> function25 = function2;
                        if (function25 != null) {
                            function25.invoke(Boolean.FALSE, fValueOf2);
                        }
                    }
                    Function1<Boolean, Unit> function14 = function1;
                    if (function14 != null) {
                        function14.invoke(Boolean.valueOf(C20097413kK.LIZIZ(window.getDecorView())));
                    }
                    c013c.element = true;
                }

                @Override // X.C14JJ
                public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
                    C14JM c14jm = c259800zU.element;
                    if (c14jm != null) {
                        float fLIZIZ = c14jm.LIZ.LIZIZ();
                        int bottom = c118300cf.element - (window.getDecorView().getBottom() - c20246014Ju.LIZ(8).LIZLLL);
                        if (bottom < 0) {
                            bottom = 0;
                        }
                        view.setPadding(0, 0, 0, bottom);
                        if (C20097413kK.LIZIZ(window.getDecorView())) {
                            Function2<Boolean, Float, Unit> function22 = function2;
                            if (function22 != null) {
                                function22.invoke(Boolean.TRUE, Float.valueOf(fLIZIZ));
                            }
                        } else {
                            Function2<Boolean, Float, Unit> function23 = function2;
                            if (function23 != null) {
                                function23.invoke(Boolean.FALSE, Float.valueOf(1.0f - fLIZIZ));
                                return c20246014Ju;
                            }
                        }
                    }
                    return c20246014Ju;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C14JJ
                public final C14JL LIZLLL(C14JM c14jm, C14JL c14jl) {
                    c013c.element = false;
                    c259800zU.element = c14jm;
                    if (C20097413kK.LIZIZ(window.getDecorView())) {
                        C118300cf c118300cf2 = c118300cf;
                        View view2 = view;
                        int[] iArr = new int[2];
                        view2.getLocationInWindow(iArr);
                        c118300cf2.element = iArr[1] + view2.getHeight();
                    }
                    return c14jl;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            });
        } else {
            window.setSoftInputMode(16);
            C786410Ut5.x3(window.getDecorView().getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC854670Xft(new C013C(), window, function2, function1, 1));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
