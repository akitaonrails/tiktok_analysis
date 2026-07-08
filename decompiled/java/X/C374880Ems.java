package X;

import Y.ARunnableS105S0100000_5;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.components.base.api.IStickerPreviewService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS123S0110000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ems, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374880Ems extends AbstractC381020Ewm<InterfaceC373290EkJ> implements InterfaceC373290EkJ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C1DRG LLILLL;
    public final InterfaceC373290EkJ LLILZ;
    public final InterfaceC1731706qJ LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final C374930Emx LLJILLL;
    public final C358490E3r LLJJ;
    public final C374970En1 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C374880Ems.class, "nleCropApi", "getNleCropApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/common/api/NLECropApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C374880Ems.class, "cropAlignApi", "getCropAlignApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/common/logic/CropAlignApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C374880Ems.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/common/ui/CropConsoleBarComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C374880Ems.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/track/CropTrackApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C374880Ems.class, "cropPanelApi", "getCropPanelApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/croppanel/CropPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C374880Ems.class, "bottomApi", "getBottomApi()Lcom/ss/android/ugc/gamora/editorpro/components/confirm/BottomApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C374880Ems.class, "panelNavApi", "getPanelNavApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/api/PanelNavApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C374880Ems.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/preview/api/CropPreviewApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C374880Ems.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/model/PanelContext;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
        LLJJIJI = 8;
    }

    private final InterfaceC375030En7 H2() {
        return (InterfaceC375030En7) this.LLJ.getValue(this, LLJJIII[4]);
    }

    private final InterfaceC374530EmJ o2() {
        return (InterfaceC374530EmJ) this.LLJI.getValue(this, LLJJIII[5]);
    }

    public final InterfaceC374990En3 G2() {
        return (InterfaceC374990En3) this.LLILZLL.getValue(this, LLJJIII[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [T] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    public final void H3() {
        NLEModel nLEModelLJI;
        List sortedSlots;
        ?? arrayList;
        NLENode nLENode;
        VecNLETrackSlotSPtr sortedSlots2;
        NLESegment mainSegment;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        C374970En1 c374970En1 = this.LLJJI;
        C0E48 c0e48 = c374970En1.LIZ;
        ?? r10 = 0;
        if (c0e48 != null) {
            c374970En1.LJ = c0e48.getPlayer().Jh();
            NLETrack nLETrackPt = c0e48.Pt();
            NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
            c374970En1.LIZLLL = nLETrackSlotLLLLLLIL;
            if (nLETrackPt == null || nLETrackSlotLLLLLLIL == null) {
                nLEModelLJI = C350870DpF.LJI(c0e48);
            } else {
                c374970En1.LIZJ = System.currentTimeMillis();
                long jJh = c0e48.getPlayer().Jh();
                NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast((NLENode) nLETrackSlotLLLLLLIL);
                long measuredStartTime = (nLETrackSlotDynamicCast == null || (mainSegment = nLETrackSlotDynamicCast.getMainSegment()) == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment)) == null) ? 0L : (long) ((jJh - (nLETrackSlotLLLLLLIL.getMeasuredStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) * nLESegmentVideoDynamicCast.getAbsSpeed());
                NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c0e48).deepClone(false));
                NLETrackSlot nLETrackSlotDynamicCast2 = NLETrackSlot.dynamicCast(nLETrackSlotLLLLLLIL.deepClone(false));
                C349070DmL.LIZ(nLEModelDynamicCast, nLETrackSlotDynamicCast2, true);
                nLETrackSlotDynamicCast2.clearVideoAnim();
                nLETrackSlotDynamicCast2.clearKeyframe();
                NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast2.getMainSegment());
                nLESegmentVideoDynamicCast2.setSpeed(nLESegmentVideoDynamicCast2.getRewind() ? -1.0f : 1.0f);
                nLESegmentVideoDynamicCast2.setAbsSpeed(1.0f);
                nLESegmentVideoDynamicCast2.clearSegCurveSpeedPoint();
                long timeClipEnd = nLESegmentVideoDynamicCast2.getTimeClipEnd() - nLESegmentVideoDynamicCast2.getTimeClipStart();
                nLETrackSlotDynamicCast2.setStartTime(0L);
                nLETrackSlotDynamicCast2.setEndTime(nLETrackSlotDynamicCast2.getStartTime() + timeClipEnd);
                nLETrackSlotDynamicCast2.setMainSegment(nLESegmentVideoDynamicCast2);
                Float fLJJJJJL = C351220Dpo.LJJJJJL(nLETrackSlotDynamicCast2, "ep_crop_scale", Float.valueOf(1.0f));
                if (fLJJJJJL != null) {
                    nLETrackSlotDynamicCast2.setScale(fLJJJJJL.floatValue());
                }
                Float fLJJJJJL2 = C351220Dpo.LJJJJJL(nLETrackSlotDynamicCast2, "ep_crop_transX", Float.valueOf(0.0f));
                if (fLJJJJJL2 != null) {
                    nLETrackSlotDynamicCast2.setTransformX(fLJJJJJL2.floatValue());
                }
                Float fLJJJJJL3 = C351220Dpo.LJJJJJL(nLETrackSlotDynamicCast2, "ep_crop_transY", Float.valueOf(0.0f));
                if (fLJJJJJL3 != null) {
                    nLETrackSlotDynamicCast2.setTransformY(fLJJJJJL3.floatValue());
                }
                Float fLJJJJJL4 = C351220Dpo.LJJJJJL(nLETrackSlotDynamicCast2, "ep_crop_degree", Float.valueOf(0.0f));
                if (fLJJJJJL4 != null) {
                    nLETrackSlotDynamicCast2.setRotation(fLJJJJJL4.floatValue());
                }
                nLESegmentVideoDynamicCast2.setCrop(null);
                C351510DqH.LIZ.getClass();
                C351510DqH.LJJJJ(nLESegmentVideoDynamicCast2);
                NLETrack nLETrack = new NLETrack();
                nLETrack.setMainTrack(true);
                nLETrack.addSlot(nLETrackSlotDynamicCast2);
                nLETrack.setDuration(nLETrackSlotDynamicCast2.getDuration());
                C259800zU c259800zU = new C259800zU();
                if (nLETrackPt.getMainTrack() && C351220Dpo.LLI(nLETrackSlotDynamicCast2)) {
                    NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModelDynamicCast);
                    if (nLETrackLIZ == null || (sortedSlots = nLETrackLIZ.getSortedSlots()) == null) {
                        sortedSlots = C13BV.INSTANCE;
                    }
                    NLETrack mainTrack = nLEModelDynamicCast.getMainTrack();
                    if (mainTrack == null || (sortedSlots2 = mainTrack.getSortedSlots()) == null) {
                        arrayList = C13BV.INSTANCE;
                    } else {
                        arrayList = new ArrayList();
                        for (NLETrackSlot nLETrackSlot : sortedSlots2) {
                            if (C351220Dpo.LLI(nLETrackSlot)) {
                                arrayList.add(nLETrackSlot);
                            }
                        }
                    }
                    if (sortedSlots.size() == arrayList.size() && (nLENode = (NLENode) C13LP.LJJJLZIJ(arrayList.indexOf(nLETrackSlotLLLLLLIL), sortedSlots)) != null) {
                        NLETrackSlot nLETrackSlotDynamicCast3 = NLETrackSlot.dynamicCast(nLENode.deepClone(false));
                        if (nLETrackSlotDynamicCast3 != null) {
                            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlotDynamicCast3.getMainSegment());
                            if (nLESegmentAudioDynamicCast != null) {
                                nLESegmentAudioDynamicCast.setAbsSpeed(1.0f);
                            }
                            nLETrackSlotDynamicCast3.setStartTime(0L);
                            nLETrackSlotDynamicCast3.setEndTime(-2L);
                            r10 = nLETrackSlotDynamicCast3;
                        }
                        c259800zU.element = r10;
                    }
                }
                nLEModelDynamicCast.clearTrack();
                nLEModelDynamicCast.addTrack(nLETrack);
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) c259800zU.element;
                if (nLETrackSlot2 != null) {
                    NLETrack nLETrack2 = new NLETrack();
                    nLETrack2.setMainTrack(false);
                    nLETrack2.setExtra("track_type", "audio");
                    nLETrack2.setExtraTrackType(NLETrackType.AUDIO);
                    nLETrack2.setLayer(0);
                    nLETrack2.setExtra("AudioTrackType", "ORIGIN");
                    nLETrack2.addSlot(nLETrackSlot2);
                    nLETrack2.setDuration(nLETrackSlot2.getDuration());
                    nLEModelDynamicCast.addTrack(nLETrack2);
                    C350110Do1.LJII(nLEModelDynamicCast);
                }
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                nLEEditorLIZ.setModel(NLEModel.dynamicCast(nLEModelDynamicCast.deepClone(true)));
                nLEEditorLIZ.commit();
                nLEEditorLIZ.done();
                nLEModelLJI = nLEEditorLIZ.getModel();
                c374970En1.LJFF = measuredStartTime;
            }
            if (nLEModelLJI != null) {
                long j = this.LLJJI.LJFF;
                InterfaceC361710EGb interfaceC361710EGbQ3 = q3();
                if (interfaceC361710EGbQ3 != null) {
                    interfaceC361710EGbQ3.LR1(false);
                }
                InterfaceC372990Ejp interfaceC372990EjpM3 = m3();
                if (interfaceC372990EjpM3 != null) {
                    interfaceC372990EjpM3.setVisibility(4);
                }
                O3(nLEModelLJI, j);
                Q3(j);
                this.LLJJ.LIZIZ(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT), new C0FX3(this, 12), false, true);
            }
        }
    }

    public final VideoPublishEditModel LJJJLIIL() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final InterfaceC374920Emw T2() {
        return (InterfaceC374920Emw) this.LLILZIL.getValue(this, LLJJIII[0]);
    }

    public final C360050E9r W2() {
        return (C360050E9r) this.LLJILJILJ.getValue(this, LLJJIII[8]);
    }

    public final InterfaceC373200EkA c3() {
        return (InterfaceC373200EkA) this.LLJIJIL.getValue(this, LLJJIII[6]);
    }

    public final InterfaceC374950Emz i3() {
        return (InterfaceC374950Emz) this.LLJILJIL.getValue(this, LLJJIII[7]);
    }

    public final InterfaceC375010En5 v3() {
        return (InterfaceC375010En5) this.LLIZLLLIL.getValue(this, LLJJIII[3]);
    }

    public final C373580Ekm w2() {
        return (C373580Ekm) this.LLIZ.getValue(this, LLJJIII[2]);
    }

    public final InterfaceC372990Ejp m3() {
        IStickerPreviewService iStickerPreviewServiceLIZIZ = C357280Dza.LIZIZ();
        if (iStickerPreviewServiceLIZIZ != null) {
            return iStickerPreviewServiceLIZIZ.getStickerPreviewApi();
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC374950Emz interfaceC374950EmzI3 = i3();
        if (interfaceC374950EmzI3 != null) {
            interfaceC374950EmzI3.vL2("VideoCropMaterial", new C375080EnC(getDiContainer()));
        }
        C360050E9r c360050E9rW2 = W2();
        if (c360050E9rW2 != null) {
            B3(c360050E9rW2);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC374920Emw interfaceC374920EmwT2 = T2();
        if (interfaceC374920EmwT2 != null) {
            interfaceC374920EmwT2.release();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C373580Ekm c373580EkmW2 = w2();
        if (c373580EkmW2 != null) {
            c373580EkmW2.b5(EnumC373600Eko.PAUSE);
        }
        InterfaceC374920Emw interfaceC374920EmwT2 = T2();
        if (interfaceC374920EmwT2 != null) {
            interfaceC374920EmwT2.pause();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        InterfaceC374920Emw interfaceC374920EmwT2 = T2();
        if (interfaceC374920EmwT2 != null) {
            interfaceC374920EmwT2.resume();
        }
    }

    public final InterfaceC361710EGb q3() {
        IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
        if (iPreviewServiceLIZ != null) {
            return iPreviewServiceLIZ.getPreviewPanelApi();
        }
        return null;
    }

    public InterfaceC373290EkJ Z1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0Emx] */
    public C374880Ems(C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = this;
        this.LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374920Emw.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374990En3.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C373580Ekm.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC375010En5.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC375030En7.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374530EmJ.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373200EkA.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374950Emz.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C360050E9r.class, null);
        this.LLJILLL = new C0FDF() { // from class: X.0Emx
            @Override // X.C0FDF
            public final void LIZ(EnumC373600Eko enumC373600Eko) {
                C373580Ekm c373580EkmW2 = this.LIZ.w2();
                if (c373580EkmW2 != null) {
                    c373580EkmW2.b5(enumC373600Eko);
                }
            }

            @Override // X.C0FDF
            public final void LIZIZ(long j, boolean z) {
                InterfaceC375010En5 interfaceC375010En5V3;
                if (!z && (interfaceC375010En5V3 = this.LIZ.v3()) != null) {
                    interfaceC375010En5V3.Y3(j);
                }
                C373580Ekm c373580EkmW2 = this.LIZ.w2();
                if (c373580EkmW2 != null) {
                    c373580EkmW2.Y3(j);
                }
            }
        };
        this.LLJJ = new C358490E3r(W1());
        this.LLJJI = new C374970En1(W1());
    }

    private final void E3(boolean z) {
        INLEMediaSession iNLEMediaSessionF1;
        C0E60 c0e60;
        C0E48 c0e48;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (iNLEMediaSessionF1 = c0e48W1.f1()) == null) {
            return;
        }
        c0e48W1.getPlayer().LJJIIJ();
        iNLEMediaSessionF1.updateNLEEditor(c0e48W1.LLFII().LJI());
        iNLEMediaSessionF1.setDataSource(C350870DpF.LJI(c0e48W1));
        InterfaceC374990En3 interfaceC374990En3G2 = G2();
        if (interfaceC374990En3G2 != null) {
            interfaceC374990En3G2.sO();
        }
        C360050E9r c360050E9rW2 = W2();
        if (c360050E9rW2 != null && (c0e60 = c360050E9rW2.LLILZ) != null && (c0e48 = c0e60.LIZIZ) != null) {
            C350870DpF.LJIIIZ(c0e48, "IS_ACTIVE_TRACKPANEL", Boolean.TRUE);
        }
        C374970En1 c374970En1 = this.LLJJI;
        c374970En1.LIZIZ.LIZIZ(c374970En1.LJ * ((long) LSPassThroughRecordSizeConfig.DEFAULT), new C0FX3(new ARunnableS105S0100000_5(this, 61), 13), true, true);
        InterfaceC373200EkA interfaceC373200EkAC3 = c3();
        if (interfaceC373200EkAC3 != null) {
            interfaceC373200EkAC3.exit(z);
        }
    }

    private final void Q3(long j) {
        NLEEditor nLEEditorLF2;
        NLEModel model;
        NLETrack mainTrack;
        NLETrackSlot slotByIndex;
        int iOrdinal;
        C0E48 c0e48W1;
        InterfaceC374920Emw interfaceC374920EmwT2 = T2();
        if (interfaceC374920EmwT2 != null && (nLEEditorLF2 = interfaceC374920EmwT2.LF2()) != null && (model = nLEEditorLF2.getModel()) != null && (mainTrack = model.getMainTrack()) != null && (slotByIndex = mainTrack.getSlotByIndex(0)) != null) {
            InterfaceC374950Emz interfaceC374950EmzI3 = i3();
            if (interfaceC374950EmzI3 != null) {
                interfaceC374950EmzI3.ow0("VideoCropMaterial");
                interfaceC374950EmzI3.NA0(model.getMainTrack(), slotByIndex);
            }
            long measuredEndTime = (slotByIndex.getMeasuredEndTime() - slotByIndex.getMeasuredStartTime()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            C373580Ekm c373580EkmW2 = w2();
            if (c373580EkmW2 != null) {
                c373580EkmW2.y2(measuredEndTime);
                c373580EkmW2.Y3(j);
            }
            InterfaceC375010En5 interfaceC375010En5V3 = v3();
            if (interfaceC375010En5V3 != null) {
                interfaceC375010En5V3.y2(measuredEndTime);
                interfaceC375010En5V3.lu2(slotByIndex);
                interfaceC375010En5V3.Y3(j);
            }
            InterfaceC375030En7 interfaceC375030En7H2 = H2();
            if (interfaceC375030En7H2 != null) {
                interfaceC375030En7H2.fq2(new InterfaceC376240Ep4() { // from class: X.0Emt
                    @Override // X.InterfaceC376240Ep4
                    public final boolean LIZ(EnumC375190EnN enumC375190EnN, boolean z) {
                        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
                        C0E48 c0e48W12;
                        C375080EnC c375080EnC;
                        InterfaceC374920Emw interfaceC374920EmwT22 = this.LIZ.T2();
                        if (interfaceC374920EmwT22 != null) {
                            interfaceC374920EmwT22.pause();
                        }
                        InterfaceC374950Emz interfaceC374950EmzI32 = this.LIZ.i3();
                        if (interfaceC374950EmzI32 != null && (c375080EnC = (C375080EnC) interfaceC374950EmzI32.kG("VideoCropMaterial")) != null) {
                            c375080EnC.LJIL(enumC375190EnN);
                        }
                        if (z && (videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL()) != null && (c0e48W12 = this.LIZ.W1()) != null) {
                            C361680EFy.LJJJJIZL(enumC375190EnN, videoPublishEditModelLJJJLIIL, c0e48W12);
                            return true;
                        }
                        return true;
                    }
                });
                EnumC375190EnN[] enumC375190EnNArrValues = EnumC375190EnN.values();
                Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(slotByIndex, "ep_crop_mode", null);
                if (numLJJJLZIJ != null) {
                    iOrdinal = numLJJJLZIJ.intValue();
                } else {
                    iOrdinal = EnumC375190EnN.FREE.ordinal();
                }
                EnumC375190EnN enumC375190EnN = enumC375190EnNArrValues[iOrdinal];
                interfaceC375030En7H2.zy1(enumC375190EnN);
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
                if (videoPublishEditModelLJJJLIIL != null && (c0e48W1 = W1()) != null) {
                    C361680EFy.LJJJJIZL(enumC375190EnN, videoPublishEditModelLJJJLIIL, c0e48W1);
                }
            }
        }
    }

    public final void B3(C360050E9r c360050E9r) {
        fu0(c360050E9r.LLILZLL);
    }

    public final void X1(boolean z) {
        C363110ELl c363110ELlLJJ;
        C0E48 c0e48W1;
        InterfaceC374920Emw interfaceC374920EmwT2;
        NLEEditor nLEEditorLF2;
        InterfaceC374950Emz interfaceC374950EmzI3;
        C375080EnC c375080EnC;
        InterfaceC373200EkA interfaceC373200EkAC3;
        InterfaceC374920Emw interfaceC374920EmwT22 = T2();
        if (interfaceC374920EmwT22 != null) {
            interfaceC374920EmwT22.pause();
        }
        InterfaceC374920Emw interfaceC374920EmwT23 = T2();
        if (interfaceC374920EmwT23 != null) {
            interfaceC374920EmwT23.release();
        }
        InterfaceC375010En5 interfaceC375010En5V3 = v3();
        if (interfaceC375010En5V3 != null) {
            interfaceC375010En5V3.WV();
        }
        EnumC375190EnN cropMode = null;
        if (z && (interfaceC374950EmzI3 = i3()) != null && (c375080EnC = (C375080EnC) interfaceC374950EmzI3.kG("VideoCropMaterial")) != null) {
            c363110ELlLJJ = c375080EnC.LJJ();
            C389830FQf c389830FQf = c375080EnC.LLJ.LLJILJIL;
            if (c389830FQf != null) {
                cropMode = c389830FQf.getCropMode();
            }
            if (c363110ELlLJJ != null && (interfaceC373200EkAC3 = c3()) != null) {
                interfaceC373200EkAC3.Db0(c363110ELlLJJ);
            }
        } else {
            c363110ELlLJJ = null;
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null && (c0e48W1 = W1()) != null) {
            if (!z) {
                C361680EFy.LJJJJI(videoPublishEditModelLJJJLIIL, c0e48W1);
            } else {
                boolean z2 = false;
                if (c363110ELlLJJ != null && (interfaceC374920EmwT2 = T2()) != null && (nLEEditorLF2 = interfaceC374920EmwT2.LF2()) != null && nLEEditorLF2.canUndo()) {
                    z2 = true;
                }
                if (cropMode == null) {
                    cropMode = EnumC375190EnN.FREE;
                }
                C361680EFy.LJJJJJ(cropMode, z2, videoPublishEditModelLJJJLIIL, c0e48W1);
            }
        }
        C374970En1 c374970En1 = this.LLJJI;
        NLETrackSlot nLETrackSlot = c374970En1.LIZLLL;
        if (nLETrackSlot != null) {
            C361680EFy.LJLILLLLZI(nLETrackSlot, "edit_crop_duration", String.valueOf(C361680EFy.LJIJJ(nLETrackSlot, "edit_crop_duration") + (System.currentTimeMillis() - c374970En1.LIZJ)));
            if (c363110ELlLJJ != null) {
                nLETrackSlot.setExtra("ep_crop_mode", String.valueOf(c363110ELlLJJ.LIZIZ));
                if (c363110ELlLJJ.LIZ != null) {
                    nLETrackSlot.setExtra("is_editorpro_crop_video", "1");
                }
            }
        }
        E3(z);
    }

    @Override // X.InterfaceC374710Emb
    public void exit(boolean z) {
        InterfaceC374990En3 interfaceC374990En3G2;
        if (!C373230EkD.LIZ(c3()) && (interfaceC374990En3G2 = G2()) != null) {
            interfaceC374990En3G2.pO0(true, new AwS123S0110000_5(this, z, 6));
        }
    }

    @Override // X.InterfaceC373290EkJ
    public void fu0(NLEModel nLEModel) {
        InterfaceC361710EGb previewPanelApi;
        C0E60 c0e60;
        if (nLEModel == null) {
            return;
        }
        InterfaceC373200EkA interfaceC373200EkAC3 = c3();
        if (interfaceC373200EkAC3 != null) {
            interfaceC373200EkAC3.lt1();
        }
        C360050E9r c360050E9rW2 = W2();
        if (c360050E9rW2 != null && (c0e60 = c360050E9rW2.LLILZ) != null) {
            c0e60.LIZ();
        }
        C360050E9r c360050E9rW22 = W2();
        if (c360050E9rW22 != null && c360050E9rW22.LLILZ != null) {
            C0E60.LIZJ(false);
        }
        C360050E9r c360050E9rW23 = W2();
        if (c360050E9rW23 != null && c360050E9rW23.LLILZ != null) {
            AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(new AwS549S0100000_5(this, 713), 814);
            IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
            if (iPreviewServiceLIZ != null && (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) != null) {
                previewPanelApi.Nk2(new AwS549S0100000_5(awS549S0100000_5, 1126));
            }
        }
        InterfaceC374530EmJ interfaceC374530EmJO2 = o2();
        if (interfaceC374530EmJO2 != null) {
            interfaceC374530EmJO2.setTitle(C20642515q3.LJI(2131833368));
        }
        InterfaceC374530EmJ interfaceC374530EmJO22 = o2();
        if (interfaceC374530EmJO22 != null) {
            interfaceC374530EmJO22.u11(new InterfaceC374650EmV() { // from class: X.0En4
                @Override // X.InterfaceC374650EmV
                public final void LIZ() {
                    this.LIZ.exit(true);
                }

                @Override // X.InterfaceC374650EmV
                public final void onCancel() {
                    this.LIZ.exit(false);
                }
            });
        }
    }

    private final void O3(NLEModel nLEModel, long j) {
        INLEMediaSession iNLEMediaSessionF1;
        NLEEditor nLEEditorLF2;
        InterfaceC374990En3 interfaceC374990En3G2 = G2();
        if (interfaceC374990En3G2 != null) {
            interfaceC374990En3G2.bb1();
        }
        InterfaceC374920Emw interfaceC374920EmwT2 = T2();
        if (interfaceC374920EmwT2 != null && (nLEEditorLF2 = interfaceC374920EmwT2.LF2()) != null) {
            nLEEditorLF2.addConsumer(new C354000DuI() { // from class: X.0Emy
                @Override // X.C354000DuI
                public final void LIZ() {
                    NLEEditor nLEEditorLF22;
                    NLEModel model;
                    InterfaceC374950Emz interfaceC374950EmzI3;
                    InterfaceC374920Emw interfaceC374920EmwT22 = this.LIZ.T2();
                    if (interfaceC374920EmwT22 == null || (nLEEditorLF22 = interfaceC374920EmwT22.LF2()) == null || (model = nLEEditorLF22.getModel()) == null || (interfaceC374950EmzI3 = this.LIZ.i3()) == null) {
                        return;
                    }
                    interfaceC374950EmzI3.yc(model);
                }
            });
        }
        InterfaceC374920Emw interfaceC374920EmwT22 = T2();
        if (interfaceC374920EmwT22 != null) {
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                iNLEMediaSessionF1 = c0e48W1.f1();
            } else {
                iNLEMediaSessionF1 = null;
            }
            interfaceC374920EmwT22.lY0(iNLEMediaSessionF1, C375260EnU.LIZJ(nLEModel), j, new AwS549S0100000_5(this, 714));
        }
        InterfaceC374920Emw interfaceC374920EmwT23 = T2();
        if (interfaceC374920EmwT23 != null) {
            interfaceC374920EmwT23.mS0(this.LLJILLL);
        }
    }
}
