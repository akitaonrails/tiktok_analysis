package Y;

import X.AbstractC848400XPy;
import X.C013C;
import X.C0X2A;
import X.C0XQ7;
import X.C0XUE;
import X.C0XXD;
import X.C1238730iL9;
import X.C1255340ilw;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1703410uQd;
import X.C1903780zdo;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C296200BjG;
import X.C486860J7k;
import X.C786410Ut5;
import X.C849680XUw;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAutoLoginService;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.profile.business.account.multiaccount.ChooseAccountBottomSheetFragment;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class AObserverS182S0200000_19 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS182S0200000_19 aObserverS182S0200000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObserverS182S0200000_19.l0;
        AtomicBoolean atomicBoolean = (AtomicBoolean) aObserverS182S0200000_19.l1;
        C1238730iL9 c1238730iL9 = (C1238730iL9) obj;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        if (c1238730iL9 instanceof C1703410uQd) {
            i18nSettingManageMyAccountActivity.LLJI = ((C1703410uQd) c1238730iL9).LJ;
        }
        i18nSettingManageMyAccountActivity.LLJILJILJ.LJIIIIZZ(c1238730iL9.LIZIZ.name);
        i18nSettingManageMyAccountActivity.LLJILJILJ.LJFF(c1238730iL9.LIZ);
        if (c1238730iL9.LIZ && atomicBoolean.compareAndSet(false, true)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(System.currentTimeMillis() - i18nSettingManageMyAccountActivity.LLJILJIL, "delay");
            c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
            C20684815ws.LJIILLIIL("account_region_status_show", c2344009Gk.LIZ);
        }
    }

    public static final void onChanged$1(AObserverS182S0200000_19 aObserverS182S0200000_19, Object obj) throws JSONException {
        int i;
        List list = (List) obj;
        ((RecyclerView) aObserverS182S0200000_19.l0).setLayoutManager(new LinearLayoutManager(((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).getContext()));
        RecyclerView recyclerView = (RecyclerView) aObserverS182S0200000_19.l0;
        C1255340ilw c1255340ilw = ((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).LL;
        if (c1255340ilw == null) {
            c1255340ilw = null;
        }
        recyclerView.setAdapter(c1255340ilw);
        C1255340ilw c1255340ilw2 = ((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).LL;
        if (c1255340ilw2 == null) {
            c1255340ilw2 = null;
        }
        ((ArrayList) c1255340ilw2.LLILZIL).clear();
        ((ArrayList) c1255340ilw2.LLILZIL).addAll(list);
        c1255340ilw2.notifyDataSetChanged();
        C2344009Gk c2344009Gk = new C2344009Gk();
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (i2 < size) {
            SignificantUserInfo significantUserInfo = (SignificantUserInfo) ListProtector.get(list, i2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("user_id", significantUserInfo.uid);
            List<BaseLoginMethod> listLJ = C0XUE.LIZ.LJ(significantUserInfo.uid);
            if (true ^ ((ArrayList) listLJ).isEmpty()) {
                jSONObject.put("login_platform", C849680XUw.LJFF((BaseLoginMethod) ListProtector.get(C13LP.LJLLLL(new AComparatorS32S0000000_13(12), listLJ), 0)));
            }
            i2++;
            jSONObject.put("order", i2);
            jSONObject.put("current_user_store_region", C0X2A.LIZJ);
            jSONArray.put(C786410Ut5.J3(jSONObject));
        }
        c2344009Gk.LJ(jSONArray, "detail_info");
        if (list.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if ((!Intrinsics.LJFF(((SignificantUserInfo) it2.next()).uid, "-1")) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c2344009Gk.LIZJ(i, "account_cnt");
        if (!list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                SignificantUserInfo significantUserInfo2 = (SignificantUserInfo) it3.next();
                if (!Intrinsics.LJFF(significantUserInfo2.uid, "-1") && !Intrinsics.LJFF(significantUserInfo2.uid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                    if (C1903780zdo.LJII().LJI(significantUserInfo2.uid) > 0) {
                        z = true;
                        break;
                    }
                }
            }
        }
        c2344009Gk.LJ(Boolean.valueOf(z), "is_reddot_show");
        c2344009Gk.LJIIIIZZ("enter_method", ((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).MR().LIZIZ);
        c2344009Gk.LJIIIIZZ("channel", ((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).MR().LIZJ);
        c2344009Gk.LJIIIIZZ("enter_from", ((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).MR().LIZ);
        c2344009Gk.LJIIIIZZ("sdk_name", ((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).MR().LIZLLL);
        c2344009Gk.LJIIIIZZ("enter_source", ((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).MR().LJI);
        c2344009Gk.LJIIIIZZ("auth_app", ((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).MR().LJII);
        c2344009Gk.LJIIIIZZ("sdk_version", ((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).MR().LJ);
        c2344009Gk.LJIIIIZZ("pattern", ((ChooseAccountBottomSheetFragment) aObserverS182S0200000_19.l1).MR().LJFF);
        C20684815ws.LJIILLIIL("account_list_unfold", c2344009Gk.LIZ);
    }

    public static final void onChanged$2(AObserverS182S0200000_19 aObserverS182S0200000_19, Object obj) {
        String secUid;
        List list = (List) obj;
        C013C c013c = (C013C) aObserverS182S0200000_19.l0;
        if (c013c.element) {
            c013c.element = false;
            return;
        }
        User user = ((I18nUserProfileFragment) aObserverS182S0200000_19.l1).LLJI;
        if (user == null || (secUid = user.getSecUid()) == null) {
            return;
        }
        I18nUserProfileFragment i18nUserProfileFragment = (I18nUserProfileFragment) aObserverS182S0200000_19.l1;
        if (!list.contains(secUid)) {
            return;
        }
        ProfileViewModel profileViewModel = i18nUserProfileFragment.LLJILJILJ;
        profileViewModel.getClass();
        profileViewModel.setState(AFwS283S0000000_35.get$arr$(197));
    }

    public static final void onChanged$3(AObserverS182S0200000_19 aObserverS182S0200000_19, Object obj) {
        String str;
        HomePageViewPagerAbility homePageViewPagerAbilityGS;
        Pair pair = (Pair) obj;
        if (!Intrinsics.LJFF(pair.getFirst(), "USER") && !Intrinsics.LJFF(pair.getFirst(), "page_setting") && ((str = ((I18nMyProfileFragment) aObserverS182S0200000_19.l0).LLLFZ) == null || Intrinsics.LJFF(str, "USER"))) {
            C486860J7k.LIZIZ((C19EG) aObserverS182S0200000_19.l1).KQ2(true);
            ((I18nMyProfileFragment) aObserverS182S0200000_19.l0).LLLI = false;
            if (C296200BjG.LIZ()) {
                homePageViewPagerAbilityGS = ((I18nMyProfileFragment) aObserverS182S0200000_19.l0).gS();
            } else {
                homePageViewPagerAbilityGS = (HomePageViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJI((C19EG) aObserverS182S0200000_19.l1, null), HomePageViewPagerAbility.class, null);
            }
            if (homePageViewPagerAbilityGS != null) {
                homePageViewPagerAbilityGS.qC2("page_profile");
            }
        }
        ((I18nMyProfileFragment) aObserverS182S0200000_19.l0).LLLFZ = (String) pair.getFirst();
    }

    public static final void onChanged$4(AObserverS182S0200000_19 aObserverS182S0200000_19, Object obj) {
        IAutoLoginService iAutoLoginService = (IAutoLoginService) aObserverS182S0200000_19.l0;
        iAutoLoginService.handleLoadingDialogForAutoLogin((C0XXD) obj, new AwS385S0200000_19(iAutoLoginService, (LoginMethodListFragment) aObserverS182S0200000_19.l1, 131));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$5(Y.AObserverS182S0200000_19 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS182S0200000_19.onChanged$5(Y.AObserverS182S0200000_19, java.lang.Object):void");
    }

    public AObserverS182S0200000_19(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
