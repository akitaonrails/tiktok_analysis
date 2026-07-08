package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06v9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.data.rx.MessageModelObservable$Listener$onSendMessage$1", f = "MessageModelObservable.kt", l = {}, m = "invokeSuspend")
public final class C1761706v9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1761706v9(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C1761706v9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1761706v9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1762406vG c1762406vG;
        C1C7U.LIZ("MessageModelObservable$Listener@e708.onSendMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String uuid = this.LL.getUuid();
        if (!Intrinsics.LJFF(C1762406vG.LJ, Boolean.TRUE)) {
            c1762406vG = null;
        } else {
            c1762406vG = C1762406vG.LIZLLL.get(uuid);
        }
        if (c1762406vG != null) {
            c1762406vG.LIZ(C1761806vA.LIZ(new Pair("stage", "message_model_observable"), new Pair("step", "on_send_message"), new Pair("result", String.valueOf(this.LL.getMsgStatus())), new Pair("time", c1762406vG.LIZJ())));
        }
        if (this.LL.getMsgStatus() == 2 || this.LL.getMsgStatus() == 3) {
            C1762406vG.LIZLLL.remove(this.LL.getUuid());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageModelObservable$Listener@e708.onSendMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
