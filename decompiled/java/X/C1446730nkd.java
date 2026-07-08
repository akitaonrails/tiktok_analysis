package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.image.aicover.AICoverPluginService;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446730nkd extends AbstractC2255721DQs<C0MF0> implements InterfaceC379610EuV, C0MF0 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public boolean LLJI;
    public final C0MF0 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461660o8i.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC578430MmP.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1444170ngV.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC384890F7f.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1410280mnq.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1446730nkd.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1446730nkd.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1446730nkd.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1446730nkd.class, "switchModeApi", "getSwitchModeApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1446730nkd.class, "iEditStickerScene", "getIEditStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/IEditStickerScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1446730nkd.class, "iEditCompileCallback", "getIEditCompileCallback()Lcom/ss/android/ugc/gamora/editor/IEditCompileCallback;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1446730nkd.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1446730nkd.class, "switchModePayloadProvider", "getSwitchModePayloadProvider()Lcom/ss/android/ugc/aweme/image/switchmode/payload/ImageModeSwitchPayloadProviderApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLJILJILJ = 8;
    }

    private final InterfaceC384890F7f G2() {
        return (InterfaceC384890F7f) this.LLIZLLLIL.getValue(this, LLJILJIL[5]);
    }

    private final InterfaceC1444170ngV H2() {
        return (InterfaceC1444170ngV) this.LLIZ.getValue(this, LLJILJIL[4]);
    }

    private final InterfaceC1461350o8D Z1() {
        return (InterfaceC1461350o8D) this.LLJ.getValue(this, LLJILJIL[6]);
    }

    private final InterfaceC1410280mnq c3() {
        return (InterfaceC1410280mnq) this.LLJIJIL.getValue(this, LLJILJIL[7]);
    }

    private final InterfaceC1461660o8i o2() {
        return (InterfaceC1461660o8i) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    public final VideoPublishEditModel T2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    public final void W1() {
        C1446760nkg.LIZ.getClass();
        if (C1446760nkg.LIZJ()) {
            String creationId = T2().creativeModel.creativeInfo.getCreationId();
            if (!(!a0.LJJJIL(creationId)) || creationId == null) {
                return;
            }
            AICoverPluginService.LIZ.getClass();
            AICoverPluginService aICoverPluginServiceLIZ = C1446770nkh.LIZ();
            if (aICoverPluginServiceLIZ != null) {
                aICoverPluginServiceLIZ.LIZJ(T2(), creationId);
            }
        }
    }

    public final InterfaceC578430MmP W2() {
        return (InterfaceC578430MmP) this.LLILZLL.getValue(this, LLJILJIL[3]);
    }

    private final void q3() {
        InterfaceC1461350o8D interfaceC1461350o8DZ1;
        C0EZ1 c0ez1WM2;
        if (!getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) || (interfaceC1461350o8DZ1 = Z1()) == null || (c0ez1WM2 = interfaceC1461350o8DZ1.WM2()) == null) {
            return;
        }
        c0ez1WM2.r(EnumC356070Dxd.COMMIT);
    }

    private final void v3() {
        H2().LJLI();
    }

    private final InterfaceC1452170ntP w2() {
        return JY0().g().getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C560530Lyd<Unit> c560530Lyd;
        C560530Lyd<String> c560530Lyd2;
        InterfaceC391240FVq interfaceC391240FVqU30;
        LiveEvent<Boolean> liveEventGm1;
        C385670FAf<SwitchModePayload> c385670FAfB31;
        super.onCreate();
        JY0().nK2().observe(this, new AObserverS225S0100000_22(this, 32));
        W2().Gc0().observe(this, new AObserverS225S0100000_22(this, 33));
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(C1417330mzD.class, new AwS601S0100000_22(this, 130));
        } else {
            C1417330mzD c1417330mzD = (C1417330mzD) getDiContainer().LJIIL(null, C1417330mzD.class);
            if (c1417330mzD != null && (c560530Lyd2 = c1417330mzD.LLJJJ) != null) {
                c560530Lyd2.LIZ(this, new AObjectS245S0100000_22(this, 34));
            }
            C1417330mzD c1417330mzD2 = (C1417330mzD) getDiContainer().LJIIL(null, C1417330mzD.class);
            if (c1417330mzD2 != null && (c560530Lyd = c1417330mzD2.LLJJJIL) != null) {
                c560530Lyd.LIZ(this, new AObjectS245S0100000_22(this, 35));
            }
        }
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS601S0100000_22(this, 131));
        } else {
            InterfaceC1461350o8D interfaceC1461350o8DZ1 = Z1();
            if (interfaceC1461350o8DZ1 != null && (interfaceC391240FVqU30 = interfaceC1461350o8DZ1.u30()) != null && (liveEventGm1 = interfaceC391240FVqU30.Gm1()) != null) {
                liveEventGm1.LIZ(this, new AObjectS245S0100000_22(this, 37));
            }
        }
        JY0().UU().observe(this, new AObserverS225S0100000_22(this, 34));
        InterfaceC1410280mnq interfaceC1410280mnqC3 = c3();
        if (interfaceC1410280mnqC3 != null && (c385670FAfB31 = interfaceC1410280mnqC3.B31()) != null) {
            c385670FAfB31.LIZ(this, new AObjectS245S0100000_22(this, 38));
        }
        JY0().cA2().observe(this, new AObserverS225S0100000_22(this, 30));
        JY0().Vh().observe(this, new AObserverS225S0100000_22(this, 31));
        JY0().t90().LJII(this, Lifecycle.State.CREATED, new AObjectS245S0100000_22(this, 31));
    }

    public C0MF0 X1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1446730nkd(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0MF0
    public void z50(SwitchModePayload switchModePayload, Bundle bundle) {
        i3(this, switchModePayload, bundle);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void i3(C1446730nkd c1446730nkd, SwitchModePayload switchModePayload, Bundle bundle) {
        String strZf;
        List<StickerItemModel> list;
        Collection collection = C13BV.INSTANCE;
        if (!C1416310mxZ.LJJLIIIJJIZ(c1446730nkd.T2())) {
            List<TextStickerData> listEt0 = c1446730nkd.o2().Et0();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listEt0, 10));
            int i = 0;
            for (TextStickerData textStickerData : listEt0) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(C0F7Y.LIZ(textStickerData, i));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            collection = arrayList;
            if (c1446730nkd.T2().getInfoStickerModel() == null) {
                boolean z = !arrayList.isEmpty();
                collection = arrayList;
                if (z) {
                    c1446730nkd.T2().setInfoStickerModel(new InfoStickerModel(c1446730nkd.T2().draftDir()));
                    collection = arrayList;
                }
            }
        }
        InfoStickerModel infoStickerModel = c1446730nkd.T2().getInfoStickerModel();
        if (infoStickerModel != null) {
            infoStickerModel.clearTextStickers();
        }
        c1446730nkd.q3();
        VideoPublishEditModel videoPublishEditModelT2 = c1446730nkd.T2();
        InterfaceC1452170ntP interfaceC1452170ntPW2 = c1446730nkd.w2();
        if (interfaceC1452170ntPW2 != null) {
            strZf = interfaceC1452170ntPW2.Zf();
        } else {
            strZf = null;
        }
        videoPublishEditModelT2.setNleData(strZf);
        InfoStickerModel infoStickerModel2 = c1446730nkd.T2().getInfoStickerModel();
        if (infoStickerModel2 != null && (list = infoStickerModel2.stickers) != null) {
            list.addAll((Collection<? extends StickerItemModel>) collection);
        }
        c1446730nkd.v3();
        C1414930mvL.LIZ.getClass();
        C1414930mvL.LIZIZ = null;
        c1446730nkd.W2().xL2(switchModePayload, bundle);
    }
}
