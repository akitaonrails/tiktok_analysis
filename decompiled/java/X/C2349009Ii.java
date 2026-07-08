package X;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.09Ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2349009Ii {
    public static Method LIZLLL;
    public static Field LJ;
    public final ViewGroup LIZ;
    public final int LIZIZ = System.identityHashCode(this);
    public final C2349309Il LIZJ = new InterfaceC2349209Ik() { // from class: X.09Il
    };

    public final void LIZ() {
        if (LIZLLL == null) {
            try {
                Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getListenerInfo", new Class[0]);
                LIZLLL = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (LJ == null) {
            try {
                Field declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                LJ = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        LIZJ(0, this.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.09Il] */
    public C2349009Ii(Activity activity) {
        ViewGroup viewGroup;
        if (activity.getWindow().getDecorView() instanceof ViewGroup) {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        } else {
            viewGroup = null;
        }
        this.LIZ = viewGroup;
    }

    public final void LIZJ(int i, View view) {
        boolean z;
        boolean z2;
        if (view.getVisibility() == 0) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (view instanceof ViewGroup) {
                if (i > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (((viewGroup instanceof AbsListView) || (viewGroup instanceof RecyclerView)) && !z2) {
                    i = 1;
                } else {
                    LIZIZ(i, view, z);
                    if (z2) {
                        i++;
                    }
                }
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    LIZJ(i, viewGroup.getChildAt(i2));
                }
                return;
            }
            LIZIZ(i, view, z);
        }
    }

    public final void LIZIZ(int i, View view, boolean z) {
        final View.OnClickListener onClickListener;
        if (!z) {
            if (view.isClickable()) {
                if (i == 0 && view.getTag(this.LIZIZ) != null) {
                    return;
                }
            } else {
                return;
            }
        }
        try {
            Object objInvoke = LIZLLL.invoke(view, new Object[0]);
            if (objInvoke != null && (onClickListener = (View.OnClickListener) LJ.get(objInvoke)) != null && !(onClickListener instanceof ViewOnClickListenerC2349109Ij)) {
                Field field = LJ;
                final C2349309Il c2349309Il = this.LIZJ;
                field.set(objInvoke, new View.OnClickListener(onClickListener, c2349309Il) { // from class: X.09Ij
                    public final InterfaceC2349209Ik LL;
                    public final View.OnClickListener LLILLJJLI;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        InterfaceC2349209Ik interfaceC2349209Ik = this.LL;
                        if (interfaceC2349209Ik != null) {
                            interfaceC2349209Ik.getClass();
                            C2090208Gu.LIZ = SystemClock.elapsedRealtime();
                        }
                        View.OnClickListener onClickListener2 = this.LLILLJJLI;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(view2);
                        }
                    }

                    {
                        this.LLILLJJLI = onClickListener;
                        this.LL = c2349309Il;
                    }
                });
                view.setTag(this.LIZIZ, Integer.valueOf(i));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
