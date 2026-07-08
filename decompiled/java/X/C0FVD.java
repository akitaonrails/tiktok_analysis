package X;

import android.text.TextWatcher;
import com.bytedance.als.h0;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FVD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FVD extends AbstractC2255721DQs<C0FVF> implements C0FVT, C0FVF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public final C1DRG LL;
    public final Scene LLILLJJLI;
    public final Function0<C1462070o9N> LLILLL;
    public TextWatcher LLJJIJIL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), C0FVY.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1464960oE2.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0FVP.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461650o8h.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450920nrO.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453410nvP.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC388540FLg.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1457600o2A.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), C1450610nqt.class, null);
    public final C387590FHp LLJJ = new C387590FHp(getEditModel(), false);
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 56));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 59));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 58));
    public final h0<Boolean> LLJJIJIIJIL = new h0<>(Boolean.FALSE);
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 57));

    @Override // X.C0FVT
    public void Dj() {
    }

    @Override // X.C0FVT
    public C0FVL Hj() {
        return null;
    }

    @Override // X.C0FVT
    public void LJJJJJ(int i) {
    }

    @Override // X.C0FVT
    public C0FWP Ri() {
        return null;
    }

    public C0FVF W1() {
        return this;
    }

    @Override // X.C0FVT
    public void ad(List<Integer> list) {
    }

    @Override // X.C0FVT
    public void hj(VideoPublishEditModel videoPublishEditModel) {
    }

    @Override // X.C0FVT
    public C0FVI lj() {
        return null;
    }

    @Override // X.C0FVT
    public C0F9P mj() {
        return null;
    }

    @Override // X.C0FVT
    public InterfaceC391240FVq qj() {
        return null;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0FVD.class, "itemEditStickerNewEngineApi", "getItemEditStickerNewEngineApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0FVD.class, "imageGlobalStickerApi", "getImageGlobalStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/GlobalEditStickerNewEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0FVD.class, "textTemplateApi", "getTextTemplateApi()Lcom/ss/android/ugc/aweme/textemplate/TextTemplateApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0FVD.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0FVD.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0FVD.class, "imageProgressApi", "getImageProgressApi()Lcom/ss/android/ugc/aweme/image/progressbar/ImageProgressApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0FVD.class, "textEditPanelApi", "getTextEditPanelApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/text/editpanel/ImageModeTextEditPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0FVD.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0FVD.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C0FVD.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C0FVD.class, "imagePresenter", "getImagePresenter()Lcom/ss/android/ugc/aweme/image/preview/ImagePresenter;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11};
        LLJJJJ = 8;
    }

    private final C0FVQ T2() {
        return (C0FVQ) this.LLJJI.getValue();
    }

    private final void Xi() {
        if (getDiContainer().LIZJ(C0FVY.class)) {
            whenReadyOrThrowInternal(getDiContainer(), C0FVY.class, new AwS584S0100000_5(this, 37));
        }
    }

    private final C1450610nqt w2() {
        return (C1450610nqt) this.LLJILLL.getValue(this, LLJJJIL[10]);
    }

    public final C0FK0 B3() {
        return (C0FK0) this.LLJJIJI.getValue();
    }

    public final C0FVO E3() {
        return (C0FVO) this.LLJJIII.getValue();
    }

    public final InterfaceC1453410nvP G2() {
        return (InterfaceC1453410nvP) this.LLJ.getValue(this, LLJJJIL[5]);
    }

    public final InterfaceC1461650o8h H2() {
        return (InterfaceC1461650o8h) this.LLIZ.getValue(this, LLJJJIL[3]);
    }

    public final C0FVP H3() {
        return (C0FVP) this.LLILZLL.getValue(this, LLJJJIL[2]);
    }

    @Override // X.C0FVT
    public C0FF8 LJIIJ() {
        return new C0FF8() { // from class: X.0FVB
            @Override // X.C0FF8
            public final boolean LIZ(int i, boolean z) {
                return false;
            }

            @Override // X.C0FF8
            public final boolean LIZIZ(int i) {
                return false;
            }

            @Override // X.C0FF8
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.C0FF8
            public final void LJ(TextStickerModel textStickerModel, AwS549S0100000_5 awS549S0100000_5) {
            }

            @Override // X.C0FF8
            public final int LJIILJJIL(TextStickerModel textStickerModel, String str) {
                return 0;
            }

            @Override // X.C0FF8
            public final TTSVoiceModel LJIILL() {
                return null;
            }

            @Override // X.C0FF8
            public final boolean LJIJ() {
                return false;
            }

            @Override // X.C0FF8
            public final void LJIJJ(String str) {
            }

            @Override // X.C0FF8
            public final C0FGA Co() {
                InterfaceC388540FLg interfaceC388540FLgV3 = this.LIZ.v3();
                if (interfaceC388540FLgV3 != null) {
                    return interfaceC388540FLgV3.Co();
                }
                return null;
            }

            @Override // X.C0FF8
            public final C0FGR LIZJ() {
                return this.LIZ.LLJJ;
            }

            @Override // X.C0FF8
            public final C0FF7 LJII() {
                return this.LIZ.v3();
            }

            @Override // X.C0FF8
            public final TextWatcher LJIIIZ() {
                return this.LIZ.LLJJIJIL;
            }

            @Override // X.C0FF8
            public final InterfaceC388160FJu LJIIJ() {
                return this.LIZ.E3();
            }

            @Override // X.C0FF8
            public final void LJIIL() {
                Unit unit;
                C1450610nqt c1450610nqt;
                try {
                    InterfaceC1450920nrO interfaceC1450920nrOW2 = this.LIZ.W2();
                    if (interfaceC1450920nrOW2 == null || (c1450610nqt = (C1450610nqt) interfaceC1450920nrOW2.V51(C1450610nqt.class)) == null) {
                        unit = null;
                    } else {
                        c1450610nqt.LJ = true;
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // X.C0FF8
            public final boolean LJIILIIL() {
                return this.LIZ.getEditModel().isMvThemeVideoType();
            }

            @Override // X.C0FF8
            public final C0FK0 LJIILLIIL() {
                return this.LIZ.B3();
            }

            @Override // X.C0FF8
            public final int LJIIZILJ() {
                return this.LIZ.O3().n2();
            }

            @Override // X.C0FF8
            public final int LJIIIIZZ() {
                return C0FVC.LIZIZ;
            }

            @Override // X.C0FF8
            public final int LJIIJJI() {
                return C0FVC.LIZJ;
            }

            @Override // X.C0FF8
            public final TextFontModel LJIJI() {
                return C0FVC.LIZ;
            }

            @Override // X.C0FF8
            public final boolean LJI(String str) {
                return EffectPlatform.LJJJJLI(str, false);
            }

            @Override // X.C0FF8
            public final void LJFF(TextFontModel textFontModel, int i, int i2) {
                C0FVC.LIZ = textFontModel;
                C0FVC.LIZIZ = i;
                C0FVC.LIZJ = i2;
            }
        };
    }

    public final InterfaceC1457600o2A O3() {
        return (InterfaceC1457600o2A) this.LLJILJIL.getValue(this, LLJJJIL[8]);
    }

    @Override // X.C0FVT
    public Function1<StickerModel, Unit> Pi() {
        return AFwS234S0000000_5.get$arr$(27);
    }

    public final InterfaceC1450920nrO W2() {
        return (InterfaceC1450920nrO) this.LLIZLLLIL.getValue(this, LLJJJIL[4]);
    }

    public final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLJIJIL.getValue(this, LLJJJIL[7]);
    }

    public final C0FVY c3() {
        return (C0FVY) this.LLILZ.getValue(this, LLJJJIL[0]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJILJILJ.getValue(this, LLJJJIL[9]);
    }

    public final C391030FUv m3() {
        return (C391030FUv) this.LLJJJ.getValue();
    }

    public final InterfaceC1464960oE2 o2() {
        return (InterfaceC1464960oE2) this.LLILZIL.getValue(this, LLJJJIL[1]);
    }

    public final InterfaceC388540FLg v3() {
        return (InterfaceC388540FLg) this.LLJI.getValue(this, LLJJJIL[6]);
    }

    @Override // X.C0FVT
    public C0FVY Aj() {
        return c3();
    }

    @Override // X.C0FVT
    public boolean LJLL() {
        List<StickerModel> listLLLILZLLLI;
        C0FVY c0fvyC3 = c3();
        if (c0fvyC3 == null || (listLLLILZLLLI = c0fvyC3.LLLILZLLLI(EnumC1466150oFx.TEXT)) == null || listLLLILZLLLI.isEmpty()) {
            return false;
        }
        Iterator<StickerModel> it2 = listLLLILZLLLI.iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof TextStickerModel) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C0FVT
    public List<TextStickerModel> Sb() {
        List<StickerModel> listLLLILZLLLI;
        C0FVY c0fvyC3 = c3();
        if (c0fvyC3 == null || (listLLLILZLLLI = c0fvyC3.LLLILZLLLI(EnumC1466150oFx.TEXT)) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLLILZLLLI, 10));
        Iterator<StickerModel> it2 = listLLLILZLLLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public final boolean Z1() {
        return C1416310mxZ.LJJLIIIJJIZ(getEditModel()) && C0FVE.LIZ(getEditModel());
    }

    @Override // X.C0FVT
    public void kj() {
        Iterator<TextStickerModel> it2 = Sb().iterator();
        while (it2.hasNext()) {
            Fj(it2.next().getId());
        }
    }

    @Override // X.C0FVT
    public C0FVQ nj() {
        return T2();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final Scene i3() {
        return this.LLILLJJLI;
    }

    public final Function0<C1462070o9N> q3() {
        return this.LLILLL;
    }

    @Override // X.C0FVT
    public C385670FAf<Boolean> s8() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C0FVT
    public void Fj(int i) {
        TextStickerModel next;
        C0FVY c0fvyC3;
        Iterator<TextStickerModel> it2 = Sb().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getId() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TextStickerModel textStickerModel = next;
        if (textStickerModel != null && (c0fvyC3 = c3()) != null) {
            c0fvyC3.L2(textStickerModel.getId());
        }
    }

    public void Q3(boolean z) {
        for (TextStickerModel textStickerModel : Sb()) {
            C0FVY c0fvyC3 = c3();
            if (c0fvyC3 != null) {
                c0fvyC3.J4(TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, z, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2049, 65535, null));
            }
        }
    }

    @Override // X.C0FVT
    public void Qi(StickerModel stickerModel) {
        C0FVY c0fvyC3 = c3();
        if (c0fvyC3 != null) {
            c0fvyC3.J4(stickerModel);
        }
    }

    @Override // X.C0FVT
    public void X3(TextWatcher textWatcher) {
        this.LLJJIJIL = textWatcher;
    }

    @Override // X.C0FVT
    public TextStickerModel ll(TextStickerModel textStickerModel) {
        StickerModel stickerModelF4;
        C0FVY c0fvyC3 = c3();
        if (c0fvyC3 != null) {
            stickerModelF4 = c0fvyC3.f4(textStickerModel);
        } else {
            stickerModelF4 = null;
        }
        return (TextStickerModel) stickerModelF4;
    }

    @Override // X.C0FVT
    public void Ca(int i, Function1<? super StickerModel, Unit> function1) {
        C0FVY c0fvyC3 = c3();
        if (c0fvyC3 != null) {
            c0fvyC3.lm(i, Collections.singletonList(function1));
        }
    }

    @Override // X.C0FVT
    public void D6(EnumC390580FTc enumC390580FTc, Function1<? super StickerModel, Boolean> function1) {
        List<TextStickerModel> listSb = Sb();
        ArrayList<TextStickerModel> arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : listSb) {
            if (function1 == null || function1.invoke(textStickerModel).booleanValue()) {
                arrayList.add(textStickerModel);
            }
        }
        for (TextStickerModel textStickerModel2 : arrayList) {
            C0FVY c0fvyC3 = c3();
            if (c0fvyC3 != null) {
                c0fvyC3.J4(TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, enumC390580FTc, null, null, false, -1, 14, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
            }
        }
    }

    @Override // X.C0FVT
    public void cj(float f, Function1<? super StickerModel, Boolean> function1) {
        List<TextStickerModel> listSb = Sb();
        ArrayList<TextStickerModel> arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : listSb) {
            if (function1 == null || function1.invoke(textStickerModel).booleanValue()) {
                arrayList.add(textStickerModel);
            }
        }
        for (TextStickerModel textStickerModel2 : arrayList) {
            C0FVY c0fvyC3 = c3();
            if (c0fvyC3 != null) {
                c0fvyC3.J4(TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0FVD(C1DRG c1drg, Scene scene, Function0<? extends C1462070o9N> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = scene;
        this.LLILLL = function0;
    }

    @Override // X.C0FVT
    public TextStickerModel Pj(TextStickerData textStickerData, boolean z, Function1<? super TextStickerModel, Unit> function1) {
        Pair<Integer, Integer> pairAl;
        C0FVY c0fvyC3 = c3();
        Pair pair = null;
        if (c0fvyC3 != null && (pairAl = c0fvyC3.al()) != null) {
            pair = new Pair(Integer.valueOf(pairAl.getFirst().intValue() / 2), Integer.valueOf(pairAl.getSecond().intValue() / 2));
        }
        TextStickerModel textStickerModelLIZLLL = C0F7U.LIZLLL(textStickerData, z, pair);
        function1.invoke(textStickerModelLIZLLL);
        TextStickerModel textStickerModelLl = ll(textStickerModelLIZLLL);
        C0FVY c0fvyC32 = c3();
        if (c0fvyC32 != null) {
            c0fvyC32.eb(textStickerModelLl);
        }
        return textStickerModelLl;
    }

    @Override // X.C0FVT
    public void xr(String str, C388340FKm c388340FKm, Function1<? super StickerModel, Unit> function1) {
        C0FVY c0fvyC3 = c3();
        if (c0fvyC3 != null) {
            c0fvyC3.Va1(EnumC1466150oFx.TEXT, null, c388340FKm, str, function1);
        }
    }
}
