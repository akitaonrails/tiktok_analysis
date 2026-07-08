package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MY6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MY6 {
    public static final C0MY6 LIZ = new C0MY6();
    public static final Map<C0MY7, WeakReference<C576150Mij<?, ?>>> LIZIZ = new ConcurrentHashMap();

    public static C576150Mij LIZ(C0MY6 c0my6, final Class cls, final Class cls2, final boolean z, int i) {
        C576150Mij c576150Mij;
        final boolean z2 = false;
        if ((i & 8) != 0) {
            z = false;
        }
        c0my6.getClass();
        try {
            Map<C0MY7, WeakReference<C576150Mij<?, ?>>> map = LIZIZ;
            WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) map).get(new Object(cls, cls2, z2, z) { // from class: X.0MY7
                public final Class<?> LIZ;
                public final Class<?> LIZIZ;
                public final boolean LIZJ;
                public final boolean LIZLLL;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0MY7)) {
                        return false;
                    }
                    C0MY7 c0my7 = (C0MY7) obj;
                    return Intrinsics.LJFF(this.LIZ, c0my7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0my7.LIZIZ) && this.LIZJ == c0my7.LIZJ && this.LIZLLL == c0my7.LIZLLL;
                }

                public final int hashCode() {
                    return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
                }

                {
                    this.LIZ = cls;
                    this.LIZIZ = cls2;
                    this.LIZJ = z2;
                    this.LIZLLL = z;
                }
            });
            if (weakReference == null || (c576150Mij = (C576150Mij) weakReference.get()) == null) {
                C576150Mij c576150Mij2 = new C576150Mij(cls, cls2, false, z);
                ((ConcurrentHashMap) map).put(new Object(cls, cls2, z2, z) { // from class: X.0MY7
                    public final Class<?> LIZ;
                    public final Class<?> LIZIZ;
                    public final boolean LIZJ;
                    public final boolean LIZLLL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0MY7)) {
                            return false;
                        }
                        C0MY7 c0my7 = (C0MY7) obj;
                        return Intrinsics.LJFF(this.LIZ, c0my7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0my7.LIZIZ) && this.LIZJ == c0my7.LIZJ && this.LIZLLL == c0my7.LIZLLL;
                    }

                    public final int hashCode() {
                        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
                    }

                    {
                        this.LIZ = cls;
                        this.LIZIZ = cls2;
                        this.LIZJ = z2;
                        this.LIZLLL = z;
                    }
                }, new WeakReference(c576150Mij2));
                return c576150Mij2;
            }
            return c576150Mij;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
            return new C576150Mij(cls, cls2, false, z);
        }
    }
}
