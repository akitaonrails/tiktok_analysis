package X;

import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.vesdk.VEUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS27S1101000_22;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431000nLG extends AbstractC1434490nQt {
    public AIGCInfo LLILZLL;
    public VideoPublishEditModel LLIZ;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.UPDATE_AIGC_INFO_BEFORE_SAVE_LOCAL;
    }

    public static void LJIILJJIL(int i, long j) {
        C201955140j.LIZ("AIGCManager -> mobUpdateMetadata");
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, "is_video");
        c0lab.LIZIZ(jCurrentTimeMillis, "update_duration");
        C20684815ws.LJIILLIIL("update_metadata", c0lab.LIZ);
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) throws Throwable {
        VideoPublishEditModel videoPublishEditModel;
        List<String> imageModeLocalPaths;
        List<SingleImageData> imageList;
        if (!C0L1C.LIZ()) {
            C0CHQ.LIZ().isDebugConfigOpen();
            c1431070nLN.LJ(null, true);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    VideoPublishEditModel videoPublishEditModel2 = ((C1434960nRe) next).LIZ;
                    this.LLIZ = videoPublishEditModel2;
                    if (videoPublishEditModel2 == null) {
                        videoPublishEditModel = null;
                    } else {
                        videoPublishEditModel = videoPublishEditModel2;
                    }
                    this.LLILZLL = videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo;
                    if (videoPublishEditModel2 == null) {
                        videoPublishEditModel2 = null;
                    }
                    if (C1428470nHB.LJJZZI(videoPublishEditModel2)) {
                        VideoPublishEditModel videoPublishEditModel3 = this.LLIZ;
                        if (videoPublishEditModel3 == null) {
                            videoPublishEditModel3 = null;
                        }
                        AVUploadSaveModel saveModel = videoPublishEditModel3.getSaveModel();
                        if (saveModel != null && (imageModeLocalPaths = saveModel.getImageModeLocalPaths()) != null) {
                            int i = 0;
                            for (String str : imageModeLocalPaths) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    String str2 = str;
                                    VideoPublishEditModel videoPublishEditModel4 = this.LLIZ;
                                    if (videoPublishEditModel4 == null) {
                                        videoPublishEditModel4 = null;
                                    }
                                    ImageAlbumData imageAlbumData = videoPublishEditModel4.getImageAlbumData();
                                    if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && i < imageList.size()) {
                                        C140D c140d = C140D.LIZ;
                                        AwS27S1101000_22 awS27S1101000_22 = new AwS27S1101000_22(this, i, str2, 1);
                                        c140d.getClass();
                                        C140D.LJJJJI(str2, str2, awS27S1101000_22);
                                    }
                                    i = i2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                        LJIILJJIL(0, jCurrentTimeMillis);
                        c1431070nLN.LJ(null, false);
                        return;
                    }
                    AIGCInfo aIGCInfo = this.LLILZLL;
                    if (aIGCInfo != null) {
                        int i3 = aIGCInfo.AIGCSwitchStatusWhenCompile;
                        int i4 = aIGCInfo.AIGCLabelType;
                        if (i3 != i4 && i4 == 2) {
                            VideoPublishEditModel videoPublishEditModel5 = this.LLIZ;
                            if (videoPublishEditModel5 == null) {
                                videoPublishEditModel5 = null;
                            }
                            int i5 = videoPublishEditModel5.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType;
                            InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
                            VideoPublishEditModel videoPublishEditModel6 = this.LLIZ;
                            if (videoPublishEditModel6 == null) {
                                videoPublishEditModel6 = null;
                            }
                            String strLJIJI = pathAdapter.LJIJI(videoPublishEditModel6.getCreativeInfo());
                            VideoPublishEditModel videoPublishEditModel7 = this.LLIZ;
                            if (videoPublishEditModel7 == null) {
                                videoPublishEditModel7 = null;
                            }
                            String localTempPath = videoPublishEditModel7.getLocalTempPath();
                            if (localTempPath == null) {
                                return;
                            }
                            if (VEUtils.setMetaData(localTempPath, strLJIJI, C2097908Jt.LIZJ(new Pair("aigc_info", C786410Ut5.J3(new JSONObject().put("aigc_label_type", i5))))) > 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AIGCManager -> setMetadata() -> aigcInfo = ");
                                sbLIZ.append(new JSONObject().put("aigc_label_type", i5));
                                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                                VideoPublishEditModel videoPublishEditModel8 = this.LLIZ;
                                if (videoPublishEditModel8 == null) {
                                    videoPublishEditModel8 = null;
                                }
                                AVUploadSaveModel saveModel2 = videoPublishEditModel8.getSaveModel();
                                if (saveModel2 != null) {
                                    saveModel2.setLocalTempPath(strLJIJI);
                                }
                                C140D.LIZ.getClass();
                                C140D.LJJJJI(localTempPath, strLJIJI, null);
                                new C0VSJ(localTempPath).delete();
                            }
                            LJIILJJIL(1, jCurrentTimeMillis);
                            c1431070nLN.LJ(null, false);
                            return;
                        }
                    }
                    c1431070nLN.LJ(null, false);
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
