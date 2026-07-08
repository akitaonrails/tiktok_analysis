package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ml.utils.PitayaResourceHelper;

/* JADX INFO: renamed from: X.0pV8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ml.utils.PitayaResourceHelper", f = "PitayaResourceHelper.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT, 26, 29}, m = "observableEnvReady")
public final class C1514000pV8 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PitayaResourceHelper LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1514000pV8(PitayaResourceHelper pitayaResourceHelper, InterfaceC1364105Vn<? super C1514000pV8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = pitayaResourceHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PitayaResourceHelper@631d.observableEnvReady$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, false, this);
        C1C7U.LIZIZ("PitayaResourceHelper@631d.observableEnvReady$1");
        return objLIZIZ;
    }
}
