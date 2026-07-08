package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.08T1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08T1 implements C08T8 {
    public final /* synthetic */ C08T5 LIZ;
    public final /* synthetic */ Set LIZIZ;
    public final /* synthetic */ AtomicBoolean LIZJ;
    public final /* synthetic */ C2121508Sv LIZLLL;

    public C08T1(C2121508Sv c2121508Sv, C08T5 c08t5, Set set, AtomicBoolean atomicBoolean) {
        this.LIZLLL = c2121508Sv;
        this.LIZ = c08t5;
        this.LIZIZ = set;
        this.LIZJ = atomicBoolean;
    }

    @Override // X.C08T8
    public final void LIZ(C09NU c09nu, Set set) {
        this.LIZLLL.LIZLLL(this.LIZ, set, new C08T9() { // from class: X.08T2
            @Override // X.C08T9
            public final void LIZ(C08T7 c08t7, C0VSJ c0vsj, boolean z) {
                this.LIZ.LIZIZ.add(c0vsj);
                if (!z) {
                    this.LIZ.LIZJ.set(false);
                }
            }
        });
    }
}
