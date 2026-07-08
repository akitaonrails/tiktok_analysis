package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;

/* JADX INFO: renamed from: X.0pZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.proto.hybrid.adapt.PbMapDecoderFactory", f = "PbMapDecoderFactory.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "createDecoder")
public final class C1516920pZq<T> extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1516930pZr LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516920pZq(C1516930pZr c1516930pZr, InterfaceC1364105Vn<? super C1516920pZq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1516930pZr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PbMapDecoderFactory@6625.createDecoder$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("PbMapDecoderFactory@6625.createDecoder$1");
        return objLIZIZ;
    }
}
