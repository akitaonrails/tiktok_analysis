package X;

import com.bytedance.im.core.proto.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$receiveWs$1$2", f = "DefaultIMUseCaseCenter.kt", l = {}, m = "invokeSuspend")
public final class C864320XvS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C863650XuN LL;
    public final /* synthetic */ Response LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864320XvS(C863650XuN c863650XuN, Response response, InterfaceC1364105Vn<? super C864320XvS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c863650XuN;
        this.LLILLJJLI = response;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864320XvS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.receiveWs$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0YC7 c0yc7LIZJ = this.LL.LL.LJIIZILJ().LIZ().LIZJ();
        C0Y82 c0y82 = C0Y82.UNKNOWN;
        EnumC868520Y5i enumC868520Y5i = EnumC868520Y5i.RESPONSE_CMD_TYPE_INVALID;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cmd is ");
        sbLIZ.append(this.LLILLJJLI.cmd);
        c0yc7LIZJ.LIZ(c0y82, new C0Y72(enumC868520Y5i, C2188811AlT.LIZIZ(sbLIZ)), this.LLILLJJLI, -1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.receiveWs$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
