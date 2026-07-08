package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.NewGreenScreenEffectModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0mcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403460mcq {
    public static final C1403460mcq LIZ = new C1403460mcq();

    public static List LIZ(VideoPublishEditModel videoPublishEditModel) {
        NewGreenScreenEffectModel newGreenScreenEffectModel;
        List listSingletonList;
        if (C1428470nHB.LJZL(videoPublishEditModel)) {
            CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
            if (canvasVideoData == null || (newGreenScreenEffectModel = canvasVideoData.newGreenScreenEffectModel) == null || (listSingletonList = Collections.singletonList(newGreenScreenEffectModel)) == null) {
                return C13BV.INSTANCE;
            }
            return listSingletonList;
        }
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(finalVideoList, 10));
        Iterator<TimeSpeedModelExtension> it2 = finalVideoList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().newGreenScreenEffectModel);
        }
        return arrayList;
    }

    public static C0LAB LIZLLL(ShortVideoContext shortVideoContext) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        return c0lab;
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, C1403560md0 c1403560md0) {
        String type;
        if (!C296510Bjl.LIZ()) {
            return;
        }
        List<NewGreenScreenEffectModel> listLIZ = LIZ(videoPublishEditModel);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLIZ) {
            if (((NewGreenScreenEffectModel) obj).getOpenGreenScreenMode()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((NewGreenScreenEffectModel) obj2).getOpenPortraitMode()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        for (NewGreenScreenEffectModel newGreenScreenEffectModel : listLIZ) {
            if (newGreenScreenEffectModel.getOpenGreenScreenMode()) {
                type = newGreenScreenEffectModel.getGreenScreenMaterialType().getType();
            } else {
                type = "";
            }
            arrayList3.add(type);
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
        c1403560md0.LIZ(arrayList.size(), "green_screen_segment_cnt");
        c1403560md0.LIZ(arrayList2.size(), "portrait_capture_segment_cnt");
        c1403560md0.LJ("green_screen_material_type", strLJJLIIIJ);
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, Map map) {
        String type;
        if (!C296510Bjl.LIZ()) {
            return;
        }
        List<NewGreenScreenEffectModel> listLIZ = LIZ(videoPublishEditModel);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLIZ) {
            if (((NewGreenScreenEffectModel) obj).getOpenGreenScreenMode()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((NewGreenScreenEffectModel) obj2).getOpenPortraitMode()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        for (NewGreenScreenEffectModel newGreenScreenEffectModel : listLIZ) {
            if (newGreenScreenEffectModel.getOpenGreenScreenMode()) {
                type = newGreenScreenEffectModel.getGreenScreenMaterialType().getType();
            } else {
                type = "";
            }
            arrayList3.add(type);
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
        map.put("green_screen_segment_cnt", String.valueOf(arrayList.size()));
        map.put("portrait_capture_segment_cnt", String.valueOf(arrayList2.size()));
        map.put("green_screen_material_type", strLJJLIIIJ);
    }

    public static void LJI(C0LAB c0lab, NewGreenScreenEffectModel newGreenScreenEffectModel) {
        String type;
        String str;
        if (!C296510Bjl.LIZ()) {
            return;
        }
        if (newGreenScreenEffectModel.getOpenGreenScreenMode()) {
            type = newGreenScreenEffectModel.getGreenScreenMaterialType().getType();
        } else {
            type = "";
        }
        c0lab.LJ("green_screen_material_type", type);
        String str2 = "on";
        if (newGreenScreenEffectModel.getOpenGreenScreenMode()) {
            str = "on";
        } else {
            str = "off";
        }
        c0lab.LJ("green_screen_status", str);
        if (!newGreenScreenEffectModel.getOpenGreenScreenMode() || !newGreenScreenEffectModel.getOpenPortraitMode()) {
            str2 = "off";
        }
        c0lab.LJ("portrait_capture_status", str2);
    }

    public static void LIZJ(String str, ShortVideoContext shortVideoContext, String str2) {
        if (!C296510Bjl.LIZ()) {
            return;
        }
        C0LAB c0labLIZLLL = LIZLLL(shortVideoContext);
        c0labLIZLLL.LJ("to_status", str);
        c0labLIZLLL.LJ("switch_method", str2);
        C20684815ws.LJIILLIIL("green_screen_status_switch", c0labLIZLLL.LIZ);
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext, String str, int i, String str2) {
        if (!C296510Bjl.LIZ()) {
            return;
        }
        C0LAB c0labLIZLLL = LIZLLL(shortVideoContext);
        c0labLIZLLL.LJ("material_type", str);
        if (i > 0) {
            c0labLIZLLL.LIZ(i, "video_final_duration");
        }
        c0labLIZLLL.LJ("material_selected_from", str2);
        C20684815ws.LJIILLIIL("green_screen_material_apply", c0labLIZLLL.LIZ);
    }
}
