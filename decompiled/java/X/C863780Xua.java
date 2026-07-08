package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$receiveWsFailureAck$1", f = "DefaultIMUseCaseCenter.kt", l = {}, m = "invokeSuspend")
public final class C863780Xua extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C863650XuN LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863780Xua(C863650XuN c863650XuN, long j, InterfaceC1364105Vn<? super C863780Xua> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c863650XuN;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863780Xua(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.receiveWsFailureAck$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C868780Y6i c868780Y6iLIZLLL = this.LL.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiveWs failure response seqId is ");
        sbLIZ.append(this.LLILLJJLI);
        C868780Y6i.LJ(c868780Y6iLIZLLL, "IMUseCaseCenter", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (!this.LL.LLILLJJLI.LJIIZILJ(this.LLILLJJLI)) {
            C870860YEi c870860YEi = this.LL.LLILLL;
            Long lLJFF = C2286608xc.LJFF(this.LLILLJJLI);
            Iterator<InterfaceC864610Xvv> it2 = c870860YEi.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ().LIZIZ(lLJFF);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.receiveWsFailureAck$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
