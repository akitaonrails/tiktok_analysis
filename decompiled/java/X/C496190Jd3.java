package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;

/* JADX INFO: renamed from: X.0Jd3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.bean.LiveProfileDeferredV2", f = "LiveProfileDeferredV2.kt", l = {22, LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "await")
public final class C496190Jd3 extends AbstractC23140094w {
    public BaseResponse LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C496180Jd2 LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496190Jd3(C496180Jd2 c496180Jd2, InterfaceC1364105Vn<? super C496190Jd3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c496180Jd2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveProfileDeferredV2@c831.await$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(this);
        C1C7U.LIZIZ("LiveProfileDeferredV2@c831.await$1");
        return objLIZ;
    }
}
