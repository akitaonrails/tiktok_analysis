package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365670EVh extends AbstractC2255721DQs<C0MER> implements C0MER, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final Scene LLILLJJLI;
    public final C364440EQo LLILLL;
    public final C0MER LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C0EYP.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456070nzh.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455500nym.class, null);
    public InterfaceC365760EVq LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C365670EVh.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C365670EVh.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C365670EVh.class, "editorProAdapterApi", "getEditorProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C365670EVh.class, "editAudioEffectApi", "getEditAudioEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/EditAudioEffectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C365670EVh.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C365670EVh.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJILJILJ = 8;
    }

    private final InterfaceC1455500nym G2() {
        return (InterfaceC1455500nym) this.LLJI.getValue(this, LLJILJIL[5]);
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZIL.getValue(this, LLJILJIL[0]);
    }

    private final InterfaceC1460000o62 T2() {
        return (InterfaceC1460000o62) this.LLILZLL.getValue(this, LLJILJIL[1]);
    }

    private final void Z1() {
        C365730EVn.LIZ.LJFF(this.LLJIJIL);
    }

    private final C0EYP c3() {
        return (C0EYP) this.LLIZ.getValue(this, LLJILJIL[2]);
    }

    private final InterfaceC1456070nzh w2() {
        return (InterfaceC1456070nzh) this.LLIZLLLIL.getValue(this, LLJILJIL[3]);
    }

    public final VideoPublishEditModel i3() {
        return (VideoPublishEditModel) this.LLJ.getValue(this, LLJILJIL[4]);
    }

    private final void B3() {
        InterfaceC1460000o62 interfaceC1460000o62T2 = T2();
        if (interfaceC1460000o62T2 != null) {
            interfaceC1460000o62T2.Ux(8000, true);
        }
        InterfaceC1460000o62 interfaceC1460000o62T22 = T2();
        if (interfaceC1460000o62T22 != null) {
            interfaceC1460000o62T22.Ux(8001, true);
        }
        v3(true);
    }

    private final InterfaceC1452170ntP W2() {
        return JY0().g().getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean X1() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365670EVh.X1():boolean");
    }

    @Override // X.C0MER
    public void fK1() {
        if (C365790EVt.LIZ()) {
            i3();
            if (C1428520nHG.LJJLIIIJLLLLLLLZ() && C564860MDk.LIZLLL(i3().getAILivePhotoModel(), C1664590tQ1.LJII(this))) {
                return;
            }
            C1402900mbw.LIZLLL(i3(), false, false, false, false, false, false, false, false, false, false, false, true, false, 24572);
            if (!C0CHQ.LIZ().getAccountService().isLogin()) {
                C0EAE c0eae = C0EAE.LIZ;
                C0EAE.LJFF(i3(), C0EAG.ENTER_RETOUCH_PANEL);
                m3(i3(), this.LLILLL, c3(), w2());
            } else {
                if (C1651050t4B.LIZ()) {
                    q3(new AwS584S0100000_5(this, 181));
                    return;
                }
                C0EAE c0eae2 = C0EAE.LIZ;
                C0EAE.LJFF(i3(), C0EAG.ENTER_RETOUCH_PANEL);
                m3(i3(), this.LLILLL, c3(), w2());
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        Z1();
    }

    @Override // X.C0MER
    public void tM() {
        InterfaceC1460000o62 interfaceC1460000o62T2 = T2();
        if (interfaceC1460000o62T2 != null) {
            interfaceC1460000o62T2.Ux(8000, false);
        }
        InterfaceC1460000o62 interfaceC1460000o62T22 = T2();
        if (interfaceC1460000o62T22 != null) {
            interfaceC1460000o62T22.Ux(8001, false);
        }
        v3(true);
    }

    public final Scene H2() {
        return this.LLILLJJLI;
    }

    public final C364440EQo LLLZIL() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0MER o2() {
        return this.LLILZ;
    }

    private final void q3(Function1<? super List<? extends ResourceItem>, Unit> function1) {
        C365680EVi c365680EVi = new C365680EVi(new ArrayList(), function1);
        this.LLJIJIL = c365680EVi;
        C365730EVn.LIZJ(C365730EVn.LIZ, new C365750EVp(3), c365680EVi, false, 4);
    }

    private final void v3(boolean z) {
        InterfaceC1460000o62 interfaceC1460000o62T2 = T2();
        if (interfaceC1460000o62T2 != null) {
            interfaceC1460000o62T2.ut0(8000, z);
        }
        InterfaceC1460000o62 interfaceC1460000o62T22 = T2();
        if (interfaceC1460000o62T22 != null) {
            interfaceC1460000o62T22.ut0(8001, z);
        }
    }

    public final void W1(List<? extends ResourceItem> list, VideoPublishEditModel videoPublishEditModel) {
        List<NLETrackSlot> slots;
        boolean z;
        NLEModel nLEModelLIZ;
        InterfaceC1452170ntP interfaceC1452170ntPW2;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEModel nLEModelLIZ2;
        InterfaceC1452170ntP interfaceC1452170ntPW22;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        NLEModel nLEModelLIZ3;
        NLETrack mainTrack;
        C0E48 c0e48LIZ = C349830DnZ.LIZ(getDiContainer());
        InterfaceC1452170ntP interfaceC1452170ntPW23 = W2();
        if (interfaceC1452170ntPW23 == null || (nLEModelLIZ3 = C352130DrH.LIZ(interfaceC1452170ntPW23)) == null || (mainTrack = nLEModelLIZ3.getMainTrack()) == null || (slots = mainTrack.getSlots()) == null) {
            slots = C13BV.INSTANCE;
        }
        if (C351220Dpo.LLFZ((NLETrackSlot) C13LP.LJJJLL(slots))) {
            C0EAE c0eae = C0EAE.LIZ;
            C0EAE.LJFF(videoPublishEditModel, C0EAG.CLOSE_RETOUCH);
            tM();
            for (NLETrackSlot nLETrackSlot : slots) {
                for (C351410Dq7 c351410Dq7 : C13LP.LLIIII(C351220Dpo.LJIIJ(nLETrackSlot))) {
                    if (c0e48LIZ != null && (interfaceC351350Dq1LLFII2 = c0e48LIZ.LLFII()) != null) {
                        interfaceC351350Dq1LLFII2.LLJILJIL(nLETrackSlot, EnumC356070Dxd.COMMIT, c351410Dq7.LIZ.LIZIZ);
                    }
                }
                InterfaceC1452170ntP interfaceC1452170ntPW24 = W2();
                if (interfaceC1452170ntPW24 != null && (nLEModelLIZ2 = C352130DrH.LIZ(interfaceC1452170ntPW24)) != null && (interfaceC1452170ntPW22 = W2()) != null) {
                    interfaceC1452170ntPW22.yc(nLEModelLIZ2);
                }
            }
            return;
        }
        C0EAE c0eae2 = C0EAE.LIZ;
        C0EAE.LJFF(videoPublishEditModel, C0EAG.START_RETOUCH);
        B3();
        for (NLETrackSlot nLETrackSlot2 : slots) {
            for (ResourceItem resourceItem : list) {
                String str = resourceItem.extra;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                List<C0EA9> listLIZJ = C09GD.LIZJ(str);
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLIZJ, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C0EA9 c0ea9 : listLIZJ) {
                    Pair pair = new Pair(c0ea9.LIZ, Integer.valueOf(c0ea9.LIZIZ));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                String path = resourceItem.getPath();
                if (path == null) {
                    path = "";
                }
                String resourceId = resourceItem.getResourceId();
                if (resourceId != null) {
                    str2 = resourceId;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C2097808Js.LJIL(linkedHashMap2));
                C0EA9 c0ea92 = (C0EA9) C13LP.LJJJLL(listLIZJ);
                if (c0ea92 != null && c0ea92.LIZJ < 0) {
                    z = true;
                } else {
                    z = false;
                }
                C351410Dq7 c351410Dq72 = new C351410Dq7(new C351390Dq5(path, str2, arrayList, z), false);
                if (c0e48LIZ != null && (interfaceC351350Dq1LLFII = c0e48LIZ.LLFII()) != null) {
                    interfaceC351350Dq1LLFII.LJJLIIJ(nLETrackSlot2, c351410Dq72, EnumC356070Dxd.COMMIT);
                }
                InterfaceC1452170ntP interfaceC1452170ntPW25 = W2();
                if (interfaceC1452170ntPW25 != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntPW25)) != null && (interfaceC1452170ntPW2 = W2()) != null) {
                    interfaceC1452170ntPW2.yc(nLEModelLIZ);
                }
            }
        }
    }

    public C365670EVh(C1DRG c1drg, Scene scene, C364440EQo c364440EQo) {
        this.LL = c1drg;
        this.LLILLJJLI = scene;
        this.LLILLL = c364440EQo;
    }

    private final void m3(VideoPublishEditModel videoPublishEditModel, C364440EQo c364440EQo, C0EYP c0eyp, InterfaceC1456070nzh interfaceC1456070nzh) {
        if (X1()) {
            C363500EMy.LIZ.getClass();
            C363500EMy.LJIIJ = true;
        }
        new C384550F5x(videoPublishEditModel, this.LLILLJJLI, G2(), JY0(), c364440EQo, c0eyp, new AwS549S0100000_5(interfaceC1456070nzh, 176), X1()).LIZ("edit_page_subtitle_sidebar", AFwS191S0000000_5.get$arr$(80));
    }
}
