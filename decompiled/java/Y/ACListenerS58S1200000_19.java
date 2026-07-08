package Y;

import X.AnonymousClass0207;
import X.C0DTS;
import X.C0OBG;
import X.C1050610dRj;
import X.C1215410hjX;
import X.C1215970hkR;
import X.C1231780i9w;
import X.C1232140iAW;
import X.C1254010ijn;
import X.C1261050iv9;
import X.C127K;
import X.C19EG;
import X.C1EDI;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2277891EDz;
import X.C2344009Gk;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.InterfaceC1232040iAM;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS58S1200000_19 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void onClick$0(ACListenerS58S1200000_19 aCListenerS58S1200000_19, View view) throws Throwable {
        if (C1EDI.LJ()) {
            C1215410hjX.LIZ(((ProfileEditFragment) aCListenerS58S1200000_19.l1).LLLIIL);
        } else {
            C1215410hjX.LIZ(((ProfileEditFragment) aCListenerS58S1200000_19.l1).gS());
        }
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        String strGT = ((ProfileEditFragment) aCListenerS58S1200000_19.l1).gT((C127K) aCListenerS58S1200000_19.l2);
        c1232140iAW.getClass();
        C1232140iAW.LJI(strGT);
        String str = aCListenerS58S1200000_19.s0;
        String str2 = "";
        switch (str.hashCode()) {
            case -2020285285:
                if (!str.equals("ba_website")) {
                    return;
                }
                ((ProfileEditFragment) aCListenerS58S1200000_19.l1).bS((C127K) aCListenerS58S1200000_19.l2, true);
                return;
            case -1748485890:
                if (!str.equals("ba_category")) {
                    return;
                }
                break;
            case -1396783629:
                if (!str.equals("ba_tts")) {
                    return;
                }
                ProfileEditFragment profileEditFragment = (ProfileEditFragment) aCListenerS58S1200000_19.l1;
                SmartRouter.buildRoute(profileEditFragment.getActivity(), profileEditFragment.LLLLLJIL).open();
                return;
            case -1106386011:
                if (!str.equals("lemon8")) {
                    return;
                }
                ((ProfileEditFragment) aCListenerS58S1200000_19.l1).jT();
                return;
            case -1008549514:
                if (!str.equals("app_store_link")) {
                    return;
                }
                ProfileEditFragment profileEditFragment2 = (ProfileEditFragment) aCListenerS58S1200000_19.l1;
                profileEditFragment2.getClass();
                BAProfilePageServiceImpl.LJIIL().LJI(profileEditFragment2.getActivity());
                return;
            case -991745245:
                if (!str.equals("youtube")) {
                    return;
                }
                ((ProfileEditFragment) aCListenerS58S1200000_19.l1).lT();
                return;
            case -916346253:
                if (!str.equals("twitter")) {
                    return;
                }
                ((ProfileEditFragment) aCListenerS58S1200000_19.l1).kT();
                return;
            case -683981230:
                if (!str.equals("ba_leads_from")) {
                    return;
                }
                ProfileEditFragment profileEditFragment3 = (ProfileEditFragment) aCListenerS58S1200000_19.l1;
                C127K c127k = (C127K) aCListenerS58S1200000_19.l2;
                profileEditFragment3.getClass();
                if (C0OBG.LIZIZ(c127k) || !profileEditFragment3.isViewValid()) {
                    return;
                }
                BAProfilePageServiceImpl.LJIIL().LIZ(profileEditFragment3.getContext(), "leads_from");
                new C1050610dRj().LJJI("leads_from");
                return;
            case -180337243:
                if (!str.equals("bio_email")) {
                    return;
                }
                final ProfileEditFragment profileEditFragment4 = (ProfileEditFragment) aCListenerS58S1200000_19.l1;
                C127K c127k2 = (C127K) aCListenerS58S1200000_19.l2;
                profileEditFragment4.getClass();
                if (C0OBG.LIZIZ(c127k2) || !profileEditFragment4.isViewValid() || !BAProfilePageServiceImpl.LJIIL().LJII(profileEditFragment4.getActivity())) {
                    return;
                }
                C127K c127k3 = profileEditFragment4.LLJJJJLIIL;
                if (c127k3 == null) {
                    c127k3 = null;
                }
                String strLIZIZ = C1215970hkR.LIZIZ(c127k3);
                if (!Intrinsics.LJFF(strLIZIZ, profileEditFragment4.getString(2131833255))) {
                    str2 = strLIZIZ;
                }
                C1232140iAW.LJIIIZ("enter_profile_mail", "click_mail", "mail");
                ProfileEditContentFragment profileEditContentFragmentLIZ = C1231780i9w.LIZ(profileEditFragment4.getString(2131833256), str2, profileEditFragment4.getResources().getString(2131833861));
                profileEditContentFragmentLIZ.setUserVisibleHint(true);
                profileEditContentFragmentLIZ.LLJJIJI = new InterfaceC1232040iAM() { // from class: X.0iAe
                    @Override // X.InterfaceC1232040iAM
                    public final void LIZ(String str3) {
                        String str4;
                        ProfileEditFragment profileEditFragment5 = profileEditFragment4;
                        profileEditFragment5.LLJI = true;
                        User user = null;
                        if (TextUtils.equals(str3, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getBioEmail())) {
                            profileEditFragment5.uS().LJI = null;
                            return;
                        }
                        while (a0.LJJIIZI(str3, "\n\n", false)) {
                            str3 = new Regex("\n\n").replace(str3, "\n");
                        }
                        int length = str3.length() - 1;
                        if (length >= 0 && str3.charAt(length) == '\n') {
                            str3 = str3.substring(0, length);
                        }
                        profileEditFragment5.uS().LJI = str3;
                        profileEditFragment5.yS().LIZIZ(profileEditFragment5.uS().LIZ());
                        profileEditFragment5.sT();
                        User user2 = profileEditFragment5.LLLLLLZ;
                        if (user2 != null) {
                            user = user2;
                        }
                        user.setEmail(str3);
                        boolean zIsEmpty = TextUtils.isEmpty(str3);
                        if (!TextUtils.isEmpty(str3)) {
                            str4 = "bold";
                        } else {
                            str4 = "blank";
                        }
                        profileEditFragment5.vT("bio_email", str4, zIsEmpty);
                        profileEditFragment5.uT("email", !TextUtils.isEmpty(str3));
                    }
                };
                profileEditContentFragmentLIZ.LLJILJILJ = AnonymousClass0207.get$arr$(65);
                profileEditContentFragmentLIZ.LLJILJIL = false;
                profileEditContentFragmentLIZ.show(profileEditFragment4.requireActivity().getSupportFragmentManager(), "EditMailDialog");
                return;
            case 3321850:
                if (!str.equals("link")) {
                    return;
                }
                ((ProfileEditFragment) aCListenerS58S1200000_19.l1).mT();
                return;
            case 28903346:
                if (!str.equals("instagram")) {
                    return;
                }
                ((ProfileEditFragment) aCListenerS58S1200000_19.l1).iT();
                return;
            case 50511102:
                if (!str.equals("category")) {
                    return;
                }
                break;
            case 577764552:
                if (!str.equals("biz_address")) {
                    return;
                }
                ProfileEditFragment profileEditFragment5 = (ProfileEditFragment) aCListenerS58S1200000_19.l1;
                C127K c127k4 = (C127K) aCListenerS58S1200000_19.l2;
                profileEditFragment5.getClass();
                if (C0OBG.LIZIZ(c127k4) || !profileEditFragment5.isViewValid()) {
                    return;
                }
                BAProfilePageServiceImpl.LJIIL().LJIIJ(profileEditFragment5.getActivity());
                return;
            case 1002292034:
                if (!str.equals("biz_phone")) {
                    return;
                }
                ProfileEditFragment profileEditFragment6 = (ProfileEditFragment) aCListenerS58S1200000_19.l1;
                C127K c127k5 = (C127K) aCListenerS58S1200000_19.l2;
                C127K c127k6 = profileEditFragment6.LLJJJJ;
                if (c127k6 == null || C0OBG.LIZIZ(c127k5) || !profileEditFragment6.isViewValid() || profileEditFragment6.LLLJIL || profileEditFragment6.getUser().getBizAccountInfo() == null) {
                    return;
                }
                String strLIZIZ2 = C1215970hkR.LIZIZ(c127k6);
                if (!Intrinsics.LJFF(strLIZIZ2, profileEditFragment6.getString(2131821373))) {
                    str2 = strLIZIZ2;
                }
                BAProfilePageServiceImpl.LJIIL().LJFF(profileEditFragment6.getActivity(), str2, profileEditFragment6.getUser().getBizAccountInfo());
                return;
            case 1224335515:
                if (!str.equals("website")) {
                    return;
                }
                ((ProfileEditFragment) aCListenerS58S1200000_19.l1).bS((C127K) aCListenerS58S1200000_19.l2, false);
                return;
            case 1307298424:
                if (!str.equals("ba_action_buttons")) {
                    return;
                }
                ProfileEditFragment profileEditFragment7 = (ProfileEditFragment) aCListenerS58S1200000_19.l1;
                C127K c127k7 = (C127K) aCListenerS58S1200000_19.l2;
                profileEditFragment7.getClass();
                if (C0OBG.LIZIZ(c127k7) || !profileEditFragment7.isViewValid()) {
                    return;
                }
                BAProfilePageServiceImpl.LJIIL().LIZ(profileEditFragment7.getContext(), "info");
                new C1050610dRj().LJJI("info");
                return;
            case 1974375468:
                if (!str.equals("ba_profile_display")) {
                    return;
                }
                ProfileEditFragment profileEditFragment8 = (ProfileEditFragment) aCListenerS58S1200000_19.l1;
                C127K c127k8 = (C127K) aCListenerS58S1200000_19.l2;
                profileEditFragment8.getClass();
                if (C0OBG.LIZIZ(c127k8) || !profileEditFragment8.isViewValid()) {
                    return;
                }
                BAProfilePageServiceImpl.LJIIL().LIZ(profileEditFragment8.getContext(), "display");
                new C1050610dRj().LJJI("display");
                return;
            default:
                return;
        }
        ProfileEditFragment profileEditFragment9 = (ProfileEditFragment) aCListenerS58S1200000_19.l1;
        C127K c127k9 = (C127K) aCListenerS58S1200000_19.l2;
        profileEditFragment9.getClass();
        if (C0OBG.LIZIZ(c127k9) || !profileEditFragment9.isViewValid()) {
            return;
        }
        C19EG activity = profileEditFragment9.getActivity();
        C0DTS.LIZ.getClass();
        SmartRouter.buildRoute(activity, C0DTS.LIZ(3, "settings")).open();
    }

    public static final void onClick$1(ACListenerS58S1200000_19 aCListenerS58S1200000_19, View view) {
        String str;
        User user = ((C1261050iv9) aCListenerS58S1200000_19.l1).LL;
        C2277891EDz.LIZIZ.LJII().LJ(view.getContext(), user, "search_result", "", "find_friends_page", "", EnumC1260920iuw.RELATION_LABEL.getType());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("button_type", "click_info");
        c2344009Gk.LJII(((C1261050iv9) aCListenerS58S1200000_19.l1).LLILLJJLI);
        C20684815ws.LJIILLIIL("search_result_click", c2344009Gk.LIZ);
        SearchFriendCell searchFriendCell = (SearchFriendCell) aCListenerS58S1200000_19.l2;
        C1261050iv9 c1261050iv9 = (C1261050iv9) aCListenerS58S1200000_19.l1;
        EnumC1260930iux enumC1260930iux = EnumC1260930iux.ENTER_PROFILE;
        searchFriendCell.getClass();
        SearchFriendCell.I5(c1261050iv9, enumC1260930iux);
        LinkedHashMap linkedHashMap = new LinkedHashMap(((C1261050iv9) aCListenerS58S1200000_19.l1).LLILLJJLI);
        linkedHashMap.put("order", aCListenerS58S1200000_19.s0);
        if (((C1261050iv9) aCListenerS58S1200000_19.l1).LLILZLL != null) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("has_label", str);
        String str2 = ((C1261050iv9) aCListenerS58S1200000_19.l1).LLILLJJLI.get("enter_from");
        if (str2 == null) {
            str2 = "";
        }
        new C1254010ijn(str2, user, "click_search_result", null, null, C2095008Iq.LJIIJJI(aCListenerS58S1200000_19.s0), null, linkedHashMap, null, null, null, null, null, 8024).LIZLLL(null);
    }

    public ACListenerS58S1200000_19(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
