package X;

import Y.ALAdapterS17S0200000_22;
import Y.AObserverS225S0100000_22;
import Y.AfS191S0100000_22;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CanvasVideoEditorTrackViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import v7.o;

/* JADX INFO: renamed from: X.0nqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450640nqw extends AbstractC2255721DQs<InterfaceC1450440nqc> implements InterfaceC1450440nqc, InterfaceC379610EuV {
    public static final C1449890npj LLLF;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final int LLLFFI;
    public static final boolean LLLFZ;
    public static int LLLI;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final Function0<InterfaceC1461390o8H> LLILZ;
    public C1453310nvF LLILZIL;
    public CanvasFilterParam LLJJIJI;
    public VEVideoTransformFilterParam LLJJJ;
    public long LLJJJJ;
    public long LLJJJJJIL;
    public int LLJJJJLIIL;
    public long LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public ValueAnimator LLJL;
    public boolean LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public float LLJLLIL;
    public String LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public final InterfaceC1450440nqc LLILZLL = this;
    public final C11NJ LLIZ = new C11NJ();
    public final MutableLiveData<VESize> LLIZLLLIL = new MutableLiveData<>();
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC372160EiU.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 592));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 590));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 591));
    public int LLJJIII = Integer.MIN_VALUE;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 589));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(210));
    public final Choreographer.FrameCallback LLJJJIL = new ChoreographerFrameCallbackC1466710oGr(this, 0);
    public final C1450670nqz LLL = new InterfaceC1462000o9G() { // from class: X.0nqz
        @Override // X.InterfaceC1462000o9G
        public final boolean LJL(boolean z) {
            return false;
        }

        @Override // X.InterfaceC1462000o9G
        public final boolean LLIIIJ() {
            return false;
        }

        @Override // X.InterfaceC1462000o9G
        public final boolean b0() {
            return false;
        }

        @Override // X.InterfaceC1462000o9G
        public final boolean x0() {
            C1453310nvF c1453310nvF = this.LL.LLILZIL;
            if (c1453310nvF == null) {
                c1453310nvF = null;
            }
            C1397510mTF c1397510mTF = c1453310nvF.LLJJ;
            return c1397510mTF != null && c1397510mTF.LJIIIZ();
        }
    };

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0npj] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1450640nqw.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1450640nqw.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C1450640nqw.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0), new C2217381BqS(C1450640nqw.class, "autoPlayAPI", "getAutoPlayAPI()Lcom/ss/android/ugc/gamora/editor/VEAutoPlayInterceptorApi;", 0), new C2217381BqS(C1450640nqw.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0)};
        LLLF = new Object() { // from class: X.0npj
        };
        LLLFFI = 8;
        LLLFZ = false;
    }

    private final void o4() {
        this.LLJJJJLIIL = 0;
        this.LLJJJJ = 0L;
        this.LLJJJJJIL = 0L;
        this.LLJJL = 0L;
        this.LLJJLIIIJLLLLLLLZ = 0L;
        LLLI = 0;
    }

    private final InterfaceC372160EiU G2() {
        return (InterfaceC372160EiU) this.LLJILJIL.getValue(this, LLLFF[3]);
    }

    private final InterfaceC1451520nsM H2() {
        return (InterfaceC1451520nsM) this.LLJILJILJ.getValue(this, LLLFF[4]);
    }

    public static final void H3() {
        LLLF.getClass();
        if (LLLFZ) {
            LLLI++;
        }
    }

    public final void K4() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C1453310nvF c1453310nvF = this.LLILZIL;
        if (c1453310nvF == null) {
            c1453310nvF = null;
        }
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 401);
        if (c1453310nvF.LLJJ == null) {
            C1397580mTM c1397580mTM = new C1397580mTM(c1453310nvF.requireActivity());
            c1397580mTM.LJII = false;
            c1397580mTM.LIZ(2131836290);
            C985403tE.LIZ(c1397580mTM, new AwS388S0200000_22(awS601S0100000_22, c1453310nvF, 289));
            c1453310nvF.LLJJ = new C1397510mTF(c1397580mTM);
        }
        C1397510mTF c1397510mTF = c1453310nvF.LLJJ;
        if (c1397510mTF == null || !c1397510mTF.LJIIIZ()) {
            InterfaceC1455860nzM interfaceC1455860nzM = (InterfaceC1455860nzM) c1453310nvF.LLJILJIL.getValue(c1453310nvF, C1453310nvF.LLJJI[0]);
            if (interfaceC1455860nzM != null && (liveDataG = interfaceC1455860nzM.g()) != null && (value = liveDataG.getValue()) != null) {
                value.pause();
            }
            C1397510mTF c1397510mTF2 = c1453310nvF.LLJJ;
            if (c1397510mTF2 != null) {
                c1397510mTF2.LIZLLL();
            }
        }
    }

    public final InterfaceC1455860nzM T2() {
        return (InterfaceC1455860nzM) this.LLJI.getValue(this, LLLFF[1]);
    }

    public final InterfaceC1455610nyx W2() {
        return (InterfaceC1455610nyx) this.LLJIJIL.getValue(this, LLLFF[2]);
    }

    public final boolean c3() {
        return ((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue();
    }

    public final void e4() {
        if (LLLFZ) {
            if (this.LLJJJJLIIL < 2 || !C1453840nw6.LJ(getEditModel())) {
                o4();
                return;
            }
            long j = this.LLJJJJJIL - this.LLJJJJ;
            long j2 = this.LLJJLIIIJLLLLLLLZ / ((long) (this.LLJJJJLIIL - 1));
            long j3 = j2 > 0 ? ((long) LSPassThroughRecordSizeConfig.DEFAULT) / j2 : 0L;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pinch opt=");
            sbLIZ.append(c3() ? 1 : 0);
            sbLIZ.append(" fps=");
            sbLIZ.append(j3);
            sbLIZ.append(" avg_gap=");
            sbLIZ.append(j2);
            sbLIZ.append("ms max_gap=");
            sbLIZ.append(this.LLJJL);
            sbLIZ.append("ms transform_n=");
            sbLIZ.append(this.LLJJJJLIIL);
            sbLIZ.append(" sticker_n=");
            sbLIZ.append(LLLI);
            sbLIZ.append(" dur=");
            sbLIZ.append(j);
            sbLIZ.append("ms way=");
            sbLIZ.append(getEditModel().mShootWay);
            C2188811AlT.LIZIZ(sbLIZ);
            o4();
        }
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJ.getValue(this, LLLFF[0]);
    }

    public final C1453390nvN i3() {
        return (C1453390nvN) this.LLJJ.getValue();
    }

    public final C1450700nr2 m3() {
        return (C1450700nr2) this.LLJJI.getValue();
    }

    public final InterfaceC1450690nr1 q3() {
        return (InterfaceC1450690nr1) this.LLJILLL.getValue();
    }

    public final Choreographer v3() {
        return (Choreographer) this.LLJJIJIL.getValue();
    }

    private final void O3() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        InterfaceC1446740nke interfaceC1446740nke;
        LiveData<Boolean> liveDataFV1;
        InterfaceC372160EiU interfaceC372160EiUG2 = G2();
        if (interfaceC372160EiUG2 != null) {
            interfaceC372160EiUG2.FS1(this.LLL);
        }
        i3().LJIIJJI.LJFF.observe(this, new AObserverS225S0100000_22(this, 86));
        q3().LJI().observe(this, new AObserverS225S0100000_22(this, 87));
        T2().ww2().observe(this, new AObserverS225S0100000_22(this, 88));
        InterfaceC1455860nzM interfaceC1455860nzMT2 = T2();
        if ((interfaceC1455860nzMT2 instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMT2) != null && (liveDataFV1 = interfaceC1446740nke.FV1()) != null) {
            liveDataFV1.observe(this, new AObserverS225S0100000_22(this, 89));
        }
        InterfaceC1452170ntP value = T2().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null) {
            return;
        }
        C1450840nrG.LIZ(nLEEditor, "EditCanvasComponent#registerObserver", this, new C354000DuI() { // from class: X.0nqy
            @Override // X.C354000DuI
            public final void LIZ() {
                C1414930mvL c1414930mvL = C1414930mvL.LIZ;
                VideoPublishEditModel editModel = this.LIZ.getEditModel();
                c1414930mvL.getClass();
                if (C1414930mvL.LJIIJ(editModel)) {
                    if (this.LIZ.getEditModel().getAILivePhotoModel().LJII()) {
                        this.LIZ.m3().LIZLLL(false);
                    } else {
                        if (this.LIZ.getEditModel().isLivePhotoEdit()) {
                            return;
                        }
                        if (this.LIZ.getEditModel().isCurrentAutoCutMode()) {
                            this.LIZ.m3().LIZLLL(false);
                        } else {
                            this.LIZ.m3().LIZLLL(true);
                        }
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC1450440nqc
    public boolean AF1() {
        CanvasVideoData canvasVideoData = getEditModel().getCanvasVideoData();
        if (canvasVideoData == null) {
            return false;
        }
        C1444940nhk.LJIIIZ(canvasVideoData);
        return false;
    }

    public final boolean B3() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        InterfaceC1455860nzM interfaceC1455860nzMT2 = T2();
        if (interfaceC1455860nzMT2 == null || (liveDataG = interfaceC1455860nzMT2.g()) == null || (value = liveDataG.getValue()) == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null || (mainTrack = nLEModelLIZ.getMainTrack()) == null || (sortedSlots = mainTrack.getSortedSlots()) == null || sortedSlots.isEmpty()) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : sortedSlots) {
            if (nLETrackSlot.getKeyframes().size() > 0 || (C351220Dpo.LLIIIJ(nLETrackSlot) && C351220Dpo.LLFF(nLETrackSlot, NLEKeyframeType.Video))) {
                return C351230Dpp.LIZIZ();
            }
        }
        return false;
    }

    public final void H4() {
        CanvasVideoData canvasVideoData = getEditModel().getCanvasVideoData();
        if (canvasVideoData == null) {
            return;
        }
        C1444940nhk.LJIIIZ(canvasVideoData);
    }

    public final void Q3() {
        NLETrack mainTrack;
        NLETrack mainTrack2;
        VecNLETrackSlotSPtr slots;
        NLETimeSpaceNode nLETimeSpaceNode;
        NLETrack mainTrack3;
        VecNLETrackSlotSPtr sortedSlots;
        Unit unit;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        InterfaceC1452170ntP value = T2().g().getValue();
        if (value != null) {
            NLEModel nLEModelLIZ = C352130DrH.LIZ(value);
            NLEModel nLEModelLIZ2 = C352130DrH.LIZ(value);
            if (nLEModelLIZ2 != null) {
                mainTrack = nLEModelLIZ2.getMainTrack();
            } else {
                mainTrack = null;
                if (value == null) {
                    return;
                }
            }
            long jLLLLLLJ = C351220Dpo.LLLLLLJ(value.LLL());
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            NLEEditor nLEEditor = c348100DkmLIZIZ != null ? c348100DkmLIZIZ.LIZ : null;
            NLEModel nLEModelLIZ3 = C352130DrH.LIZ(value);
            if (nLEModelLIZ3 != null && (mainTrack3 = nLEModelLIZ3.getMainTrack()) != null && (sortedSlots = mainTrack3.getSortedSlots()) != null) {
                ArrayList<NLETrackSlot> arrayList = new ArrayList();
                for (NLETrackSlot nLETrackSlot : sortedSlots) {
                    NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                    if (nLETrackSlot2.getKeyframes().size() > 0 || (C351220Dpo.LLIIIJ(nLETrackSlot2) && C351220Dpo.LLFF(nLETrackSlot2, NLEKeyframeType.Video))) {
                        arrayList.add(nLETrackSlot);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (NLETrackSlot nLETrackSlot3 : arrayList) {
                    if (C351220Dpo.LLF(nLETrackSlot3)) {
                        C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value);
                        if (c348100DkmLIZIZ2 != null && (iNLEMediaSession = c348100DkmLIZIZ2.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                            playerApi.refreshAllKeyframeInfo(jLLLLLLJ, mainTrack, nLETrackSlot3);
                        }
                        nLETrackSlot3.clearKeyframe();
                    } else {
                        nLETrackSlot3.refreshAllSwingKeyframePropertyToSlotAtTime(jLLLLLLJ);
                        if (C351220Dpo.LLFF(nLETrackSlot3, NLEKeyframeType.Video)) {
                            VecNLEKeyframe swingKeyframes = nLETrackSlot3.getSwingKeyframes();
                            ArrayList arrayList3 = new ArrayList();
                            for (NLEKeyframe nLEKeyframe : swingKeyframes) {
                                if (nLEKeyframe.getKeyframeType() == NLEKeyframeType.Video) {
                                    arrayList3.add(nLEKeyframe);
                                }
                            }
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                nLETrackSlot3.removeSwingKeyframe((NLEKeyframe) it2.next());
                            }
                        }
                    }
                    if (nLEModelLIZ != null) {
                        if (C350110Do1.LJ(nLEModelLIZ)) {
                            C350110Do1.LJIILIIL(nLEModelLIZ, nLETrackSlot3);
                        }
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    arrayList2.add(unit);
                }
            }
            if (nLEEditor != null) {
                nLEEditor.commit();
                nLEEditor.done();
            }
            NLEModel nLEModelLIZ4 = C352130DrH.LIZ(value);
            if (nLEModelLIZ4 == null || (mainTrack2 = nLEModelLIZ4.getMainTrack()) == null || (slots = mainTrack2.getSlots()) == null || (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLL(slots)) == null) {
                return;
            }
            CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
            canvasFilterParam.setDegree(nLETimeSpaceNode.getRotation());
            canvasFilterParam.setTransX(nLETimeSpaceNode.getTransformX());
            canvasFilterParam.setTransY(nLETimeSpaceNode.getTransformY());
            canvasFilterParam.setScaleFactor(nLETimeSpaceNode.getScale());
            jf0(canvasFilterParam);
        }
    }

    @Override // X.InterfaceC1450440nqc
    public List<InteractStickerStruct> getInteractStickerStruct() {
        List<CanvasFilterParam> transformList;
        ForwardCanvasExtra forwardCanvasExtra;
        MentionStruct mentionStruct;
        Integer numValueOf;
        CanvasExtra canvasExtra;
        CanvasVideoData canvasVideoData = getEditModel().getCanvasVideoData();
        ArrayList arrayList = null;
        if (!((canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null) ? false : canvasExtra.enableVVInteract)) {
            return null;
        }
        C1453390nvN c1453390nvNI3 = i3();
        C0MSQ c0msq = C1453390nvN.LJIIZILJ;
        VESize vESize = c1453390nvNI3.LIZLLL;
        Pair<Pair<Float, Float>, Pair<Float, Float>> pairLIZLLL = c1453390nvNI3.LIZLLL();
        c0msq.getClass();
        Pair<Float, Float> first = pairLIZLLL.getFirst();
        float fFloatValue = first.getFirst().floatValue();
        float fFloatValue2 = first.getSecond().floatValue();
        Pair<Float, Float> second = pairLIZLLL.getSecond();
        RectF rectF = new RectF(fFloatValue, fFloatValue2, second.getFirst().floatValue(), second.getSecond().floatValue());
        Pair pair = new Pair(C0MSQ.LIZ(vESize, new PointF(rectF.centerX(), rectF.centerY())), C0MSQ.LIZ(vESize, new PointF(rectF.width(), rectF.height())));
        int videoLength = getEditModel().getVideoLength();
        if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(transformList, 10));
            for (CanvasFilterParam canvasFilterParam : transformList) {
                if (C1444940nhk.LJIILL(canvasVideoData)) {
                    return Collections.singletonList(C1444950nhl.LIZ(canvasFilterParam, canvasVideoData, pair, videoLength));
                }
                CanvasExtra canvasExtra2 = canvasVideoData.extra;
                if (canvasExtra2 != null && (forwardCanvasExtra = canvasExtra2.forwardCanvasExtra) != null && (mentionStruct = forwardCanvasExtra.videoShareBackwardsMention) != null && (numValueOf = Integer.valueOf(mentionStruct.getScenario())) != null && (numValueOf.intValue() == EnumC19597511lt.POST_BACKWARDS_MENTION.getValue() || numValueOf.intValue() == EnumC19597511lt.STORY_BACKWARDS_MENTION.getValue())) {
                    return C1697810uHb.LJ(C1444950nhl.LIZ(canvasFilterParam, canvasVideoData, pair, videoLength), C1444950nhl.LIZIZ(canvasFilterParam, canvasVideoData, pair, videoLength));
                }
                arrayList.add(C1444950nhl.LIZIZ(canvasFilterParam, canvasVideoData, pair, videoLength));
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C1453310nvF c1453310nvF = new C1453310nvF(getDiContainer(), i3());
        this.LLILLJJLI.add(this.LLILLL, c1453310nvF, "EditCanvasScene");
        this.LLILZIL = c1453310nvF;
        if ((getEditModel().isEnterFromLinkShare() && C1428470nHB.LJJLIIIJLLLLLLLZ(getEditModel())) || getEditModel().getAILivePhotoModel().LJII() || C1434160nQM.LIZ(getEditModel().creativeModel) || (!getEditModel().creativeModel.stickerModel.liveShareStickerModels.isEmpty())) {
            m3().LIZLLL(false);
        }
        O3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        VEVideoTransformFilterParam vEVideoTransformFilterParam = this.LLJJJ;
        if (vEVideoTransformFilterParam != null) {
            v3().removeFrameCallback(this.LLJJJIL);
            this.LLJJJ = null;
            Z1(vEVideoTransformFilterParam);
        }
        if (c3()) {
            q3().LJ();
        }
        InterfaceC372160EiU interfaceC372160EiUG2 = G2();
        if (interfaceC372160EiUG2 != null) {
            interfaceC372160EiUG2.FS1(this.LLL);
        }
        ValueAnimator valueAnimator = this.LLJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJL = null;
        this.LLIZ.dispose();
        v3().removeFrameCallback(this.LLJJJIL);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    public InterfaceC1450440nqc w2() {
        return this.LLILZLL;
    }

    private final void E3(long j) {
        int i = this.LLJJJJLIIL;
        if (i == 0) {
            this.LLJJJJ = j;
        } else {
            long j2 = j - this.LLJJJJJIL;
            this.LLJJLIIIJLLLLLLLZ += j2;
            if (j2 > this.LLJJL) {
                this.LLJJL = j2;
            }
        }
        this.LLJJJJJIL = j;
        this.LLJJJJLIIL = i + 1;
    }

    private final void X1(InterfaceC1452170ntP interfaceC1452170ntP) {
        NLEEditor nLEEditor;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLEStyCanvas canvasStyle;
        List listLLIIII;
        try {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
                for (NLETrackSlot nLETrackSlot : sortedSlots) {
                    VecNLEVideoAnimationSPtr videoAnims = nLETrackSlot.getVideoAnims();
                    if (videoAnims != null && (listLLIIII = C13LP.LLIIII(videoAnims)) != null) {
                        Iterator it2 = listLLIIII.iterator();
                        while (it2.hasNext()) {
                            nLETrackSlot.removeVideoAnim((NLEVideoAnimation) it2.next());
                        }
                    }
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null && (canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) != null) {
                        canvasStyle.setType(NLECanvasType.COLOR);
                        canvasStyle.setColor(-16777216L);
                        canvasStyle.setAntialiasing(true);
                    }
                }
                nLEEditor.commit();
                nLEEditor.done();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private final void o2(Function1<? super Integer, Unit> function1) {
        CanvasFilterParam canvasFilterParam;
        CanvasVideoData canvasVideoData;
        List<CanvasFilterParam> transformList;
        int i;
        InterfaceC1451520nsM interfaceC1451520nsMH2 = H2();
        if (interfaceC1451520nsMH2 != null) {
            interfaceC1451520nsMH2.gX0();
        }
        if (this.LLJJIJI != null) {
            if (this.LLJJIII < 0) {
                CanvasVideoEditorTrackViewModel canvasVideoEditorTrackViewModel = CanvasVideoEditorTrackViewModel.Companion.get(this.LLILLJJLI.mView);
                if (canvasVideoEditorTrackViewModel != null) {
                    i = canvasVideoEditorTrackViewModel.filterIndex;
                } else {
                    i = 1;
                }
                this.LLJJIII = i;
            }
            function1.invoke(Integer.valueOf(this.LLJJIII));
            return;
        }
        CanvasVideoEditorTrackViewModel canvasVideoEditorTrackViewModel2 = CanvasVideoEditorTrackViewModel.Companion.get(this.LLILLJJLI.mView);
        if (canvasVideoEditorTrackViewModel2 != null && canvasVideoEditorTrackViewModel2.isFilterIndexValid()) {
            this.LLJJIII = canvasVideoEditorTrackViewModel2.filterIndex;
            CanvasVideoData canvasVideoData2 = getEditModel().getCanvasVideoData();
            if (canvasVideoData2 != null && (transformList = canvasVideoData2.getTransformList()) != null) {
                canvasFilterParam = (CanvasFilterParam) C13LP.LJJJLL(transformList);
            } else {
                canvasFilterParam = null;
            }
            this.LLJJIJI = canvasFilterParam;
            if (canvasFilterParam == null && (canvasVideoData = getEditModel().getCanvasVideoData()) != null) {
                CanvasFilterParam canvasFilterParam2 = new CanvasFilterParam();
                canvasFilterParam2.setClipIndex(0);
                this.LLJJIJI = canvasFilterParam2;
                canvasVideoData.putTransform(canvasFilterParam2);
            }
            function1.invoke(Integer.valueOf(canvasVideoEditorTrackViewModel2.filterIndex));
        }
    }

    @Override // X.InterfaceC1450440nqc
    public C15O7<Unit> Dr2(InterfaceC384890F7f interfaceC384890F7f) {
        C11NZ<List<StickerItemModel>> c11nzLJIIIIZZ = q3().LJIIIIZZ();
        if (c11nzLJIIIIZZ == null) {
            return null;
        }
        o oVar = new o();
        this.LLIZ.LIZ(c11nzLJIIIIZZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS191S0100000_22(oVar, 20), C19487811Me.LIZLLL));
        return oVar.LIZ;
    }

    public final void F4(InterfaceC1452170ntP interfaceC1452170ntP) {
        NLEEditor nLEEditor;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        List listLLIIII;
        try {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
                String str = this.LLJLLL;
                String str2 = this.LLJZ;
                boolean z = false;
                if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
                    z = true;
                }
                for (NLETrackSlot nLETrackSlot : sortedSlots) {
                    VecNLEVideoAnimationSPtr videoAnims = nLETrackSlot.getVideoAnims();
                    if (videoAnims != null && (listLLIIII = C13LP.LLIIII(videoAnims)) != null) {
                        Iterator it2 = listLLIIII.iterator();
                        while (it2.hasNext()) {
                            nLETrackSlot.removeVideoAnim((NLEVideoAnimation) it2.next());
                        }
                    }
                    if (z) {
                        NLESegmentVideoAnimation nLESegmentVideoAnimation = new NLESegmentVideoAnimation();
                        nLESegmentVideoAnimation.setAnimJsonParam(str2);
                        NLEResourceNode nLEResourceNode = new NLEResourceNode();
                        nLEResourceNode.setResourceFile(str);
                        nLESegmentVideoAnimation.setEffectSDKVideoAnimation(nLEResourceNode);
                        NLEVideoAnimation nLEVideoAnimation = new NLEVideoAnimation();
                        nLEVideoAnimation.setSegment(nLESegmentVideoAnimation);
                        nLEVideoAnimation.setStartTime(nLETrackSlot.getStartTime());
                        nLEVideoAnimation.setEndTime(nLETrackSlot.getEndTime());
                        nLEVideoAnimation.setDuration(nLETrackSlot.getDuration());
                        nLETrackSlot.addVideoAnim(nLEVideoAnimation);
                    }
                }
                nLEEditor.commit();
                nLEEditor.done();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void P4(VEVideoTransformFilterParam vEVideoTransformFilterParam) {
        boolean z;
        if (!c3()) {
            Z1(vEVideoTransformFilterParam);
            return;
        }
        if (this.LLJJJ == null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJ = vEVideoTransformFilterParam;
        if (z) {
            v3().postFrameCallback(this.LLJJJIL);
        }
    }

    @Override // X.InterfaceC1450440nqc
    public void Sl(boolean z) {
        m3().LIZLLL(z);
    }

    @Override // X.InterfaceC1450440nqc
    public void TG2(CanvasFilterParam canvasFilterParam) {
        if (c3() && this.LLJJJ != null) {
            v3().removeFrameCallback(this.LLJJJIL);
            this.LLJJJ = null;
        }
        InterfaceC1452170ntP value = T2().g().getValue();
        if (value != null) {
            C346940Diu c346940Diu = new C346940Diu();
            c346940Diu.LIZJ = Float.valueOf(canvasFilterParam.getScaleFactor());
            c346940Diu.LIZLLL = Float.valueOf(canvasFilterParam.getTransX());
            c346940Diu.LJ = Float.valueOf(canvasFilterParam.getTransY());
            c346940Diu.LJFF = Float.valueOf(canvasFilterParam.getDegree());
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            if (c348100DkmLIZIZ != null) {
                c348100DkmLIZIZ.LIZJ().LJIIZILJ(c346940Diu);
                jf0(canvasFilterParam);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // X.InterfaceC1450440nqc
    public void X81(C0MM6 c0mm6) {
        o2(new AwS388S0200000_22(this, c0mm6, 115));
    }

    public final void Z1(VEVideoTransformFilterParam vEVideoTransformFilterParam) {
        o2(new AwS388S0200000_22(this, vEVideoTransformFilterParam, 114));
        if (LLLFZ) {
            E3(SystemClock.elapsedRealtime());
        }
    }

    @Override // X.InterfaceC1450440nqc
    public void cN(CanvasFilterParam canvasFilterParam) {
        i3().LJIIJJI.LIZIZ("default", canvasFilterParam);
    }

    @Override // X.InterfaceC1450440nqc
    public void jf0(CanvasFilterParam canvasFilterParam) {
        VEVideoTransformFilterParam vEVideoTransformFilterParamLJIILL = i3().LJIILL();
        vEVideoTransformFilterParamLJIILL.transX = canvasFilterParam.getTransX();
        vEVideoTransformFilterParamLJIILL.transY = canvasFilterParam.getTransY();
        vEVideoTransformFilterParamLJIILL.scaleFactor = canvasFilterParam.getScaleFactor();
        vEVideoTransformFilterParamLJIILL.degree = canvasFilterParam.getDegree();
    }

    private final void W1(NLEStyCanvas nLEStyCanvas, CanvasBackground canvasBackground) {
        int type = canvasBackground.getType();
        if (type != 2) {
            if (type != 3) {
                nLEStyCanvas.setType(NLECanvasType.COLOR);
                nLEStyCanvas.setColor(canvasBackground.getStartColor());
            } else {
                nLEStyCanvas.setType(NLECanvasType.IMAGE);
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.setResourceFile(canvasBackground.getFilePath());
                nLEStyCanvas.setImage(nLEResourceNode);
            }
        } else {
            nLEStyCanvas.setType(NLECanvasType.GRADIENT_COLOR);
            nLEStyCanvas.setStartColor(canvasBackground.getStartColor());
            nLEStyCanvas.setEndColor(canvasBackground.getEndColor());
        }
        nLEStyCanvas.setAntialiasing(true);
    }

    private final void z4(InterfaceC1452170ntP interfaceC1452170ntP, CanvasBackground canvasBackground) {
        NLEEditor nLEEditor;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLEStyCanvas canvasStyle;
        try {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
                Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
                while (it2.hasNext()) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) it2.next().getMainSegment());
                    if (nLESegmentVideoDynamicCast != null && (canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) != null) {
                        W1(canvasStyle, canvasBackground);
                    }
                }
                nLEEditor.commit();
                nLEEditor.done();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.0nqz] */
    public C1450640nqw(C1DRG c1drg, C19A3 c19a3, int i, Function0<? extends InterfaceC1461390o8H> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        this.LLILZ = function0;
    }

    private final void O4(final InterfaceC1452170ntP interfaceC1452170ntP, final View view, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8, Function0<Unit> function0) {
        ValueAnimator valueAnimator = this.LLJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(160L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0nq0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue;
                C0FWA c0fwaLIZJ;
                Float f9;
                Object animatedValue = valueAnimator2.getAnimatedValue();
                if ((animatedValue instanceof Float) && (f9 = (Float) animatedValue) != null) {
                    fFloatValue = f9.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                View view2 = view;
                float f10 = f7;
                C786410Ut5.T4(view2, f10 + ((f8 - f10) * fFloatValue));
                float f11 = f;
                float f12 = f11 + ((f2 - f11) * fFloatValue);
                float f13 = f3;
                float f14 = f13 + ((f4 - f13) * fFloatValue);
                float f15 = f5;
                float f16 = f15 + ((f6 - f15) * fFloatValue);
                try {
                    C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
                    if (c348100DkmLIZIZ != null && (c0fwaLIZJ = c348100DkmLIZIZ.LIZJ()) != null) {
                        C346940Diu c346940Diu = new C346940Diu();
                        c346940Diu.LIZJ = Float.valueOf(f12);
                        c346940Diu.LIZLLL = Float.valueOf(f14);
                        c346940Diu.LJ = Float.valueOf(f16);
                        c0fwaLIZJ.LJIIZILJ(c346940Diu);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS17S0200000_22(this, function0, 2));
        valueAnimatorOfFloat.start();
        this.LLJL = valueAnimatorOfFloat;
    }
}
