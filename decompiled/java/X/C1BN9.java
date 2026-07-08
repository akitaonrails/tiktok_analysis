package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1BN9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BN9 implements C1BNA {
    public static C1BN9 LLILLL;
    public boolean LL;
    public final List<C1BNA> LLILLJJLI = new CopyOnWriteArrayList();

    public final synchronized void LIZJ() {
        if (this.LL) {
            return;
        }
        C844470XAv.LIZ.getClass();
        if (C2162308dZ.LJI(C844470XAv.LIZ())) {
            LIZLLL().LJ(ComplianceServiceProvider.LJ().LJFF());
            LIZLLL().LJ(ComplianceServiceProvider.LJ().LIZIZ());
            LIZLLL().LJ(new C797910VRt());
        }
        this.LL = true;
    }

    public static C1BN9 LIZLLL() {
        if (LLILLL == null) {
            synchronized (C1BN9.class) {
                try {
                    if (LLILLL == null) {
                        LLILLL = new C1BN9();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILLL;
    }

    @Override // X.C1BNA
    public final void LIZ() {
        LIZJ();
        synchronized (C1BN9.class) {
            try {
                for (C1BNA c1bna : (CopyOnWriteArrayList) this.LLILLJJLI) {
                    if (c1bna != null) {
                        c1bna.LIZ();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1BNA
    public final void LIZIZ() {
        LIZJ();
        synchronized (C1BN9.class) {
            try {
                for (C1BNA c1bna : (CopyOnWriteArrayList) this.LLILLJJLI) {
                    if (c1bna != null) {
                        c1bna.LIZIZ();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(C1BNA c1bna) {
        synchronized (C1BN9.class) {
            if (c1bna != null) {
                try {
                    if (!((CopyOnWriteArrayList) this.LLILLJJLI).contains(c1bna)) {
                        ((CopyOnWriteArrayList) this.LLILLJJLI).add(c1bna);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
