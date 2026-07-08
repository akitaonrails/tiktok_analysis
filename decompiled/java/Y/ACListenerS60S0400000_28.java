package Y;

import X.C07WV;
import X.C09JN;
import X.C0OBG;
import X.C0PEM;
import X.C100C;
import X.C10LK;
import X.C1157730gEV;
import X.C11S5;
import X.C1227904rF;
import X.C1260910iuv;
import X.C1261860iwS;
import X.C13LP;
import X.C1518550pcT;
import X.C15438062q;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1843500y4a;
import X.C1888390zEz;
import X.C1894320zOY;
import X.C1907540zjs;
import X.C1907570zjv;
import X.C1907580zjw;
import X.C1913700zto;
import X.C1913750ztt;
import X.C1914960zvq;
import X.C19334110kV;
import X.C1E7L;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2276131E7f;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C238400w2;
import X.C296550Bjp;
import X.C786410Ut5;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1778900wOO;
import X.EnumC1876780ywG;
import X.InterfaceC1631630sYr;
import X.InterfaceC1907510zjp;
import X.InterfaceC1914580zvE;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.touchpoint.api.model.AgeGatePopup;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.KrConsentCheckbox;
import com.ss.android.ugc.aweme.compliance.business.universalpopup.ui.PNSKrDeviceConsentNewUI;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.api.bean.LinkBusinessExtra;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S2001000_28;

/* JADX INFO: loaded from: classes29.dex */
public class ACListenerS60S0400000_28 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS60S0400000_28 aCListenerS60S0400000_28, View view) {
        String uid;
        User userLIZJ = C1907540zjs.LIZJ((MusNotice) aCListenerS60S0400000_28.l0);
        C1907580zjw c1907580zjw = new Object() { // from class: X.0zjw
        };
        String str = "";
        if (userLIZJ == null || (uid = userLIZJ.getUid()) == null) {
            uid = "";
        }
        String accountType = ((MusNotice) aCListenerS60S0400000_28.l0).getAccountType();
        if (accountType != null) {
            str = accountType;
        }
        c1907580zjw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "message");
        c2344009Gk.LJIIIIZZ("account_type", str);
        c2344009Gk.LJIIIIZZ("to_user_id", uid);
        C20684815ws.LJIILLIIL("click_ignore", c2344009Gk.LIZ);
        LinkBusinessExtra linkBusinessExtra = (LinkBusinessExtra) aCListenerS60S0400000_28.l1;
        if (linkBusinessExtra != null) {
            MusNotificationApiManager.LJ(linkBusinessExtra.linkId).LJIJJLI(C11S5.LIZ()).LJIILJJIL(C1701940uOG.LIZIZ()).LJIJI(new C09JN() { // from class: X.0uMX
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LinkNoticeBottomBlock@7f8c.bindNegativeButton$1$1$2");
                    C1C7U.LIZIZ("LinkNoticeBottomBlock@7f8c.bindNegativeButton$1$1$2");
                }
            }, new C19334110kV((C1907570zjv) aCListenerS60S0400000_28.l3, 1));
        }
        ((InterfaceC1907510zjp) aCListenerS60S0400000_28.l2).LJJIL();
    }

    public static final void onClick$1(ACListenerS60S0400000_28 aCListenerS60S0400000_28, View view) {
        Boolean bool;
        Map<String, Boolean> map;
        Map<String, Boolean> map2;
        if (C0OBG.LIZ(500L, (C10LK) aCListenerS60S0400000_28.l0)) {
            int i = C2187451AjH.LIZ;
            return;
        }
        int i2 = C2187451AjH.LIZ;
        Function0<Unit> function0 = ((C10LK) aCListenerS60S0400000_28.l0).LLJJLIIIJLLLLLLLZ;
        if (function0 != null) {
            function0.invoke();
        }
        C2276131E7f.LIZIZ(C1E7L.BIG_CARD, new C1157730gEV(EnumC1778900wOO.PASSIVE, false));
        C10LK c10lk = (C10LK) aCListenerS60S0400000_28.l0;
        List<C1261860iwS> list = c10lk.LLJJJJJIL;
        C1261860iwS c1261860iwS = null;
        if (list != null) {
            C1261860iwS c1261860iwS2 = c10lk.LLJJL;
            if (c1261860iwS2 == null) {
                c1261860iwS2 = null;
            }
            int iIndexOf = list.indexOf(c1261860iwS2);
            C10LK c10lk2 = (C10LK) aCListenerS60S0400000_28.l0;
            RecSwipeViewModel recSwipeViewModel = c10lk2.LLJJJJ;
            if (recSwipeViewModel != null) {
                C1261860iwS c1261860iwS3 = c10lk2.LLJJL;
                if (c1261860iwS3 == null) {
                    c1261860iwS3 = null;
                }
                recSwipeViewModel.LLJJIJIL = Integer.valueOf(iIndexOf);
                recSwipeViewModel.LLJJJ = c1261860iwS3;
            }
        }
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(((C10LK) aCListenerS60S0400000_28.l0).LLJJJJLIIL);
        EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.CARD;
        c1260910iuv.LJJLIIIJILLIZJL = enumC1260920iuw;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJLIIIJJI = EnumC1260930iux.CLICK_COVER;
        C1261860iwS c1261860iwS4 = ((C10LK) aCListenerS60S0400000_28.l0).LLJJL;
        if (c1261860iwS4 == null) {
            c1261860iwS4 = null;
        }
        String uid = c1261860iwS4.getUid();
        if (uid == null) {
            uid = "";
        }
        c1260910iuv.LJJLIIJ = uid;
        C1261860iwS c1261860iwS5 = ((C10LK) aCListenerS60S0400000_28.l0).LLJJL;
        if (c1261860iwS5 == null) {
            c1261860iwS5 = null;
        }
        c1260910iuv.LJJJJZI(c1261860iwS5);
        C10LK c10lk3 = (C10LK) aCListenerS60S0400000_28.l0;
        if (C296550Bjp.LIZ()) {
            C1261860iwS c1261860iwS6 = c10lk3.LLJJL;
            if (c1261860iwS6 == null) {
                c1261860iwS6 = null;
            }
            c1260910iuv.LJJJJLI(c1261860iwS6.getRequestId());
        }
        c1260910iuv.LJLJI = true;
        C10LK c10lk4 = (C10LK) aCListenerS60S0400000_28.l0;
        RecSwipeViewModel recSwipeViewModel2 = c10lk4.LLJJJJ;
        if (recSwipeViewModel2 != null && (map2 = recSwipeViewModel2.LLJI) != null) {
            C1261860iwS c1261860iwS7 = c10lk4.LLJJL;
            if (c1261860iwS7 == null) {
                c1261860iwS7 = null;
            }
            bool = (Boolean) ((LinkedHashMap) map2).get(c1261860iwS7.getUid());
        } else {
            bool = null;
        }
        c1260910iuv.LLFII = bool;
        c1260910iuv.LJIILJJIL();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C10LK) aCListenerS60S0400000_28.l0).getContext(), "//aweme/detail");
        smartRouteBuildRoute.withParam("enter_from", ((C10LK) aCListenerS60S0400000_28.l0).LLJJJJLIIL);
        smartRouteBuildRoute.withParam("video_from", "[UserCard]_DETAIL");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, ((Aweme) aCListenerS60S0400000_28.l1).getAid());
        C1261860iwS c1261860iwS8 = ((C10LK) aCListenerS60S0400000_28.l0).LLJJL;
        if (c1261860iwS8 == null) {
            c1261860iwS8 = null;
        }
        smartRouteBuildRoute.withParam("userid", c1261860iwS8.getUid());
        C1261860iwS c1261860iwS9 = ((C10LK) aCListenerS60S0400000_28.l0).LLJJL;
        if (c1261860iwS9 == null) {
            c1261860iwS9 = null;
        }
        smartRouteBuildRoute.withParam("sec_userid", c1261860iwS9.getSecUid());
        smartRouteBuildRoute.withParam("is_show_follow_btn_on_bottom", true);
        if (!C296550Bjp.LIZ()) {
            smartRouteBuildRoute.withParam("refer", "others_homepage");
        }
        smartRouteBuildRoute.withParam("previous_page", ((C10LK) aCListenerS60S0400000_28.l0).LLJJJJLIIL);
        C1261860iwS c1261860iwS10 = ((C10LK) aCListenerS60S0400000_28.l0).LLJJL;
        if (c1261860iwS10 == null) {
            c1261860iwS10 = null;
        }
        smartRouteBuildRoute.withParam("matched_friend_strcut", c1261860iwS10.getMatchedFriendStruct());
        smartRouteBuildRoute.withParam("is_card", true);
        smartRouteBuildRoute.withParam("is_big_card", true);
        smartRouteBuildRoute.withParam("follow_recommned_enter_from", ((C10LK) aCListenerS60S0400000_28.l0).LLJJJJLIIL);
        smartRouteBuildRoute.withParam("scene_type", enumC1260920iuw.getType());
        C10LK c10lk5 = (C10LK) aCListenerS60S0400000_28.l0;
        RecSwipeViewModel recSwipeViewModel3 = c10lk5.LLJJJJ;
        if (recSwipeViewModel3 != null && (map = recSwipeViewModel3.LLJI) != null) {
            C1261860iwS c1261860iwS11 = c10lk5.LLJJL;
            if (c1261860iwS11 == null) {
                c1261860iwS11 = null;
            }
            Boolean bool2 = (Boolean) ((LinkedHashMap) map).get(c1261860iwS11.getUid());
            if (bool2 != null) {
                smartRouteBuildRoute.withParam("show_relation_label", String.valueOf(bool2.booleanValue()));
            }
        }
        if (C296550Bjp.LIZ()) {
            Bundle bundle = new Bundle();
            C1261860iwS c1261860iwS12 = c10lk5.LLJJL;
            if (c1261860iwS12 != null) {
                c1261860iwS = c1261860iwS12;
            }
            C786410Ut5.LJJIZ(bundle, "follow_recommend_nav_param", new C07WV(c1261860iwS.getRequestId(), false));
            smartRouteBuildRoute.withParam(bundle);
        }
        smartRouteBuildRoute.open();
        C238400w2 c238400w2 = (C238400w2) aCListenerS60S0400000_28.l2;
        long j = c238400w2.element + 1;
        c238400w2.element = j;
        TuxTextView tuxTextView = (TuxTextView) aCListenerS60S0400000_28.l3;
        C10LK c10lk6 = (C10LK) aCListenerS60S0400000_28.l0;
        String strLIZIZ = C1843500y4a.LIZIZ(j);
        c10lk6.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZIZ);
        sbLIZ.append("  ");
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onClick$2(ACListenerS60S0400000_28 aCListenerS60S0400000_28, View view) {
        ((Function1) aCListenerS60S0400000_28.l0).invoke(((C1913750ztt) C13LP.LJJJJZI((List) aCListenerS60S0400000_28.l1)).LIZJ);
        PNSKrDeviceConsentNewUI pNSKrDeviceConsentNewUI = (PNSKrDeviceConsentNewUI) aCListenerS60S0400000_28.l2;
        C1913700zto c1913700zto = (C1913700zto) aCListenerS60S0400000_28.l3;
        pNSKrDeviceConsentNewUI.getClass();
        List<KrConsentCheckbox> list = c1913700zto.LL;
        ArrayList<Pair> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (KrConsentCheckbox krConsentCheckbox : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new Pair(krConsentCheckbox, Boolean.valueOf(c1913700zto.LLILZ[i])));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        for (Pair pair : arrayList) {
            KrConsentCheckbox krConsentCheckbox2 = (KrConsentCheckbox) pair.getFirst();
            boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
            String str = krConsentCheckbox2.business;
            int i3 = 1;
            if (str != null && str.length() != 0) {
                String str2 = krConsentCheckbox2.policyVersion;
                if (str2 == null) {
                    str2 = "";
                }
                if (zBooleanValue) {
                    i3 = 2;
                }
                C100C.LIZ.LIZIZ().LIZ(new AwS1S2001000_28(str, str2, i3, 1));
            }
        }
    }

    public static final void onClick$3(ACListenerS60S0400000_28 aCListenerS60S0400000_28, View view) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("style", "bottom");
        c2344009Gk.LJIIIIZZ("action", "dismiss");
        c2344009Gk.LJIIIIZZ("business", "au_u16_visibility_options");
        c2344009Gk.LJIIIIZZ("enter_from", ((C1914960zvq) aCListenerS60S0400000_28.l0).LIZIZ);
        C20684815ws.LJIILLIIL("pns_popup_click", c2344009Gk.LIZ);
        C786410Ut5.LJLZ(8, ((C1914960zvq) aCListenerS60S0400000_28.l0).LIZ);
        Function0 function0 = (Function0) aCListenerS60S0400000_28.l1;
        if (function0 != null) {
            function0.invoke();
        }
        InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) aCListenerS60S0400000_28.l2;
        if (interfaceC1631630sYr != null) {
            CollectConsentParam collectConsentParam = (CollectConsentParam) aCListenerS60S0400000_28.l3;
            interfaceC1631630sYr.invoke(collectConsentParam.consentKey, EnumC1876780ywG.APPROVE, collectConsentParam.flow, collectConsentParam.scenario);
        }
    }

    public static final void onClick$4(ACListenerS60S0400000_28 aCListenerS60S0400000_28, View view) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("style", "bottom");
        c2344009Gk.LJIIIIZZ("action", "view_more");
        c2344009Gk.LJIIIIZZ("business", "au_u16_visibility_options");
        c2344009Gk.LJIIIIZZ("enter_from", ((C1914960zvq) aCListenerS60S0400000_28.l0).LIZIZ);
        C20684815ws.LJIILLIIL("pns_popup_click", c2344009Gk.LIZ);
        C786410Ut5.LJLZ(8, ((C1914960zvq) aCListenerS60S0400000_28.l0).LIZ);
        Function0 function0 = (Function0) aCListenerS60S0400000_28.l1;
        if (function0 != null) {
            function0.invoke();
        }
        String str = ((CollectConsentParam) aCListenerS60S0400000_28.l2).extra.get("view_more_popup_id");
        if (str != null) {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair(FollowStatusChangeMethod.PARAM_UID, str));
            c1227904rF.getClass();
            UserCommunicationProcessorModel userCommunicationProcessorModel = new UserCommunicationProcessorModel("PopupAPIProcessor", C1227904rF.LJI(mapLIZJ), null);
            C1518550pcT c1518550pcT = C1518550pcT.LIZ;
            Map mapLJ = C2097608Jq.LJ();
            c1518550pcT.getClass();
            C1518550pcT.LJI(userCommunicationProcessorModel, null, mapLJ);
        }
        InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) aCListenerS60S0400000_28.l3;
        if (interfaceC1631630sYr != null) {
            CollectConsentParam collectConsentParam = (CollectConsentParam) aCListenerS60S0400000_28.l2;
            interfaceC1631630sYr.invoke(collectConsentParam.consentKey, EnumC1876780ywG.APPROVE, collectConsentParam.flow, collectConsentParam.scenario);
        }
    }

    public static final void onClick$5(ACListenerS60S0400000_28 aCListenerS60S0400000_28, View view) {
        ((Set) aCListenerS60S0400000_28.l0).add(((UniversalPopupAction) aCListenerS60S0400000_28.l1).actionId);
        ((InterfaceC1914580zvE) aCListenerS60S0400000_28.l2).pl((UniversalPopupAction) aCListenerS60S0400000_28.l1, ((UniversalPopupBlockElement) aCListenerS60S0400000_28.l3).groupId, null);
    }

    public static final void onClick$6(ACListenerS60S0400000_28 aCListenerS60S0400000_28, View view) {
        ((TuxSheet) aCListenerS60S0400000_28.l0).dismiss();
        ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) aCListenerS60S0400000_28.l1;
        if (referralFeedBanner != null) {
            referralFeedBanner.needAgeGate = false;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1888390zEz((AgeGatePopup) aCListenerS60S0400000_28.l3, null), 3);
        ((Function0) aCListenerS60S0400000_28.l2).invoke();
        C1894320zOY.LIZ.getClass();
        C1894320zOY.LIZJ(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$7(Y.ACListenerS60S0400000_28 r15, android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS60S0400000_28.onClick$7(Y.ACListenerS60S0400000_28, android.view.View):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS60S0400000_28(X.C1914960zvq r2, com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam r3, kotlin.jvm.internal.AwS429S0200000_28 r4, X.C1914980zvs r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 3 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r5
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r5
            r0.l3 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS60S0400000_28.<init>(X.0zvq, com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam, kotlin.jvm.internal.AwS429S0200000_28, X.0zvs, int):void");
    }

    public ACListenerS60S0400000_28(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
