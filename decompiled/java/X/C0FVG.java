package X;

import Y.AObjectS240S0100000_5;
import Y.AObjectS302S0200000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.text.TextWatcher;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0FVG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FVG extends AbstractC381020Ewm<C0FVM> implements C0FVT, C0FVM, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final C1DRG LLILLL;
    public final Scene LLILZ;
    public final InterfaceC1462140o9U LLILZIL;
    public final Function0<C1462070o9N> LLILZLL;
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
    public final C01GW LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public C385230F8n LLJJJ;
    public final C387590FHp LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final long LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public C0F9P LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final h0<Boolean> LLJZ;
    public TextWatcher LLJZIJLIL;
    public final C01GW LLL;
    public final C391180FVk LLLF;
    public final C01GW LLLFF;

    @Override // X.C0FVT
    public C0FVY Aj() {
        return null;
    }

    public C0FVM Z1() {
        return this;
    }

    @Override // X.C0FVT
    public C0FVQ nj() {
        return null;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0FVG.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0FVG.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0FVG.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0FVG.class, "readTextEffectOperator", "getReadTextEffectOperator()Lcom/ss/android/ugc/gamora/editor/sticker/read/panel/TTSPanelUIComponentApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0FVG.class, "textEditPanelApi", "getTextEditPanelApi()Lcom/ss/android/ugc/aweme/sticker/text/editpanel/TextEditPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0FVG.class, "unlockTTSVoiceVoiceApi", "getUnlockTTSVoiceVoiceApi()Lcom/ss/android/ugc/gamora/editor/sticker/read/unlocktts/UnlockReadTextVoiceApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0FVG.class, "textToSpeechApiComponent", "getTextToSpeechApiComponent()Lcom/ss/android/ugc/gamora/editor/audio/tts/base/TextToSpeechApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0FVG.class, "povOperator", "getPovOperator()Lcom/ss/android/ugc/gamora/editor/sticker/pov/panel/PovPanelUIComponentApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0FVG.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C0FVG.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C0FVG.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C0FVG.class, "memeAudioApiComponent", "getMemeAudioApiComponent()Lcom/ss/android/ugc/gamora/editor/audioservice/service/memeaudio/MemeAudioApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C0FVG.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/lightening/titlebar/BaseTitlebarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C0FVG.class, "editProAdapterApi", "getEditProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(C0FVG.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15};
    }

    private final C0FVL E3() {
        return (C0FVL) this.LLJL.getValue();
    }

    private final void Xi() {
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS584S0100000_5(this, 116));
        }
        w2().oG2().observe(this, new AObserverS209S0100000_5(this, 14));
        C0FWP c0fwpT4 = T4();
        c0fwpT4.LIZ.s8().LIZ((LifecycleOwner) c0fwpT4.LIZ, new AObjectS240S0100000_5(c0fwpT4, 14));
        if (!LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            C0F9P c0f9pO2 = o2();
            if (c0f9pO2 != null) {
                c0f9pO2.LIZLLL();
            }
        } else if (getDiContainer().LIZJ(InterfaceC1456910o13.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1456910o13.class, new AwS584S0100000_5(this, 117));
        }
        C0FVI c0fviW2 = W2();
        c0fviW2.LIZLLL.oG2().observe(c0fviW2.LIZIZ, new AObserverS209S0100000_5(c0fviW2, 13));
        ((IVoiceDetectorService) ServiceManager.get().getService(IVoiceDetectorService.class)).addVoiceDetectionResultListener(1, this.LLLF);
    }

    private final C0F9P q3() {
        return (C0F9P) this.LLJLILLLLZIIL.getValue();
    }

    public final InterfaceC19530111b1 B3() {
        return (InterfaceC19530111b1) this.LLJJIJI.getValue(this, LLLFFI[10]);
    }

    public final C0EYP G2() {
        return (C0EYP) this.LLJJJJ.getValue(this, LLLFFI[13]);
    }

    public final InterfaceC1456910o13 H2() {
        return (InterfaceC1456910o13) this.LLJ.getValue(this, LLLFFI[2]);
    }

    public final InterfaceC1410080mnW H3() {
        return (InterfaceC1410080mnW) this.LLJILLL.getValue(this, LLLFFI[7]);
    }

    public final InterfaceC388530FLf H4() {
        return (InterfaceC388530FLf) this.LLJIJIL.getValue(this, LLLFFI[4]);
    }

    public final C0FK0 K4() {
        return (C0FK0) this.LLJJL.getValue();
    }

    @Override // X.C0FVT
    public C0FF8 LJIIJ() {
        return new C0FF8() { // from class: X.0FVA
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
            public final InterfaceC388160FJu LJIIJ() {
                return null;
            }

            @Override // X.C0FF8
            public final void LJIIL() {
            }

            @Override // X.C0FF8
            public final boolean LJIJ() {
                return false;
            }

            @Override // X.C0FF8
            public final C0FGA Co() {
                NLEEditor nLEEditorLF2;
                C0FVG c0fvg = this.LIZ;
                C385230F8n c385230F8n = c0fvg.LLJJJ;
                if (c385230F8n != null) {
                    return c385230F8n;
                }
                InterfaceC1452170ntP interfaceC1452170ntPD5 = c0fvg.d5();
                if (interfaceC1452170ntPD5 == null || (nLEEditorLF2 = this.LIZ.LF2()) == null) {
                    return null;
                }
                C385230F8n c385230F8n2 = new C385230F8n(C1664590tQ1.LJIIIZ(this.LIZ), nLEEditorLF2, this.LIZ.getEditModel(), this.LIZ.w2(), interfaceC1452170ntPD5.getInitSize(), this.LIZ);
                this.LIZ.LLJJJ = c385230F8n2;
                return c385230F8n2;
            }

            @Override // X.C0FF8
            public final C0FGR LIZJ() {
                return this.LIZ.LLJJJIL;
            }

            @Override // X.C0FF8
            public final C0FF7 LJII() {
                return this.LIZ.H4();
            }

            @Override // X.C0FF8
            public final TextWatcher LJIIIZ() {
                return this.LIZ.LLJZIJLIL;
            }

            @Override // X.C0FF8
            public final boolean LJIILIIL() {
                return this.LIZ.getEditModel().isMvThemeVideoType();
            }

            @Override // X.C0FF8
            public final TTSVoiceModel LJIILL() {
                return this.LIZ.getEditModel().getTtsVoiceModel();
            }

            @Override // X.C0FF8
            public final C0FK0 LJIILLIIL() {
                return this.LIZ.K4();
            }

            @Override // X.C0FF8
            public final int LJIIZILJ() {
                InterfaceC1457610o2B interfaceC1457610o2BP4 = this.LIZ.P4();
                if (interfaceC1457610o2BP4 != null) {
                    return interfaceC1457610o2BP4.n2();
                }
                return 0;
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
            public final void LJIJJ(String str) {
                C0FWY.LJFF(C0FWY.LIZ, new ShortVideoCommonParams(this.LIZ.getEditModel().mShootWay, C1428470nHB.LJIILIIL(this.LIZ.getEditModel()), C1428470nHB.LJIILL(this.LIZ.getEditModel()), this.LIZ.getEditModel().getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null), str);
            }

            @Override // X.C0FF8
            public final void LJ(TextStickerModel textStickerModel, AwS549S0100000_5 awS549S0100000_5) {
                LiveEvent<Unit> liveEventIv1;
                if (!this.LIZ.T4().LJFF(textStickerModel)) {
                    this.LIZ.b1().postDelayed(new ARunnableS105S0100000_5(awS549S0100000_5, 22), 100L);
                    return;
                }
                C0FVG c0fvg = this.LIZ;
                AObjectS302S0200000_5 aObjectS302S0200000_5 = new AObjectS302S0200000_5(awS549S0100000_5, c0fvg, 3);
                C0FWT c0fwtO3 = c0fvg.O3();
                if (c0fwtO3 != null && (liveEventIv1 = c0fwtO3.Iv1()) != null) {
                    liveEventIv1.LIZ(this.LIZ, aObjectS302S0200000_5);
                }
            }

            @Override // X.C0FF8
            public final int LJIILJJIL(TextStickerModel textStickerModel, String str) {
                return this.LIZ.T4().LJIIIIZZ(textStickerModel, str, true);
            }

            @Override // X.C0FF8
            public final void LJFF(TextFontModel textFontModel, int i, int i2) {
                C0FVC.LIZ = textFontModel;
                C0FVC.LIZIZ = i;
                C0FVC.LIZJ = i2;
            }
        };
    }

    public final C0FWT O3() {
        return (C0FWT) this.LLJI.getValue(this, LLLFFI[3]);
    }

    public final InterfaceC391390FWf O4() {
        return (InterfaceC391390FWf) this.LLJILJILJ.getValue(this, LLLFFI[6]);
    }

    public final InterfaceC1457610o2B P4() {
        return (InterfaceC1457610o2B) this.LLJJIJIL.getValue(this, LLLFFI[12]);
    }

    @Override // X.C0FVT
    public Function1<StickerModel, Unit> Pi() {
        return new AwS584S0100000_5(this, 115);
    }

    public final C19EG T2() {
        return (C19EG) this.LLJJJJJIL.getValue(this, LLLFFI[14]);
    }

    public final C0FWP T4() {
        return (C0FWP) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C0FVI W2() {
        return (C0FVI) this.LLJLL.getValue();
    }

    public final C391050FUx X1() {
        return (C391050FUx) this.LLJLLIL.getValue();
    }

    public final InterfaceC2378409Tq Z4() {
        return (InterfaceC2378409Tq) this.LLJILJIL.getValue(this, LLLFFI[5]);
    }

    public final SafeHandler b1() {
        return (SafeHandler) this.LLL.getValue();
    }

    public final InterfaceC391240FVq c3() {
        return (InterfaceC391240FVq) this.LLIZ.getValue(this, LLLFFI[0]);
    }

    public final InterfaceC1452170ntP d5() {
        return (InterfaceC1452170ntP) this.LLJJIII.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJI.getValue(this, LLLFFI[9]);
    }

    public final InterfaceC1461650o8h i3() {
        return (InterfaceC1461650o8h) this.LLIZLLLIL.getValue(this, LLLFFI[1]);
    }

    public final C0FVH m3() {
        return (C0FVH) this.LLJLLL.getValue();
    }

    public final C391020FUu o4() {
        return (C391020FUu) this.LLLFF.getValue();
    }

    public final InterfaceC1457820o2W v3() {
        return (InterfaceC1457820o2W) this.LLJJIJIIJIL.getValue(this, LLLFFI[11]);
    }

    public final InterfaceC1455860nzM w2() {
        return (InterfaceC1455860nzM) this.LLJJ.getValue(this, LLLFFI[8]);
    }

    @Override // X.C0FVT
    public void Dj() {
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 != null) {
            interfaceC391240FVqC3.JF2(null, EnumC1466150oFx.TEXT);
        }
    }

    @Override // X.C0FVT
    public C0FVL Hj() {
        return E3();
    }

    public final NLEEditor LF2() {
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        InterfaceC1452170ntP interfaceC1452170ntPD5 = d5();
        if (!(interfaceC1452170ntPD5 instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) interfaceC1452170ntPD5) == null || (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) == null) {
            return null;
        }
        return c348100DkmLIZLLL.LIZ;
    }

    @Override // X.C0FVT
    public boolean LJLL() {
        List<StickerModel> listLLLILZLLLI;
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 == null || (listLLLILZLLLI = interfaceC391240FVqC3.LLLILZLLLI(EnumC1466150oFx.TEXT)) == null || listLLLILZLLLI.isEmpty()) {
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
    public C0FWP Ri() {
        return T4();
    }

    @Override // X.C0FVT
    public List<TextStickerModel> Sb() {
        List<StickerModel> listLLLILZLLLI;
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 == null || (listLLLILZLLLI = interfaceC391240FVqC3.LLLILZLLLI(EnumC1466150oFx.TEXT)) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLLILZLLLI, 10));
        Iterator<StickerModel> it2 = listLLLILZLLLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public final boolean k5() {
        DMMediaModel dMMediaModel;
        return getEditModel().isEnterFromDM() && (dMMediaModel = getEditModel().creativeModel.dmMediaModel) != null && dMMediaModel.type == 2;
    }

    @Override // X.C0FVT
    public void kj() {
        InterfaceC391240FVq interfaceC391240FVqC3;
        List<TextStickerModel> listSb = Sb();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSb, 10));
        Iterator<TextStickerModel> it2 = listSb.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getId()));
        }
        if (arrayList.isEmpty() || (interfaceC391240FVqC3 = c3()) == null) {
            return;
        }
        interfaceC391240FVqC3.M3(arrayList, null, EnumC356070Dxd.COMMIT);
    }

    @Override // X.C0FVT
    public C0FVI lj() {
        return W2();
    }

    @Override // X.C0FVT
    public C0F9P mj() {
        return o2();
    }

    public final C0F9P o2() {
        return LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent ? this.LLJLIL : q3();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C385230F8n c385230F8n = this.LLJJJ;
        if (c385230F8n != null) {
            c385230F8n.destroy();
        }
        ((IVoiceDetectorService) ServiceManager.get().getService(IVoiceDetectorService.class)).removeVoiceDetectionResultListener(this.LLLF);
    }

    @Override // X.C0FVT
    public InterfaceC391240FVq qj() {
        return c3();
    }

    public final Scene Q3() {
        return this.LLILZ;
    }

    public final InterfaceC1462140o9U e4() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.C0FVT
    public C385670FAf<Boolean> s8() {
        return this.LLJZ;
    }

    public final Function0<C1462070o9N> z4() {
        return this.LLILZLL;
    }

    public final String F4(TextStickerModel textStickerModel) {
        Map<String, String> map;
        Map<String, String> map2;
        TTSModel ttsModel = textStickerModel.getTtsModel();
        String str = null;
        if (ttsModel != null && ttsModel.ttsVoiceModel != null) {
            return "auto";
        }
        TTSModel ttsModel2 = textStickerModel.getTtsModel();
        if (ttsModel2 != null && (map = ttsModel2.ttsExtraMap) != null && map.containsKey("is_tts_reuse_mdp")) {
            TTSModel ttsModel3 = textStickerModel.getTtsModel();
            if (ttsModel3 != null && (map2 = ttsModel3.ttsExtraMap) != null) {
                str = map2.get("is_tts_reuse_mdp");
            }
            if (u.LJIJI(str, "1", false)) {
                return "tts_reuse";
            }
            return "user_click";
        }
        return "user_click";
    }

    @Override // X.C0FVT
    public void Fj(int i) {
        TextStickerModel next;
        InterfaceC391240FVq interfaceC391240FVqC3;
        Iterator<TextStickerModel> it2 = Sb().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (next.getId() != i);
        TextStickerModel textStickerModel = next;
        if (textStickerModel != null && (interfaceC391240FVqC3 = c3()) != null) {
            interfaceC391240FVqC3.XJ(textStickerModel.getId(), null, EnumC356070Dxd.COMMIT);
        }
    }

    @Override // X.C0FVT
    public void LJJJJJ(int i) {
        int iIntValue;
        int iIntValue2;
        for (TextStickerModel textStickerModel : Sb()) {
            Pair<Integer, Integer> pairLIZ = C391130FVf.LIZ((int) C364540EQy.LIZIZ(textStickerModel), (int) textStickerModel.getBaseStickerModel().getEndTime(), i);
            if (textStickerModel.getCaptionModel() != null && pairLIZ.getSecond().intValue() == 0) {
                pairLIZ = new Pair<>(Integer.valueOf((int) textStickerModel.getBaseStickerModel().getStartTime()), Integer.valueOf((int) textStickerModel.getBaseStickerModel().getEndTime()));
            }
            textStickerModel.getBaseStickerModel().setStartTime(pairLIZ.getFirst().intValue());
            textStickerModel.getBaseStickerModel().setEndTime(pairLIZ.getSecond().intValue());
            InterfaceC1452170ntP value = w2().g().getValue();
            BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
            if (value != null) {
                iIntValue = value.Te(pairLIZ.getFirst().intValue());
            } else {
                iIntValue = pairLIZ.getFirst().intValue();
            }
            baseStickerModel.setUiStartTime(iIntValue);
            BaseStickerModel baseStickerModel2 = textStickerModel.getBaseStickerModel();
            if (value != null) {
                iIntValue2 = value.Te(pairLIZ.getSecond().intValue());
            } else {
                iIntValue2 = pairLIZ.getSecond().intValue();
            }
            baseStickerModel2.setUiEndTime(iIntValue2);
            textStickerModel.getBaseStickerModel().setUiStartTime(pairLIZ.getFirst().intValue());
            textStickerModel.getBaseStickerModel().setUiEndTime(pairLIZ.getSecond().intValue());
            InterfaceC391240FVq interfaceC391240FVqC3 = c3();
            if (interfaceC391240FVqC3 != null) {
                interfaceC391240FVqC3.k3(textStickerModel, EnumC356070Dxd.COMMIT);
            }
        }
    }

    @Override // X.C0FVT
    public void Qi(StickerModel stickerModel) {
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 != null) {
            interfaceC391240FVqC3.k3(stickerModel, EnumC356070Dxd.COMMIT);
        }
    }

    @Override // X.C0FVT
    public void X3(TextWatcher textWatcher) {
        this.LLJZIJLIL = textWatcher;
    }

    @Override // X.C0FVT
    public void ad(List<Integer> list) {
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 != null) {
            interfaceC391240FVqC3.M3(list, null, EnumC356070Dxd.COMMIT);
        }
    }

    @Override // X.C0FVT
    public void hj(VideoPublishEditModel videoPublishEditModel) {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 != null) {
            interfaceC391240FVqC3.Ne(EnumC1466150oFx.TEXT, C1416310mxZ.LJJIJIL(videoPublishEditModel), "SYNC_FROM_EDITOR_PRO", new AwS406S0200000_5(this, videoPublishEditModel, 19), AFwS191S0000000_5.get$arr$(73));
        }
        InterfaceC1452170ntP value = w2().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            nLEEditor.done();
        }
    }

    @Override // X.C0FVT
    public TextStickerModel ll(TextStickerModel textStickerModel) {
        StickerModel stickerModelF3;
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 != null) {
            stickerModelF3 = interfaceC391240FVqC3.f3(textStickerModel, EnumC356070Dxd.COMMIT);
        } else {
            stickerModelF3 = null;
        }
        return (TextStickerModel) stickerModelF3;
    }

    public final void n5(boolean z) {
        u4.LJJLL(getEditModel(), z);
    }

    public void v5(boolean z) {
        for (TextStickerModel textStickerModel : Sb()) {
            InterfaceC391240FVq interfaceC391240FVqC3 = c3();
            if (interfaceC391240FVqC3 != null) {
                interfaceC391240FVqC3.k3(TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, z, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2049, 65535, null), EnumC356070Dxd.COMMIT);
            }
        }
    }

    @Override // X.C0FVT
    public void Ca(int i, Function1<? super StickerModel, Unit> function1) {
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 != null) {
            interfaceC391240FVqC3.lm(i, Collections.singletonList(function1));
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
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (TextStickerModel textStickerModel2 : arrayList) {
            arrayList2.add(TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, enumC390580FTc, null, null, false, -1, 14, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
        }
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 != null) {
            interfaceC391240FVqC3.T(arrayList2, EnumC356070Dxd.COMMIT);
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
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (TextStickerModel textStickerModel2 : arrayList) {
            arrayList2.add(TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
        }
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 != null) {
            interfaceC391240FVqC3.T(arrayList2, EnumC356070Dxd.COMMIT);
        }
    }

    @Override // X.C0FVT
    public TextStickerModel Pj(TextStickerData textStickerData, boolean z, Function1<? super TextStickerModel, Unit> function1) {
        Pair<Integer, Integer> pairAl;
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        Pair pair = null;
        if (interfaceC391240FVqC3 != null && (pairAl = interfaceC391240FVqC3.al()) != null) {
            pair = new Pair(Integer.valueOf(pairAl.getFirst().intValue() / 2), Integer.valueOf(pairAl.getSecond().intValue() / 2));
        }
        TextStickerModel textStickerModelLIZLLL = C0F7U.LIZLLL(textStickerData, z, pair);
        function1.invoke(textStickerModelLIZLLL);
        TextStickerModel textStickerModelLl = ll(textStickerModelLIZLLL);
        InterfaceC391240FVq interfaceC391240FVqC32 = c3();
        if (interfaceC391240FVqC32 != null) {
            interfaceC391240FVqC32.h12(textStickerModelLl);
        }
        return textStickerModelLl;
    }

    @Override // X.C0FVT
    public void xr(String str, C388340FKm c388340FKm, Function1<? super StickerModel, Unit> function1) {
        TextStickerModel textStickerModelLIZIZ = W2().LIZIZ();
        if (textStickerModelLIZIZ != null) {
            W2().LIZJ(textStickerModelLIZIZ, "click_button");
            return;
        }
        TextStickerModel textStickerModelLIZ = m3().LIZ();
        if (textStickerModelLIZ != null) {
            m3().LIZIZ(textStickerModelLIZ, "click_button");
            return;
        }
        InterfaceC391240FVq interfaceC391240FVqC3 = c3();
        if (interfaceC391240FVqC3 != null) {
            interfaceC391240FVqC3.Tn0(EnumC1466150oFx.TEXT, null, str, function1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [X.0FVk] */
    public C0FVG(C1DRG c1drg, Scene scene, InterfaceC1462140o9U interfaceC1462140o9U, Function0<? extends C1462070o9N> function0) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = scene;
        this.LLILZIL = interfaceC1462140o9U;
        this.LLILZLL = function0;
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461650o8h.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), C0FWT.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC388530FLf.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC2378409Tq.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391390FWf.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1410080mnW.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 138));
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19530111b1.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457820o2W.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457610o2B.class, null);
        this.LLJJJIL = new C387590FHp(getEditModel(), false);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EYP.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJJJLIIL = System.currentTimeMillis();
        this.LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 136));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 137));
        this.LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 133));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 132));
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 130));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 129));
        this.LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 131));
        this.LLJZ = new h0<>(Boolean.FALSE);
        this.LLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 134));
        this.LLLF = new VoiceDetectionListener() { // from class: X.0FVk
            @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
            public final void onUpdateResult(VoiceDetectionResult voiceDetectionResult) {
                VoiceDetectionListener.DefaultImpls.onUpdateResult(this, voiceDetectionResult);
            }

            @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
            public final void onVoiceActivityDetected(VoiceDetectionResult voiceDetectionResult) {
                AudioRatioInfo audioRatioInfo;
                if (!C1428470nHB.LJJJZ(this.LIZ.getEditModel()) && (audioRatioInfo = voiceDetectionResult.audioRatioInfo) != null) {
                    C0FVG c0fvg = this.LIZ;
                    if (audioRatioInfo.speechRatio > ((Number) C0A0N.LIZ.getValue()).floatValue()) {
                        u4.LJJLIIIJJIZ(c0fvg.getEditModel(), true, audioRatioInfo.speechRatio);
                        if (!C299120Bny.LIZ()) {
                            C1458390o3R c1458390o3R = C1458390o3R.LIZ;
                            VideoPublishEditModel editModel = c0fvg.getEditModel();
                            long j = c0fvg.LLJJJJLIIL;
                            c1458390o3R.getClass();
                            C1458390o3R.LJIJJ(j, editModel, false);
                            return;
                        }
                        return;
                    }
                    u4.LJJLIIIJJIZ(c0fvg.getEditModel(), false, audioRatioInfo.speechRatio);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
            public final void onExtractAudioPath(String str, int i, int i2) {
                VoiceDetectionListener.DefaultImpls.onExtractAudioPath(this, str, i, i2);
            }
        };
        this.LLLFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 135));
    }
}
