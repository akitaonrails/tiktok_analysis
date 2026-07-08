package X;

import Y.AObjectS184S0300000_5;
import Y.AObjectS240S0100000_5;
import Y.AObserverS122S0300000_5;
import Y.AObserverS170S0200000_5;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.Composite;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricFailbackFont;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricMiniDraftData;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.InitialTrimInfo;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EQI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EQI extends AbstractC381020Ewm<C0EHC> implements C0EHC, InterfaceC379610EuV {
    public static final C0EQQ LLJJJJLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public final C560530Lyd<Unit> LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public C214799194j LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final C0EQJ LLJJJ;
    public final C0EK5 LLJJJIL;
    public C09AE LLJJJJ;
    public boolean LLJJJJJIL;

    public C0EHC Z1() {
        return this;
    }

    @Override // X.C0EHC
    public void k9() {
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0EQQ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EQI.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0EQI.class, "editorProAdapterApi", "getEditorProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0), new C2217381BqS(C0EQI.class, "previewApi", "getPreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0), new C2217381BqS(C0EQI.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0), new C2217381BqS(C0EQI.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0), new C2217381BqS(C0EQI.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0), new C2217381BqS(C0EQI.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C0EQI.class, "lyricEffectApi", "getLyricEffectApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0), new C2217381BqS(C0EQI.class, "bottomBarApiComponent", "getBottomBarApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0), new C2217381BqS(C0EQI.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0), new C2217381BqS(C0EQI.class, "textEditPanelApi", "getTextEditPanelApi()Lcom/ss/android/ugc/editorpro/components/api/text/editpanel/EPTextEditPanelApi;", 0), new C2217381BqS(C0EQI.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0)};
        LLJJJJLIIL = new Object() { // from class: X.0EQQ
        };
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final C0EYP H2() {
        return (C0EYP) this.LLIZ.getValue(this, LLJJL[1]);
    }

    private final VideoPublishEditModel LJJJLIIL() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    private final C0EY2 W2() {
        return (C0EY2) this.LLJJIJIL.getValue(this, LLJJL[11]);
    }

    private final C0EB6 c3() {
        return (C0EB6) this.LLJIJIL.getValue(this, LLJJL[5]);
    }

    private final InterfaceC359950E9h i3() {
        return (InterfaceC359950E9h) this.LLJI.getValue(this, LLJJL[4]);
    }

    private final C0EGY o2() {
        return (C0EGY) this.LLJILLL.getValue(this, LLJJL[8]);
    }

    private final InterfaceC360800ECo w2() {
        return (InterfaceC360800ECo) this.LLJ.getValue(this, LLJJL[3]);
    }

    public final InterfaceC361710EGb B3() {
        return (InterfaceC361710EGb) this.LLIZLLLIL.getValue(this, LLJJL[2]);
    }

    public final InterfaceC384330F5b E3() {
        return (InterfaceC384330F5b) this.LLJJI.getValue(this, LLJJL[10]);
    }

    public final InterfaceC1461350o8D G2() {
        return (InterfaceC1461350o8D) this.LLJILJIL.getValue(this, LLJJL[6]);
    }

    public final C0E5S H3() {
        return (C0E5S) this.LLJJ.getValue(this, LLJJL[9]);
    }

    public final C0EOK T2() {
        return (C0EOK) this.LLILZLL.getValue(this, LLJJL[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z4() {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EQI.Z4():void");
    }

    public final InterfaceC366450EYh m3() {
        return (InterfaceC366450EYh) this.LLJILJILJ.getValue(this, LLJJL[7]);
    }

    private final boolean O3() {
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head;
        C0E48 c0e48W1 = W1();
        List<String> listLJJLIIIIJ = C351220Dpo.LJJLIIIIJ((c0e48W1 == null || (nLEEditorLJI = c0e48W1.LLFII().LJI()) == null || (branch = nLEEditorLJI.getBranch()) == null || (head = branch.getHead()) == null) ? null : head.getModel());
        C0E48 c0e48W12 = W1();
        List<String> listLJJLIIIIJ2 = C351220Dpo.LJJLIIIIJ(c0e48W12 != null ? C350870DpF.LJI(c0e48W12) : null);
        return (listLJJLIIIIJ.size() == C13LP.LLIIJI(listLJJLIIIIJ).size() && listLJJLIIIIJ2.size() == C13LP.LLIIJI(listLJJLIIIIJ2).size()) ? false : true;
    }

    private final void T4() {
        int size = i4().size();
        InterfaceC366450EYh interfaceC366450EYhM3 = m3();
        if (interfaceC366450EYhM3 != null) {
            interfaceC366450EYhM3.LC1(size > 0);
        }
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

    private final List<Pair<String, String>> v3() {
        List<NLETrack> listLJJLIIIJ;
        LyricStickerModel next;
        String uuid;
        Iterable slots;
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head;
        List<LyricStickerModel> listI4 = i4();
        C0E48 c0e48W1 = W1();
        NLEModel model = (c0e48W1 == null || (nLEEditorLJI = c0e48W1.LLFII().LJI()) == null || (branch = nLEEditorLJI.getBranch()) == null || (head = branch.getHead()) == null) ? null : head.getModel();
        ArrayList arrayList = new ArrayList();
        if (model != null && (listLJJLIIIJ = C351220Dpo.LJJLIIIJ(model)) != null) {
            ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
            for (NLETrack nLETrack : listLJJLIIIJ) {
                if (nLETrack == null || (slots = nLETrack.getSlots()) == null) {
                    slots = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(slots, arrayList2);
            }
            for (NLETrackSlot nLETrackSlot : arrayList2) {
                String strLJJLI = C351220Dpo.LJJLI(nLETrackSlot);
                if (strLJJLI != null && strLJJLI.length() != 0) {
                    long measuredStartTime = nLETrackSlot.getMeasuredStartTime();
                    long j = LSPassThroughRecordSizeConfig.DEFAULT;
                    long j2 = measuredStartTime / j;
                    long measuredEndTime = nLETrackSlot.getMeasuredEndTime() / j;
                    Iterator<LyricStickerModel> it2 = listI4.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        LyricStickerModel lyricStickerModel = next;
                        long startTime = (long) lyricStickerModel.getBaseStickerModel().getStartTime();
                        long endTime = (long) lyricStickerModel.getBaseStickerModel().getEndTime();
                        if (Intrinsics.LJFF(lyricStickerModel.getMusicId(), strLJJLI) && Math.abs(j2 - startTime) <= 1 && Math.abs(measuredEndTime - endTime) <= 1) {
                            break;
                        }
                    }
                    LyricStickerModel lyricStickerModel2 = next;
                    if (lyricStickerModel2 != null && (uuid = lyricStickerModel2.getUuid()) != null) {
                        arrayList.add(new Pair(nLETrackSlot.getUUID(), uuid));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public boolean D1() {
        return C1466090oFr.LJIIIIZZ(i4(), true);
    }

    public final void P4() {
        C0EGY c0egyO2;
        InterfaceC359850E8x interfaceC359850E8xB20;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (c0egyO2 = o2()) == null || (interfaceC359850E8xB20 = c0egyO2.B20()) == null || (nLETrackSlotLLLLLLIL = c0e48W1.LLLLLLIL()) == null || !C351220Dpo.LLILLIZIL(nLETrackSlotLLLLLLIL)) {
            return;
        }
        Map<String, InterfaceC352990Dsf> map = C353810Dtz.LIZ;
        C353890Du7 c353890Du7LIZIZ = C353810Dtz.LIZIZ("bottom_item_bgm_edit_lyric", C350870DpF.LJI(c0e48W1), getDiContainer());
        if (c353890Du7LIZIZ != null) {
            interfaceC359850E8xB20.LJIIZILJ("bottom_item_bgm_edit_lyric", c353890Du7LIZIZ, false);
        }
    }

    @Override // X.C0EHC
    public String aj1() {
        LyricStickerModel next;
        C0E48 c0e48W1 = W1();
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48W1 != null ? c0e48W1.LLLLLLIL() : null;
        Iterator<LyricStickerModel> it2 = i4().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.getUuid(), nLETrackSlotLLLLLLIL != null ? nLETrackSlotLLLLLLIL.getUUID() : null)) {
                break;
            }
        }
        LyricStickerModel lyricStickerModel = next;
        if (lyricStickerModel != null) {
            return lyricStickerModel.getMusicId();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        r1 = z4(r4, r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011f, code lost:
    
        if (r1 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        h1(r1, X.EnumC356070Dxd.NONE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d5() {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EQI.d5():void");
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public void e1() {
        if (C1466090oFr.LJIIIIZZ(i4(), true)) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(C1664590tQ1.LJII(this));
        c1389890mGx.LJIIIZ(2131836935);
        c1389890mGx.LJIIJJI();
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public List<LyricStickerModel> i4() {
        List<StickerModel> listLm;
        C0EOK c0eokT2 = T2();
        if (c0eokT2 == null || (listLm = c0eokT2.Lm()) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (StickerModel stickerModel : listLm) {
            if (stickerModel instanceof LyricStickerModel) {
                arrayList.add(stickerModel);
            }
        }
        return arrayList;
    }

    @Override // X.C0EHC
    public void nD1() {
        LiveData<Boolean> liveDataQ72;
        MutableLiveData<Boolean> mutableLiveDataEa1;
        LiveEvent<Unit> liveEventDx0;
        LiveData<C0E2C> liveDataLIZ;
        LiveEvent<Unit> liveEventHy;
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0EY2 c0ey2W2 = W2();
        if (c0ey2W2 != null && (liveDataZu2 = c0ey2W2.zu2()) != null && (value = liveDataZu2.getValue()) != null) {
            this.LLJJIII = value.LJ.getEffectMultiTrackMode();
            this.LLJJIJI = value.LJ.getChangeBanMusicMode() != null;
        }
        if (this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        InterfaceC350420DoW interfaceC350420DoW = new InterfaceC350420DoW() { // from class: X.0EQO
            @Override // X.InterfaceC350420DoW
            public final void LIZ() {
            }

            @Override // X.InterfaceC350420DoW
            public final void LIZLLL() {
                this.LIZ.Z4();
            }
        };
        InterfaceC357170DzP interfaceC357170DzP = new InterfaceC357170DzP() { // from class: X.0EQN
            @Override // X.InterfaceC357170DzP
            public final void LIZJ(EnumC357140DzM enumC357140DzM) {
            }

            @Override // X.InterfaceC357170DzP
            public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z) {
                this.LIZ.d5();
            }
        };
        InterfaceC359950E9h interfaceC359950E9hI3 = i3();
        if (interfaceC359950E9hI3 != null && (liveEventHy = interfaceC359950E9hI3.Hy()) != null) {
            liveEventHy.LIZ(this, new AObjectS184S0300000_5(this, interfaceC350420DoW, interfaceC357170DzP, 0));
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (liveDataLIZ = C0EB5.LIZ(c0e48W1, c3())) != null) {
            liveDataLIZ.observe(this, new AObserverS122S0300000_5(interfaceC350420DoW, this, interfaceC357170DzP, 2));
        }
        InterfaceC359950E9h interfaceC359950E9hI32 = i3();
        if (interfaceC359950E9hI32 != null && (liveEventDx0 = interfaceC359950E9hI32.Dx0()) != null) {
            liveEventDx0.LIZ(this, new AObjectS184S0300000_5(this, interfaceC350420DoW, interfaceC357170DzP, 1));
        }
        C0EQU c0equ = new C0EQU(getDiContainer());
        C0EOK c0eokT2 = T2();
        if (c0eokT2 != null && (mutableLiveDataEa1 = c0eokT2.Ea1()) != null) {
            mutableLiveDataEa1.observe(this, new AObserverS170S0200000_5(c0equ, this, 8));
        }
        InterfaceC366450EYh interfaceC366450EYhM3 = m3();
        if (interfaceC366450EYhM3 == null || (liveDataQ72 = interfaceC366450EYhM3.q72()) == null) {
            return;
        }
        liveDataQ72.observe(this, new AObjectS240S0100000_5(this, 92));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C0EYP c0eypH2 = H2();
        if (c0eypH2 != null) {
            c0eypH2.a21(this);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C0EYP c0eypH2 = H2();
        if (c0eypH2 != null) {
            c0eypH2.a21(null);
        }
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public LiveEvent<Unit> A4() {
        return this.LLILZIL;
    }

    @Override // X.C0EHC
    public void Rc() {
        d5();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    @Override // X.C0EHC
    public C0FUI w() {
        return this.LLJJJ;
    }

    public final void H4(C0E75 c0e75) {
        InterfaceC360800ECo interfaceC360800ECoW2;
        LiveState<Long> liveStateJq;
        LiveState<Long> liveStateJq2;
        NLETrack nLETrack = c0e75.LIZIZ;
        NLETrackSlot nLETrackSlot = c0e75.LIZJ;
        InterfaceC360800ECo interfaceC360800ECoW22 = w2();
        if (interfaceC360800ECoW22 != null && (liveStateJq2 = interfaceC360800ECoW22.jq()) != null) {
            liveStateJq2.LJI(this);
        }
        if (nLETrackSlot != null && C351220Dpo.LLJLLIL(nLETrack) && (interfaceC360800ECoW2 = w2()) != null && (liveStateJq = interfaceC360800ECoW2.jq()) != null) {
            liveStateJq.LIZ(this, new AObjectS240S0100000_5(this, 93));
        }
    }

    public final boolean Q3(int i) {
        StickerModel stickerModelLLJJIJI;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0EOK c0eokT2 = T2();
        String uuid = null;
        if (c0eokT2 != null) {
            stickerModelLLJJIJI = c0eokT2.LLJJIJI(i);
        } else {
            stickerModelLLJJIJI = null;
        }
        if (!(stickerModelLLJJIJI instanceof LyricStickerModel)) {
            return false;
        }
        String uuid2 = ((LyricStickerModel) stickerModelLLJJIJI).getUuid();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (nLETrackSlotLLLLLLIL = c0e48W1.LLLLLLIL()) != null) {
            uuid = nLETrackSlotLLLLLLIL.getUUID();
        }
        return Intrinsics.LJFF(uuid2, uuid);
    }

    @Override // X.C0EHC
    public void ee(EnumC366550EYr enumC366550EYr) {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        C0EQP c0eqp = new C0EQP(c0e48W1);
        InterfaceC360800ECo interfaceC360800ECoW2 = w2();
        if (interfaceC360800ECoW2 != null) {
            C0EB4.LIZIZ(interfaceC360800ECoW2, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO, EnumC373450EkZ.FULL_SCREEN}, null, Boolean.FALSE, null, null, 26);
        }
        C0E5S c0e5sH3 = H3();
        if (c0e5sH3 != null) {
            c0e5sH3.yV(AFwS234S0000000_5.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        }
        C375820EoO.LIZ(this.LLILLL, c0e48W1, C0ETW.class, c0eqp, 16);
    }

    @Override // X.C0EHC
    public List<LyricStickerModel> kh(String str) {
        List<StickerModel> listLm;
        C0EOK c0eokT2 = T2();
        ArrayList arrayList = null;
        if (c0eokT2 != null && (listLm = c0eokT2.Lm()) != null) {
            ArrayList<StickerModel> arrayList2 = new ArrayList();
            for (StickerModel stickerModel : listLm) {
                StickerModel stickerModel2 = stickerModel;
                if ((stickerModel2 instanceof LyricStickerModel) && Intrinsics.LJFF(((LyricStickerModel) stickerModel2).getMusicId(), str)) {
                    arrayList2.add(stickerModel);
                }
            }
            arrayList = new ArrayList();
            for (StickerModel stickerModel3 : arrayList2) {
                if ((stickerModel3 instanceof LyricStickerModel) && stickerModel3 != null) {
                    arrayList.add(stickerModel3);
                }
            }
        }
        return arrayList;
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public void r(EnumC356070Dxd enumC356070Dxd) {
        C0EOK c0eokT2 = T2();
        if (c0eokT2 != null) {
            List<LyricStickerModel> listI4 = i4();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listI4, 10));
            Iterator<LyricStickerModel> it2 = listI4.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().getId()));
            }
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
            if (enumC356070Dxd != enumC356070Dxd2) {
                enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
            }
            c0eokT2.M3(arrayList, null, enumC356070Dxd2);
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE) {
            C0E1X c0e1x = new C0E1X(C0E1V.REMOVE_LYRIC_STICKER.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                C350870DpF.LIZJ(c0e48W1, C051R.LIZIZ(c0e1x));
            }
        }
        P4();
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.0EQJ] */
    public C0EQI(C19A3 c19a3, C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
        this.LLILZIL = new C560530Lyd<>();
        this.LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C0EYP.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EB6.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366450EYh.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EGY.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC384330F5b.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJJJ = new C0FUI() { // from class: X.0EQJ
            @Override // X.C0FUI
            public final Integer LIZJ() {
                return null;
            }

            @Override // X.C0FUI
            public final Integer LIZLLL() {
                return null;
            }

            @Override // X.C0FUI
            public final boolean LIZIZ(int i) {
                return this.LIZ.Q3(i);
            }

            @Override // X.C0FUI
            public final void LJ(BaseStickerModel baseStickerModel) {
                int id = baseStickerModel.getId();
                C0EQI c0eqi = this.LIZ;
                List<LyricStickerModel> listI4 = c0eqi.i4();
                ArrayList<LyricStickerModel> arrayList = new ArrayList();
                for (LyricStickerModel lyricStickerModel : listI4) {
                    if (lyricStickerModel.getBaseStickerModel().getId() != id) {
                        arrayList.add(lyricStickerModel);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (LyricStickerModel lyricStickerModel2 : arrayList) {
                    arrayList2.add(lyricStickerModel2.copy(BaseStickerModel.copy$default(lyricStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModel.getTranslateX(), baseStickerModel.getTranslateY(), baseStickerModel.getScale(), baseStickerModel.getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457281, 15, null), lyricStickerModel2.uuid, lyricStickerModel2.clipStart, lyricStickerModel2.clipEnd, lyricStickerModel2.musicId, lyricStickerModel2.lyricId, lyricStickerModel2.musicName, lyricStickerModel2.lyricStyleUrs, lyricStickerModel2.selectedFrom, lyricStickerModel2.lyricStyleEffectId, lyricStickerModel2.recommendWidth, lyricStickerModel2.recommendHeight, lyricStickerModel2.initialTrimInfo, lyricStickerModel2.textStickerModels, lyricStickerModel2.fallbackFonts, lyricStickerModel2.enabled));
                }
                c0eqi.f(arrayList2, EnumC356070Dxd.COMMIT);
            }

            @Override // X.C0FUI
            public final boolean LIZ(int i, boolean z) {
                C0FHM c0fhmLIZJ;
                C385670FAf<C0FHM> c385670FAfS1;
                NLETrackSlot nLETrackSlotLLLLLLIL;
                C0E48 c0e48W1 = this.LIZ.W1();
                if (c0e48W1 != null && (nLETrackSlotLLLLLLIL = c0e48W1.LLLLLLIL()) != null && C351220Dpo.LLLIIIL(nLETrackSlotLLLLLLIL)) {
                    return true;
                }
                C0EQI c0eqi = this.LIZ;
                if (c0eqi.LLJJIII || c0eqi.LLJJIJI) {
                    return true;
                }
                InterfaceC384330F5b interfaceC384330F5bE3 = c0eqi.E3();
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
                return !this.LIZ.Q3(i);
            }
        };
        this.LLJJJIL = new C0EK5();
    }

    private final void e4(LyricStickerModel lyricStickerModel, EnumC356070Dxd enumC356070Dxd) {
        if (lyricStickerModel == null) {
            return;
        }
        C0EOK c0eokT2 = T2();
        if (c0eokT2 != null) {
            c0eokT2.gN1(lyricStickerModel.getId(), true, enumC356070Dxd);
        }
        P4();
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public void B1(String str, EnumC356070Dxd enumC356070Dxd) {
        List<LyricStickerModel> listKh = kh(str);
        if (listKh != null) {
            for (LyricStickerModel lyricStickerModel : listKh) {
                EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
                if (enumC356070Dxd != enumC356070Dxd2) {
                    enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
                }
                e4(lyricStickerModel, enumC356070Dxd2);
            }
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE) {
            C0E1X c0e1x = new C0E1X(C0E1V.REMOVE_LYRIC_STICKER.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                C350870DpF.LIZJ(c0e48W1, C051R.LIZIZ(c0e1x));
            }
        }
    }

    @Override // X.C0EHC
    public void DM1(Function0<Unit> function0, Function0<Unit> function02) {
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null && (creativeModel = videoPublishEditModelLJJJLIIL.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
            List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(musicBuzModel);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic((MusicBuzModel) it2.next());
                if (aVMusicExtractAVMusic != null) {
                    arrayList.add(aVMusicExtractAVMusic);
                }
            }
            C09AE c09ae = this.LLJJJJ;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            MutableLiveData mutableLiveData = new MutableLiveData();
            CreativeBottomSheetBehavior<?> creativeBottomSheetBehavior = new CreativeBottomSheetBehavior<>();
            creativeBottomSheetBehavior.LJJ = false;
            creativeBottomSheetBehavior.LJIIJ = false;
            C18YA c18ya = new C18YA();
            c18ya.LIZ(new AwS406S0200000_5(this, (C0EQI) mutableLiveData, (MutableLiveData<Integer>) 64));
            c18ya.LIZIZ(EnumC214804194o.FREEDOM_HEIGHT);
            C214799194j c214799194j = c18ya.LIZ;
            c214799194j.LLLII = true;
            c214799194j.LLJJJ = true;
            c214799194j.LLJLILLLLZIIL = creativeBottomSheetBehavior;
            c214799194j.LLJJJJJIL = true;
            c214799194j.LLJJLIIIJLLLLLLLZ = false;
            c214799194j.LLJL = R.style.xz;
            c214799194j.LLLF = Integer.valueOf(R.anim.y);
            c18ya.LIZ.LLLFF = Integer.valueOf(R.anim.a0);
            AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 684);
            C214799194j c214799194j2 = c18ya.LIZ;
            c214799194j2.LLJLLL = awS549S0100000_5;
            this.LLJJIJIIJIL = c214799194j2;
            c214799194j2.LLLLL(C1447800nmM.LIZIZ(this.LLILLL));
            C365600EVa c365600EVa = new C365600EVa(100L, 95);
            c365600EVa.LIZ(new AwS584S0100000_5(mutableLiveData, (MutableLiveData<Integer>) 594), LifecycleOwnerKt.getLifecycleScope(this));
            this.LLJJJJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C0EQS(this, arrayList, mutableLiveData, c365600EVa, function0, function02, null), 2);
        }
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public void M(List<LyricStickerModel> list, EnumC356070Dxd enumC356070Dxd) {
        for (LyricStickerModel lyricStickerModel : list) {
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
            if (enumC356070Dxd != enumC356070Dxd2) {
                enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
            }
            h1(lyricStickerModel, enumC356070Dxd2);
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE) {
            C0E1X c0e1x = new C0E1X(C0E1V.ADD_LYRIC_STICKER.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                C350870DpF.LIZJ(c0e48W1, C051R.LIZIZ(c0e1x));
            }
        }
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public void M0(List<String> list, EnumC356070Dxd enumC356070Dxd) {
        for (String str : list) {
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
            if (enumC356070Dxd != enumC356070Dxd2) {
                enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
            }
            B1(str, enumC356070Dxd2);
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE) {
            C0E1X c0e1x = new C0E1X(C0E1V.REMOVE_LYRIC_STICKER.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                C350870DpF.LIZJ(c0e48W1, C051R.LIZIZ(c0e1x));
            }
        }
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public void f(List<LyricStickerModel> list, EnumC356070Dxd enumC356070Dxd) {
        for (LyricStickerModel lyricStickerModel : list) {
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
            if (enumC356070Dxd != enumC356070Dxd2) {
                enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
            }
            x1(lyricStickerModel, enumC356070Dxd2);
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE) {
            C0E1X c0e1x = new C0E1X(C0E1V.UPDATE_LYRIC_STYLE.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                C350870DpF.LIZJ(c0e48W1, C051R.LIZIZ(c0e1x));
            }
        }
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public void g3(String str, EnumC356070Dxd enumC356070Dxd) {
        List<LyricStickerModel> listI4 = i4();
        if (listI4 != null) {
            ArrayList<LyricStickerModel> arrayList = new ArrayList();
            for (LyricStickerModel lyricStickerModel : listI4) {
                if (Intrinsics.LJFF(lyricStickerModel.getUuid(), str)) {
                    arrayList.add(lyricStickerModel);
                }
            }
            for (LyricStickerModel lyricStickerModel2 : arrayList) {
                EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
                if (enumC356070Dxd != enumC356070Dxd2) {
                    enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
                }
                e4(lyricStickerModel2, enumC356070Dxd2);
            }
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE) {
            C0E1X c0e1x = new C0E1X(C0E1V.REMOVE_LYRIC_STICKER.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                C350870DpF.LIZJ(c0e48W1, C051R.LIZIZ(c0e1x));
            }
        }
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public void h1(LyricStickerModel lyricStickerModel, EnumC356070Dxd enumC356070Dxd) {
        if (lyricStickerModel.getBaseStickerModel().getZIndex() == 0) {
            lyricStickerModel.getBaseStickerModel().setZIndex(q3());
        }
        C0EOK c0eokT2 = T2();
        if (c0eokT2 != null) {
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
            if (enumC356070Dxd != enumC356070Dxd2) {
                enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
            }
            c0eokT2.f3(lyricStickerModel, enumC356070Dxd2);
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE) {
            C0E1X c0e1x = new C0E1X(C0E1V.ADD_LYRIC_STICKER.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                C350870DpF.LIZJ(c0e48W1, C051R.LIZIZ(c0e1x));
            }
        }
        P4();
    }

    @Override // X.C0EHC, X.InterfaceC364330EQd
    public void x1(LyricStickerModel lyricStickerModel, EnumC356070Dxd enumC356070Dxd) {
        C0EOK c0eokT2 = T2();
        if (c0eokT2 != null) {
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.NONE;
            if (enumC356070Dxd != enumC356070Dxd2) {
                enumC356070Dxd2 = EnumC356070Dxd.COMMIT;
            }
            c0eokT2.k3(lyricStickerModel, enumC356070Dxd2);
        }
        if (enumC356070Dxd == EnumC356070Dxd.DONE) {
            C0E1X c0e1x = new C0E1X(C0E1V.UPDATE_LYRIC_STYLE.getNameId(), null, null, null, null, 30);
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                C350870DpF.LIZJ(c0e48W1, C051R.LIZIZ(c0e1x));
            }
        }
    }

    private final LyricStickerModel z4(NLETrackSlot nLETrackSlot, VESize vESize, int i) {
        C0EQM c0eqmPv2;
        LyricStickerModel lyricStickerModelX1;
        this.LLJJJIL.getClass();
        LyricStickerModel lyricStickerModelLIZLLL = C0EK5.LIZLLL(nLETrackSlot, vESize, i);
        if (lyricStickerModelLIZLLL == null) {
            return null;
        }
        InterfaceC366450EYh interfaceC366450EYhM3 = m3();
        if (interfaceC366450EYhM3 != null && (c0eqmPv2 = interfaceC366450EYhM3.pv2(lyricStickerModelLIZLLL.getResourceId(), lyricStickerModelLIZLLL.getMusicId(), lyricStickerModelLIZLLL.getLyricId())) != null && (lyricStickerModelX1 = X1(lyricStickerModelLIZLLL, vESize, i, c0eqmPv2)) != null) {
            return lyricStickerModelX1;
        }
        return lyricStickerModelLIZLLL;
    }

    public final void K4(Long l, boolean z, boolean z2) {
        long jLongValue;
        LyricStickerModel next;
        String uuid;
        C0E48 c0e48W1;
        NLETrackSlot nLETrackSlotLJL;
        C0E5S c0e5sH3;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Iterator<LyricStickerModel> it2 = i4().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                LyricStickerModel lyricStickerModel = next;
                float f = jLongValue;
                if (f >= lyricStickerModel.getBaseStickerModel().getStartTime() && f <= lyricStickerModel.getBaseStickerModel().getEndTime()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LyricStickerModel lyricStickerModel2 = next;
        if (lyricStickerModel2 != null && (uuid = lyricStickerModel2.getUuid()) != null && uuid.length() != 0 && (c0e48W1 = W1()) != null && (nLETrackSlotLJL = C351220Dpo.LJL(C350870DpF.LJI(c0e48W1), uuid)) != null && (c0e5sH3 = H3()) != null) {
            c0e5sH3.G22(nLETrackSlotLJL, C0E6E.CLIP, EnumC358760E4s.NORMAL, z, false, z2);
        }
    }

    private final LyricStickerModel X1(LyricStickerModel lyricStickerModel, VESize vESize, int i, C0EQM c0eqm) {
        List<Composite> list;
        Composite composite;
        LyricMiniDraftData lyricMiniDraftData = c0eqm.LIZ.LJ;
        if (lyricMiniDraftData != null && (list = lyricMiniDraftData.composites) != null && (composite = (Composite) C13LP.LJJJLL(list)) != null) {
            LyricStickerModel lyricStickerModel2 = new LyricStickerModel(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), null, 0L, 0L, null, null, null, null, null, null, null, null, null, new ArrayList(), null, null);
            Integer numValueOf = Integer.valueOf(C497820Jfg.LIZIZ(C1664590tQ1.LJII(this)));
            String musicId = lyricStickerModel.getMusicId();
            String lyricId = lyricStickerModel.getLyricId();
            String musicName = lyricStickerModel.getMusicName();
            if (musicName == null) {
                musicName = c0eqm.LIZ.LIZ;
            }
            C05WK c05wk = c0eqm.LIZIZ;
            String selectedFrom = lyricStickerModel.getSelectedFrom();
            if (selectedFrom == null) {
                selectedFrom = c0eqm.LIZ.LJFF;
            }
            C0EP4.LIZ(lyricStickerModel2, numValueOf, vESize, musicId, lyricId, musicName, null, composite, c05wk, selectedFrom, composite.fallbackFonts);
            BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(lyricStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null);
            String uuid = lyricStickerModel.getUuid();
            long clipStart = lyricStickerModel.getClipStart();
            long clipEnd = lyricStickerModel.getClipEnd();
            String musicId2 = lyricStickerModel.getMusicId();
            String lyricId2 = lyricStickerModel.getLyricId();
            String musicName2 = lyricStickerModel.getMusicName();
            if (musicName2 == null) {
                musicName2 = lyricStickerModel2.getMusicName();
            }
            String lyricStyleUrs = lyricStickerModel.getLyricStyleUrs();
            if (lyricStyleUrs == null) {
                lyricStyleUrs = lyricStickerModel2.getLyricStyleUrs();
            }
            String selectedFrom2 = lyricStickerModel.getSelectedFrom();
            if (selectedFrom2 == null) {
                selectedFrom2 = lyricStickerModel2.getSelectedFrom();
            }
            String lyricStyleEffectId = lyricStickerModel.getLyricStyleEffectId();
            if (lyricStyleEffectId == null) {
                lyricStyleEffectId = lyricStickerModel2.getLyricStyleEffectId();
            }
            Integer recommendWidth = lyricStickerModel.getRecommendWidth();
            if (recommendWidth == null) {
                recommendWidth = lyricStickerModel2.getRecommendWidth();
            }
            Integer recommendHeight = lyricStickerModel.getRecommendHeight();
            if (recommendHeight == null) {
                recommendHeight = lyricStickerModel2.getRecommendHeight();
            }
            InitialTrimInfo initialTrimInfo = lyricStickerModel.getInitialTrimInfo();
            List<LyricFailbackFont> fallbackFonts = lyricStickerModel.getFallbackFonts();
            if (fallbackFonts == null) {
                fallbackFonts = lyricStickerModel2.getFallbackFonts();
            }
            return lyricStickerModel2.copy(baseStickerModelCopy$default, uuid, clipStart, clipEnd, musicId2, lyricId2, musicName2, lyricStyleUrs, selectedFrom2, lyricStyleEffectId, recommendWidth, recommendHeight, initialTrimInfo, lyricStickerModel2.textStickerModels, fallbackFonts, lyricStickerModel2.enabled);
        }
        return null;
    }
}
