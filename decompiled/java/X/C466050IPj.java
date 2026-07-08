package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity$submitKeywordMessage$2$1$1$1", f = "BaAutoReplyEditActivity.kt", l = {}, m = "invokeSuspend")
public final class C466050IPj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaAutoReplyEditActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C466050IPj(BaAutoReplyEditActivity baAutoReplyEditActivity, InterfaceC1364105Vn<? super C466050IPj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baAutoReplyEditActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C466050IPj(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaAutoReplyEditActivity@7146.submitKeywordMessage$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIIZ(2131849274);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.submitKeywordMessage$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
