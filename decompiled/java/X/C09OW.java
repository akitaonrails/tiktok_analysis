package X;

import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09OW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$addShortCutWithImage$1$1", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
public final class C09OW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RedEnvelopeWidget LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09OW(RedEnvelopeWidget redEnvelopeWidget, String str, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, InterfaceC1364105Vn<? super C09OW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = redEnvelopeWidget;
        this.LLILLJJLI = str;
        this.LLILLL = redEnvelopeInfoModel4FE;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OW(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addShortCutWithImage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLIZ.lock();
        RedEnvelopeWidget redEnvelopeWidget = this.LL;
        if (redEnvelopeWidget.LLILZIL) {
            Boolean.valueOf(redEnvelopeWidget.LLILZLL.add(new C09OY(this.LLILLJJLI, this.LLILZ, this.LLILLL.envelopList)));
        } else {
            if (redEnvelopeWidget.LLILLL) {
                i = 0;
            } else {
                i = -1;
            }
            String str = this.LLILLJJLI;
            List<RedEnvelopeMessage4FE> list = this.LLILLL.envelopList;
            Boolean boolValueOf = Boolean.valueOf(this.LLILZ);
            RedEnvelopeWidget redEnvelopeWidget2 = this.LL;
            C1104350eqP.LIZIZ(i, str, list, boolValueOf, redEnvelopeWidget2.LLILZ, redEnvelopeWidget2.LLILZIL);
        }
        this.LL.LLIZ.unlock();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithImage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
