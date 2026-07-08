package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.148r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202171148r {
    public static volatile C202171148r LIZLLL;
    public InterfaceC202161148h LIZ;
    public InterfaceC202162148i LIZIZ;
    public AbstractC202165148l LIZJ;

    public static C202171148r LIZ() {
        if (LIZLLL == null) {
            synchronized (C202171148r.class) {
                try {
                    LIZLLL = new C202171148r();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public C202171148r() {
        new Object() { // from class: X.148s
        };
    }
}
