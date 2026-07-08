package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VERecordData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS444S0200000_8;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565790MGz {
    public static final C565790MGz LIZ = new C565790MGz();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, final Function0 function0, Bitmap bitmap) {
        String str;
        String str2;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        String strLIZJ;
        String str3;
        String str4;
        String str5;
        MultiEditVideoStatusRecordData multiEditVideoRecordData2;
        String str6;
        C0MH8 c0mh8 = C0MH8.LIZ;
        String str7 = "";
        if (c0mh8.LJ(videoPublishEditModel, -1)) {
            PublishPreviewModel publishPreviewModel = videoPublishEditModel.creativeModel.publishPreviewModel;
            String strLJII = c0mh8.LJII(videoPublishEditModel, -1);
            if (strLJII == null) {
                strLJII = "";
            }
            publishPreviewModel.firstFramePath = strLJII;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            if (C2354709Kn.LIZIZ(videoPublishEditModel.getVideoCoverPath())) {
                PublishPreviewModel publishPreviewModel2 = videoPublishEditModel.creativeModel.publishPreviewModel;
                String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
                if (videoCoverPath != null) {
                    str7 = videoCoverPath;
                }
                publishPreviewModel2.firstFramePath = str7;
                return;
            }
            C1444180ngW.LIZIZ(videoPublishEditModel, new AwS444S0200000_8(videoPublishEditModel, (VideoPublishEditModel) function0, (Function0<Unit>) 12));
            return;
        }
        if (!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) && !C1444940nhk.LJIIL(videoPublishEditModel.getCanvasVideoData())) {
            if (videoPublishEditModel.isMvThemeVideoType()) {
                PublishPreviewModel publishPreviewModel3 = videoPublishEditModel.creativeModel.publishPreviewModel;
                MvCreateVideoData mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
                if (mvCreateVideoData != null && (str6 = mvCreateVideoData.videoCoverImgPath) != null) {
                    str7 = str6;
                }
                publishPreviewModel3.firstFramePath = str7;
                function0.invoke();
                return;
            }
            if (videoPublishEditModel.isMultiVideoEdit()) {
                VERecordData vERecordDataLIZJ = C574800MgY.LIZJ(videoPublishEditModel.getCurMultiEditVideoRecordData());
                Pair<Integer, Integer> playInOutTime = videoPublishEditModel.getCurMultiEditVideoRecordData().getPlayInOutTime();
                vERecordDataLIZJ.setTimeRange(((Number) playInOutTime.first).intValue() * LSPassThroughRecordSizeConfig.DEFAULT, ((Number) playInOutTime.second).intValue() * LSPassThroughRecordSizeConfig.DEFAULT);
                int videoCoverStartTm = (int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
                if (videoPublishEditModel.isUseTimeReverseEffect()) {
                    videoCoverStartTm = (((Number) playInOutTime.second).intValue() - ((Number) playInOutTime.first).intValue()) - videoCoverStartTm;
                }
                String str8 = null;
                if (bitmap != null) {
                    if (videoPublishEditModel.getMultiEditVideoRecordData() != null) {
                        MultiEditVideoStatusRecordData multiEditVideoRecordData3 = videoPublishEditModel.getMultiEditVideoRecordData();
                        if (multiEditVideoRecordData3 != null) {
                            str8 = multiEditVideoRecordData3.coverImagePath;
                        }
                        if (TextUtils.isEmpty(str8) && (multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
                            multiEditVideoRecordData2.coverImagePath = C383300F1c.LIZJ(videoPublishEditModel.getCreativeInfo());
                        }
                        if (C493401w4.LIZ()) {
                            MultiEditVideoStatusRecordData multiEditVideoRecordData4 = videoPublishEditModel.getMultiEditVideoRecordData();
                            if (multiEditVideoRecordData4 != null) {
                                multiEditVideoRecordData4.coverImagePath = C0MH8.LJI(videoPublishEditModel, -2);
                            }
                            PublishPreviewModel publishPreviewModel4 = videoPublishEditModel.creativeModel.publishPreviewModel;
                            MultiEditVideoStatusRecordData multiEditVideoRecordData5 = videoPublishEditModel.getMultiEditVideoRecordData();
                            if (multiEditVideoRecordData5 != null && (str5 = multiEditVideoRecordData5.coverImagePath) != null) {
                                str7 = str5;
                            }
                            publishPreviewModel4.firstFramePath = str7;
                            C0MH8.LJIIZILJ(c0mh8, videoPublishEditModel, bitmap, 0, 3, videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath, 0, null, new AwS581S0100000_2(function0, (Function0<Unit>) 348), 100);
                            return;
                        }
                        PublishPreviewModel publishPreviewModel5 = videoPublishEditModel.creativeModel.publishPreviewModel;
                        MultiEditVideoStatusRecordData multiEditVideoRecordData6 = videoPublishEditModel.getMultiEditVideoRecordData();
                        if (multiEditVideoRecordData6 == null || (str3 = multiEditVideoRecordData6.coverImagePath) == null) {
                            str3 = "";
                        }
                        publishPreviewModel5.firstFramePath = str3;
                        MultiEditVideoStatusRecordData multiEditVideoRecordData7 = videoPublishEditModel.getMultiEditVideoRecordData();
                        if (multiEditVideoRecordData7 != null && (str4 = multiEditVideoRecordData7.coverImagePath) != null) {
                            str7 = str4;
                        }
                        C383300F1c.LJ(bitmap, str7, 100, function0);
                        return;
                    }
                    return;
                }
                MultiEditVideoStatusRecordData multiEditVideoRecordData8 = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData8 != null) {
                    str = multiEditVideoRecordData8.coverImagePath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str) && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
                    if (C0MBI.LIZ()) {
                        strLIZJ = C0MH8.LJI(videoPublishEditModel, -2);
                    } else {
                        strLIZJ = C383300F1c.LIZJ(videoPublishEditModel.getCreativeInfo());
                    }
                    multiEditVideoRecordData.coverImagePath = strLIZJ;
                }
                PublishPreviewModel publishPreviewModel6 = videoPublishEditModel.creativeModel.publishPreviewModel;
                MultiEditVideoStatusRecordData multiEditVideoRecordData9 = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData9 != null && (str2 = multiEditVideoRecordData9.coverImagePath) != null) {
                    str7 = str2;
                }
                publishPreviewModel6.firstFramePath = str7;
                C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel);
                C1457050o1H c1457050o1H = c1456230nzx.LIZ;
                c1457050o1H.LJFF = videoCoverStartTm;
                c1457050o1H.LJIJJLI = true;
                MultiEditVideoStatusRecordData multiEditVideoRecordData10 = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData10 != null) {
                    str8 = multiEditVideoRecordData10.coverImagePath;
                }
                C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
                c1457050o1H2.LIZIZ = str8;
                c1457050o1H2.LIZJ = new C0MBV() { // from class: X.0MH0
                    @Override // X.C0MBV
                    public final void LIZLLL() {
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }
                };
                C1457060o1I.LIZIZ(c1457050o1H2);
                return;
            }
            videoPublishEditModel.generateVideoCoverPath(true, -2);
            C1456230nzx c1456230nzx2 = new C1456230nzx(videoPublishEditModel);
            C1457050o1H c1457050o1H3 = c1456230nzx2.LIZ;
            c1457050o1H3.LJIJI = true;
            c1457050o1H3.LJIJJLI = true;
            c1456230nzx2.LIZ.LIZIZ = videoPublishEditModel.getVideoCoverPath();
            AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(videoPublishEditModel, 456);
            C1457050o1H c1457050o1H4 = c1456230nzx2.LIZ;
            c1457050o1H4.LJII = awS587S0100000_8;
            c1457050o1H4.LIZJ = new C0MBV() { // from class: X.0MH1
                @Override // X.C0MBV
                public final void LIZLLL() {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            };
            C1457060o1I.LIZIZ(c1457050o1H4);
            return;
        }
        PublishPreviewModel publishPreviewModel7 = videoPublishEditModel.creativeModel.publishPreviewModel;
        String videoCoverPath2 = videoPublishEditModel.getVideoCoverPath();
        if (videoCoverPath2 != null) {
            str7 = videoCoverPath2;
        }
        publishPreviewModel7.firstFramePath = str7;
        function0.invoke();
    }
}
