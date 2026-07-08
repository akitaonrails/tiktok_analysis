package X;

import Y.ACListenerS156S0100000_22;
import Y.AObjectS245S0100000_22;
import Y.AObjectS305S0200000_22;
import Y.ARunnableS122S0100000_22;
import Y.ATListenerS451S0100000_18;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.als.h0;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.GroupShotDataModel;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS139S0110000_22;
import kotlin.jvm.internal.AwS171S1100000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nv7.c0;

/* JADX INFO: renamed from: X.0o6P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460230o6P extends Scene implements InterfaceC379610EuV, InterfaceC1436400nTy {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILL;
    public final C1460300o6W LLJI;
    public final C1DRG LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public TuxIconView LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public View LLJJJ;
    public TuxSpinner LLJJJIL;
    public TuxTextView LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public C417270GXt LLJLIL;
    public boolean LLJLILLLLZIIL;
    public C427870Gq9 LLJLL;
    public C0GTR LLJLLIL;
    public View LLJLLL;
    public TuxIconView LLJZ;
    public LinearLayout LLJZIJLIL;
    public FrameLayout LLL;
    public FrameLayout LLLF;
    public TuxIconView LLLFF;
    public C371310Eh7 LLLFFI;
    public TuxTextView LLLFZ;
    public final C1664740tQG LLLII;
    public final C1664740tQG LLLIIII;
    public final C1664740tQG LLLIIIIL;
    public final C1664740tQG LLLIIIL;
    public final C1664740tQG LLLIIL;
    public final C1664740tQG LLLIILIL;
    public final C1664740tQG LLLIL;
    public final C1664740tQG LLLILZ;
    public final C1664750tQH LLLIZZ;
    public final C1664740tQG LLLJ;
    public final Keva LLLJIL;
    public final C1664740tQG LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final h0<EnumC1460330o6Z> LLLLIIL;
    public final C01GW LLLI = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public boolean LLLILZJ = true;
    public boolean LLLILZLLLI = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1460230o6P.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1460230o6P.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1460230o6P.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1460230o6P.class, "editSaveLocalApi", "getEditSaveLocalApi()Lcom/ss/android/ugc/gamora/editor/savelocal/EditSaveLocalApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1460230o6P.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1460230o6P.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1460230o6P.class, "aiLiveGuideApi", "getAiLiveGuideApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveGuideApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1460230o6P.class, "storyEditSpeedTestApi", "getStoryEditSpeedTestApi()Lcom/ss/android/ugc/aweme/story/edit/StoryEditSpeedTestApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1460230o6P.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1460230o6P.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1460230o6P.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1460230o6P.class, "sendToDMApi", "getSendToDMApi()Lcom/ss/android/ugc/aweme/social/sendtodm/SendToDMApiComponent;", 0);
        c09r3.getClass();
        LLLLIILL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12};
    }

    public final InterfaceC1455680nz4 LLLJL() {
        return (InterfaceC1455680nz4) this.LLLIILIL.getValue(this, LLLLIILL[5]);
    }

    public final InterfaceC1451520nsM LLLLII() {
        return (InterfaceC1451520nsM) this.LLLII.getValue(this, LLLLIILL[0]);
    }

    public final InterfaceC1455860nzM LLLLIIIILLL() {
        return (InterfaceC1455860nzM) this.LLLI.getValue();
    }

    public final String LLLLIILL() {
        C01GW c01gw = C287080BNa.LIZIZ;
        return (((Boolean) c01gw.getValue()).booleanValue() && u4.LJIIZILJ(getEditModel()) && getEditModel().isPrivate == 2) ? this.mView.getContext().getString(2131826731) : (((Boolean) c01gw.getValue()).booleanValue() && u4.LJIIZILJ(getEditModel()) && getEditModel().isPrivate == 0) ? (u4.LJIIZILJ(getEditModel()) || !u4.LJLILLLLZI(getEditModel())) ? this.mView.getContext().getString(2131826732) : getString(2131849155) : (getEditModel().creativeModel.changeAvatarModel.isFromChangeAvatar && getEditModel().creativeModel.changeAvatarModel.isFromSocialAvatar) ? getString(2131848577) : (!getEditModel().creativeModel.changeAvatarModel.isFromChangeAvatar || (getEditModel().mIsFromDraft && !getEditModel().creativeModel.changeAvatarModel.isSingletonRecover)) ? LLLLLLJ() ? getString(2131845588) : (u4.LJIIZILJ(getEditModel()) || !u4.LJLILLLLZI(getEditModel())) ? C297750Bll.LIZ() ? getString(2131849138) : getString(2131849137) : getString(2131849155) : getString(2131845017);
    }

    public final boolean LLLLJ() {
        if (!((Boolean) C0BN2.LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (C297670Bld.LIZ() && C1428470nHB.LJZ(getEditModel())) {
            return false;
        }
        return C1428470nHB.LJJZZI(getEditModel());
    }

    public final void LLLLLJIL() {
        C427870Gq9 c427870Gq9 = this.LLJLL;
        if (c427870Gq9 == null) {
            c427870Gq9 = null;
        }
        ViewGroup.LayoutParams layoutParams = c427870Gq9.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        C786410Ut5.W5(c427870Gq9, layoutParams2);
        C0GTR c0gtr = this.LLJLLIL;
        if (c0gtr == null) {
            c0gtr = null;
        }
        ViewGroup.LayoutParams layoutParams3 = c0gtr.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33));
        layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33));
        C786410Ut5.W5(c0gtr, layoutParams4);
        C0GTR c0gtr2 = this.LLJLLIL;
        (c0gtr2 != null ? c0gtr2 : null).requestLayout();
    }

    public final void LLLLLLL() {
        final boolean z = true;
        if (LLLLIL() && this.LLJJIJI != null) {
            View view = this.LLJILJILJ;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(8, view);
            View view2 = this.LLJILJIL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(8, view2);
            View view3 = this.LLJJIJI;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            if (!getEditModel().isPhotoSwap()) {
                LinearLayout linearLayout = this.LLJZIJLIL;
                (linearLayout != null ? linearLayout : null).setGravity(17);
                return;
            }
            LinearLayout linearLayout2 = this.LLJZIJLIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C426750GoL.LJIIL(linearLayout2, 0, 0, 0, 0, 16);
            final int iLJIIIIZZ = C14KQ.LJIIIIZZ(this.mView.getContext());
            int iLIZ = C1338790kwX.LIZ(56.0f);
            int iLIZ2 = C1338790kwX.LIZ(80.0f);
            int iLIZ3 = C1338790kwX.LIZ(56.0f);
            final int iLIZ4 = C1338790kwX.LIZ(49.0f);
            final int i = iLIZ + iLIZ2 + iLIZ3;
            final int i2 = i + (iLIZ4 * 2);
            if (i2 <= iLJIIIIZZ) {
                z = false;
                LinearLayout linearLayout3 = this.LLJZIJLIL;
                (linearLayout3 != null ? linearLayout3 : null).setGravity(17);
            }
            View view4 = this.LLJJIJIIJIL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
            }
            TuxIconView tuxIconView = this.LLJJIJIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            View view5 = this.LLJJIJIIJIL;
            if (view5 != null) {
                view5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0o6c
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view6, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        if (!z) {
                            int i11 = (iLJIIIIZZ - i2) / 2;
                            C1460230o6P.LLLIIIIL(i11, iLIZ4, this.LLJJIJIIJIL);
                            C1460230o6P.LLLIIIIL(iLIZ4, i11, this.LLJJIJIL);
                            C1460230o6P.LLLIIIIL(iLIZ4, i11, this.LLJJJ);
                            return;
                        }
                        int iMin = Math.min((iLJIIIIZZ - i) / 2, iLIZ4);
                        C1460230o6P.LLLIIIIL(Math.max(0, iLJIIIIZZ - i2) / 2, iMin, this.LLJJIJIIJIL);
                        C1460230o6P.LLLIIIIL(iMin, 0, this.LLJJIJIL);
                        C1460230o6P.LLLIIIIL(iMin, 0, this.LLJJJ);
                    }
                });
                return;
            }
            return;
        }
        LinearLayout linearLayout4 = this.LLJZIJLIL;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        linearLayout4.setGravity(48);
        View view6 = this.LLJJIJI;
        if (view6 != null) {
            C786410Ut5.LJLLLLLL(8, view6);
        }
        if (C1462920oAk.LIZLLL() && !(LLLLIIIILLL() instanceof InterfaceC572860MdQ)) {
            LinearLayout linearLayout5 = this.LLJZIJLIL;
            if (linearLayout5 == null) {
                linearLayout5 = null;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(linearLayout5.getLayoutParams());
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            layoutParams.bottomMargin = c1660590tJZ != null ? c1660590tJZ.LIZIZ() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            LinearLayout linearLayout6 = this.LLJZIJLIL;
            if (linearLayout6 == null) {
                linearLayout6 = null;
            }
            C786410Ut5.d6(linearLayout6, layoutParams);
        }
        if (getEditModel().isEnterFromDM() && !C1434160nQM.LIZ(getEditModel().creativeModel)) {
            View view7 = this.LLJILJIL;
            if (view7 == null) {
                view7 = null;
            }
            C786410Ut5.LJLLLLLL(8, view7);
            TuxIconView tuxIconView2 = (TuxIconView) requireViewById(R.id.g1o);
            this.LLJJLIIIJLLLLLLLZ = tuxIconView2;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            TuxTextView tuxTextView = this.LLJJJJ;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setText(2131848218);
        }
        if (C1434160nQM.LIZ(getEditModel().creativeModel)) {
            View view8 = this.LLJILJIL;
            if (view8 == null) {
                view8 = null;
            }
            C786410Ut5.LJLLLLLL(8, view8);
            GroupShotDataModel groupShotDataModel = getEditModel().creativeModel.initialModel.dmCameraModel.groupShotData;
            int i3 = (groupShotDataModel == null || groupShotDataModel.groupShotTaskId == null) ? 2131830914 : 2131830893;
            TuxTextView tuxTextView2 = this.LLJJJJ;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setText(i3);
        }
        if (getEditModel().creativeModel.initialModel.dmCameraModel.isBulletin) {
            View view9 = this.LLJILJIL;
            if (view9 == null) {
                view9 = null;
            }
            C786410Ut5.LJLLLLLL(8, view9);
            TuxIconView tuxIconView3 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            TuxTextView tuxTextView3 = this.LLJJJJ;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setText(2131828071);
        }
        if (C568750MSj.LIZIZ(getEditModel())) {
            View view10 = this.LLJILJIL;
            if (view10 == null) {
                view10 = null;
            }
            C436180H8m.LIZIZ(view10);
            TuxTextView tuxTextView4 = this.LLJJJJ;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setText(2131833454);
        }
        if (((C571290Mat.LIZJ(getEditModel()) || C571290Mat.LIZLLL(getEditModel())) && C571300Mau.LIZIZ()) || getEditModel().isDirectToPublishByNewExp()) {
            TuxTextView tuxTextView5 = this.LLJJJJ;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            tuxTextView5.setText(R.string.m6n);
        } else if (C571290Mat.LIZJ(getEditModel())) {
            TuxTextView tuxTextView6 = this.LLJJJJ;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            tuxTextView6.setText(2131824466);
        }
        if (C1428470nHB.LJJZ(getEditModel())) {
            View view11 = this.LLJILJIL;
            if (view11 == null) {
                view11 = null;
            }
            C337180DJs.LIZ(view11);
            TuxIconView tuxIconView4 = (TuxIconView) requireViewById(R.id.g1o);
            this.LLJJLIIIJLLLLLLLZ = tuxIconView4;
            C337180DJs.LIZJ(tuxIconView4 != null ? tuxIconView4 : null);
            IMContactApi.LIZ.getClass();
            C069P.LIZ().LJ().LIZJ(new InterfaceC1480505qt() { // from class: X.0o6V
                @Override // X.InterfaceC1480505qt
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZ(Throwable th) {
                    C1460230o6P c1460230o6P = this.LIZ;
                    TuxTextView tuxTextView7 = c1460230o6P.LLJJJJ;
                    if (tuxTextView7 == null) {
                        tuxTextView7 = null;
                    }
                    tuxTextView7.setText(c1460230o6P.mView.getContext().getString(2131837004, this.LIZ.mView.getContext().getString(2131831188)));
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZIZ(IMUser iMUser) {
                    C1460230o6P c1460230o6P = this.LIZ;
                    TuxTextView tuxTextView7 = c1460230o6P.LLJJJJ;
                    if (tuxTextView7 == null) {
                        tuxTextView7 = null;
                    }
                    tuxTextView7.setText(c1460230o6P.mView.getContext().getString(2131837004, iMUser.getNickName()));
                }
            }, getEditModel().creativeModel.initialModel.highLightVideoParametersModel.toUserId, null, "im_share", false);
        }
    }

    public final void LLLLLLLLL() {
        View view = this.LLJILJIL;
        if (view == null) {
            view = null;
        }
        boolean zLIZ = C375780EoK.LIZ(view);
        View view2 = this.LLJILJILJ;
        if (view2 == null) {
            view2 = null;
        }
        boolean zLIZ2 = C375780EoK.LIZ(view2);
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            InterfaceC532760Kuw interfaceC532760Kuw = (InterfaceC532760Kuw) this.LLJIJIL.LJIIL(null, InterfaceC532760Kuw.class);
            if (interfaceC532760Kuw != null) {
                interfaceC532760Kuw.Fn0(zLIZ, zLIZ2);
                return;
            }
            return;
        }
        InterfaceC1417050myl interfaceC1417050myl = (InterfaceC1417050myl) this.LLJIJIL.LJIIL(null, InterfaceC1417050myl.class);
        if (interfaceC1417050myl != null) {
            interfaceC1417050myl.rA1(zLIZ, zLIZ2);
        }
    }

    public final InterfaceC1453760nvy br() {
        return (InterfaceC1453760nvy) this.LLLJ.getValue(this, LLLLIILL[10]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLLIZZ.getValue(this, LLLLIILL[8]);
    }

    public final void LLLILZ() {
        AbstractC1453750nvx abstractC1453750nvx;
        InterfaceC1454960nxu interfaceC1454960nxuLLLLLIL;
        if (C1428470nHB.LJLJI(getEditModel()) || C1402890mbv.LIZ(getEditModel()) || (abstractC1453750nvx = (AbstractC1453750nvx) this.LLLIIIIL.getValue(this, LLLLIILL[2])) == null || (interfaceC1454960nxuLLLLLIL = abstractC1453750nvx.LLLLLIL()) == null) {
            return;
        }
        interfaceC1454960nxuLLLLLIL.ar();
    }

    public final boolean LLLLIL() {
        if (getEditModel().isPhotoSwap()) {
            return true;
        }
        return getEditModel().isEnterFromDM() && ((Boolean) C276620Asm.LIZ.getValue()).booleanValue();
    }

    public final void LLLLLIL() {
        InterfaceC1451520nsM interfaceC1451520nsMLLLLII;
        if (LLLLJ() && (interfaceC1451520nsMLLLLII = LLLLII()) != null) {
            interfaceC1451520nsMLLLLII.m7("enter Story publish!");
        }
        C1385120m9G.LIZ();
        C1465810oFP c1465810oFP = C1465810oFP.LIZ;
        String creationId = getEditModel().getCreationId();
        c1465810oFP.getClass();
        C1465810oFP.LIZ(creationId);
        InterfaceC1439570nZ5 interfaceC1439570nZ5 = (InterfaceC1439570nZ5) this.LLLILZ.getValue(this, LLLLIILL[7]);
        if (interfaceC1439570nZ5 != null) {
            interfaceC1439570nZ5.fY0("lightening_publish");
        }
        getEditModel().creativeModel.collabInfoModel.setCollabUserList(null);
        C0CHQ.LIZ().LJI().LIZJ().LJFF(getEditModel(), "postStory");
        Function0<Unit> function0 = this.LLJI.LJ;
        (function0 != null ? function0 : null).invoke();
    }

    public final boolean LLLLLLIL() {
        if (LLLLIIIILLL() instanceof InterfaceC572860MdQ) {
            return false;
        }
        return C1428520nHG.LJJLIIIJJI(getEditModel());
    }

    public final boolean LLLLLLJ() {
        return u4.LJIIJ(getEditModel()) || C1428520nHG.LJJLL(getEditModel());
    }

    public final void LLLLLLLLLL() {
        if (LLLLLLJ()) {
            TCMPostPageSubmitTextModel submitText = getEditModel().creativeModel.commerceModel.getTcmModel().getSubmitText();
            if (!getEditModel().creativeModel.commerceModel.getTcmModel().isTcmOrder() || submitText == null || submitText.getSubmitButtonText() == null) {
                TuxIconView tuxIconView = this.LLJZ;
                if (tuxIconView == null) {
                    tuxIconView = null;
                }
                tuxIconView.setIconRes(R.raw.icon_post);
                tuxIconView.setTintColorRes(R.attr.ej);
                TuxTextView tuxTextView = this.LLJJL;
                (tuxTextView != null ? tuxTextView : null).setText(LLLLIILL());
                return;
            }
            TuxIconView tuxIconView2 = this.LLJZ;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            tuxIconView2.setIconRes(R.raw.icon_tick_fill);
            tuxIconView2.setTintColorRes(R.attr.ej);
            TuxTextView tuxTextView2 = this.LLJJL;
            (tuxTextView2 != null ? tuxTextView2 : null).setText(submitText.getSubmitButtonText());
        }
    }

    public final void LLLLLLLZIL() {
        boolean zLJLILLLLZI = u4.LJLILLLLZI(getEditModel());
        C417270GXt c417270GXt = this.LLJLIL;
        if (c417270GXt != null) {
            int i = zLJLILLLLZI ? 0 : 8;
            int visibility = c417270GXt.getVisibility();
            c417270GXt.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c417270GXt);
        }
        if (!zLJLILLLLZI || this.LLJLILLLLZIIL) {
            return;
        }
        this.LLJLILLLLZIIL = true;
        TuxTextView tuxTextView = this.LLJJL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(LLLLIILL());
        u4.LJJJLL(getEditModel());
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C0CHQ.LIZ().getPublishService().LJJIFFI(this);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        LLLLLLLLLL();
        C12WG.LIZJ(this, new ARunnableS122S0100000_22(this, 60));
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJIJIL;
    }

    public static final void LLLIZZ(View view) {
        GradientDrawable gradientDrawable;
        Drawable background = null;
        if (view != null) {
            background = view.getBackground();
        }
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void LJIIJ(String str) {
        TuxTextView tuxTextView = this.LLLFZ;
        if (tuxTextView != null) {
            tuxTextView.setText("0%");
        }
        C371310Eh7 c371310Eh7 = this.LLLFFI;
        if (c371310Eh7 != null) {
            c371310Eh7.setProgress(0);
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void LJJJLIIL(String str) {
        TuxTextView tuxTextView = this.LLLFZ;
        if (tuxTextView != null) {
            tuxTextView.setText("100%");
        }
        C371310Eh7 c371310Eh7 = this.LLLFFI;
        if (c371310Eh7 != null) {
            c371310Eh7.setProgress(100);
        }
    }

    public final void LLLIILIL(String str) {
        String musicId;
        ICreativePerformanceMonitorService iCreativePerformanceMonitorServicePerformanceMonitorService;
        if (!this.LLLILZJ) {
            return;
        }
        EditSaveLocalModel editSaveLocalModel = getEditModel().creativeModel.editSaveLocalModel;
        editSaveLocalModel.isFromQuickPublish = editSaveLocalModel.isClickQuickPublishToNext;
        int i = 0;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iCreativePerformanceMonitorServicePerformanceMonitorService = iExternalService.performanceMonitorService()) != null) {
            iCreativePerformanceMonitorServicePerformanceMonitorService.getJatoBoostAbilityForPublishPage();
        }
        LLLILZ();
        Function0<Unit> function0 = null;
        String secUid = null;
        if (!Intrinsics.LJFF(getEditModel().mShootWay, "chat_shoot") && !getEditModel().creativeModel.initialModel.dmCameraModel.isBulletin && !C1428470nHB.LJJZ(getEditModel())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("account");
            C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser != null) {
                secUid = currentUser.getSecUid();
            }
            sbLIZ.append(secUid);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            boolean z = this.LLLJIL.getBoolean(strLIZIZ, true);
            DuetAndStitchRouterConfig duetAndStitchRouterConfig = getEditModel().creativeModel.initialModel.duetAndStitchRouterConfig;
            if (duetAndStitchRouterConfig != null && duetAndStitchRouterConfig.isEcommerce && z) {
                C1397580mTM c1397580mTM = new C1397580mTM(requireActivity());
                c1397580mTM.LIZ(2131836488);
                C985403tE.LIZ(c1397580mTM, new AwS601S0100000_22(this, 400));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
                this.LLLJIL.storeBoolean(strLIZIZ, false);
                return;
            }
            InterfaceC1453760nvy interfaceC1453760nvyBr = br();
            if (interfaceC1453760nvyBr != null && interfaceC1453760nvyBr.KB2("video_edit_page", "click_edit_page_next", !getEditModel().creativeModel.audioCopyrightDetectModel.getContinueSelected(), null, new AwS566S0100000_22(this, 572))) {
                return;
            }
            C201955140j.LIZ("VEVideoPublishEditActivity nextStep OnClick");
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_main_camera_ai_alive_next_dialog", true) > 0 && getEditModel().getAILivePhotoModel().LJIIJ() && LLLJL() != null && !getEditModel().creativeModel.audioCopyrightDetectModel.getContinueSelected() && !getEditModel().getAILivePhotoModel().pageDataCache.publishDialogContinueSelected) {
                InterfaceC1455680nz4 interfaceC1455680nz4LLLJL = LLLJL();
                if (interfaceC1455680nz4LLLJL != null) {
                    interfaceC1455680nz4LLLJL.Qu(false, new AwS171S1100000_22(this, str, 7));
                    return;
                }
                return;
            }
            LLLILZLLLI(new AwS171S1100000_22(this, str, 8));
            return;
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(getEditModel());
        DMCameraModel dMCameraModel = getEditModel().creativeModel.initialModel.dmCameraModel;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getEditModel().creativeModel.creativeInfo.getCreationId());
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(getEditModel()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(getEditModel()));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("enter_dm", dMCameraModel.enterDM);
        c0lab.LJ("enter_dm_way", dMCameraModel.enterDMWay);
        String stickerID = getEditModel().getStickerID();
        if (stickerID == null) {
            stickerID = "";
        }
        c0lab.LJ("prop_id", stickerID);
        c0lab.LJ("effect_handler_type", dMCameraModel.effectHandlerType);
        c0lab.LJ("effect_handler_type_active", dMCameraModel.effectHandlerTypeActive);
        c0lab.LIZ(pairLJIIJJI.getFirst().intValue(), "video_cnt");
        c0lab.LIZ(pairLJIIJJI.getSecond().intValue(), "pic_cnt");
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            musicId = aVMusicExtractAVMusic.getMusicId();
        } else {
            musicId = null;
        }
        c0lab.LJ("music_id", musicId);
        View view = this.LLJILJILJ;
        if (view == null) {
            view = null;
        }
        if (view.getAlpha() == 1.0f) {
            i = 1;
        }
        c0lab.LIZ(i ^ 1, "is_grey_out");
        C572310McX.LIZ(getEditModel(), c0lab);
        if (getEditModel().isCurrentAutoCutMode()) {
            c0lab.LIZ(getEditModel().creativeModel.autoCutModel.curTemplateType, "autocut_template_type");
            c0lab.LJ("autocut_click_from", getEditModel().creativeModel.autoCutModel.clickFrom);
            c0lab.LJ("autocut_template_group_id", getEditModel().creativeModel.autoCutModel.curTemplateGroupId);
            c0lab.LJ("autocut_template_id", getEditModel().getTTTemplateIdForAutoCut());
        }
        c0lab.LJ("click_from", str);
        c0lab.LJ("framework", "ic");
        C2341909Fp.LIZ("dm_camera_click_send", c0lab.LIZ);
        Function0<Unit> function02 = this.LLJI.LJFF;
        if (function02 != null) {
            function0 = function02;
        }
        function0.invoke();
    }

    public final void LLLILZLLLI(Function0<Unit> function0) {
        C0EZ1 c0ez1WM2;
        C0EZ2 c0ez2Og1;
        C1664740tQG c1664740tQG = this.LLLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIILL;
        InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) c1664740tQG.getValue(this, interfaceC2217461BqaArr[4]);
        C0EZ1 c0ez1WM22 = null;
        if (interfaceC1461350o8D != null && (c0ez1WM2 = interfaceC1461350o8D.WM2()) != null && (c0ez2Og1 = c0ez1WM2.Og1()) != null) {
            InterfaceC1461350o8D interfaceC1461350o8D2 = (InterfaceC1461350o8D) this.LLLIIL.getValue(this, interfaceC2217461BqaArr[4]);
            if (interfaceC1461350o8D2 != null) {
                c0ez1WM22 = interfaceC1461350o8D2.WM2();
            }
            c0ez2Og1.pZ0(this, c0ez1WM22, getEditModel(), function0);
            return;
        }
        function0.invoke();
    }

    public final void LLLLILI(String str) {
        String musicId;
        int i;
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(getEditModel());
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getEditModel().creativeModel.creativeInfo.getCreationId());
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(getEditModel()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(getEditModel()));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(pairLJIIJJI.getFirst().intValue(), "video_cnt");
        c0lab.LIZ(pairLJIIJJI.getSecond().intValue(), "pic_cnt");
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel);
        View view = null;
        if (aVMusicExtractAVMusic != null) {
            musicId = aVMusicExtractAVMusic.getMusicId();
        } else {
            musicId = null;
        }
        c0lab.LJ("music_id", musicId);
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            view = view2;
        }
        if (view.getAlpha() == 1.0f) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i ^ 1, "is_grey_out");
        C572310McX.LIZ(getEditModel(), c0lab);
        if (Intrinsics.LJFF(getEditModel().mShootWay, "mt_help_post_card_search")) {
            C572310McX.LJFF(getEditModel(), c0lab);
        }
        if (getEditModel().isCurrentAutoCutMode()) {
            c0lab.LIZ(getEditModel().creativeModel.autoCutModel.curTemplateType, "autocut_template_type");
            c0lab.LJ("autocut_click_from", getEditModel().creativeModel.autoCutModel.clickFrom);
            c0lab.LJ("autocut_template_group_id", getEditModel().creativeModel.autoCutModel.curTemplateGroupId);
            c0lab.LJ("autocut_template_id", getEditModel().getTTTemplateIdForAutoCut());
        }
        c0lab.LJ("click_from", str);
        C2341909Fp.LIZ("click_next_on_edit_page", c0lab.LIZ);
    }

    public final void LLLLJI(boolean z) {
        InterfaceC1451520nsM interfaceC1451520nsMLLLLII = LLLLII();
        if (interfaceC1451520nsMLLLLII != null) {
            interfaceC1451520nsMLLLLII.m7("enter quick normal publish!");
        }
        getEditModel().creativeModel.quickPostOnEditPageModel.LIZ = true;
        C0CHQ.LIZ().LJI().LIZJ().LJFF(getEditModel(), "postInEditPage");
        Function0<Unit> function0 = null;
        if (z) {
            Function0<Unit> function02 = this.LLJI.LJIIJ;
            if (function02 != null) {
                function0 = function02;
            }
            function0.invoke();
            return;
        }
        Function0<Unit> function03 = this.LLJI.LJIIIZ;
        if (function03 != null) {
            function0 = function03;
        }
        function0.invoke();
    }

    public final void LLLLL(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        VideoPublishEditModel editModel = getEditModel();
        View view = this.LLJJJJJIL;
        View view2 = null;
        if (view == null) {
            view = null;
        }
        int i2 = 0;
        if (view.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLIZ = C1429390nIf.LIZ(editModel, z2);
        if (z && !zLIZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!u4.LJLL(getEditModel())) {
            View view3 = this.LLJILJILJ;
            if (view3 == null) {
                view3 = null;
            }
            if (z3) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view3);
        }
        if (u4.LJIIZILJ(getEditModel()) && !getEditModel().isPhotoSwap() && !C1428470nHB.LLIIIILZ(getEditModel())) {
            if (C20622315mn.LIZJ()) {
                int iLIZIZ = C20622315mn.LIZIZ();
                if (iLIZIZ != 0) {
                    if (iLIZIZ != 1) {
                        if (iLIZIZ == 2) {
                            View view4 = this.LLJILLL;
                            if (view4 != null) {
                                C786410Ut5.LJLLLLLL(8, view4);
                            }
                            View view5 = this.LLJJ;
                            if (view5 != null) {
                                IMSharePanelApi.LIZ.getClass();
                                if (!C1599690rjL.LIZ().LIZ().LJII()) {
                                    i2 = 8;
                                }
                                C786410Ut5.LJLLLLLL(i2, view5);
                            }
                            View view6 = this.LLJILJIL;
                            if (view6 != null) {
                                view2 = view6;
                            }
                            LLLII(6, 6, view2);
                            View view7 = this.LLJJ;
                            if (view7 != null) {
                                LLLII(6, 6, view7);
                            }
                            LLLLLJIL();
                            C0L2R c0l2r = C0L2R.LIZ;
                            VideoPublishEditModel editModel2 = getEditModel();
                            c0l2r.getClass();
                            C2341909Fp.LIZ("edit_page_audience_footer_show", C0L2R.LIZ(editModel2).LIZ);
                            C0LAB c0labLIZ = C0L2R.LIZ(getEditModel());
                            c0labLIZ.LJ("message_button_show_way", "story_edit_page");
                            C2341909Fp.LIZ("story_edit_page_send_message_button_show", c0labLIZ.LIZ);
                            return;
                        }
                        return;
                    }
                    View view8 = this.LLJILLL;
                    if (view8 != null) {
                        C786410Ut5.LJLLLLLL(8, view8);
                    }
                    View view9 = this.LLJJI;
                    if (view9 != null) {
                        IMSharePanelApi.LIZ.getClass();
                        if (!C1599690rjL.LIZ().LIZ().LJII()) {
                            i2 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i2, view9);
                    }
                    View view10 = this.LLJILJIL;
                    if (view10 != null) {
                        view2 = view10;
                    }
                    LLLII(6, 6, view2);
                    View view11 = this.LLJJI;
                    if (view11 != null) {
                        LLLII(6, 6, view11);
                    }
                    LLLLLJIL();
                    C0L2R c0l2r2 = C0L2R.LIZ;
                    VideoPublishEditModel editModel3 = getEditModel();
                    c0l2r2.getClass();
                    C2341909Fp.LIZ("edit_page_audience_footer_show", C0L2R.LIZ(editModel3).LIZ);
                    C0LAB c0labLIZ2 = C0L2R.LIZ(getEditModel());
                    if (C298680BnG.LIZ()) {
                        c0labLIZ2.LIZ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
                    }
                    C2341909Fp.LIZ("story_edit_page_share_button_show", c0labLIZ2.LIZ);
                    return;
                }
                View view12 = this.LLJILJIL;
                if (view12 != null) {
                    view2 = view12;
                }
                LLLII(8, 8, view2);
                View view13 = this.LLJILLL;
                if (view13 != null) {
                    C786410Ut5.LJLLLLLL(8, view13);
                }
                View view14 = this.LLJJI;
                if (view14 != null) {
                    C786410Ut5.LJLLLLLL(8, view14);
                }
                View view15 = this.LLJJ;
                if (view15 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, view15);
                return;
            }
            return;
        }
        View view16 = this.LLJILLL;
        if (view16 != null) {
            C786410Ut5.LJLLLLLL(8, view16);
        }
        View view17 = this.LLJJ;
        if (view17 != null) {
            C786410Ut5.LJLLLLLL(8, view17);
        }
        if (LLLLLLIL()) {
            View view18 = this.LLJILJIL;
            if (view18 != null) {
                view2 = view18;
            }
            LLLII(8, 0, view2);
            return;
        }
        View view19 = this.LLJILJIL;
        if (view19 != null) {
            view2 = view19;
        }
        LLLII(0, 0, view2);
    }

    public final boolean LLLLLJLJLL(boolean z) {
        int i;
        TextImageTaskInfo textImageTaskInfoLIZJ;
        TextImageTaskInfo textImageTaskInfoLIZJ2;
        String uri;
        String failReason = null;
        boolean z2 = false;
        if (C1428470nHB.LLIIIILZ(getEditModel()) && C07CI.LIZIZ() && ((textImageTaskInfoLIZJ = C572250McR.LIZJ(getEditModel().creativeModel.text2ImageModel)) == null || textImageTaskInfoLIZJ.getUri() == null || ((textImageTaskInfoLIZJ2 = C572250McR.LIZJ(getEditModel().creativeModel.text2ImageModel)) != null && (uri = textImageTaskInfoLIZJ2.getUri()) != null && a0.LJJJIL(uri)))) {
            z2 = true;
        }
        TextImageTaskInfo textImageTaskInfoLIZJ3 = C572250McR.LIZJ(getEditModel().creativeModel.text2ImageModel);
        if (textImageTaskInfoLIZJ3 != null) {
            failReason = textImageTaskInfoLIZJ3.getFailReason();
        }
        if (C123100dR.LIZ(failReason)) {
            i = 2131821512;
        } else {
            i = 2131821520;
        }
        if (z2) {
            Context sceneContext = getSceneContext();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(i);
            C1390380mHk.LIZJ(sceneContext, 2037, creativeToastBuilder);
            if (z) {
                LLLLILI("video_edit_page");
            }
        }
        return z2;
    }

    public final void LLLLLL(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLLFF;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            C371310Eh7 c371310Eh7 = this.LLLFFI;
            if (c371310Eh7 != null) {
                int visibility = c371310Eh7.getVisibility();
                c371310Eh7.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c371310Eh7);
            }
            TuxTextView tuxTextView = this.LLLFZ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLLFF;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        }
        C371310Eh7 c371310Eh72 = this.LLLFFI;
        if (c371310Eh72 != null) {
            int visibility2 = c371310Eh72.getVisibility();
            c371310Eh72.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c371310Eh72);
        }
        TuxTextView tuxTextView2 = this.LLLFZ;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    public C1460230o6P(C1460300o6W c1460300o6W, C1DRG c1drg) {
        this.LLJI = c1460300o6W;
        this.LLJIJIL = c1drg;
        this.LLLII = C1664770tQJ.LIZIZ(c1drg, InterfaceC1451520nsM.class, null);
        this.LLLIIII = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455610nyx.class, null);
        this.LLLIIIIL = C1664770tQJ.LIZIZ(c1drg, AbstractC1453750nvx.class, null);
        this.LLLIIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC572230McP.class, null);
        this.LLLIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1461350o8D.class, null);
        this.LLLIILIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455680nz4.class, null);
        this.LLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1460680o78.class, null);
        this.LLLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1439570nZ5.class, null);
        this.LLLIZZ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC578380MmK.class, null);
        this.LLLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453760nvy.class, null);
        this.LLLJIL = Keva.getRepo("add_link_dialog");
        this.LLLJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1431860nMe.class, null);
        this.LLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 575));
        this.LLLLII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 573));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 574));
        this.LLLLIIL = new h0<>(EnumC1460330o6Z.INITIATION);
    }

    public static final void LLLIL(C1460230o6P c1460230o6P, String str) {
        VideoPublishEditModel editModel;
        CanvasVideoData canvasVideoData;
        boolean z = c1460230o6P.getEditModel().creativeModel.editSaveLocalModel.isFromQuickPublish;
        c1460230o6P.LLLLIIIILLL().wi0();
        Function0<Unit> function0 = c1460230o6P.LLJI.LJI;
        List<CanvasFilterParam> transformList = null;
        if (function0 == null) {
            function0 = null;
        }
        function0.invoke();
        if (!z) {
            c1460230o6P.LLLLILI(str);
        }
        VideoPublishEditModel editModel2 = c1460230o6P.getEditModel();
        if (editModel2 != null && (canvasVideoData = editModel2.getCanvasVideoData()) != null) {
            transformList = canvasVideoData.getTransformList();
        }
        if (transformList != null && (editModel = c1460230o6P.getEditModel()) != null && C1428470nHB.LJJZZI(editModel) && C1447250nlT.LIZ()) {
            C1432530nNj.LIZ(c1460230o6P.getEditModel());
        }
        c1460230o6P.getEditModel().getAILivePhotoModel().pageDataCache.publishDialogContinueSelected = false;
    }

    public final void LLLJ(View view, Drawable drawable) {
        if (view != null) {
            view.setBackground(drawable);
        }
        LLLIZZ(view);
    }

    @Override // X.InterfaceC1436400nTy
    public final void e4(Integer num, String str) {
        int iIntValue;
        TuxTextView tuxTextView = this.LLLFZ;
        int iIntValue2 = 0;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            sbLIZ.append(iIntValue);
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C371310Eh7 c371310Eh7 = this.LLLFFI;
        if (c371310Eh7 != null) {
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            c371310Eh7.setProgress(iIntValue2);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        View.OnClickListener c1460280o6U;
        boolean z2;
        int duration;
        UrlModel avatarThumb;
        Context sceneContext;
        super.onViewCreated(view, bundle);
        C1465810oFP c1465810oFP = C1465810oFP.LIZ;
        String creationId = getEditModel().getCreationId();
        String enterFrom = getEditModel().getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        boolean zLJIIZILJ = u4.LJIIZILJ(getEditModel());
        String shootEnterMethod = getEditModel().getShootEnterMethod();
        c1465810oFP.getClass();
        C1465810oFP.LIZIZ(creationId, enterFrom, shootEnterMethod, zLJIIZILJ);
        View viewRequireViewById = requireViewById(R.id.sne);
        this.LLJILJIL = viewRequireViewById;
        if (viewRequireViewById == null) {
            viewRequireViewById = null;
        }
        LLLIZZ(viewRequireViewById);
        this.LLJILLL = findViewById(R.id.smq);
        this.LLJJ = findViewById(R.id.i5_);
        this.LLJJI = findViewById(R.id.i80);
        this.LLJJIII = (TuxIconView) findViewById(R.id.k25);
        WWAModel wWAModel = getEditModel().creativeModel.initialModel.wwaModel;
        if (wWAModel != null && !wWAModel.showStoryButton) {
            z = true;
        } else {
            z = false;
        }
        if (z || !getEditModel().creativeModel.text2ImageModel.enableStory || C568750MSj.LIZIZ(getEditModel())) {
            View view2 = this.LLJILJIL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(8, view2);
        }
        if ((LLLLIIIILLL() instanceof InterfaceC572860MdQ) && (sceneContext = getSceneContext()) != null) {
            View view3 = this.mView;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJFF = Integer.valueOf(R.attr.uk);
            view3.setBackground(c384050F3z.LIZ(sceneContext));
        }
        View view4 = this.LLJILJIL;
        if (view4 == null) {
            view4 = null;
        }
        if (LLLLLLJ()) {
            if (C1428470nHB.LJJZZI(getEditModel())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("click story publish quick publish creationId = ");
                sbLIZ.append(getEditModel().getCreationId());
                C1450070nq1.LJII(C2188811AlT.LIZIZ(sbLIZ));
            }
            c1460280o6U = new C1460310o6X(this, new AwS566S0100000_22(this, 587));
        } else {
            c1460280o6U = new C1460280o6U(this, new AwS566S0100000_22(this, 588));
        }
        C786410Ut5.I7(c1460280o6U, view4);
        View viewRequireViewById2 = requireViewById(R.id.p8u);
        this.LLJILJILJ = viewRequireViewById2;
        if (viewRequireViewById2 == null) {
            viewRequireViewById2 = null;
        }
        LLLIZZ(viewRequireViewById2);
        this.LLJJJJ = (TuxTextView) requireViewById(R.id.p8w);
        View view5 = this.LLJILJILJ;
        if (view5 == null) {
            view5 = null;
        }
        C786410Ut5.I7(new C1466560oGc(this, 9), view5);
        IPoiVideoPublishService iPoiVideoPublishService = (IPoiVideoPublishService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiVideoPublishService != null && iPoiVideoPublishService.hitPreloadPoiRecommendExp()) {
            View view6 = this.LLJILJILJ;
            if (view6 == null) {
                view6 = null;
            }
            view6.setOnTouchListener(new ATListenerS451S0100000_18(this, 11));
        }
        View viewFindViewById = findViewById(R.id.g1n);
        this.LLJJIJI = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new C1466560oGc(this, 10), viewFindViewById);
        }
        View viewFindViewById2 = findViewById(R.id.g1m);
        this.LLJJIJIIJIL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new C1466560oGc(this, 3), viewFindViewById2);
        }
        this.LLJJIJIL = (TuxIconView) findViewById(R.id.g15);
        this.LLJJJ = findViewById(R.id.g17);
        if (C1366905Wp.LIZ()) {
            TuxSpinner tuxSpinner = (TuxSpinner) findViewById(R.id.g16);
            if (tuxSpinner != null) {
                C786410Ut5.LLZILL(tuxSpinner, 8);
            } else {
                tuxSpinner = null;
            }
            this.LLJJJIL = tuxSpinner;
        }
        TuxIconView tuxIconView = this.LLJJIJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new C1466560oGc(this, 4));
        }
        this.LLJJJJJIL = requireViewById(R.id.snd);
        VideoPublishEditModel editModel = getEditModel();
        if (C288870BTx.LIZ() && C1428470nHB.LLIIIJ(editModel) && (!u4.LJJJIL(editModel) || !((Boolean) C0B0M.LIZ.getValue()).booleanValue())) {
            View view7 = this.LLJJJJJIL;
            if (view7 == null) {
                view7 = null;
            }
            C786410Ut5.LJLLLLLL(0, view7);
            View view8 = this.LLJJJJJIL;
            if (view8 == null) {
                view8 = null;
            }
            C786410Ut5.I7(new C1466560oGc(this, 7), view8);
        }
        this.LLJJJJLIIL = requireViewById(R.id.w9i);
        requireViewById(R.id.w9j);
        if (u4.LJJZZIII(getEditModel())) {
            View view9 = this.LLJJJJLIIL;
            if (view9 == null) {
                view9 = null;
            }
            C786410Ut5.LJLLLLLL(0, view9);
            View view10 = this.LLJJJJLIIL;
            if (view10 == null) {
                view10 = null;
            }
            C786410Ut5.I7(new C1460310o6X(this, new AwS566S0100000_22(this, 586)), view10);
        }
        this.LLJJL = (TuxTextView) requireViewById(R.id.tv_quick_publish);
        if (LLLLLLJ()) {
            TuxTextView tuxTextView = this.LLJJL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setPadding(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
        }
        this.LLJL = requireViewById(R.id.snf);
        this.LLJLIL = (C417270GXt) requireViewById(R.id.bgq);
        C0GTR c0gtr = (C0GTR) requireViewById(R.id.bhu);
        this.LLJLLIL = c0gtr;
        if (c0gtr == null) {
            c0gtr = null;
        }
        c0gtr.setRingWidth(C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
        this.LLJLL = (C427870Gq9) requireViewById(R.id.l9h);
        this.LLJLLL = requireViewById(R.id.kbn);
        this.LLJZ = (TuxIconView) requireViewById(R.id.riw);
        C427870Gq9 c427870Gq9 = this.LLJLL;
        if (c427870Gq9 == null) {
            c427870Gq9 = null;
        }
        ViewGroup.LayoutParams layoutParams = c427870Gq9.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            C786410Ut5.W5(c427870Gq9, layoutParams2);
            C0GTR c0gtr2 = this.LLJLLIL;
            if (c0gtr2 == null) {
                c0gtr2 = null;
            }
            ViewGroup.LayoutParams layoutParams3 = c0gtr2.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33));
                layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33));
                C786410Ut5.W5(c0gtr2, layoutParams4);
                C0GTR c0gtr3 = this.LLJLLIL;
                if (c0gtr3 == null) {
                    c0gtr3 = null;
                }
                c0gtr3.requestLayout();
                View view11 = this.LLJL;
                if (view11 == null) {
                    view11 = null;
                }
                C786410Ut5.LJLLLLLL(0, view11);
                View view12 = this.LLJLLL;
                if (view12 == null) {
                    view12 = null;
                }
                C786410Ut5.LJLLLLLL(8, view12);
                C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                if (currentUser != null && (avatarThumb = currentUser.getAvatarThumb()) != null) {
                    C427870Gq9 c427870Gq92 = this.LLJLL;
                    if (c427870Gq92 == null) {
                        c427870Gq92 = null;
                    }
                    C1324750kZt.LJI(c427870Gq92, avatarThumb, -1, -1);
                }
                TuxTextView tuxTextView2 = this.LLJJL;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                tuxTextView2.setText(LLLLIILL());
                if (LLLLLLJ()) {
                    View view13 = this.LLJL;
                    if (view13 == null) {
                        view13 = null;
                    }
                    C786410Ut5.LJLLLLLL(8, view13);
                    C417270GXt c417270GXt = this.LLJLIL;
                    if (c417270GXt != null) {
                        int visibility = c417270GXt.getVisibility();
                        c417270GXt.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, c417270GXt);
                    }
                    View view14 = this.LLJLLL;
                    if (view14 == null) {
                        view14 = null;
                    }
                    C786410Ut5.LJLLLLLL(8, view14);
                    TuxIconView tuxIconView2 = this.LLJZ;
                    if (tuxIconView2 == null) {
                        tuxIconView2 = null;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                } else {
                    LLLLLLLZIL();
                }
                VideoPublishEditModel editModel2 = getEditModel();
                View view15 = this.LLJJJJJIL;
                if (view15 == null) {
                    view15 = null;
                }
                if (view15.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zLIZ = C1429390nIf.LIZ(editModel2, z2);
                View view16 = this.LLJILJIL;
                if (view16 == null) {
                    view16 = null;
                }
                view16.setBackgroundResource(R.drawable.a9j);
                View view17 = this.LLJILJIL;
                if (view17 == null) {
                    view17 = null;
                }
                LLLIZZ(view17);
                if (C07CI.LIZ() == 2) {
                    View view18 = this.LLJILJILJ;
                    if (view18 == null) {
                        view18 = null;
                    }
                    view18.setBackgroundResource(R.drawable.a98);
                } else {
                    View view19 = this.LLJILJILJ;
                    if (view19 == null) {
                        view19 = null;
                    }
                    view19.setBackgroundResource(R.drawable.a99);
                }
                View view20 = this.LLJILJILJ;
                if (view20 == null) {
                    view20 = null;
                }
                LLLIZZ(view20);
                this.LLJZIJLIL = (LinearLayout) requireViewById(R.id.m99);
                requireViewById(R.id.p8v);
                if (zLIZ) {
                    View view21 = this.LLJILJILJ;
                    if (view21 == null) {
                        view21 = null;
                    }
                    C786410Ut5.LJLLLLLL(8, view21);
                }
                if (LLLLLLIL()) {
                    LinearLayout linearLayout = this.LLJZIJLIL;
                    if (linearLayout == null) {
                        linearLayout = null;
                    }
                    C426750GoL.LJIIL(linearLayout, null, 0, null, null, 29);
                    this.LLLF = (FrameLayout) requireViewById(R.id.tzl);
                    this.LLLFF = (TuxIconView) requireViewById(R.id.tzq);
                    this.LLLFFI = (C371310Eh7) requireViewById(R.id.tzs);
                    this.LLLFZ = (TuxTextView) requireViewById(R.id.tzt);
                    FrameLayout frameLayout = this.LLLF;
                    if (frameLayout != null) {
                        C786410Ut5.LJZ(0, frameLayout);
                    }
                    C371310Eh7 c371310Eh7 = this.LLLFFI;
                    if (c371310Eh7 != null) {
                        c371310Eh7.LIZ();
                    }
                    if (C1428520nHG.LJIILJJIL(getEditModel()) && !C1416310mxZ.LJJJLZIJ(getEditModel(), C300650BqR.LIZIZ)) {
                        TuxIconView tuxIconView3 = this.LLLFF;
                        if (tuxIconView3 != null) {
                            tuxIconView3.setIconRes(R.raw.icon_arrow_turn_up_right_fill);
                        }
                        FrameLayout frameLayout2 = this.LLLF;
                        if (frameLayout2 != null) {
                            C786410Ut5.O7(frameLayout2, new ACListenerS156S0100000_22(this, 28));
                        }
                    } else {
                        FrameLayout frameLayout3 = this.LLLF;
                        if (frameLayout3 != null) {
                            C786410Ut5.O7(frameLayout3, new ACListenerS156S0100000_22(this, 29));
                        }
                    }
                    C0CHQ.LIZ().getPublishService().LJJJLIIL(this, new AwS636S0100000_22(this, 21));
                    C0CHQ.LIZ().getPublishService().LJIJJ(this);
                }
                this.LLL = (FrameLayout) requireViewById(R.id.v1w);
                IMSharePanelApi.LIZ.getClass();
                boolean zLJI = C1599690rjL.LIZ().LIZ().LJI();
                InterfaceC1452170ntP value = LLLLIIIILLL().g().getValue();
                if (value != null) {
                    duration = value.getDuration();
                } else {
                    duration = 0;
                }
                int i = C300650BqR.LIZIZ;
                if (!C1428470nHB.LJJZZI(getEditModel()) && !getEditModel().isEnterFromDM() && zLJI && duration <= i) {
                    FrameLayout frameLayout4 = this.LLL;
                    if (frameLayout4 == null) {
                        frameLayout4 = null;
                    }
                    C337180DJs.LIZJ(frameLayout4);
                    View view22 = this.LLJILJIL;
                    if (view22 == null) {
                        view22 = null;
                    }
                    C426750GoL.LJIIIZ(view22, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null, false, 30);
                    InterfaceC1431860nMe interfaceC1431860nMe = (InterfaceC1431860nMe) this.LLLJL.getValue(this, LLLLIILL[11]);
                    if (interfaceC1431860nMe != null) {
                        interfaceC1431860nMe.MA0();
                    }
                } else {
                    FrameLayout frameLayout5 = this.LLL;
                    if (frameLayout5 == null) {
                        frameLayout5 = null;
                    }
                    C337180DJs.LIZ(frameLayout5);
                    View view23 = this.LLJILJIL;
                    if (view23 == null) {
                        view23 = null;
                    }
                    C426750GoL.LJIIIZ(view23, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, null, false, 30);
                }
                FrameLayout frameLayout6 = this.LLL;
                if (frameLayout6 == null) {
                    frameLayout6 = null;
                }
                C786410Ut5.O7(frameLayout6, new C1466560oGc(this, 8));
                View view24 = this.LLJJ;
                if (view24 != null) {
                    C786410Ut5.I7(new C1466560oGc(this, 5), view24);
                }
                View view25 = this.LLJJI;
                if (view25 != null) {
                    C786410Ut5.I7(new C1466560oGc(this, 6), view25);
                }
                C385670FAf<Boolean> c385670FAf = this.LLJI.LIZJ;
                if (c385670FAf == null) {
                    c385670FAf = null;
                }
                c385670FAf.LIZ(this, new AObjectS245S0100000_22(this, 139));
                C385670FAf<Boolean> c385670FAf2 = this.LLJI.LIZ;
                if (c385670FAf2 == null) {
                    c385670FAf2 = null;
                }
                c385670FAf2.LIZ(this, new AObjectS245S0100000_22(this, 140));
                C385670FAf<Boolean> c385670FAf3 = this.LLJI.LIZIZ;
                if (c385670FAf3 == null) {
                    c385670FAf3 = null;
                }
                c385670FAf3.LIZ(this, new AObjectS245S0100000_22(this, 141));
                C385670FAf<Boolean> c385670FAf4 = this.LLJI.LJII;
                if (c385670FAf4 == null) {
                    c385670FAf4 = null;
                }
                c385670FAf4.LIZ(this, new AObjectS245S0100000_22(this, 142));
                h0 h0Var = this.LLJI.LJIIL;
                if (h0Var != null) {
                    h0Var.LIZ(this, new AObjectS245S0100000_22(this, 143));
                }
                C385670FAf<Pair<Boolean, Function0<Unit>>> c385670FAf5 = this.LLJI.LIZLLL;
                if (c385670FAf5 == null) {
                    c385670FAf5 = null;
                }
                c385670FAf5.LIZ(this, new AObjectS305S0200000_22(this, view, 13));
                this.LLLLIIL.LIZ(this, new AObjectS245S0100000_22(this, 144));
                ((C0ETY) this.LLJIJIL.LJII(C0ETY.class, null)).Sd(InterfaceC1444410ngt.class, new AwS601S0100000_22(this, 395));
                int i2 = C1460550o6v.LIZ;
                View view26 = this.LLJILLL;
                InterfaceC1460680o78 interfaceC1460680o78 = (InterfaceC1460680o78) this.LLLIL.getValue(this, LLLLIILL[6]);
                if (view26 != null && interfaceC1460680o78 != null) {
                    interfaceC1460680o78.RL2();
                }
                LLLLLLL();
                if (C1428470nHB.LJJZ(getEditModel())) {
                    C1599690rjL.LIZ().LJ().LIZ("livesdk_highlight_share_page_show", getEditModel().creativeModel.initialModel.highLightVideoParametersModel.enterFrom, getEditModel().creativeModel.initialModel.highLightVideoParametersModel.toUserId, getEditModel().creativeModel.initialModel.highLightVideoParametersModel.itemAnchorId, getEditModel().creativeModel.initialModel.highLightVideoParametersModel.fragmentId, getEditModel().creativeModel.initialModel.highLightVideoParametersModel.gifterRanking, C2097608Jq.LJ(), C0I0B.LJFF.LIZIZ());
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // X.InterfaceC1436400nTy
    public final void z8(int i, String str) {
        TuxTextView tuxTextView = this.LLLFZ;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C371310Eh7 c371310Eh7 = this.LLLFFI;
        if (c371310Eh7 != null) {
            c371310Eh7.setProgress(i);
        }
    }

    public static void LLLII(int i, int i2, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
            }
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.W5(view, marginLayoutParams);
    }

    public static final void LLLIIIIL(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i2);
        }
        if (view != null) {
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public final boolean LLLLLILLIL(Function0 function0, boolean z, boolean z2) {
        InterfaceC1453760nvy interfaceC1453760nvyBr = br();
        if (interfaceC1453760nvyBr != null && interfaceC1453760nvyBr.KB2("video_edit_page", "click_edit_page_next", !getEditModel().creativeModel.audioCopyrightDetectModel.getContinueSelected(), null, new AwS139S0110000_22(this, z2, 7))) {
            return false;
        }
        LLLILZ();
        if (!z) {
            LLLLIIIILLL().wi0();
        }
        InterfaceC572230McP interfaceC572230McP = (InterfaceC572230McP) this.LLLIIIL.getValue(this, LLLLIILL[3]);
        if (interfaceC572230McP != null) {
            interfaceC572230McP.H91();
        }
        if (function0 != null) {
            function0.invoke();
        }
        return true;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.xm);
        return ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).loadLayoutFiles("scene_edit_story_bottom_1", getSceneContext(), layoutInflater, R.layout.eot, viewGroup, false);
    }
}
