package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05KO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager$unregisterShowEngagementCountListener$1", f = "FamilyPairingManager.kt", l = {364}, m = "invokeSuspend")
public final class C05KO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C05KM LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C05KM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05KO(C05KM c05km, InterfaceC1364105Vn<? super C05KO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c05km;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05KO(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEV c1dev;
        C05KM c05km;
        C1C7U.LIZ("FamilyPairingManager@6b46.unregisterShowEngagementCountListener$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c05km = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1dev = FamilyPairingManager.LIZLLL;
            c05km = this.LLILZ;
            this.LL = c1dev;
            this.LLILLJJLI = c05km;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("FamilyPairingManager@6b46.unregisterShowEngagementCountListener$1");
                return objLJFF;
            }
        }
        try {
            FamilyPairingManager.LIZJ.remove(c05km);
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FamilyPairingManager@6b46.unregisterShowEngagementCountListener$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
