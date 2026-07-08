package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MH4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MH4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<ImportVideoInfo> importInfoList;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        List<String> list;
        if (videoPublishEditModel.getEditorProModel().isPipUsed()) {
            Iterator<String> it2 = videoPublishEditModel.getEditorProModel().getPipResourcePaths().iterator();
            while (it2.hasNext()) {
                LIZ(videoPublishEditModel, it2.next());
            }
        }
        if (videoPublishEditModel.isPhotoMvMode()) {
            if (videoPublishEditModel.getCanvasVideoData() != null) {
                CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
                if (canvasVideoData != null && (list = canvasVideoData.sourceInfo) != null) {
                    Iterator<String> it3 = list.iterator();
                    while (it3.hasNext()) {
                        LIZ(videoPublishEditModel, it3.next());
                    }
                    return;
                }
                return;
            }
            MvCreateVideoData mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
            if (mvCreateVideoData != null && (arrayList2 = mvCreateVideoData.srcSelectMediaList) != null) {
                Iterator<String> it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    LIZ(videoPublishEditModel, it4.next());
                }
                return;
            }
            return;
        }
        if (videoPublishEditModel.isTemplateMv()) {
            MvCreateVideoData mvCreateVideoData2 = videoPublishEditModel.getMvCreateVideoData();
            if (mvCreateVideoData2 != null && (arrayList = mvCreateVideoData2.srcSelectMediaList) != null) {
                Iterator<String> it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    LIZ(videoPublishEditModel, it5.next());
                }
                return;
            }
            return;
        }
        if (videoPublishEditModel.isUploadVideo() && (importInfoList = videoPublishEditModel.getImportInfoList()) != null && !importInfoList.isEmpty()) {
            Iterator it6 = new ArrayList(videoPublishEditModel.getImportInfoList()).iterator();
            while (it6.hasNext()) {
                String realImportPath = ((ImportVideoInfo) it6.next()).getRealImportPath();
                if (realImportPath != null) {
                    LIZ(videoPublishEditModel, realImportPath);
                }
            }
        }
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        String str2;
        String str3;
        List<String> listLJJLIIIJILLIZJL;
        if (!C2471909mP.LIZ(C2471909mP.LJIJJ(str, null)) && (str2 = TEVideoUtils.getMetaData(str).get("live_info")) != null) {
            try {
                Object objOpt = new JSONObject(str2).opt("live_room_ids");
                if ((objOpt instanceof String) && (str3 = (String) objOpt) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6)) != null) {
                    for (String str4 : listLJJLIIIJILLIZJL) {
                        if (!videoPublishEditModel.creativeModel.liveRecordModel.roomIdList.contains(Long.valueOf(CastLongProtector.parseLong(str4)))) {
                            videoPublishEditModel.creativeModel.liveRecordModel.roomIdList.add(Long.valueOf(CastLongProtector.parseLong(str4)));
                        }
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
