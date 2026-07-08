package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05KK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager$notifyChangeShowEngagementCount$1", f = "FamilyPairingManager.kt", l = {364, 265}, m = "invokeSuspend")
public final class C05KK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05KK(boolean z, InterfaceC1364105Vn<? super C05KK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05KK(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC383701eN interfaceC383701eN;
        boolean z;
        C1C7U.LIZ("FamilyPairingManager@6b46.notifyChangeShowEngagementCount$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        boolean z2 = true;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            interfaceC383701eN = this.LL;
                            C155000ia.LIZIZ(obj);
                            interfaceC383701eN.LIZIZ(null);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("FamilyPairingManager@6b46.notifyChangeShowEngagementCount$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.LLILLJJLI;
                    interfaceC383701eN = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    interfaceC383701eN = FamilyPairingManager.LIZLLL;
                    z = this.LLILZ;
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = z;
                    this.LLILLL = 1;
                    if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("FamilyPairingManager@6b46.notifyChangeShowEngagementCount$1");
                        return objLJFF;
                    }
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                if (!z) {
                    z2 = false;
                }
                C05KL c05kl = new C05KL(z2, null);
                this.LL = interfaceC383701eN;
                this.LLILLL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq, c05kl) == objLJFF) {
                    C1C7U.LIZIZ("FamilyPairingManager@6b46.notifyChangeShowEngagementCount$1");
                    return objLJFF;
                }
                interfaceC383701eN.LIZIZ(null);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("FamilyPairingManager@6b46.notifyChangeShowEngagementCount$1");
                return unit2;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                interfaceC383701eN.LIZIZ(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
