package X;

import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEMask;
import com.bytedance.ies.nle.editor_jni.NLEMattingStroke;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEMattingStroke;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.android.editor.core.api.params.MaskParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363380EMm {
    public final C389400FOo LIZ;
    public final CreativeModel LIZIZ;
    public long LIZJ = -1;

    public static void LIZJ(NLETrackSlot nLETrackSlot) {
        NLECanvasType type;
        NLEResourceNode image;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return;
        }
        NLEStyCanvas canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle();
        String resourceFile = null;
        if (canvasStyle != null) {
            type = canvasStyle.getType();
        } else {
            type = null;
        }
        if (type != NLECanvasType.IMAGE) {
            return;
        }
        NLEStyCanvas canvasStyle2 = nLESegmentVideoDynamicCast.getCanvasStyle();
        if (canvasStyle2 != null && (image = canvasStyle2.getImage()) != null) {
            resourceFile = image.getResourceFile();
        }
        if (C123100dR.LIZ(resourceFile) && !C2286708xd.LIZJ(resourceFile)) {
            NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
            nLEStyCanvas.setType(NLECanvasType.COLOR);
            nLEStyCanvas.setColor(-16777216L);
            nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
        }
    }

    public static boolean LJ(NLETrackSlot nLETrackSlot) {
        String resourceFile;
        NLEResourceNode resource;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
            resourceFile = "";
        }
        if (C123100dR.LIZ(resourceFile) && C2286708xd.LIZJ(resourceFile)) {
            return true;
        }
        return false;
    }

    public static void LJFF(NLETrackSlot nLETrackSlot) {
        String resourceFile;
        NLEResourceNode effectSDKTransition;
        NLESegmentTransition endTransition = nLETrackSlot.getEndTransition();
        if (endTransition == null || (effectSDKTransition = endTransition.getEffectSDKTransition()) == null || (resourceFile = effectSDKTransition.getResourceFile()) == null) {
            resourceFile = "";
        }
        if (!C123100dR.LIZ(resourceFile) || !C2286708xd.LIZJ(resourceFile)) {
            nLETrackSlot.setEndTransition(null);
        }
    }

    public static void LJIIZILJ(NLEModel nLEModel) {
        NLEResourceNode effectSDKFilter;
        String resourceId;
        String extra;
        VecNLETrackSlotSPtr sortedSlots;
        NLEResourceNode effectSDKFilter2;
        String resourceId2;
        String extra2;
        if (nLEModel != null) {
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(it2.next().getFilters(), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    NLEFilter nLEFilter = (NLEFilter) obj;
                    if (!nLEFilter.hasExtra("part_filter_type") || (extra2 = nLEFilter.getExtra("part_filter_type")) == null || extra2.length() == 0) {
                        NLESegmentFilter segment = nLEFilter.getSegment();
                        if (segment != null && (effectSDKFilter2 = segment.getEffectSDKFilter()) != null && (resourceId2 = effectSDKFilter2.getResourceId()) != null && a0.LJJIIZI(resourceId2, "filtercomposer", false)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((NLENode) it3.next()).setExtra("part_filter_type", "color_filter");
                }
            }
            List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(nLEModel);
            if (listLJJLIIIJLJLI != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<NLETrack> it4 = listLJJLIIIJLJLI.iterator();
                while (it4.hasNext()) {
                    C19719612Di.LJJI(it4.next().getSortedSlots(), arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    C19719612Di.LJJI(((NLETrackSlot) it5.next()).getFilters(), arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList4) {
                    NLEFilter nLEFilter2 = (NLEFilter) obj2;
                    if (!nLEFilter2.hasExtra("part_filter_type") || (extra = nLEFilter2.getExtra("part_filter_type")) == null || extra.length() == 0) {
                        NLESegmentFilter segment2 = nLEFilter2.getSegment();
                        if (segment2 != null && (effectSDKFilter = segment2.getEffectSDKFilter()) != null && (resourceId = effectSDKFilter.getResourceId()) != null && a0.LJJIIZI(resourceId, "filtercomposer", false)) {
                            arrayList5.add(obj2);
                        }
                    }
                }
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    ((NLENode) it6.next()).setExtra("part_filter_type", "color_filter");
                }
            }
        }
    }

    public static void LJIJI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
            }
            ArrayList<NLETimeSpaceNode> arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(((NLETrackSlot) it3.next()).getKeyframes(), arrayList2);
            }
            for (NLETimeSpaceNode nLETimeSpaceNode : arrayList2) {
                if (nLETimeSpaceNode.getTransformX() == 0.0f) {
                    nLETimeSpaceNode.setTransformX(0.0f);
                }
                if (nLETimeSpaceNode.getTransformY() == 0.0f) {
                    nLETimeSpaceNode.setTransformY(0.0f);
                }
                if (nLETimeSpaceNode.getScale() == 1.0f) {
                    nLETimeSpaceNode.setScale(1.0f);
                }
                if (nLETimeSpaceNode.getRotation() == 0.0f) {
                    nLETimeSpaceNode.setRotation(0.0f);
                }
            }
        }
    }

    public static void LJIJJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UgcTemplateConsumer not found ep model in cache:  ");
        sbLIZ.append(str);
        C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C363380EMm(C389400FOo c389400FOo, CreativeModel creativeModel) {
        this.LIZ = c389400FOo;
        this.LIZIZ = creativeModel;
    }

    public static void LIZIZ(NLEModel nLEModel, CreativeModel creativeModel) {
        NLESegment mainSegment;
        NLEResourceAV aVFile;
        String resourceFile;
        PUgcTemplateData pUgcTemplateData;
        Set<String> set;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Iterable slots = ((NLETrack) it2.next()).getSlots();
            if (slots == null) {
                slots = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(slots, arrayList2);
        }
        for (NLETrackSlot nLETrackSlot : arrayList2) {
            String extra = null;
            if (nLETrackSlot != null) {
                mainSegment = nLETrackSlot.getMainSegment();
            } else {
                mainSegment = null;
            }
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment);
            if (nLESegmentVideoDynamicCast != null) {
                extra = nLESegmentVideoDynamicCast.getExtra("is_mutable");
            }
            boolean zLJFF = Intrinsics.LJFF(extra, "true");
            if (nLESegmentVideoDynamicCast != null && !zLJFF && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null && resourceFile.length() != 0 && creativeModel != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null && (set = pUgcTemplateData.templateInternalRes) != null) {
                set.add(resourceFile);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14, com.bytedance.ies.nle.editor_jni.NLEModel r15) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363380EMm.LJIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel):void");
    }

    public final void LJII(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
        VecNLETrackSlotSPtr sortedSlots;
        VecNLEChromaChannelSPtr chromaChannels;
        NLEChromaChannel nLEChromaChannel;
        NLESegmentChromaChannel segment;
        NLEResourceNode resource;
        Pair<String, String> pairLIZJ;
        Effect effectLIZIZ;
        if (nLETrack.getEnable() && C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.VIDEO && (sortedSlots = nLETrack.getSortedSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                if (nLETrackSlot != null && (chromaChannels = nLETrackSlot.getChromaChannels()) != null && (nLEChromaChannel = (NLEChromaChannel) C13LP.LJJJLL(chromaChannels)) != null && (segment = nLEChromaChannel.getSegment()) != null && (resource = segment.getResource()) != null && (pairLIZJ = C0FGD.LIZJ(resource.getResourceId())) != null && (effectLIZIZ = this.LIZ.LIZIZ(pairLIZJ.getFirst(), pairLIZJ.getSecond())) != null) {
                    videoPublishEditModel.getEditorProModel().getChromaEffects().add(new EditorProEffectInfo(resource.getResourceId(), resource.getResourceName(), effectLIZIZ.getUnzipPath()));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    public final void LJIIIZ(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
        VecNLETrackSlotSPtr slots;
        ?? arrayList;
        NLESegmentMask segment;
        MaskParam maskParam;
        NLEMask nLEMask;
        NLESegmentMask segment2;
        NLEResourceNode effectSDKMask;
        String resourceId;
        Pair<String, String> pairLIZJ;
        Effect effectLIZIZ;
        C0ENW c0enw;
        String labelStr;
        String resourceFile;
        String resourceId2;
        NLEMask nLEMask2;
        Effect effectLIZIZ2;
        NLESegmentMask segment3;
        NLEResourceNode effectSDKMask2;
        if (nLETrack.getEnable() && C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.VIDEO && (slots = nLETrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                VecNLEMaskSPtr masks = nLETrackSlot.getMasks();
                String jsonStr = null;
                if (masks != null) {
                    arrayList = new ArrayList();
                    for (NLEMask nLEMask3 : masks) {
                        if (nLEMask3 != null && (segment3 = nLEMask3.getSegment()) != null && (effectSDKMask2 = segment3.getEffectSDKMask()) != null) {
                            arrayList.add(effectSDKMask2);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                for (NLEResourceNode nLEResourceNode : arrayList) {
                    Pair<String, String> pairLIZJ2 = C0FGD.LIZJ(nLEResourceNode.getResourceId());
                    if (pairLIZJ2 != null && (effectLIZIZ2 = this.LIZ.LIZIZ(pairLIZJ2.getFirst(), pairLIZJ2.getSecond())) != null) {
                        videoPublishEditModel.getEditorProModel().getMaskEffects().add(new EditorProEffectInfo(nLEResourceNode.getResourceId(), nLEResourceNode.getResourceName(), effectLIZIZ2.getUnzipPath()));
                    }
                }
                VecNLEMaskSPtr masks2 = nLETrackSlot.getMasks();
                if (masks2 != null && (nLEMask2 = (NLEMask) C13LP.LJJJLL(masks2)) != null) {
                    segment = nLEMask2.getSegment();
                } else {
                    segment = null;
                }
                if (segment != null) {
                    NLEResourceNode effectSDKMask3 = segment.getEffectSDKMask();
                    if (effectSDKMask3 == null || (resourceFile = effectSDKMask3.getResourceFile()) == null) {
                        resourceFile = "";
                    }
                    boolean invert = segment.getInvert();
                    Float fValueOf = Float.valueOf(segment.getWidth());
                    Float fValueOf2 = Float.valueOf(segment.getHeight());
                    Float fValueOf3 = Float.valueOf(segment.getCenterX());
                    Float fValueOf4 = Float.valueOf(segment.getCenterY());
                    Float fValueOf5 = Float.valueOf(segment.getFeather());
                    Float fValueOf6 = Float.valueOf(segment.getRoundCorner());
                    NLEResourceNode effectSDKMask4 = segment.getEffectSDKMask();
                    if (effectSDKMask4 == null || (resourceId2 = effectSDKMask4.getResourceId()) == null) {
                        resourceId2 = "";
                    }
                    Float fValueOf7 = Float.valueOf(segment.getRotation());
                    String maskType = segment.getMaskType();
                    if (maskType == null) {
                        maskType = "";
                    }
                    String text = segment.getText();
                    if (text == null) {
                        text = "";
                    }
                    maskParam = new MaskParam(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf7, fValueOf6, text, Float.valueOf(segment.getScaleX()), Float.valueOf(segment.getScaleY()), Boolean.valueOf(invert), fValueOf5, maskType, resourceId2, resourceFile);
                } else {
                    maskParam = new MaskParam(null, null, Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), null, null, null, null, Boolean.FALSE, Float.valueOf(0.0f), "none", "", "");
                }
                if (!a0.LJJJIL(maskParam.maskType) && !Intrinsics.LJFF(maskParam.maskType, "none")) {
                    if (((Boolean) C285980BIu.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(maskParam.maskType, "text")) {
                        VecNLEMaskSPtr masks3 = nLETrackSlot.getMasks();
                        if (masks3 != null && (nLEMask = (NLEMask) C13LP.LJJJLL(masks3)) != null && (segment2 = nLEMask.getSegment()) != null && (effectSDKMask = segment2.getEffectSDKMask()) != null && (resourceId = effectSDKMask.getResourceId()) != null && (pairLIZJ = C0FGD.LIZJ(resourceId)) != null && (effectLIZIZ = this.LIZ.LIZIZ(pairLIZJ.getFirst(), pairLIZJ.getSecond())) != null) {
                            C0EOF.LIZ.getClass();
                            if (Intrinsics.LJFF(maskParam.maskType, "text")) {
                                AbstractC363520ENa abstractC363520ENaLIZ = C0ENT.LIZ(maskParam);
                                if ((abstractC363520ENaLIZ instanceof C0ENW) && (c0enw = (C0ENW) abstractC363520ENaLIZ) != null) {
                                    C1446130njf.LIZ.getClass();
                                    String strLJIIJ = C1446130njf.LJIIJ(effectLIZIZ, "default_font");
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(maskParam.LIZ);
                                    sbLIZ.append('/');
                                    sbLIZ.append(strLJIIJ);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    NLETextRichContent nLETextRichContentLIZJ = c0enw.LIZJ();
                                    List<String> list = nLETextRichContentLIZJ.fallbackFontPathList;
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        Iterator<String> it2 = list.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            if (it2.next().length() == 0) {
                                                NLETextRichContent.Companion.getClass();
                                                nLETextRichContentLIZJ.setFallbackFontPathList(C0F8B.LIZIZ(""));
                                                break;
                                            }
                                        }
                                    }
                                    C385070F7x c385070F7x = c0enw.LIZJ().richTextData;
                                    if (c385070F7x != null) {
                                        c385070F7x.setFont(new Pair<>("default", strLIZIZ));
                                    }
                                    C385070F7x c385070F7x2 = c0enw.LIZJ().richTextData;
                                    if (c385070F7x2 != null && (labelStr = c385070F7x2.toLabelStr()) != null) {
                                        c0enw.LIZJ().setRichText(labelStr);
                                    }
                                    jsonStr = c0enw.LIZJ().toJsonStr();
                                }
                            }
                            segment2.setText(jsonStr);
                            maskParam = MaskParam.LIZ(maskParam, null, null, null, segment2.getText(), null, null, null, null, 16319);
                        }
                    }
                    if (!a0.LJJJIL(maskParam.maskType)) {
                        String strLIZIZ2 = C051R.LIZIZ(MaskParam.LIZ(maskParam, null, null, null, null, Boolean.FALSE, null, null, null, 15871));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("mask_params_");
                        sbLIZ2.append(maskParam.maskType);
                        nLETrackSlot.setExtra(C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public final void LJIIJJI(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
        VecNLETrackSlotSPtr slots;
        ?? arrayList;
        ?? arrayList2;
        Effect effectLIZIZ;
        Object c098200Yq;
        NLESegmentFilter segment;
        String extra;
        NLESegmentEffect segment2;
        String extra2;
        if (nLETrack.getEnable() && C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.VIDEO && (slots = nLETrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
                if (videoEffects != null) {
                    ArrayList<NLEVideoEffect> arrayList3 = new ArrayList();
                    for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                        NLEVideoEffect nLEVideoEffect2 = nLEVideoEffect;
                        if (nLEVideoEffect2.hasExtra("editor_pro_effect_category") && (extra2 = nLEVideoEffect2.getExtra("editor_pro_effect_category")) != null && !a0.LJJJIL(extra2)) {
                            arrayList3.add(nLEVideoEffect);
                        }
                    }
                    arrayList = new ArrayList();
                    for (NLEVideoEffect nLEVideoEffect3 : arrayList3) {
                        if (nLEVideoEffect3.getSegment() != null && (segment2 = nLEVideoEffect3.getSegment()) != null && segment2.getEffectSDKEffect() != null) {
                            arrayList.add(new Pair(nLEVideoEffect3.getSegment(), nLEVideoEffect3.getSegment().getEffectSDKEffect()));
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
                if (filters != null) {
                    ArrayList<NLEFilter> arrayList4 = new ArrayList();
                    for (NLEFilter nLEFilter : filters) {
                        NLEFilter nLEFilter2 = nLEFilter;
                        if (nLEFilter2.hasExtra("editor_pro_effect_category") && (extra = nLEFilter2.getExtra("editor_pro_effect_category")) != null && !a0.LJJJIL(extra)) {
                            arrayList4.add(nLEFilter);
                        }
                    }
                    arrayList2 = new ArrayList();
                    for (NLEFilter nLEFilter3 : arrayList4) {
                        if (nLEFilter3.getSegment() != null && (segment = nLEFilter3.getSegment()) != null && segment.getEffectSDKFilter() != null) {
                            arrayList2.add(new Pair(nLEFilter3.getSegment(), nLEFilter3.getSegment().getEffectSDKFilter()));
                        }
                    }
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
                ArrayList<Pair> arrayList5 = (ArrayList) C13LP.LJLIL(arrayList2, arrayList);
                if (!arrayList5.isEmpty()) {
                    nLETrackSlot.setExtra("is_editorpro_effect", "1");
                    for (Pair pair : arrayList5) {
                        NLENode nLENode = (NLENode) pair.getFirst();
                        NLEResourceNode nLEResourceNode = (NLEResourceNode) pair.getSecond();
                        Pair<String, String> pairLIZJ = C0FGD.LIZJ(nLEResourceNode.getResourceId());
                        if (pairLIZJ != null && (effectLIZIZ = this.LIZ.LIZIZ(pairLIZJ.getFirst(), pairLIZJ.getSecond())) != null) {
                            C0F4X.LIZ(0, effectLIZIZ, "", "");
                            try {
                                C1227904rF.LIZ.getClass();
                                c098200Yq = C1227904rF.LJI(effectLIZIZ);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            String str = (String) c098200Yq;
                            if (str != null) {
                                nLENode.setExtra("nle_extra_segment_effect_info", str);
                            }
                            nLEResourceNode.setResourceId(effectLIZIZ.getEffectId());
                            videoPublishEditModel.getEditorProModel().getVideoSegmentEffects().add(new EditorProEffectInfo(nLEResourceNode.getResourceId(), nLEResourceNode.getResourceName(), nLEResourceNode.getResourceFile()));
                        }
                    }
                }
            }
        }
    }

    public final void LJIIL(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
        VecNLETrackSlotSPtr sortedSlots;
        VecNLEMattingStroke strokes;
        NLEMattingStroke nLEMattingStroke;
        NLEResourceNode stroke;
        Pair<String, String> pairLIZJ;
        Effect effectLIZIZ;
        NLEAIMatting aIMatting;
        if (nLETrack.getEnable() && C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.VIDEO && (sortedSlots = nLETrack.getSortedSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                NLESegmentAIMatting segment = null;
                if (nLETrackSlot != null && (aIMatting = nLETrackSlot.getAIMatting()) != null) {
                    segment = aIMatting.getSegment();
                }
                NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment);
                if (nLESegmentAIMattingDynamicCast != null && (strokes = nLESegmentAIMattingDynamicCast.getStrokes()) != null && (nLEMattingStroke = (NLEMattingStroke) C13LP.LJJJLZIJ(0, strokes)) != null && (stroke = nLEMattingStroke.getStroke()) != null && (pairLIZJ = C0FGD.LIZJ(stroke.getResourceId())) != null && (effectLIZIZ = this.LIZ.LIZIZ(pairLIZJ.getFirst(), pairLIZJ.getSecond())) != null) {
                    videoPublishEditModel.getEditorProModel().getCutoutStrokeEffects().add(new EditorProEffectInfo(stroke.getResourceId(), stroke.getResourceName(), effectLIZIZ.getUnzipPath()));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam LJIILJJIL(com.bytedance.ies.nle.editor_jni.NLEFilter r18, com.bytedance.ies.nle.editor_jni.NLEModel r19) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363380EMm.LJIILJJIL(com.bytedance.ies.nle.editor_jni.NLEFilter, com.bytedance.ies.nle.editor_jni.NLEModel):com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam LJIILL(com.bytedance.ies.nle.editor_jni.NLEModel r9, com.bytedance.ies.nle.editor_jni.NLETrack r10) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r7 = new com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam
            r7.<init>()
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r10.getSlots()
            r6 = 0
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r6, r0)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            if (r0 == 0) goto L24
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.getMainSegment()
            if (r0 == 0) goto L24
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getResource()
            if (r0 == 0) goto L24
            java.lang.String r0 = r0.getResourceFile()
            if (r0 != 0) goto L26
        L24:
            java.lang.String r0 = ""
        L26:
            r7.setAudioUrl(r0)
            r7.setHasOriginalSound(r6)
            java.lang.String r1 = "AudioTrackType"
            java.lang.String r0 = "DUB"
            r10.setExtra(r1, r0)
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r10.getSlots()
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r0 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) r0
            r1 = 0
            if (r0 == 0) goto L5f
            long r4 = r0.getEndTime()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5f
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r4 = r4 / r0
        L4d:
            com.ss.android.ugc.aweme.audiorecord.Point r3 = new com.ss.android.ugc.aweme.audiorecord.Point
            int r2 = (int) r4
            long r0 = java.lang.System.currentTimeMillis()
            r3.<init>(r6, r2, r0)
            java.util.Stack r0 = r7.getMStack()
            r0.add(r3)
            return r7
        L5f:
            long r4 = r8.LIZJ
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L4d
            long r4 = X.C347840DkM.LIZIZ(r9)
            r8.LIZJ = r4
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363380EMm.LJIILL(com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETrack):com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam");
    }

    public final C0E4W LJIILLIIL(NLEModel nLEModel, NLETrack nLETrack) {
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLEResType resourceType;
        String first;
        String second;
        String second2;
        NLEResourceNode effectSDKFilter;
        VecNLETrackSlotSPtr slots = nLETrack.getSlots();
        NLEStringFloatPair nLEStringFloatPair = null;
        if (slots != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null) {
            NLESegmentFilter nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(mainSegment);
            if (nLESegmentFilterDynamicCast != null && (effectSDKFilter = nLESegmentFilterDynamicCast.getEffectSDKFilter()) != null) {
                resourceType = effectSDKFilter.getResourceType();
            } else {
                resourceType = null;
            }
            if ((resourceType == NLEResType.COMPOSER || resourceType == NLEResType.NONE) && !Intrinsics.LJFF(nLETrack.getExtra("biz_extra_type"), "normal_effect")) {
                if (NLESegmentComposerFilter.dynamicCast((NLENode) mainSegment) != null) {
                    nLETrack.setExtra("FilterTrackType", "COLOR");
                } else {
                    nLETrack.setExtra("FilterTrackType", "COLOR_NO_COMPOSER");
                }
                NLESegmentFilter nLESegmentFilterDynamicCast2 = NLESegmentFilter.dynamicCast(mainSegment);
                if (nLESegmentFilterDynamicCast2 != null) {
                    Pair<String, String> pairLIZJ = C0FGD.LIZJ(nLESegmentFilterDynamicCast2.getEffectSDKFilter().getResourceId());
                    C389400FOo c389400FOo = this.LIZ;
                    if (pairLIZJ != null) {
                        first = pairLIZJ.getFirst();
                        second = pairLIZJ.getSecond();
                    } else {
                        first = null;
                        second = null;
                    }
                    Effect effectLIZIZ = c389400FOo.LIZIZ(first, second);
                    if (effectLIZIZ == null) {
                        LJIJJ(String.valueOf(pairLIZJ));
                        if (nLEModel != null) {
                            nLEModel.removeTrack(nLETrack);
                        }
                        return null;
                    }
                    C0E4W c0e4w = new C0E4W();
                    if (pairLIZJ != null) {
                        second2 = pairLIZJ.getSecond();
                    } else {
                        second2 = null;
                    }
                    c0e4w.LIZ = second2;
                    c0e4w.LIZIZ = effectLIZIZ.getName();
                    c0e4w.LIZJ = effectLIZIZ.getEffectId();
                    c0e4w.LIZLLL = nLESegmentFilterDynamicCast2.getIntensity();
                    NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) mainSegment);
                    if (nLESegmentComposerFilterDynamicCast != null) {
                        c0e4w.LJ = true;
                        Iterator<NLEStringFloatPair> it2 = nLESegmentComposerFilterDynamicCast.getEffectNodeKeyValuePairs().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            NLEStringFloatPair next = it2.next();
                            if (Intrinsics.LJFF(next.getFirst(), "Filter_intensity")) {
                                nLEStringFloatPair = next;
                                break;
                            }
                        }
                        NLEStringFloatPair nLEStringFloatPair2 = nLEStringFloatPair;
                        if (nLEStringFloatPair2 != null) {
                            c0e4w.LIZLLL = nLEStringFloatPair2.getSecond();
                        }
                    }
                    return c0e4w;
                }
            } else {
                C201955140j.LJIIL("UgcTemplateConsumer non filter type res");
                return null;
            }
        }
        return null;
    }

    public static void LJIJ(NLETrack nLETrack, NLEModel nLEModel, List list) {
        NLESegment mainSegment;
        NLEResourceNode resource;
        Long lLJIILIIL;
        for (NLETrackSlot nLETrackSlot : C13LP.LLIIII(nLETrack.getSlots())) {
            if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                String strLJ = C0FGD.LJ(resource.getResourceId());
                if (strLJ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLJ)) != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    SoundEffect soundEffect = new SoundEffect(jLongValue, null, null, 0, 0, false, 0, 0, false, resource.getResourceFile(), 0L, false);
                    resource.setResourceType(NLEResType.SOUND);
                    nLETrackSlot.setExtra("ep_audio_music_id", String.valueOf(jLongValue));
                    list.add(soundEffect);
                } else {
                    C201955140j.LJIIZILJ("UgcTemplateConsumer parse sound effect urs failed");
                    nLETrack.removeSlot(nLETrackSlot);
                }
            }
        }
        if (nLETrack.getSlots().isEmpty()) {
            if (nLEModel != null) {
                nLEModel.removeTrack(nLETrack);
                return;
            }
            return;
        }
        nLETrack.setExtra("AudioTrackType", "SOUND_EFFECT");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00b8, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00fa A[EDGE_INSN: B:121:0x00fa->B:45:0x00fa BREAK  A[LOOP:1: B:30:0x00b8->B:124:0x00b8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.ies.nle.editor_jni.NLETrack r15, com.bytedance.ies.nle.editor_jni.NLEModel r16, java.util.List<com.ss.android.ugc.aweme.effect.EffectPointModel> r17) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363380EMm.LIZLLL(com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLEModel, java.util.List):void");
    }

    public final void LJI(NLETrack nLETrack, NLEModel nLEModel, List<EffectPointModel> list) {
        String resourceId;
        String first;
        String second;
        nLETrack.setExtra("EffectTrackType", "VIDEO_ANIM");
        List list2 = (List) ((LinkedHashMap) this.LIZ.LIZLLL).get("editingeffect");
        for (NLETrackSlot nLETrackSlot : C13LP.LLIIII(nLETrack.getSortedSlots())) {
            EffectPointModel effectPointModel = new EffectPointModel();
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null) {
                nLETrackSlot.setExtra("extra_video_effect_source", "2");
                NLEResourceNode resource = mainSegment.getResource();
                if (resource != null && (resourceId = resource.getResourceId()) != null) {
                    Pair<String, String> pairLIZJ = C0FGD.LIZJ(resourceId);
                    C389400FOo c389400FOo = this.LIZ;
                    Object obj = null;
                    if (pairLIZJ != null) {
                        first = pairLIZJ.getFirst();
                        second = pairLIZJ.getSecond();
                    } else {
                        first = null;
                        second = null;
                    }
                    Effect effectLIZIZ = c389400FOo.LIZIZ(first, second);
                    if (effectLIZIZ != null) {
                        mainSegment.getResource().setResourceId(effectLIZIZ.getEffect_id());
                        effectPointModel.setType(1);
                        if (list2 != null) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                Iterator<Effect> it3 = ((CategoryEffectModel) next).getEffects().iterator();
                                int i = 0;
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    if (Intrinsics.LJFF(it3.next().getEffectId(), effectLIZIZ.getEffectId())) {
                                        if (i >= 0) {
                                            effectPointModel.setSelectedColor(C0F4X.LIZIZ(i));
                                            obj = next;
                                            break;
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                            }
                            CategoryEffectModel categoryEffectModel = (CategoryEffectModel) obj;
                            if (categoryEffectModel != null) {
                                effectPointModel.setCategory(categoryEffectModel.getCategoryKey());
                                mainSegment.setExtra("nleExtraEffectCategory", effectPointModel.getCategory());
                                long startTime = nLETrackSlot.getStartTime();
                                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                                effectPointModel.setStartPoint((int) (startTime / j));
                                effectPointModel.setEndPoint((int) (nLETrackSlot.getEndTime() / j));
                                effectPointModel.setUiStartPoint(effectPointModel.getStartPoint());
                                effectPointModel.setUiEndPoint(effectPointModel.getEndPoint());
                                effectPointModel.setUuid(nLETrackSlot.getUUID());
                                effectPointModel.setKey(effectLIZIZ.getEffectId());
                                effectPointModel.setName(effectLIZIZ.getName());
                                effectPointModel.setIsVideoAnim(true);
                                list.add(effectPointModel);
                            }
                        }
                        C201955140j.LJIIZILJ("UgcTemplateConsumer not found effect in effect list");
                        if (!LJ(nLETrackSlot)) {
                            nLETrack.removeSlot(nLETrackSlot);
                        }
                    } else {
                        LJIJJ(String.valueOf(pairLIZJ));
                        if (!LJ(nLETrackSlot)) {
                            nLETrack.removeSlot(nLETrackSlot);
                        }
                    }
                }
            }
        }
        VecNLETrackSlotSPtr slots = nLETrack.getSlots();
        if (slots == null || slots.isEmpty()) {
            nLEModel.removeTrack(nLETrack);
        }
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, StickerItemModel stickerItemModel, TextStickerData textStickerData, C0E4T c0e4t) {
        List<StickerItemModel> list;
        List<StickerItemModel> list2;
        stickerItemModel.extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData);
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        if (infoStickerModel != null && (list2 = infoStickerModel.stickers) != null) {
            list2.add(stickerItemModel);
        }
        if (c0e4t != null && (list = c0e4t.LJFF) != null) {
            list.add(stickerItemModel);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x003e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12, com.bytedance.ies.nle.editor_jni.NLETrack r13, com.bytedance.ies.nle.editor_jni.NLEModel r14, X.C0E4T r15) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363380EMm.LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLEModel, X.0E4T):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0531  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(android.content.Context r142, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r143, com.bytedance.ies.nle.editor_jni.NLETrack r144, com.bytedance.ies.nle.editor_jni.NLEModel r145, X.C0E4T r146) {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363380EMm.LJIILIIL(android.content.Context, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLEModel, X.0E4T):void");
    }
}
