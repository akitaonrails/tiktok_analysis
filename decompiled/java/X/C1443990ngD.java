package X;

import Y.ACallableS412S0100000_4;
import Y.ARunnableS1S0420000_22;
import Y.ARunnableS2S1400000_8;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentActionBarItem;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS118S0400000_22;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS39S0500000_3;
import kotlin.jvm.internal.AwS439S0200000_3;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS55S0500000_22;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS75S0500000_14;
import lth.o;

/* JADX INFO: renamed from: X.0ngD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443990ngD {
    public static final C1443990ngD LIZ = new C1443990ngD();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3860));

    public static void LJ(VideoPublishEditModel videoPublishEditModel, String str) {
        String storyShootEntrance;
        String contentSource;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        AVETParameter avetParameter = videoPublishEditModel.getAvetParameter();
        String str2 = "";
        if (avetParameter == null || (storyShootEntrance = avetParameter.getStoryShootEntrance()) == null) {
            storyShootEntrance = "";
        }
        c0lab.LJ("shoot_entrance", storyShootEntrance);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        AVETParameter avetParameter2 = videoPublishEditModel.getAvetParameter();
        if (avetParameter2 != null && (contentSource = avetParameter2.getContentSource()) != null) {
            str2 = contentSource;
        }
        c0lab.LJ("content_source", str2);
        c0lab.LJ("after_post", CardStruct.IStatusCode.DEFAULT);
        C580270MpN.LIZJ(videoPublishEditModel, c0lab, str);
        C20684815ws.LJIILLIIL("click_cover_entrance", c0lab.LIZ);
        videoPublishEditModel.creativeModel.postPageModel.clickCover = System.currentTimeMillis();
        videoPublishEditModel.creativeModel.postPageModel.coverEnterFrom = str;
    }

    public static void LIZ(final InterfaceC1456360o0A interfaceC1456360o0A, final VideoPublishEditModel videoPublishEditModel, final Function1 function1) {
        if (interfaceC1456360o0A == null) {
            return;
        }
        if (interfaceC1456360o0A.LJ()) {
            function1.invoke(Boolean.TRUE);
        } else {
            C15O7.LIZJ(new ACallableS412S0100000_4(interfaceC1456360o0A, 15)).LJ(new InterfaceC2385309Wh() { // from class: X.0MHJ
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7<Boolean> c15o7) {
                    CoverNewItem coverNewItemLIZIZ;
                    Float videoCoverStartTm;
                    CopyOnWriteArrayList<CoverNewItem> newCoverList;
                    CoverNewItem coverNewItem;
                    C1C7U.LIZ("ChooseCoverHelper@ec4.doAfterTaskFinish$2");
                    if (videoPublishEditModel != null && (coverNewItemLIZIZ = interfaceC1456360o0A.LIZIZ()) != null && (videoCoverStartTm = coverNewItemLIZIZ.getVideoCoverStartTm()) != null) {
                        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                        float fFloatValue = videoCoverStartTm.floatValue();
                        videoPublishEditModel2.setVideoCoverStartTm(fFloatValue);
                        CoverPublishModel coverPublishModel = videoPublishEditModel2.getCoverPublishModel();
                        if (coverPublishModel != null && (newCoverList = coverPublishModel.getNewCoverList()) != null && (coverNewItem = (CoverNewItem) C13LP.LJJLIIIJL(newCoverList)) != null) {
                            coverNewItem.setVideoCoverStartTm(Float.valueOf(fFloatValue));
                        }
                    }
                    Function1<Boolean, Unit> function12 = function1;
                    boolean z = true;
                    if (c15o7 == null || !c15o7.LJIILJJIL() || !c15o7.LJIIL().booleanValue()) {
                        z = false;
                    }
                    function12.invoke(Boolean.valueOf(z));
                    C1C7U.LIZIZ("ChooseCoverHelper@ec4.doAfterTaskFinish$2");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", "edit_cover_page");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("from_status", str);
        c0lab.LJ("to_status", str2);
        C20684815ws.LJIILLIIL("cover_click", c0lab.LIZ);
    }

    public static final void LIZIZ(C19EG c19eg, C1322110kVd c1322110kVd, VideoPublishEditModel videoPublishEditModel, C09K7 c09k7) {
        C856570Xix c856570XixLJIIJ = C0CHQ.LIZ().getPublishService().LJIIJ();
        AwS75S0500000_14 awS75S0500000_14 = new AwS75S0500000_14(c856570XixLJIIJ, videoPublishEditModel, c19eg, c1322110kVd, c09k7, 1);
        if (c856570XixLJIIJ.LIZ) {
            C1443990ngD c1443990ngD = LIZ;
            C1455410nyd c1455410nydLIZ = c856570XixLJIIJ.LIZ();
            AwS39S0500000_3 awS39S0500000_3 = new AwS39S0500000_3(c19eg, videoPublishEditModel, c1322110kVd, awS75S0500000_14, c09k7, 1);
            c1443990ngD.getClass();
            LIZ(c1455410nydLIZ, videoPublishEditModel, awS39S0500000_3);
            return;
        }
        awS75S0500000_14.invoke();
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, String str, boolean z, boolean z2) {
        String str2;
        int i;
        videoPublishEditModel.creativeModel.transientPostPageModel.LIZ = System.currentTimeMillis();
        videoPublishEditModel.creativeModel.postPageModel.previewEnterFrom = "video_post_page";
        C1406110mh7 c1406110mh7 = C1406110mh7.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("original_resolution", C1428520nHG.LJJIJL(videoPublishEditModel));
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("shoot_entrance", videoPublishEditModel.getAvetParameter().getStoryShootEntrance());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0lab.LJ("route", "1");
        c0lab.LJ("after_post", CardStruct.IStatusCode.DEFAULT);
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            str2 = "preview_feed";
        } else {
            str2 = "preview_video";
        }
        c0lab.LJ("preview_tab_name", str2);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_auto_enter");
        c0lab.LIZ(!videoPublishEditModel.creativeModel.stickerModel.addYoursStickerModels.isEmpty() ? 1 : 0, "is_add_yours");
        C580270MpN.LIZIZ(videoPublishEditModel, c0lab, false);
        c1406110mh7.getClass();
        c0lab.LIZ(C1406110mh7.LIZLLL(videoPublishEditModel, str) ? 1 : 0, "is_inspiration_added");
        c0lab.LIZ(C1406110mh7.LJ(videoPublishEditModel, str) ? 1 : 0, "is_photo_text_added");
        C0EON.LIZ(videoPublishEditModel, c0lab);
        c0lab.LJ("is_from_top_entrance", C1402490mbH.LIZ(z2));
        C572310McX.LIZJ(c0lab, videoPublishEditModel, null, false);
        C20684815ws.LJIILLIIL("click_preview_entrance", c0lab.LIZ);
    }

    public static void LJII(VideoPublishEditModel videoPublishEditModel, String str, boolean z, boolean z2) {
        int i;
        int i2;
        String contentSource;
        PublishCustomCoverModel publishCustomCoverModel = videoPublishEditModel.creativeModel.publishCustomCoverModel;
        publishCustomCoverModel.isCoverChangeFrame = z ? 1 : 0;
        int i3 = 0;
        if (publishCustomCoverModel.isCoverUpload == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (publishCustomCoverModel.isCoverAddText == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i == 1 || z2 || i2 == 1 || z) {
            i3 = 1;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", "edit_cover_page");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("to_status", str);
        c0lab.LIZ(i3, "is_cover_edit");
        c0lab.LIZ(z ? 1 : 0, "is_cover_change_frame");
        c0lab.LIZ(i2, "is_cover_add_text");
        c0lab.LIZ(z2 ? 1 : 0, "is_cover_crop");
        c0lab.LIZ(i, "is_cover_upload");
        AVETParameter avetParameter = videoPublishEditModel.getAvetParameter();
        if (avetParameter == null || (contentSource = avetParameter.getContentSource()) == null) {
            contentSource = "";
        }
        c0lab.LJ("content_source", contentSource);
        C580270MpN.LIZJ(videoPublishEditModel, c0lab, "edit_cover_page");
        C20684815ws.LJIILLIIL("cover_preview", c0lab.LIZ);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.09K6] */
    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, C1322110kVd c1322110kVd, C19EG c19eg, final C09K7 c09k7, LifecycleOwner lifecycleOwner) {
        C19EG c19eg2;
        int height;
        int width;
        if (c19eg == null) {
            return;
        }
        String strLIZIZ = C1429320nIY.LIZIZ(videoPublishEditModel);
        C1444000ngE c1444000ngE = new C1444000ngE(lifecycleOwner, c1322110kVd, "ChooseCoverHelper#loadVideoCover");
        C19EG c19eg3 = null;
        if (C0BP2.LIZ()) {
            C201955140j.LIZLLL(C20102213l6.LIZIZ, "MEMORY_LEAK", "ChooseCoverHelper loadVideoCover, activity set null");
            c19eg2 = null;
        } else {
            c19eg2 = c19eg;
        }
        if (C1429320nIY.LIZJ(videoPublishEditModel)) {
            C1443400nfG.LIZJ(strLIZIZ, new AwS118S0400000_22(c09k7, videoPublishEditModel, c1444000ngE, c19eg2, 4));
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ?? r5 = new C09K7() { // from class: X.09K6
            @Override // X.C09K7
            public final void LJJLIIIJLLLLLLLZ(Bitmap bitmap) {
                C09K7 c09k72 = c09k7;
                if (c09k72 != null) {
                    c09k72.LJJLIIIJLLLLLLLZ(bitmap);
                }
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("coast: ");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C201955140j.LJIILL(c830690WiJ, "loadVideoCover", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        if (C1463450oBb.LIZ()) {
            C844470XAv.LIZ.getClass();
            height = (int) C844470XAv.LIZ().getResources().getDimension(R.dimen.ad8);
        } else {
            height = c1322110kVd.getHeight();
        }
        if (height > 0 && c1322110kVd.getHeight() > 0 && c1322110kVd.getWidth() > 0) {
            width = (c1322110kVd.getWidth() * height) / c1322110kVd.getHeight();
        } else {
            height = -1;
            width = -1;
        }
        C1444000ngE c1444000ngE2 = new C1444000ngE(lifecycleOwner, c1322110kVd, "ChooseCoverHelper#loadSmartVideoCover");
        if (!C0BP2.LIZ()) {
            c19eg3 = c19eg;
        }
        WeakReference weakReference = new WeakReference(c19eg);
        C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel);
        c1456230nzx.LIZ(width, height);
        c1456230nzx.LIZ.LJIJI = true;
        c1456230nzx.LIZ.LIZIZ = videoPublishEditModel.getVideoCoverPath();
        AwS55S0500000_22 awS55S0500000_22 = new AwS55S0500000_22((C09K6) r5, videoPublishEditModel, c1444000ngE2, c19eg3, weakReference, 1);
        C1457050o1H c1457050o1H = c1456230nzx.LIZ;
        c1457050o1H.LJII = awS55S0500000_22;
        C1457060o1I.LIZIZ(c1457050o1H);
    }

    public static Bitmap LIZLLL(Bitmap bitmap, VideoPublishEditModel videoPublishEditModel, C1444000ngE c1444000ngE, C19EG c19eg, boolean z) {
        Resources resourcesLIZJ;
        EffectTextModel effectTextModel;
        Bitmap bitmapMergeCoverText;
        Bitmap bitmap2 = bitmap;
        CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
        if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmap2)) != null) {
            bitmap2 = bitmapMergeCoverText;
        }
        boolean zLIZ = C493401w4.LIZ();
        if (!C0BP2.LIZ() && c19eg != null) {
            resourcesLIZJ = c19eg.getResources();
        } else {
            C201955140j.LIZLLL(C20102213l6.LIZIZ, "MEMORY_LEAK", "ChooseCoverHelper use application resource");
            resourcesLIZJ = C1BWL.LIZJ();
        }
        C443530HaJ c443530HaJ = new C443530HaJ(resourcesLIZJ, bitmap2);
        c443530HaJ.LIZJ(C12ES.LIZJ(4.0f, o.LIZ));
        ExecutorC527170Klv.LLILLJJLI.execute(new ARunnableS1S0420000_22(c1444000ngE, c443530HaJ, videoPublishEditModel, z, zLIZ, bitmap2, 1));
        return bitmap2;
    }

    public static void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, int i, String str, Function1 function1) {
        String str2;
        if (C493401w4.LIZ()) {
            C0MH8.LJIIZILJ(C0MH8.LIZ, videoPublishEditModel, bitmap, 0, i, str, 0, null, new AwS583S0100000_4(function1, (Function1<? super List<CommerceAgentActionBarItem>, Unit>) 274), 100);
            return;
        }
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData == null || (str2 = multiEditVideoRecordData.coverImagePath) == null) {
            str2 = "";
        }
        C383300F1c.LJ(bitmap, str2, 100, new AwS548S0100000_4(function1, (Function1<? super C0CYD, Unit>) 475));
    }

    public static void LJIIJ(C19EG c19eg, C1322110kVd c1322110kVd, VideoPublishEditModel videoPublishEditModel, C09K7 c09k7, String str) {
        if (c19eg == null) {
            return;
        }
        HandlerHook.viewPost(c1322110kVd, new ARunnableS2S1400000_8(c19eg, c1322110kVd, videoPublishEditModel, c09k7, str, 0));
    }

    public static final void LJIIJJI(final VideoPublishEditModel videoPublishEditModel, final C1322110kVd c1322110kVd, C19EG c19eg, final C09K7 c09k7, final LifecycleOwner lifecycleOwner) {
        List<String> list;
        String str;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        final C19EG c19eg2 = c19eg;
        if (c19eg2 == null) {
            return;
        }
        boolean zLIZJ = C1429320nIY.LIZJ(videoPublishEditModel);
        String str2 = null;
        if (zLIZJ && (videoPublishEditModel == null || !C1429320nIY.LJ(videoPublishEditModel))) {
            C1444000ngE c1444000ngE = new C1444000ngE(lifecycleOwner, c1322110kVd, "ChooseCoverHelper#setVideoThumbImage");
            if (C0BP2.LIZ()) {
                c19eg2 = null;
            }
            C1443400nfG.LIZJ(C1429320nIY.LIZIZ(videoPublishEditModel), new AwS118S0400000_22(c09k7, videoPublishEditModel, c1444000ngE, c19eg2, 5));
            return;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            C0MH8 c0mh8 = C0MH8.LIZ;
            if (C2354709Kn.LIZIZ(C0MH8.LJIIIZ(videoPublishEditModel, c0mh8, videoPublishEditModel.getVideoCoverPath()))) {
                String strLJIIIZ = C0MH8.LJIIIZ(videoPublishEditModel, c0mh8, videoPublishEditModel.getVideoCoverPath());
                if (strLJIIIZ != null) {
                    C1324750kZt.LJIIIZ(c1322110kVd, Uri.fromFile(new C0VSJ(strLJIIIZ)).toString(), -1, -1);
                    C565950MHp.LIZ(videoPublishEditModel);
                    return;
                }
                return;
            }
            C1444180ngW.LIZIZ(videoPublishEditModel, new AwS439S0200000_3(c1322110kVd, videoPublishEditModel, 3));
            return;
        }
        if (!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) && !C1444940nhk.LJIIL(videoPublishEditModel.getCanvasVideoData())) {
            String str3 = "";
            if (videoPublishEditModel.isMvThemeVideoType()) {
                C0MH8 c0mh82 = C0MH8.LIZ;
                MvCreateVideoData mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
                if (mvCreateVideoData != null) {
                    str2 = mvCreateVideoData.videoCoverImgPath;
                }
                String strLJIIIZ2 = C0MH8.LJIIIZ(videoPublishEditModel, c0mh82, str2);
                if (strLJIIIZ2 != null) {
                    str3 = strLJIIIZ2;
                }
                videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath = str3;
                if (C2354709Kn.LIZIZ(str3)) {
                    LJIIJ(c19eg2, c1322110kVd, videoPublishEditModel, c09k7, str3);
                    return;
                }
                return;
            }
            if (videoPublishEditModel.isMultiVideoEdit()) {
                if (!C1428470nHB.LJLIIIL(videoPublishEditModel) && !videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() && videoPublishEditModel.getOriginal() != 2 && !videoPublishEditModel.getSoundSyncFromAnchor() && !C1428470nHB.LLIIJI(videoPublishEditModel) && !C1428470nHB.LLIIIZ(videoPublishEditModel) && !C1428470nHB.LJJL(videoPublishEditModel) && !C1416310mxZ.LJJI(videoPublishEditModel) && videoPublishEditModel.creativeModel.videoImageSeparateSwitchModel == null && !videoPublishEditModel.getAILivePhotoModel().LJII()) {
                    if (C1428470nHB.LLFF(videoPublishEditModel)) {
                        String strLJIIIZ3 = C0MH8.LJIIIZ(videoPublishEditModel, C0MH8.LIZ, videoPublishEditModel.getVideoCoverPath());
                        if (strLJIIIZ3 != null) {
                            str3 = strLJIIIZ3;
                        }
                        if (C2354709Kn.LIZIZ(str3)) {
                            LJIIJ(c19eg2, c1322110kVd, videoPublishEditModel, null, str3);
                            videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath = str3;
                            MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
                            if (multiEditVideoRecordData2 != null) {
                                multiEditVideoRecordData2.coverImagePath = str3;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (C1463450oBb.LIZ()) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C09K4(videoPublishEditModel, c1322110kVd, c19eg2, c09k7, lifecycleOwner, null), 3);
                        return;
                    } else {
                        HandlerHook.viewPost(c1322110kVd, new Runnable() { // from class: X.09K5
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ChooseCoverHelper@ec4.setVideoThumbImage$7");
                                try {
                                    C1443990ngD c1443990ngD = C1443990ngD.LIZ;
                                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                                    C1322110kVd c1322110kVd2 = c1322110kVd;
                                    C19EG c19eg3 = c19eg2;
                                    C09K7 c09k72 = c09k7;
                                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                                    c1443990ngD.getClass();
                                    C1443990ngD.LIZJ(videoPublishEditModel2, c1322110kVd2, c19eg3, c09k72, lifecycleOwner2);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ChooseCoverHelper@ec4.setVideoThumbImage$7");
                            }
                        });
                        return;
                    }
                }
                MultiEditVideoStatusRecordData multiEditVideoRecordData3 = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData3 != null) {
                    str = multiEditVideoRecordData3.coverImagePath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str) && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
                    multiEditVideoRecordData.coverImagePath = C383300F1c.LIZJ(videoPublishEditModel.getCreativeInfo());
                }
                C0MH8 c0mh83 = C0MH8.LIZ;
                MultiEditVideoStatusRecordData multiEditVideoRecordData4 = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData4 != null) {
                    str2 = multiEditVideoRecordData4.coverImagePath;
                }
                String strLJIIIZ4 = C0MH8.LJIIIZ(videoPublishEditModel, c0mh83, str2);
                if (strLJIIIZ4 != null) {
                    str3 = strLJIIIZ4;
                }
                if (C2354709Kn.LIZIZ(str3)) {
                    LJIIJ(c19eg2, c1322110kVd, videoPublishEditModel, c09k7, str3);
                    videoPublishEditModel.setVideoCoverPath(str3);
                    videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath = str3;
                    return;
                }
                return;
            }
            if (videoPublishEditModel.isCutSameVideoType()) {
                String strLJIIIZ5 = C0MH8.LJIIIZ(videoPublishEditModel, C0MH8.LIZ, videoPublishEditModel.getVideoCoverPath());
                if (strLJIIIZ5 != null && C2354709Kn.LIZIZ(strLJIIIZ5)) {
                    LJIIJ(c19eg2, c1322110kVd, videoPublishEditModel, null, strLJIIIZ5);
                    videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath = strLJIIIZ5;
                    return;
                }
                return;
            }
            if (C1429320nIY.LIZJ(videoPublishEditModel)) {
                C1443400nfG.LIZJ(C1429320nIY.LIZIZ(videoPublishEditModel), new AwS217S0300000_8(c19eg2, c1322110kVd, videoPublishEditModel, 38));
                return;
            }
            String strLJIIIZ6 = C0MH8.LJIIIZ(videoPublishEditModel, C0MH8.LIZ, videoPublishEditModel.getVideoCoverPath());
            if (C2286708xd.LIZJ(strLJIIIZ6)) {
                C1324750kZt.LIZLLL(c1322110kVd, C2471909mP.LJIILIIL(strLJIIIZ6), -1, -1);
                C565950MHp.LIZ(videoPublishEditModel);
                return;
            }
            videoPublishEditModel.generateVideoCoverPath(true, -2);
            C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel);
            c1456230nzx.LIZ.LJIJI = true;
            c1456230nzx.LIZ.LIZIZ = videoPublishEditModel.getVideoCoverPath();
            AwS217S0300000_8 awS217S0300000_8 = new AwS217S0300000_8(c19eg2, c1322110kVd, videoPublishEditModel, 39);
            C1457050o1H c1457050o1H = c1456230nzx.LIZ;
            c1457050o1H.LJII = awS217S0300000_8;
            C1457060o1I.LIZIZ(c1457050o1H);
            return;
        }
        String strLJIIIZ7 = C0MH8.LJIIIZ(videoPublishEditModel, C0MH8.LIZ, videoPublishEditModel.getVideoCoverPath());
        if (strLJIIIZ7 != null) {
            if (!C2286708xd.LIZJ(strLJIIIZ7)) {
                CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
                if (canvasVideoData != null && (list = canvasVideoData.sourceInfo) != null && !list.isEmpty()) {
                    strLJIIIZ7 = (String) ListProtector.get(list, 0);
                }
                videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath = strLJIIIZ7;
            }
            C1324750kZt.LIZLLL(c1322110kVd, C2471909mP.LJIILIIL(strLJIIIZ7), -1, -1);
            C565950MHp.LIZ(videoPublishEditModel);
        }
    }
}
