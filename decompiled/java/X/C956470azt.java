package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageDurationListSetting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0azt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956470azt {
    public static int LIZ;

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss frontend panel. reason=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("TTSCustomSettingsPanelManager", C2188811AlT.LIZIZ(sbLIZ));
        C389001fE.LIZ("live_take_the_stage_custom_settings_page_dismiss", new JSONObject(), System.currentTimeMillis(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(Context context, InterfaceC950030apV interfaceC950030apV, InterfaceC952240at4 interfaceC952240at4, IInteractService iInteractService) {
        Object obj;
        String str;
        ImageModel imageModel;
        List urls;
        Object objLJJJLZIJ;
        if (context == null) {
            C20441214yg.LJ("TTSCustomSettingsPanelManager", "context is null. Cannot launch TakeStage custom settings panel");
            return;
        }
        LIZ = interfaceC950030apV.LLILZLL(true).size();
        JSONArray jSONArray = new JSONArray();
        Iterator<Long> it2 = LiveCoHostTakeTheStageDurationListSetting.INSTANCE.getValue().iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().longValue());
        }
        JSONArray jSONArray2 = new JSONArray();
        List<C954460awe> listLJIJJ = interfaceC950030apV.LJIJJ();
        Iterator<C954460awe> it3 = listLJIJJ.iterator();
        while (true) {
            obj = "";
            if (!it3.hasNext()) {
                break;
            }
            C954460awe next = it3.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", String.valueOf(next.LJ));
            C754570Tip c754570Tip = next.LJIJJ;
            if (c754570Tip == null || (str = c754570Tip.LIZIZ) == null) {
                str = "";
            }
            jSONObject.put("name", str);
            C754570Tip c754570Tip2 = next.LJIJJ;
            if (c754570Tip2 != null && (imageModel = c754570Tip2.LIZJ) != null && (urls = imageModel.getUrls()) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urls)) != null) {
                obj = objLJJJLZIJ;
            }
            jSONObject.put("avatar", obj);
            jSONArray2.put(jSONObject);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C955410ayB.LIZLLL(linkedHashMap, interfaceC952240at4.LIZ().LJIILLIIL(), true);
        String str2 = (String) linkedHashMap.get("invitee_list");
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("durationList=");
        sbLIZ.append(jSONArray);
        sbLIZ.append(", performerList=");
        sbLIZ.append(jSONArray2);
        sbLIZ.append(", inviteeList=");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("TTSCustomSettingsPanelManager", C2188811AlT.LIZIZ(sbLIZ));
        String label = interfaceC952240at4.LIZ().LJIIZILJ().getLabel();
        String str3 = obj;
        if (!Intrinsics.LJFF("idle", label)) {
            str3 = label;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("conflictAnchorType=");
        sbLIZ2.append(label);
        sbLIZ2.append(", anchorType=");
        sbLIZ2.append(str3);
        C20441214yg.LIZIZ("TTSCustomSettingsPanelManager", C2188811AlT.LIZIZ(sbLIZ2));
        HashMap map = new HashMap();
        map.put("performer_list", jSONArray2.toString());
        map.put("duration_list", jSONArray.toString());
        map.put("invitee_list", str2);
        map.put("channel_id", String.valueOf(iInteractService.getChannelId()));
        map.put("uid_list", C13LP.LJJLIIIJ(listLJIJJ, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(218), 30));
        map.put("anchor_type", str3);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Try to launch custom setting panel. params = ");
        sbLIZ3.append(map);
        sbLIZ3.append(", linkedUserCountWhenOpen=");
        sbLIZ3.append(LIZ);
        C20441214yg.LIZIZ("TTSCustomSettingsPanelManager", C2188811AlT.LIZIZ(sbLIZ3));
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService == null) {
            C20441214yg.LJ("LynxPageRouter", "HybridContainerService is null. Cannot launch lynx page");
            return;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ("aweme://roma_redirect/?spark_page=tts_start_customization");
        c760370TsBLIZ.LJJII(map);
        iHybridContainerService.YC1(context, c760370TsBLIZ.LIZ().toString(), null);
    }
}
