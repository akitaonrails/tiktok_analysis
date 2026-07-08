package X;

import Y.AComparatorS24S0000000_5;
import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391160FVi extends AbstractC2255721DQs<InterfaceC1455620nyy> implements InterfaceC1455620nyy, InterfaceC379610EuV {
    public static final C391230FVp LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final int LLJLL;
    public final C1DRG LL;
    public final MutableLiveData<Boolean> LLILLJJLI = new MutableLiveData<>();
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EPM.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
    public final C0FIG LLJ;
    public C0FCA LLJI;
    public final TextPaint LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public volatile Effect LLJILLL;
    public volatile HashMap<String, Effect> LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final List<Function0<Unit>> LLJJLIIIJLLLLLLLZ;
    public final C391170FVj LLJL;

    @Override // X.InterfaceC1455620nyy
    public void AA() {
        this.LLJJIJIL = true;
    }

    public InterfaceC1455620nyy Z1() {
        return this;
    }

    @Override // X.InterfaceC1455620nyy
    public void jE() {
        this.LLJJIJIL = true;
        AbstractC2217051Bpv abstractC2217051BpvRw1 = rw1();
        if (abstractC2217051BpvRw1 != null) {
            abstractC2217051BpvRw1.LIZ();
        }
    }

    @Override // X.InterfaceC1455620nyy
    public void oy() {
        this.LLJJJ = true;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0FVp] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C391160FVi.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C391160FVi.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C391160FVi.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0), new C2217381BqS(C391160FVi.class, "captionApi", "getCaptionApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/CaptionApiComponent;", 0), new C2217381BqS(C391160FVi.class, "adapterApi", "getAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C391160FVi.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new C2217381BqS(C391160FVi.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C391160FVi.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0), new C2217381BqS(C391160FVi.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLJLIL = new Object() { // from class: X.0FVp
        };
        LLJLL = 8;
    }

    private final InterfaceC559500Lwy G2() {
        return (InterfaceC559500Lwy) this.LLJJIII.getValue(this, LLJLILLLLZIIL[7]);
    }

    private final InterfaceC1455860nzM H2() {
        return (InterfaceC1455860nzM) this.LLILLL.getValue(this, LLJLILLLLZIIL[0]);
    }

    private final InterfaceC1456910o13 T2() {
        return (InterfaceC1456910o13) this.LLILZIL.getValue(this, LLJLILLLLZIIL[2]);
    }

    private final InterfaceC1455850nzL X1() {
        return (InterfaceC1455850nzL) this.LLIZ.getValue(this, LLJLILLLLZIIL[4]);
    }

    private final InterfaceC377540ErA c3() {
        return (InterfaceC377540ErA) this.LLILZ.getValue(this, LLJLILLLLZIIL[1]);
    }

    private final InterfaceC1461390o8H i3() {
        return (InterfaceC1461390o8H) this.LLIZLLLIL.getValue(this, LLJLILLLLZIIL[5]);
    }

    private final void init() {
        LiveEvent<Pair<EnumC377550ErB, Float>> liveEventOn0;
        LiveData<Integer> liveDataWw;
        LiveData<Boolean> liveDataPy1;
        LiveData<Integer> currentState;
        if (this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIIJIL = true;
        ((IVoiceDetectorService) ServiceManager.get().getService(IVoiceDetectorService.class)).addVoiceDetectionResultListener(1, this.LLJL);
        InterfaceC1460000o62 interfaceC1460000o62W2 = W2();
        if (interfaceC1460000o62W2 != null && (currentState = interfaceC1460000o62W2.getCurrentState()) != null) {
            currentState.observe(this, new AObserverS209S0100000_5(this, 5));
        }
        InterfaceC1460000o62 interfaceC1460000o62W22 = W2();
        if (interfaceC1460000o62W22 != null && (liveDataPy1 = interfaceC1460000o62W22.Py1()) != null) {
            liveDataPy1.observe(this, new AObserverS209S0100000_5(this, 6));
        }
        InterfaceC1460000o62 interfaceC1460000o62W23 = W2();
        if (interfaceC1460000o62W23 != null && (liveDataWw = interfaceC1460000o62W23.ww()) != null) {
            liveDataWw.observe(this, new AObserverS209S0100000_5(this, 7));
        }
        InterfaceC377540ErA interfaceC377540ErAC3 = c3();
        if (interfaceC377540ErAC3 != null && (liveEventOn0 = interfaceC377540ErAC3.on0()) != null) {
            liveEventOn0.LIZ(this, new AObjectS240S0100000_5(this, 12));
        }
        H2().ZB2().observe(this, new InterfaceC1462580oAC() { // from class: X.0FVm
            @Override // X.InterfaceC1462580oAC
            public final void LIZ(Object obj, Object obj2) {
                this.LIZ.oy();
                this.LIZ.jE();
            }
        });
        H2().op().observe(this, new AObserverS209S0100000_5(this, 8));
        i3().LIZIZ(new GestureInteractItem(0, new C0FUM() { // from class: X.0FVl
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C391160FVi c391160FVi = this.LL;
                if (c391160FVi.LLJJJIL) {
                    c391160FVi.LLJJJIL = false;
                    InterfaceC1460000o62 interfaceC1460000o62W24 = c391160FVi.W2();
                    if (interfaceC1460000o62W24 != null) {
                        interfaceC1460000o62W24.TA2(EnumC1651790t5N.CAPTION);
                    }
                }
                return false;
            }
        }));
    }

    public final C387590FHp B3() {
        return (C387590FHp) this.LLJJL.getValue();
    }

    public final void O3() {
        C391040FUw.LIZ.getClass();
        if (C391040FUw.LIZIZ.getBoolean("text_caption_guide_show", false)) {
            return;
        }
        C354270Duj.LIZ(400L, new AwS549S0100000_5(this, 105));
    }

    public final void Q3() {
        InterfaceC1460000o62 interfaceC1460000o62W2;
        LiveData<Integer> currentState;
        Integer value;
        LiveData<Boolean> liveDataPy1;
        LiveData<Boolean> liveDataHB;
        if (this.LLJJIJIL || this.LLJJJ) {
            return;
        }
        InterfaceC1460000o62 interfaceC1460000o62W22 = W2();
        if (interfaceC1460000o62W22 != null && (liveDataHB = interfaceC1460000o62W22.hB(11)) != null && Intrinsics.LJFF(liveDataHB.getValue(), Boolean.FALSE)) {
            oy();
            jE();
            return;
        }
        if (this.LLJJJJ || (interfaceC1460000o62W2 = W2()) == null || (currentState = interfaceC1460000o62W2.getCurrentState()) == null || (value = currentState.getValue()) == null || value.intValue() != 0) {
            return;
        }
        InterfaceC1460000o62 interfaceC1460000o62W23 = W2();
        if (interfaceC1460000o62W23 == null || (liveDataPy1 = interfaceC1460000o62W23.Py1()) == null || !Intrinsics.LJFF(liveDataPy1.getValue(), Boolean.FALSE)) {
            this.LLJJJIL = true;
            this.LLJJJJ = true;
            InterfaceC1460000o62 interfaceC1460000o62W24 = W2();
            if (interfaceC1460000o62W24 != null) {
                interfaceC1460000o62W24.Ga0(11, new C1662100tM0(EnumC1651790t5N.CAPTION, "", C1664590tQ1.LJII(this).getString(2131840049), false, Mp4ScreenVideoLoadTimeout.CONTROL, null, EnumC862650Xsl.BELOW_ICON, null, null, EnumC1662090tLz.NORMAL, new AwS549S0100000_5(this, 106), null, null, 6560));
            }
            C391040FUw.LIZ.getClass();
            C391040FUw.LIZIZ.storeBoolean("text_caption_guide_show", true);
            C1402610mbT.LJIJJ(q3(), false);
        }
    }

    public final InterfaceC1460000o62 W2() {
        return (InterfaceC1460000o62) this.LLJJI.getValue(this, LLJLILLLLZIIL[6]);
    }

    public final void e4() {
        InterfaceC1452170ntP value;
        NLEModel nLEModelLIZ;
        InterfaceC1460000o62 interfaceC1460000o62W2;
        LiveData<Integer> currentState;
        Integer value2;
        InterfaceC1460000o62 interfaceC1460000o62W22;
        LiveData<Boolean> liveDataPy1;
        if (this.LLJJJJJIL || (interfaceC1460000o62W2 = W2()) == null || (currentState = interfaceC1460000o62W2.getCurrentState()) == null || (value2 = currentState.getValue()) == null || value2.intValue() != 0 || !((interfaceC1460000o62W22 = W2()) == null || (liveDataPy1 = interfaceC1460000o62W22.Py1()) == null || !Intrinsics.LJFF(liveDataPy1.getValue(), Boolean.FALSE))) {
            H3(new AwS549S0100000_5(this, 107));
        } else {
            W1(true);
        }
        if (this.LLJJIJIL || (value = H2().g().getValue()) == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null) {
            return;
        }
        AbstractC2217051Bpv abstractC2217051BpvRw1 = rw1();
        if (abstractC2217051BpvRw1 != null) {
            abstractC2217051BpvRw1.LJIILJJIL(nLEModelLIZ, new AwS406S0200000_5(this, nLEModelLIZ, 16));
        }
        if (!C305200Bxm.LIZ(q3()) || !u4.LJIIIIZZ(q3())) {
            C0FI2.LJIJJLI("textfont").LIZLLL("Proxima-Nova-Semibold.otf", new C0FI9() { // from class: X.0FVo
                @Override // X.C0FI9
                public final void onFail() {
                }

                @Override // X.C0FI9
                public final void onSuccess() {
                }

                @Override // X.C0FI9
                public final /* bridge */ /* synthetic */ void LIZ(Boolean bool) {
                    bool.booleanValue();
                }
            }, Boolean.TRUE);
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0FCF(this, null), 2);
    }

    public final VideoPublishEditModel q3() {
        return (VideoPublishEditModel) this.LLJJIJI.getValue(this, LLJLILLLLZIIL[8]);
    }

    public final C365380EUe v3() {
        return (C365380EUe) this.LLJJJJLIIL.getValue();
    }

    public final C0EPM w2() {
        return (C0EPM) this.LLILZLL.getValue(this, LLJLILLLLZIIL[3]);
    }

    private final long m3() {
        C385670FAf<InterfaceC391240FVq> c385670FAfNr0;
        InterfaceC391240FVq interfaceC391240FVqLIZJ;
        List<StickerModel> listLLLILZLLLI;
        float fLIZIZ = -1.0f;
        float fLLL = H2().g().getValue() != null ? r0.LLL() : -1.0f;
        float duration = H2().g().getValue() != null ? r0.getDuration() : -1.0f;
        if (fLLL < 0.0f || duration < 0.0f) {
            return 3000L;
        }
        InterfaceC1455850nzL interfaceC1455850nzLX1 = X1();
        long startTime = -1;
        if (interfaceC1455850nzLX1 == null || (c385670FAfNr0 = interfaceC1455850nzLX1.Nr0()) == null || (interfaceC391240FVqLIZJ = c385670FAfNr0.LIZJ()) == null || (listLLLILZLLLI = interfaceC391240FVqLIZJ.LLLILZLLLI(EnumC1466150oFx.TEXT)) == null) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        for (StickerModel stickerModel : listLLLILZLLLI) {
            if ((stickerModel instanceof TextStickerModel) && stickerModel != null) {
                arrayList.add(stickerModel);
            }
        }
        List<TextStickerModel> listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(17), arrayList);
        if (listLJLLLL == null) {
            return -1L;
        }
        for (TextStickerModel textStickerModel : listLJLLLL) {
            if (fLIZIZ <= 0.0f) {
                fLIZIZ = C364540EQy.LIZIZ(textStickerModel);
            }
            if (startTime < 0) {
                float fLIZIZ2 = C364540EQy.LIZIZ(textStickerModel);
                if (fLLL <= textStickerModel.getBaseStickerModel().getEndTime() && fLIZIZ2 <= fLLL) {
                    startTime = 3000;
                }
            }
            if (startTime < 0 && fLLL > 0.0f && fLLL < C364540EQy.LIZIZ(textStickerModel)) {
                startTime = ((long) LivePreCreateNextRoomPlayer.ENABLE) + ((long) (textStickerModel.getBaseStickerModel().getStartTime() - fLLL));
            }
        }
        return (startTime >= 0 || fLIZIZ <= 0.0f) ? startTime : (long) ((duration - fLLL) + fLIZIZ + LivePreCreateNextRoomPlayer.ENABLE);
    }

    public final boolean E3() {
        C385670FAf<InterfaceC391240FVq> c385670FAfNr0;
        InterfaceC391240FVq interfaceC391240FVqLIZJ;
        List<StickerModel> listLLLILZLLLI;
        TextStickerModel textStickerModel;
        InterfaceC1455850nzL interfaceC1455850nzLX1 = X1();
        if (interfaceC1455850nzLX1 == null || (c385670FAfNr0 = interfaceC1455850nzLX1.Nr0()) == null || (interfaceC391240FVqLIZJ = c385670FAfNr0.LIZJ()) == null || (listLLLILZLLLI = interfaceC391240FVqLIZJ.LLLILZLLLI(EnumC1466150oFx.TEXT)) == null) {
            return false;
        }
        Iterator<StickerModel> it2 = listLLLILZLLLI.iterator();
        while (it2.hasNext()) {
            StickerModel next = it2.next();
            StickerModel stickerModel = next;
            if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && textStickerModel.getCaptionModel() != null) {
                return next != null;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1455620nyy
    public boolean cG1() {
        AbstractC2217051Bpv abstractC2217051BpvRw1 = rw1();
        return (abstractC2217051BpvRw1 == null || abstractC2217051BpvRw1.LJIJJLI == null) ? false : true;
    }

    public final void o4() {
        C391210FVn c391210FVn;
        Effect effect;
        AbstractC2217051Bpv abstractC2217051BpvRw1 = rw1();
        if (abstractC2217051BpvRw1 == null || (c391210FVn = abstractC2217051BpvRw1.LJIJJLI) == null) {
            return;
        }
        HashMap<String, Effect> map = this.LLJJ;
        if (map != null) {
            effect = map.get(c391210FVn.LIZIZ);
            if (effect == null && (effect = map.get("")) == null) {
                effect = (Effect) C13LP.LJJJLIIL(map.values());
            }
        } else {
            effect = null;
        }
        this.LLJILLL = effect;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        ((IVoiceDetectorService) ServiceManager.get().getService(IVoiceDetectorService.class)).removeVoiceDetectionResultListener(this.LLJL);
        AbstractC2217051Bpv abstractC2217051BpvRw1 = rw1();
        if (abstractC2217051BpvRw1 != null) {
            abstractC2217051BpvRw1.LIZ();
        }
    }

    public final AbstractC2217051Bpv rw1() {
        if (u4.LJLJJI(q3())) {
            C0ET3 c0et3 = C0ET3.LIZ;
            VideoPublishEditModel videoPublishEditModelQ3 = q3();
            c0et3.getClass();
            if (C0ET3.LIZ(videoPublishEditModelQ3)) {
                if (C289250BVj.LIZ(q3())) {
                    C0EPM c0epmW2 = w2();
                    if (c0epmW2 != null) {
                        return c0epmW2.LLLFFI(q3(), false);
                    }
                    return null;
                }
                InterfaceC377540ErA interfaceC377540ErAC3 = c3();
                if (interfaceC377540ErAC3 != null) {
                    return interfaceC377540ErAC3.tD0(q3(), false);
                }
                return null;
            }
        }
        InterfaceC1456910o13 interfaceC1456910o13T2 = T2();
        if (interfaceC1456910o13T2 != null) {
            return interfaceC1456910o13T2.rw1();
        }
        return null;
    }

    @Override // X.InterfaceC1455620nyy
    public void Mf() {
        init();
    }

    @Override // X.InterfaceC1455620nyy
    public Effect Oh0() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1455620nyy
    public boolean u10() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1455620nyy
    public LiveData<Boolean> yS0() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.0FVj] */
    public C391160FVi(C1DRG c1drg) {
        this.LL = c1drg;
        C786410Ut5.M3(C0CHQ.LIZ);
        this.LLJ = new C0FIG();
        this.LLJIJIL = new TextPaint();
        this.LLJILJIL = C1919207fS.LIZIZ() * 2;
        this.LLJILJILJ = C1919207fS.LJIIJJI();
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(62));
        this.LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 108));
        this.LLJJLIIIJLLLLLLLZ = new ArrayList();
        this.LLJL = new VoiceDetectionListener() { // from class: X.0FVj
            @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
            public final void onUpdateResult(VoiceDetectionResult voiceDetectionResult) {
                VoiceDetectionListener.DefaultImpls.onUpdateResult(this, voiceDetectionResult);
            }

            @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
            public final void onVoiceActivityDetected(VoiceDetectionResult voiceDetectionResult) {
                LiveData<Boolean> liveDataHB;
                AudioRatioInfo audioRatioInfo = voiceDetectionResult.audioRatioInfo;
                if (audioRatioInfo == null) {
                    this.LIZ.LLILLJJLI.setValue(Boolean.FALSE);
                    return;
                }
                C391160FVi c391160FVi = this.LIZ;
                if (audioRatioInfo.speechRatio > ((Number) C0A0N.LIZ.getValue()).floatValue()) {
                    c391160FVi.LLILLJJLI.setValue(Boolean.TRUE);
                    if (!c391160FVi.LLJJJ) {
                        List<TextStickerModel> list = c391160FVi.q3().creativeModel.stickerModel.textStickerModels;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<TextStickerModel> it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (C0F8Y.LJIIIIZZ(it2.next())) {
                                    return;
                                }
                            }
                        }
                        InterfaceC1460000o62 interfaceC1460000o62W2 = c391160FVi.W2();
                        if (interfaceC1460000o62W2 != null && (liveDataHB = interfaceC1460000o62W2.hB(11)) != null && Intrinsics.LJFF(liveDataHB.getValue(), Boolean.FALSE)) {
                            c391160FVi.oy();
                            c391160FVi.jE();
                            return;
                        } else {
                            c391160FVi.e4();
                            return;
                        }
                    }
                    return;
                }
                c391160FVi.LLILLJJLI.setValue(Boolean.FALSE);
            }

            @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
            public final void onExtractAudioPath(String str, int i, int i2) {
                VoiceDetectionListener.DefaultImpls.onExtractAudioPath(this, str, i, i2);
            }
        };
    }

    private final BaseStickerModel o2(TextStickerModel textStickerModel) {
        C385670FAf<InterfaceC391240FVq> c385670FAfNr0;
        InterfaceC391240FVq interfaceC391240FVqLIZJ;
        View viewAS;
        int width;
        int height;
        InterfaceC1455850nzL interfaceC1455850nzLX1 = X1();
        if (interfaceC1455850nzLX1 != null && (c385670FAfNr0 = interfaceC1455850nzLX1.Nr0()) != null && (interfaceC391240FVqLIZJ = c385670FAfNr0.LIZJ()) != null && (viewAS = interfaceC391240FVqLIZJ.aS()) != null) {
            String textStrWithLineBreak = textStickerModel.getTextStrWithLineBreak();
            if (textStrWithLineBreak.length() == 0) {
                textStrWithLineBreak = textStickerModel.getHint();
            }
            TextPaint textPaint = this.LLJIJIL;
            textPaint.setTypeface(this.LLJ.LIZ(textStickerModel.getFontModel().fileName));
            textPaint.setTextSize(C418440Gaw.LJ(Integer.valueOf(textStickerModel.getFontModel().fontSize)));
            List listLJJLIIIJ = a0.LJJLIIIJ(textStrWithLineBreak, new char[]{'\n'}, false, 0, 6);
            if (viewAS.getWidth() > 0) {
                width = viewAS.getWidth();
            } else {
                width = viewAS.getLayoutParams().width;
            }
            if (viewAS.getHeight() > 0) {
                height = viewAS.getHeight();
            } else {
                height = viewAS.getLayoutParams().height;
            }
            Iterator it2 = listLJJLIIIJ.iterator();
            float fMax = 0.0f;
            while (it2.hasNext()) {
                fMax = Math.max(fMax, this.LLJIJIL.measureText((String) it2.next()));
            }
            StaticLayout staticLayout = new StaticLayout(textStrWithLineBreak, this.LLJIJIL, 536870911, Layout.Alignment.ALIGN_NORMAL, 1.0f, textStickerModel.getLineSpacingExtra(), true);
            int iLIZIZ = ((int) fMax) + (this.LLJILJIL * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            int height2 = staticLayout.getHeight() + (this.LLJILJILJ * 2);
            Rect rect = new Rect();
            int i = (width - iLIZIZ) / 2;
            rect.left = i;
            rect.right = i + iLIZIZ;
            int i2 = (height - height2) / 2;
            rect.top = i2;
            rect.bottom = i2 + height2;
            return BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, 0, null, i, i2, width / 2.0f, height / 2.0f, rect.width(), rect.height(), viewAS.getLeft(), viewAS.getTop(), width, height, width, height, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, null, null, null, false, -1073774585, 15, null);
        }
        return new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
    }

    public final void H3(Function0<Unit> function0) {
        this.LLJJLIIIJLLLLLLLZ.add(function0);
    }

    public final void W1(boolean z) {
        LiveData<Boolean> liveDataHB;
        InterfaceC1460000o62 interfaceC1460000o62W2 = W2();
        if (interfaceC1460000o62W2 != null && (liveDataHB = interfaceC1460000o62W2.hB(11)) != null && Intrinsics.LJFF(liveDataHB.getValue(), Boolean.FALSE)) {
            oy();
            jE();
            return;
        }
        C1402610mbT.LJIJI(q3(), false);
        C391040FUw c391040FUw = C391040FUw.LIZ;
        int iHashCode = hashCode();
        c391040FUw.getClass();
        Keva keva = C391040FUw.LIZIZ;
        ArrayList arrayList = new ArrayList(a0.LJJLIIIJILLIZJL(keva.getString("text_not_use_caption_creation_ids", ""), new String[]{","}, 0, 6));
        if (keva.getBoolean("text_caption_item_first_pin", true)) {
            keva.storeBoolean("text_caption_item_first_pin", false);
            arrayList.add("text_caption_item_first_pin");
        }
        arrayList.add(String.valueOf(iHashCode));
        keva.storeString("text_not_use_caption_creation_ids", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        q3().creativeModel.stickerModel.captionItemBarVisible = true;
        InterfaceC559500Lwy interfaceC559500LwyG2 = G2();
        if (interfaceC559500LwyG2 != null) {
            interfaceC559500LwyG2.Qk(false);
        }
        this.LLJJJJJIL = true;
        LayoutTransition layoutTransition = null;
        if (z) {
            layoutTransition = new LayoutTransition();
            layoutTransition.setAnimateParentHierarchy(false);
            layoutTransition.disableTransitionType(0);
            layoutTransition.disableTransitionType(1);
            layoutTransition.setAnimator(2, ObjectAnimator.ofFloat((Object) null, "translationY", 0.0f, -C1659140tHE.LLJJL).setDuration(200L));
            layoutTransition.setAnimator(3, ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, 0.0f).setDuration(200L));
            layoutTransition.setDuration(200L);
        }
        InterfaceC1460000o62 interfaceC1460000o62W22 = W2();
        if (interfaceC1460000o62W22 != null) {
            interfaceC1460000o62W22.xD2(11, layoutTransition);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
    @Override // X.InterfaceC1455620nyy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z60(android.content.Context r55, X.C364440EQo r56) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C391160FVi.z60(android.content.Context, X.0EQo):boolean");
    }
}
