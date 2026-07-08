package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oDY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464660oDY implements InterfaceC1660130tIp<C1678260tm4>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(521));
    public final C2252321DDq LLJ;
    public final AnonymousClass0951 LLJI;
    public final C054G LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1464660oDY.class, "editToolBarClickCallbacksApiComponent", "getEditToolBarClickCallbacksApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/business/EditToolBarClickCallbacksApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1464660oDY.class, "api", "getApi()Lcom/ss/android/ugc/aweme/social/creation/api/edit/StoryEditAiLiveApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1464660oDY.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1464660oDY.class, "aILivePhotoApi", "getAILivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1464660oDY.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1464660oDY.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public final Activity LIZLLL() {
        return (Activity) this.LLIZ.getValue(this, LLJILJIL[5]);
    }

    public final InterfaceC1464740oDg LJ() {
        return (InterfaceC1464740oDg) this.LLILLL.getValue(this, LLJILJIL[1]);
    }

    public final VideoPublishEditModel LJFF() {
        return (VideoPublishEditModel) this.LLILZLL.getValue(this, LLJILJIL[4]);
    }

    public final InterfaceC1455610nyx LJI() {
        return (InterfaceC1455610nyx) this.LLILZ.getValue(this, LLJILJIL[2]);
    }

    public final C1662030tLt LJII() {
        return (C1662030tLt) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        if (!C299100Bnw.LIZ()) {
            InterfaceC1455360nyY interfaceC1455360nyY = (InterfaceC1455360nyY) this.LLILLJJLI.getValue(this, LLJILJIL[0]);
            if (interfaceC1455360nyY != null) {
                interfaceC1455360nyY.AW1(new C565010MDz(0));
                return;
            }
            return;
        }
        if (C1428520nHG.LJJLIIIJLJLI(LJFF())) {
            C1389890mGx c1389890mGx = new C1389890mGx(LIZLLL());
            c1389890mGx.LJIIIZ(2131825312);
            c1389890mGx.LJIIJJI();
        } else {
            InterfaceC1455360nyY interfaceC1455360nyY2 = (InterfaceC1455360nyY) this.LLILLJJLI.getValue(this, LLJILJIL[0]);
            if (interfaceC1455360nyY2 != null) {
                interfaceC1455360nyY2.AW1(new C565010MDz(0));
            }
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<C1464810oDn> getState() {
        return this.LLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1464660oDY(X.C1DRG r15) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1464660oDY.<init>(X.1DRG):void");
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
        if (interfaceC1660090tIl instanceof C1460150o6H) {
            if (!C1428470nHB.LLILLIZIL(LJFF())) {
                C564410MBr c564410MBr = C564410MBr.LIZ;
                VideoPublishEditModel videoPublishEditModelLJFF = LJFF();
                c564410MBr.getClass();
                C564410MBr.LJIIIZ(videoPublishEditModelLJFF);
            }
            if (LJFF().getAILivePhotoModel().LJI()) {
                C564410MBr.LJIILJJIL(C564410MBr.LIZ, LJFF(), false, false, 4);
                String taskId = LJFF().getAILivePhotoModel().getTaskId();
                if (taskId != null) {
                    AlbumAiContentService.LIZ.getClass();
                    AlbumAiContentService albumAiContentServiceLIZ = C523440Kfu.LIZ();
                    if (albumAiContentServiceLIZ != null) {
                        albumAiContentServiceLIZ.LIZ(taskId, null);
                    }
                }
            }
        }
    }

    public final String LIZJ(long j) {
        if (Intrinsics.LJFF(LJFF().creativeModel.aiLivePhotoModel.pageDataCache.fallbackToOldModel, Boolean.TRUE) && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_ai_alive_people_disclaimer", true, false)) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_ai_alive_people_disclaimer_model_visible", true, false)) {
                if (C0A18.LIZ()) {
                    return C0MED.LIZ(C0MEB.EDITING_PAGE_TOOLTIP_PEOPLE_DISCLAIMER1, new Object[0]);
                }
                return LIZLLL().getString(2131825333);
            }
            if (C0A18.LIZ()) {
                return C0MED.LIZ(C0MEB.EDITING_PAGE_TOOLTIP_PEOPLE_DISCLAIMER2, new Object[0]);
            }
            return LIZLLL().getString(2131825334);
        }
        return C0T8Y.LIZ(2131755020, 2131755019, j, LIZLLL());
    }

    public final void LJIIIIZZ(C1464760oDi c1464760oDi) {
        Pair<Boolean, Boolean> value = LJI().x8().getValue();
        if (value != null && value.getFirst().booleanValue()) {
            LJI().j5();
            C23250099c.LIZLLL(this.LLJIJIL, null, null, new C1464670oDZ(this, c1464760oDi, null), 3);
        }
    }

    public final void LJIIIZ(C1662100tM0 c1662100tM0) {
        AbstractC1664850tQR<C1678260tm4, InterfaceC1461640o8g<? extends C1678260tm4>> abstractC1664850tQRLLJLLL;
        C1659580tHw c1659580tHw;
        View view;
        ViewGroup viewGroup;
        InterfaceC1464740oDg interfaceC1464740oDgLJ = LJ();
        AbstractC1664850tQR<C1678260tm4, InterfaceC1461640o8g<? extends C1678260tm4>> abstractC1664850tQRLLJLLL2 = null;
        if (interfaceC1464740oDgLJ != null) {
            abstractC1664850tQRLLJLLL = interfaceC1464740oDgLJ.LLJLLL();
        } else {
            abstractC1664850tQRLLJLLL = null;
        }
        if ((abstractC1664850tQRLLJLLL instanceof C1659580tHw) && (c1659580tHw = (C1659580tHw) abstractC1664850tQRLLJLLL) != null) {
            try {
                View view2 = c1659580tHw.LJIILIIL;
                if (view2 != null) {
                    SmartImageView smartImageView = c1659580tHw.LJIIZILJ;
                    if (smartImageView != null) {
                        FrameLayout frameLayout = c1659580tHw.LJIILL;
                        if (frameLayout != null) {
                            TuxIconView tuxIconView = c1659580tHw.LJIILJJIL;
                            if (tuxIconView != null) {
                                TuxTextView tuxTextView = c1659580tHw.LJIILLIIL;
                                if (tuxTextView != null) {
                                    C1654400t9a c1654400t9a = new C1654400t9a(view2, smartImageView, frameLayout, tuxIconView, tuxTextView, c1659580tHw.LJ);
                                    InterfaceC1464740oDg interfaceC1464740oDgLJ2 = LJ();
                                    if (interfaceC1464740oDgLJ2 != null) {
                                        abstractC1664850tQRLLJLLL2 = interfaceC1464740oDgLJ2.LLJLLL();
                                    }
                                    if ((abstractC1664850tQRLLJLLL2 instanceof C1659580tHw) && abstractC1664850tQRLLJLLL2 != null && (view = abstractC1664850tQRLLJLLL2.LIZJ) != null) {
                                        AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(370);
                                        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                            if (((Boolean) aFwS261S0000000_22.invoke(parent)).booleanValue()) {
                                                ViewParent parent2 = parent.getParent();
                                                if ((parent2 instanceof FrameLayout) && (viewGroup = (ViewGroup) parent2) != null) {
                                                    LJII().LJII(viewGroup, c1654400t9a, c1662100tM0);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    return;
                                }
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJIIJ(boolean z) {
        C2252321DDq c2252321DDq = this.LLJ;
        c2252321DDq.setValue(C1464810oDn.LIZ((C1464810oDn) c2252321DDq.getValue(), null, null, null, z, false, null, false, null, 991));
    }

    public static final void LJIIJJI(C1464660oDY c1464660oDY, C1464760oDi c1464760oDi, C1464810oDn c1464810oDn) {
        c1464660oDY.LLJ.setValue(C1464810oDn.LIZ(c1464810oDn, EnumC1462540oA8.PROGRESS, null, new C1659490tHn(c1464760oDi.LIZJ, Integer.valueOf(c1464760oDi.LIZIZ), Long.valueOf(c1464760oDi.LIZLLL), 8), false, false, null, false, null, 1005));
    }
}
