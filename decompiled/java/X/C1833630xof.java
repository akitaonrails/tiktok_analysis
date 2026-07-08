package X;

import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayHighlightRecoverSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1833630xof extends C2217421BqW implements Function2<Boolean, JSONObject, Unit> {
    public C1833630xof(Object obj) {
        super(2, obj, LiveHighLightPageFragment.class, "updateReviveResult", "updateReviveResult(ZLorg/json/JSONObject;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, JSONObject jSONObject) {
        boolean zBooleanValue = bool.booleanValue();
        JSONObject jSONObject2 = jSONObject;
        LiveHighLightPageFragment liveHighLightPageFragment = (LiveHighLightPageFragment) this.receiver;
        liveHighLightPageFragment.getClass();
        if (LiveReplayHighlightRecoverSetting.INSTANCE.enable()) {
            if (zBooleanValue) {
                if (jSONObject2 != null) {
                    try {
                        C189200o6.m2constructorimpl(Boolean.valueOf(liveHighLightPageFragment.iS().IQ2(jSONObject2.optString("room_id"), jSONObject2.optString("fragment_id"), liveHighLightPageFragment.uS(), liveHighLightPageFragment.LLJL)));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            } else if (jSONObject2 != null) {
                LiveHighlightViewModel.EQ2(liveHighLightPageFragment.iS(), jSONObject2.optLong("fragment_id"), 3, false, null, null, 24);
            }
        }
        return Unit.LIZ;
    }
}
