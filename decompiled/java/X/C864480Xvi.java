package X;

import android.text.TextUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.recallmsg.RecallMsgUseCase$recallSentMessage$3", f = "RecallMsgUseCase.kt", l = {}, m = "invokeSuspend")
public final class C864480Xvi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0Y3S LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ InterfaceC863600XuI<C869590Y9l> LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864480Xvi(C0Y3S c0y3s, C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI, C869590Y9l c869590Y9l2, InterfaceC1364105Vn<? super C864480Xvi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y3s;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = interfaceC863600XuI;
        this.LLILZ = c869590Y9l2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864480Xvi(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("RecallMsgUseCase@ca4d.recallSentMessage$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C868200Y4c c868200Y4c = this.LL.LIZ.LJIIZILJ().getDomain().LIZ;
        C869590Y9l c869590Y9l = this.LLILLJJLI;
        c868200Y4c.getClass();
        if (c869590Y9l != null && !TextUtils.isEmpty(c869590Y9l.getConversationId())) {
            c868200Y4c.LJIIZILJ(c869590Y9l.getConversationId(), new C868330Y4p(c869590Y9l));
        }
        InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI = this.LLILLL;
        if (interfaceC863600XuI != null) {
            interfaceC863600XuI.onSuccess(this.LLILZ);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.recallSentMessage$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
