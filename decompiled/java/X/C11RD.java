package X;

import Y.ACallableS432S0100000_29;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11RD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RD {
    public static C11L0 LIZIZ(C11RH c11rh) {
        return new C11L0(new C11JX(new ACallableS432S0100000_29(c11rh, 1)), null);
    }

    public static C11L0 LIZJ(final View view) {
        if (view == null) {
            return LIZIZ(new C11RF());
        }
        return LIZIZ(new C11RH(view) { // from class: X.11RA
            public final View LIZ;

            @Override // X.C11RH
            public final C11IV LIZ() {
                return new C11IV(this.LIZ) { // from class: X.11R8
                    public final View LL;

                    {
                        this.LL = view;
                    }

                    @Override // X.C11IV
                    public final void LIZIZ(C11IY c11iy) {
                        C11R9 c11r9 = new C11R9(this.LL, c11iy);
                        c11iy.onSubscribe(c11r9);
                        try {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                if (!this.LL.isAttachedToWindow() && this.LL.getWindowToken() == null) {
                                    c11iy.onError(new C2203408kC("View is not attached!"));
                                    return;
                                }
                                this.LL.addOnAttachStateChangeListener(c11r9);
                                if (c11r9.isDisposed()) {
                                    this.LL.removeOnAttachStateChangeListener(c11r9);
                                    return;
                                }
                                return;
                            }
                            c11iy.onError(new IllegalStateException("Views can only be bound to on the main thread!"));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw C11QG.LIZIZ(e);
                        }
                    }
                };
            }

            {
                this.LIZ = view;
            }
        });
    }

    public static C11L0 LIZLLL(Fragment fragment) {
        if (fragment == null) {
            return LIZIZ(new C11RF());
        }
        return LIZIZ(C11RB.LIZJ(fragment, Lifecycle.Event.ON_DESTROY));
    }

    public static C11L0 LJ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner == null) {
            return LIZIZ(new C11RF());
        }
        return LIZIZ(C11RB.LIZJ(lifecycleOwner, Lifecycle.Event.ON_DESTROY));
    }

    public static C11L0 LIZ(C11RB c11rb, C0UO0 c0uo0) {
        return new C11L0(new C11JX(new ACallableS432S0100000_29(c11rb, 0)), c0uo0);
    }
}
