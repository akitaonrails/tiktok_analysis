package X;

import Y.AgS193S0200000_2;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.chatroom.input.components.sendbtn.SendButtonAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.sendbtn.SendButtonAssemV2$onActualViewCreated$3$1", f = "SendButtonAssemV2.kt", l = {64}, m = "invokeSuspend")
public final class C1626306Yj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SendButtonAssemV2 LLILLJJLI;
    public final /* synthetic */ TuxIconView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626306Yj(SendButtonAssemV2 sendButtonAssemV2, TuxIconView tuxIconView, InterfaceC1364105Vn<? super C1626306Yj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sendButtonAssemV2;
        this.LLILLL = tuxIconView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626306Yj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendButtonAssemV2@d103.onActualViewCreated$3$1");
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
            SendButtonAssemV2 sendButtonAssemV2 = this.LLILLJJLI;
            sendButtonAssemV2.getClass();
            C1768806wI c1768806wI = new C1768806wI(C459000HzG.LIZIZ(sendButtonAssemV2), 20);
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILLJJLI, this.LLILLL, 27);
            this.LL = 1;
            if (c1768806wI.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("SendButtonAssemV2@d103.onActualViewCreated$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendButtonAssemV2@d103.onActualViewCreated$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
