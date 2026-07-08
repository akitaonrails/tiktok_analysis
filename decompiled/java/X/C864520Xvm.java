package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.recallmsg.RecallMsgUseCase$markMessageAsRecalled$2", f = "RecallMsgUseCase.kt", l = {351}, m = "invokeSuspend")
public final class C864520Xvm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0Y3S LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864520Xvm(C0Y3S c0y3s, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C864520Xvm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0y3s;
        this.LLILLL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864520Xvm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        C1C7U.LIZ("RecallMsgUseCase@ca4d.markMessageAsRecalled$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C868780Y6i.LJ(this.LLILLJJLI.LIZ.LIZLLL(), "RecallMsgUseCase", "updateRefMsgListStatus", 4);
            C0YEM c0yem = this.LLILLJJLI.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ref_");
            sbLIZ.append(this.LLILLL.getMsgId());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0YUT c0yut = C0YUT.RECALLED;
            this.LL = 1;
            List listLIZ = C867650Y1z.LIZ(c0yem, strLIZIZ, c0yut);
            if (listLIZ == null || ((ArrayList) listLIZ).isEmpty() || (objLIZIZ = C2296908zH.LIZIZ(new C05OK(c0yem, listLIZ, null), this)) != C099R.LJFF()) {
                objLIZIZ = Unit.LIZ;
            }
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("RecallMsgUseCase@ca4d.markMessageAsRecalled$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.markMessageAsRecalled$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
