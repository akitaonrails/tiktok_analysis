package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0618, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.extension.Fake2RealMsgExtKt$reportIfFirstReceivedRealMessage$2", f = "Fake2RealMsgExt.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0618 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC870590YDh LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ Function1<C869590Y9l, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass0618(InterfaceC870590YDh interfaceC870590YDh, C869590Y9l c869590Y9l, Function1<? super C869590Y9l, Unit> function1, InterfaceC1364105Vn<? super AnonymousClass0618> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC870590YDh;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0618(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Fake2RealMsgExtKt@862f.reportIfFirstReceivedRealMessage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Intrinsics.LJFF(this.LL.LJFF(this.LLILLJJLI.getUuid(), "has_received"), "1")) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("Fake2RealMsgExtKt@862f.reportIfFirstReceivedRealMessage$2");
            return unit;
        }
        this.LLILLL.invoke(this.LLILLJJLI);
        this.LL.LLII(this.LLILLJJLI.getUuid(), this.LLILLJJLI.getConversationId(), "has_received", "1");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("Fake2RealMsgExtKt@862f.reportIfFirstReceivedRealMessage$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
