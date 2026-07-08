package X;

import Y.AObserverS209S0100000_5;
import android.app.Activity;
import android.graphics.RectF;
import android.util.Size;
import android.view.SurfaceView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.ImageStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363860EOi extends AbstractC381020Ewm<InterfaceC363820EOe> implements InterfaceC363820EOe, InterfaceC379610EuV {
    public static final C364030EOz LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C1DRG LLILLL;
    public final InterfaceC363820EOe LLILZ;
    public final InterfaceC1731706qJ LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final C01GW LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public List<? extends NLETrack> LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public Long LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final C363870EOj LLJJJIL;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0EOz] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C363860EOi.class, "videoSizeProvider", "getVideoSizeProvider()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C363860EOi.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0), new C2217381BqS(C363860EOi.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C363860EOi.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0), new C2217381BqS(C363860EOi.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0), new C2217381BqS(C363860EOi.class, "textEditPanelApi", "getTextEditPanelApi()Lcom/ss/android/ugc/editorpro/components/api/text/editpanel/EPTextEditPanelApi;", 0), new C2217381BqS(C363860EOi.class, "consoleBar", "getConsoleBar()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0)};
        LLJJJJ = new Object() { // from class: X.0EOz
        };
        LLJJJJLIIL = 8;
    }

    private final InterfaceC361710EGb B3() {
        return (InterfaceC361710EGb) this.LLJ.getValue(this, LLJJJJJIL[4]);
    }

    private final InterfaceC360800ECo G2() {
        return (InterfaceC360800ECo) this.LLJILJIL.getValue(this, LLJJJJJIL[6]);
    }

    private final InterfaceC1452170ntP H3() {
        return (InterfaceC1452170ntP) this.LLJJI.getValue();
    }

    private final InterfaceC1444130ngR LLJIJIL() {
        return (InterfaceC1444130ngR) this.LLILZIL.getValue(this, LLJJJJJIL[0]);
    }

    private final C0EY2 W2() {
        return (C0EY2) this.LLILZLL.getValue(this, LLJJJJJIL[1]);
    }

    private final C363890EOl v3() {
        return (C363890EOl) this.LLJJ.getValue();
    }

    public final InterfaceC384330F5b E3() {
        return (InterfaceC384330F5b) this.LLJI.getValue(this, LLJJJJJIL[5]);
    }

    @Override // X.InterfaceC363820EOe
    public List<NLETrack> Gd1() {
        List list = this.LLJILJILJ;
        return list == null ? C13BV.INSTANCE : list;
    }

    public final InterfaceC1455860nzM H2() {
        return (InterfaceC1455860nzM) this.LLIZ.getValue(this, LLJJJJJIL[2]);
    }

    @Override // X.InterfaceC363820EOe
    public C0FEQ LJIIJ() {
        return new C0FEQ() { // from class: X.0EOk
            @Override // X.C0FEQ
            public final C0EPF LIZJ() {
                return this.LIZ.c3();
            }

            @Override // X.C0FEQ
            public final boolean LIZIZ(int i) {
                return this.LIZ.O3(i);
            }

            @Override // X.C0FEQ
            public final boolean LIZ(int i, boolean z) {
                C0FHM c0fhmLIZJ;
                C385670FAf<C0FHM> c385670FAfS1;
                NLETrackSlot nLETrackSlotLLLLLLIL;
                C0E48 c0e48W1 = this.LIZ.W1();
                if (c0e48W1 != null && (nLETrackSlotLLLLLLIL = c0e48W1.LLLLLLIL()) != null && C351220Dpo.LLLIIIL(nLETrackSlotLLLLLLIL)) {
                    return true;
                }
                C363860EOi c363860EOi = this.LIZ;
                if (c363860EOi.LLJJIJIL || c363860EOi.LLJJJ) {
                    return true;
                }
                InterfaceC384330F5b interfaceC384330F5bE3 = c363860EOi.E3();
                if (interfaceC384330F5bE3 != null && (c385670FAfS1 = interfaceC384330F5bE3.S1()) != null) {
                    c0fhmLIZJ = c385670FAfS1.LIZJ();
                } else {
                    c0fhmLIZJ = null;
                }
                if (c0fhmLIZJ == C0FHM.VISIBLE) {
                    return true;
                }
                if (z) {
                    return false;
                }
                return !this.LIZ.O3(i);
            }
        };
    }

    public final C0EOK T2() {
        return (C0EOK) this.LLIZLLLIL.getValue(this, LLJJJJJIL[3]);
    }

    public final C0EPF c3() {
        return (C0EPF) this.LLJJIJI.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        if (C364210EPr.LIZIZ) {
            EditModelProvider.Companion.getClass();
            VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
            if (editModel != null) {
                return editModel;
            }
        }
        return new VideoPublishEditModel();
    }

    public final C0EKY i3() {
        return (C0EKY) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC363820EOe
    public void k1() {
        if (this.LLJJIII == null) {
            C0E48 c0e48W1 = W1();
            this.LLJJIII = c0e48W1 != null ? Long.valueOf(C350870DpF.LJI(c0e48W1).getMaxTargetEnd()) : null;
            return;
        }
        C0E48 c0e48W12 = W1();
        Long lValueOf = c0e48W12 != null ? Long.valueOf(C350870DpF.LJI(c0e48W12).getMaxTargetEnd()) : null;
        if (!Intrinsics.LJFF(lValueOf, this.LLJJIII)) {
            L51(null);
        }
        this.LLJJIII = lValueOf;
    }

    public final C0EP2 m3() {
        return (C0EP2) this.LLJIJIL.getValue();
    }

    private final int q3() {
        VecNLETrackSPtr tracks;
        Object next;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (tracks = C350870DpF.LJI(c0e48W1).getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (C351220Dpo.LLJLILLLLZIIL(nLETrack2) || C351220Dpo.LLJJJJ(nLETrack2) || C351220Dpo.LLJLLIL(nLETrack2)) {
                    arrayList.add(nLETrack);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
            }
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int layer = ((NLETimeSpaceNode) next).getLayer();
                    do {
                        Object next2 = it3.next();
                        int layer2 = ((NLETimeSpaceNode) next2).getLayer();
                        if (layer < layer2) {
                            next = next2;
                            layer = layer2;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) next;
            if (nLETimeSpaceNode != null) {
                return nLETimeSpaceNode.getLayer() + 1;
            }
        }
        return 1;
    }

    @Override // X.InterfaceC363820EOe
    public List<InfoStickerModel> iF0() {
        List<StickerModel> listLLLILZLLLI;
        C0EOK c0eokT2 = T2();
        if (c0eokT2 == null || (listLLLILZLLLI = c0eokT2.LLLILZLLLI(EnumC1466150oFx.INFO)) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLLILZLLLI, 10));
        Iterator<StickerModel> it2 = listLLLILZLLLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // X.InterfaceC363820EOe
    public void xi0() {
        C0E48 c0e48W1 = W1();
        this.LLJILJILJ = c0e48W1 != null ? C351220Dpo.LJJJLL(C350870DpF.LJI(c0e48W1)) : null;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public InterfaceC363820EOe w2() {
        return this.LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.0EOj] */
    public C363860EOi(C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = this;
        this.LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444130ngR.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC384330F5b.class, null);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 680));
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 679));
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 681));
        this.LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 682));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(185));
        this.LLJJJIL = new C0FUD() { // from class: X.0EOj
            @Override // X.C0FUD
            public final boolean LJIILIIL() {
                return true;
            }

            @Override // X.C0FUD
            public final boolean LJIILJJIL(int i) {
                return false;
            }

            @Override // X.C0FUD
            public final boolean LJJIIJ(int i) {
                return false;
            }

            public final boolean LIZ(int i) {
                StickerModel stickerModelLLJJIJI;
                NLETrackSlot nLETrackSlotLLLLLLIL;
                C0EOK c0eokT2 = this.LL.T2();
                String uuid = null;
                if (c0eokT2 != null) {
                    stickerModelLLJJIJI = c0eokT2.LLJJIJI(i);
                } else {
                    stickerModelLLJJIJI = null;
                }
                if (!(stickerModelLLJJIJI instanceof InfoStickerModel)) {
                    return true;
                }
                String uuid2 = ((InfoStickerModel) stickerModelLLJJIJI).getUuid();
                C0E48 c0e48W1 = this.LL.W1();
                if (c0e48W1 != null && (nLETrackSlotLLLLLLIL = c0e48W1.LLLLLLIL()) != null) {
                    uuid = nLETrackSlotLLLLLLIL.getUUID();
                }
                return Intrinsics.LJFF(uuid2, uuid);
            }

            @Override // X.C0FUD
            public final boolean LJJIFFI(float f, int i, RectF rectF) {
                return !LIZ(i);
            }

            @Override // X.C0FUD
            public final boolean LJJII(float f, int i, RectF rectF) {
                return !LIZ(i);
            }

            @Override // X.C0FUD
            public final boolean LJIJJLI(float f, float f2, int i, RectF rectF, EnumC1466150oFx enumC1466150oFx) {
                return !LIZ(i);
            }
        };
    }

    private final void Q3(C0FEO c0feo) {
        C0FFP c0ffpLJJIL;
        if (c0feo != null && (c0ffpLJJIL = c0feo.LJJIL()) != null) {
            c0ffpLJJIL.LIZIZ();
        }
    }

    @Override // X.InterfaceC363820EOe
    public InfoStickerModel HS(String str) {
        InfoStickerModel next;
        Iterator<InfoStickerModel> it2 = iF0().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getUuid(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0429 A[PHI: r61
      0x0429: PHI (r61v12 java.lang.String) = (r61v0 java.lang.String), (r61v13 java.lang.String) binds: [B:148:0x0427, B:146:0x0421] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x042f A[PHI: r61
      0x042f: PHI (r61v11 java.lang.String) = (r61v0 java.lang.String), (r61v12 java.lang.String) binds: [B:148:0x0427, B:150:0x042d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0435 A[PHI: r61 r62
      0x0435: PHI (r61v1 java.lang.String) = (r61v11 java.lang.String), (r61v12 java.lang.String) binds: [B:152:0x0433, B:150:0x042d] A[DONT_GENERATE, DONT_INLINE]
      0x0435: PHI (r62v0 java.lang.String) = (r62v10 java.lang.String), (r62v11 java.lang.String) binds: [B:152:0x0433, B:150:0x042d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x043b A[PHI: r61 r62
      0x043b: PHI (r61v10 java.lang.String) = (r61v1 java.lang.String), (r61v11 java.lang.String) binds: [B:154:0x0439, B:152:0x0433] A[DONT_GENERATE, DONT_INLINE]
      0x043b: PHI (r62v9 java.lang.String) = (r62v0 java.lang.String), (r62v10 java.lang.String) binds: [B:154:0x0439, B:152:0x0433] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0441 A[PHI: r61 r62 r63
      0x0441: PHI (r61v9 java.lang.String) = (r61v1 java.lang.String), (r61v10 java.lang.String) binds: [B:154:0x0439, B:156:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x0441: PHI (r62v8 java.lang.String) = (r62v0 java.lang.String), (r62v9 java.lang.String) binds: [B:154:0x0439, B:156:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x0441: PHI (r63v8 java.lang.String) = (r63v0 java.lang.String), (r63v9 java.lang.String) binds: [B:154:0x0439, B:156:0x043f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0447 A[PHI: r61 r62 r63
      0x0447: PHI (r61v2 java.lang.String) = (r61v9 java.lang.String), (r61v10 java.lang.String) binds: [B:158:0x0445, B:156:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x0447: PHI (r62v1 java.lang.String) = (r62v8 java.lang.String), (r62v9 java.lang.String) binds: [B:158:0x0445, B:156:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x0447: PHI (r63v1 java.lang.String) = (r63v8 java.lang.String), (r63v9 java.lang.String) binds: [B:158:0x0445, B:156:0x043f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x044d A[PHI: r61 r62 r63 r68
      0x044d: PHI (r61v8 java.lang.String) = (r61v2 java.lang.String), (r61v9 java.lang.String) binds: [B:160:0x044b, B:158:0x0445] A[DONT_GENERATE, DONT_INLINE]
      0x044d: PHI (r62v7 java.lang.String) = (r62v1 java.lang.String), (r62v8 java.lang.String) binds: [B:160:0x044b, B:158:0x0445] A[DONT_GENERATE, DONT_INLINE]
      0x044d: PHI (r63v7 java.lang.String) = (r63v1 java.lang.String), (r63v8 java.lang.String) binds: [B:160:0x044b, B:158:0x0445] A[DONT_GENERATE, DONT_INLINE]
      0x044d: PHI (r68v6 java.lang.String) = (r68v0 java.lang.String), (r68v7 java.lang.String) binds: [B:160:0x044b, B:158:0x0445] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0453 A[PHI: r61 r62 r63 r68
      0x0453: PHI (r61v7 java.lang.String) = (r61v2 java.lang.String), (r61v8 java.lang.String) binds: [B:160:0x044b, B:162:0x0451] A[DONT_GENERATE, DONT_INLINE]
      0x0453: PHI (r62v6 java.lang.String) = (r62v1 java.lang.String), (r62v7 java.lang.String) binds: [B:160:0x044b, B:162:0x0451] A[DONT_GENERATE, DONT_INLINE]
      0x0453: PHI (r63v6 java.lang.String) = (r63v1 java.lang.String), (r63v7 java.lang.String) binds: [B:160:0x044b, B:162:0x0451] A[DONT_GENERATE, DONT_INLINE]
      0x0453: PHI (r68v5 java.lang.String) = (r68v0 java.lang.String), (r68v6 java.lang.String) binds: [B:160:0x044b, B:162:0x0451] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0459 A[PHI: r61 r62 r63 r67 r68
      0x0459: PHI (r61v3 java.lang.String) = (r61v7 java.lang.String), (r61v8 java.lang.String) binds: [B:164:0x0457, B:162:0x0451] A[DONT_GENERATE, DONT_INLINE]
      0x0459: PHI (r62v2 java.lang.String) = (r62v6 java.lang.String), (r62v7 java.lang.String) binds: [B:164:0x0457, B:162:0x0451] A[DONT_GENERATE, DONT_INLINE]
      0x0459: PHI (r63v2 java.lang.String) = (r63v6 java.lang.String), (r63v7 java.lang.String) binds: [B:164:0x0457, B:162:0x0451] A[DONT_GENERATE, DONT_INLINE]
      0x0459: PHI (r67v0 java.lang.String) = (r67v4 java.lang.String), (r67v5 java.lang.String) binds: [B:164:0x0457, B:162:0x0451] A[DONT_GENERATE, DONT_INLINE]
      0x0459: PHI (r68v1 java.lang.String) = (r68v5 java.lang.String), (r68v6 java.lang.String) binds: [B:164:0x0457, B:162:0x0451] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x045f A[PHI: r61 r62 r63 r67 r68
      0x045f: PHI (r61v6 java.lang.String) = (r61v3 java.lang.String), (r61v7 java.lang.String) binds: [B:166:0x045d, B:164:0x0457] A[DONT_GENERATE, DONT_INLINE]
      0x045f: PHI (r62v5 java.lang.String) = (r62v2 java.lang.String), (r62v6 java.lang.String) binds: [B:166:0x045d, B:164:0x0457] A[DONT_GENERATE, DONT_INLINE]
      0x045f: PHI (r63v5 java.lang.String) = (r63v2 java.lang.String), (r63v6 java.lang.String) binds: [B:166:0x045d, B:164:0x0457] A[DONT_GENERATE, DONT_INLINE]
      0x045f: PHI (r67v3 java.lang.String) = (r67v0 java.lang.String), (r67v4 java.lang.String) binds: [B:166:0x045d, B:164:0x0457] A[DONT_GENERATE, DONT_INLINE]
      0x045f: PHI (r68v4 java.lang.String) = (r68v1 java.lang.String), (r68v5 java.lang.String) binds: [B:166:0x045d, B:164:0x0457] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0550 A[PHI: r3 r6 r7
      0x0550: PHI (r3v15 boolean) = (r3v14 boolean), (r3v17 boolean), (r3v17 boolean) binds: [B:205:0x0584, B:192:0x054a, B:194:0x054e] A[DONT_GENERATE, DONT_INLINE]
      0x0550: PHI (r6v11 float) = (r6v10 float), (r6v13 float), (r6v13 float) binds: [B:205:0x0584, B:192:0x054a, B:194:0x054e] A[DONT_GENERATE, DONT_INLINE]
      0x0550: PHI (r7v15 float) = (r7v14 float), (r7v17 float), (r7v17 float) binds: [B:205:0x0584, B:192:0x054a, B:194:0x054e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x057d A[PHI: r7
      0x057d: PHI (r7v13 float) = (r7v12 float), (r7v19 float) binds: [B:199:0x057a, B:186:0x053a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0582 A[PHI: r6 r7
      0x0582: PHI (r6v10 float) = (r6v9 float), (r6v14 float) binds: [B:202:0x057f, B:189:0x0542] A[DONT_GENERATE, DONT_INLINE]
      0x0582: PHI (r7v14 float) = (r7v13 float), (r7v18 float) binds: [B:202:0x057f, B:189:0x0542] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0590 A[PHI: r61 r62 r63 r64 r67 r68
      0x0590: PHI (r61v4 java.lang.String) = (r61v3 java.lang.String), (r61v6 java.lang.String) binds: [B:166:0x045d, B:168:0x0463] A[DONT_GENERATE, DONT_INLINE]
      0x0590: PHI (r62v3 java.lang.String) = (r62v2 java.lang.String), (r62v5 java.lang.String) binds: [B:166:0x045d, B:168:0x0463] A[DONT_GENERATE, DONT_INLINE]
      0x0590: PHI (r63v3 java.lang.String) = (r63v2 java.lang.String), (r63v5 java.lang.String) binds: [B:166:0x045d, B:168:0x0463] A[DONT_GENERATE, DONT_INLINE]
      0x0590: PHI (r64v1 java.lang.String) = (r64v0 java.lang.String), (r64v3 java.lang.String) binds: [B:166:0x045d, B:168:0x0463] A[DONT_GENERATE, DONT_INLINE]
      0x0590: PHI (r67v1 java.lang.String) = (r67v0 java.lang.String), (r67v3 java.lang.String) binds: [B:166:0x045d, B:168:0x0463] A[DONT_GENERATE, DONT_INLINE]
      0x0590: PHI (r68v2 java.lang.String) = (r68v1 java.lang.String), (r68v4 java.lang.String) binds: [B:166:0x045d, B:168:0x0463] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC363820EOe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L51(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r79) {
        /*
            Method dump skipped, instruction units count: 1523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363860EOi.L51(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    @Override // X.InterfaceC363820EOe
    public void N(boolean z) {
        MutableLiveData<Boolean> mutableLiveDataEa1;
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        boolean z2;
        C0EY2 c0ey2W2 = W2();
        if (c0ey2W2 != null && (liveDataZu2 = c0ey2W2.zu2()) != null && (value = liveDataZu2.getValue()) != null) {
            this.LLJJIJIL = value.LJ.getEffectMultiTrackMode();
            if (value.LJ.getChangeBanMusicMode() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLJJJ = z2;
        }
        if (this.LLJJIJIIJIL) {
            return;
        }
        C0EOK c0eokT2 = T2();
        if (c0eokT2 != null) {
            c0eokT2.Jp(this.LLJJJIL);
        }
        C0EOK c0eokT22 = T2();
        if (c0eokT22 != null && (mutableLiveDataEa1 = c0eokT22.Ea1()) != null) {
            mutableLiveDataEa1.observe(this, new AObserverS209S0100000_5(this, 74));
        }
    }

    @Override // X.InterfaceC363820EOe
    public void N52(NLETrackSlot nLETrackSlot) {
        List<C0FEO> listKd2;
        C0FEO next;
        C0EOK c0eokT2 = T2();
        if (c0eokT2 != null && (listKd2 = c0eokT2.Kd2()) != null) {
            Iterator<C0FEO> it2 = listKd2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LJLI().getUuid(), nLETrackSlot.getUUID())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0FEO c0feo = next;
            if (c0feo != null) {
                Q3(c0feo);
            }
        }
    }

    public final boolean O3(int i) {
        StickerModel stickerModelLLJJIJI;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0EOK c0eokT2 = T2();
        String uuid = null;
        if (c0eokT2 != null) {
            stickerModelLLJJIJI = c0eokT2.LLJJIJI(i);
        } else {
            stickerModelLLJJIJI = null;
        }
        if (!(stickerModelLLJJIJI instanceof InfoStickerModel)) {
            return false;
        }
        String uuid2 = ((InfoStickerModel) stickerModelLLJJIJI).getUuid();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (nLETrackSlotLLLLLLIL = c0e48W1.LLLLLLIL()) != null) {
            uuid = nLETrackSlotLLLLLLIL.getUUID();
        }
        return Intrinsics.LJFF(uuid2, uuid);
    }

    @Override // X.InterfaceC363820EOe
    public void dY(InfoStickerModel infoStickerModel) {
        List<C0FEO> listKd2;
        C0FEO next;
        C0EOK c0eokT2 = T2();
        if (c0eokT2 != null && (listKd2 = c0eokT2.Kd2()) != null) {
            Iterator<C0FEO> it2 = listKd2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getStickerId() == infoStickerModel.getBaseStickerModel().getId()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0FEO c0feo = next;
            if (c0feo != null) {
                Q3(c0feo);
            }
        }
    }

    private final InfoStickerModel o2(Effect effect, String str) {
        String string;
        BaseStickerModel baseStickerModel = new BaseStickerModel(0, q3(), EnumC1466150oFx.INFO, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, "2", null, false, -7, 13, null);
        String unzipPath = effect.getUnzipPath();
        String str2 = (String) C13LP.LJJJLL(effect.getIconUrl().getUrlList());
        if (str2 == null) {
            str2 = "";
        }
        String effect_id = effect.getEffect_id();
        String panel = effect.getPanel();
        String resource_id = effect.getResource_id();
        int effectType = effect.getEffectType();
        int value = C0EKQ.EDITOR_PRO.getValue();
        if (C1462570oAB.LJIILLIIL(effect)) {
            string = EnumC356160Dxm.MAGNIFIER.toString();
        } else {
            List<String> tags = effect.getTags();
            if (tags != null && tags.contains("date")) {
                string = EnumC356160Dxm.DATE.toString();
            } else {
                List<String> tags2 = effect.getTags();
                if (tags2 != null && tags2.contains("time")) {
                    string = EnumC356160Dxm.TIME.toString();
                } else {
                    string = EnumC356160Dxm.NORMAL.toString();
                }
            }
        }
        return new InfoStickerModel(baseStickerModel, null, unzipPath, str2, effect_id, resource_id, effectType, 0, str, panel, null, false, true, true, true, false, value, string, false);
    }

    @Override // X.InterfaceC363820EOe
    public void aP0(Effect effect, String str) {
        InfoStickerModel infoStickerModel;
        C0E48 c0e48W1;
        NLETrackSlot nLETrackSlotLIZ;
        InterfaceC1444130ngR interfaceC1444130ngRLLJIJIL;
        LiveState<Size> canvasSize;
        Size sizeLIZJ;
        NLERectF nLERectF;
        INLEStickerRuntime stickerApi;
        C0EOK c0eokT2 = T2();
        if (c0eokT2 != null) {
            if (c0eokT2.Kd2().size() >= 30) {
                Activity activityLJII = C1664590tQ1.LJII(this);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131836170);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activityLJII, 1035, creativeToastBuilder);
                return;
            }
            InterfaceC361710EGb interfaceC361710EGbB3 = B3();
            if (interfaceC361710EGbB3 != null) {
                interfaceC361710EGbB3.LR1(false);
            }
            StickerModel stickerModelF3 = c0eokT2.f3(o2(effect, str), EnumC356070Dxd.COMMIT);
            if ((stickerModelF3 instanceof InfoStickerModel) && (infoStickerModel = (InfoStickerModel) stickerModelF3) != null && (c0e48W1 = W1()) != null && (nLETrackSlotLIZ = C346680DiU.LIZ(C350870DpF.LJI(c0e48W1), infoStickerModel.getUuid())) != null) {
                InterfaceC361710EGb interfaceC361710EGbB32 = B3();
                if (interfaceC361710EGbB32 != null && (canvasSize = interfaceC361710EGbB32.getCanvasSize()) != null && (sizeLIZJ = canvasSize.LIZJ()) != null) {
                    int width = sizeLIZJ.getWidth() / 3;
                    INLEMediaSession iNLEMediaSessionF1 = c0e48W1.f1();
                    if (iNLEMediaSessionF1 == null || (stickerApi = iNLEMediaSessionF1.getStickerApi()) == null || (nLERectF = stickerApi.getInfoStickerBoundingBox(nLETrackSlotLIZ.getUUID(), false)) == null) {
                        nLERectF = new NLERectF(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float fAbs = Math.abs(nLERectF.getTop() - nLERectF.getBottom());
                    float f = 2;
                    float fAbs2 = (Math.abs(nLERectF.getRight() - nLERectF.getLeft()) / f) * sizeLIZJ.getWidth();
                    float height = (fAbs / f) * sizeLIZJ.getHeight();
                    float f2 = width;
                    if (fAbs2 > f2 || height > f2) {
                        c0eokT2.k3(infoStickerModel.copy(BaseStickerModel.copy$default(infoStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (float) Math.min(f2 / fAbs2, f2 / height), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null), infoStickerModel.uuid, infoStickerModel.path, infoStickerModel.iconPath, infoStickerModel.stickerId, infoStickerModel.resId, infoStickerModel.effectType, infoStickerModel.type, infoStickerModel.extra, infoStickerModel.panel, infoStickerModel.imageStickerModel, infoStickerModel.isImageSticker, infoStickerModel.enableGesture, infoStickerModel.visible, infoStickerModel.enable, infoStickerModel.isPinning, infoStickerModel.sourceType, infoStickerModel.stickerType, infoStickerModel.isFromPUGCTemplate), EnumC356070Dxd.COMMIT);
                    }
                }
                c0e48W1.S7().LIZIZ(new C358740E4q(nLETrackSlotLIZ, 0, null, false, 0, 254), "select_slot_event", false);
                X1(nLETrackSlotLIZ, effect, C350870DpF.LJI(c0e48W1));
                nLETrackSlotLIZ.setExtra("infoStickerModel", C357150DzN.LIZIZ(infoStickerModel));
                if (((Boolean) C284630BDp.LIZ.getValue()).booleanValue() && ((getEditModel().getVideoCanvasWidth() <= 0 || getEditModel().getVideoCanvasHeight() <= 0) && (interfaceC1444130ngRLLJIJIL = LLJIJIL()) != null)) {
                    getEditModel().setVideoCanvasWidth(interfaceC1444130ngRLLJIJIL.LJFF());
                    getEditModel().setVideoCanvasHeight(interfaceC1444130ngRLLJIJIL.LIZJ());
                    getEditModel().setOutVideoWidth(interfaceC1444130ngRLLJIJIL.LIZLLL());
                    getEditModel().setOutVideoHeight(interfaceC1444130ngRLLJIJIL.LJI());
                }
            }
            C0E1X c0e1x = new C0E1X(C0E1V.ADD_STICKER.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W12 = W1();
            if (c0e48W12 != null) {
                C350870DpF.LIZJ(c0e48W12, C051R.LIZIZ(c0e1x));
            }
        }
    }

    @Override // X.InterfaceC363820EOe
    public void eN2(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        Iterator<StickerItemModel> it2;
        int i;
        List<StickerItemModel> list;
        List<StickerItemModel> list2;
        if (videoPublishEditModel != null) {
            com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
            if (infoStickerModel != null && (list2 = infoStickerModel.stickers) != null) {
                it2 = list2.iterator();
            } else {
                it2 = null;
            }
            while (true) {
                i = 0;
                if (it2 == null || !it2.hasNext()) {
                    break;
                } else if (C13LQ.LJLIIL(new Integer[]{29, 28, 11, 0, 31, 10}).contains(Integer.valueOf(it2.next().type))) {
                    it2.remove();
                }
            }
            Iterator<NLETrack> it3 = C351220Dpo.LJJJLIIL(nLEModel).iterator();
            while (it3.hasNext()) {
                VecNLETrackSlotSPtr sortedSlots = it3.next().getSortedSlots();
                ArrayList arrayList = new ArrayList();
                for (NLETrackSlot nLETrackSlot : sortedSlots) {
                    if (C351220Dpo.LLJJLIIIJLLLLLLLZ(nLETrackSlot)) {
                        arrayList.add(nLETrackSlot);
                    }
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    int i2 = i + 1;
                    StickerItemModel stickerItemModelRQ = rQ((NLETrackSlot) it4.next(), i);
                    if (stickerItemModelRQ != null) {
                        if (videoPublishEditModel.getInfoStickerModel() == null) {
                            videoPublishEditModel.setInfoStickerModel(new com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIJ(videoPublishEditModel)));
                        }
                        com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel infoStickerModel2 = videoPublishEditModel.getInfoStickerModel();
                        if (infoStickerModel2 != null && (list = infoStickerModel2.stickers) != null) {
                            list.add(stickerItemModelRQ);
                        }
                    }
                    i = i2;
                }
            }
        }
    }

    @Override // X.InterfaceC363820EOe
    public void hZ(Effect effect, String str) {
        String resId;
        String panel;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlotLJJJLL;
        LiveState<Size> canvasSize;
        Size sizeLIZJ;
        NLERectF nLERectF;
        INLEMediaSession iNLEMediaSessionF1;
        INLEStickerRuntime stickerApi;
        InfoStickerModel infoStickerModelO2 = o2(effect, str);
        String iconPath = infoStickerModelO2.getIconPath();
        String path = infoStickerModelO2.getPath();
        String stickerId = infoStickerModelO2.getStickerId();
        if (infoStickerModelO2.getEffectType() != 10) {
            resId = infoStickerModelO2.getResId();
        } else {
            resId = null;
        }
        if (infoStickerModelO2.getEffectType() != 10) {
            String panel2 = infoStickerModelO2.getPanel();
            if (panel2 != null && panel2.length() != 0) {
                panel = infoStickerModelO2.getPanel();
            } else {
                panel = "infostickerv2";
            }
        } else {
            panel = null;
        }
        C350910DpJ c350910DpJ = new C350910DpJ(iconPath, path, stickerId, 0.0f, 0.0f, null, null, resId, panel, 0, 0, null, null, 15736);
        InterfaceC361710EGb interfaceC361710EGbB3 = B3();
        if (interfaceC361710EGbB3 != null) {
            interfaceC361710EGbB3.LR1(false);
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (interfaceC351350Dq1LLFII = c0e48W1.LLFII()) != null && (nLETrackSlotLJJJLL = interfaceC351350Dq1LLFII.LJJJLL(C089X.INFO, c350910DpJ, EnumC356070Dxd.COMMIT)) != null) {
            InfoStickerModel infoStickerModelLIZ = C0EKP.LIZ(nLETrackSlotLJJJLL, W1());
            InfoStickerModel infoStickerModelCopy = infoStickerModelLIZ.copy(infoStickerModelLIZ.baseStickerModel, infoStickerModelLIZ.uuid, infoStickerModelLIZ.path, infoStickerModelLIZ.iconPath, infoStickerModelLIZ.stickerId, infoStickerModelO2.getResId(), infoStickerModelO2.getEffectType(), infoStickerModelLIZ.type, infoStickerModelO2.getExtra(), infoStickerModelO2.getPanel(), infoStickerModelLIZ.imageStickerModel, infoStickerModelLIZ.isImageSticker, infoStickerModelLIZ.enableGesture, infoStickerModelLIZ.visible, infoStickerModelLIZ.enable, infoStickerModelLIZ.isPinning, infoStickerModelLIZ.sourceType, infoStickerModelLIZ.stickerType, infoStickerModelLIZ.isFromPUGCTemplate);
            C0E48 c0e48W12 = W1();
            if (c0e48W12 != null) {
                X1(nLETrackSlotLJJJLL, effect, C350870DpF.LJI(c0e48W12));
            }
            nLETrackSlotLJJJLL.setExtra("infoStickerModel", C357150DzN.LIZIZ(infoStickerModelCopy));
            InterfaceC361710EGb interfaceC361710EGbB32 = B3();
            if (interfaceC361710EGbB32 != null && (canvasSize = interfaceC361710EGbB32.getCanvasSize()) != null && (sizeLIZJ = canvasSize.LIZJ()) != null) {
                int width = sizeLIZJ.getWidth() / 3;
                C0E48 c0e48W13 = W1();
                if (c0e48W13 == null || (iNLEMediaSessionF1 = c0e48W13.f1()) == null || (stickerApi = iNLEMediaSessionF1.getStickerApi()) == null || (nLERectF = stickerApi.getInfoStickerBoundingBox(nLETrackSlotLJJJLL.getUUID(), false)) == null) {
                    nLERectF = new NLERectF(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fAbs = Math.abs(nLERectF.getTop() - nLERectF.getBottom());
                float f = 2;
                float fAbs2 = (Math.abs(nLERectF.getRight() - nLERectF.getLeft()) / f) * sizeLIZJ.getWidth();
                float height = (fAbs / f) * sizeLIZJ.getHeight();
                float f2 = width;
                if (fAbs2 > f2 || height > f2) {
                    nLETrackSlotLJJJLL.setScale((float) Math.min(f2 / fAbs2, f2 / height));
                }
            }
            C0E1X c0e1x = new C0E1X(C0E1V.REPLACE_STICKER.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W14 = W1();
            if (c0e48W14 != null) {
                C350870DpF.LIZJ(c0e48W14, C051R.LIZIZ(c0e1x));
            }
            L51(null);
            C0E48 c0e48W15 = W1();
            if (c0e48W15 != null) {
                c0e48W15.S7().LIZIZ(new C358740E4q(nLETrackSlotLJJJLL, 0, null, false, 0, 254), "select_slot_event", false);
            }
        }
    }

    @Override // X.InterfaceC363820EOe
    public StickerItemModel rQ(NLETrackSlot nLETrackSlot, int i) {
        int i2;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        Map<String, String> map;
        String str5;
        Integer numLJIIJJI;
        Map<String, String> map2;
        Map<String, String> map3;
        Map<String, String> map4;
        InfoStickerModel infoStickerModelHS = HS(nLETrackSlot.getUUID());
        String str6 = null;
        if (infoStickerModelHS == null) {
            return null;
        }
        Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(nLETrackSlot, "StickerSourceType", Integer.valueOf(C0EKQ.EDIT.getValue()));
        StickerItemModel stickerItemModel = new StickerItemModel(infoStickerModelHS.getStickerId(), infoStickerModelHS.getPath(), infoStickerModelHS.getExtra(), infoStickerModelHS.getBaseStickerModel().getZIndex(), false, (int) infoStickerModelHS.getBaseStickerModel().getStartTime(), (int) infoStickerModelHS.getBaseStickerModel().getEndTime(), infoStickerModelHS.getType());
        stickerItemModel.uuid = nLETrackSlot.getUUID();
        stickerItemModel.panel = infoStickerModelHS.getPanel();
        stickerItemModel.x = nLETrackSlot.getTransformX();
        stickerItemModel.y = nLETrackSlot.getTransformY();
        float f = 2;
        stickerItemModel.currentOffsetX = (nLETrackSlot.getTransformX() / f) + 0.5f;
        stickerItemModel.currentOffsetY = 0.5f - (nLETrackSlot.getTransformY() / f);
        stickerItemModel.initWidth = infoStickerModelHS.getBaseStickerModel().getWidth();
        stickerItemModel.initHeight = infoStickerModelHS.getBaseStickerModel().getHeight();
        int iIntValue = 0;
        if (C351220Dpo.LLJJJIL(nLETrackSlot)) {
            i2 = 11;
        } else {
            i2 = 0;
        }
        stickerItemModel.type = i2;
        stickerItemModel.scale = nLETrackSlot.getScale();
        stickerItemModel.rotateAngle = -nLETrackSlot.getRotation();
        long startTime = nLETrackSlot.getStartTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        stickerItemModel.startTime = (int) (startTime / j);
        int endTime = (int) (nLETrackSlot.getEndTime() / j);
        stickerItemModel.endTime = endTime;
        stickerItemModel.uiStartTime = stickerItemModel.startTime;
        stickerItemModel.uiEndTime = endTime;
        boolean zLLLIIIL = C351220Dpo.LLLIIIL(nLETrackSlot);
        stickerItemModel.isPin = zLLLIIIL;
        if (zLLLIIIL) {
            str = stickerItemModel.pinAlgorithmFile;
        } else {
            str = null;
        }
        stickerItemModel.pinAlgorithmFile = str;
        if (zLLLIIIL) {
            str2 = stickerItemModel.pinAlgorithmMappingFile;
        } else {
            str2 = null;
        }
        stickerItemModel.pinAlgorithmMappingFile = str2;
        stickerItemModel.layerWeight = i;
        int value = C0EKQ.EDITOR_PRO.getValue();
        if (numLJJJLZIJ != null && numLJJJLZIJ.intValue() == value) {
            z = true;
        } else {
            z = false;
        }
        stickerItemModel.isFromEditorPro = z;
        stickerItemModel.stickerSource = infoStickerModelHS.getBaseStickerModel().getStickerSource();
        ImageStickerModel imageStickerModel = infoStickerModelHS.getImageStickerModel();
        if (imageStickerModel != null && (map4 = imageStickerModel.extra) != null) {
            str3 = map4.get("extra");
        } else {
            str3 = null;
        }
        stickerItemModel.extra = str3;
        ImageStickerModel imageStickerModel2 = infoStickerModelHS.getImageStickerModel();
        if (imageStickerModel2 != null && (map3 = imageStickerModel2.extra) != null) {
            str4 = map3.get("extra2");
        } else {
            str4 = null;
        }
        stickerItemModel.extra2 = str4;
        C0EP3 c0ep3 = AIGCInfo.Companion;
        ImageStickerModel imageStickerModel3 = infoStickerModelHS.getImageStickerModel();
        if (imageStickerModel3 != null && (map2 = imageStickerModel3.extra) != null) {
            str6 = map2.get("aigc_info");
        }
        c0ep3.getClass();
        stickerItemModel.aigcInfo = C0EP3.LIZ(str6);
        ImageStickerModel imageStickerModel4 = infoStickerModelHS.getImageStickerModel();
        if (imageStickerModel4 != null && (map = imageStickerModel4.extra) != null && (str5 = map.get("info_sticker_subtype")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str5)) != null) {
            iIntValue = numLJIIJJI.intValue();
        }
        stickerItemModel.infoStickerSubtype = iIntValue;
        stickerItemModel.setFromPugcTemplate(infoStickerModelHS.isFromPUGCTemplate());
        return stickerItemModel;
    }

    @Override // X.InterfaceC363820EOe
    public void wx1(String str, boolean z) {
        C0EOK c0eokT2;
        InfoStickerModel infoStickerModelHS = HS(str);
        if (infoStickerModelHS != null && (c0eokT2 = T2()) != null) {
            c0eokT2.gN1(infoStickerModelHS.getId(), z, EnumC356070Dxd.COMMIT);
        }
    }

    private final void X1(NLETrackSlot nLETrackSlot, Effect effect, NLEModel nLEModel) {
        if (nLETrackSlot != null) {
            nLETrackSlot.setExtra("ep_slot_add_order", String.valueOf(C351220Dpo.LJJJJZ(nLEModel)));
            nLETrackSlot.setExtra("is_editor_pro_sticker", String.valueOf(C0EKQ.EDITOR_PRO.getValue()));
            if (C1462570oAB.LJIILLIIL(effect)) {
                nLETrackSlot.setExtra("sticker_type", EnumC356160Dxm.MAGNIFIER.toString());
                return;
            }
            List<String> tags = effect.getTags();
            if (tags != null && tags.contains("date")) {
                nLETrackSlot.setExtra("sticker_type", EnumC356160Dxm.DATE.toString());
                return;
            }
            List<String> tags2 = effect.getTags();
            if (tags2 == null || !tags2.contains("time")) {
                return;
            }
            nLETrackSlot.setExtra("sticker_type", EnumC356160Dxm.TIME.toString());
        }
    }

    private final InfoStickerModel Z1(String str, String str2, int i, int i2, boolean z, Map<String, String> map) {
        SurfaceView surfaceViewLJIJJLI;
        int width;
        int height;
        map.get("extra");
        map.get("extra2");
        float[] fArrLIZ = C0EP0.LIZ(i, i2);
        InterfaceC361710EGb interfaceC361710EGbB3 = B3();
        if (interfaceC361710EGbB3 != null) {
            surfaceViewLJIJJLI = interfaceC361710EGbB3.LJIJJLI();
        } else {
            surfaceViewLJIJJLI = null;
        }
        int[] iArr = new int[2];
        if (surfaceViewLJIJJLI != null) {
            width = surfaceViewLJIJJLI.getWidth();
        } else {
            width = 1;
        }
        iArr[0] = width;
        if (surfaceViewLJIJJLI != null) {
            height = surfaceViewLJIJJLI.getHeight();
        } else {
            height = 1;
        }
        iArr[1] = height;
        float f = fArrLIZ[0] / iArr[0];
        float f2 = fArrLIZ[1] / height;
        int value = C0EKQ.EDITOR_PRO.getValue();
        String string = EnumC356160Dxm.CUSTOM.toString();
        EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.INFO;
        String str3 = map.get("sticker_source");
        if (str3 == null) {
            str3 = "2";
        }
        return new InfoStickerModel(new BaseStickerModel(0, 0, enumC1466150oFx, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, str3, null, false, -5, 13, null), null, str2, str2, str, "", 0, 0, null, null, new ImageStickerModel(f, f2, z, map), true, true, true, true, false, value, string, false);
    }

    @Override // X.InterfaceC363820EOe
    public void Pz1(String str, String str2, int i, int i2, boolean z, Map<String, String> map) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        float f;
        float f2;
        NLERectF nLERectF;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        final NLETrackSlot nLETrackSlotLJJJLL;
        long jJh;
        C0E55 player;
        C0E55 player2;
        INLEMediaSession iNLEMediaSessionF1;
        INLEStickerRuntime stickerApi;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (nLETrackSlotLLLLLLIL = c0e48W1.LLLLLLIL()) != null) {
            final InfoStickerModel infoStickerModelZ1 = Z1(str, str2, i, i2, z, map);
            String path = infoStickerModelZ1.getPath();
            String path2 = infoStickerModelZ1.getPath();
            ImageStickerModel imageStickerModel = infoStickerModelZ1.getImageStickerModel();
            if (imageStickerModel != null) {
                f = imageStickerModel.width;
            } else {
                f = 0.5f;
            }
            ImageStickerModel imageStickerModel2 = infoStickerModelZ1.getImageStickerModel();
            if (imageStickerModel2 != null) {
                f2 = imageStickerModel2.height;
            } else {
                f2 = 0.5f;
            }
            C350910DpJ c350910DpJ = new C350910DpJ(path, path2, null, f, f2, null, null, null, null, 0, 0, null, null, 16356);
            C0E48 c0e48W12 = W1();
            if (c0e48W12 == null || (iNLEMediaSessionF1 = c0e48W12.f1()) == null || (stickerApi = iNLEMediaSessionF1.getStickerApi()) == null || (nLERectF = stickerApi.getInfoStickerBoundingBox(nLETrackSlotLLLLLLIL.getUUID(), false)) == null) {
                nLERectF = new NLERectF(0.0f, 0.0f, 0.0f, 0.0f);
            }
            final float fAbs = Math.abs(nLERectF.getTop() - nLERectF.getBottom());
            C0E48 c0e48W13 = W1();
            if (c0e48W13 != null && (interfaceC351350Dq1LLFII = c0e48W13.LLFII()) != null && (nLETrackSlotLJJJLL = interfaceC351350Dq1LLFII.LJJJLL(C089X.IMAGE, c350910DpJ, EnumC356070Dxd.COMMIT)) != null) {
                C0E48 c0e48W14 = W1();
                if (c0e48W14 != null && (player2 = c0e48W14.getPlayer()) != null) {
                    jJh = player2.Jh();
                } else {
                    jJh = 0;
                }
                C0E48 c0e48W15 = W1();
                if (c0e48W15 != null && (player = c0e48W15.getPlayer()) != null) {
                    player.ba(jJh, new INLEListenerSeek() { // from class: X.0EOg
                        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
                        public final void onSeekDone(int i3) {
                            final C363860EOi c363860EOi = this.LIZ;
                            final NLETrackSlot nLETrackSlot = nLETrackSlotLJJJLL;
                            final float f3 = fAbs;
                            final InfoStickerModel infoStickerModel = infoStickerModelZ1;
                            LifecycleOwnerExtensionsKt.LIZ(c363860EOi, new Runnable() { // from class: X.0EOf
                                public final void LIZ() {
                                    NLERectF nLERectF2;
                                    ImageStickerModel imageStickerModel3;
                                    boolean z2;
                                    ImageStickerModel imageStickerModel4;
                                    Map<String, String> mapLJ;
                                    INLEMediaSession iNLEMediaSessionF12;
                                    INLEStickerRuntime stickerApi2;
                                    C0E48 c0e48W16 = c363860EOi.W1();
                                    if (c0e48W16 == null || (iNLEMediaSessionF12 = c0e48W16.f1()) == null || (stickerApi2 = iNLEMediaSessionF12.getStickerApi()) == null || (nLERectF2 = stickerApi2.getInfoStickerBoundingBox(nLETrackSlot.getUUID(), false)) == null) {
                                        nLERectF2 = new NLERectF(0.0f, 0.0f, 0.0f, 0.0f);
                                    }
                                    float fAbs2 = Math.abs(nLERectF2.getTop() - nLERectF2.getBottom());
                                    nLETrackSlot.setScale(Math.min(fAbs2 > 0.0f ? Math.max(0.2f, f3 / fAbs2) : 1.0f, 10.0f));
                                    InfoStickerModel infoStickerModelLIZ = C0EKP.LIZ(nLETrackSlot, c363860EOi.W1());
                                    ImageStickerModel imageStickerModel5 = infoStickerModelLIZ.getImageStickerModel();
                                    if (imageStickerModel5 != null) {
                                        ImageStickerModel imageStickerModel6 = infoStickerModel.getImageStickerModel();
                                        if (imageStickerModel6 != null) {
                                            z2 = imageStickerModel6.cutout;
                                        } else {
                                            ImageStickerModel imageStickerModel7 = infoStickerModelLIZ.getImageStickerModel();
                                            z2 = imageStickerModel7 != null ? imageStickerModel7.cutout : true;
                                        }
                                        ImageStickerModel imageStickerModel8 = infoStickerModel.getImageStickerModel();
                                        if ((imageStickerModel8 == null || (mapLJ = imageStickerModel8.extra) == null) && ((imageStickerModel4 = infoStickerModelLIZ.getImageStickerModel()) == null || (mapLJ = imageStickerModel4.extra) == null)) {
                                            mapLJ = C2097608Jq.LJ();
                                        }
                                        imageStickerModel3 = new ImageStickerModel(imageStickerModel5.width, imageStickerModel5.height, z2, mapLJ);
                                    } else {
                                        imageStickerModel3 = infoStickerModel.getImageStickerModel();
                                    }
                                    InfoStickerModel infoStickerModelCopy = infoStickerModelLIZ.copy(infoStickerModelLIZ.baseStickerModel, infoStickerModelLIZ.uuid, infoStickerModelLIZ.path, infoStickerModelLIZ.iconPath, infoStickerModelLIZ.stickerId, infoStickerModelLIZ.resId, infoStickerModelLIZ.effectType, infoStickerModelLIZ.type, infoStickerModelLIZ.extra, infoStickerModelLIZ.panel, imageStickerModel3, infoStickerModelLIZ.isImageSticker, infoStickerModelLIZ.enableGesture, infoStickerModelLIZ.visible, infoStickerModelLIZ.enable, infoStickerModelLIZ.isPinning, infoStickerModelLIZ.sourceType, infoStickerModelLIZ.stickerType, infoStickerModelLIZ.isFromPUGCTemplate);
                                    C0E48 c0e48W17 = c363860EOi.W1();
                                    if (c0e48W17 != null) {
                                        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                                        nLETrackSlot2.setExtra("ep_slot_add_order", String.valueOf(C351220Dpo.LJJJJZ(C350870DpF.LJI(c0e48W17))));
                                        nLETrackSlot2.setExtra("is_editor_pro_sticker", "1");
                                    }
                                    nLETrackSlot.setExtra("infoStickerModel", C357150DzN.LIZIZ(infoStickerModelCopy));
                                    C0E1X c0e1x = new C0E1X(C0E1V.REPLACE_STICKER.getNameId(), null, null, null, null, 30);
                                    C0E48 c0e48W18 = c363860EOi.W1();
                                    if (c0e48W18 != null) {
                                        C350870DpF.LIZJ(c0e48W18, C051R.LIZIZ(c0e1x));
                                    }
                                    c363860EOi.L51(null);
                                    C0E48 c0e48W19 = c363860EOi.W1();
                                    if (c0e48W19 != null) {
                                        c0e48W19.S7().LIZIZ(new C358740E4q(nLETrackSlot, 0, null, false, 0, 254), "select_slot_event", false);
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("EditorProInfoStickerComponent@5677.replaceImageSticker$1$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("EditorProInfoStickerComponent@5677.replaceImageSticker$1$1");
                                }
                            });
                        }
                    });
                }
            }
        }
    }

    @Override // X.InterfaceC363820EOe
    public void m9(String str, String str2, int i, int i2, boolean z, Map<String, String> map) {
        InfoStickerModel infoStickerModel;
        C0E48 c0e48W1;
        InterfaceC1444130ngR interfaceC1444130ngRLLJIJIL;
        C0EOK c0eokT2 = T2();
        if (c0eokT2 != null) {
            if (c0eokT2.Kd2().size() >= 30) {
                Activity activityLJII = C1664590tQ1.LJII(this);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131836170);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activityLJII, 1035, creativeToastBuilder);
                return;
            }
            StickerModel stickerModelF3 = c0eokT2.f3(Z1(str, str2, i, i2, z, map), EnumC356070Dxd.COMMIT);
            if ((stickerModelF3 instanceof InfoStickerModel) && (infoStickerModel = (InfoStickerModel) stickerModelF3) != null && (c0e48W1 = W1()) != null) {
                NLETrackSlot nLETrackSlotLIZ = C346680DiU.LIZ(C350870DpF.LJI(c0e48W1), infoStickerModel.getUuid());
                c0e48W1.S7().LIZIZ(new C358740E4q(nLETrackSlotLIZ, 0, null, false, 0, 254), "select_slot_event", false);
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48W1);
                int iLJJJJZ = C351220Dpo.LJJJJZ(nLEModelLJI);
                if (nLETrackSlotLIZ != null) {
                    nLETrackSlotLIZ.setExtra("ep_slot_add_order", String.valueOf(iLJJJJZ));
                    nLETrackSlotLIZ.setExtra("is_editor_pro_sticker", String.valueOf(C0EKQ.EDITOR_PRO.getValue()));
                }
                NLETrackSlot nLETrackSlotLIZ2 = C357150DzN.LIZ(infoStickerModel, nLEModelLJI);
                if (nLETrackSlotLIZ2 != null) {
                    nLETrackSlotLIZ2.setExtra("infoStickerModel", C357150DzN.LIZIZ(infoStickerModel));
                }
                if (((Boolean) C284630BDp.LIZ.getValue()).booleanValue() && ((getEditModel().getVideoCanvasWidth() <= 0 || getEditModel().getVideoCanvasHeight() <= 0) && (interfaceC1444130ngRLLJIJIL = LLJIJIL()) != null)) {
                    getEditModel().setVideoCanvasWidth(interfaceC1444130ngRLLJIJIL.LJFF());
                    getEditModel().setVideoCanvasHeight(interfaceC1444130ngRLLJIJIL.LIZJ());
                    getEditModel().setOutVideoWidth(interfaceC1444130ngRLLJIJIL.LIZLLL());
                    getEditModel().setOutVideoHeight(interfaceC1444130ngRLLJIJIL.LJI());
                }
            }
            C0E1X c0e1x = new C0E1X(C0E1V.ADD_STICKER.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W12 = W1();
            if (c0e48W12 != null) {
                C350870DpF.LIZJ(c0e48W12, C051R.LIZIZ(c0e1x));
            }
        }
    }
}
