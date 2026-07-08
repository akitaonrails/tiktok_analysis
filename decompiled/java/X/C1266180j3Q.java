package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsTabFragment;
import com.ss.android.ugc.profile.business.cd.IMenuAbility;
import com.ss.android.ugc.profile.business.profile.menu.ability.IContentCellAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266180j3Q implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onPageScrollStateChanged$1(C1266180j3Q c1266180j3Q, int i) {
    }

    public static final void onPageScrolled$1(C1266180j3Q c1266180j3Q, int i, float f, int i2) {
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
        }
    }

    public static final void onPageScrollStateChanged$0(C1266180j3Q c1266180j3Q, int i) {
        if (i == 0 && Hox.LLJILJIL.LIZ((C19EG) c1266180j3Q.l0).LQ2("USER")) {
            ((I18nMyProfileFragment) c1266180j3Q.l1).LLLIIIIL = "";
        }
    }

    public static final void onPageSelected$0(C1266180j3Q c1266180j3Q, int i) {
        boolean z;
        if (((I18nMyProfileFragment) c1266180j3Q.l1).LLLIIII.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && Hox.LLJILJIL.LIZ((C19EG) c1266180j3Q.l0).LQ2("USER")) {
            C1249240ic6.LIZ.getClass();
            C1249240ic6.LIZLLL("slide_right");
        }
        if (Hox.LLJILJIL.LIZ((C19EG) c1266180j3Q.l0).LQ2("USER")) {
            ((I18nMyProfileFragment) c1266180j3Q.l1).LLLIIII = "";
        }
        ((I18nMyProfileFragment) c1266180j3Q.l1).getClass();
    }

    public static final void onPageSelected$1(C1266180j3Q c1266180j3Q, int i) {
        boolean z;
        String str;
        String str2;
        C19Y5 c19y5LJIIIZ = ((FindFriendsTabFragment) c1266180j3Q.l0).MR().LJIIIZ(i);
        if (c19y5LJIIIZ != null) {
            Object obj = c19y5LJIIIZ.LIZ;
            if ((obj instanceof String) && TextUtils.equals((String) obj, "from_click")) {
                z = true;
            } else {
                z = false;
            }
            c19y5LJIIIZ.LIZ = null;
        } else {
            z = false;
        }
        Object obj2 = ListProtector.get(((FindFriendsTabFragment) c1266180j3Q.l0).LLJILLL, i);
        if (Intrinsics.LJFF(obj2, "suggest_user")) {
            str = "recommendation";
        } else if (Intrinsics.LJFF(obj2, "muf_user")) {
            str = "friends";
        } else {
            str = "";
        }
        if (z) {
            str2 = "click";
        } else {
            str2 = "slide";
        }
        if (!((FindFriendsTabFragment) c1266180j3Q.l0).LLJJIJIIJIL && Intrinsics.LJFF(str, "friends")) {
            ((FindFriendsTabFragment) c1266180j3Q.l0).PR(str2, str2);
        }
        if (!((FindFriendsTabFragment) c1266180j3Q.l0).LLJJIJIL && Intrinsics.LJFF(str, "recommendation")) {
            ((FindFriendsTabFragment) c1266180j3Q.l0).RR(str2);
        }
        C0HI8 c0hi8 = (C0HI8) c1266180j3Q.l1;
        List<Fragment> list = c0hi8.LLIZ;
        if (list != null && !list.isEmpty() && i >= 0 && i <= c0hi8.LLIZ.size() && (ListProtector.get(c0hi8.LLIZ, i) instanceof InterfaceC1264400j0Y)) {
            InterfaceC1264400j0Y interfaceC1264400j0Y = (InterfaceC1264400j0Y) ListProtector.get(c0hi8.LLIZ, i);
            if (interfaceC1264400j0Y.LJLLL()) {
                interfaceC1264400j0Y.ck();
            }
        }
    }

    public C1266180j3Q(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onPageScrolled$0(C1266180j3Q c1266180j3Q, int i, float f, int i2) {
        String strHP;
        String notificationType;
        HomePageViewPagerAbility homePageViewPagerAbilityGS;
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        if (c446900Hfk.LIZ((C19EG) c1266180j3Q.l0).LQ2("USER")) {
            I18nMyProfileFragment i18nMyProfileFragment = (I18nMyProfileFragment) c1266180j3Q.l1;
            if (!i18nMyProfileFragment.LLLI) {
                i18nMyProfileFragment.LLLI = true;
                I18nMyProfileFragment i18nMyProfileFragment2 = (I18nMyProfileFragment) c1266180j3Q.l1;
                i18nMyProfileFragment2.getClass();
                if (C296200BjG.LIZ()) {
                    homePageViewPagerAbilityGS = i18nMyProfileFragment2.gS();
                } else {
                    homePageViewPagerAbilityGS = (HomePageViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(i18nMyProfileFragment2, null), HomePageViewPagerAbility.class, null);
                }
                if (homePageViewPagerAbilityGS != null) {
                    homePageViewPagerAbilityGS.qC2("page_setting");
                }
            }
        }
        if (((I18nMyProfileFragment) c1266180j3Q.l1).LLLIIIIL.length() == 0 && ((c446900Hfk.LIZ((C19EG) c1266180j3Q.l0).LQ2("USER") || c446900Hfk.LIZ((C19EG) c1266180j3Q.l0).LQ2("page_setting")) && ((C444960Hcc.LIZIZ() && ((I18nMyProfileFragment) c1266180j3Q.l1).LLLII > i2) || (!C444960Hcc.LIZIZ() && i2 > ((I18nMyProfileFragment) c1266180j3Q.l1).LLLII)))) {
            I18nMyProfileFragment i18nMyProfileFragment3 = (I18nMyProfileFragment) c1266180j3Q.l1;
            i18nMyProfileFragment3.LLLIIIIL = "slide_left";
            C1249240ic6 c1249240ic6 = C1249240ic6.LIZ;
            IMenuAbility iMenuAbility = (IMenuAbility) i18nMyProfileFragment3.LLLLIL.getValue();
            if (iMenuAbility != null) {
                strHP = iMenuAbility.hP();
            } else {
                strHP = null;
            }
            IMenuAbility iMenuAbility2 = (IMenuAbility) ((I18nMyProfileFragment) c1266180j3Q.l1).LLLLIL.getValue();
            if (iMenuAbility2 != null) {
                notificationType = iMenuAbility2.getNotificationType();
            } else {
                notificationType = null;
            }
            c1249240ic6.getClass();
            C1249240ic6.LIZJ("slide_left", strHP, notificationType);
            IContentCellAbility iContentCellAbility = (IContentCellAbility) C1558520qew.LIZ(C1558360qeg.LJI((C19EG) c1266180j3Q.l0, null), IContentCellAbility.class, null);
            if (iContentCellAbility != null) {
                iContentCellAbility.RH0("slide_left");
            }
        }
        ((I18nMyProfileFragment) c1266180j3Q.l1).LLLII = i2;
    }
}
