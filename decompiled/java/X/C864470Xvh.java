package X;

import android.text.TextUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.recallmsg.RecallMsgUseCase$recallReceivedMessage$3", f = "RecallMsgUseCase.kt", l = {}, m = "invokeSuspend")
public final class C864470Xvh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0Y3S LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864470Xvh(C0Y3S c0y3s, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C864470Xvh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y3s;
        this.LLILLJJLI = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864470Xvh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecallMsgUseCase@ca4d.recallReceivedMessage$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C868780Y6i.LJ(this.LL.LIZ.LIZLLL(), "RecallMsgFeature", "clientContext..onUpdateConversation", 4);
        C868200Y4c c868200Y4c = this.LL.LIZ.LJIIZILJ().getDomain().LIZ;
        C869590Y9l c869590Y9l = this.LLILLJJLI;
        c868200Y4c.getClass();
        if (c869590Y9l != null && !TextUtils.isEmpty(c869590Y9l.getConversationId())) {
            c868200Y4c.LJIIZILJ(c869590Y9l.getConversationId(), new C868330Y4p(c869590Y9l));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.recallReceivedMessage$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
