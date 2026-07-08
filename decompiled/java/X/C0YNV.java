package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YNV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notify.ImportantMsgKvOperator$deleteImportantTypeForMsg$1", f = "ImportantMsgKvOperator.kt", l = {}, m = "invokeSuspend")
public final class C0YNV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YNV(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C0YNV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YNV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("ImportantMsgKvOperator@a019.deleteImportantTypeForMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0YNQ c0ynq = InterfaceC1755906uD.LIZ;
            String uuid = this.LL.getUuid();
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            c0ynq.getClass();
            ((C0YNW) C0YUC.LIZ(c0ym2)).LIZ.LJIIJ().LLJJIJI(uuid, "a:group_important_type");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ImportantMsgKvOperator@a019.deleteImportantTypeForMsg$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
