package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.psp.db.SocialInteractionDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.psp.utils.PersistenceUtils$deleteExpiredItems$appStateListener$1$onStateChange$1", f = "PersistenceUtils.kt", l = {}, m = "invokeSuspend")
public final class C1313105Bx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1313105Bx(long j, InterfaceC1364105Vn<? super C1313105Bx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1313105Bx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PersistenceUtils@588e.deleteExpiredItems$appStateListener$1$onStateChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            SocialInteractionDatabase.LL.getValue().LIZ();
            throw null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteExpiredItems failed: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PersistenceUtils@588e.deleteExpiredItems$appStateListener$1$onStateChange$1");
            return unit;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
