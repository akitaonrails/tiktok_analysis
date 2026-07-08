package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486810J7f {
    public static final List<Integer> LIZ(List<? extends Aweme> list) {
        LiveRoomStruct newLiveRoomDataExt;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (Aweme aweme : list) {
            if (aweme != null) {
                newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
            } else {
                newLiveRoomDataExt = null;
            }
            arrayList.add(Integer.valueOf(LIZIZ(newLiveRoomDataExt) ? 1 : 0));
        }
        return arrayList;
    }

    public static final boolean LIZIZ(LiveRoomStruct liveRoomStruct) {
        Pair pair;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        String streamData;
        JSONObject jSONObjectOptJSONObject;
        if (liveRoomStruct == null) {
            pair = new Pair(0, 0);
        } else {
            pair = new Pair(0, 0);
            StreamUrlStruct streamUrlStruct = liveRoomStruct.stream_url;
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
            return true;
        }
        if (liveRoomStruct != null && liveRoomStruct.isThirdParty) {
            return false;
        }
        return true;
    }
}
