package X;

import Y.ARunnableS4S0401000_29;
import Y.ARunnableS62S0300000_29;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.compliance.api.model.Organization;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19585611jy extends AbstractC2255721DQs<InterfaceC1462280o9i> implements InterfaceC1462280o9i, InterfaceC379610EuV {
    public static final C1464860oDs LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1462280o9i LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C1439740nZM.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1465230oET.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public String LLJ = "";
    public final IFundraiserService LLJI = ComplianceServiceProvider.LJIILL();
    public TuxTextView LLJIJIL;
    public Runnable LLJILJIL;
    public Runnable LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19585611jy.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19585611jy.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0), new C2217381BqS(C19585611jy.class, "editStickerPanelApi", "getEditStickerPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/panel/EditStickerPanelApi;", 0), new C2217381BqS(C19585611jy.class, "editorInfiniStickerApi", "getEditorInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0), new C2217381BqS(C19585611jy.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLJILLL = new C1464860oDs();
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJ[4]);
    }

    private final InterfaceC1455860nzM W2() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue(this, LLJJ[0]);
    }

    private final InterfaceC1465230oET c3() {
        return (InterfaceC1465230oET) this.LLILZLL.getValue(this, LLJJ[2]);
    }

    private final C1439740nZM i3() {
        return (C1439740nZM) this.LLILZIL.getValue(this, LLJJ[1]);
    }

    public final C19GS Q3() {
        Context sceneContext;
        C19GS c19gs;
        C198H c198hLC;
        Scene scene;
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this.LL);
        if (interfaceC20597015iiLJ == null || (c198hLC = interfaceC20597015iiLJ.LC()) == null || (scene = c198hLC.getScene()) == null || (sceneContext = scene.getSceneContext()) == null) {
            sceneContext = this.LL.getSceneContext();
        }
        C19EG c19egLIZIZ = sceneContext != null ? C1388190mED.LIZIZ(sceneContext) : null;
        if ((c19egLIZIZ instanceof C19GS) && (c19gs = (C19GS) c19egLIZIZ) != null) {
            return c19gs;
        }
        Context contextLIZIZ = C545820Lau.LIZIZ(this.LL);
        if (contextLIZIZ instanceof C19GS) {
            return (C19GS) contextLIZIZ;
        }
        return null;
    }

    public final void W1() {
        Organization organizationLIZJ;
        DonationStickerModel donationStickerModel;
        List<StickerModel> listLLLILZLLLI;
        if (this.LLJI.LJII() && this.LLJI.LIZ() && (organizationLIZJ = this.LLJI.LIZJ()) != null) {
            C1464860oDs c1464860oDs = LLJILLL;
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            c1464860oDs.getClass();
            C1464860oDs.LIZ(videoPublishEditModelLJJJLIIL);
            InterfaceC391240FVq interfaceC391240FVqQj = qj();
            StickerModel stickerModel = null;
            if (interfaceC391240FVqQj != null && (listLLLILZLLLI = interfaceC391240FVqQj.LLLILZLLLI(EnumC1466150oFx.DONATION)) != null) {
                stickerModel = (StickerModel) C13LP.LJJJLL(listLLLILZLLLI);
            }
            if ((stickerModel instanceof DonationStickerModel) && (donationStickerModel = (DonationStickerModel) stickerModel) != null) {
                InterfaceC391240FVq interfaceC391240FVqQj2 = qj();
                if (interfaceC391240FVqQj2 != null) {
                    interfaceC391240FVqQj2.k3(B3(C1216290hkx.LIZ(organizationLIZJ), donationStickerModel), EnumC356070Dxd.COMMIT);
                    return;
                }
                return;
            }
            InterfaceC391240FVq interfaceC391240FVqQj3 = qj();
            if (interfaceC391240FVqQj3 != null) {
                DonationStickerModel donationStickerModelK4 = K4(C1216290hkx.LIZ(organizationLIZJ));
                donationStickerModelK4.getBaseStickerModel().setStickerSource("2");
                interfaceC391240FVqQj3.f3(donationStickerModelK4, EnumC356070Dxd.COMMIT);
            }
            z4();
        }
    }

    public final void Z1() {
        InterfaceC391240FVq interfaceC391240FVqQj;
        View viewAS;
        Runnable runnable = this.LLJILJILJ;
        if (runnable != null && (interfaceC391240FVqQj = qj()) != null && (viewAS = interfaceC391240FVqQj.aS()) != null) {
            HandlerHook.viewRemoveCallbacks(viewAS, runnable);
        }
        this.LLJILJILJ = null;
    }

    public final void o2() {
        ViewGroup viewGroup;
        TuxTextView tuxTextView;
        Runnable runnable = this.LLJILJIL;
        if (runnable != null && (tuxTextView = this.LLJIJIL) != null) {
            HandlerHook.viewRemoveCallbacks(tuxTextView, runnable);
        }
        this.LLJILJIL = null;
        TuxTextView tuxTextView2 = this.LLJIJIL;
        this.LLJIJIL = null;
        ViewParent parent = tuxTextView2 != null ? tuxTextView2.getParent() : null;
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(tuxTextView2, viewGroup);
    }

    public final InterfaceC391240FVq qj() {
        return (InterfaceC391240FVq) this.LLIZ.getValue(this, LLJJ[3]);
    }

    private final void H3() {
        W2().FJ(true);
        InterfaceC1452170ntP value = W2().g().getValue();
        if (value != null) {
            value.pause();
        }
    }

    private final void z4() {
        InterfaceC391240FVq interfaceC391240FVqQj;
        if (C0FWJ.LIZIZ() && (interfaceC391240FVqQj = qj()) != null) {
            View viewAS = interfaceC391240FVqQj.aS();
            Z1();
            ARunnableS62S0300000_29 aRunnableS62S0300000_29 = new ARunnableS62S0300000_29(viewAS, this, new C118300cf(), 3);
            this.LLJILJILJ = aRunnableS62S0300000_29;
            HandlerHook.viewPostDelay(viewAS, aRunnableS62S0300000_29, 500L);
        }
    }

    public final String H2() {
        DonationStickerModel donationStickerModel;
        Integer numLJIIJJI;
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj == null) {
            return null;
        }
        String str = this.LLJ;
        StickerModel stickerModelLLJJIJI = interfaceC391240FVqQj.LLJJIJI((str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) ? -1 : numLJIIJJI.intValue());
        if (stickerModelLLJJIJI == null || !(stickerModelLLJJIJI instanceof DonationStickerModel) || (donationStickerModel = (DonationStickerModel) stickerModelLLJJIJI) == null) {
            return null;
        }
        return donationStickerModel.getFundraiserId();
    }

    public final void O3() {
        i3().LIZJ(this.LLJ);
        C1464860oDs c1464860oDs = LLJILLL;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        c1464860oDs.getClass();
        C1464860oDs.LIZ(videoPublishEditModelLJJJLIIL);
    }

    public final String T2() {
        DonationStickerModel donationStickerModel;
        Integer numLJIIJJI;
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj == null) {
            return null;
        }
        String str = this.LLJ;
        StickerModel stickerModelLLJJIJI = interfaceC391240FVqQj.LLJJIJI((str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) ? -1 : numLJIIJJI.intValue());
        if (stickerModelLLJJIJI == null || !(stickerModelLLJJIJI instanceof DonationStickerModel) || (donationStickerModel = (DonationStickerModel) stickerModelLLJJIJI) == null) {
            return null;
        }
        return donationStickerModel.getOrgId();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1462280o9i
    public void dE1() {
        if (ComplianceServiceProvider.LJIILL().LJIILL()) {
            H3();
            O4(new AwS607S0100000_28(this, 161));
        } else {
            C11B1 c11b1 = new C11B1(LJJJLIIL().mShootWay, LJJJLIIL().getCreationId(), C1428470nHB.LJIILIIL(LJJJLIIL()), C1428470nHB.LJIILL(LJJJLIIL()));
            C19A3 c19a3 = this.LL;
            C19458411Aw c19458411Aw = (C19458411Aw) c19a3.findSceneByTag("EditSelectDonationOrganizationScene");
            if (c19458411Aw == null) {
                c19458411Aw = new C19458411Aw();
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "mob_params", c11b1);
            bundle.putBoolean("from_fragment", false);
            c19458411Aw.mArguments = bundle;
            if (!c19a3.isAdded(c19458411Aw)) {
                c19a3.add(c19a3.mView.getId(), c19458411Aw, "EditSelectDonationOrganizationScene", R.anim.fq);
            }
            c19458411Aw.LLJJIJIL = new C11B2() { // from class: X.11BG
                @Override // X.C11B2
                public final void onDismiss() {
                    this.LIZ.e4();
                }

                @Override // X.C11B2
                public final void LIZ(C11BE c11be) {
                    String str;
                    String string;
                    String string2;
                    List<String> urlList;
                    C19585611jy c19585611jy = this.LIZ;
                    String name = c11be.getName();
                    String str2 = "";
                    if (name == null) {
                        name = "";
                    }
                    UrlModel icon = c11be.getIcon();
                    if (icon == null || (urlList = icon.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                        str = "";
                    }
                    String donateLink = c11be.getDonateLink();
                    if (donateLink == null) {
                        donateLink = "";
                    }
                    String addTime = c11be.getAddTime();
                    if (addTime == null) {
                        addTime = "";
                    }
                    String orgId = c11be.getOrgId();
                    if (orgId == null) {
                        orgId = "";
                    }
                    String orgType = c11be.getOrgType();
                    if (orgType == null) {
                        orgType = "";
                    }
                    String fundraiserId = c11be.getFundraiserId();
                    if (fundraiserId == null) {
                        fundraiserId = "";
                    }
                    String fundraiserGoalDesc = c11be.getFundraiserGoalDesc();
                    if (fundraiserGoalDesc == null || (string = a0.LJLIIIL(fundraiserGoalDesc).toString()) == null) {
                        string = "";
                    }
                    String fundraiserOwnerId = c11be.getFundraiserOwnerId();
                    if (fundraiserOwnerId != null && (string2 = a0.LJLIIIL(fundraiserOwnerId).toString()) != null) {
                        str2 = string2;
                    }
                    c19585611jy.E3(new DonationStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.DONATION, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), true, false, name, str, donateLink, addTime, orgId, orgType, fundraiserId, str2, string, 0, -1.0f, false, false));
                }
            };
        }
        H3();
    }

    public final void e4() {
        W2().FJ(false);
        InterfaceC1452170ntP value = W2().g().getValue();
        if (value != null) {
            value.play();
        }
    }

    public final boolean m3() {
        return Intrinsics.LJFF(LJJJLIIL().mShootWay, "story");
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS608S0100000_29(this, 370));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        Z1();
        o2();
        super.onDestroy();
    }

    public InterfaceC1462280o9i G2() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    private final DonationStickerModel K4(DonationStickerModel donationStickerModel) {
        if (!C0FWJ.LIZIZ()) {
            return donationStickerModel;
        }
        return donationStickerModel.copy(donationStickerModel.baseStickerModel, donationStickerModel.visible, donationStickerModel.clickable, donationStickerModel.name, donationStickerModel.iconUri, donationStickerModel.donateLink, donationStickerModel.addTime, donationStickerModel.orgId, donationStickerModel.orgType, donationStickerModel.fundraiserId, donationStickerModel.fundraiserOwnerId, donationStickerModel.fundraiserGoalDesc, 1, donationStickerModel.initialTransformScale, donationStickerModel.legacyDonationNoDisplayStyleAttr, donationStickerModel.isDynamicRender);
    }

    private final void O4(Function1<? super C19GS, Unit> function1) {
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this.LL);
        if (interfaceC20597015iiLJ != null) {
            interfaceC20597015iiLJ.Ss("getIntent", new AwS430S0200000_29(this, (C19585611jy) function1, (Function1<? super C19GS, Unit>) 51));
            return;
        }
        C19GS c19gsQ3 = Q3();
        if (c19gsQ3 == null) {
            return;
        }
        function1.invoke(c19gsQ3);
    }

    private final C19578211im w2(View view) {
        if (view instanceof C19578211im) {
            return (C19578211im) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C19578211im c19578211imW2 = w2(viewGroup.getChildAt(i));
                if (c19578211imW2 != null) {
                    return c19578211imW2;
                }
            }
            return null;
        }
        return null;
    }

    public final void E3(DonationStickerModel donationStickerModel) {
        DonationStickerModel donationStickerModel2;
        List<StickerModel> listLLLILZLLLI;
        InterfaceC1465230oET interfaceC1465230oETC3 = c3();
        if (interfaceC1465230oETC3 != null) {
            C1462460oA0.LIZ(interfaceC1465230oETC3, false, 0L, 6);
        }
        C1464860oDs c1464860oDs = LLJILLL;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        c1464860oDs.getClass();
        C1464860oDs.LIZ(videoPublishEditModelLJJJLIIL);
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        StickerModel stickerModel = null;
        if (interfaceC391240FVqQj != null && (listLLLILZLLLI = interfaceC391240FVqQj.LLLILZLLLI(EnumC1466150oFx.DONATION)) != null) {
            stickerModel = (StickerModel) C13LP.LJJJLL(listLLLILZLLLI);
        }
        if ((stickerModel instanceof DonationStickerModel) && (donationStickerModel2 = (DonationStickerModel) stickerModel) != null) {
            InterfaceC391240FVq interfaceC391240FVqQj2 = qj();
            if (interfaceC391240FVqQj2 != null) {
                interfaceC391240FVqQj2.k3(B3(donationStickerModel, donationStickerModel2), EnumC356070Dxd.COMMIT);
                return;
            }
            return;
        }
        InterfaceC391240FVq interfaceC391240FVqQj3 = qj();
        if (interfaceC391240FVqQj3 != null) {
            DonationStickerModel donationStickerModelK4 = K4(donationStickerModel);
            donationStickerModelK4.getBaseStickerModel().setStickerSource("2");
            interfaceC391240FVqQj3.f3(donationStickerModelK4, EnumC356070Dxd.COMMIT);
        }
        z4();
    }

    public final boolean F4(View view) {
        Context contextLIZIZ;
        C19578211im c19578211imW2;
        FrameLayout frameLayout;
        if (!C0FWJ.LIZIZ() || (contextLIZIZ = C545820Lau.LIZIZ(this.LL)) == null || C545820Lau.LJ(this.LL) || (c19578211imW2 = w2(view)) == null || !c19578211imW2.isAttachedToWindow() || c19578211imW2.getWidth() <= 0 || c19578211imW2.getHeight() <= 0 || !(view instanceof FrameLayout) || (frameLayout = (FrameLayout) view) == null) {
            return false;
        }
        o2();
        TuxTextView tuxTextView = new TuxTextView(contextLIZIZ, null, 6, 0);
        tuxTextView.setTuxFont(61);
        tuxTextView.setText(contextLIZIZ.getString(2131829859));
        tuxTextView.setBackground(null);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, contextLIZIZ);
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        tuxTextView.setShadowLayer(6.0f, 0.0f, 1.0f, Color.argb(200, 0, 0, 0));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        frameLayout.addView(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
        this.LLJIJIL = tuxTextView;
        HandlerHook.viewPost(tuxTextView, new ARunnableS4S0401000_29(this, tuxTextView, c19578211imW2, iLIZIZ, frameLayout, 1));
        return true;
    }

    @Override // X.InterfaceC1462280o9i
    public void ZC1(String str) {
        this.LLJ = str;
    }

    public C19585611jy(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    private final DonationStickerModel B3(DonationStickerModel donationStickerModel, DonationStickerModel donationStickerModel2) {
        BaseStickerModel baseStickerModel = donationStickerModel2.getBaseStickerModel();
        baseStickerModel.setStickerSource("2");
        return donationStickerModel.copy(baseStickerModel, donationStickerModel2.getVisible(), donationStickerModel2.getClickable(), donationStickerModel.name, donationStickerModel.iconUri, donationStickerModel.donateLink, donationStickerModel.addTime, donationStickerModel.orgId, donationStickerModel.orgType, donationStickerModel.fundraiserId, donationStickerModel.fundraiserOwnerId, donationStickerModel.fundraiserGoalDesc, donationStickerModel2.getDisplayStyle(), donationStickerModel2.getInitialTransformScale(), donationStickerModel2.getLegacyDonationNoDisplayStyleAttr(), donationStickerModel2.isDynamicRender());
    }

    private final RectF X1(View view, View view2) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr);
        view2.getLocationInWindow(iArr2);
        float f = iArr[0] - iArr2[0];
        float f2 = iArr[1] - iArr2[1];
        return new RectF(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    private final PointF v3(RectF rectF, float f) {
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        float[] fArr = {f2, f3, f4, f3, f2, f5, f4, f5};
        Matrix matrix = new Matrix();
        matrix.postRotate(f, rectF.centerX(), rectF.centerY());
        matrix.mapPoints(fArr);
        PointF pointF = new PointF((fArr[0] + fArr[2]) / 2.0f, (fArr[1] + fArr[3]) / 2.0f);
        PointF pointF2 = new PointF((fArr[4] + fArr[6]) / 2.0f, (fArr[5] + fArr[7]) / 2.0f);
        if (pointF2.y >= pointF.y) {
            return pointF2;
        }
        return pointF;
    }

    public final void o4(View view, Runnable runnable, int i) {
        if (i >= 20) {
            Z1();
        } else {
            HandlerHook.viewPostDelay(view, runnable, 200L);
        }
    }

    public static final void H4(C19585611jy c19585611jy, TuxTextView tuxTextView, C19578211im c19578211im, FrameLayout frameLayout, int i) {
        q3(c19585611jy, tuxTextView, c19578211im, frameLayout, i);
    }

    public static final void q3(C19585611jy c19585611jy, TuxTextView tuxTextView, View view, FrameLayout frameLayout, int i) {
        if (tuxTextView.isAttachedToWindow() && view.isAttachedToWindow()) {
            int i2 = 0;
            tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            PointF pointFV3 = c19585611jy.v3(c19585611jy.X1(view, frameLayout), view.getRotation());
            C786410Ut5.Gb(tuxTextView, view.getRotation());
            tuxTextView.setPivotX(tuxTextView.getMeasuredWidth() / 2.0f);
            tuxTextView.setPivotY(0.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tuxTextView.getLayoutParams();
            int measuredWidth = (int) (pointFV3.x - (tuxTextView.getMeasuredWidth() / 2.0f));
            int width = frameLayout.getWidth() - tuxTextView.getMeasuredWidth();
            if (width < 0) {
                width = 0;
            }
            layoutParams.leftMargin = C13LZ.LJ(measuredWidth, 0, width);
            int i3 = (int) (pointFV3.y + i);
            if (i3 >= 0) {
                i2 = i3;
            }
            layoutParams.topMargin = i2;
            C786410Ut5.R6(tuxTextView, layoutParams);
        }
    }
}
