package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0L5G, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L5G {
    public static final C0L5G LIZ = new C0L5G();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        String value;
        int iIntValue;
        CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null) {
            Integer numValueOf = null;
            if (cameraLayoutModel.layoutEnabled) {
                Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
                LayoutApplyFrom layoutApplyFrom = cameraLayoutModel.layoutApplyFrom;
                if (layoutApplyFrom != null) {
                    value = layoutApplyFrom.getValue();
                } else {
                    value = null;
                }
                c0lab.LJ("layout_apply_from", value);
                c0lab.LJ("layout_mode", cameraLayoutModel.layoutMode);
                c0lab.LIZ(C0L5H.LIZ(cameraLayoutModel), "shoot_cnt");
                c0lab.LIZ(C0L5H.LJ(cameraLayoutModel), "upload_cnt");
                c0lab.LIZ(pairLJIIJJI.getSecond().intValue(), "pic_cnt");
                c0lab.LIZ(pairLJIIJJI.getFirst().intValue(), "video_cnt");
                c0lab.LIZ(C580270MpN.LJIIIZ(videoPublishEditModel), "live_photo_cnt");
                CameraLayoutModel cameraLayoutModel2 = videoPublishEditModel.creativeModel.cameraLayoutModel;
                if (cameraLayoutModel2 != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TimeSpeedModelExtension> arrayList2 = cameraLayoutModel2.captureSegments;
                    if (arrayList2 != null) {
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        Iterator<TimeSpeedModelExtension> it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(Integer.valueOf(it2.next().getDuration()));
                        }
                        arrayList.addAll(arrayList3);
                    }
                    ArrayList<TimeSpeedModelExtension> arrayList4 = cameraLayoutModel2.albumLayoutItems;
                    if (arrayList4 != null) {
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                        Iterator<TimeSpeedModelExtension> it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(Integer.valueOf(it3.next().getDuration()));
                        }
                        arrayList.addAll(arrayList5);
                    }
                    c0lab.LJ("layout_content_length", C13LP.LJJLIIIJ(arrayList, ",", e3.e, e3.f, 0, null, null, 56));
                    Integer num = (Integer) C13LP.LJJLIIIJLJLI(arrayList);
                    if (num != null) {
                        int iIntValue2 = num.intValue();
                        Integer num2 = (Integer) C13LP.LJJLL(arrayList);
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        numValueOf = Integer.valueOf(iIntValue2 - iIntValue);
                    }
                    c0lab.LIZLLL(numValueOf, "layout_max_length_diff");
                }
            }
        }
    }

    public static void LIZJ(C0LAB c0lab, ShortVideoContext shortVideoContext) {
        CreativeModel creativeModel;
        CameraLayoutModel cameraLayoutModel;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (cameraLayoutModel = creativeModel.cameraLayoutModel) != null) {
            String value = null;
            if (cameraLayoutModel.layoutEnabled) {
                LayoutApplyFrom layoutApplyFrom = cameraLayoutModel.layoutApplyFrom;
                if (layoutApplyFrom != null) {
                    value = layoutApplyFrom.getValue();
                }
                c0lab.LJ("layout_apply_from", value);
                c0lab.LJ("layout_mode", cameraLayoutModel.layoutMode);
            }
        }
    }

    public static C0LAB LIZLLL(ShortVideoContext shortVideoContext, int i) {
        String value;
        String str;
        LayoutApplyFrom layoutApplyFrom;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(shortVideoContext.mIsFromDraft)), "is_draft");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        Integer numValueOf = null;
        if (cameraLayoutModel != null && (layoutApplyFrom = cameraLayoutModel.layoutApplyFrom) != null) {
            value = layoutApplyFrom.getValue();
        } else {
            value = null;
        }
        c0lab.LJ("layout_apply_from", value);
        CameraLayoutModel cameraLayoutModel2 = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel2 != null) {
            str = cameraLayoutModel2.layoutMode;
        } else {
            str = null;
        }
        c0lab.LJ("layout_mode", str);
        CameraLayoutModel cameraLayoutModel3 = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel3 != null) {
            numValueOf = Integer.valueOf(C0L5H.LIZIZ(cameraLayoutModel3));
        }
        c0lab.LIZLLL(numValueOf, "layout_fill_cnt");
        c0lab.LIZ(i, "layout_pos");
        return c0lab;
    }

    public static void LIZIZ(C0LAB c0lab, ShortVideoContext shortVideoContext, Boolean bool) {
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null) {
            String value = null;
            if (cameraLayoutModel.layoutEnabled) {
                int iLIZIZ = C0L5H.LIZIZ(cameraLayoutModel);
                LayoutApplyFrom layoutApplyFrom = cameraLayoutModel.layoutApplyFrom;
                if (layoutApplyFrom != null) {
                    value = layoutApplyFrom.getValue();
                }
                c0lab.LJ("layout_apply_from", value);
                c0lab.LJ("layout_mode", cameraLayoutModel.layoutMode);
                c0lab.LIZ(C0L5H.LIZIZ(cameraLayoutModel), "layout_fill_cnt");
                c0lab.LIZ(iLIZIZ, "layout_pos");
            }
        }
        if (bool != null) {
            bool.booleanValue();
            c0lab.LIZ(C308560C7q.LIZ(bool), "is_layout_cell_entrance");
        }
    }

    public static void LJFF(ShortVideoContext shortVideoContext, LayoutApplyFrom layoutApplyFrom, String str, boolean z) {
        String value;
        int iLIZIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(shortVideoContext.mIsFromDraft)), "is_draft");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        if (layoutApplyFrom == null || (value = layoutApplyFrom.getValue()) == null) {
            value = "";
        }
        c0lab.LJ("layout_apply_from", value);
        if (str == null) {
            str = "";
        }
        c0lab.LJ("layout_mode", str);
        c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(z)), "is_entrance_clickable");
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null) {
            iLIZIZ = C0L5H.LIZIZ(cameraLayoutModel);
        } else {
            iLIZIZ = 0;
        }
        c0lab.LIZ(iLIZIZ, "layout_fill_cnt");
        C20684815ws.LJIILLIIL("click_layout_entrance", c0lab.LIZ);
    }

    public static void LJ(ShortVideoContext shortVideoContext, LayoutApplyFrom layoutApplyFrom, String str, String str2, String str3) {
        String value;
        int iLIZIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(shortVideoContext.mIsFromDraft)), "is_draft");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        if (layoutApplyFrom == null || (value = layoutApplyFrom.getValue()) == null) {
            value = "";
        }
        c0lab.LJ("layout_apply_from", value);
        c0lab.LJ("change_type", str);
        if (str2 == null) {
            str2 = "";
        }
        c0lab.LJ("from_layout_mode", str2);
        if (str3 == null) {
            str3 = "";
        }
        c0lab.LJ("to_layout_mode", str3);
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null) {
            iLIZIZ = C0L5H.LIZIZ(cameraLayoutModel);
        } else {
            iLIZIZ = 0;
        }
        c0lab.LIZ(iLIZIZ, "layout_fill_cnt");
        C20684815ws.LJIILLIIL("change_layout_mode", c0lab.LIZ);
    }
}
