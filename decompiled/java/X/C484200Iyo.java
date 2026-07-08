package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity$submitWelcomeMessage$1$1$1$1", f = "BaWelcomeMessageEditActivity.kt", l = {}, m = "invokeSuspend")
public final class C484200Iyo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaWelcomeMessageEditActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C484200Iyo(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, InterfaceC1364105Vn<? super C484200Iyo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baWelcomeMessageEditActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C484200Iyo(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaWelcomeMessageEditActivity@83d7.submitWelcomeMessage$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLLLZI().setEnabled(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaWelcomeMessageEditActivity@83d7.submitWelcomeMessage$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
