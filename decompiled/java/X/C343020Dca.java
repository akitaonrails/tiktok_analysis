package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.im.chatroom.input.components.replyarea.IMReplyLayoutInputAssem2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.replyarea.IMReplyLayoutInputAssem2$onViewCreated$3", f = "IMReplyLayoutInputAssem2.kt", l = {148}, m = "invokeSuspend")
public final class C343020Dca extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMReplyLayoutInputAssem2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C343020Dca(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, InterfaceC1364105Vn<? super C343020Dca> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMReplyLayoutInputAssem2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C343020Dca(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMReplyLayoutInputAssem2@6d58.onViewCreated$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2 = this.LLILLJJLI;
            iMReplyLayoutInputAssem2.getClass();
            C05YD c05ydLIZIZ = C459000HzG.LIZIZ(iMReplyLayoutInputAssem2);
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 40);
            this.LL = 1;
            if (c05ydLIZIZ.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("IMReplyLayoutInputAssem2@6d58.onViewCreated$3");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
