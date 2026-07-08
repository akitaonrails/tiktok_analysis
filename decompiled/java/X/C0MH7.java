package X;

import Y.ARunnableS8S1300000_8;
import Y.AfS138S0200000_2;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VERecordData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS106S0400000_8;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS286S0300000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS76S1300000_8;
import kotlin.jvm.internal.AwS93S1000000_8;
import lth.o;

/* JADX INFO: renamed from: X.0MH7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MH7 {
    public static final String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        int imageCurrentIndex;
        String path;
        Bitmap bitmapLIZLLL;
        EffectTextModel effectTextModel;
        String strLJII;
        C0MH8 c0mh8 = C0MH8.LIZ;
        if (c0mh8.LJ(videoPublishEditModel, -1) && (strLJII = c0mh8.LJII(videoPublishEditModel, -1)) != null) {
            return strLJII;
        }
        if (videoPublishEditModel.getValidVideoCoverPath() != null) {
            return videoPublishEditModel.getValidVideoCoverPath();
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null) {
            List<SingleImageData> imageList = imageAlbumData.getImageList();
            CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel != null) {
                imageCurrentIndex = coverPublishModel.getImageCurrentIndex();
            } else {
                imageCurrentIndex = 0;
            }
            SingleImageData singleImageData = (SingleImageData) ListProtector.get(imageList, imageCurrentIndex);
            if (singleImageData.getSynthesisData() == null) {
                path = singleImageData.getSrcImageInfo().getPath();
            } else {
                path = singleImageData.getSynthesisData().getPath();
            }
            CoverPublishModel coverPublishModel2 = videoPublishEditModel.getCoverPublishModel();
            if (((coverPublishModel2 == null || (effectTextModel = coverPublishModel2.getEffectTextModel()) == null || !effectTextModel.getHasCoverText()) && !C1447250nlT.LIZ()) || (bitmapLIZLLL = C2471909mP.LIZLLL(path, new BitmapFactory.Options())) == null) {
                return path;
            }
            videoPublishEditModel.generateVideoCoverPath();
            C2477909nN.LJI(bitmapLIZLLL, videoPublishEditModel.getVideoCoverPath(), null, 0, 6);
            return videoPublishEditModel.getVideoCoverPath();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void LJ(Function0<Boolean> function0, Function0<Unit> function02) {
        if (function0.invoke().booleanValue()) {
            function02.invoke();
        } else {
            C12ES.LIZLLL(2131839098, o.LIZ);
        }
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C1322110kVd c1322110kVd, String str) {
        if (str != null && str.length() != 0) {
            try {
                C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                Uri uriFromFile = Uri.fromFile(new C0VSJ(str));
                c1325540kbALIZ.LIZJ(uriFromFile);
                C1324750kZt.LJIIIZ(c1322110kVd, uriFromFile.toString(), -1, -1);
                C565950MHp.LIZ(videoPublishEditModel);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bindImageWithPath failed :");
                sbLIZ.append(e.getMessage());
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static final void LIZJ(C19EG c19eg, C1322110kVd c1322110kVd, VideoPublishEditModel videoPublishEditModel, C09K7 c09k7) {
        videoPublishEditModel.generateVideoCoverPath(true, -2);
        C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel);
        c1456230nzx.LIZ.LJIJI = true;
        String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        C1457050o1H c1457050o1H = c1456230nzx.LIZ;
        c1457050o1H.LIZIZ = videoCoverPath;
        c1457050o1H.LJIILLIIL = 60;
        AwS106S0400000_8 awS106S0400000_8 = new AwS106S0400000_8(c19eg, c1322110kVd, videoPublishEditModel, c09k7, 8);
        C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
        c1457050o1H2.LJII = awS106S0400000_8;
        C1457060o1I.LIZIZ(c1457050o1H2);
    }

    public static final void LIZLLL(final C19EG c19eg, final C1322110kVd c1322110kVd, final VideoPublishEditModel videoPublishEditModel, C09K7 c09k7) {
        String str;
        String str2;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        String str3;
        String str4;
        String strLJIIIZ = C0MH8.LJIIIZ(videoPublishEditModel, C0MH8.LIZ, videoPublishEditModel.getVideoCoverPath());
        if (C2286708xd.LIZJ(strLJIIIZ)) {
            LIZ(videoPublishEditModel, c1322110kVd, strLJIIIZ);
            return;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            C1444180ngW.LIZIZ(videoPublishEditModel, new AwS286S0300000_8(c1322110kVd, videoPublishEditModel, new AwS552S0100000_8(videoPublishEditModel, 981), 12));
            return;
        }
        String str5 = null;
        List<String> list = null;
        if (videoPublishEditModel.getCanvasVideoData() != null) {
            CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
            if (canvasVideoData != null) {
                list = canvasVideoData.sourceInfo;
            }
            LJ(new C5182020e(list, (List<Function0<Unit>>) 337), new AwS252S0300000_8((List) list, (List<String>) c1322110kVd, (C1322110kVd) videoPublishEditModel, (VideoPublishEditModel) 41));
            return;
        }
        String str6 = "";
        if (videoPublishEditModel.isMvThemeVideoType()) {
            MvCreateVideoData mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
            if (mvCreateVideoData != null && (str4 = mvCreateVideoData.videoCoverImgPath) != null) {
                str6 = str4;
            }
            LJ(new AwS93S1000000_8(str6, 4), new AwS76S1300000_8(c19eg, c1322110kVd, videoPublishEditModel, str6, 1));
            return;
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData2 != null) {
                str = multiEditVideoRecordData2.coverImagePath;
            } else {
                str = null;
            }
            if (C2354709Kn.LIZIZ(str)) {
                MultiEditVideoStatusRecordData multiEditVideoRecordData3 = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData3 != null && (str3 = multiEditVideoRecordData3.coverImagePath) != null) {
                    str6 = str3;
                }
                HandlerHook.viewPost(c1322110kVd, new ARunnableS8S1300000_8(c19eg, c1322110kVd, videoPublishEditModel, str6, 1));
                return;
            }
            if (!C1428470nHB.LJLIIIL(videoPublishEditModel) && videoPublishEditModel.getOriginal() != 2) {
                VERecordData vERecordDataLIZJ = C574800MgY.LIZJ(videoPublishEditModel.getCurMultiEditVideoRecordData());
                Pair<Integer, Integer> playInOutTime = videoPublishEditModel.getCurMultiEditVideoRecordData().getPlayInOutTime();
                vERecordDataLIZJ.setTimeRange(((Number) playInOutTime.first).intValue() * LSPassThroughRecordSizeConfig.DEFAULT, ((Number) playInOutTime.second).intValue() * LSPassThroughRecordSizeConfig.DEFAULT);
                final C118300cf c118300cf = new C118300cf();
                c118300cf.element = (int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
                if (videoPublishEditModel.isUseTimeReverseEffect()) {
                    c118300cf.element = (((Number) playInOutTime.second).intValue() - ((Number) playInOutTime.first).intValue()) - c118300cf.element;
                }
                C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0MBS
                    @Override // X.InterfaceC1478005qU
                    public final void subscribe(C09AJ<Drawable> c09aj) {
                        String str7;
                        MultiEditVideoStatusRecordData multiEditVideoRecordData4;
                        MultiEditVideoStatusRecordData multiEditVideoRecordData5;
                        C1C7U.LIZ("CoverExtKt@ad6c.loadMultiVideoEditCover$3");
                        MultiEditVideoStatusRecordData multiEditVideoRecordData6 = videoPublishEditModel.getMultiEditVideoRecordData();
                        String str8 = null;
                        if (multiEditVideoRecordData6 != null) {
                            str7 = multiEditVideoRecordData6.coverImagePath;
                        } else {
                            str7 = null;
                        }
                        if (TextUtils.isEmpty(str7) && (multiEditVideoRecordData5 = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
                            multiEditVideoRecordData5.coverImagePath = C383300F1c.LIZJ(videoPublishEditModel.getCreativeInfo());
                        }
                        if (C493401w4.LIZ() && (multiEditVideoRecordData4 = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
                            C0MH8 c0mh8 = C0MH8.LIZ;
                            VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                            c0mh8.getClass();
                            multiEditVideoRecordData4.coverImagePath = C0MH8.LJI(videoPublishEditModel2, 3);
                        }
                        C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel);
                        c1456230nzx.LIZ.LJFF = c118300cf.element;
                        c1456230nzx.LIZ(-1, c1322110kVd.getHeight());
                        MultiEditVideoStatusRecordData multiEditVideoRecordData7 = videoPublishEditModel.getMultiEditVideoRecordData();
                        if (multiEditVideoRecordData7 != null) {
                            str8 = multiEditVideoRecordData7.coverImagePath;
                        }
                        c1456230nzx.LIZ.LIZIZ = str8;
                        AwS374S0200000_8 awS374S0200000_8 = new AwS374S0200000_8(c19eg, (C19482611Ke) c09aj, 178);
                        C1457050o1H c1457050o1H = c1456230nzx.LIZ;
                        c1457050o1H.LJII = awS374S0200000_8;
                        int iLIZIZ = C1457060o1I.LIZIZ(c1457050o1H);
                        if (iLIZIZ != 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("VEUtils.getVideoThumb return code=");
                            sbLIZ.append(iLIZIZ);
                            C201955140j.LJI("publish_page_get_cover_error", new Exception(C2188811AlT.LIZIZ(sbLIZ)));
                            c09aj.onComplete();
                        }
                        C1C7U.LIZIZ("CoverExtKt@ad6c.loadMultiVideoEditCover$3");
                    }
                }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS138S0200000_2(c1322110kVd, videoPublishEditModel, 6), new C09JN() { // from class: X.0MH6
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("CoverExtKt@ad6c.loadMultiVideoEditCover$5");
                        C12ES.LIZLLL(2131839098, o.LIZ);
                        C1C7U.LIZIZ("CoverExtKt@ad6c.loadMultiVideoEditCover$5");
                    }
                });
                return;
            }
            MultiEditVideoStatusRecordData multiEditVideoRecordData4 = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData4 != null) {
                str5 = multiEditVideoRecordData4.coverImagePath;
            }
            if (TextUtils.isEmpty(str5) && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
                multiEditVideoRecordData.coverImagePath = C383300F1c.LIZJ(videoPublishEditModel.getCreativeInfo());
            }
            MultiEditVideoStatusRecordData multiEditVideoRecordData5 = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData5 != null && (str2 = multiEditVideoRecordData5.coverImagePath) != null) {
                str6 = str2;
            }
            LJ(new AwS93S1000000_8(str6, 5), new AwS76S1300000_8(c19eg, c1322110kVd, videoPublishEditModel, str6, 2));
            return;
        }
        LIZJ(c19eg, c1322110kVd, videoPublishEditModel, c09k7);
    }
}
