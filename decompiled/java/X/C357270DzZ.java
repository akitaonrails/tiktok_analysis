package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEInteractivePenParam;
import com.bytedance.ies.nle.editor_jni.NLEInteractivePenType;
import com.bytedance.ies.nle.editor_jni.NLEMattingBlendMode;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.components.base.api.IStickerPreviewService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357270DzZ extends C360050E9r implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C19A3 LLIZLLLIL;
    public final C1DRG LLJ;
    public final C1664740tQG LLJI;
    public final C372830EjZ LLJIJIL;
    public final C1664740tQG LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public final Keva LLJILLL;
    public final C1664750tQH LLJJ;
    public final C01GW LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public NLEModel LLJJIJIIJIL;
    public NLEModel LLJJIJIL;
    public String LLJJJ;
    public final C1664750tQH LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public long LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C357270DzZ.class, "surfacePreviewApi", "getSurfacePreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C357270DzZ.class, "epInitLegacyApi", "getEpInitLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C357270DzZ.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C357270DzZ.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C357270DzZ.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.C360050E9r
    public final void LJ() {
        NLEAIMatting nLEAIMattingDynamicCast;
        ArrayList arrayList;
        InterfaceC372990Ejp stickerPreviewApi;
        super.LJ();
        C0E48 c0e48 = this.LLILLJJLI;
        if (c0e48 != null) {
            C350870DpF.LIZ(c0e48, true);
            NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
            if (nLETrackSlotLLLLLLIL != null) {
                nLETrackSlotLLLLLLIL.getStartTime();
            }
            NLETrackSlot nLETrackSlotLLLLLLIL2 = c0e48.LLLLLLIL();
            if (nLETrackSlotLLLLLLIL2 != null) {
                nLETrackSlotLLLLLLIL2.getSlotRealStartTime();
            }
            this.LLJJL = c0e48.getPlayer().Jh() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            NLETrack nLETrackPt = c0e48.Pt();
            this.LLJJJJLIIL = nLETrackPt != null && nLETrackPt.getMainTrack();
            this.LLJJIII = c0e48.LLFII().LJI().getBranch().getHead().getUUID();
            NLEModel model = c0e48.LLFII().LJI().getModel();
            this.LLJJIJIIJIL = NLEModel.dynamicCast(model != null ? model.deepClone() : null);
            NLETrackSlot nLETrackSlotLLLLLLIL3 = c0e48.LLLLLLIL();
            this.LLJJJ = nLETrackSlotLLLLLLIL3 != null ? nLETrackSlotLLLLLLIL3.getUUID() : null;
            NLETrackSlot nLETrackSlotLLLLLLIL4 = c0e48.LLLLLLIL();
            if (nLETrackSlotLLLLLLIL4 != null) {
                nLETrackSlotLLLLLLIL4.getExtra("ep_chroma_key_color");
            }
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("1 saveCommitAndSelectedSlotBeforeEnter selected slot uuid slotUUID = ");
            sbLIZ.append(this.LLJJJ);
            sbLIZ.append(" commitIdBeforeEnter = ");
            sbLIZ.append(this.LLJJIII);
            C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
        }
        C0E48 c0e482 = this.LLILLJJLI;
        if (c0e482 != null) {
            NLETrack nLETrack = new NLETrack();
            nLETrack.setMainTrack(true);
            NLETrackSlot nLETrackSlotLLLLLLIL5 = c0e482.LLLLLLIL();
            if (nLETrackSlotLLLLLLIL5 != null) {
                if (nLETrackSlotLLLLLLIL5.getAIMatting() != null) {
                    nLEAIMattingDynamicCast = NLEAIMatting.dynamicCast(nLETrackSlotLLLLLLIL5.getAIMatting().deepClone(false));
                    nLEAIMattingDynamicCast.getSegment().setNeedRunningMattingTask(true);
                    NLESegmentAIMatting segment = nLEAIMattingDynamicCast.getSegment();
                    NLEMattingBlendMode nLEMattingBlendMode = NLEMattingBlendMode.NLEMattingBlendModePreview;
                    segment.setBlendMode(nLEMattingBlendMode);
                    NLESegmentAIMatting segment2 = nLEAIMattingDynamicCast.getSegment();
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a06, (Context) this.LLJJI.getValue());
                    segment2.setBlendColor(numLIZJ != null ? numLIZJ.intValue() : -1);
                    if (C351220Dpo.LJLZ(nLETrackSlotLLLLLLIL5)) {
                        nLEAIMattingDynamicCast.getSegment().setBlendMode(NLEMattingBlendMode.NLEMattingBlendModeNormal);
                        nLEAIMattingDynamicCast.getSegment().setBlendColor(0);
                    } else {
                        nLEAIMattingDynamicCast.getSegment().setBlendMode(nLEMattingBlendMode);
                        NLESegmentAIMatting segment3 = nLEAIMattingDynamicCast.getSegment();
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a06, (Context) this.LLJJI.getValue());
                        segment3.setBlendColor(numLIZJ2 != null ? numLIZJ2.intValue() : -1);
                    }
                } else {
                    nLEAIMattingDynamicCast = null;
                }
                VecNLEChromaChannelSPtr chromaChannels = nLETrackSlotLLLLLLIL5.getChromaChannels();
                if (chromaChannels != null) {
                    arrayList = new ArrayList();
                    Iterator<NLEChromaChannel> it2 = chromaChannels.iterator();
                    while (it2.hasNext()) {
                        NLEChromaChannel nLEChromaChannelDynamicCast = NLEChromaChannel.dynamicCast(it2.next().deepClone(false));
                        if (nLEChromaChannelDynamicCast != null) {
                            arrayList.add(nLEChromaChannelDynamicCast);
                        }
                    }
                } else {
                    arrayList = null;
                }
                this.LLJJJJ = nLETrackSlotLLLLLLIL5.getAIMatting() != null;
                this.LLJJJJJIL = C351220Dpo.LLIZLLLIL(nLETrackSlotLLLLLLIL5);
                this.LLJJLIIIJLLLLLLLZ = nLETrackSlotLLLLLLIL5.hasExtra("slot_extra_has_shown_cutout_main_menu_tips");
                this.LLJL = nLETrackSlotLLLLLLIL5.hasExtra("slot_extra_has_shown_stroke_tips");
                this.LLJLL = nLETrackSlotLLLLLLIL5.hasExtra("slot_extra_customize_from_editor_tab") && Boolean.parseBoolean(nLETrackSlotLLLLLLIL5.getExtra("slot_extra_customize_from_editor_tab"));
                NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLLLLLIL5.deepClone(false));
                C350870DpF.LJI(c0e482).clearTrack();
                if (nLETrackSlotDynamicCast != null) {
                    nLETrackSlotDynamicCast.clearKeyframe();
                    nLETrackSlotDynamicCast.clearKeyframeValue();
                    nLETrackSlotDynamicCast.clearSwingKeyframe();
                    nLETrackSlotDynamicCast.clearFilter();
                    nLETrackSlotDynamicCast.clearVideoAnim();
                    nLETrackSlotDynamicCast.clearMask();
                    NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast.getMainSegment()).setAlpha(1.0f);
                    VecNLEVideoEffectSPtr videoEffects = nLETrackSlotDynamicCast.getVideoEffects();
                    ArrayList arrayList2 = new ArrayList();
                    for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                        if (!Intrinsics.LJFF(nLEVideoEffect.getExtra("is_from_ep_magic"), "true")) {
                            arrayList2.add(nLEVideoEffect);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        nLETrackSlotDynamicCast.removeVideoEffect((NLEVideoEffect) it3.next());
                    }
                    C351220Dpo.LLLLLIL(nLETrackSlotDynamicCast);
                    nLETrackSlotDynamicCast.clearTransientExtra();
                    nLETrackSlotDynamicCast.clearNoiceReduction();
                    nLETrackSlotDynamicCast.setScale(1.0f);
                    nLETrackSlotDynamicCast.setTransformY(0.0f);
                    nLETrackSlotDynamicCast.setTransformX(0.0f);
                    nLETrackSlotDynamicCast.setMirror_X(false);
                    nLETrackSlotDynamicCast.setRotation(0.0f);
                    nLETrackSlotDynamicCast.removeExtraWithKey("ep_crop_scale");
                    nLETrackSlotDynamicCast.removeExtraWithKey("ep_crop_transX");
                    nLETrackSlotDynamicCast.removeExtraWithKey("ep_crop_transY");
                    nLETrackSlotDynamicCast.removeExtraWithKey("ep_crop_degree");
                    nLETrackSlotDynamicCast.removeExtraWithKey("ep_crop_ratio");
                    nLETrackSlotDynamicCast.removeExtraWithKey("ep_crop_mode");
                    nLETrackSlotDynamicCast.removeExtraWithKey("crop_matrix");
                    nLETrackSlotDynamicCast.removeExtraWithKey("crop_slider_rotation");
                    nLETrackSlotDynamicCast.removeExtraWithKey("crop_button_rotation");
                    nLETrackSlotDynamicCast.removeExtraWithKey("crop_is_photo_cropped");
                    nLETrackSlotDynamicCast.removeExtraWithKey("crop_mirror_x");
                    nLETrackSlotDynamicCast.clearChromaChannel();
                    nLETrackSlotDynamicCast.setStartTime(0L);
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null) {
                        nLETrackSlotDynamicCast.setEndTime(nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart());
                        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
                        nLEStyCanvas.setColor(-16777216L);
                        nLEStyCanvas.setType(NLECanvasType.COLOR);
                        nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
                        nLESegmentVideoDynamicCast.setCrop(null);
                        nLESegmentVideoDynamicCast.setClip(null);
                        nLESegmentVideoDynamicCast.getAVFile().getWidth();
                        nLESegmentVideoDynamicCast.getAVFile().getHeight();
                        nLESegmentVideoDynamicCast.setSpeed(1.0f);
                        nLESegmentVideoDynamicCast.clearCurveSpeedPoint();
                        nLESegmentVideoDynamicCast.clearSegCurveSpeedPoint();
                    }
                    nLETrackSlotDynamicCast.setAIMatting(nLEAIMattingDynamicCast);
                    if (arrayList != null) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            nLETrackSlotDynamicCast.addChromaChannel((NLEChromaChannel) it4.next());
                        }
                    }
                    nLETrack.addSlot(nLETrackSlotDynamicCast);
                }
                IStickerPreviewService iStickerPreviewServiceLIZIZ = C357280Dza.LIZIZ();
                if (iStickerPreviewServiceLIZIZ != null && (stickerPreviewApi = iStickerPreviewServiceLIZIZ.getStickerPreviewApi()) != null) {
                    stickerPreviewApi.setVisibility(4);
                }
                C350870DpF.LJI(c0e482).addTrack(nLETrack);
                this.LLILZLL = C350870DpF.LJI(c0e482);
                C0E48 c0e483 = this.LLILLJJLI;
                if (c0e483 != null) {
                    C0E55 player = c0e483.getPlayer();
                    if (player != null) {
                        player.skipNextSeek(true);
                    }
                    C350410DoV.LIZ(c0e483.LLFII().LJI(), true, false);
                    this.LLJJIJI = c0e483.LLFII().LJI().getBranch().getHead().getUUID();
                    NLEModel model2 = c0e483.LLFII().LJI().getModel();
                    this.LLJJIJIL = NLEModel.dynamicCast(model2 != null ? model2.deepClone() : null);
                    C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("storeCommitIdAfterEnter uuid ");
                    sbLIZ2.append(this.LLJJIJI);
                    C201955140j.LIZLLL(c563650M8t2, "shiwei", C2188811AlT.LIZIZ(sbLIZ2));
                    C0E48 c0e484 = this.LLILLJJLI;
                    if (c0e484 != null) {
                        c0e484.S7().LIZIZ(new C358740E4q(null, 0, null, false, 0, 248), "select_slot_event", false);
                    }
                }
            }
        }
    }

    public final boolean LJIIIIZZ() {
        C0E48 c0e48 = this.LLILLJJLI;
        return c0e48 != null && c0e48.Bo().LIZ() && LJIILIIL();
    }

    public final VideoPublishEditModel LJIIJ() {
        C0EHJ c0ehj;
        C0EHI value = ((C0EY2) this.LLJJ.getValue(this, LLJLLIL[3])).zu2().getValue();
        if (value == null || (c0ehj = value.LIZ) == null) {
            return null;
        }
        return c0ehj.LIZ;
    }

    public final NLETrackSlot LJIIJJI() {
        C0E48 c0e48 = this.LLILLJJLI;
        if (c0e48 != null) {
            return C346680DiU.LIZ(C350870DpF.LJI(c0e48), this.LLJJJ);
        }
        return null;
    }

    public final InterfaceC361710EGb LJIIL() {
        return (InterfaceC361710EGb) this.LLJI.getValue(this, LLJLLIL[0]);
    }

    public final boolean LJIILIIL() {
        C0E48 c0e48 = this.LLILLJJLI;
        return (c0e48 == null || this.LLJJIJI == null || Intrinsics.LJFF(c0e48.LLFII().LJI().getBranch().getHead().getUUID(), this.LLJJIJI)) ? false : true;
    }

    public final void LJIILL() {
        NLEBranch branch;
        NLECommit head;
        String uuid;
        InterfaceC360800ECo interfaceC360800ECo;
        if (!this.LLJLILLLLZIIL || (branch = C350870DpF.LJFF(this.LLILLJJLI).getBranch()) == null || (head = branch.getHead()) == null || (uuid = head.getUUID()) == null || (interfaceC360800ECo = (InterfaceC360800ECo) this.LLJILJILJ.getValue(this, LLJLLIL[2])) == null) {
            return;
        }
        interfaceC360800ECo.Wh1(uuid, true);
    }

    public final void LJIIZILJ() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        this.LLILLJJLI.getPlayer().LJIIZILJ(false);
        this.LLILLJJLI.Bo().LIZIZ(false);
        if (!LJIIIIZZ() && this.LLJLIL && (nLETrackSlotLJIIJJI = LJIIJJI()) != null) {
            this.LLILLJJLI.LLFII().LJZL(nLETrackSlotLJIIJJI, EnumC356070Dxd.COMMIT, null);
        }
        this.LLILLJJLI.getPlayer().LJIIZILJ(true);
        this.LLILLJJLI.getPlayer().LJIIJ(this.LLILLJJLI.LLFII().LLZ(), false, null);
    }

    public final C0EI5 LJIIIZ() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        Pair<String, EnumC356150Dxl> pairLJJII;
        EnumC356150Dxl second;
        NLEAIMatting aIMatting;
        NLESegmentAIMatting nLESegmentAIMattingDynamicCast;
        NLEInteractivePenParam penParam;
        Integer numValueOf;
        NLETrackSlot nLETrackSlotLJIIJJI = LJIIJJI();
        boolean z = false;
        if (nLETrackSlotLJIIJJI != null) {
            if (C351220Dpo.LJLZ(nLETrackSlotLJIIJJI)) {
                return C0EI5.AUTO_CUTOUT;
            }
            if (C351220Dpo.LJZL(nLETrackSlotLJIIJJI)) {
                z = true;
            }
        }
        if (z && (aIMatting = nLETrackSlotLJIIJJI.getAIMatting()) != null && (nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(aIMatting.getSegment())) != null && (penParam = nLESegmentAIMattingDynamicCast.getPenParam()) != null && (numValueOf = Integer.valueOf(penParam.getPenType())) != null) {
            return numValueOf.intValue() == NLEInteractivePenType.NLE_MATTING_INTERACTIVE_PEN_TYPE_FAST.swigValue() ? C0EI5.QUICK_BRUSH : numValueOf.intValue() == NLEInteractivePenType.NLE_MATTING_INTERACTIVE_PEN_TYPE_GENERAL.swigValue() ? C0EI5.BRUSH : numValueOf.intValue() == NLEInteractivePenType.NLE_MATTING_INTERACTIVE_PEN_TYPE_ERASER.swigValue() ? C0EI5.ERASER : C0EI5.QUICK_BRUSH;
        }
        C0E48 c0e48 = this.LLILLJJLI;
        if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null && (pairLJJII = interfaceC351350Dq1LLFII.LJJII()) != null && (second = pairLJJII.getSecond()) != null) {
            int i = C356260Dxw.LIZ[second.ordinal()];
            if (i == 1) {
                return C0EI5.ERASER;
            }
            if (i == 2) {
                return C0EI5.BRUSH;
            }
            if (i == 3) {
                return C0EI5.QUICK_BRUSH;
            }
        }
        return C0EI5.AUTO_CUTOUT;
    }

    public final boolean LJIILJJIL() {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        VideoPublishEditModel videoPublishEditModelLJIIJ = LJIIJ();
        Boolean boolValueOf = Boolean.valueOf((videoPublishEditModelLJIIJ == null || (creativeModel = videoPublishEditModelLJIIJ.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) ? false : true);
        int iIntValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_CUTOUT_STROKE, 0)).intValue();
        if (boolValueOf == null) {
            if ((iIntValue & 1) == 0 && ((iIntValue & 2) >> 1) == 0) {
                return false;
            }
        } else if (boolValueOf.booleanValue()) {
            if ((iIntValue & 1) == 0) {
                return false;
            }
        } else if (((iIntValue & 2) >> 1) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJ;
    }

    public final void LJIILLIIL(boolean z) {
        String str;
        NLEModel nLEModel;
        NLECommit head;
        InterfaceC372990Ejp stickerPreviewApi;
        C0EC7 c0ec7;
        NLETrack trackBySlot;
        if (z) {
            str = this.LLJJIII;
            nLEModel = this.LLJJIJIIJIL;
        } else {
            str = this.LLJJIJI;
            nLEModel = this.LLJJIJIL;
        }
        C0E48 c0e48 = this.LLILLJJLI;
        if (c0e48 != null) {
            String uuid = c0e48.LLFII().LJI().getBranch().getHead().getUUID();
            if (C123100dR.LIZ(str)) {
                String uuid2 = null;
                if (z) {
                    C354090DuR.LIZ.clear();
                    String strLJII = LJII(nLEModel, str);
                    c0e48.LLFII().LJI().trim(0L, 500L);
                    NLETrackSlot nLETrackSlotLJIIJJI = LJIIJJI();
                    if (nLETrackSlotLJIIJJI != null && (trackBySlot = C350870DpF.LJI(c0e48).getTrackBySlot(nLETrackSlotLJIIJJI)) != null && trackBySlot.getMainTrack()) {
                        nLETrackSlotLJIIJJI.setExtra("slot_extra_customize_from_editor_tab", String.valueOf(this.LLJLL));
                    }
                    if (LJIIL() != null && (c0ec7 = (C0EC7) this.LLJILJIL.getValue(this, LLJLLIL[1])) != null) {
                        c0ec7.xJ2();
                    }
                    IStickerPreviewService iStickerPreviewServiceLIZIZ = C357280Dza.LIZIZ();
                    if (iStickerPreviewServiceLIZIZ != null && (stickerPreviewApi = iStickerPreviewServiceLIZIZ.getStickerPreviewApi()) != null) {
                        stickerPreviewApi.setVisibility(0);
                    }
                    C0E48 c0e482 = this.LLILLJJLI;
                    if (c0e482 != null) {
                        c0e482.S7().LIZIZ(new C0E2C(0.0f, this.LL, false), "panel_bounce_event", false);
                    }
                    if (!Intrinsics.LJFF(strLJII, str)) {
                        this.LLJLILLLLZIIL = true;
                    }
                    C563650M8t c563650M8t = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("restoreNLEData, beforeEnter, trim ");
                    sbLIZ.append(str);
                    sbLIZ.append(", curHead: ");
                    sbLIZ.append(uuid);
                    C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
                } else if (!Intrinsics.LJFF(LJII(nLEModel, str), str)) {
                    NLEBranch branch = c0e48.LLFII().LJI().getBranch();
                    if (branch != null && (head = branch.getHead()) != null) {
                        uuid2 = head.getUUID();
                    }
                    this.LLJJIJI = uuid2;
                    this.LLJLILLLLZIIL = true;
                }
                C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("restoreNLEData, after enter go to commit id: ");
                sbLIZ2.append(str);
                C201955140j.LIZLLL(c563650M8t2, "shiwei", C2188811AlT.LIZIZ(sbLIZ2));
                C1664750tQH c1664750tQH = this.LLJJJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
                ((C0E5S) c1664750tQH.getValue(this, interfaceC2217461BqaArr[4])).QD2(true, false);
                ((C0E5S) this.LLJJJIL.getValue(this, interfaceC2217461BqaArr[4])).I61(C350870DpF.LJI(c0e48), false, true);
            }
        }
    }

    public final String LJII(NLEModel nLEModel, String str) {
        NLECommit head;
        String uuid;
        NLEEditor nLEEditorLJFF = C350870DpF.LJFF(this.LLILLJJLI);
        if (!nLEEditorLJFF.goTo(str)) {
            nLEEditorLJFF.setModel(nLEModel);
            nLEEditorLJFF.done();
            nLEEditorLJFF.trim(0L, 500L);
            NLEBranch branch = nLEEditorLJFF.getBranch();
            if (branch != null && (head = branch.getHead()) != null && (uuid = head.getUUID()) != null) {
                return uuid;
            }
        }
        return str;
    }

    public C357270DzZ(C19A3 c19a3, C1DRG c1drg, C0E48 c0e48) {
        C372830EjZ c372830EjZ;
        C372480Ej0 c372480Ej0;
        C0EGE c0ege;
        super(c0e48, "customize_cutout_panel");
        this.LLIZLLLIL = c19a3;
        this.LLJ = c1drg;
        this.LLILZIL.LJIIIIZZ = 150L;
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC361710EGb.class, null);
        if ((c19a3 instanceof C372480Ej0) && (c372480Ej0 = (C372480Ej0) c19a3) != null && (c0ege = c372480Ej0.LLLILZ) != null) {
            c372830EjZ = c0ege.LJIIJ;
        } else {
            c372830EjZ = null;
        }
        this.LLJIJIL = c372830EjZ;
        this.LLJILJIL = C1664770tQJ.LIZIZ(c1drg, C0EC7.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC360800ECo.class, null);
        this.LLJILLL = Keva.getRepo("ep_custom_cutout");
        this.LLJJ = C1664770tQJ.LIZ(c1drg, C0EY2.class, null);
        this.LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1280));
        this.LLJJJIL = C1664770tQJ.LIZ(c1drg, C0E5S.class, null);
    }
}
