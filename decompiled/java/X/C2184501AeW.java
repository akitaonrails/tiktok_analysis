package X;

import Y.ARunnableS133S0100000_33;
import android.app.Activity;
import android.app.Application;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184501AeW implements InterfaceC1602040rn8 {
    public final Activity LL;
    public C2184491AeV LLILLJJLI;

    @Override // X.InterfaceC1602040rn8
    public final AssetManager LJIIJ() {
        C2184491AeV c2184491AeV = this.LLILLJJLI;
        if (c2184491AeV == null || !c2184491AeV.LIZJ || !AnonymousClass0716.LJFF() || Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return null;
        }
        return this.LL.getApplication().getAssets();
    }

    @Override // X.InterfaceC1602040rn8
    public final Resources getResources() {
        C2184491AeV c2184491AeV = this.LLILLJJLI;
        if (c2184491AeV == null || !c2184491AeV.LIZJ || !AnonymousClass0716.LJFF() || Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return null;
        }
        return this.LL.getApplication().getResources();
    }

    @Override // X.InterfaceC1602040rn8
    public final Resources.Theme getTheme() {
        C2184491AeV c2184491AeV = this.LLILLJJLI;
        if (c2184491AeV == null || !c2184491AeV.LIZJ || !AnonymousClass0716.LJFF() || Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return null;
        }
        return this.LL.getApplication().getTheme();
    }

    public C2184501AeW(Activity activity) {
        this.LL = activity;
    }

    @Override // X.InterfaceC1602040rn8
    public final Object LJJ(String str) {
        if (Build.VERSION.SDK_INT <= 27 || !((Boolean) C303880Bve.LIZ.getValue()).booleanValue() || !TextUtils.equals("layout_inflater", str)) {
            return null;
        }
        if (this.LL.getBaseContext() != null) {
            C2184511AeX c2184511AeX = C2184511AeX.LJ;
            Activity activity = this.LL;
            if (c2184511AeX.LIZJ == null) {
                return null;
            }
            int i = C2184511AeX.LIZLLL;
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                String name = C786410Ut5.u3().getName();
                Object obj = ((ConcurrentHashMap) c2184511AeX.LIZ).get(name);
                if (obj == null) {
                    LayoutInflater layoutInflaterLIZ = c2184511AeX.LIZ(activity);
                    ((ConcurrentHashMap) c2184511AeX.LIZ).put(name, layoutInflaterLIZ);
                    return layoutInflaterLIZ;
                }
                return obj;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if ("NitaMainThread".equals(C786410Ut5.u3().getName())) {
                    if (c2184511AeX.LIZIZ == null) {
                        c2184511AeX.LIZIZ = c2184511AeX.LIZ(activity);
                    }
                    return c2184511AeX.LIZIZ;
                }
                return c2184511AeX.LIZJ.LIZ();
            }
            if (c2184511AeX.LIZIZ == null) {
                c2184511AeX.LIZIZ = c2184511AeX.LIZ(activity);
            }
            return c2184511AeX.LIZIZ;
        }
        "System services not available to Activities before onCreate()".toString();
        throw new IllegalStateException("System services not available to Activities before onCreate()");
    }

    @Override // X.InterfaceC1602040rn8
    public final void LJJIL(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C2184491AeV c2184491AeV = this.LLILLJJLI;
        if (c2184491AeV != null && c2184491AeV.LIZJ && AnonymousClass0716.LJFF()) {
            C2184491AeV c2184491AeV2 = this.LLILLJJLI;
            if (c2184491AeV2 != null) {
                Application application = this.LL.getApplication();
                if (c2184491AeV2.LIZJ) {
                    application.setTheme(c2184491AeV2.LIZ);
                    application.getResources().getConfiguration().setTo(c2184491AeV2.LIZIZ);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        long j = C0BH9.LIZ;
        int i2 = 1;
        if (j == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z && j != 5) {
            if (C2184641Aek.LIZ()) {
                C823050WQl.LIZIZ().execute(new ARunnableS133S0100000_33(this, 69));
            }
        } else {
            if (j == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (j == 5) {
                z3 = true;
            } else {
                z3 = false;
            }
            C0CN5.LIZ(z2, z3, Mp4ScreenVideoLoadTimeout.CONTROL, new Runnable() { // from class: X.1AeY
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ActivityResourceOptComponentImpl@cd9.setTheme$1");
                    try {
                        if (C2184641Aek.LIZ()) {
                            C823050WQl.LIZIZ().execute(new ARunnableS133S0100000_33(this.LL, 68));
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ActivityResourceOptComponentImpl@cd9.setTheme$1");
                }
            });
        }
        if (((Boolean) C303880Bve.LIZ.getValue()).booleanValue()) {
            if (!((Boolean) C303880Bve.LJI.getValue()).booleanValue() && !((Boolean) C303880Bve.LIZJ.getValue()).booleanValue() && !((Boolean) C303880Bve.LJ.getValue()).booleanValue()) {
                i2 = 0;
            }
            C2184511AeX.LJ.LIZIZ(new InterfaceC739920T0s() { // from class: X.1AeZ
                @Override // X.InterfaceC739920T0s
                public final LayoutInflater LIZ() {
                    return this.LIZ.LL.getLayoutInflater();
                }
            }, i2);
        }
    }
}
