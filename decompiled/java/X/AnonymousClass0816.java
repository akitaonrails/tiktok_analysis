package X;

import Y.ARunnableS103S0100000_3;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0816, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0816 implements AnonymousClass0812 {
    public Object LIZ;
    public Method LIZIZ;
    public C822660WOy LIZJ;
    public int[] LIZLLL;
    public final ARunnableS103S0100000_3 LJ = new ARunnableS103S0100000_3(this, 146);

    @Override // X.AnonymousClass0812
    public final boolean LIZ() {
        try {
            Method method = this.LIZIZ;
            if (method != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    C2204961BRm.a0(method, null, new Object[]{"UniperfClient", 4099}, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WG/mkIaqeJXM2DO0g+U=", null));
                } else if (i >= 26) {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = new int[]{5000};
                    }
                    C2204961BRm.a0(method, this.LIZ, new Object[]{4099, "", this.LIZLLL}, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WG/mkIaqeJXM2DO0g+U=", null));
                }
            }
            int i2 = 1;
            do {
                C822660WOy c822660WOy = this.LIZJ;
                if (c822660WOy != null) {
                    c822660WOy.schedule(this.LJ, ((long) i2) * 1000, TimeUnit.MILLISECONDS);
                }
                i2++;
            } while (i2 < 5);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // X.AnonymousClass0812
    public final boolean LIZLLL() {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                Class<?> cls = Class.forName("android.rms.iaware.IAwareSdk");
                this.LIZ = cls;
                Method methodLIZ = C1958307ll.LIZ(cls, "asyncSendData", String.class, Integer.TYPE);
                this.LIZIZ = methodLIZ;
                if (methodLIZ != null) {
                    this.LIZJ = new C822660WOy(1);
                    return true;
                }
            } else if (i >= 26) {
                Class<?> cls2 = Class.forName("android.iawareperf.UniPerf");
                Method methodLIZ2 = C1958307ll.LIZ(cls2, "getInstance", new Class[0]);
                if (methodLIZ2 != null) {
                    this.LIZ = C2204961BRm.a0(methodLIZ2, null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WG/mkIaqeJXM2DO0g+U=", null));
                }
                if (this.LIZ != null) {
                    Method methodLIZ3 = C1958307ll.LIZ(cls2, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                    this.LIZIZ = methodLIZ3;
                    if (methodLIZ3 != null) {
                        this.LIZJ = new C822660WOy(1);
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    @Override // X.AnonymousClass0812
    public final int getType() {
        return 3;
    }

    @Override // X.AnonymousClass0812
    public final void LIZJ(boolean z) {
        if (!z) {
            this.LIZJ.shutdownNow();
            this.LIZJ = null;
            this.LIZLLL = null;
        }
    }

    @Override // X.AnonymousClass0812
    public final void LIZIZ(int i, int[] iArr) {
        int i2 = (int) (i / 1000.0f);
        for (int i3 = 0; i3 < i2; i3++) {
            C822660WOy c822660WOy = this.LIZJ;
            if (c822660WOy != null) {
                c822660WOy.schedule(this.LJ, ((long) i3) * 1000, TimeUnit.MILLISECONDS);
            }
        }
    }
}
