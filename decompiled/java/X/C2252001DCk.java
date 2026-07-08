package X;

import com.ss.android.ugc.aweme.portrait.ab.PortraitMockSetting;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252001DCk {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ() {
        Number numericFeature$default;
        C01GW c01gw = PortraitMockSetting.LIZIZ;
        if (((PortraitMockSetting.Meta) c01gw.getValue()).isMockOpen && ((PortraitMockSetting.Meta) c01gw.getValue()).inboxFeatureActivityPreferenceNoticeScoreKey != Float.MIN_VALUE) {
            return ((PortraitMockSetting.Meta) c01gw.getValue()).inboxFeatureActivityPreferenceNoticeScoreKey;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_phone", 0, 2, null);
        if (producer$default == null || (numericFeature$default = FeatureProducer.getNumericFeature$default(producer$default, "activity_notice_percentile", (JSONObject) null, "notice_strategy", (ReturnCode) null, 10, (Object) null)) == null) {
            return 0.0f;
        }
        return numericFeature$default.floatValue();
    }

    public static float LIZIZ() {
        Number numericFeature$default;
        C01GW c01gw = PortraitMockSetting.LIZIZ;
        if (((PortraitMockSetting.Meta) c01gw.getValue()).isMockOpen && ((PortraitMockSetting.Meta) c01gw.getValue()).inboxFeatureActivityPreferenceURCardScoreKey != Float.MIN_VALUE) {
            return ((PortraitMockSetting.Meta) c01gw.getValue()).inboxFeatureActivityPreferenceURCardScoreKey;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_phone", 0, 2, null);
        if (producer$default == null || (numericFeature$default = FeatureProducer.getNumericFeature$default(producer$default, "activity_recommend_percentile", (JSONObject) null, "notice_strategy", (ReturnCode) null, 10, (Object) null)) == null) {
            return 0.0f;
        }
        return numericFeature$default.floatValue();
    }
}
