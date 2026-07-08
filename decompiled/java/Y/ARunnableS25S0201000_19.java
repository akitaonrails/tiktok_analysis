package Y;

import X.C01GW;
import X.C1020810cff;
import X.C10EU;
import X.C123100dR;
import X.C1245020iVI;
import X.C1249160iby;
import X.C1249170ibz;
import X.C1253930ijf;
import X.C1253970ijj;
import X.C1259870itF;
import X.C1260910iuv;
import X.C1264790j1B;
import X.C1264800j1C;
import X.C1264890j1L;
import X.C1264940j1Q;
import X.C1265680j2c;
import X.C1265690j2d;
import X.C128Y;
import X.C1584506Ih;
import X.C1C7U;
import X.C2188811AlT;
import X.C736460Sui;
import X.C786410Ut5;
import X.EnumC1247200iYo;
import X.EnumC1260930iux;
import X.InterfaceC1206550hVF;
import X.InterfaceC1264300j0O;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationInputAnswerAssem;
import com.ss.android.ugc.aweme.profile.model.AwemeUnreadInfo;
import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.FollowerListAssem;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.FollowingListAssem;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS25S0201000_19 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        boolean z;
        boolean zLIZ;
        User user = ((FollowerListAssem) this.l0).getUser();
        C1264790j1B c1264790j1B = new C1264790j1B();
        String strInvoke = ((FollowerListAssem) this.l0).No().LLILZIL.invoke();
        if (strInvoke == null) {
            strInvoke = "";
        }
        c1264790j1B.LIZLLL = strInvoke;
        String requestId = ((User) this.l1).getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        c1264790j1B.LJIJ = requestId;
        String uid = ((User) this.l1).getUid();
        c1264790j1B.LJIJI = uid != null ? uid : "";
        c1264790j1B.LJIIZILJ = this.i2;
        boolean z2 = ((User) this.l1).getMatchedFriendStruct() != null;
        String str = CardStruct.IStatusCode.DEFAULT;
        c1264790j1B.LJIJJ = z2 ? "1" : CardStruct.IStatusCode.DEFAULT;
        C01GW c01gw = C1245020iVI.LIZ;
        c1264790j1B.LJIJJLI = C1245020iVI.LIZIZ((User) this.l1) ? "1" : CardStruct.IStatusCode.DEFAULT;
        if (user != null) {
            ((FollowerListAssem) this.l0).getClass();
            if (C1265690j2d.LIZJ.getValue().booleanValue() || C1265680j2c.LIZIZ()) {
                z = (user.getFollowerCount() < 1000) & (!user.isAccuratePrivateAccount());
                String str2 = C1249160iby.LIZIZ;
                zLIZ = C1249170ibz.LIZ().LIZ();
            } else {
                z = (user.getFollowerCount() < 1000) & (!user.isAccuratePrivateAccount()) & (user.getFriendCount() <= 60);
                String str3 = C1249160iby.LIZIZ;
                zLIZ = C1249170ibz.LIZ().LIZ();
            }
            if ((user.getNewFollowerCount() > 0) & z & zLIZ) {
                SocialDataStruct socialData = ((User) this.l1).getSocialData();
                if (socialData != null && socialData.isNewFollower()) {
                    str = "1";
                }
                c1264790j1B.LJIILLIIL = str;
            }
        }
        if (Intrinsics.LJFF(((LinkedHashMap) ((FollowerListAssem) this.l0).Jo().LLIZ).get(((User) this.l1).getUid()), Boolean.TRUE)) {
            c1264790j1B.LJIILLIIL = "1";
        }
        c1264790j1B.LJIILJJIL();
        if (((User) this.l1).getMatchedFriendStruct() != null) {
            FollowerListAssem followerListAssem = (FollowerListAssem) this.l0;
            User user2 = (User) this.l1;
            int i = this.i2;
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            c1260910iuv.LJJIJLIJ(followerListAssem.No().LLILZIL.invoke());
            c1260910iuv.LJJJJJ(followerListAssem.No().LLILZLL.invoke());
            c1260910iuv.LJJLIIIJILLIZJL = C1264800j1C.LIZJ();
            c1260910iuv.LJJJJLL();
            c1260910iuv.LJJLIIIJJI = EnumC1260930iux.SHOW;
            c1260910iuv.LJJJJZI(user2);
            c1260910iuv.LJJJJLI(user2.getRequestId());
            c1260910iuv.LJIILJJIL();
            String str4 = null;
            new C1253970ijj(followerListAssem.No().LLILZIL.invoke(), user2, str4, followerListAssem.No().LLILZLL.invoke(), str4, Integer.valueOf(i), 84).LIZLLL(null);
        }
        InterfaceC1264300j0O interfaceC1264300j0O = (InterfaceC1264300j0O) ((FollowerListAssem) this.l0).LLJILJILJ.getValue();
        if (interfaceC1264300j0O != null) {
            interfaceC1264300j0O.kz();
        }
    }

    public final void LIZ$1() {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        List<String> list;
        Integer numValueOf;
        C1264890j1L c1264890j1L = new C1264890j1L();
        String mobString = EnumC1247200iYo.FOLLOWING.getMobString();
        if (mobString == null) {
            mobString = "";
        }
        c1264890j1L.LIZLLL = mobString;
        c1264890j1L.LJIILLIIL = this.i2;
        String requestId = ((User) this.l0).getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        c1264890j1L.LJIIZILJ = requestId;
        String uid = ((User) this.l0).getUid();
        if (uid == null) {
            uid = "";
        }
        c1264890j1L.LJIJ = uid;
        c1264890j1L.LJIJI = ((User) this.l0).getMatchedFriendStruct() != null ? "1" : CardStruct.IStatusCode.DEFAULT;
        C01GW c01gw = C1245020iVI.LIZ;
        c1264890j1L.LJIJJ = C1245020iVI.LIZIZ((User) this.l0) ? "1" : CardStruct.IStatusCode.DEFAULT;
        AwemeUnreadInfo awemeUnreadInfo = ((User) this.l0).getAwemeUnreadInfo();
        String str = null;
        c1264890j1L.LJIJJLI = String.valueOf((awemeUnreadInfo == null || (list = awemeUnreadInfo.unreadIdList) == null || (numValueOf = Integer.valueOf(list.size())) == null) ? 0 : numValueOf.intValue());
        c1264890j1L.LJIILJJIL();
        if (((User) this.l0).getMatchedFriendStruct() != null) {
            FollowingListAssem followingListAssem = (FollowingListAssem) this.l1;
            User user = (User) this.l0;
            int i = this.i2;
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            c1260910iuv.LJJIJLIJ(followingListAssem.So().invoke());
            c1260910iuv.LJJJJJ(followingListAssem.Vo().invoke());
            c1260910iuv.LJJLIIIJILLIZJL = C1264800j1C.LIZJ();
            c1260910iuv.LJJJJLL();
            c1260910iuv.LJJLIIIJJI = EnumC1260930iux.SHOW;
            c1260910iuv.LJJJJZI(user);
            c1260910iuv.LJJJJLI(user.getRequestId());
            c1260910iuv.LJIILJJIL();
            new C1253970ijj(followingListAssem.So().invoke(), user, str, followingListAssem.Vo().invoke(), str, Integer.valueOf(i), 84).LIZLLL(null);
        }
        if (!C123100dR.LIZ(C1264940j1Q.LIZ((User) this.l0))) {
            if (C123100dR.LIZ(C1264940j1Q.LIZIZ((User) this.l0))) {
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                User user2 = (User) this.l0;
                String strInvoke = ((FollowingListAssem) this.l1).So().invoke();
                String strInvoke2 = ((FollowingListAssem) this.l1).Vo().invoke();
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = ((FollowingListAssem) this.l1).Go();
                int i2 = this.i2;
                c1253930ijf.getClass();
                IEcommerceStoreBizLogService iEcommerceStoreBizLogService = (IEcommerceStoreBizLogService) PluggableExtentionKt.pluggableSpi$default(IEcommerceStoreBizLogService.class, false, false, false, 14, null);
                if (iEcommerceStoreBizLogService != null) {
                    boolean zLIZJ = C736460Sui.LIZJ(user2);
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("c7945.d4673_i");
                    sbLIZ.append(i2);
                    sbLIZ.append("_w6893");
                    iEcommerceStoreBizLogService.LIZIZ(user2, zLIZJ, strInvoke, strInvoke2, BtmSDK.createReportParams$default(btmSDK, C2188811AlT.LIZIZ(sbLIZ), PageFinder.via((View) viewOnAttachStateChangeListenerC20604515jvGo), null, 4, null));
                    return;
                }
                return;
            }
            return;
        }
        C1253930ijf c1253930ijf2 = C1253930ijf.LIZ;
        User user3 = (User) this.l0;
        String strInvoke3 = ((FollowingListAssem) this.l1).So().invoke();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo2 = ((FollowingListAssem) this.l1).Go();
        int i3 = this.i2;
        c1253930ijf2.getClass();
        IEcommerceStoreBizLogService iEcommerceStoreBizLogService2 = (IEcommerceStoreBizLogService) PluggableExtentionKt.pluggableSpi$default(IEcommerceStoreBizLogService.class, false, false, false, 14, null);
        if (iEcommerceStoreBizLogService2 != null) {
            try {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(C1264940j1Q.LIZ(user3)), "sellerId");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            Integer numValueOf2 = Integer.valueOf(C736460Sui.LIZJ(user3) ? 1 : 0);
            BtmSDK btmSDK2 = BtmSDK.INSTANCE;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("c7945.d4673_i");
            sbLIZ2.append(i3);
            sbLIZ2.append("_w6893");
            iEcommerceStoreBizLogService2.LIZ(user3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "follow", numValueOf2, strInvoke3, null, null, null, null, null, "visit_shop", BtmSDK.createReportParams$default(btmSDK2, C2188811AlT.LIZIZ(sbLIZ2), PageFinder.via((View) viewOnAttachStateChangeListenerC20604515jvGo2), null, 4, null));
        }
    }

    public final void LIZ$2() {
        if (!((TakoAiVideoDetailPageFragment) this.l0).isAdded()) {
            VerticalViewPager verticalViewPager = (VerticalViewPager) this.l1;
            if (verticalViewPager != null) {
                verticalViewPager.setPopulateType(0);
                return;
            }
            return;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = ((TakoAiVideoDetailPageFragment) this.l0).LLJLIL;
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.LLFFF(this.i2 + 1, false);
        }
        View view = ((TakoAiVideoDetailPageFragment) this.l0).getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS88S0200000_19((TakoAiVideoDetailPageFragment) this.l0, (VerticalViewPager) this.l1, 2));
        }
    }

    public final void LIZ$3() {
        C1584506Ih.LIZIZ((TuxTextView) this.l0);
        ViewGroup.LayoutParams layoutParams = ((TuxTextView) this.l0).getLayoutParams();
        layoutParams.height = ((GroupInvitationInputAnswerAssem) this.l1).LLJIJIL;
        C786410Ut5.R6((TuxTextView) this.l0, layoutParams);
        View view = (View) ((GroupInvitationInputAnswerAssem) this.l1).LLJILJILJ.getValue();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS30S0101000_19(this.i2, (GroupInvitationInputAnswerAssem) this.l1, 1));
        }
    }

    public final void LIZ$4() {
        User user;
        User user2;
        int i = this.i2;
        if (i != 0 && i != 1 && i != 3 && i != 6) {
            if (i != 16 && i != 21) {
                if (i != 24 && i != 18) {
                    if (i != 19) {
                        return;
                    }
                }
            }
            if (!(((Fragment) this.l0) instanceof InterfaceC1206550hVF) || ((UserAwemePagerAssemV2) this.l1).getUser() == null) {
                return;
            }
            ((InterfaceC1206550hVF) ((Fragment) this.l0)).Ii(false);
            return;
        }
        C128Y c128y = (Fragment) this.l0;
        if (c128y instanceof InterfaceC1206550hVF) {
            if (((InterfaceC1206550hVF) c128y).LJLLL() || ((user2 = ((UserAwemePagerAssemV2) this.l1).getUser()) != null && user2.isBlock)) {
                ((InterfaceC1206550hVF) ((Fragment) this.l0)).b(((UserAwemePagerAssemV2) this.l1).getUser() == null ? ((UserAwemePagerAssemV2) this.l1).LLLLLILLIL : C10EU.LJIILL(((UserAwemePagerAssemV2) this.l1).getUser(), false));
                ((InterfaceC1206550hVF) ((Fragment) this.l0)).Ii(false);
                Fragment fragment = (Fragment) this.l0;
                if (fragment instanceof ProfileListFragment) {
                    ((ProfileListFragment) fragment).ro((((UserAwemePagerAssemV2) this.l1).getUser() == null || (user = ((UserAwemePagerAssemV2) this.l1).getUser()) == null || !user.isBlocked()) ? false : true);
                }
            }
        }
    }

    public final void LIZ$5() {
        RecyclerView recyclerView = ((ProfileBaseAwemeListFragment) this.l0).LLJJJIL;
        if (recyclerView == null) {
            return;
        }
        C1020810cff c1020810cff = C1020810cff.LIZ;
        Rect rect = (Rect) this.l1;
        c1020810cff.getClass();
        int iLIZ = C1020810cff.LIZ(recyclerView, rect);
        int i = this.i2;
        if (i > 0) {
            ProfileBaseAwemeListFragment profileBaseAwemeListFragment = (ProfileBaseAwemeListFragment) this.l0;
            if (iLIZ > profileBaseAwemeListFragment.LLJLLIL) {
                profileBaseAwemeListFragment.LLJLLIL = iLIZ;
                profileBaseAwemeListFragment.LLJLLL = iLIZ;
                return;
            }
            return;
        }
        if (i < 0) {
            ProfileBaseAwemeListFragment profileBaseAwemeListFragment2 = (ProfileBaseAwemeListFragment) this.l0;
            if (iLIZ < profileBaseAwemeListFragment2.LLJLLL) {
                profileBaseAwemeListFragment2.LLJLLL = iLIZ;
            }
            int i2 = profileBaseAwemeListFragment2.LLJLLIL - profileBaseAwemeListFragment2.LLJLLL;
            if (i2 > profileBaseAwemeListFragment2.LLJZ) {
                profileBaseAwemeListFragment2.LLJZ = i2;
                boolean z = profileBaseAwemeListFragment2.LLJJI;
                String strLIZ = C1259870itF.LIZ(profileBaseAwemeListFragment2.LLJILLL);
                ProfileBaseAwemeListFragment profileBaseAwemeListFragment3 = (ProfileBaseAwemeListFragment) this.l0;
                C1020810cff.LJI.submit(new ARunnableS0S2011000_16(z, strLIZ, profileBaseAwemeListFragment3.LLJZ, profileBaseAwemeListFragment3.LLIZ, 0));
            }
        }
    }

    public static final void run$0(ARunnableS25S0201000_19 aRunnableS25S0201000_19) {
        boolean zLIZ;
        C1C7U.LIZ("FollowerListAssem@b3da.handleOnExposure$1$1");
        try {
            aRunnableS25S0201000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FollowerListAssem@b3da.handleOnExposure$1$1");
    }

    public static final void run$1(ARunnableS25S0201000_19 aRunnableS25S0201000_19) {
        boolean zLIZ;
        C1C7U.LIZ("FollowingListAssem@58e.itemExposure$1$1");
        try {
            aRunnableS25S0201000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FollowingListAssem@58e.itemExposure$1$1");
    }

    public static final void run$2(ARunnableS25S0201000_19 aRunnableS25S0201000_19) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAiVideoDetailPageFragment@9183.handlePushFeedsInsertData$1$1$2");
        try {
            aRunnableS25S0201000_19.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAiVideoDetailPageFragment@9183.handlePushFeedsInsertData$1$1$2");
    }

    public static final void run$3(ARunnableS25S0201000_19 aRunnableS25S0201000_19) {
        boolean zLIZ;
        C1C7U.LIZ("GroupInvitationInputAnswerAssem@dec4.keyBoardListener$2$1$onKeyboardChanged$1$1");
        try {
            aRunnableS25S0201000_19.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupInvitationInputAnswerAssem@dec4.keyBoardListener$2$1$onKeyboardChanged$1$1");
    }

    public static final void run$4(ARunnableS25S0201000_19 aRunnableS25S0201000_19) {
        boolean zLIZ;
        C1C7U.LIZ("UserAwemePagerAssemV2@ac6e.setLazyLoadDataV2$runnable$1");
        try {
            aRunnableS25S0201000_19.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UserAwemePagerAssemV2@ac6e.setLazyLoadDataV2$runnable$1");
    }

    public static final void run$5(ARunnableS25S0201000_19 aRunnableS25S0201000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBaseAwemeListFragment@d2b.addScrollListener$1$onScrolled$1");
        try {
            aRunnableS25S0201000_19.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBaseAwemeListFragment@d2b.addScrollListener$1$onScrolled$1");
    }

    public ARunnableS25S0201000_19(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
