package X;

import Y.AsS35S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS12S0101100_8;
import kotlin.jvm.internal.AwS19S1201000_8;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS48S1300000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import t28.h;

/* JADX INFO: renamed from: X.0KoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528760KoU extends AbstractC528270Knh implements InterfaceC528520Ko6 {
    public View LLLLLLJ;
    public ViewOnClickListenerC20639415pY LLLLLLL;
    public ViewStub LLLLLLLLL;
    public InterfaceC528410Knv LLLLLLLLLL;
    public AwS587S0100000_8 LLLLLLLZIL;
    public Boolean LLLLLLZ;
    public InterfaceC522120Kdm LLLLLLZZ;
    public boolean LLLLLZIL;
    public boolean LLLLLZL;
    public boolean LLLLZI;
    public C528780KoW LLLLZIL;
    public C527460KmO LLLLZLLLI;
    public final boolean LLLZL;
    public final boolean LLLZLL;
    public final boolean LLLZLZ;
    public boolean LLLLLZ = true;
    public final long LLLLZ = C566050MHz.LIZIZ();
    public final C2252321DDq LLLLZLL = C1BNE.LIZ(Boolean.FALSE);
    public final C2252321DDq LLLLZLLIL = C1BNE.LIZ(0L);
    public final C01GW LLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 295));
    public final C01GW LLLZI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 291));
    public final C01GW LLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 292));
    public final C0JEX LLLZIL = C0JEY.LIZ(this, C13LE.LIZ(AlbumAiSelfTaskViewModel.class), new AwS552S0100000_8(new AwS552S0100000_8((Scene) this, 293), (Function0<Unit>) 294), null);

    @Override // X.AbstractC528270Knh
    public final void LLLZ() {
        this.LLLFZ = true;
        ChooseMediaExtensionKt.LIZJ(this, C528720KoQ.LIZ);
    }

    @Override // X.AbstractC528270Knh
    public final void LLLZI() {
        ViewStub viewStub;
        if (this.LLJJL != null || (viewStub = this.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        C786410Ut5.LJLLLL(viewStub);
        this.LLJJL = this.LLJJJJJIL.findViewById(R.id.kdb);
    }

    public final AIGCEntranceInfo LLLZZ() {
        AIGC.AICreationSceneName.AI_IMAGE_NEW_AISELF ai_image_new_aiself = AIGC.AICreationSceneName.AI_IMAGE_NEW_AISELF.INSTANCE;
        AIGC.RefPageName.UploadPage uploadPage = AIGC.RefPageName.UploadPage.INSTANCE;
        return AIGCEntranceInfo.LIZ(C550730Lip.LIZ("ai_image_new_ai_self", ai_image_new_aiself, uploadPage, uploadPage.value), null, null, 0, null, null, false, false, this.LLLIIII.LJII.LJ, null, null, "upload_page", null, null, null, false, false, 1046271);
    }

    public final AIGCEntranceInfo LLLZZIL() {
        return AIGCEntranceInfo.LIZ(C550740Liq.LIZ("ai_image_new_ai_self", AIGC.AICreationSceneName.AI_IMAGE_NEW_AISELF.INSTANCE, AIGC.RefPageName.UploadPage.INSTANCE, false), null, null, 0, null, null, false, false, this.LLLIIII.LJII.LJ, null, null, "upload_page", null, null, null, false, false, 1046271);
    }

    public final boolean LLZ() {
        int i;
        return (C522930Kf5.LIZIZ(this.LLLLJI) || C522930Kf5.LIZ(this.LLLLJI) || (i = this.LLLLJI) == 57 || i == 60 || i == 59 || !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_album_support_ai_self_creation", true, false)) ? false : true;
    }

    public final C530510KrJ LLZL() {
        boolean z = this.LLLZLL;
        if (z && this.LLLZL) {
            return new C530510KrJ(2131825965, 2131825968, 2131825967, 2131825966, new C530500KrI("ai_theater_creation_img_res", "bg_ai_image_tab.png"));
        }
        if (this.LLLZLZ && !z) {
            return new C530510KrJ(2131825779, 2131825767, 2131825766, 2131825765, new C530500KrI("ai_portrait_creation_img_res", "ai_portrait_album_gallery_intro.png"));
        }
        if (this.LLLZL) {
            return new C530510KrJ(2131825965, 2131825968, 2131825967, 2131825966, new C530500KrI("ai_theater_creation_img_res", "bg_ai_image_tab.png"));
        }
        return null;
    }

    public final AlbumAiSelfTaskViewModel LLZLI() {
        return (AlbumAiSelfTaskViewModel) this.LLLZIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZLLIL() {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528760KoU.LLZLLIL():void");
    }

    public final boolean LLZLLLL() {
        Bundle bundle = this.mArguments;
        if (bundle == null || !bundle.getBoolean("forbid_init_multi_mode", false)) {
            if (this.LLLLLZ) {
                C533730KwV.LIZ.getClass();
                if (!C533730KwV.LIZJ()) {
                }
                return true;
            }
            C533730KwV c533730KwV = C533730KwV.LIZ;
            int i = this.LLLLJI;
            c533730KwV.getClass();
            if (C533730KwV.LIZLLL(i, false)) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (this.LLLFFI && this.LLLLZI) {
            ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class);
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                if (!chooseMediaViewModel.qR2(sceneContext)) {
                    h(C13BV.INSTANCE, true, true);
                    return;
                }
                List<? extends TikTokMediaModel> listLLIIII = C13LP.LLIIII(chooseMediaViewModel.LLJIJIL);
                if (listLLIIII.size() != this.LLJJJ.LLJLIL.size()) {
                    h(listLLIIII, true, true);
                }
            }
        }
    }

    public final void g() {
        String str;
        InterfaceC528960Koo interfaceC528960KooJ9;
        InterfaceC550750Lir interfaceC550750LirG9;
        InterfaceC550750Lir interfaceC550750LirG92;
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        InterfaceC549230LgP interfaceC549230LgPLIZLLL = null;
        if (((aITheaterProfileServiceLIZ == null || (interfaceC550750LirG92 = aITheaterProfileServiceLIZ.g9()) == null) ? null : interfaceC550750LirG92.LIZLLL()) instanceof C549290LgV) {
            f(C0LQY.AI_THEATER);
            return;
        }
        AITheaterProfileService aITheaterProfileServiceLIZ2 = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ2 != null && (interfaceC550750LirG9 = aITheaterProfileServiceLIZ2.g9()) != null) {
            interfaceC549230LgPLIZLLL = interfaceC550750LirG9.LIZLLL();
        }
        if (interfaceC549230LgPLIZLLL instanceof C549350Lgb) {
            str = "ai_image_old_aiself";
        } else if (!(interfaceC549230LgPLIZLLL instanceof C557300LtQ)) {
            return;
        } else {
            str = "ai_image_no_aiself";
        }
        AITheaterProfileService aITheaterProfileServiceLIZ3 = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ3 == null || (interfaceC528960KooJ9 = aITheaterProfileServiceLIZ3.j9()) == null) {
            return;
        }
        boolean z = this.LLLIIII.LJII.LJ;
        String str2 = this.LLLIIIIL;
        if (str2 == null) {
            str2 = "";
        }
        interfaceC528960KooJ9.LJFF(z ? 1 : 0, str, str2, "upload_page", null, null);
    }

    public final boolean isEditorProReplace() {
        BaseBundle baseBundle;
        return this.LLLLJI == 14 && (baseBundle = (BaseBundle) this.LLLZI.getValue()) != null && baseBundle.getBoolean("Key_replace_item", false);
    }

    public C528760KoU() {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        InterfaceC546120LbO interfaceC546120LbOLIZIZ;
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        this.LLLZL = (aITheaterProfileServiceLIZ == null || (interfaceC546120LbOLIZIZ = aITheaterProfileServiceLIZ.LIZIZ()) == null || !interfaceC546120LbOLIZIZ.isFeatureEnabled()) ? false : true;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        this.LLLZLL = (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.isFeatureEnabled()) ? false : true;
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        this.LLLZLZ = iAIPortraitFeatureServiceLIZ != null && iAIPortraitFeatureServiceLIZ.isFeatureEnabled();
    }

    @Override // X.AbstractC528890Koh, com.bytedance.scene.Scene
    public final void onDestroy() {
        String string;
        super.onDestroy();
        boolean z = ((Number) this.LLLLZLLIL.getValue()).longValue() > 0;
        boolean zBooleanValue = ((Boolean) this.LLLLZLL.getValue()).booleanValue();
        if (!z || zBooleanValue) {
            return;
        }
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        C201955140j.LIZLLL(c552700Lm0, "ChooseAiContentFragment", "onDestroy: Page selected but data not loaded, reporting special event");
        Bundle bundle = this.mArguments;
        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
            string = "video_shoot_page";
        }
        Bundle bundle2 = this.mArguments;
        String string2 = bundle2 != null ? bundle2.getString("shoot_tab_name") : null;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LLLIIIL);
        c0lab.LJ("shoot_way", this.LLLIIIIL);
        c0lab.LJ("shoot_tab_name", string2);
        c0lab.LJ("enter_from", string);
        C20684815ws.LJIILLIIL("enter_ai_image_tab", c0lab.LIZ);
        C201955140j.LIZLLL(c552700Lm0, "ChooseAiContentFragment", "reportPageSelectedButDataNotLoaded: reported special event");
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        String str;
        super.onStart();
        final C528780KoW c528780KoW = this.LLLLZIL;
        if (c528780KoW != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = c528780KoW.LJI;
            if (!z && c528780KoW.LIZLLL && c528780KoW.LJII && jCurrentTimeMillis - c528780KoW.LJ >= 2000) {
                c528780KoW.LIZIZ.LIZ();
                C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Force refresh triggered: ");
                sbLIZ.append("activity_return");
                C201955140j.LIZLLL(c552700Lm0, "IncrementalRefreshManager", C2188811AlT.LIZIZ(sbLIZ));
                C201955140j.LIZLLL(c552700Lm0, "IncrementalRefreshManager", "performForceRefresh: executing force refresh");
                c528780KoW.LJFF = System.currentTimeMillis();
                c528780KoW.LJII = false;
                C527460KmO c527460KmO = c528780KoW.LIZ;
                if (c527460KmO != null) {
                    C527460KmO.LIZ(c527460KmO, new InterfaceC524590Khl() { // from class: X.0Koa
                        @Override // X.InterfaceC524590Khl
                        public final void LIZ(List<TikTokMediaModel> list) {
                            c528780KoW.LIZJ.pR2(list, false);
                        }
                    });
                }
            } else {
                if (z) {
                    str = "first_start";
                } else if (!c528780KoW.LIZLLL || jCurrentTimeMillis - c528780KoW.LJ < 2000 || jCurrentTimeMillis - c528780KoW.LJFF < 30000) {
                    str = !c528780KoW.LIZLLL ? "initial_data_not_loaded" : jCurrentTimeMillis - c528780KoW.LJ < 2000 ? "too_frequent_start" : jCurrentTimeMillis - c528780KoW.LJFF < 30000 ? "too_frequent_refresh" : "unknown";
                } else {
                    C552700Lm0 c552700Lm02 = C552700Lm0.LIZIZ;
                    C201955140j.LIZLLL(c552700Lm02, "IncrementalRefreshManager", "Performing incremental refresh on start");
                    c528780KoW.LIZIZ.LIZJ();
                    C201955140j.LIZLLL(c552700Lm02, "IncrementalRefreshManager", "performIncrementalRefresh: executing incremental refresh");
                    c528780KoW.LJFF = System.currentTimeMillis();
                    C527460KmO c527460KmO2 = c528780KoW.LIZ;
                    if (c527460KmO2 != null) {
                        C527460KmO.LIZ(c527460KmO2, new InterfaceC524590Khl() { // from class: X.0KoY
                            @Override // X.InterfaceC524590Khl
                            public final void LIZ(List<TikTokMediaModel> list) {
                                ChooseMediaViewModel chooseMediaViewModel = c528780KoW.LIZJ;
                                if (chooseMediaViewModel != null) {
                                    chooseMediaViewModel.pR2(list, false);
                                }
                                c528780KoW.LIZIZ.LIZJ();
                            }
                        });
                    }
                }
                C552700Lm0 c552700Lm03 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Incremental refresh skipped: ");
                sbLIZ2.append(str);
                C201955140j.LIZLLL(c552700Lm03, "IncrementalRefreshManager", C2188811AlT.LIZIZ(sbLIZ2));
                c528780KoW.LIZIZ.LIZIZ();
            }
            c528780KoW.LJ = jCurrentTimeMillis;
            c528780KoW.LJI = false;
            c528780KoW.LJII = false;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1330505Ip(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1330405Io(this, null), 3);
    }

    @Override // X.AbstractC528270Knh, com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void LLLLIIIILLL(boolean z) {
        super.LLLLIIIILLL(z);
        c();
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLLZIL(boolean z) {
        LLZIL(false);
    }

    public final void LLZIL(boolean z) {
        String str;
        this.LLLLLZ = z;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLLLLIL(z);
        }
        this.LLJZ = z;
        if (this.mActivity != null) {
            InterfaceC528880Kog interfaceC528880Kog = (InterfaceC528880Kog) this.LLLZ.getValue();
            if (z) {
                str = "enter_from_multi";
            } else {
                str = "enter_from_single";
            }
            interfaceC528880Kog.setEnterFrom(str);
        }
    }

    public final void LLZLL(int i) {
        String string;
        Scene scene;
        TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene;
        x2 x2VarLLLLLLZ;
        C1DRG c1drgLJIIIZ;
        Scene next;
        IAIPortraitLauncher iAIPortraitLauncherLIZ;
        boolean z = this.LLLZL;
        if (z && this.LLLZLL) {
            LLZLLIL();
            return;
        }
        if (this.LLLZLZ && !this.LLLZLL) {
            Context contextLIZIZ = C545820Lau.LIZIZ(this);
            if (contextLIZIZ == null) {
                return;
            }
            IAIPortraitFeatureService.LIZ.getClass();
            IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
            if (iAIPortraitFeatureServiceLIZ == null || (iAIPortraitLauncherLIZ = iAIPortraitFeatureServiceLIZ.LIZ()) == null) {
                return;
            }
            iAIPortraitLauncherLIZ.onClickPortraitFromProfileAsset(contextLIZIZ, new AIPortraitEnterParams(null, null, this.LLLIIIL, LLLZZ(), null, false, null, null));
            return;
        }
        if (z) {
            LLZLLIL();
            return;
        }
        Activity activity = this.mActivity;
        if (activity instanceof SAAActivity) {
            SAAActivity sAAActivity = (SAAActivity) activity;
            if (sAAActivity != null) {
                Iterator<Scene> it2 = sAAActivity.kI().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof TikTokCameraBaseGroupScene) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                scene = next;
            } else {
                scene = null;
            }
            if (!(scene instanceof TikTokCameraBaseGroupScene) || (tikTokCameraBaseGroupScene = (TikTokCameraBaseGroupScene) scene) == null || (x2VarLLLLLLZ = tikTokCameraBaseGroupScene.LLLLLLZ()) == null || (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(x2VarLLLLLLZ)) == null) {
                return;
            }
            h hVar = new h(c1drgLJIIIZ, C0MGA.ALBUM_AIME_IMAGE_TAB);
            hVar.LLJJJJLIIL = false;
            hVar.LLJJL = i;
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
            if (navigationSceneLIZ == null) {
                return;
            }
            navigationSceneLIZ.LLJI = false;
            navigationSceneLIZ.LLLLLLLLLL(hVar, null);
            C528780KoW c528780KoW = this.LLLLZIL;
            if (c528780KoW != null) {
                c528780KoW.LJII = true;
                C201955140j.LIZLLL(C552700Lm0.LIZIZ, "IncrementalRefreshManager", "Marked as returning from activity");
            }
            hVar.show();
            return;
        }
        if (activity == null) {
            return;
        }
        Bundle bundle = this.mArguments;
        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
            string = "";
        }
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("aime_tab_entry", "ALBUM_AIME_IMAGE_TAB", bundle2);
        bundle2.putInt("ai_self_is_from_album_ai_tab", i);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//aime/tab");
        smartRouteBuildRoute.withParam("enter_from", string);
        smartRouteBuildRoute.withParam(bundle2);
        smartRouteBuildRoute.open();
    }

    public final void f(C0LQY c0lqy) {
        AIGCEntranceInfo aIGCEntranceInfoLLLZZIL;
        InterfaceC528960Koo interfaceC528960KooJ9;
        int i = C528770KoV.LIZ[c0lqy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                aIGCEntranceInfoLLLZZIL = LLLZZ();
            }
        } else {
            aIGCEntranceInfoLLLZZIL = LLLZZIL();
        }
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null && (interfaceC528960KooJ9 = aITheaterProfileServiceLIZ.j9()) != null) {
            String str = this.LLLIIIL;
            if (str == null) {
                str = "";
            }
            interfaceC528960KooJ9.LIZJ(str, aIGCEntranceInfoLLLZZIL);
        }
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [X.0KoZ] */
    @Override // X.AbstractC528270Knh, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        super.onActivityCreated(bundle);
        C529740Kq4 c529740Kq4 = new C529740Kq4(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(getLifecycle()), C545820Lau.LIZIZ(this), this.LLJJIJIL, C524710Khx.LIZ(this.LLLIIII), 5, this.LLLI);
        this.LLJJJ = c529740Kq4;
        c529740Kq4.LLJLLIL = this.LLLLLJIL;
        c529740Kq4.LLLIIL = new C529670Kpx();
        c529740Kq4.LLLLIIIILLL = this.LLLLIILL;
        int i3 = this.LLLLIIL;
        if (i3 != -1) {
            c529740Kq4.LLLIL(i3, false);
        }
        C529740Kq4 c529740Kq42 = this.LLJJJ;
        c529740Kq42.LLJLILLLLZIIL = this.LLLLJI;
        c529740Kq42.LLLLLL(this.LLLIIII);
        C529740Kq4 c529740Kq43 = this.LLJJJ;
        c529740Kq43.LLJLL = this.LLLLLIL;
        c529740Kq43.LLJLLL = this.LLLLLILLIL;
        if (LLLLL()) {
            z = false;
        } else {
            z = this.LLJZ;
        }
        c529740Kq43.LLLLLLIL(z);
        C529740Kq4 c529740Kq44 = this.LLJJJ;
        c529740Kq44.LLJJIJI = true;
        c529740Kq44.LLJJ = this.LLLLLLLLLL;
        c529740Kq44.LLLLLLZZ(this.LLLILZJ);
        C525190Kij c525190Kij = this.LLLLJ;
        if (c525190Kij != null) {
            this.LLJJJ.LLLLLLLLLL(c525190Kij);
        }
        this.LLJJJ.LLJILLL = new InterfaceC529910KqL() { // from class: X.0Khe
            /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
            @Override // X.InterfaceC529910KqL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r15, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r16) {
                /*
                    Method dump skipped, instruction units count: 380
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C524520Khe.LIZ(android.view.View, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel):void");
            }
        };
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager((Context) null, this.LLJJIJIL);
        wrapGridLayoutManager.LLIZ = new C580770MqB(this, wrapGridLayoutManager, 5);
        this.LLJJJIL.setHasFixedSize(true);
        this.LLJJJIL.setItemViewCacheSize(this.LLJJIJIL);
        this.LLJJJIL.setItemAnimator(null);
        this.LLJJJIL.setLayoutManager(wrapGridLayoutManager);
        this.LLJJJIL.addItemDecoration(new C0OZZ(this.LLJJIJIL, this.LLLL, true));
        C529740Kq4 c529740Kq45 = this.LLJJJ;
        RecyclerView recyclerView = this.LLJJJIL;
        c529740Kq45.LLJL = recyclerView;
        recyclerView.setAdapter(c529740Kq45);
        C529740Kq4 c529740Kq46 = this.LLJJJ;
        c529740Kq46.LL = this.LLJLIL;
        c529740Kq46.LLLLLLL(this.LLLILZ);
        this.LLJJJ.LLILZ = LLLLJ();
        this.LLJJJ.LLLLLLLZIL(this.LLLIZZ, this.LLLJ);
        C529740Kq4 c529740Kq47 = this.LLJJJ;
        c529740Kq47.LLJJIII = this.LLLLIIIILLL;
        C523920Kgg c523920Kgg = this.LLLJL;
        if (c523920Kgg != null) {
            c529740Kq47.LLLLJI(c523920Kgg);
        }
        LLLLZLLIL(2003);
        if (this.LLJZ) {
            this.LLJJJ.LLLLLLLLL(this.LLL);
        }
        if (!this.LLLLLZL && LLZLLLL() && !C527910Kn7.LIZIZ() && !isEditorProReplace() && (i = this.LLLLJI) != 34 && i != 44 && !LLLLL() && (i2 = this.LLLLJI) != 57 && i2 != 60) {
            this.LLJJJ.LLLLLLIL(true);
            ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY = this.LLLLLLL;
            if (viewOnClickListenerC20639415pY != null) {
                C786410Ut5.H0(viewOnClickListenerC20639415pY, 8);
            }
            ((InterfaceC528880Kog) this.LLLZ.getValue()).setEnterFrom("enter_from_multi");
        }
        this.LLLLZIL = new C528780KoW(this.LLLLZLLLI, new InterfaceC528830Kob() { // from class: X.0KoZ
            @Override // X.InterfaceC528830Kob
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC528830Kob
            public final void LIZ() {
                this.LIZ.getClass();
                C201955140j.LIZLLL(C552700Lm0.LIZIZ, "ChooseAiContentFragment", "handleIncrementalRefreshTriggered: refresh completed");
            }

            @Override // X.InterfaceC528830Kob
            public final void LIZJ() {
                this.LIZ.getClass();
                C201955140j.LIZLLL(C552700Lm0.LIZIZ, "ChooseAiContentFragment", "handleIncrementalRefreshTriggered: refresh completed");
            }
        }, (ChooseMediaViewModel) C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1327705Hn(this, null), 3);
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLIL(List<? extends TikTokMediaModel> list, boolean z) {
        if (list == null) {
            return;
        }
        h(list, z, false);
    }

    public final boolean e(View view, MediaModel mediaModel) {
        boolean z;
        if (mediaModel == null || view == null) {
            return false;
        }
        if (mediaModel.LJIILJJIL()) {
            if (this.LLLLLZIL) {
                return false;
            }
            this.LLLLLZIL = true;
            if (this.LLLLJI != 15) {
                z = true;
            } else {
                z = false;
            }
            LLLZLZ(true, z, mediaModel, -1, new AwS252S0300000_8(this, (TikTokMediaModel) mediaModel, view, 10));
            return true;
        }
        InterfaceC528410Knv interfaceC528410Knv = this.LLLLLLLLLL;
        if (interfaceC528410Knv != null && (mediaModel instanceof TikTokMediaModel)) {
            interfaceC528410Knv.LJIIIIZZ((TikTokMediaModel) mediaModel, view);
            this.LLLLLZIL = false;
        }
        return true;
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLL(int i, int i2, int i3) {
        C0CNO.LIZ(C15O7.LJI, new AwS12S0101100_8(System.currentTimeMillis(), this, i, 2));
    }

    public final void h(List<? extends TikTokMediaModel> list, boolean z, boolean z2) {
        boolean z3;
        InterfaceC522120Kdm interfaceC522120Kdm;
        C05YD<Boolean> c05ydLJIILJJIL;
        InterfaceC522120Kdm interfaceC522120Kdm2;
        Pair pair;
        List<InterfaceC529800KqA> list2;
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshDataList visible:");
        sbLIZ.append(this.LLLFFI);
        sbLIZ.append(",size=");
        sbLIZ.append(list.size());
        sbLIZ.append(",forceRefresh=");
        sbLIZ.append(z2);
        C201955140j.LIZLLL(c552700Lm0, "ChooseAiContentFragment", C2188811AlT.LIZIZ(sbLIZ));
        LLLLIL(2003);
        if (!this.LLLFFI) {
            this.LLLLZI = true;
            return;
        }
        if (!z2 && this.LLJJJ.LLJLIL.size() >= 15 && (!list.isEmpty())) {
            this.LLLLZI = true;
            return;
        }
        this.LLLLZI = false;
        if (list.isEmpty() && ((list2 = this.LLLILZ) == null || list2.isEmpty())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!Intrinsics.LJFF(this.LLLLLLZ, Boolean.valueOf(z3))) {
            this.LLLLLLZ = Boolean.valueOf(z3);
            AwS587S0100000_8 awS587S0100000_8 = this.LLLLLLLZIL;
            if (awS587S0100000_8 != null) {
                awS587S0100000_8.invoke(Boolean.valueOf(z3));
            }
        }
        if (z3) {
            ViewStub viewStub = this.LLLLLLLLL;
            if (viewStub != null) {
                if (LLZ()) {
                    pair = new Pair(Integer.valueOf(R.layout.ia7), new C549940LhY(this));
                } else {
                    pair = new Pair(Integer.valueOf(R.layout.ia8), new C528750KoT(this));
                }
                int iIntValue = ((Number) pair.getFirst()).intValue();
                InterfaceC2217451BqZ interfaceC2217451BqZ = (InterfaceC2217451BqZ) pair.getSecond();
                viewStub.setLayoutResource(iIntValue);
                ((Function0) interfaceC2217451BqZ).invoke();
            }
            View view = this.LLLLLLJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            if (this.LLLZLZ) {
                f(C0LQY.AI_PORTRAIT);
            } else if (this.LLLZL) {
                g();
            }
            if (this.LLLI) {
                C524780Ki4.LIZ.end(OpenAlbumPanelPerformanceMonitor.INSTANCE, "imageLoaded");
                this.LLLI = false;
            }
            if (((Number) this.LLLLZLLIL.getValue()).longValue() > 0 && (interfaceC522120Kdm = this.LLLLLLZZ) != null && (c05ydLJIILJJIL = interfaceC522120Kdm.LJIILJJIL()) != null && !c05ydLJIILJJIL.getValue().booleanValue() && (interfaceC522120Kdm2 = this.LLLLLLZZ) != null) {
                interfaceC522120Kdm2.LJJII(false);
            }
        } else {
            View view2 = this.LLLLLLJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            InterfaceC522120Kdm interfaceC522120Kdm3 = this.LLLLLLZZ;
            if (interfaceC522120Kdm3 != null) {
                interfaceC522120Kdm3.LJJII(true);
            }
        }
        if (z) {
            this.LLJJJ.setData(list);
        } else {
            this.LLJJJ.LLLLLLZ(list);
        }
        C528780KoW c528780KoW = this.LLLLZIL;
        if (c528780KoW != null && !c528780KoW.LIZLLL) {
            c528780KoW.LIZLLL = true;
            C201955140j.LIZLLL(c552700Lm0, "IncrementalRefreshManager", "Initial data loading completed");
        }
        this.LLLLZLL.setValue(Boolean.TRUE);
        C201955140j.LIZLLL(c552700Lm0, "ChooseAiContentFragment", "Data loaded: updating initialDataLoadedFlow to true");
        if (LLZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1330705Ir(this, list, null), 3);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1330605Iq(this, null), 3);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        char c;
        int i = 0;
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.mi, viewGroup, false);
        this.LLJJJJJIL = viewGroup2;
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.j5o);
        this.LLJJJIL = recyclerView;
        recyclerView.setRecycledViewPool(C535480KzK.LIZ(this));
        this.LLJJLIIIJLLLLLLLZ = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_loading);
        this.LLLLLLLLL = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_empty_content);
        if (this.LLLLLZ && !this.LLJZ) {
            c = 0;
        } else {
            c = '\b';
        }
        if (!LLZLLLL() && c == 0) {
            ViewStub viewStub = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_multi_select_view);
            if (viewStub != null) {
                C786410Ut5.LJLLLL(viewStub);
            }
            ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY = (ViewOnClickListenerC20639415pY) this.LLJJJJJIL.findViewById(R.id.opn);
            this.LLLLLLL = viewOnClickListenerC20639415pY;
            if (viewOnClickListenerC20639415pY != null) {
                if (!this.LLLLLZ || this.LLJZ) {
                    i = 8;
                }
                C786410Ut5.H0(viewOnClickListenerC20639415pY, i);
            }
            ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY2 = this.LLLLLLL;
            if (viewOnClickListenerC20639415pY2 != null) {
                viewOnClickListenerC20639415pY2.setOnModeChangeListener(new InterfaceC20639515pZ() { // from class: X.0Ko5
                    @Override // X.InterfaceC20639515pZ
                    public final void LIZ(boolean z) {
                        this.LIZ.LLJJJ.LLLLLLIL(z);
                        if (z) {
                            ((InterfaceC528880Kog) this.LIZ.LLLZ.getValue()).setEnterFrom("enter_from_multi");
                        } else {
                            ((InterfaceC528880Kog) this.LIZ.LLLZ.getValue()).setEnterFrom("enter_from_single");
                        }
                    }
                });
            }
        }
        RecyclerView recyclerView2 = this.LLJJJIL;
        if (recyclerView2 instanceof C540760LIs) {
            ((C540760LIs) recyclerView2).setFastScrollEnabled(true);
            ((C540760LIs) this.LLJJJIL).setFastScrollListener(this.LLLLLJLJLL);
        }
        RecyclerView recyclerView3 = this.LLJJJIL;
        if ((recyclerView3 instanceof C540760LIs) && recyclerView3 != null) {
            recyclerView3.addOnScrollListener(new AsS35S0100000_8(this, 1));
        }
        return this.LLJJJJJIL;
    }

    public final void LLLZLZ(boolean z, boolean z2, MediaModel mediaModel, int i, Function0<Unit> function0) {
        String str;
        long j;
        boolean z3;
        if (z) {
            str = "preview";
            j = 0;
        } else {
            str = "select";
            j = this.LLLLZ;
        }
        InterfaceC528880Kog interfaceC528880Kog = (InterfaceC528880Kog) this.LLLZ.getValue();
        long j2 = i;
        if (this.LLLLJI != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        interfaceC528880Kog.LIZ(mediaModel, z2, j, j2, z3, false, false, new AwS48S1300000_8(mediaModel, (MediaModel) this, (C528760KoU) str, (String) function0, (Function0<Unit>) 3), new AwS19S1201000_8(mediaModel, this, str, i, 3));
    }

    public static final void d(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
            c543670LTx.LIZ.put("scene_name", str2);
            c543670LTx.LIZ.put("errorCode", Integer.valueOf(i2));
            c543670LTx.LIZ.put("type", str);
            c543670LTx.LIZ.put("width", Integer.valueOf(mediaModel.width));
            c543670LTx.LIZ.put("height", Integer.valueOf(mediaModel.height));
            C1637890six.LIZJ("aweme_video_import_duration", jSONObject, c543670LTx.LJ());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
