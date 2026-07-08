package X;

import Y.AObjectS245S0100000_22;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import nv7.c0;

/* JADX INFO: renamed from: X.0nkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446690nkZ extends AbstractC2255721DQs<InterfaceC1456870o0z> implements InterfaceC379610EuV, InterfaceC1456870o0z {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455680nz4.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444170ngV.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457660o2G.class, null);
    public final InterfaceC1456870o0z LLIZLLLIL = this;
    public final InterfaceC332260D0u<C1666530tT9> LLJ;
    public View LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final C01GW LLJILJIL;
    public final h0<Integer> LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1446690nkZ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1446690nkZ.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1446690nkZ.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1446690nkZ.class, "editStickerScene", "getEditStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/IEditStickerScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1446690nkZ.class, "changeAvatarComponent", "getChangeAvatarComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/changeavatar/ChangeAvatarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1446690nkZ.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJJ = 8;
    }

    private final InterfaceC1457660o2G G2() {
        return (InterfaceC1457660o2G) this.LLIZ.getValue(this, LLJILLL[4]);
    }

    private final InterfaceC1453420nvQ H2() {
        return (InterfaceC1453420nvQ) this.LLILZ.getValue(this, LLJILLL[1]);
    }

    private final InterfaceC1455860nzM T2() {
        return (InterfaceC1455860nzM) this.LLILLL.getValue(this, LLJILLL[0]);
    }

    private final InterfaceC1444170ngV W2() {
        return (InterfaceC1444170ngV) this.LLILZLL.getValue(this, LLJILLL[3]);
    }

    private final InterfaceC1455680nz4 Z1() {
        return (InterfaceC1455680nz4) this.LLILZIL.getValue(this, LLJILLL[2]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJIJIL.getValue(this, LLJILLL[5]);
    }

    private final Bundle w2() {
        return (Bundle) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1456870o0z
    public void lV() {
        long jLIZ;
        View view;
        InterfaceC1453420nvQ interfaceC1453420nvQH2;
        if (this.LLJ.getValue().LIZJ) {
            Bundle bundleW2 = w2();
            if (bundleW2 != null) {
                C1422040n6o.LIZ.getClass();
                jLIZ = C1422040n6o.LIZ(bundleW2);
            } else {
                jLIZ = -1;
            }
            long j = getEditModel().creativeModel.ffdEventReport.editUiFFD - jLIZ;
            long j2 = getEditModel().creativeModel.ffdEventReport.editFFD - jLIZ;
            C1457570o27 c1457570o27 = C1457570o27.LIZ;
            String creationId = getEditModel().getCreationId();
            String strLJI = C1403540mcy.LJI(getEditModel(), null);
            String enterFrom = getEditModel().getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            String strLJIILL = C1428470nHB.LJIILL(getEditModel());
            String strLJIILIIL = C1428470nHB.LJIILIIL(getEditModel());
            c1457570o27.getClass();
            C1457570o27.LIZIZ("tool_performance_enter_edit_page", creationId, strLJI, jLIZ, j2, j, 0, "exit", enterFrom, strLJIILL, strLJIILIIL, false, false, false);
            InterfaceC1444170ngV interfaceC1444170ngVW2 = W2();
            if (interfaceC1444170ngVW2 != null) {
                interfaceC1444170ngVW2.LLIIIJ();
            }
            if (getEditModel().mDraftToEditFrom == 7 || getEditModel().mDraftToEditFrom == 8) {
                InterfaceC1453420nvQ interfaceC1453420nvQH22 = H2();
                if (interfaceC1453420nvQH22 != null) {
                    interfaceC1453420nvQH22.vR(true, "clickPopupFromEdit", "video_edit_page");
                    return;
                }
                return;
            }
            if (getEditModel().getAILivePhotoModel().LJIIJ() && Z1() != null) {
                InterfaceC1455680nz4 interfaceC1455680nz4Z1 = Z1();
                if (interfaceC1455680nz4Z1 != null) {
                    interfaceC1455680nz4Z1.H51(null);
                    return;
                }
                return;
            }
            if (C1428470nHB.LJJJZ(getEditModel()) && C0CHQ.LIZ().LJI().LJIIJJI()) {
                InterfaceC1453420nvQ interfaceC1453420nvQH23 = H2();
                if (interfaceC1453420nvQH23 != null) {
                    interfaceC1453420nvQH23.iZ0();
                    return;
                }
                return;
            }
            if (getEditModel().isRetakeVideo()) {
                return;
            }
            if (C1428470nHB.LJJJJZI(getEditModel()) && (getEditModel().creativeModel.changeAvatarModel.isSingletonRecover || !getEditModel().mIsFromDraft)) {
                InterfaceC1457660o2G interfaceC1457660o2GG2 = G2();
                if (interfaceC1457660o2GG2 != null) {
                    interfaceC1457660o2GG2.Lq1();
                    return;
                }
                return;
            }
            if ((C0CHW.LIZ() || C301590Brx.LIZ()) && (view = this.LLJI) != null && (interfaceC1453420nvQH2 = H2()) != null && interfaceC1453420nvQH2.g72(view)) {
                return;
            }
            C1456140nzo.LIZ(T2(), false, 3);
        }
    }

    @Override // X.InterfaceC1457610o2B
    public int n2() {
        return this.LLJ.getValue().LIZIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1456870o0z
    public InterfaceC346201Wa<C1666530tT9> getState() {
        return this.LLJ;
    }

    public InterfaceC1456870o0z o2() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1457610o2B
    public void Kj(int i) {
        int iW1 = W1(i, true);
        this.LLJILJILJ.LJII(Integer.valueOf(iW1));
        InterfaceC332260D0u<C1666530tT9> interfaceC332260D0u = this.LLJ;
        interfaceC332260D0u.LIZJ(C1666530tT9.LIZ(interfaceC332260D0u.getValue(), iW1, false, 61));
    }

    @Override // X.InterfaceC1457610o2B
    public void nf1(boolean z) {
        InterfaceC332260D0u<C1666530tT9> interfaceC332260D0u = this.LLJ;
        interfaceC332260D0u.LIZJ(C1666530tT9.LIZ(interfaceC332260D0u.getValue(), 0, z, 59));
    }

    @Override // X.InterfaceC1456870o0z
    public void qK2(View view) {
        this.LLJI = view;
    }

    public C1446690nkZ(C1DRG c1drg, C19A3 c19a3) {
        int iIntValue;
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        Integer value = T2().tg0().getValue();
        if (value != null) {
            iIntValue = value.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJ = C1BNE.LIZ(new C1666530tT9(W1(iIntValue, true), 61));
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 376));
        this.LLJILJILJ = new h0<>(null);
    }

    private final int W1(int i, boolean z) {
        if (C1462920oAk.LIZLLL() && !C0CHQ.LIZ().getAccountService().LIZ()) {
            c0 c0Var = c0.LIZ;
            c0Var.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            if (c1660590tJZ == null) {
                return 0;
            }
            int iLIZIZ = (c1660590tJZ.LJ(this.LLILLJJLI.requireActivity()).topMargin + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(24.5d)));
            if (z) {
                c0Var.getClass();
                if (c1660590tJZ.LJI()) {
                    iLIZIZ += ScreenUtils.getStatusBarHeight(this.LLILLJJLI.requireActivity());
                }
            }
            return Math.max(iLIZIZ, 0);
        }
        return i;
    }

    @Override // X.InterfaceC1457610o2B
    public void In0(LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1) {
        this.LLJILJILJ.LIZ(this, new AObjectS245S0100000_22(function1, 96));
    }
}
