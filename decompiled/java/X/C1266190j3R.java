package X;

import Y.AObjectS101S0101000_19;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.panel.EffectDiscoverPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.newfollowerpage.InboxNewFollowerTabFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266190j3R implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrolled$0(C1266190j3R c1266190j3R, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C1266190j3R c1266190j3R, int i, float f, int i2) {
    }

    public static final void onPageScrolled$3(C1266190j3R c1266190j3R, int i, float f, int i2) {
    }

    public static final void onPageScrolled$4(C1266190j3R c1266190j3R, int i, float f, int i2) {
    }

    public static final void onPageSelected$6(C1266190j3R c1266190j3R, int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
            case 3:
                onPageScrollStateChanged$3(this, i);
                break;
            case 4:
                onPageScrollStateChanged$4(this, i);
                break;
            case 5:
                onPageScrollStateChanged$5(this, i);
                break;
            case 6:
                onPageScrollStateChanged$6(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                break;
            case 3:
                onPageScrolled$3(this, i, f, i2);
                break;
            case 4:
                onPageScrolled$4(this, i, f, i2);
                break;
            case 5:
                onPageScrolled$5(this, i, f, i2);
                break;
            case 6:
                onPageScrolled$6(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
            case 3:
                onPageSelected$3(this, i);
                break;
            case 4:
                onPageSelected$4(this, i);
                break;
            case 5:
                onPageSelected$5(this, i);
                break;
            case 6:
                onPageSelected$6(this, i);
                break;
        }
    }

    public C1266190j3R(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C1266190j3R c1266190j3R, int i) {
        String str;
        String str2;
        if (i == 2) {
            PhoneEmailLoginFragment phoneEmailLoginFragment = (PhoneEmailLoginFragment) c1266190j3R.l0;
            if (!phoneEmailLoginFragment.LLLJL) {
                phoneEmailLoginFragment.LLLJL = true;
                return;
            }
            if (phoneEmailLoginFragment.NS().getCurrentItem() == ((PhoneEmailLoginFragment) c1266190j3R.l0).LLLJIL) {
                return;
            }
            C0XGR c0xgr = new C0XGR();
            if (((PhoneEmailLoginFragment) c1266190j3R.l0).NS().getCurrentItem() == 0) {
                str = "switch_to_phone";
            } else {
                C0C64.LJIILLIIL().LJIIIZ(31744, "enable_org_login_optimize", true, true);
                str = "switch_to_email";
            }
            c0xgr.LIZLLL("enter_method", ((PhoneEmailLoginFragment) c1266190j3R.l0).getEnterMethod());
            c0xgr.LIZLLL("enter_from", ((PhoneEmailLoginFragment) c1266190j3R.l0).getEnterFrom());
            c0xgr.LIZLLL("enter_type", ((PhoneEmailLoginFragment) c1266190j3R.l0).LLJIJIL);
            c0xgr.LIZLLL("login_panel_type", ((PhoneEmailLoginFragment) c1266190j3R.l0).PR());
            if (((PhoneEmailLoginFragment) c1266190j3R.l0).LLLL) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0xgr.LIZLLL("is_first_show", str2);
            C20684815ws.LJIILLIIL(str, c0xgr.LIZ);
            ((PhoneEmailLoginFragment) c1266190j3R.l0).LLLL = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SELECT ");
            sbLIZ.append(((PhoneEmailLoginFragment) c1266190j3R.l0).NS().getCurrentItem());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void onPageScrollStateChanged$1(C1266190j3R c1266190j3R, int i) {
        String str;
        String str2;
        if (i == 2) {
            PhoneEmailSignUpFragment phoneEmailSignUpFragment = (PhoneEmailSignUpFragment) c1266190j3R.l0;
            if (!phoneEmailSignUpFragment.LLLJIL) {
                phoneEmailSignUpFragment.LLLJIL = true;
                return;
            }
            int currentItem = phoneEmailSignUpFragment.NS().getCurrentItem();
            PhoneEmailSignUpFragment phoneEmailSignUpFragment2 = (PhoneEmailSignUpFragment) c1266190j3R.l0;
            if (currentItem == phoneEmailSignUpFragment2.LLLJ) {
                return;
            }
            if (phoneEmailSignUpFragment2.NS().getCurrentItem() == 0) {
                str = "switch_to_phone";
            } else {
                str = "switch_to_email";
            }
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("login_panel_type", ((PhoneEmailSignUpFragment) c1266190j3R.l0).PR());
            c0xgr.LIZLLL("enter_from", ((PhoneEmailSignUpFragment) c1266190j3R.l0).getEnterFrom());
            c0xgr.LIZLLL("enter_method", ((PhoneEmailSignUpFragment) c1266190j3R.l0).getEnterMethod());
            c0xgr.LIZLLL("enter_type", ((PhoneEmailSignUpFragment) c1266190j3R.l0).LLJIJIL);
            if (((PhoneEmailSignUpFragment) c1266190j3R.l0).LLLJL) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0xgr.LIZLLL("is_first_show", str2);
            C20684815ws.LJIILLIIL(str, c0xgr.LIZ);
            ((PhoneEmailSignUpFragment) c1266190j3R.l0).LLLJL = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SELECT ");
            sbLIZ.append(((PhoneEmailSignUpFragment) c1266190j3R.l0).NS().getCurrentItem());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void onPageScrollStateChanged$2(C1266190j3R c1266190j3R, int i) {
        if (i == 0) {
            ((DetailFragmentPanel) c1266190j3R.l0).E0();
        }
    }

    public static final void onPageScrollStateChanged$3(C1266190j3R c1266190j3R, int i) {
        if (i == 0) {
            C786410Ut5.LJLLLLLL(0, ((EffectDiscoverPanel) c1266190j3R.l0).z0);
        } else {
            C786410Ut5.LJLLLLLL(4, ((EffectDiscoverPanel) c1266190j3R.l0).z0);
        }
    }

    public static final void onPageScrollStateChanged$4(C1266190j3R c1266190j3R, int i) {
        if (i != 0) {
            if (i == 1) {
                ((InboxNewFollowerTabFragment) c1266190j3R.l0).LLJILJILJ = "slide";
                return;
            }
            return;
        }
        ((InboxNewFollowerTabFragment) c1266190j3R.l0).LLJILJILJ = "click";
    }

    public static final void onPageScrollStateChanged$5(C1266190j3R c1266190j3R, int i) {
        ((AwemePagerAssem) c1266190j3R.l0).Kq(i);
    }

    public static final void onPageScrollStateChanged$6(C1266190j3R c1266190j3R, int i) {
        if (!Intrinsics.LJFF(((TabChangeManager) ((C1249710icr) c1266190j3R.l0).LJ.getValue()).CQ2(), "USER")) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ((C1249710icr) c1266190j3R.l0).LIZIZ(0);
                    return;
                }
                return;
            }
            ((C1249710icr) c1266190j3R.l0).LIZIZ(0);
            return;
        }
        if (C486860J7k.LIZIZ(((C1249710icr) c1266190j3R.l0).LIZ).FQ2("page_setting")) {
            return;
        }
        ((C1249710icr) c1266190j3R.l0).LIZIZ(8);
    }

    public static final void onPageSelected$0(C1266190j3R c1266190j3R, int i) {
        String str;
        PhoneEmailLoginFragment phoneEmailLoginFragment = (PhoneEmailLoginFragment) c1266190j3R.l0;
        phoneEmailLoginFragment.LLLJIL = i;
        C1237010iIN c1237010iIN = phoneEmailLoginFragment.LLJZ;
        if (c1237010iIN != null) {
            if (phoneEmailLoginFragment.NS().getCurrentItem() == 0) {
                str = "phone_login_homepage";
            } else {
                str = "email_login_homepage";
            }
            c1237010iIN.LJIIJJI = str;
        }
        PhoneEmailLoginFragment phoneEmailLoginFragment2 = (PhoneEmailLoginFragment) c1266190j3R.l0;
        C1245410iVv c1245410iVv = phoneEmailLoginFragment2.LLLIZZ;
        if (c1245410iVv == null) {
            c1245410iVv = null;
        }
        C128Y c128yLJJIJIL = c1245410iVv.LJJIJIL(phoneEmailLoginFragment2.LLLJIL);
        if (c128yLJJIJIL instanceof InterfaceC1740760vOs) {
            C2211631BhB.LJIIL((InterfaceC1740760vOs) c128yLJJIJIL, null);
        }
    }

    public static final void onPageSelected$1(C1266190j3R c1266190j3R, int i) {
        String str;
        PhoneEmailSignUpFragment phoneEmailSignUpFragment = (PhoneEmailSignUpFragment) c1266190j3R.l0;
        phoneEmailSignUpFragment.LLLJ = i;
        C1237010iIN c1237010iIN = phoneEmailSignUpFragment.LLJZ;
        if (c1237010iIN != null) {
            if (phoneEmailSignUpFragment.NS().getCurrentItem() == 0) {
                str = "phone_sign_up_homepage";
            } else {
                str = "email_sign_up_homepage";
            }
            c1237010iIN.LJIIJJI = str;
        }
        PhoneEmailSignUpFragment phoneEmailSignUpFragment2 = (PhoneEmailSignUpFragment) c1266190j3R.l0;
        C1245410iVv c1245410iVv = phoneEmailSignUpFragment2.LLLIZZ;
        if (c1245410iVv == null) {
            c1245410iVv = null;
        }
        C128Y c128yLJJIJIL = c1245410iVv.LJJIJIL(phoneEmailSignUpFragment2.LLLJ);
        if (c128yLJJIJIL instanceof InterfaceC1740760vOs) {
            C2211631BhB.LJIIL((InterfaceC1740760vOs) c128yLJJIJIL, null);
        }
    }

    public static final void onPageSelected$2(C1266190j3R c1266190j3R, int i) {
        String str;
        InterfaceC1209130hZP interfaceC1209130hZP = ((DetailFragmentPanel) c1266190j3R.l0).I;
        if (interfaceC1209130hZP != null) {
            interfaceC1209130hZP.W3();
        }
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) c1266190j3R.l0;
        Aweme awemeO = detailFragmentPanel.o();
        if (detailFragmentPanel.i != null) {
            boolean zCanShare = AwemeExtKt.canShare(awemeO);
            detailFragmentPanel.i.setEnabled(zCanShare);
            if (zCanShare) {
                detailFragmentPanel.i.getBackground().clearColorFilter();
            } else {
                detailFragmentPanel.i.getBackground().setColorFilter(new PorterDuffColorFilter(-7829368, PorterDuff.Mode.MULTIPLY));
            }
        }
        DetailFragmentPanel detailFragmentPanel2 = (DetailFragmentPanel) c1266190j3R.l0;
        detailFragmentPanel2.i0(detailFragmentPanel2.o());
        if (!C0C05.LIZ() && ((DetailFragmentPanel) c1266190j3R.l0).LLJL != null) {
            C1386150mAv c1386150mAv = new C1386150mAv();
            c1386150mAv.LIZLLL = ((DetailFragmentPanel) c1266190j3R.l0).LLLLIIIILLL.getEventType();
            c1386150mAv.LJIILLIIL(((DetailFragmentPanel) c1266190j3R.l0).getPageType(), ((DetailFragmentPanel) c1266190j3R.l0).LLJL.getItem(i));
            ((DetailFragmentPanel) c1266190j3R.l0).LLLLIIIILLL.getTabName();
            c1386150mAv.LJJIII = ((DetailFragmentPanel) c1266190j3R.l0).LLLLIIIILLL.getChallengeId();
            c1386150mAv.LJJ = "full";
            c1386150mAv.LJIILJJIL();
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        if (c1er1.LJIIIIZZ(((DetailFragmentPanel) c1266190j3R.l0).getContext())) {
            c1er1.LJJLIIIJLJLI(((DetailFragmentPanel) c1266190j3R.l0).LJIIIIZZ(), ((DetailFragmentPanel) c1266190j3R.l0).LLLLILI);
            DetailFragmentPanel detailFragmentPanel3 = (DetailFragmentPanel) c1266190j3R.l0;
            c1er1.Q(detailFragmentPanel3.LL, detailFragmentPanel3.getFragment(), ((DetailFragmentPanel) c1266190j3R.l0).o(), new AObjectS101S0101000_19(c1266190j3R, i, 0));
        }
        ((DetailFragmentPanel) c1266190j3R.l0).z0(i);
        DetailFragmentPanel detailFragmentPanel4 = (DetailFragmentPanel) c1266190j3R.l0;
        detailFragmentPanel4.getClass();
        c1er1.U(detailFragmentPanel4.LLLLIIIILLL, detailFragmentPanel4.getFragment(), detailFragmentPanel4.o());
        DetailFragmentPanel detailFragmentPanel5 = (DetailFragmentPanel) c1266190j3R.l0;
        C2189821An6 c2189821An6 = detailFragmentPanel5.LLLLIIIILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feedParam search anchor: ");
        if (c2189821An6.getIsFromSearchKeyFrameAnchor()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c2189821An6.getIsFromSearchKeyFrameAnchor() && Boolean.valueOf(c1er1.E(c2189821An6, detailFragmentPanel5.getFragment(), detailFragmentPanel5.LJLIL(), detailFragmentPanel5.o())).booleanValue()) {
            c2189821An6.setIsFromSearchKeyFromAnchor(false);
        }
    }

    public static final void onPageSelected$3(C1266190j3R c1266190j3R, int i) {
        Aweme awemeO = ((EffectDiscoverPanel) c1266190j3R.l0).o();
        if (awemeO != null) {
            EffectDiscoverPanel effectDiscoverPanel = (EffectDiscoverPanel) c1266190j3R.l0;
            C786410Ut5.LJLLLLLL(0, effectDiscoverPanel.z0);
            effectDiscoverPanel.O0(awemeO);
        }
    }

    public static final void onPageSelected$4(C1266190j3R c1266190j3R, int i) {
        String str;
        List<C1902480zbi> list = ((InboxNewFollowerTabFragment) c1266190j3R.l0).LLJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1902480zbi) it2.next()).LIZIZ);
        }
        Object obj = ListProtector.get(arrayList, i);
        if (obj == null) {
            obj = "";
        }
        InboxNewFollowerTabFragment inboxNewFollowerTabFragment = (InboxNewFollowerTabFragment) c1266190j3R.l0;
        if (!inboxNewFollowerTabFragment.LLJILJIL && Intrinsics.LJFF(obj, inboxNewFollowerTabFragment.LLJIJIL)) {
            InboxNewFollowerTabFragment inboxNewFollowerTabFragment2 = (InboxNewFollowerTabFragment) c1266190j3R.l0;
            inboxNewFollowerTabFragment2.getClass();
            C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
            if (!c1076010e6h.LJIIJ().LIZJ() && !c1076010e6h.LJII().LIZJ()) {
                str = "authorize";
            } else {
                str = "normal";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("tab_name", inboxNewFollowerTabFragment2.LLJIJIL);
            c2344009Gk.LJIIIIZZ("enter_method", inboxNewFollowerTabFragment2.LLJILJILJ);
            c2344009Gk.LJIIIIZZ("enter_from", "new_followers_page");
            c2344009Gk.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFriendCount(), "muf_cnt");
            c2344009Gk.LJIIIIZZ("page_type", str);
            C20684815ws.LJIILLIIL("enter_mutual_friends_list", c2344009Gk.LIZ);
            inboxNewFollowerTabFragment2.LLJILJIL = true;
        }
    }

    public static final void onPageSelected$5(C1266190j3R c1266190j3R, int i) {
        ((AwemePagerAssem) c1266190j3R.l0).Mq(i);
    }

    public static final void onPageScrolled$2(C1266190j3R c1266190j3R, int i, float f, int i2) {
        C0P0T c0p0t = ((DetailFragmentPanel) c1266190j3R.l0).j;
        if (c0p0t != null && c0p0t.isShowing()) {
            ((DetailFragmentPanel) c1266190j3R.l0).j.dismiss();
            ((DetailFragmentPanel) c1266190j3R.l0).j = null;
        }
    }

    public static final void onPageScrolled$5(C1266190j3R c1266190j3R, int i, float f, int i2) {
        ((AwemePagerAssem) c1266190j3R.l0).P5(i, f, i2);
    }

    public static final void onPageScrolled$6(C1266190j3R c1266190j3R, int i, float f, int i2) {
        if (!Intrinsics.LJFF(((TabChangeManager) ((C1249710icr) c1266190j3R.l0).LJ.getValue()).CQ2(), "USER")) {
            return;
        }
        C1249710icr c1249710icr = (C1249710icr) c1266190j3R.l0;
        if (i2 > 0) {
            View viewLIZ = c1249710icr.LIZ();
            if (viewLIZ != null && viewLIZ.getVisibility() == 0) {
                float f2 = (i2 / c1249710icr.LIZIZ) * 0.34f;
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                C19EG c19eg = c1249710icr.LIZ;
                c1546210qL5.getClass();
                if (C1546210qL5.LJIIIZ(c19eg) && ((Boolean) C267330Adn.LIZ.getValue()).booleanValue()) {
                    double d = (((double) i2) / (((double) c1249710icr.LIZJ) * 0.7d)) * ((double) 0.34f);
                    View viewLIZ2 = c1249710icr.LIZ();
                    if (viewLIZ2 != null) {
                        C786410Ut5.T4(viewLIZ2, (float) d);
                        return;
                    }
                    return;
                }
                View viewLIZ3 = c1249710icr.LIZ();
                if (viewLIZ3 == null) {
                    return;
                }
                C786410Ut5.T4(viewLIZ3, f2);
                return;
            }
            return;
        }
        c1249710icr.getClass();
    }
}
