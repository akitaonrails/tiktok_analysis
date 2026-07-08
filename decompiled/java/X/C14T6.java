package X;

import Y.ARunnableS130S0100000_30;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.tako.model.FeedEnterAwemeInfo;
import com.ss.android.ugc.aweme.tako.router.ITakoRouterService;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS574S0100000_30;
import org.json.JSONException;

/* JADX INFO: renamed from: X.14T6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14T6 implements InterfaceC1570900qyu {
    public InterfaceC1617760sCU LL;
    public TuxIconView LLILLJJLI;
    public final String LLILLL = EnumC1584350rKb.TAKO.getTag();
    public boolean LLILZ;

    @Override // X.InterfaceC1570900qyu
    public final void LIZ() {
        LIZIZ(false);
    }

    @Override // X.InterfaceC1570900qyu
    public final void S1(boolean z) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void T1() {
        LIZIZ(true);
    }

    @Override // X.InterfaceC1570900qyu
    public final void X1(int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Z1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void a2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean b2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean c2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final void e2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean enabled() {
        return true;
    }

    @Override // X.InterfaceC1570900qyu
    public final void g2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onCreate() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onPause() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onResume() {
    }

    public final void LIZJ() {
        C20684815ws.LJFF().execute(new ARunnableS130S0100000_30(this, 23));
    }

    @Override // X.InterfaceC1570900qyu
    public final String getTag() {
        return this.LLILLL;
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLILLJJLI;
            if (tuxIconView != null) {
                tuxIconView.setImageResource(C1857680yRS.LIZ.LIZIZ(true));
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLILLJJLI;
        if (tuxIconView2 == null) {
            return;
        }
        tuxIconView2.setImageResource(C1857680yRS.LIZ.LIZIZ(false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.14TF] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.ss.android.ugc.aweme.tako.router.ITakoRouterService] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1570900qyu
    public final void U1(View view) throws JSONException {
        Aweme aweme;
        Fragment currentFragment;
        String strF3;
        Context context;
        Context context2;
        boolean z;
        String aid;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        InterfaceC739770T0d interfaceC739770T0dP2;
        Context context3;
        String aid2;
        String aid3;
        String string;
        int iXt0;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C0SZ8 c0sz8LJLIL;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        IPhotoSlidesAbility iPhotoSlidesAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLJ2;
        IViewPagerComponentAbility iViewPagerComponentAbility2;
        C0SZ8 c0sz8LJLIL2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ2;
        IPhotoSlidesAbility iPhotoSlidesAbility2;
        C19EG activity;
        InterfaceC1617760sCU interfaceC1617760sCU = this.LL;
        Object objValueOf = null;
        if (interfaceC1617760sCU != null && (activity = interfaceC1617760sCU.getActivity()) != null) {
            aweme = C680080Qly.LIZIZ(activity).LLJILJILJ;
        } else {
            aweme = null;
        }
        InterfaceC1617760sCU interfaceC1617760sCU2 = this.LL;
        if (interfaceC1617760sCU2 != null) {
            currentFragment = interfaceC1617760sCU2.getCurrentFragment();
        } else {
            currentFragment = null;
        }
        if (aweme != null) {
            C14TF c14tf = C14TF.LIZIZ;
            if (c14tf.LJIJJ(aweme)) {
                c14tf.LJLLJ(C1483410ohn.LJLJJI().getCurrentPosition(), aweme.getAid());
            } else if (c14tf.LJLIIL(aweme)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setVideoPlayTime index = ");
                int iXt02 = -1;
                if (currentFragment != null && (interfaceC665370Q7zLJ2 = C1578630rBN.LJ(currentFragment)) != null && (iViewPagerComponentAbility2 = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ2, IViewPagerComponentAbility.class, null)) != null && (c0sz8LJLIL2 = iViewPagerComponentAbility2.LJLIL()) != null && (interfaceC665370Q7zLIZ2 = C0T0K.LIZ(c0sz8LJLIL2)) != null && (iPhotoSlidesAbility2 = (IPhotoSlidesAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ2, IPhotoSlidesAbility.class, null)) != null) {
                    iXt0 = iPhotoSlidesAbility2.xt0();
                } else {
                    iXt0 = -1;
                }
                sbLIZ.append(iXt0);
                C2188811AlT.LIZIZ(sbLIZ);
                String aid4 = aweme.getAid();
                if (currentFragment != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(currentFragment)) != null && (iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null)) != null && (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) != null && (interfaceC665370Q7zLIZ = C0T0K.LIZ(c0sz8LJLIL)) != null && (iPhotoSlidesAbility = (IPhotoSlidesAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IPhotoSlidesAbility.class, null)) != null) {
                    iXt02 = iPhotoSlidesAbility.xt0();
                }
                c14tf.LJJIJL(iXt02, aid4);
            }
        }
        ?? r0 = C14TF.LIZIZ;
        InterfaceC1617760sCU interfaceC1617760sCU3 = this.LL;
        if (interfaceC1617760sCU3 == null || (strF3 = interfaceC1617760sCU3.f3()) == null) {
            strF3 = "homepage_hot";
        }
        String strLJIJJLI = r0.LJIJJLI(strF3);
        if (C07CQ.LIZ()) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            if (aweme != null) {
                aid2 = aweme.getAid();
            } else {
                aid2 = null;
            }
            if (aweme != null) {
                aid3 = aweme.getAid();
                string = Integer.valueOf(aweme.getAwemeType()).toString();
            } else {
                aid3 = null;
                string = null;
            }
            c1862330yYx.mobTikbotEntranceClick(strLJIJJLI, "icon", aid2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new FeedEnterAwemeInfo(aid3, string, null, null), null, null, null, null, null, null, null);
        }
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (r0.LJIIIIZZ(context, null, strLJIJJLI, "click_icon")) {
            if (view != null) {
                objValueOf = view.getContext();
            }
            r0.LJZI(objValueOf, null, strLJIJJLI, "click_icon", false, null, "full_screen", null);
        } else {
            ?? r6 = (ITakoRouterService) PluggableExtentionKt.pluggableSpi$default(ITakoRouterService.class, false, false, false, 14, null);
            if (r6 != 0) {
                if (view != null) {
                    context2 = view.getContext();
                } else {
                    context2 = null;
                }
                if (aweme != null && (aid = aweme.getAid()) != null && aid.length() > 0 && currentFragment != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(currentFragment)) != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ.x32()) != null && (interfaceC739770T0dP2 = iPlayerComponentAbilityX32.P2()) != null) {
                    objValueOf = Long.valueOf(interfaceC739770T0dP2.LJLJJI(aid));
                }
                EnumC1864410ycJ enumC1864410ycJ = EnumC1864410ycJ.FULL_SCREEN;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is_feed", "1");
                z = true;
                r6.LIZIZ(context2, aweme, null, "click_icon", objValueOf, null, null, enumC1864410ycJ, null, null, linkedHashMap, null, strLJIJJLI);
            }
            r0.LJI().LIZ(z);
            if (!C1110804Wc.LIZ() && view != null && (context3 = view.getContext()) != null) {
                new C0ZDN(context3).LIZ(0);
                return;
            }
            return;
        }
        z = true;
        r0.LJI().LIZ(z);
        if (!C1110804Wc.LIZ()) {
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final void V1(InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LL = interfaceC1617760sCU;
        C0S78.LIZJ(new AwS574S0100000_30(this, 294), true);
    }

    @Override // X.InterfaceC1570900qyu
    public final void d2(Integer num) {
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            C1593860rZw.LIZ(tuxIconView, num, true);
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final View f2(Context context) {
        C19EG activity;
        View inflatedTakoIcon;
        TuxIconView tuxIconView;
        InterfaceC1617760sCU interfaceC1617760sCU = this.LL;
        if (interfaceC1617760sCU == null || (activity = interfaceC1617760sCU.getActivity()) == null) {
            return null;
        }
        HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) PluggableExtentionKt.pluggableSpi$default(HomePageUIFrameService.class, false, false, false, 14, null);
        if (homePageUIFrameService != null) {
            inflatedTakoIcon = homePageUIFrameService.getInflatedTakoIcon(activity);
        } else {
            inflatedTakoIcon = null;
        }
        if (inflatedTakoIcon instanceof TuxIconView) {
            tuxIconView = (TuxIconView) inflatedTakoIcon;
            if (tuxIconView != null) {
                C427690Gpr.LJI(tuxIconView, null);
                tuxIconView.LIZJ(true);
            }
        } else {
            tuxIconView = null;
        }
        this.LLILLJJLI = tuxIconView;
        return tuxIconView;
    }

    @Override // X.InterfaceC1570900qyu
    public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LL = interfaceC1617760sCU;
    }
}
