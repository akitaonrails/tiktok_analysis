package X;

import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoMemoryState;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEPreviewMusicParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450370nqV extends AbstractC2255721DQs<C0MFO> implements C0MFO, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 607));
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450440nqc.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), C12SF.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public boolean LLILZLL;
    public float LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1450370nqV.class, "editCanvasApi", "getEditCanvasApi()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/EditCanvasApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1450370nqV.class, "voiceComponentLazy", "getVoiceComponentLazy()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1450370nqV.class, "editVolumeV2ApiLazy", "getEditVolumeV2ApiLazy()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJ = 8;
    }

    public C0MFO W2() {
        return this;
    }

    private final InterfaceC1418580n1E E3() {
        return (InterfaceC1418580n1E) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue();
    }

    private final InterfaceC1450440nqc m3() {
        return (InterfaceC1450440nqc) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    private final C12SF z4() {
        return (C12SF) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    private final InterfaceC1418580n1E B3() {
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            return null;
        }
        return (InterfaceC1418580n1E) getDiContainer().LJIIL(null, InterfaceC1418580n1E.class);
    }

    private final InterfaceC391240FVq H3() {
        C385670FAf<InterfaceC391240FVq> c385670FAfNr0;
        InterfaceC1455850nzL interfaceC1455850nzLV3 = v3();
        if (interfaceC1455850nzLV3 == null || (c385670FAfNr0 = interfaceC1455850nzLV3.Nr0()) == null) {
            return null;
        }
        return c385670FAfNr0.LIZJ();
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) getDiContainer().LJII(InterfaceC1446740nke.class, null);
    }

    private final InterfaceC1461650o8h O3() {
        C385670FAf<InterfaceC1461650o8h> c385670FAfIz2;
        InterfaceC1455850nzL interfaceC1455850nzLV3 = v3();
        if (interfaceC1455850nzLV3 == null || (c385670FAfIz2 = interfaceC1455850nzLV3.Iz2()) == null) {
            return null;
        }
        return c385670FAfIz2.LIZJ();
    }

    private final LivePhotoPreviewMode X1() {
        LivePhotoPreviewMode livePhotoPreviewMode = LJJJLIIL().getLivePhotoPreviewMode();
        if (livePhotoPreviewMode == null) {
            return null;
        }
        int i = C1413290msh.LIZ[livePhotoPreviewMode.ordinal()];
        if (i == 1) {
            return LivePhotoPreviewMode.LOOP;
        }
        if (i == 2) {
            return LivePhotoPreviewMode.STATIC;
        }
        if (i == 3) {
            return LivePhotoPreviewMode.LIVE_PHOTO;
        }
        return null;
    }

    private final InterfaceC559500Lwy c3() {
        return (InterfaceC559500Lwy) getDiContainer().LJIIL(null, InterfaceC559500Lwy.class);
    }

    private final C0FVT e4() {
        C385670FAf<InterfaceC1461660o8i> c385670FAfAT;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ;
        InterfaceC1455850nzL interfaceC1455850nzLV3 = v3();
        if (interfaceC1455850nzLV3 == null || (c385670FAfAT = interfaceC1455850nzLV3.AT()) == null || (interfaceC1461660o8iLIZJ = c385670FAfAT.LIZJ()) == null) {
            return null;
        }
        return interfaceC1461660o8iLIZJ.kR();
    }

    private final C12SF o4() {
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            return null;
        }
        return (C12SF) getDiContainer().LJIIL(null, C12SF.class);
    }

    private final InterfaceC1457250o1b q3() {
        return (InterfaceC1457250o1b) getDiContainer().LJIIL(null, InterfaceC1457250o1b.class);
    }

    private final InterfaceC1455850nzL v3() {
        return (InterfaceC1455850nzL) getDiContainer().LJIIL(null, InterfaceC1455850nzL.class);
    }

    public final void K4() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null) {
            return;
        }
        CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
        NLEModel model = nLEEditor.getModel();
        if (model != null && (mainTrack = model.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = slots.get(0)) != null) {
            canvasFilterParam.setDegree(-nLETrackSlot.getRotation());
            canvasFilterParam.setScaleFactor(nLETrackSlot.getScale());
        }
        InterfaceC1450440nqc interfaceC1450440nqcM3 = m3();
        if (interfaceC1450440nqcM3 != null) {
            interfaceC1450440nqcM3.cN(canvasFilterParam);
        }
    }

    @Override // X.C0MFO
    public LivePhotoPreviewMode LB1() {
        LivePhotoMemoryState livePhotoMemoryState;
        LivePhotoPreviewMode livePhotoPreviewModeX1 = X1();
        if (livePhotoPreviewModeX1 == null) {
            C201955140j.LJIJJ(C1450470nqf.LIZIZ, "LivePhotoEditComponent", "switch to null previewMode");
            return null;
        }
        LivePhotoPreviewMode livePhotoPreviewMode = LJJJLIIL().getLivePhotoPreviewMode();
        LivePhotoPreviewMode livePhotoPreviewMode2 = LivePhotoPreviewMode.STATIC;
        if (livePhotoPreviewMode != livePhotoPreviewMode2) {
            AudioRecorderParam veAudioRecorderParam = LJJJLIIL().getVeAudioRecorderParam();
            this.LLILZLL = veAudioRecorderParam != null ? veAudioRecorderParam.getNeedOriginalSound() : true;
            AudioRecorderParam veAudioRecorderParam2 = LJJJLIIL().getVeAudioRecorderParam();
            this.LLIZ = veAudioRecorderParam2 != null ? veAudioRecorderParam2.getVoiceVolume() : 0.0f;
        }
        int i = C1413290msh.LIZ[livePhotoPreviewModeX1.ordinal()];
        if (i == 1) {
            AudioRecorderParam veAudioRecorderParam3 = LJJJLIIL().getVeAudioRecorderParam();
            if (veAudioRecorderParam3 != null) {
                veAudioRecorderParam3.setHasOriginalSound(true);
            }
            AudioRecorderParam veAudioRecorderParam4 = LJJJLIIL().getVeAudioRecorderParam();
            if (veAudioRecorderParam4 != null) {
                veAudioRecorderParam4.setVoiceVolume(this.LLIZ);
            }
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                InterfaceC1418580n1E interfaceC1418580n1EE3 = E3();
                if (interfaceC1418580n1EE3 != null) {
                    interfaceC1418580n1EE3.Hr1(this.LLILZLL, false, true);
                }
            } else {
                InterfaceC1418580n1E interfaceC1418580n1EB3 = B3();
                if (interfaceC1418580n1EB3 != null) {
                    interfaceC1418580n1EB3.Hr1(this.LLILZLL, false, true);
                }
            }
        } else if (i == 3) {
            AudioRecorderParam veAudioRecorderParam5 = LJJJLIIL().getVeAudioRecorderParam();
            if (veAudioRecorderParam5 != null) {
                veAudioRecorderParam5.setHasOriginalSound(false);
            }
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                InterfaceC1418580n1E interfaceC1418580n1EE32 = E3();
                if (interfaceC1418580n1EE32 != null) {
                    interfaceC1418580n1EE32.Hr1(false, false, true);
                }
            } else {
                InterfaceC1418580n1E interfaceC1418580n1EB32 = B3();
                if (interfaceC1418580n1EB32 != null) {
                    interfaceC1418580n1EB32.Hr1(false, false, true);
                }
            }
        }
        InterfaceC1450440nqc interfaceC1450440nqcM3 = m3();
        if (interfaceC1450440nqcM3 != null) {
            interfaceC1450440nqcM3.Sl(livePhotoPreviewModeX1 == livePhotoPreviewMode2);
        }
        C1450470nqf c1450470nqf = C1450470nqf.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switch to ");
        sbLIZ.append(livePhotoPreviewModeX1);
        sbLIZ.append(", hasOriginalSound: ");
        AudioRecorderParam veAudioRecorderParam6 = LJJJLIIL().getVeAudioRecorderParam();
        sbLIZ.append(veAudioRecorderParam6 != null ? Boolean.valueOf(veAudioRecorderParam6.getHasOriginalSound()) : null);
        sbLIZ.append(", needOriginalSound: ");
        AudioRecorderParam veAudioRecorderParam7 = LJJJLIIL().getVeAudioRecorderParam();
        sbLIZ.append(veAudioRecorderParam7 != null ? Boolean.valueOf(veAudioRecorderParam7.getNeedOriginalSound()) : null);
        sbLIZ.append(", voiceVolume: ");
        AudioRecorderParam veAudioRecorderParam8 = LJJJLIIL().getVeAudioRecorderParam();
        sbLIZ.append(veAudioRecorderParam8 != null ? Float.valueOf(veAudioRecorderParam8.getVoiceVolume()) : null);
        C201955140j.LJIILL(c1450470nqf, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ));
        C570480MZa c570480MZa = C570480MZa.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        LivePhotoPreviewMode livePhotoPreviewMode3 = LJJJLIIL().getLivePhotoPreviewMode();
        if (livePhotoPreviewMode3 == null) {
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        c570480MZa.getClass();
        C570480MZa.LIZIZ(videoPublishEditModelLJJJLIIL, livePhotoPreviewMode3, livePhotoPreviewModeX1);
        LJJJLIIL().setLivePhotoPreviewMode(livePhotoPreviewModeX1);
        C578530MmZ.LIZ.getClass();
        if (C578530MmZ.LIZ()) {
            C523290Kff.LIZ.getClass();
            C523290Kff.LIZ().storeInt("last_used_live_photo_preview_mode", livePhotoPreviewModeX1.ordinal());
        }
        LivePhotoModel livePhotoModel = LJJJLIIL().creativeModel.livePhotoModel;
        if (livePhotoModel != null && (livePhotoMemoryState = livePhotoModel.memoryState) != null) {
            livePhotoMemoryState.switchedInEditor = true;
        }
        wl0(JY0().xI(), false);
        InterfaceC559500Lwy interfaceC559500LwyC3 = c3();
        if (interfaceC559500LwyC3 != null) {
            interfaceC559500LwyC3.Qk(false);
        }
        return livePhotoPreviewModeX1;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        LivePhotoModel livePhotoModel = LJJJLIIL().creativeModel.livePhotoModel;
        if (livePhotoModel != null && livePhotoModel.memoryState == null) {
            livePhotoModel.memoryState = new LivePhotoMemoryState(false, false, false, true);
        }
        LivePhotoPreviewMode livePhotoPreviewMode = LJJJLIIL().getLivePhotoPreviewMode();
        if (!LJJJLIIL().creativeModel.draftInfoModel.isDraft) {
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            AudioRecorderParam veAudioRecorderParam = LJJJLIIL().getVeAudioRecorderParam();
            if (veAudioRecorderParam == null) {
                veAudioRecorderParam = new AudioRecorderParam();
            }
            videoPublishEditModelLJJJLIIL.setVeAudioRecorderParam(veAudioRecorderParam);
            AudioRecorderParam veAudioRecorderParam2 = LJJJLIIL().getVeAudioRecorderParam();
            if (veAudioRecorderParam2 != null) {
                veAudioRecorderParam2.setHasOriginalSound(livePhotoPreviewMode != LivePhotoPreviewMode.STATIC);
                veAudioRecorderParam2.setNeedOriginalSound(((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL());
                if (C12DO.LIZ()) {
                    VideoPublishEditModel videoPublishEditModelLJJJLIIL2 = LJJJLIIL();
                    float voiceVolume = 0.0f;
                    if (veAudioRecorderParam2.getHasOriginalSound() && veAudioRecorderParam2.getNeedOriginalSound()) {
                        voiceVolume = LJJJLIIL().getVoiceVolume() > 0.0f ? LJJJLIIL().getVoiceVolume() : 1.0f;
                    }
                    videoPublishEditModelLJJJLIIL2.setVoiceVolume(voiceVolume);
                }
                veAudioRecorderParam2.setVoiceVolume(LJJJLIIL().getVoiceVolume());
            }
        }
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1450440nqc.class, new AwS388S0200000_22(livePhotoPreviewMode, this, 117));
            return;
        }
        LivePhotoPreviewMode livePhotoPreviewMode2 = LivePhotoPreviewMode.STATIC;
        if (livePhotoPreviewMode == livePhotoPreviewMode2) {
            K4();
        }
        InterfaceC1450440nqc interfaceC1450440nqcM3 = m3();
        if (interfaceC1450440nqcM3 != null) {
            interfaceC1450440nqcM3.Sl(livePhotoPreviewMode == livePhotoPreviewMode2);
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1450370nqV(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final Float F4(NLESegment nLESegment) {
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLESegment);
        if (nLESegmentAudioDynamicCast != null) {
            return Float.valueOf(nLESegmentAudioDynamicCast.getVolume());
        }
        return null;
    }

    private final Long G2(boolean z) {
        LivePhotoModel livePhotoModel;
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        NLETrack mainTrack;
        NLETrackSlot nLETrackSlot;
        float rotation;
        float scale;
        NLEStyCrop nLEStyCropT2;
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordDataLJJIIJZLJL = C1416310mxZ.LJJIIJZLJL(LJJJLIIL());
        NLETimeSpaceNode nLETimeSpaceNodeDynamicCast = null;
        if (multiEditVideoSegmentRecordDataLJJIIJZLJL == null || (livePhotoModel = LJJJLIIL().creativeModel.livePhotoModel) == null || (value = JY0().g().getValue()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null || (mainTrack = model.getMainTrack()) == null) {
            return null;
        }
        long jQ3 = Q3(model);
        long jMax = Math.max(10000L, jQ3);
        livePhotoModel.repeatCount = 1;
        C1450470nqf c1450470nqf = C1450470nqf.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("config: ");
        sbLIZ.append(jQ3);
        sbLIZ.append(", ");
        sbLIZ.append(jMax);
        C201955140j.LIZLLL(c1450470nqf, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ));
        VecNLETrackSlotSPtr slots = mainTrack.getSlots();
        if (slots != null) {
            nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots);
            if (nLETrackSlot != null) {
                nLETimeSpaceNodeDynamicCast = NLETimeSpaceNode.dynamicCast(nLETrackSlot);
            }
        } else {
            nLETrackSlot = null;
        }
        if (z && nLETimeSpaceNodeDynamicCast != null && nLETimeSpaceNodeDynamicCast.hasRotation()) {
            rotation = nLETimeSpaceNodeDynamicCast.getRotation();
        } else {
            rotation = 0.0f;
        }
        if (z && nLETimeSpaceNodeDynamicCast != null && nLETimeSpaceNodeDynamicCast.hasScale()) {
            scale = nLETimeSpaceNodeDynamicCast.getScale();
        } else {
            scale = 1.0f;
        }
        if (nLETrackSlot == null || (nLEStyCropT2 = i3(nLETrackSlot)) == null) {
            nLEStyCropT2 = T2(livePhotoModel);
        }
        C1450430nqb c1450430nqbLIZ = C1450420nqa.LIZ(nLETrackSlot);
        mainTrack.clearSlot();
        mainTrack.addSlot(P4(multiEditVideoSegmentRecordDataLJJIIJZLJL, 0L, ((long) LSPassThroughRecordSizeConfig.DEFAULT) * jMax, nLEStyCropT2, c1450430nqbLIZ, rotation, scale, true));
        mainTrack.setAudioEnable(false);
        K4();
        return Long.valueOf(jMax);
    }

    private final boolean H4(NLETrack nLETrack) {
        if ((nLETrack != null && ((C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "DUB")) || (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "TEXT_SPEAK")))) || C351220Dpo.LLILL(nLETrack) || C351220Dpo.LLLILZLLLI(nLETrack)) {
            return true;
        }
        return false;
    }

    private final long Q3(NLEModel nLEModel) {
        long measuredEndTime;
        long measuredEndTime2;
        NLETimeSpaceNode nLETimeSpaceNode;
        NLETimeSpaceNode nLETimeSpaceNode2;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        if (it2.hasNext()) {
            NLETrack next = it2.next();
            if (C351220Dpo.LLILLJJLI(next) && !C351220Dpo.LLILLL(next) && !C351220Dpo.LLLLIILL(next) && (nLETimeSpaceNode2 = (NLETimeSpaceNode) C13LP.LJJLIIIJL(next.getSlots())) != null) {
                measuredEndTime = nLETimeSpaceNode2.getMeasuredEndTime();
            } else {
                measuredEndTime = 0;
            }
            while (it2.hasNext()) {
                NLETrack next2 = it2.next();
                if (C351220Dpo.LLILLJJLI(next2) && !C351220Dpo.LLILLL(next2) && !C351220Dpo.LLLLIILL(next2) && (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(next2.getSlots())) != null) {
                    measuredEndTime2 = nLETimeSpaceNode.getMeasuredEndTime();
                } else {
                    measuredEndTime2 = 0;
                }
                if (measuredEndTime < measuredEndTime2) {
                    measuredEndTime = measuredEndTime2;
                }
            }
            return measuredEndTime / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        throw new NoSuchElementException();
    }

    private final NLEStyCrop T2(LivePhotoModel livePhotoModel) {
        CropData cropData;
        if (livePhotoModel != null && (cropData = livePhotoModel.cropData) != null) {
            NLEStyCrop nLEStyCrop = new NLEStyCrop();
            nLEStyCrop.setXLeft(cropData.leftTopX);
            nLEStyCrop.setYUpper(cropData.leftTopY);
            nLEStyCrop.setXLeftLower(cropData.leftBottomX);
            nLEStyCrop.setYLeftLower(cropData.leftBottomY);
            nLEStyCrop.setXRightUpper(cropData.rightTopX);
            nLEStyCrop.setYRightUpper(cropData.rightTopY);
            nLEStyCrop.setXRight(cropData.rightBottomX);
            nLEStyCrop.setYLower(cropData.rightBottomY);
            return nLEStyCrop;
        }
        return null;
    }

    private final boolean Z1(String str) {
        C527420KmK c527420KmK = C527420KmK.LIZ;
        CreativeInfo creativeInfo = LJJJLIIL().getCreativeInfo();
        c527420KmK.getClass();
        C0VSJ c0vsj = new C0VSJ(C527420KmK.LIZJ(creativeInfo, str));
        if (c0vsj.exists() && c0vsj.length() > 0) {
            return true;
        }
        c0vsj.delete();
        return false;
    }

    private final NLEStyCrop i3(NLETrackSlot nLETrackSlot) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEStyCrop crop;
        NLENode nLENodeMo130clone;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment)) == null || (crop = nLESegmentVideoDynamicCast.getCrop()) == null || (nLENodeMo130clone = crop.mo130clone()) == null) {
            return null;
        }
        return NLEStyCrop.dynamicCast(nLENodeMo130clone);
    }

    private final void O4(NLETrack nLETrack, long j) {
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
            if (nLETrackSlot.getEndTime() > j || nLETrackSlot.getMeasuredEndTime() > j) {
                arrayList.add(nLETrackSlot);
            }
        }
        if (arrayList.size() > 0) {
            C1450470nqf c1450470nqf = C1450470nqf.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove slots before: ");
            sbLIZ.append(nLETrack);
            C201955140j.LIZLLL(c1450470nqf, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                nLETrack.removeSlot((NLETrackSlot) it2.next());
            }
            C1450470nqf c1450470nqf2 = C1450470nqf.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("remove slots after: ");
            sbLIZ2.append(nLETrack);
            C201955140j.LIZLLL(c1450470nqf2, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o2(long r31, boolean r33) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1450370nqV.o2(long, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa A[LOOP:1: B:50:0x00f8->B:51:0x00fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w2(long r23, int r25) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1450370nqV.w2(long, int):void");
    }

    @Override // X.C0MFO
    public void wl0(VEPreviewMusicParams vEPreviewMusicParams, boolean z) {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        long j;
        long measuredEndTime;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (LJJJLIIL().isCurrentAutoCutMode()) {
            C201955140j.LIZLLL(C1450470nqf.LIZIZ, "LivePhotoEditComponent", "don't process livePhoto in AutoCut");
            return;
        }
        LivePhotoModel livePhotoModel = LJJJLIIL().creativeModel.livePhotoModel;
        if (livePhotoModel == null) {
            return;
        }
        LivePhotoPreviewMode livePhotoPreviewMode = livePhotoModel.previewMode;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null) {
            return;
        }
        if (C123100dR.LIZ(vEPreviewMusicParams.mPath)) {
            j = vEPreviewMusicParams.mShootDuration;
            if (j > 30000) {
                j = 30000;
            }
        } else {
            j = -1;
        }
        C1450470nqf c1450470nqf = C1450470nqf.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleLivePhotoPreviewModeWithMusic ");
        sbLIZ.append(livePhotoPreviewMode);
        sbLIZ.append(' ');
        sbLIZ.append(vEPreviewMusicParams);
        C201955140j.LJIILL(c1450470nqf, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ));
        NLETrack mainTrack = model.getMainTrack();
        if (mainTrack != null) {
            measuredEndTime = mainTrack.getMeasuredEndTime();
        } else {
            measuredEndTime = model.getMeasuredEndTime();
        }
        InterfaceC1452170ntP value2 = JY0().g().getValue();
        if (value2 != null) {
            value2.pause();
        }
        int i = C1413290msh.LIZ[livePhotoPreviewMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    G2(z);
                } else {
                    throw new C1954807lC();
                }
            } else {
                int i2 = livePhotoModel.compileRepeatCount;
                if (i2 > 0 && j > 0) {
                    w2(j, i2);
                } else {
                    o2(j, false);
                }
            }
        } else {
            o2(j, true);
        }
        nLEEditor.setModel(model);
        nLEEditor.commit();
        nLEEditor.done();
        W1(model, measuredEndTime, j);
        InterfaceC1452170ntP value3 = JY0().g().getValue();
        if (value3 != null) {
            nLEEditor.commit();
            nLEEditor.done();
            value3.nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            value3.play();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleLivePhotoPreviewModeWithMusic done: ");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C201955140j.LJIILL(c1450470nqf, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ2));
    }

    private final void W1(NLEModel nLEModel, long j, long j2) {
        long measuredEndTime;
        List<StickerItemModel> listLm;
        InterfaceC1461650o8h interfaceC1461650o8hO3;
        List<TextStickerModel> listSb;
        List<StickerModel> listS32;
        long jMin;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            measuredEndTime = mainTrack.getMeasuredEndTime();
        } else {
            measuredEndTime = nLEModel.getMeasuredEndTime();
        }
        C1450470nqf c1450470nqf = C1450470nqf.LIZIZ;
        StringBuilder sb = new StringBuilder("fit edit tracks to duration: ");
        sb.append(measuredEndTime);
        sb.append(", ");
        Iterator<NLETrackSlot> it2 = nLEModel.getMainTrack().getSlots().iterator();
        long duration = 0;
        while (it2.hasNext()) {
            duration += it2.next().getDuration();
        }
        sb.append(duration);
        C201955140j.LIZLLL(c1450470nqf, "LivePhotoEditComponent", sb.toString());
        LivePhotoModel livePhotoModel = LJJJLIIL().creativeModel.livePhotoModel;
        if (livePhotoModel != null) {
            livePhotoModel.durationMs = measuredEndTime / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        ArrayList<NLETrack> arrayList = new ArrayList();
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (!nLETrack.getMainTrack()) {
                if (C351220Dpo.LLILLJJLI(nLETrack) && H4(nLETrack)) {
                    if (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "DUB")) {
                        C1450470nqf c1450470nqf2 = C1450470nqf.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fit dub before size=");
                        sbLIZ.append(nLETrack.getSlots().size());
                        sbLIZ.append(": ");
                        sbLIZ.append(nLETrack);
                        C201955140j.LIZLLL(c1450470nqf2, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ));
                        while (nLETrack.getSlots().size() > 0) {
                            Iterator<NLETrackSlot> it3 = nLETrack.getSlots().iterator();
                            long duration2 = 0;
                            while (it3.hasNext()) {
                                duration2 += it3.next().getDuration();
                            }
                            if (duration2 <= measuredEndTime) {
                                break;
                            }
                            if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                                C12SF c12sfZ4 = z4();
                                if (c12sfZ4 != null) {
                                    c12sfZ4.gb2(AFwS210S0000000_22.get$arr$(215), AFwS261S0000000_22.get$arr$(181), null);
                                }
                            } else {
                                C12SF c12sfO4 = o4();
                                if (c12sfO4 != null) {
                                    c12sfO4.gb2(AFwS210S0000000_22.get$arr$(216), AFwS261S0000000_22.get$arr$(182), null);
                                }
                            }
                        }
                        C1450470nqf c1450470nqf3 = C1450470nqf.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fit dub after size=");
                        sbLIZ2.append(nLETrack.getSlots().size());
                        sbLIZ2.append(": ");
                        sbLIZ2.append(nLETrack);
                        C201955140j.LIZLLL(c1450470nqf3, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        C1450470nqf c1450470nqf4 = C1450470nqf.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("shorten record audio track: ");
                        sbLIZ3.append(nLETrack);
                        C201955140j.LIZLLL(c1450470nqf4, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ3));
                        O4(nLETrack, measuredEndTime);
                    }
                } else if (C351220Dpo.LLILLJJLI(nLETrack) && C351220Dpo.LLLLIILL(nLETrack)) {
                    C1450470nqf c1450470nqf5 = C1450470nqf.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("drop audio conversion track: ");
                    sbLIZ4.append(nLETrack);
                    C201955140j.LIZLLL(c1450470nqf5, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ4));
                    arrayList.add(nLETrack);
                } else if (C351220Dpo.LLILLJJLI(nLETrack)) {
                    C1450470nqf c1450470nqf6 = C1450470nqf.LIZIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("fit music track: ");
                    sbLIZ5.append(nLETrack);
                    C201955140j.LIZLLL(c1450470nqf6, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ5));
                    if (C351220Dpo.LLILLL(nLETrack) && j2 != -1) {
                        jMin = Math.min(measuredEndTime, ((long) LSPassThroughRecordSizeConfig.DEFAULT) * j2);
                    } else {
                        jMin = measuredEndTime;
                    }
                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLL(nLETrack.getSlots());
                    if (nLETimeSpaceNode != null) {
                        nLETimeSpaceNode.setEndTime(jMin);
                    }
                } else if (C351220Dpo.LLJI(nLETrack)) {
                    C1450470nqf c1450470nqf7 = C1450470nqf.LIZIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("fit color filter: ");
                    sbLIZ6.append(nLETrack);
                    C201955140j.LIZLLL(c1450470nqf7, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ6));
                    NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) C13LP.LJJJLL(nLETrack.getSlots());
                    if (nLETimeSpaceNode2 != null) {
                        nLETimeSpaceNode2.setStartTime(0L);
                        nLETimeSpaceNode2.setEndTime(measuredEndTime);
                    }
                } else if (C351220Dpo.LLJJIII(nLETrack)) {
                    C1450470nqf c1450470nqf8 = C1450470nqf.LIZIZ;
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("fit effect track: ");
                    sbLIZ7.append(nLETrack);
                    C201955140j.LIZLLL(c1450470nqf8, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ7));
                    if (nLETrack.getSlots().size() == 1) {
                        NLETimeSpaceNode nLETimeSpaceNode3 = (NLETimeSpaceNode) C13LP.LJJJJZI(nLETrack.getSlots());
                        if (nLETimeSpaceNode3.getStartTime() == 0 && nLETimeSpaceNode3.getEndTime() >= j) {
                            ((NLETimeSpaceNode) C13LP.LJJJJZI(nLETrack.getSlots())).setEndTime(measuredEndTime);
                        }
                    }
                    O4(nLETrack, measuredEndTime);
                    if (nLETrack.getSlots().size() == 0) {
                        arrayList.add(nLETrack);
                    }
                } else if (nLETrack.getSlots().size() == 1) {
                    C1450470nqf c1450470nqf9 = C1450470nqf.LIZIZ;
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("fit other single track: ");
                    sbLIZ8.append(nLETrack);
                    C201955140j.LIZLLL(c1450470nqf9, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ8));
                    NLETimeSpaceNode nLETimeSpaceNode4 = (NLETimeSpaceNode) C13LP.LJJJLL(nLETrack.getSlots());
                    if (nLETimeSpaceNode4 != null) {
                        nLETimeSpaceNode4.setStartTime(0L);
                        nLETimeSpaceNode4.setEndTime(measuredEndTime);
                    }
                } else if (nLETrack.getSlots().size() > 1) {
                    C1450470nqf c1450470nqf10 = C1450470nqf.LIZIZ;
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("fit other multiple track: ");
                    sbLIZ9.append(nLETrack);
                    C201955140j.LIZLLL(c1450470nqf10, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ9));
                    O4(nLETrack, measuredEndTime);
                }
            }
        }
        for (NLETrack nLETrack2 : arrayList) {
            C1450470nqf c1450470nqf11 = C1450470nqf.LIZIZ;
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("remove track ");
            sbLIZ10.append(nLETrack2);
            C201955140j.LIZLLL(c1450470nqf11, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ10));
            nLEModel.removeTrack(nLETrack2);
        }
        long j3 = measuredEndTime / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        InterfaceC1457250o1b interfaceC1457250o1bQ3 = q3();
        if (interfaceC1457250o1bQ3 != null) {
            interfaceC1457250o1bQ3.LLLL((int) j3);
        }
        InterfaceC391240FVq interfaceC391240FVqH3 = H3();
        if (interfaceC391240FVqH3 != null && (listS32 = interfaceC391240FVqH3.s32()) != null) {
            for (StickerModel stickerModel : listS32) {
                C1450470nqf c1450470nqf12 = C1450470nqf.LIZIZ;
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("fit infini sticker: ");
                sbLIZ11.append(stickerModel.getId());
                C201955140j.LIZLLL(c1450470nqf12, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ11));
                stickerModel.getBaseModel().setStartTime(0.0f);
                stickerModel.getBaseModel().setUiStartTime(0.0f);
                float f = j3;
                stickerModel.getBaseModel().setEndTime(f);
                stickerModel.getBaseModel().setUiEndTime(f);
                InterfaceC391240FVq interfaceC391240FVqH32 = H3();
                if (interfaceC391240FVqH32 != null) {
                    interfaceC391240FVqH32.k3(stickerModel, EnumC356070Dxd.COMMIT);
                }
            }
        }
        C0FVT c0fvtE4 = e4();
        if (c0fvtE4 != null && (listSb = c0fvtE4.Sb()) != null) {
            for (TextStickerModel textStickerModel : listSb) {
                C1450470nqf c1450470nqf13 = C1450470nqf.LIZIZ;
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("fit text sticker: ");
                sbLIZ12.append(textStickerModel.getTextStr());
                sbLIZ12.append(", ");
                sbLIZ12.append(textStickerModel.getBaseStickerModel().getId());
                C201955140j.LIZLLL(c1450470nqf13, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ12));
                if (textStickerModel.getCaptionModel() != null) {
                    C0FVT c0fvtE42 = e4();
                    if (c0fvtE42 != null) {
                        c0fvtE42.Fj(textStickerModel.getBaseStickerModel().getId());
                    }
                } else {
                    textStickerModel.getBaseStickerModel().setStartTime(0.0f);
                    textStickerModel.getBaseStickerModel().setUiStartTime(0.0f);
                    float f2 = j3;
                    textStickerModel.getBaseStickerModel().setEndTime(f2);
                    textStickerModel.getBaseStickerModel().setUiEndTime(f2);
                    C0FVT c0fvtE43 = e4();
                    if (c0fvtE43 != null) {
                        c0fvtE43.Qi(textStickerModel);
                    }
                }
            }
        }
        InterfaceC1461650o8h interfaceC1461650o8hO32 = O3();
        if (interfaceC1461650o8hO32 != null && (listLm = interfaceC1461650o8hO32.Lm()) != null) {
            for (StickerItemModel stickerItemModel : listLm) {
                C1450470nqf c1450470nqf14 = C1450470nqf.LIZIZ;
                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                sbLIZ13.append("fit info sticker: ");
                sbLIZ13.append(stickerItemModel.getId());
                C201955140j.LIZLLL(c1450470nqf14, "LivePhotoEditComponent", C2188811AlT.LIZIZ(sbLIZ13));
                if (!stickerItemModel.isTextSticker() && (interfaceC1461650o8hO3 = O3()) != null) {
                    int i = (int) j3;
                    interfaceC1461650o8hO3.cS(stickerItemModel.getId(), 0, i, 0, i);
                }
            }
        }
        InterfaceC1461650o8h interfaceC1461650o8hO33 = O3();
        if (interfaceC1461650o8hO33 != null) {
            int i2 = (int) j3;
            interfaceC1461650o8hO33.l0(new Pair<>(Integer.valueOf(i2), Integer.valueOf(i2)));
        }
    }

    private final NLETrackSlot Z4(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, long j, NLEStyCrop nLEStyCrop, C1450430nqb c1450430nqb, float f, String str) {
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(multiEditVideoSegmentRecordData.videoPath);
        nLEResourceAV.setDuration(multiEditVideoSegmentRecordData.videoLength);
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setTimeClipEnd(multiEditVideoSegmentRecordData.videoLength);
        nLEResourceAV.setHasAudio(true);
        nLESegmentVideo.setVolume(f);
        C533730KwV c533730KwV = C533730KwV.LIZ;
        String str2 = multiEditVideoSegmentRecordData.videoPath;
        c533730KwV.getClass();
        nLEResourceAV.setResourceType(C533730KwV.LJ(str2));
        nLESegmentVideo.setAVFile(nLEResourceAV);
        nLESegmentVideo.setEnableAudio(true);
        if (nLEStyCrop != null) {
            nLESegmentVideo.setCrop(nLEStyCrop);
        }
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        nLETrackSlot.setExtra("has_origin_audio_slot", String.valueOf(C123100dR.LIZ(multiEditVideoSegmentRecordData.audioPath)));
        nLETrackSlot.setStartTime(j);
        C348350DlB.LJIIL(nLETrackSlot);
        if (C123100dR.LIZ(str)) {
            NLESegmentTransition nLESegmentTransition = new NLESegmentTransition();
            nLESegmentTransition.setTransitionDuration(200000L);
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceFile(str);
            nLESegmentTransition.setEffectSDKTransition(nLEResourceNode);
            nLESegmentTransition.setOverlap(true);
            nLETrackSlot.setEndTransition(nLESegmentTransition);
        }
        C1450420nqa.LIZIZ(nLETrackSlot, c1450430nqb);
        return nLETrackSlot;
    }

    private final NLETrackSlot P4(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, long j, long j2, NLEStyCrop nLEStyCrop, C1450430nqb c1450430nqb, float f, float f2, boolean z) {
        boolean z2;
        String strLIZJ;
        NLEResType nLEResTypeLJ;
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        if ((((Boolean) C2489409pE.LIZ.getValue()).booleanValue() || z) && Z1(multiEditVideoSegmentRecordData.videoPath)) {
            z2 = true;
        } else {
            z2 = false;
        }
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        if (z2) {
            C527420KmK c527420KmK = C527420KmK.LIZ;
            String str = multiEditVideoSegmentRecordData.videoPath;
            CreativeInfo creativeInfo = LJJJLIIL().getCreativeInfo();
            c527420KmK.getClass();
            strLIZJ = C527420KmK.LIZJ(creativeInfo, str);
        } else {
            strLIZJ = multiEditVideoSegmentRecordData.videoPath;
        }
        nLEResourceAV.setResourceFile(strLIZJ);
        nLEResourceAV.setDuration(j2);
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setTimeClipEnd(j2);
        nLESegmentVideo.setVolume(0.0f);
        if (z2) {
            nLEResTypeLJ = NLEResType.IMAGE;
        } else {
            C533730KwV c533730KwV = C533730KwV.LIZ;
            String str2 = multiEditVideoSegmentRecordData.videoPath;
            c533730KwV.getClass();
            nLEResTypeLJ = C533730KwV.LJ(str2);
        }
        nLEResourceAV.setResourceType(nLEResTypeLJ);
        nLESegmentVideo.setAVFile(nLEResourceAV);
        nLESegmentVideo.setEnableAudio(false);
        if (nLEStyCrop != null) {
            nLESegmentVideo.setCrop(nLEStyCrop);
        }
        if (z) {
            NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
            nLEStyCanvas.setType(NLECanvasType.COLOR);
            nLEStyCanvas.setAntialiasing(true);
            nLESegmentVideo.setExtra("IS_SCENE_CANVAS_DMT", "true");
            nLESegmentVideo.setCanvasStyle(nLEStyCanvas);
        }
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        nLETrackSlot.setExtra("has_origin_audio_slot", String.valueOf(C123100dR.LIZ(multiEditVideoSegmentRecordData.audioPath)));
        nLETrackSlot.setStartTime(j);
        C348350DlB.LJIIL(nLETrackSlot);
        C1450420nqa.LIZIZ(nLETrackSlot, c1450430nqb);
        nLETrackSlot.setTransformZ(0);
        nLETrackSlot.setRotation(f);
        nLETrackSlot.setScale(f2);
        return nLETrackSlot;
    }
}
