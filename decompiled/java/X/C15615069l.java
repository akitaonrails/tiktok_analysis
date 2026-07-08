package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler$handleQuotedGifClick$1$gifMsg$2", f = "DefaultQuotedMessageClickHandler.kt", l = {}, m = "invokeSuspend")
public final class C15615069l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C869590Y9l>, Object> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15615069l(long j, InterfaceC1364105Vn<? super C15615069l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15615069l(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultQuotedMessageClickHandler@b1e6.handleQuotedGifClick$1$gifMsg$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(this.LL);
        C1C7U.LIZIZ("DefaultQuotedMessageClickHandler@b1e6.handleQuotedGifClick$1$gifMsg$2");
        return c869590Y9lLJJJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C869590Y9l> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
