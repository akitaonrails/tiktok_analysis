package X;

import Y.AfS176S0100000_7;
import android.os.Handler;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.survey.api.SurveyApi;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyShowMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.ttm.TTMCore;
import com.tiktok.ttm.TTMInput;
import com.tiktok.ttm.TTMOutput;
import com.tiktok.ttm.TTMParamData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyData;
import webcast.api.room.SurveyConfig;

/* JADX INFO: renamed from: X.0IK1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IK1 {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public Handler LIZ;
    public DataChannel LIZIZ;
    public Room LIZJ;
    public EnterRoomConfig LIZLLL;
    public C0IHW LJ;
    public LivePlayFragment LJFF;
    public View LJI;
    public C482930Iwl LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;
    public Integer LJIIJ;
    public SurveyData LJIIJJI;
    public final C11NJ LJIIL = new C11NJ();
    public final AwS586S0100000_7 LJIILIIL = new AwS586S0100000_7(this, 69);

    static {
        new C0IK2();
    }

    public final boolean LIZ() {
        C0IHW c0ihw;
        SurveyShowMode surveyShowMode;
        SurveyShowMode surveyShowMode2;
        List<String> list;
        SurveyShowMode surveyShowMode3;
        SurveyData surveyData = this.LJIIJJI;
        str = null;
        String str = null;
        if (surveyData != null && (surveyShowMode2 = surveyData.showMode) != null && (list = surveyShowMode2.filterNeedFeatureKeys) != null && (!list.isEmpty())) {
            SurveyData surveyData2 = this.LJIIJJI;
            if (surveyData2 != null && (surveyShowMode3 = surveyData2.showMode) != null) {
                str = surveyShowMode3.filterExpression;
            }
            return LIZIZ(str, false, list);
        }
        C20441214yg.LJIIIZ("LiveRoomSurveyManager", "filterByTTM");
        TTMCore tTMCore = TTMCore.getInstance();
        if (!tTMCore.isInit() || (c0ihw = this.LJ) == null) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("watch_time", Long.valueOf((System.currentTimeMillis() - c0ihw.LIZJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        map.put("has_send_live_goal", Boolean.valueOf(c0ihw.LJFF));
        map.put("live_goal_success", Boolean.valueOf(c0ihw.LJI));
        map.put("send_gift_count", Integer.valueOf(c0ihw.LJII));
        map.put("send_gift_amount", Integer.valueOf(c0ihw.LJIIIIZZ));
        map.put("total_comment_views", Integer.valueOf(c0ihw.LJIIIZ));
        map.put("send_gift_id_cnt_map", c0ihw.LJ);
        long[] jArrLLIIIILZ = C13LP.LLIIIILZ(c0ihw.LJ.keySet());
        int length = jArrLLIIIILZ.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArrLLIIIILZ[i]);
        }
        map.put("send_gift_ids", lArr);
        TTMInput tTMInput = new TTMInput();
        SurveyData surveyData3 = this.LJIIJJI;
        tTMInput.machineCode = (surveyData3 == null || (surveyShowMode = surveyData3.showMode) == null) ? null : surveyShowMode.filterExpression;
        tTMInput.paramType = TTMInput.ParamType.TYPE_MAP;
        tTMInput.paramData = new TTMParamData((Map<String, Object>) map);
        TTMOutput tTMOutputExecute = tTMCore.execute(tTMInput);
        Object data = tTMOutputExecute != null ? tTMOutputExecute.getData() : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("after filter by ttm, params = ");
        sbLIZ.append(map);
        sbLIZ.append(", result = ");
        sbLIZ.append(data);
        C20441214yg.LJIIIZ("LiveRoomSurveyManager", C2188811AlT.LIZIZ(sbLIZ));
        return Intrinsics.LJFF(data, Boolean.TRUE);
    }

    public final void LIZJ(String str, StrategyData strategyData) {
        long id;
        ShowMode showMode;
        SurveyConfig surveyConfig;
        List<String> list;
        EnterRoomConfig.RoomsData roomsData;
        String str2;
        EnterRoomConfig.RoomsData roomsData2;
        String str3;
        String string;
        User owner;
        HashMap map = new HashMap();
        Room room = this.LIZJ;
        long id2 = 0;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        map.put("room_id", Long.valueOf(id));
        map.put(Scene.SCENE_SERVICE, 1);
        Room room2 = this.LIZJ;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            id2 = owner.getId();
        }
        map.put("anchor_id", Long.valueOf(id2));
        String str4 = this.LJIIIZ;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        map.put("live_survey_rec_info", str4);
        Integer num = this.LJIIJ;
        if (num != null && num.intValue() >= 0 && (string = num.toString()) != null) {
            str5 = string;
        }
        map.put("cur_room_position", str5);
        map.put("available_survey_ids_str", str);
        EnterRoomConfig enterRoomConfig = this.LIZLLL;
        if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null && (str3 = roomsData2.debugSurveyLan) != null) {
            map.put("language", str3);
        }
        EnterRoomConfig enterRoomConfig2 = this.LIZLLL;
        if (enterRoomConfig2 != null && (roomsData = enterRoomConfig2.mRoomsData) != null && (str2 = roomsData.debugSurveyId) != null) {
            map.put("preview_survey_id_str", str2);
        }
        if (strategyData != null && (showMode = strategyData.showMode) != null && (surveyConfig = showMode.surveyConfig) != null && (list = surveyConfig.serverNeedFeatureKeys) != null && (!list.isEmpty())) {
            Map<String, Object> mapLJII = C483390IxV.LIZ.LJII(list, this.LJIILIIL);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJII.size()));
            for (Map.Entry entry : ((LinkedHashMap) mapLJII).entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            map.put("feature_map", linkedHashMap);
        }
        C11NJ c11nj = this.LJIIL;
        C480460Ism.LIZ().getClass();
        c11nj.LIZ(((SurveyApi) C480460Ism.LIZLLL(SurveyApi.class)).listV2(map).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(this, 39), new AfS176S0100000_7(this, 40)));
    }

    public final boolean LIZIZ(String str, boolean z, List list) {
        Object data;
        TTMCore tTMCore = TTMCore.getInstance();
        if (!tTMCore.isInit()) {
            return false;
        }
        Map<String, Object> mapLJII = C483390IxV.LIZ.LJII(list, this.LJIILIIL);
        TTMInput tTMInput = new TTMInput();
        tTMInput.machineCode = str;
        tTMInput.paramType = TTMInput.ParamType.TYPE_MAP;
        tTMInput.paramData = new TTMParamData(mapLJII);
        TTMOutput tTMOutputExecute = tTMCore.execute(tTMInput);
        if (tTMOutputExecute != null) {
            data = tTMOutputExecute.getData();
        } else {
            data = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("filterByTTMNew: filterNeedFeatureKeys=");
        sbLIZ.append(list);
        sbLIZ.append(" isPreCheck=");
        sbLIZ.append(z);
        sbLIZ.append(" params=");
        sbLIZ.append(mapLJII);
        sbLIZ.append(", result=");
        sbLIZ.append(data);
        C20441214yg.LIZIZ("LiveRoomSurveyManager", C2188811AlT.LIZIZ(sbLIZ));
        return Intrinsics.LJFF(data, Boolean.TRUE);
    }
}
