package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05KL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager$notifyChangeShowEngagementCount$1$1$1", f = "FamilyPairingManager.kt", l = {}, m = "invokeSuspend")
public final class C05KL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05KL(boolean z, InterfaceC1364105Vn<? super C05KL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05KL c05kl = new C05KL(this.LLILLJJLI, interfaceC1364105Vn);
        c05kl.LL = obj;
        return c05kl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("FamilyPairingManager@6b46.notifyChangeShowEngagementCount$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (C05KM c05km : FamilyPairingManager.LIZJ) {
            if (this.LLILLJJLI) {
                z = true;
            } else {
                z = false;
            }
            try {
                c05km.LIZ(z);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FamilyPairingManager@6b46.notifyChangeShowEngagementCount$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
