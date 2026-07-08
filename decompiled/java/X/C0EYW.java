package X;

import android.text.TextUtils;
import com.bytedance.ies.cutsame.cut_android.NLETemplateConverter;
import com.bytedance.ies.nle.editor_jni.NLECollectionModel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EYW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EYW {
    public static final C0EYW LIZ = new C0EYW();

    public static final String LIZ(VideoPublishEditModel videoPublishEditModel) throws Throwable {
        boolean z;
        List<SingleImageData> imageList;
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        String content;
        NLESegment mainSegment;
        NLETrackSlot nLETrackSlot;
        VecNLEResourceNodeSPtr allResources;
        float fLIZJ;
        String[] strArr;
        ImageSurfaceData surfaceData;
        ImageSurfaceData surfaceData2;
        int zIndex;
        TextStickerModel textStickerModel;
        BaseStickerModel baseStickerModel;
        TextStickerModel textStickerModel2;
        TextTemplateModel textTemplateModel;
        NLESegment mainSegment2;
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot2;
        C0EYY c0eyy = new C0EYY(videoPublishEditModel);
        C571450Mb9.LIZ(C1662160tM6.LIZIZ, "begin producePhotoModeTemplateNLEModel ");
        C1452960nug.LJIIIZ = true;
        C0FGC.LIZ(2);
        final NLECollectionModel nLECollectionModel = new NLECollectionModel();
        new Object() { // from class: X.0DjX
        }.getClass();
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        String musicId = videoPublishEditModel.getMusicId();
        if (musicId != null && musicId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C347660Dk4 c347660Dk4 = new C347660Dk4();
            c347660Dk4.LJIJI = videoPublishEditModel.getMusicId();
            c347660Dk4.LJIIIZ = videoPublishEditModel.getMusicVolume();
            c347660Dk4.LJIJJLI = true;
            c347660Dk4.LIZIZ = "";
            new C347750DkD(c347660Dk4).LIZJ(nLEEditorLIZ);
            NLEModel model = nLEEditorLIZ.getModel();
            if (model != null && (tracks = model.getTracks()) != null && (nLETrack = (NLETrack) C13LP.LJJJLZIJ(0, tracks)) != null && (slots = nLETrack.getSlots()) != null && (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null) {
                mainSegment2 = nLETrackSlot2.getMainSegment();
            } else {
                mainSegment2 = null;
            }
            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(mainSegment2);
            if (nLESegmentAudioDynamicCast != null) {
                nLECollectionModel.setMusic(nLESegmentAudioDynamicCast);
            }
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            int i = 0;
            for (SingleImageData singleImageData : imageList) {
                int i2 = i + 1;
                if (i >= 0) {
                    SingleImageData singleImageData2 = singleImageData;
                    NLEEditor nLEEditorLIZ2 = C346630DiP.LIZ();
                    C347330DjX c347330DjX = new Object() { // from class: X.0DjX
                    };
                    VideoPublishEditModel videoPublishEditModel2 = c0eyy.LIZ;
                    NLEModel model2 = nLEEditorLIZ2.getModel();
                    c347330DjX.getClass();
                    List<StickerItemModel> stickers = singleImageData2.getStickerInfo().getStickers();
                    ArrayList arrayList = new ArrayList();
                    for (StickerItemModel stickerItemModel : stickers) {
                        if (stickerItemModel.type == 2) {
                            arrayList.add(stickerItemModel);
                        }
                    }
                    ImageStickerInfoNewEngine stickerInfoNewEngine = singleImageData2.getStickerInfoNewEngine();
                    if (stickerInfoNewEngine != null) {
                        textStickerModels = stickerInfoNewEngine.getTextStickerModels();
                    } else {
                        textStickerModels = null;
                    }
                    ImageAlbumData imageAlbumData2 = videoPublishEditModel2.getImageAlbumData();
                    if (imageAlbumData2 == null || (surfaceData2 = imageAlbumData2.getSurfaceData()) == null) {
                        content = "";
                    } else {
                        content = "";
                        int i3 = 0;
                        for (TextStickerData textStickerData : C0F7U.LJFF(singleImageData2, C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel2))) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                TextStickerData textStickerData2 = textStickerData;
                                NLETrack nLETrack2 = new NLETrack();
                                NLETrackSlot nLETrackSlot3 = new NLETrackSlot();
                                nLETrackSlot3.setStartTime(((long) 0) * 1000);
                                nLETrackSlot3.setEndTime(((long) 10000) * 1000);
                                textStickerData2.setVideoWidth(surfaceData2.getSurfaceViewWidth());
                                nLETrackSlot3.setTransformX(C363400EMo.LIZ(textStickerData2.getX() / surfaceData2.getSurfaceViewWidth()));
                                nLETrackSlot3.setTransformY(C363400EMo.LIZIZ(C1451030nrZ.LIZLLL(textStickerData2, singleImageData2.getImageRatio(), surfaceData2)));
                                if (C1451030nrZ.LJI(C363400EMo.LIZJ(nLETrackSlot3.getTransformX()), C363400EMo.LIZLLL(nLETrackSlot3.getTransformY()))) {
                                    new Object() { // from class: X.0DjX
                                    }.getClass();
                                    if (textStickerModels == null || textStickerModels.isEmpty() || (textStickerModel2 = (TextStickerModel) C13LP.LJJJLZIJ(i3, textStickerModels)) == null || (textTemplateModel = textStickerModel2.getTextTemplateModel()) == null || !textTemplateModel.enableTextTemplate) {
                                        nLETrackSlot3.setScale(textStickerData2.getScale());
                                        nLETrackSlot3.setRotation(-textStickerData2.getRotation());
                                        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel2)) {
                                            if (textStickerModels != null && (textStickerModel = textStickerModels.get(i3)) != null && (baseStickerModel = textStickerModel.getBaseStickerModel()) != null) {
                                                zIndex = baseStickerModel.getZIndex();
                                            } else {
                                                zIndex = 0;
                                            }
                                        } else {
                                            zIndex = ((StickerItemModel) ListProtector.get(arrayList, i3)).layerWeight;
                                        }
                                        nLETrackSlot3.setLayer(zIndex);
                                        NLESegmentTextSticker nLESegmentTextSticker = new NLESegmentTextSticker();
                                        nLESegmentTextSticker.setContent(textStickerData2.getTextStr());
                                        nLESegmentTextSticker.setStyle(new NLEStyText());
                                        C363420EMq c363420EMq = C363420EMq.LIZ;
                                        NLEStyText style = nLESegmentTextSticker.getStyle();
                                        c363420EMq.getClass();
                                        C363420EMq.LJ(style, textStickerData2);
                                        nLETrackSlot3.setMainSegment(nLESegmentTextSticker);
                                        if (C123100dR.LIZ(nLESegmentTextSticker.getContent()) && content.length() == 0) {
                                            content = nLESegmentTextSticker.getContent();
                                        }
                                        nLETrack2.addSlot(nLETrackSlot3);
                                        nLETrack2.setExtra("StickerTrackType", "TEXT");
                                        model2.addTrack(nLETrack2);
                                    }
                                }
                                i3 = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    ImageFilterInfo filterInfo = singleImageData2.getFilterInfo();
                    if (!a0.LJJJIL(filterInfo.getFilterId())) {
                        if (filterInfo.isComposer()) {
                            FilterBean filterBeanLJIIIIZZ = C574070MfN.LJIIIIZZ(filterInfo);
                            if (filterBeanLJIIIIZZ != null) {
                                C348240Dl0 c348240Dl0 = new C348240Dl0(EnumC356010DxX.COLOR);
                                c348240Dl0.LJFF(filterBeanLJIIIIZZ.getFilterFolder(), filterBeanLJIIIIZZ.getResId());
                                c348240Dl0.LJ(Float.valueOf(filterInfo.getFilterIntensityRatio()), filterBeanLJIIIIZZ.getFilterFolder(), C1643880ssc.LIZJ(filterBeanLJIIIIZZ));
                                c348240Dl0.LIZJ(filterBeanLJIIIIZZ.getFilterFolder(), filterBeanLJIIIIZZ.getExtra());
                                new C348220Dky(c348240Dl0, false).LIZJ(nLEEditorLIZ2);
                            }
                        } else {
                            FilterBean filterBeanLJIIIIZZ2 = C574070MfN.LJIIIIZZ(filterInfo);
                            if (filterBeanLJIIIIZZ2 != null) {
                                C348290Dl5 c348290Dl5 = new C348290Dl5(EnumC356230Dxt.COLOR_NO_COMPOSER);
                                c348290Dl5.LIZIZ = filterBeanLJIIIIZZ2.getFilterFolder();
                                c348290Dl5.LJII = filterBeanLJIIIIZZ2.getResId();
                                c348290Dl5.LJI = 0.0f;
                                c348290Dl5.LIZJ = filterInfo.getFilterIntensityRatio();
                                c348290Dl5.LJ = null;
                                c348290Dl5.LJFF = 0.0f;
                                new C348280Dl4(c348290Dl5).LIZJ(nLEEditorLIZ2);
                            }
                        }
                    }
                    List<StickerItemModel> stickers2 = singleImageData2.getStickerInfo().getStickers();
                    ArrayList<StickerItemModel> arrayList2 = new ArrayList();
                    for (StickerItemModel stickerItemModel2 : stickers2) {
                        if (stickerItemModel2.isNormalInfoSticker()) {
                            arrayList2.add(stickerItemModel2);
                        }
                    }
                    for (StickerItemModel stickerItemModel3 : arrayList2) {
                        ImageAlbumData imageAlbumData3 = c0eyy.LIZ.getImageAlbumData();
                        if (imageAlbumData3 != null && (surfaceData = imageAlbumData3.getSurfaceData()) != null) {
                            fLIZJ = C1451030nrZ.LIZJ(stickerItemModel3.currentOffsetY, singleImageData2.getImageRatio(), surfaceData);
                        } else {
                            fLIZJ = stickerItemModel3.currentOffsetY;
                        }
                        if (C1451030nrZ.LJI(stickerItemModel3.currentOffsetX, fLIZJ)) {
                            C348460DlM c348460DlM = new C348460DlM(0);
                            c348460DlM.LIZIZ = stickerItemModel3.uuid;
                            c348460DlM.LJIIL = stickerItemModel3.path;
                            c348460DlM.LJIILL = stickerItemModel3.stickerId;
                            c348460DlM.LJIIJ = stickerItemModel3.scale;
                            c348460DlM.LJII = stickerItemModel3.rotateAngle;
                            c348460DlM.LJFF = stickerItemModel3.currentOffsetX;
                            c348460DlM.LJI = fLIZJ;
                            if (TextUtils.isEmpty(stickerItemModel3.extra)) {
                                strArr = null;
                            } else {
                                strArr = new String[]{stickerItemModel3.extra};
                            }
                            c348460DlM.LJIILJJIL = strArr;
                            c348460DlM.LJIIZILJ = stickerItemModel3.resId;
                            c348460DlM.LJIILLIIL = stickerItemModel3.panel;
                            c348460DlM.LIZJ = stickerItemModel3.layerWeight;
                            new C348010Dkd(c348460DlM).LIZJ(nLEEditorLIZ2);
                        }
                    }
                    NLEModel model3 = nLEEditorLIZ2.getModel();
                    NLETrack nLETrack3 = new NLETrack();
                    NLETrackSlot nLETrackSlot4 = new NLETrackSlot();
                    long j = ((long) 0) * 1000;
                    nLETrackSlot4.setStartTime(j);
                    long j2 = ((long) 10000) * 1000;
                    nLETrackSlot4.setEndTime(j2);
                    NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                    NLEResourceAV nLEResourceAV = new NLEResourceAV();
                    nLEResourceAV.setResourceType(NLEResType.IMAGE);
                    nLEResourceAV.setDuration(j2);
                    nLEResourceAV.setResourceFile("");
                    nLEResourceAV.setHasAudio(false);
                    nLESegmentVideo.setAVFile(nLEResourceAV);
                    nLESegmentVideo.setTimeClipStart(j);
                    nLESegmentVideo.setTimeClipEnd(j2);
                    nLETrackSlot4.setMainSegment(nLESegmentVideo);
                    if (content.length() > 0) {
                        nLETrackSlot4.setExtra("description", content);
                    }
                    nLETrack3.addSlot(nLETrackSlot4);
                    nLETrack3.setMainTrack(true);
                    model3.addTrack(nLETrack3);
                    NLEModel model4 = nLEEditorLIZ2.getModel();
                    if (model4 != null && (allResources = model4.getAllResources()) != null) {
                        for (NLEResourceNode nLEResourceNode : allResources) {
                            String extra = nLEResourceNode.getExtra("biz_res_id");
                            if (C123100dR.LIZ(extra)) {
                                nLEResourceNode.setResourceId(extra);
                            }
                        }
                    }
                    NLEModel model5 = nLEEditorLIZ2.getModel();
                    C347330DjX c347330DjX2 = new Object() { // from class: X.0DjX
                    };
                    NLEModel model6 = nLEEditorLIZ2.getModel();
                    c347330DjX2.getClass();
                    VecNLETrackSlotSPtr vecNLETrackSlotSPtr = new VecNLETrackSlotSPtr();
                    for (NLETrack nLETrack4 : model6.getTracks()) {
                        NLETrackType trackType = nLETrack4.getTrackType();
                        if (trackType != null) {
                            int i5 = C347320DjW.LIZ[trackType.ordinal()];
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    NLETrackSlot nLETrackSlot5 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack4.getSlots());
                                    if (nLETrackSlot5 != null) {
                                        mainSegment = nLETrackSlot5.getMainSegment();
                                    } else {
                                        mainSegment = null;
                                    }
                                    if (NLESegmentTextSticker.dynamicCast((NLENode) mainSegment) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack4.getSlots())) != null) {
                                        vecNLETrackSlotSPtr.add(nLETrackSlot);
                                    }
                                }
                            } else {
                                NLETrackSlot nLETrackSlot6 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack4.getSlots());
                                if (nLETrackSlot6 != null) {
                                    vecNLETrackSlotSPtr.add(nLETrackSlot6);
                                }
                            }
                        }
                    }
                    nLECollectionModel.addNLEModel(model5, vecNLETrackSlotSPtr);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        for (NLEResourceNode nLEResourceNode2 : nLECollectionModel.getAllResources()) {
            String extra2 = nLEResourceNode2.getExtra("biz_res_id");
            if (C123100dR.LIZ(extra2)) {
                nLEResourceNode2.setResourceId(extra2);
            }
        }
        C571450Mb9.LIZ(C1662160tM6.LIZIZ, "end producePhotoModeTemplateNLEModel ");
        nLECollectionModel.store();
        final String str = videoPublishEditModel.creativeModel.photoModeTemplateData.templateId;
        String absolutePath = C2298208zU.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228014Cw.PHOTO_MODE_TEMPLATE_ZIP, null, false, 12).getAbsolutePath();
        if (str == null) {
            str = "";
        }
        String strLIZ = new C352420Drk(nLECollectionModel, str) { // from class: X.0EYX
            public final NLETemplateConverter LIZLLL;

            @Override // X.C352420Drk
            public final NLETemplateConverter LIZIZ() {
                return this.LIZLLL;
            }

            {
                super(nLECollectionModel, str);
                this.LIZLLL = new NLETemplateConverter(nLECollectionModel, str);
            }
        }.LIZ(C0CHQ.LIZ, absolutePath, false, false, false);
        if (strLIZ != null && strLIZ.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemplateProducer, TemplateZip:");
            sbLIZ.append(strLIZ);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            return strLIZ;
        }
        return "zip_url_invalid";
    }
}
