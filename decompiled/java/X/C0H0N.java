package X;

import Y.ARunnableS75S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H0N, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H0N {
    public static final void LIZIZ(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Gb8
                    public final /* synthetic */ float LL = 0.5f;
                    public final /* synthetic */ float LLILLJJLI = 1.0f;

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        int action = motionEvent.getAction();
                        if (action != 0) {
                            if (action == 1 || action == 3) {
                                C786410Ut5.T4(view2, this.LLILLJJLI);
                            }
                        } else {
                            C786410Ut5.T4(view2, this.LL);
                        }
                        return view2.onTouchEvent(motionEvent);
                    }
                });
            }
        }
    }

    public static final Activity LIZJ(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final FragmentManager LIZLLL(Fragment fragment) {
        try {
            return fragment.getChildFragmentManager();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            C1706630uVp.LIZJ("ViewExtension", e.toString());
            return null;
        }
    }

    public static final Rect LJ(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        return rect;
    }

    public static final Rect LJFF(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        return rect;
    }

    public static final LifecycleOwner LJI(Fragment fragment) {
        return fragment.getViewLifecycleOwnerLiveData().getValue();
    }

    public static final void LJII(View view) {
        if (view != null && view.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void LJIIIIZZ(View view) {
        if (view != null && view.getVisibility() != 4) {
            C786410Ut5.LJLLLLLL(4, view);
        }
    }

    public static final boolean LJIIJ(Context context) {
        if (context == null || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public static final void LJIILJJIL(View view) {
        if (view != null && view.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final Object LIZ(View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS75S0200000_6(view, c2252611DEt, 14));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public static final void LJIIIZ(View view, Function0<Unit> function0) {
        ViewTreeObserver viewTreeObserver;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe = new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(view, (Function0) function0, 0);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static void LJIIJJI(View view, Function0 function0) {
        RunnableC514801zW runnableC514801zW = new RunnableC514801zW(function0, (Function0<Unit>) 15);
        HandlerHook.viewPostDelay(view, runnableC514801zW, 0L);
        view.addOnAttachStateChangeListener(new C0IDW(view, runnableC514801zW, 0));
    }

    public static final void LJIIL(View view, boolean z) {
        if (z) {
            C786410Ut5.T4(view, 1.0f);
            view.setEnabled(true);
            view.setClickable(true);
        } else {
            C786410Ut5.T4(view, 0.34f);
            view.setEnabled(false);
            view.setClickable(false);
        }
    }

    public static final void LJIILIIL(View view, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        C786410Ut5.T4(view, f);
    }
}
