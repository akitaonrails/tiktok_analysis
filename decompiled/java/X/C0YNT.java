package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YNT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notify.ImportantMsgKvOperator$deleteImportantTypeForConv$1", f = "ImportantMsgKvOperator.kt", l = {}, m = "invokeSuspend")
public final class C0YNT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YNT(String str, InterfaceC1364105Vn<? super C0YNT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YNT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("ImportantMsgKvOperator@a019.deleteImportantTypeForConv$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0YNQ c0ynq = InterfaceC1755906uD.LIZ;
            String str = this.LL;
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            c0ynq.getClass();
            ((C0YNW) C0YUC.LIZ(c0ym2)).LIZ.LJIIJ().LJJZZI(str);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ImportantMsgKvOperator@a019.deleteImportantTypeForConv$1");
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
