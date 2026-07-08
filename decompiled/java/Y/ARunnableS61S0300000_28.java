package Y;

import X.AbstractC1874160ys2;
import X.AbstractC1874190ys5;
import X.C12ES;
import X.C1508630pMT;
import X.C1547430qN3;
import X.C1720106oR;
import X.C1874230ys9;
import X.C1874240ysA;
import X.C1874280ysE;
import X.C1874290ysF;
import X.C1903670zdd;
import X.C1903680zde;
import X.C1903690zdf;
import X.C1903700zdg;
import X.C1904370zel;
import X.C1911410zq7;
import X.C1913640zti;
import X.C1914710zvR;
import X.C19646111tj;
import X.C19654211v2;
import X.C19655911vJ;
import X.C197039127h;
import X.C1C7U;
import X.C21578619ce;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2252408s6;
import X.C786410Ut5;
import X.C817403Hg;
import X.EnumC1904380zem;
import X.InterfaceC1670800ta2;
import X.InterfaceC1874170ys3;
import X.InterfaceC1874200ys6;
import X.InterfaceC1874220ys8;
import X.InterfaceC1874250ysB;
import X.InterfaceC19315510hV;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ViewFlipper;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginSignupTabFragment;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent;
import com.ss.android.ugc.aweme.journey.step.slogan.SloganAndConsentFragment;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.pns.feedsafety.whythispost.ui.ContainerFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS61S0300000_28 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        InterfaceC19315510hV interfaceC19315510hV;
        if (((View) this.l0).getParent() != null) {
            ((LoginSignupTabFragment) this.l1).NR().LJIIJ((Bundle) this.l2);
            InterfaceC1670800ta2 activity = ((LoginSignupTabFragment) this.l1).getActivity();
            if ((activity instanceof InterfaceC19315510hV) && (interfaceC19315510hV = (InterfaceC19315510hV) activity) != null) {
                interfaceC19315510hV.LJJJ();
            }
            View view = (View) this.l0;
            HandlerHook.viewPost(view, new ARunnableS97S0200000_28(view, (LoginSignupTabFragment) this.l1, 13));
        }
    }

    public final void LIZ$1() {
        C1508630pMT c1508630pMT = C1508630pMT.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doOnPreDraw -> holder is ");
        sbLIZ.append((RecyclerView.ViewHolder) this.l1);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1508630pMT.getClass();
        C1508630pMT.LIZJ(strLIZIZ);
        if (C1904370zel.LIZJ.get()) {
            return;
        }
        ((EnumC1904380zem) this.l2).intervalEnd();
        C1904370zel.LIZ.getClass();
        List<EnumC1904380zem> list = (!C1904370zel.LJFF || Intrinsics.LJFF(EnumC1904380zem.DM_READY_BUT_NO_DATA.m72getValue(), Boolean.TRUE)) ? C1904370zel.LJ : C1904370zel.LIZLLL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (EnumC1904380zem enumC1904380zem : list) {
                if (!enumC1904380zem.getHasRecord().get() || enumC1904380zem.getInterval().LIZIZ <= 0) {
                    return;
                }
            }
        }
        if (C1904370zel.LIZJ.compareAndSet(false, true)) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("PreloadStatics", "realReport");
            C2252408s6.LIZ(new AwS572S0100000_28(list, (List<? extends EnumC1904380zem>) 234));
        }
    }

    public final void LIZ$2() {
        C19655911vJ editor;
        C21578619ce c21578619ce;
        View childAt;
        View view = ((C19654211v2) this.l1).LLILZIL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = ((View) this.l2).getTop() - view.getTop();
            C786410Ut5.W5(view, layoutParams);
            C19646111tj c19646111tj = ((C19654211v2) this.l1).LLILLL;
            if (c19646111tj == null || (editor = c19646111tj.getEditor()) == null || !editor.isFocused() || (c21578619ce = ((C19654211v2) this.l1).LLIZ) == null || (childAt = c21578619ce.getChildAt(0)) == null) {
                return;
            }
            int height = childAt.getHeight();
            C19654211v2 c19654211v2 = (C19654211v2) this.l1;
            C21578619ce c21578619ce2 = c19654211v2.LLIZ;
            if (c21578619ce2 != null) {
                HandlerHook.viewPost(c21578619ce2, new ARunnableS39S0101000_28(height, c19654211v2, 1));
            }
        }
    }

    public final void LIZ$3() {
        SwipeUpVideoComponent swipeUpVideoComponent = (SwipeUpVideoComponent) this.l0;
        if (swipeUpVideoComponent.LLJJJJ == null) {
            View view = swipeUpVideoComponent.getView();
            View viewFindViewById = view != null ? view.findViewById(R.id.ji7) : null;
            swipeUpVideoComponent.LLJJJJ = viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        int top = ((C197039127h) this.l1).getTop();
        SwipeUpVideoComponent swipeUpVideoComponent2 = (SwipeUpVideoComponent) this.l0;
        View view2 = swipeUpVideoComponent2.LLJJJJ;
        if (view2 == null) {
            View view3 = swipeUpVideoComponent2.getView();
            View viewFindViewById2 = view3 != null ? view3.findViewById(R.id.ji7) : null;
            swipeUpVideoComponent2.LLJJJJ = viewFindViewById2;
            view2 = viewFindViewById2;
        }
        float bottom = (top - view2.getBottom()) - C12ES.LIZJ(24.0f, ((SwipeUpVideoComponent) this.l0).getContext());
        if (bottom <= 0.0f || bottom >= ((C817403Hg) this.l2).element) {
            return;
        }
        ((SwipeUpVideoComponent) this.l0).nS().getLayoutParams().height = (int) bottom;
        ((SwipeUpVideoComponent) this.l0).nS().getLayoutParams().width = ((SwipeUpVideoComponent) this.l0).nS().getLayoutParams().height;
        C786410Ut5.j6(((SwipeUpVideoComponent) this.l0).nS(), ((SwipeUpVideoComponent) this.l0).nS().getLayoutParams());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video_container max height ");
        sbLIZ.append(bottom);
        C1911410zq7.LIZ("WelcomeVideoViewHolder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ$4() {
        FrameLayout frameLayout = (FrameLayout) this.l0;
        ViewParent parent = frameLayout != null ? frameLayout.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) this.l1;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            try {
                boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("vConsole destroyWithBack failed: ");
                sbLIZ.append(e.getMessage());
                C1720106oR.LIZ("MiniGameRenderImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
            try {
                C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) this.l1;
                c1547430qN3.getClass();
                C1547430qN3.LJIIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LIZ("MiniGameRenderImpl", "vConsole forceRemove failed: " + e2.getMessage());
            }
        }
        FrameLayout frameLayout2 = (FrameLayout) this.l0;
        if (frameLayout2 != null) {
            if (viewGroup != null) {
                C786410Ut5.LJJJLZIJ(frameLayout2, viewGroup);
            }
            C786410Ut5.LJJJJIZL((FrameLayout) this.l0);
        }
        if (viewGroup == null || viewGroup == ((ViewGroup) this.l2)) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup);
    }

    public final void LIZ$5() {
        MutableLiveData<Boolean> mutableLiveData;
        C1903680zde c1903680zde = (C1903680zde) this.l0;
        if (c1903680zde.LLJILJILJ) {
            return;
        }
        InboxFollowGuideViewModel inboxFollowGuideViewModel = c1903680zde.LLJILJIL;
        if (inboxFollowGuideViewModel != null && (mutableLiveData = inboxFollowGuideViewModel.LLILLL) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        ((HomeTabAbility) this.l1).Ik0((C1903700zdg) this.l2);
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.l1;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSmoothScroll", true);
        homeTabAbility.fw0(bundle, "Following");
    }

    public final void LIZ$6() {
        MutableLiveData<Boolean> mutableLiveData;
        C1903670zdd c1903670zdd = (C1903670zdd) this.l0;
        if (c1903670zdd.LLJJIJIL) {
            return;
        }
        InboxFollowGuideViewModel inboxFollowGuideViewModel = c1903670zdd.LLJJIJIIJIL;
        if (inboxFollowGuideViewModel != null && (mutableLiveData = inboxFollowGuideViewModel.LLILLL) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        ((HomeTabAbility) this.l1).Ik0((C1903690zdf) this.l2);
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.l1;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSmoothScroll", true);
        homeTabAbility.fw0(bundle, "Following");
    }

    public static final void run$0(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("LoginSignupTabFragment@2c72.onViewCreated$2");
        try {
            aRunnableS61S0300000_28.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LoginSignupTabFragment@2c72.onViewCreated$2");
    }

    public static final void run$1(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadStatics@8b16.trackRender$lambda$3$$inlined$doOnPreDraw$1");
        try {
            aRunnableS61S0300000_28.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadStatics@8b16.trackRender$lambda$3$$inlined$doOnPreDraw$1");
    }

    public static final void run$10(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("SkylightLiveGuideBannerVH@b2b8.jumpClick$1$2$onTabChange$1");
        try {
            aRunnableS61S0300000_28.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkylightLiveGuideBannerVH@b2b8.jumpClick$1$2$onTabChange$1");
    }

    public static final void run$11(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("SkylightLiveGuideVH@d683.jumpClick$1$2$onTabChange$1");
        try {
            aRunnableS61S0300000_28.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkylightLiveGuideVH@d683.jumpClick$1$2$onTabChange$1");
    }

    public static final void run$12(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("BaseInterestSelectionComponent@f1ee.handleScrollBarChange$1$2");
        try {
            if (((BaseInterestSelectionComponent) aRunnableS61S0300000_28.l0).isViewValid() && ((RecyclerView) aRunnableS61S0300000_28.l1).getAdapter() != null) {
                ((Function0) aRunnableS61S0300000_28.l2).invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseInterestSelectionComponent@f1ee.handleScrollBarChange$1$2");
    }

    public static final void run$2(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("NewsAnchorPublishViewHolder@8b0d.onOpened$lambda$21$$inlined$doOnPreDraw$1");
        try {
            aRunnableS61S0300000_28.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewsAnchorPublishViewHolder@8b0d.onOpened$lambda$21$$inlined$doOnPreDraw$1");
    }

    public static final void run$3(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        ViewFlipper viewFlipper;
        C1C7U.LIZ("ContainerFragment@2a81.navigateBackToStart$1");
        try {
            C1914710zvR c1914710zvR = (C1914710zvR) aRunnableS61S0300000_28.l0;
            if (c1914710zvR != null && c1914710zvR.getParent() == (viewFlipper = (ViewFlipper) aRunnableS61S0300000_28.l2)) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewFlipper, c1914710zvR);
                viewFlipper.removeView(c1914710zvR);
            }
            ((ContainerFragment) aRunnableS61S0300000_28.l1).LLILZ = null;
            ((ViewFlipper) aRunnableS61S0300000_28.l2).setDisplayedChild(0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ContainerFragment@2a81.navigateBackToStart$1");
    }

    public static final void run$4(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("SloganAndConsentFragment@cf5a.showBottomSheetConsent$1$1");
        try {
            ((SloganAndConsentFragment) aRunnableS61S0300000_28.l0).nS(((TuxSheet) aRunnableS61S0300000_28.l1).getView(), (C1913640zti) aRunnableS61S0300000_28.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SloganAndConsentFragment@cf5a.showBottomSheetConsent$1$1");
    }

    public static final void run$5(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("SwipeUpVideoComponent@bab5.onViewCreatedInner$4$1");
        try {
            aRunnableS61S0300000_28.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SwipeUpVideoComponent@bab5.onViewCreatedInner$4$1");
    }

    public static final void run$6(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("SwipeUpVideoComponent@bab5.onViewCreatedInner$4");
        try {
            if (!((SwipeUpVideoComponent) aRunnableS61S0300000_28.l0).isViewValid()) {
                C1911410zq7.LIZ("WelcomeVideoViewHolder", "video_container view not valid");
            } else {
                C197039127h c197039127h = (C197039127h) aRunnableS61S0300000_28.l1;
                HandlerHook.viewPost(c197039127h, new ARunnableS61S0300000_28((SwipeUpVideoComponent) aRunnableS61S0300000_28.l0, c197039127h, (C817403Hg) aRunnableS61S0300000_28.l2, 5));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SwipeUpVideoComponent@bab5.onViewCreatedInner$4");
    }

    public static final void run$7(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("MinisGetStorageItemMethodNative@a825.handle$1");
        try {
            C1874280ysE c1874280ysE = (C1874280ysE) aRunnableS61S0300000_28.l0;
            final JSONObject jSONObject = (JSONObject) aRunnableS61S0300000_28.l1;
            c1874280ysE.getClass();
            InterfaceC1874170ys3 interfaceC1874170ys3 = new InterfaceC1874170ys3() { // from class: X.07Pf
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final Map<String, Object> convert() {
                    return null;
                }

                @Override // X.InterfaceC1874170ys3
                public final String getKey() {
                    return jSONObject.optString("key");
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final JSONObject toJSON() {
                    return new JSONObject();
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
                public final List<String> provideParamList() {
                    return C13BV.INSTANCE;
                }
            };
            new AbstractC1874160ys2() { // from class: X.0ysA
                public static void LIZJ(InterfaceC1874170ys3 interfaceC1874170ys32, CompletionBlock completionBlock) {
                    boolean z;
                    String key = interfaceC1874170ys32.getKey();
                    if (key != null && key.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        InterfaceC1874250ysB interfaceC1874250ysB = (InterfaceC1874250ysB) C1909107dp.LIZJ(InterfaceC1874250ysB.class, null);
                        interfaceC1874250ysB.setSuccess(Boolean.FALSE);
                        interfaceC1874250ysB.setErrorCode(1002);
                        interfaceC1874250ysB.setErrorMsg("key cannot be empty");
                        int i = C2187451AjH.LIZ;
                        completionBlock.onSuccess(interfaceC1874250ysB, "");
                        return;
                    }
                    C1504720pGA.LIZ.getClass();
                    Keva kevaLIZIZ = C1504720pGA.LIZIZ();
                    if (kevaLIZIZ == null) {
                        InterfaceC1874250ysB interfaceC1874250ysB2 = (InterfaceC1874250ysB) C1909107dp.LIZJ(InterfaceC1874250ysB.class, null);
                        interfaceC1874250ysB2.setSuccess(Boolean.FALSE);
                        interfaceC1874250ysB2.setErrorCode(1001);
                        interfaceC1874250ysB2.setErrorMsg("failed");
                        int i2 = C2187451AjH.LIZ;
                        completionBlock.onSuccess(interfaceC1874250ysB2, "");
                        return;
                    }
                    String string = kevaLIZIZ.getString(key, null);
                    InterfaceC1874250ysB interfaceC1874250ysB3 = (InterfaceC1874250ysB) C1909107dp.LIZJ(InterfaceC1874250ysB.class, null);
                    interfaceC1874250ysB3.setSuccess(Boolean.TRUE);
                    interfaceC1874250ysB3.setValue(string);
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getStorageItemByMinis, key:");
                    sbLIZ.append(key);
                    C2188811AlT.LIZIZ(sbLIZ);
                    completionBlock.onSuccess(interfaceC1874250ysB3, "");
                }

                @Override // X.AbstractC1549150qPp
                public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
                    LIZJ((InterfaceC1874170ys3) xBaseParamModel, completionBlock);
                }
            };
            final C1874280ysE c1874280ysE2 = (C1874280ysE) aRunnableS61S0300000_28.l0;
            final Number number = (Number) aRunnableS61S0300000_28.l2;
            C1874240ysA.LIZJ(interfaceC1874170ys3, new CompletionBlock<InterfaceC1874250ysB>() { // from class: X.0ysD
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final void onSuccess(XBaseResultModel xBaseResultModel, String str) throws JSONException {
                    C1874280ysE c1874280ysE3 = c1874280ysE2;
                    Number number2 = number;
                    c1874280ysE3.getClass();
                    c1874280ysE3.LJFF(number2, C1874280ysE.LJII((InterfaceC1874250ysB) xBaseResultModel));
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) throws JSONException {
                    C1874280ysE c1874280ysE3 = c1874280ysE2;
                    Number number2 = number;
                    c1874280ysE3.getClass();
                    c1874280ysE3.LJ(number2, C1874280ysE.LJII((InterfaceC1874250ysB) xBaseResultModel));
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisGetStorageItemMethodNative@a825.handle$1");
    }

    public static final void run$8(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("MinisRemoveStorageItemMethodNative@dd9e.handle$1");
        try {
            C1874290ysF c1874290ysF = (C1874290ysF) aRunnableS61S0300000_28.l0;
            final JSONObject jSONObject = (JSONObject) aRunnableS61S0300000_28.l1;
            c1874290ysF.getClass();
            InterfaceC1874200ys6 interfaceC1874200ys6 = new InterfaceC1874200ys6() { // from class: X.07Pg
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final Map<String, Object> convert() {
                    return null;
                }

                @Override // X.InterfaceC1874200ys6
                public final String getKey() {
                    return jSONObject.optString("key");
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final JSONObject toJSON() {
                    return new JSONObject();
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
                public final List<String> provideParamList() {
                    return C13BV.INSTANCE;
                }
            };
            new AbstractC1874190ys5() { // from class: X.0ys9
                public static void LIZJ(InterfaceC1874200ys6 interfaceC1874200ys62, CompletionBlock completionBlock) {
                    boolean z;
                    String key = interfaceC1874200ys62.getKey();
                    if (key != null && key.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        InterfaceC1874220ys8 interfaceC1874220ys8 = (InterfaceC1874220ys8) C1909107dp.LIZJ(InterfaceC1874220ys8.class, null);
                        interfaceC1874220ys8.setSuccess(Boolean.FALSE);
                        interfaceC1874220ys8.setErrorCode(1002);
                        interfaceC1874220ys8.setErrorMsg("key cannot be empty");
                        int i = C2187451AjH.LIZ;
                        completionBlock.onSuccess(interfaceC1874220ys8, "");
                        return;
                    }
                    C1504720pGA.LIZ.getClass();
                    Keva kevaLIZIZ = C1504720pGA.LIZIZ();
                    if (kevaLIZIZ == null) {
                        InterfaceC1874220ys8 interfaceC1874220ys82 = (InterfaceC1874220ys8) C1909107dp.LIZJ(InterfaceC1874220ys8.class, null);
                        interfaceC1874220ys82.setSuccess(Boolean.FALSE);
                        interfaceC1874220ys82.setErrorCode(1001);
                        interfaceC1874220ys82.setErrorMsg("failed");
                        int i2 = C2187451AjH.LIZ;
                        completionBlock.onSuccess(interfaceC1874220ys82, "");
                        return;
                    }
                    String str = (String) C12848051a.LIZ(kevaLIZIZ, "", key);
                    kevaLIZIZ.erase(key);
                    C1504720pGA.LIZLLL(str);
                    InterfaceC1874220ys8 interfaceC1874220ys83 = (InterfaceC1874220ys8) C1909107dp.LIZJ(InterfaceC1874220ys8.class, null);
                    interfaceC1874220ys83.setSuccess(Boolean.TRUE);
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("removeStorageItemByMinis, key:");
                    sbLIZ.append(key);
                    C2188811AlT.LIZIZ(sbLIZ);
                    completionBlock.onSuccess(interfaceC1874220ys83, "");
                }

                @Override // X.AbstractC1549150qPp
                public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
                    LIZJ((InterfaceC1874200ys6) xBaseParamModel, completionBlock);
                }
            };
            final C1874290ysF c1874290ysF2 = (C1874290ysF) aRunnableS61S0300000_28.l0;
            final Number number = (Number) aRunnableS61S0300000_28.l2;
            C1874230ys9.LIZJ(interfaceC1874200ys6, new CompletionBlock<InterfaceC1874220ys8>() { // from class: X.0ysG
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final void onSuccess(XBaseResultModel xBaseResultModel, String str) throws JSONException {
                    C1874290ysF c1874290ysF3 = c1874290ysF2;
                    Number number2 = number;
                    c1874290ysF3.getClass();
                    c1874290ysF3.LJFF(number2, C1874290ysF.LJII((InterfaceC1874220ys8) xBaseResultModel));
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) throws JSONException {
                    C1874290ysF c1874290ysF3 = c1874290ysF2;
                    Number number2 = number;
                    c1874290ysF3.getClass();
                    c1874290ysF3.LJ(number2, C1874290ysF.LJII((InterfaceC1874220ys8) xBaseResultModel));
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisRemoveStorageItemMethodNative@dd9e.handle$1");
    }

    public static final void run$9(ARunnableS61S0300000_28 aRunnableS61S0300000_28) {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameRenderImpl@d7c2.hideVConsole$detachWork$1");
        try {
            aRunnableS61S0300000_28.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameRenderImpl@d7c2.hideVConsole$detachWork$1");
    }

    public ARunnableS61S0300000_28(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
