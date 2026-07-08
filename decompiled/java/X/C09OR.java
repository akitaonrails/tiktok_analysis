package X;

import android.net.Uri;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09OR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$addShortCutWithLottie$1$1$5", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
public final class C09OR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RedEnvelopeWidget LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Uri LLILZLL;
    public final /* synthetic */ C1295960jpS LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09OR(RedEnvelopeWidget redEnvelopeWidget, C013C c013c, String str, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, Uri uri, C1295960jpS c1295960jpS, InterfaceC1364105Vn<? super C09OR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = redEnvelopeWidget;
        this.LLILLJJLI = c013c;
        this.LLILLL = str;
        this.LLILZ = redEnvelopeInfoModel4FE;
        this.LLILZIL = z;
        this.LLILZLL = uri;
        this.LLIZ = c1295960jpS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.context == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1$1$5");
            return unit;
        }
        if (this.LLILLJJLI.element) {
            i = 0;
        } else {
            i = -1;
        }
        C1104350eqP.LIZIZ(i, this.LLILLL, this.LLILZ.envelopList, Boolean.valueOf(this.LLILZIL), null, this.LL.LLILZIL);
        this.LL.x1(this.LLILZLL, this.LLIZ);
        this.LL.A1();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1$1$5");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
