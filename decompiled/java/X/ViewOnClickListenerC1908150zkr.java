package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.notification.UserListActivity;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC1908150zkr extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public DiggInfo LLJ;
    public final String LLJI;
    public C0ZE7 LLJIJIL;
    public C1908250zl1 LLJILJIL;
    public final C01GW LLJILJILJ;
    public Map<String, String> LLJILLL;
    public EnumC896030ZDd LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    public final String L5() {
        EnumC896030ZDd enumC896030ZDd = this.LLJJ;
        int i = enumC896030ZDd == null ? -1 : C896050ZDf.LIZ[enumC896030ZDd.ordinal()];
        if (i == 1) {
            return "activity_aggregation_page_fav";
        }
        if (i == 2) {
            return "activity_aggregation_page_repost";
        }
        C1908200zkw c1908200zkwA6 = a6();
        return (c1908200zkwA6 == null || c1908200zkwA6.LIZIZ != 3) ? "activity_aggregation_page_like" : "activity_aggregation_page_like_comment";
    }

    public final C1907300zjU P5() {
        return (C1907300zjU) this.LLILLJJLI.getValue();
    }

    public final C0QB7 R5() {
        return (C0QB7) this.LLILZLL.getValue();
    }

    public final C1908730zln S5() {
        return (C1908730zln) this.LLJILJILJ.getValue();
    }

    public final RelationButton T5() {
        return (RelationButton) this.LLIZ.getValue();
    }

    public final void U5() {
        Aweme aweme;
        User user;
        UserListActivity userListActivity;
        Integer num;
        String str;
        String str2;
        String str3;
        DiggInfo diggInfo = this.LLJ;
        if (diggInfo == null || (aweme = diggInfo.aweme) == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
        String str4 = "";
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "");
        smartRouteBuildRoute.withParam("duo_type", "duo_detail");
        smartRouteBuildRoute.withParam("show_add_yours_button", 1);
        C0ZE7 c0ze7 = this.LLJIJIL;
        if (c0ze7 != null && (num = c0ze7.LJIIIIZZ) != null && num.intValue() == 22) {
            C0ZE7 c0ze72 = this.LLJIJIL;
            if (c0ze72 == null || (str = c0ze72.LIZLLL) == null) {
                str = "";
            }
            smartRouteBuildRoute.withParam("refer", str);
            C1908250zl1 c1908250zl1 = this.LLJILJIL;
            if (c1908250zl1 == null || (str2 = c1908250zl1.LIZ) == null) {
                str2 = "";
            }
            smartRouteBuildRoute.withParam("account_type", str2);
            C1908250zl1 c1908250zl12 = this.LLJILJIL;
            if (c1908250zl12 != null && (str3 = c1908250zl12.LIZIZ) != null) {
                str4 = str3;
            }
            smartRouteBuildRoute.withParam("prop_id", str4);
        }
        smartRouteBuildRoute.open();
        DiggInfo diggInfo2 = this.LLJ;
        if (diggInfo2 == null || (user = diggInfo2.user) == null) {
            return;
        }
        Context context = this.itemView.getContext();
        if (!(context instanceof UserListActivity) || (userListActivity = (UserListActivity) context) == null) {
            return;
        }
        userListActivity.LLZ(getAdapterPosition(), user, "click");
    }

    public final C1908200zkw a6() {
        UserListActivity userListActivity;
        Context context = this.itemView.getContext();
        if (!(context instanceof UserListActivity) || (userListActivity = (UserListActivity) context) == null) {
            return null;
        }
        return userListActivity.LLZLI();
    }

    public static final ILightInteractionPlatformService N5() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    public ViewOnClickListenerC1908150zkr(View view) {
        super(view);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 471));
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(view, 469));
        this.LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 468));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS572S0100000_28(view, 473));
        this.LLILZ = c01gwLIZIZ2;
        this.LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 472));
        this.LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 470));
        this.LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 475));
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS572S0100000_28(view, 478));
        this.LLIZLLLIL = c01gwLIZIZ3;
        this.LLJI = "notification_page";
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 474));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 477));
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        View view2 = (View) c01gwLIZIZ.getValue();
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.CELL;
        c1906140zhc.getClass();
        C1906140zhc.LIZ(view2, enumC1906160zhe, 0.0f);
        C1906140zhc.LIZ(P5().getAvatarImageView(), EnumC1906160zhe.AVATAR, 0.0f);
        C786410Ut5.ga(P5(), this);
        C786410Ut5.h9((TuxTextView) c01gwLIZIZ2.getValue(), this);
        C786410Ut5.Y7((ConstraintLayout) c01gwLIZIZ.getValue(), this);
        C786410Ut5.H9((C424560Gko) c01gwLIZIZ3.getValue(), this);
        this.LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(view, 476));
    }

    public final void V5(User user) {
        Integer num;
        Map mapLJ;
        String str;
        UserListActivity userListActivity;
        String str2;
        C0ZE7 c0ze7 = this.LLJIJIL;
        if (c0ze7 != null) {
            num = c0ze7.LJIIIIZZ;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 22) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1908250zl1 c1908250zl1 = this.LLJILJIL;
            if (c1908250zl1 == null || (str2 = c1908250zl1.LIZIZ) == null) {
                str2 = "";
            }
            linkedHashMap.put("prop_id", str2);
            mapLJ = linkedHashMap;
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        C1242450iR9 c1242450iR9 = C1906860zim.Companion;
        String uid = user.getUid();
        String secUid = user.getSecUid();
        String str3 = this.LLJI;
        C1908250zl1 c1908250zl12 = this.LLJILJIL;
        if (c1908250zl12 == null || (str = c1908250zl12.LIZ) == null) {
            str = "";
        }
        C1242450iR9.LIZ(c1242450iR9, uid, secUid, str3, null, false, null, null, null, str, mapLJ, 248);
        Context context = this.itemView.getContext();
        if ((context instanceof UserListActivity) && (userListActivity = (UserListActivity) context) != null) {
            userListActivity.LLZ(getAdapterPosition(), user, "click");
        }
        if (R5().getVisibility() == 0) {
            if (C1264800j1C.LIZIZ()) {
                X5(EnumC1260930iux.ENTER_PROFILE, user);
            } else {
                C1075780e6K.LIZLLL("enter_profile", "", "like_list", user, null);
            }
        }
        C0ZE7 c0ze72 = this.LLJIJIL;
        if (c0ze72 != null) {
            c0ze72.LJFF = "profile";
            C897490ZIt.LIZIZ(c0ze72);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        User user;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                DiggInfo diggInfo = this.LLJ;
                if (diggInfo != null && (user = diggInfo.user) != null) {
                    int id = view.getId();
                    if (id != R.id.pe1 && id != R.id.pel) {
                        if (id == R.id.pf1) {
                            DiggInfo diggInfo2 = this.LLJ;
                            if (diggInfo2 != null && diggInfo2.aweme != null) {
                                U5();
                                return;
                            } else {
                                V5(user);
                                return;
                            }
                        }
                        if (id != R.id.video_cover) {
                            return;
                        }
                        U5();
                        return;
                    }
                    V5(user);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
    }

    public static void X5(EnumC1260930iux enumC1260930iux, User user) {
        String str;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ("notification_page");
        c1260910iuv.LJJLIIIJILLIZJL = C1264800j1C.LIZJ();
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        String str2 = null;
        if (matchedFriendStruct != null) {
            str = matchedFriendStruct.recType;
        } else {
            str = null;
        }
        c1260910iuv.LJJJJJL(str);
        String str3 = "";
        c1260910iuv.LJJIL("");
        String uid = user.getUid();
        if (uid != null) {
            str3 = uid;
        }
        c1260910iuv.LJJLIIIJL = str3;
        MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
        if (matchedFriendStruct2 != null) {
            str2 = matchedFriendStruct2.relationType;
        }
        c1260910iuv.LJJJJL(str2);
        c1260910iuv.LJJJJZI(user);
        c1260910iuv.LJIILJJIL();
    }

    public final void I5(User user, C894700Z8a c894700Z8a) {
        boolean z;
        RelationButton relationButtonT5 = T5();
        C1387050mCN c1387050mCN = new C1387050mCN(user);
        c1387050mCN.LJ = EnumC1387060mCO.MESSAGE_AFTER_NUDGE;
        if (R5().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        c1387050mCN.LJIIJ = z;
        Map<String, String> map = this.LLJILLL;
        if (map != null) {
            c1387050mCN.LJI.putAll(map);
        }
        relationButtonT5.LLLLZIL(c1387050mCN.LIZ());
        relationButtonT5.setTracker(new AwS265S0300000_21(a6(), c894700Z8a, user, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W5(com.ss.android.ugc.aweme.profile.model.User r15, com.ss.android.ugc.aweme.relation.follow.ui.RelationButton r16, X.C1908200zkw r17) {
        /*
            r14 = this;
            r5 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r5)
            com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService r3 = r0.getImNudgeAndStreakService()
            r2 = 1
            r4 = r17
            if (r4 == 0) goto La9
            int r1 = r4.LIZIZ
            r0 = 3
            if (r1 != r0) goto La9
            r0 = 1
        L14:
            r7 = r0 ^ 1
            if (r4 == 0) goto L2b
            X.0ZDd r0 = r4.LIZLLL
            int[] r1 = X.C896050ZDf.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto La6
            r0 = 2
            if (r1 == r0) goto La3
            X.0IB7 r8 = X.C0IB7.LIKE
        L29:
            if (r8 != 0) goto L2d
        L2b:
            X.0IB7 r8 = X.C0IB7.NONE
        L2d:
            X.0mCN r2 = new X.0mCN
            r2.<init>(r15)
            X.0mCO r0 = X.EnumC1387060mCO.MESSAGE_NUDGE
            r2.LJ = r0
            X.0SY7 r6 = X.C0SY7.FOLLOW_MUTUAL
            java.lang.Integer r1 = r3.LJIJJ()
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r6, r1)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r0)
            r2.LIZIZ(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r6, r1)
            java.util.Map r1 = X.C2097908Jt.LIZJ(r0)
            java.util.Map<X.0SY7, java.lang.Boolean> r0 = r2.LJIIIZ
            if (r1 == 0) goto L5a
            r0.putAll(r1)
        L5a:
            X.0QB7 r0 = r14.R5()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L65
            r5 = 1
        L65:
            r2.LJIIJ = r5
            X.0ZDI r5 = X.C0ZDI.RELATION_BUTTON_COMBINE
            r11 = 0
            if (r4 == 0) goto La1
            java.io.Serializable r9 = r4.LIZ
        L6e:
            if (r7 == 0) goto L78
            if (r4 == 0) goto L74
            java.io.Serializable r11 = r4.LIZ
        L74:
            com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent r11 = r3.LJFF(r11, r8)
        L78:
            if (r4 == 0) goto L7e
            X.0ZDd r6 = r4.LIZLLL
            if (r6 != 0) goto L80
        L7e:
            X.0ZDd r6 = X.EnumC896030ZDd.ACTIVITY_AGGREGATED_LIKE_LIST
        L80:
            java.lang.String r10 = r15.getUid()
            X.0ZD9 r4 = new X.0ZD9
            r12 = 0
            r13 = 128(0x80, float:1.8E-43)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.LJIILL = r4
            java.util.Map<java.lang.String, java.lang.String> r1 = r14.LLJILLL
            if (r1 == 0) goto L97
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.LJI
            r0.putAll(r1)
        L97:
            X.0zlx r0 = r2.LIZ()
            r1 = r16
            r1.LLLLZIL(r0)
            return
        La1:
            r9 = r11
            goto L6e
        La3:
            X.0IB7 r8 = X.C0IB7.REPOST
            goto L29
        La6:
            X.0IB7 r8 = X.C0IB7.FAVOURITE
            goto L29
        La9:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1908150zkr.W5(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.relation.follow.ui.RelationButton, X.0zkw):void");
    }
}
