package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0zim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1906860zim extends AbstractC1906850zil {
    public final String andText;
    public final int normalTextColor;
    public final int pressedTextColor;
    public static final C1242450iR9 Companion = new C1242450iR9();
    public static final int $stable = 8;
    public static final boolean isDebug = false;

    @Override // X.AbstractC1906850zil
    public int getRootId() {
        return R.id.pf1;
    }

    public C1906860zim(View view) {
        super(view);
        this.normalTextColor = C960203pA.LIZ(R.attr.a1h, this.mContext);
        this.pressedTextColor = C960203pA.LIZ(R.attr.a1j, this.mContext);
        C1902850zcJ.LIZ.getClass();
        Object obj = ((Map) ((C1902840zcI) C1902850zcJ.LIZIZ.getValue()).LJ.getValue()).get("AND_TEXT");
        String string = (String) (obj == null ? null : obj);
        if (string == null) {
            C844470XAv.LIZ.getClass();
            string = C844470XAv.LIZ().getString(2131838297);
        }
        this.andText = string;
    }

    public HashMap<String, String> buildOpenAwemeLogExtra(HashMap<String, String> map) {
        String accountType;
        String string;
        if (map == null) {
            map = new HashMap<>();
        }
        BaseNotice baseNotice = this.mMTBaseNotice;
        if (baseNotice != null) {
            accountType = baseNotice.getAccountType();
        } else {
            accountType = null;
        }
        map.put("account_type", accountType);
        String str = C1900870zZ7.LIZ;
        if (str != null) {
            map.put("inbox_position", str);
        }
        BaseNotice baseNotice2 = this.mMTBaseNotice;
        if (baseNotice2 == null || (string = Integer.valueOf(baseNotice2.type).toString()) == null) {
            string = "";
        }
        map.put("notice_message_type", string);
        InterfaceC1906840zik interfaceC1906840zik = this.vm;
        if (interfaceC1906840zik != null) {
            interfaceC1906840zik.Dx2();
        }
        map.put("sort_option_name", null);
        InterfaceC1906840zik interfaceC1906840zik2 = this.vm;
        if (interfaceC1906840zik2 != null) {
            interfaceC1906840zik2.Dx2();
        }
        map.put("notification_tab_name", null);
        return map;
    }

    public final int getNextFollowStatus(User user) {
        int followStatus = user.getFollowStatus();
        if ((followStatus != 0 && followStatus != 4) || user.getFollowStatus() == 4) {
            return 0;
        }
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return 1;
        }
        return 4;
    }

    public final boolean isNewFollowerNotice(BaseNotice baseNotice) {
        if (baseNotice != null && baseNotice.followNotice != null) {
            return true;
        }
        return false;
    }

    public final C1252610ihX recommendParamsOfUser(User user, EnumC1260920iuw enumC1260920iuw) {
        Integer numValueOf;
        Video video;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null) {
            return null;
        }
        List<? extends Aweme> list = matchedFriendStruct.awemeList;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        matchedFriendStruct.setAwemeListSize(numValueOf);
        List<? extends Aweme> list2 = matchedFriendStruct.awemeList;
        int i = 0;
        if (list2 != null && !list2.isEmpty()) {
            i = 0;
            for (Aweme aweme : list2) {
                if (aweme != null && (video = aweme.getVideo()) != null && video.getCover() != null && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        matchedFriendStruct.setAwemeListVideoCoverSize(Integer.valueOf(i));
        matchedFriendStruct.setAwemeList(null);
        String str = matchedFriendStruct.recType;
        C1252610ihX.Companion.getClass();
        return new C1252610ihX("notification_page", "notification_page", enumC1260920iuw, str, C736420Sue.LIZ(user), user.getUid(), null, null, "", null, matchedFriendStruct.relationType, matchedFriendStruct.socialInfo, matchedFriendStruct, null, null, null, false, null, null, null, null, false, null, false, null);
    }

    public void onNameClicked(View view, User user, int i) {
        markHasRead(null);
    }

    public final void resetTitleMaxLine(TextView textView, boolean z, boolean z2) {
        if (!z && !z2) {
            textView.setMaxLines(2);
        } else {
            textView.setMaxLines(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HashMap buildOpenAwemeLogExtra$default(C1906860zim c1906860zim, HashMap map, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                map = null;
            }
            return c1906860zim.buildOpenAwemeLogExtra(map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildOpenAwemeLogExtra");
    }

    public final void ctrlFollowTextVisibilityAndMob$awemenotice_release(C1908730zln c1908730zln, String str, List<? extends User> list, boolean z) {
        User user;
        C1906910zir.LIZ.LIZIZ(c1908730zln, str, list, z, null);
        if (list != null) {
            user = (User) C13LP.LJJJLL(list);
        } else {
            user = null;
        }
        this.bindedUser = user;
    }

    public final C1360500lVY getClickableNameSpan(List<? extends User> list, Integer num, BaseNotice baseNotice, String str) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return createNameSpan(list, 100, iIntValue, baseNotice, false, null, null, str);
    }

    public final void setRelationLabel(C0QB7 c0qb7, List<? extends User> list, View view, View view2) {
        User userLIZ;
        if (list != null && (userLIZ = C1906900ziq.LIZ(list)) != null) {
            C0Q0M.LIZ(c0qb7, userLIZ.getMatchedFriendStruct());
        } else {
            C0DTR.LIZIZ(c0qb7);
        }
    }

    private final C1360520lVa appendUserName(C1360520lVa c1360520lVa, User user, BaseNotice baseNotice, String str, String str2) {
        C1906140zhc.LIZ.getClass();
        String strLIZJ = C1906140zhc.LIZJ(user);
        if (!TextUtils.isEmpty(strLIZJ)) {
            c1360520lVa.LJ(strLIZJ, obtainNameSpan$default(this, user, 0, baseNotice, false, null, str, 24, null));
        }
        return c1360520lVa;
    }

    public static /* synthetic */ C1252610ihX recommendParamsOfUser$default(C1906860zim c1906860zim, User user, EnumC1260920iuw enumC1260920iuw, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                enumC1260920iuw = EnumC1260920iuw.RELATION_LABEL;
            }
            return c1906860zim.recommendParamsOfUser(user, enumC1260920iuw);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recommendParamsOfUser");
    }

    public final void setTemplateClickableNameText(TextView textView, List<? extends User> list, Integer num, BaseNotice baseNotice, String str) {
        textView.setTag("");
        textView.setText(getClickableNameSpan(list, num, baseNotice, str));
        C431420Gvs c431420Gvs = C431420Gvs.LIZ;
        c431420Gvs.getClass();
        textView.setMovementMethod(c431420Gvs);
        if (list != null && list.size() == 1 && C1908030zkf.LJIIJ(this.mContext, new UserVerify(null, ((User) ListProtector.get(list, 0)).getCustomVerify(), ((User) ListProtector.get(list, 0)).getEnterpriseVerifyReason(), -1), textView)) {
            textView.setTag(" T");
        }
    }

    private final C1906800zig obtainNameSpan(User user, final int i, final BaseNotice baseNotice, boolean z, final String str, String str2) {
        return new C1906800zig(user, i, this.normalTextColor, this.pressedTextColor, new InterfaceC1906810zih() { // from class: X.0zij
            @Override // X.InterfaceC1906810zih
            public final void LIZ(View view, User user2, int i2) {
                String enterFrom;
                String str3;
                int i3;
                String accountType;
                this.LIZ.onNameClicked(view, user2, i2);
                int i4 = i;
                String accountType2 = null;
                if (i4 != 0) {
                    if (i4 != 2) {
                        if (i4 == 100) {
                            Activity activityLIZ = C1388190mED.LIZ(this.LIZ.mContext);
                            if (activityLIZ != null) {
                                C19724912Fj.LIZLLL().LJI(activityLIZ, str);
                            } else {
                                C19724912Fj.LIZLLL().LJII(str);
                            }
                        }
                    } else {
                        C1906860zim c1906860zim = this.LIZ;
                        BaseNotice baseNotice2 = baseNotice;
                        if (baseNotice2 != null) {
                            accountType = baseNotice2.getAccountType();
                        } else {
                            accountType = null;
                        }
                        int wrappedLayoutPosition = this.LIZ.getWrappedLayoutPosition();
                        InterfaceC1906840zik interfaceC1906840zik = this.LIZ.vm;
                        if (interfaceC1906840zik != null) {
                            accountType2 = interfaceC1906840zik.getEnterFrom();
                        }
                        c1906860zim.logNotificationClick(accountType, wrappedLayoutPosition, accountType2);
                        SmartRouter.buildRoute(view.getContext(), "aweme://check_profile").open();
                    }
                } else {
                    C1242450iR9 c1242450iR9 = C1906860zim.Companion;
                    c1242450iR9.getClass();
                    if (TextUtils.equals("notification_page", "fans")) {
                        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
                        Context context = this.LIZ.mContext;
                        BaseNotice baseNotice3 = baseNotice;
                        if (baseNotice3 != null) {
                            i3 = baseNotice3.clientOrder;
                        } else {
                            i3 = -1;
                        }
                        c1906140zhc.getClass();
                        C1906140zhc.LIZLLL(context, i3);
                    }
                    if (user2 != null) {
                        C1906170zhf c1906170zhf = C1906170zhf.LIZ;
                        C1906860zim c1906860zim2 = this.LIZ;
                        BaseNotice baseNotice4 = baseNotice;
                        c1906170zhf.getClass();
                        C1906170zhf.LIZ(c1906860zim2, user2, baseNotice4);
                        if (this.LIZ.isNewFollowerNotice(baseNotice) && C1245020iVI.LIZLLL(user2)) {
                            C1906860zim c1906860zim3 = this.LIZ;
                            if (C0ZC2.LIZ()) {
                                str3 = "merged_activity_follower";
                            } else {
                                str3 = "new_followers";
                            }
                            EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.RELATION_LABEL;
                            BaseNotice baseNotice5 = this.LIZ.mMTBaseNotice;
                            if (baseNotice5 != null) {
                                accountType2 = baseNotice5.getAccountType();
                            }
                            c1906860zim3.enterProfileWithRecommendParams(user2, "notification_page", str3, enumC1260920iuw, true, accountType2);
                        } else {
                            String uid = user2.getUid();
                            String str4 = "";
                            if (uid == null) {
                                uid = "";
                            }
                            String secUid = user2.getSecUid();
                            if (secUid != null) {
                                str4 = secUid;
                            }
                            InterfaceC1906840zik interfaceC1906840zik2 = this.LIZ.vm;
                            if (interfaceC1906840zik2 != null) {
                                enterFrom = interfaceC1906840zik2.getEnterFrom();
                            } else {
                                enterFrom = null;
                            }
                            C1242450iR9.LIZ(c1242450iR9, uid, str4, enterFrom, baseNotice, true, null, C1906860zim.buildOpenAwemeLogExtra$default(this.LIZ, null, 1, null), null, null, null, 928);
                        }
                    }
                }
                BaseNotice baseNotice6 = baseNotice;
                if (baseNotice6 != null) {
                    baseNotice6.hasRead = true;
                }
            }
        });
    }

    public final void enterProfileWithRecommendParams(User user, String str, String str2, EnumC1260920iuw enumC1260920iuw, boolean z, String str3) {
        String str4;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJJJZI(user);
        c1260910iuv.LJJIJLIJ(str);
        c1260910iuv.LJJJJIZL(str2);
        c1260910iuv.LJJLIIIJJI = EnumC1260930iux.ENTER_PROFILE;
        c1260910iuv.LJJLIIIJILLIZJL = enumC1260920iuw;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJIILJJIL();
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LJJLIIJ = user.getUid();
        c735410St1.LIZLLL = str;
        C1365450ldX.LIZLLL(c735410St1, user);
        c735410St1.LJZ = str2;
        c735410St1.LJZI = str3;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null || (str4 = matchedFriendStruct.recType) == null) {
            str4 = "";
        }
        c735410St1.LJIJJ = str4;
        c735410St1.LJZL = Boolean.valueOf(z);
        c735410St1.LJIILJJIL();
        Context contextLIZ = C1388190mED.LIZ(this.mContext);
        if (contextLIZ == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(contextLIZ, "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", user.getUid());
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        C1357130lQ7.LJ(smartRouteBuildRoute, buildOpenAwemeLogExtra$default(this, null, 1, null));
        if (C703302op.LIZ(str2)) {
            smartRouteBuildRoute.withParam("position", str2);
        }
        C1252610ihX c1252610ihXRecommendParamsOfUser$default = recommendParamsOfUser$default(this, user, null, 2, null);
        if (c1252610ihXRecommendParamsOfUser$default != null) {
            smartRouteBuildRoute.withParam("recommend_enter_profile_params", c1252610ihXRecommendParamsOfUser$default);
        }
        smartRouteBuildRoute.open();
    }

    public final void setClickableText(TextView textView, SpannableStringBuilder spannableStringBuilder, int i, int i2, User user, BaseNotice baseNotice, String str) {
        C786410Ut5.q2(spannableStringBuilder, obtainNameSpan$default(this, user, 0, baseNotice, false, null, str, 24, null), i, i2, 33);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(this.normalTextColor), i, i2, 33);
        textView.setMovementMethod(C431440Gvu.LIZ());
    }

    private final C1360500lVY createNameSpan(List<? extends User> list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2, String str3) {
        C1906800zig c1906800zigObtainNameSpan;
        C1360520lVa c1360520lVa = new C1360520lVa();
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                appendUserName(c1360520lVa, (User) ListProtector.get(list, 0), baseNotice, str, str2);
            } else if (list.size() == 2 && 1 <= i2 && i2 < 4) {
                appendUserName(c1360520lVa, (User) ListProtector.get(list, 0), baseNotice, str, str2);
                c1360520lVa.LIZ.append((CharSequence) " ");
                c1360520lVa.LIZ.append((CharSequence) this.andText);
                c1360520lVa.LIZ.append((CharSequence) " ");
                appendUserName(c1360520lVa, (User) ListProtector.get(list, 1), baseNotice, str, str2);
            } else if (list.size() == 3 || (i2 == 3 && list.size() > 3)) {
                appendUserName(c1360520lVa, (User) ListProtector.get(list, 0), baseNotice, str, str2);
                c1360520lVa.LIZ.append((CharSequence) ", ");
                appendUserName(c1360520lVa, (User) ListProtector.get(list, 1), baseNotice, str, str2);
                c1360520lVa.LIZ.append((CharSequence) " ");
                c1360520lVa.LIZ.append((CharSequence) this.andText);
                c1360520lVa.LIZ.append((CharSequence) " ");
                appendUserName(c1360520lVa, (User) ListProtector.get(list, 2), baseNotice, str, str2);
            } else if (list.size() > 1) {
                String string = this.mContext.getString(2131838296, Integer.valueOf(Math.max(i2, list.size()) - 2));
                if (i == 2) {
                    c1906800zigObtainNameSpan = obtainNameSpan$default(this, null, 2, baseNotice, false, null, str, 24, null);
                } else {
                    c1906800zigObtainNameSpan = obtainNameSpan(null, 100, baseNotice, z, str3, str);
                }
                appendUserName(c1360520lVa, (User) ListProtector.get(list, 0), baseNotice, str, str2);
                c1360520lVa.LIZ.append((CharSequence) ", ");
                appendUserName(c1360520lVa, (User) ListProtector.get(list, 1), baseNotice, str, str2);
                c1360520lVa.LIZ.append((CharSequence) " ");
                c1360520lVa.LIZ.append((CharSequence) this.andText);
                c1360520lVa.LIZ.append((CharSequence) " ");
                c1360520lVa.LIZJ(string, c1906800zigObtainNameSpan, 33);
            }
        }
        return c1360520lVa.LIZ;
    }

    public static /* synthetic */ C1906800zig obtainNameSpan$default(C1906860zim c1906860zim, User user, int i, BaseNotice baseNotice, boolean z, String str, String str2, int i2, Object obj) {
        String str3 = str;
        boolean z2 = z;
        BaseNotice baseNotice2 = baseNotice;
        if (obj == null) {
            String str4 = null;
            if ((i2 & 4) != 0) {
                baseNotice2 = null;
            }
            if ((i2 & 8) != 0) {
                z2 = true;
            }
            if ((i2 & 16) != 0) {
                str3 = null;
            }
            if ((i2 & 32) == 0) {
                str4 = str2;
            }
            return c1906860zim.obtainNameSpan(user, i, baseNotice2, z2, str3, str4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: obtainNameSpan");
    }
}
