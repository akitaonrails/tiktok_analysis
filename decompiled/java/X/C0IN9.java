package X;

import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePersistGameManualDefinitionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.PersistGameManualDefinitionTypeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TtliveSwapMultiStreamDataSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IN9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IN9 {
    public static final boolean LIZ() {
        return ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable() && EnablePersistGameManualDefinitionSetting.INSTANCE.enable();
    }

    public static final String LIZIZ() {
        LinkedList<LiveCoreSDKData.Quality> linkedList;
        StreamUrl streamUrl;
        LinkedList<LiveCoreSDKData.Quality> linkedList2;
        LinkedList<LiveCoreSDKData.Quality> linkedList3;
        LinkedList<LiveCoreSDKData.Quality> linkedList4;
        LinkedList<LiveCoreSDKData.Quality> linkedList5;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        boolean z = room != null && room.multiStreamScene == 1 && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup();
        boolean z2 = room != null && room.isMainStreamHorizontal();
        ArrayList<LiveCoreSDKData.Quality> arrayList = null;
        if (!z) {
            C0INV c0inv = C0IL2.LIZ;
            String str = c0inv.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
            if (str == null) {
                str = "";
            }
            InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
            if (interfaceC480510IsrLIZIZ != null && interfaceC480510IsrLIZIZ.isWidevineDrmStream() && C500260Jjc.LJJIJIIJI(interfaceC480510IsrLIZIZ.LJIJJLI())) {
                String str2 = c0inv.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
                InterfaceC480510Isr interfaceC480510IsrLIZIZ2 = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str2 != null ? str2 : "");
                List<String> listLJIJJLI = interfaceC480510IsrLIZIZ2 != null ? interfaceC480510IsrLIZIZ2.LJIJJLI() : null;
                if (room != null && (streamUrl = room.getStreamUrl()) != null && (linkedList2 = streamUrl.qualityList) != null) {
                    arrayList = new ArrayList();
                    for (LiveCoreSDKData.Quality quality : linkedList2) {
                        LiveCoreSDKData.Quality quality2 = quality;
                        if (LJ(quality2) && listLJIJJLI != null && listLJIJJLI.contains(quality2.sdkKey)) {
                            arrayList.add(quality);
                        }
                    }
                }
            } else if (room != null) {
                StreamUrl streamUrl2 = room.getStreamUrl();
                if (streamUrl2 != null && (linkedList = streamUrl2.qualityList) != null) {
                    arrayList = new ArrayList();
                    for (LiveCoreSDKData.Quality quality3 : linkedList) {
                        if (LJ(quality3)) {
                            arrayList.add(quality3);
                        }
                    }
                }
                StreamUrl streamUrl3 = room.getStreamUrl();
                if (streamUrl3 != null) {
                    streamUrl3.LJI(arrayList);
                }
            }
        } else if (TtliveSwapMultiStreamDataSetting.INSTANCE.getValue()) {
            if (z2) {
                if (room != null) {
                    StreamUrl streamUrl4 = room.multiStreamUrl;
                    if (streamUrl4 != null && (linkedList5 = streamUrl4.qualityList) != null) {
                        arrayList = new ArrayList();
                        for (LiveCoreSDKData.Quality quality4 : linkedList5) {
                            if (LJ(quality4)) {
                                arrayList.add(quality4);
                            }
                        }
                    }
                    StreamUrl streamUrl5 = room.multiStreamUrl;
                    if (streamUrl5 != null) {
                        streamUrl5.LJI(arrayList);
                    }
                }
            } else if (room != null) {
                StreamUrl streamUrl6 = room.getStreamUrl();
                if (streamUrl6 != null && (linkedList4 = streamUrl6.qualityList) != null) {
                    arrayList = new ArrayList();
                    for (LiveCoreSDKData.Quality quality5 : linkedList4) {
                        if (LJ(quality5)) {
                            arrayList.add(quality5);
                        }
                    }
                }
                StreamUrl streamUrl7 = room.getStreamUrl();
                if (streamUrl7 != null) {
                    streamUrl7.LJI(arrayList);
                }
            }
        } else if (room != null) {
            StreamUrl streamUrl8 = room.multiStreamUrl;
            if (streamUrl8 != null && (linkedList3 = streamUrl8.qualityList) != null) {
                arrayList = new ArrayList();
                for (LiveCoreSDKData.Quality quality6 : linkedList3) {
                    if (LJ(quality6)) {
                        arrayList.add(quality6);
                    }
                }
            }
            StreamUrl streamUrl9 = room.multiStreamUrl;
            if (streamUrl9 != null) {
                streamUrl9.LJI(arrayList);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (arrayList != null) {
            for (LiveCoreSDKData.Quality quality7 : arrayList) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(quality7.sdkKey);
            }
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        return sb.toString();
    }

    public static final Map<String, String> LIZJ() {
        PersistGameManualDefinitionTypeSetting persistGameManualDefinitionTypeSetting = PersistGameManualDefinitionTypeSetting.INSTANCE;
        if (persistGameManualDefinitionTypeSetting.isDiskCache()) {
            return InterfaceC465660INw.Yc.LIZIZ();
        }
        if (persistGameManualDefinitionTypeSetting.isMemoryCache()) {
            return C0IN8.LIZ;
        }
        return null;
    }

    public static final Pair<Integer, Integer> LIZLLL(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        String strOptString;
        try {
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("catch exception, e=");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("GameLiveAudienceExt", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (jSONObject == null) {
            C20441214yg.LJ("GameLiveAudienceExt", "streamData is null when get video resolution");
            return null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("origin")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("main")) != null && (strOptString = jSONObjectOptJSONObject2.optString("sdk_params")) != null) {
            String strOptString2 = new JSONObject(strOptString).optString("resolution");
            if (!TextUtils.isEmpty(strOptString2)) {
                int iLJJIZ = a0.LJJIZ(strOptString2, 'x', 0, false, 6);
                if (iLJJIZ > 0 && iLJJIZ < strOptString2.length() - 1) {
                    return new Pair<>(Integer.valueOf(CastIntegerProtector.parseInt(strOptString2.substring(0, iLJJIZ))), Integer.valueOf(CastIntegerProtector.parseInt(strOptString2.substring(iLJJIZ + 1))));
                }
                C20441214yg.LJ("FullLinkExt", "return null. index not right.");
                return null;
            }
        }
        C20441214yg.LJ("GameLiveAudienceExt", "return null.");
        return null;
    }

    public static final boolean LJ(LiveCoreSDKData.Quality quality) {
        String str = quality.sdkKey;
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        return true;
    }

    public static final C0INA LJFF(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        C0INA c0ina = new C0INA();
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<String> itKeys = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "data").keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (Intrinsics.LJFF(next, "ld")) {
                    arrayList.add("ld");
                } else if (Intrinsics.LJFF(next, "sd")) {
                    arrayList.add("sd");
                } else if (Intrinsics.LJFF(next, "hd")) {
                    arrayList.add("hd");
                } else if (Intrinsics.LJFF(next, "hd_60")) {
                    arrayList.add("hd_60");
                } else if (Intrinsics.LJFF(next, "uhd")) {
                    arrayList.add("uhd");
                } else if (Intrinsics.LJFF(next, "uhd_60")) {
                    arrayList.add("uhd_60");
                } else {
                    String str2 = C0IMN.LIZ;
                    String str3 = C0IMN.LIZ;
                    if (Intrinsics.LJFF(next, str3)) {
                        arrayList.add(str3);
                    } else {
                        String str4 = C0IMN.LIZIZ;
                        if (Intrinsics.LJFF(next, str4)) {
                            arrayList.add(str4);
                        } else if (Intrinsics.LJFF(next, "origin")) {
                            arrayList.add("origin");
                        }
                    }
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("GameLiveAudienceExt", e.getMessage());
        }
        try {
            if (!LivePreviewPerfOptSetting.enablePullStreamDataJsonParseOpt()) {
                jSONObject2 = new JSONObject(str);
            }
            JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "common"), "auto");
            arrayList.add("auto");
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJ("GameLiveAudienceExt", e2.getMessage());
        }
        c0ina.LIZ = arrayList;
        arrayList.contains("auto");
        return c0ina;
    }
}
