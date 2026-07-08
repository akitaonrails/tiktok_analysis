package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0600, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelOpenHelper$open$2$1", f = "FeedbackPanelOpenHelper.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0600 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1389620mGW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0600(DialogC1389620mGW dialogC1389620mGW, InterfaceC1364105Vn<? super AnonymousClass0600> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1389620mGW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0600(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedbackPanelOpenHelper@f331.open$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FNV.LIZJ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.open$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
