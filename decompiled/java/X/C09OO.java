package X;

import android.net.Uri;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09OO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$addShortCutWithLottie$1$1$6", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
public final class C09OO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RedEnvelopeWidget LL;
    public final /* synthetic */ Uri LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09OO(RedEnvelopeWidget redEnvelopeWidget, Uri uri, InterfaceC1364105Vn<? super C09OO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = redEnvelopeWidget;
        this.LLILLJJLI = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1$1$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.x1(this.LLILLJJLI, null);
        this.LL.A1();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1$1$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
