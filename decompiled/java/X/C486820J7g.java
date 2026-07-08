package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import java.util.Objects;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486820J7g {
    public static final boolean LIZ(Aweme aweme) {
        Pair pair;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        String streamData;
        JSONObject jSONObjectOptJSONObject;
        if (aweme == null) {
            return false;
        }
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        if (newLiveRoomDataExt == null) {
            pair = new Pair(0, 0);
        } else {
            pair = new Pair(0, 0);
            StreamUrlStruct streamUrlStruct = newLiveRoomDataExt.stream_url;
            if (streamUrlStruct != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null && (streamData = pullData.getStreamData()) != null) {
                try {
                    JSONObject jSONObjectOptJSONObject2 = new JSONObject(streamData).optJSONObject("data");
                    if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("origin")) != null) {
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("main");
                        Objects.requireNonNull(jSONObjectOptJSONObject3);
                        String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(new JSONObject(jSONObjectOptJSONObject3.optString("sdk_params")).optString("resolution"), new String[]{"x"}, 0, 6).toArray(new String[0]);
                        pair = new Pair(Integer.valueOf(CastIntegerProtector.parseInt(strArr[0])), Integer.valueOf(CastIntegerProtector.parseInt(strArr[1])));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (((Number) pair.getFirst()).intValue() != 0 && ((Number) pair.getSecond()).intValue() != 0) {
            if (((Number) pair.getFirst()).intValue() >= ((Number) pair.getSecond()).intValue()) {
                return false;
            }
        } else if (newLiveRoomDataExt != null && newLiveRoomDataExt.isThirdParty) {
            return false;
        }
        return true;
    }
}
