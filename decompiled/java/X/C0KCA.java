package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubGiftTermsRegionSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubEuRegionSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubPackageTermsSchemaSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubUsRegionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KCA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KCA {
    public static final /* synthetic */ int LIZ = 0;

    public static C0KJX LIZJ(C0KCF c0kcf, Boolean bool) {
        boolean zBooleanValue;
        if (c0kcf != null) {
            String str = c0kcf.LIZ;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = c0kcf.LIZLLL;
            }
            return new C0KJX(str, zBooleanValue, c0kcf.LJ, c0kcf.LJFF, c0kcf.LJJIII, c0kcf.LJJIIJ, false, null, c0kcf.LJI, null, new C0KKO() { // from class: X.0KCN
                @Override // X.C0KKO
                public final void LIZ(int i, String str2) {
                }

                @Override // X.C0KKO
                public final void LIZIZ() {
                }

                @Override // X.C0KKO
                public final void LIZJ(String str2) {
                }

                @Override // X.C0KKO
                public final void LIZLLL(int i, int i2, int i3, String str2, C0KH1 c0kh1) {
                }

                @Override // X.C0KKO
                public final void LJ(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map, C0KH1 c0kh1) {
                }

                @Override // X.C0KKO
                public final void LJFF(long j, TemplateListData templateListData) {
                }
            }, null, c0kcf.LJJIIJZLJL, 31424);
        }
        return null;
    }

    public static SpannableStringBuilder LIZ(final UpdateTips updateTips, final Context context, final boolean z) {
        int i;
        ForegroundColorSpan foregroundColorSpan;
        Integer numLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(updateTips.desc);
        sbLIZ.append(updateTips.btnText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        try {
            final C238400w2 c238400w2 = new C238400w2();
            ClickableSpan clickableSpan = new ClickableSpan() { // from class: X.0JzY
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    String str;
                    if (Math.abs(c238400w2.element - System.currentTimeMillis()) < 800) {
                        return;
                    }
                    c238400w2.element = System.currentTimeMillis();
                    C495520Jby c495520Jby = new C495520Jby(updateTips.schemaUrl);
                    Context context2 = context;
                    if (context2 != null) {
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context2, c495520Jby.LIZLLL());
                    }
                    if (z) {
                        long currentUserId = UserService.getInstance().user().getCurrentUserId();
                        UpdateTips updateTips2 = updateTips;
                        if (updateTips2 == null || (str = updateTips2.id) == null) {
                            str = "";
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_page_subscription_update_click");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "anchor_id");
                        c474500IjALIZ.LJJII("learn_more", "click_type");
                        c474500IjALIZ.LJJII(str, "tip_id");
                        c474500IjALIZ.LIZ();
                        return;
                    }
                    C0KDR.LJIIL(true, "learn_more", updateTips);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            };
            int iLJJJ = a0.LJJJ(spannableStringBuilder, updateTips.btnText, 0, false, 6);
            int length = updateTips.btnText.length() + iLJJJ;
            C786410Ut5.q2(spannableStringBuilder, clickableSpan, iLJJJ, length, 18);
            if (C497740JfY.LJJ()) {
                i = OppoPermissionPopupMaskDelayExp.DEFAULT;
            } else {
                i = 500;
            }
            C1119920fFW.LJ(context, spannableStringBuilder, iLJJJ, length, 33, 7, i);
            if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, context)) == null) {
                foregroundColorSpan = null;
            } else {
                foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
            }
            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, iLJJJ, length, 33);
            return spannableStringBuilder;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("build spannable error", e);
            return spannableStringBuilder;
        }
    }

    public static SpannableStringBuilder LIZIZ(Context context, final Context context2, final Function0 function0) {
        String strLJIJI;
        int length;
        int length2;
        Context context3;
        ForegroundColorSpan foregroundColorSpan;
        Integer numLIZJ;
        int value = LiveSubGiftTermsRegionSetting.INSTANCE.getValue();
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    strLJIJI = C497740JfY.LJIJI(2131844389);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131844389);
                }
            } else {
                strLJIJI = C497740JfY.LJIJI(2131844391);
            }
        } else {
            strLJIJI = C497740JfY.LJIJI(2131844390);
        }
        String strLJIJJ = C497740JfY.LJIJJ(2131844392, strLJIJI);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJJ);
        if (context2 == null && context == null) {
            return spannableStringBuilder;
        }
        if (strLJIJJ != null) {
            length = strLJIJJ.length();
        } else {
            length = 0;
        }
        if (strLJIJI != null) {
            length2 = strLJIJI.length();
        } else {
            length2 = 0;
        }
        int i = length - (length2 + 1);
        if (context == null) {
            context3 = context2;
        } else {
            context3 = context;
        }
        C1119920fFW.LJ(context3, spannableStringBuilder, i, length, 33, 8, 500);
        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0KCQ
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                String str;
                if (SubUsRegionSetting.INSTANCE.isUsRegion()) {
                    str = "us-ttp";
                } else if (SubEuRegionSetting.INSTANCE.isEuRegion()) {
                    str = "eu-ttp";
                } else {
                    str = "row";
                }
                C0KCA.LJ(context2, SubPackageTermsSchemaSetting.INSTANCE.getSchema(str), false, -1);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, i, length, 33);
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, context)) != null) {
            foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
        } else {
            foregroundColorSpan = null;
        }
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, i, length, 33);
        if (function0 != null) {
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0KCW
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    function0.invoke();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            }, 0, i - 1, 33);
        }
        return spannableStringBuilder;
    }

    public static void LIZLLL(C0KCF c0kcf, Boolean bool, Context context) {
        String userSubscribeStateScheme;
        String str;
        if (c0kcf == null) {
            return;
        }
        C389001fE.LIZ("user_subscribe_success", new JSONObject(), System.currentTimeMillis(), false);
        if (c0kcf.LJIJI > 0 || Intrinsics.LJFF(bool, Boolean.TRUE)) {
            if (c0kcf.LJIJI != 2 && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
                userSubscribeStateScheme = LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_state_five_split();
            } else {
                userSubscribeStateScheme = LiveSubscribeLynxUrl.INSTANCE.getValue().getUserSubscribeStateScheme();
                if (userSubscribeStateScheme.length() == 0) {
                    userSubscribeStateScheme = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_subscription%2Fpages%2Fuser%2Fsubscribe%2Fstate.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&hide_loading=1&trans_status_bar=0&use_spark=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Fsubscription";
                }
            }
            C495520Jby c495520Jby = new C495520Jby(userSubscribeStateScheme);
            c495520Jby.LIZJ("anchor_id", c0kcf.LIZ);
            c495520Jby.LIZJ("log_anchor_id", c0kcf.LIZ);
            c495520Jby.LIZJ("sec_anchor_id", c0kcf.LIZ);
            c495520Jby.LIZJ("subscribe_state", C0KBI.SUBSCRIBED_NOT_EXPIRED.getState());
            c495520Jby.LIZJ("show_entrance", "subscription_succeed");
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                str = "homepage";
            } else {
                str = "";
            }
            c495520Jby.LIZJ("enter_type", str);
            c495520Jby.LIZJ("previous_page", "live_subscription_user_template");
            c495520Jby.LIZIZ(System.currentTimeMillis(), "click_time");
            c495520Jby.LIZJ("room_id", c0kcf.LJIILJJIL);
            c495520Jby.LIZJ("show_entrance", c0kcf.LJII);
            c495520Jby.LIZJ("privilege_show_type", c0kcf.LJIIL);
            c495520Jby.LIZJ("privilege_page", c0kcf.LJIILIIL);
            c495520Jby.LIZJ("show_entrance", c0kcf.LJII);
            c495520Jby.LIZJ("from_sub_enter", c0kcf.LJIIJ);
            c495520Jby.LIZJ("current_page", "user_template");
            c495520Jby.LIZ(Intrinsics.LJFF(c0kcf.LIZJ, "sub_change_price_email") ? 1 : 0, "is_price_change");
            String strLIZLLL = c495520Jby.LIZLLL();
            strLIZLLL.toString();
            C0K8F c0k8f = C0K8F.LIZ;
            Context contextLJJIIZI = C520010KaN.LJJIIZI(context, true);
            c0k8f.getClass();
            C0K8F.LJII(contextLJJIIZI, strLIZLLL, null);
        }
    }

    public static void LJ(Context context, String str, boolean z, Integer num) {
        C760370TsB c760370TsBLIZ;
        if (context == null) {
            return;
        }
        if (z) {
            c760370TsBLIZ = C0KYL.LIZJ(str);
        } else {
            c760370TsBLIZ = C0KYL.LIZ(str);
        }
        c760370TsBLIZ.LJIIIIZZ("bottom");
        c760370TsBLIZ.LJIJI(8, EnumC760350Ts9.DP);
        c760370TsBLIZ.LJIJJLI("bottom");
        ((HashMap) c760370TsBLIZ.LIZ).put("show_mask", "1");
        ((HashMap) c760370TsBLIZ.LIZ).put("mask_bg_color", "0000007F");
        if (num != null && num.intValue() >= 0) {
            c760370TsBLIZ.LJIIIZ((int) C497740JfY.LJJI(num.intValue()), EnumC760350Ts9.DP);
        }
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZLLL().toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.Integer r4, int r5, X.C513550KCb r6, X.C0KH1 r7) {
        /*
            r3 = 0
            if (r7 == 0) goto L32
            int r0 = r7.LIZJ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.bytedance.android.livesdk.subscribe.model.PreCheckResult r0 = r7.LJ
            if (r0 == 0) goto L13
            int r0 = r0.status
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L13:
            if (r6 != 0) goto L1a
            X.0KCb r6 = new X.0KCb
            r6.<init>()
        L1a:
            if (r4 == 0) goto L34
            int r1 = r4.intValue()
            r0 = 4025009(0x3d6ab1, float:5.640239E-39)
            if (r1 != r0) goto L34
            X.0KBn r0 = X.EnumC513410KBn.LATE_CALLBACK_SCENE
            r6.LIZJ = r0
            java.lang.String r0 = "late_callback"
            r6.LIZ = r0
            java.lang.String r0 = "late_callback_error"
            r6.LIZIZ = r0
            return
        L32:
            r2 = r3
            goto L13
        L34:
            if (r2 == 0) goto L60
            int r1 = r2.intValue()
            r0 = 5
            if (r1 != r0) goto L4c
            if (r5 <= 0) goto L4c
            X.0KBn r0 = X.EnumC513410KBn.AUTO_RENEWAL_CANCEL_SCENE
            r6.LIZJ = r0
            java.lang.String r0 = "renewal_cancel"
            r6.LIZ = r0
            java.lang.String r0 = "renewal_cancel_error"
            r6.LIZIZ = r0
            return
        L4c:
            int r1 = r2.intValue()
            r0 = 6
            if (r1 != r0) goto L60
            X.0KBn r0 = X.EnumC513410KBn.ONHOLD_SCENE
            r6.LIZJ = r0
            java.lang.String r0 = "on_hold"
            r6.LIZ = r0
            java.lang.String r0 = "on_hold_error"
            r6.LIZIZ = r0
            return
        L60:
            r2 = 1
            if (r3 == 0) goto L74
            int r0 = r3.intValue()
            if (r0 == 0) goto L88
            int r1 = r3.intValue()
            r0 = 2
            if (r1 != r0) goto L7d
            X.0KBn r0 = X.EnumC513410KBn.INCORRECT_GP_ACCOUNT
            r6.LIZJ = r0
        L74:
            java.lang.String r0 = "multi_account"
            r6.LIZ = r0
            java.lang.String r0 = "multi_account_error"
            r6.LIZIZ = r0
            return
        L7d:
            int r0 = r3.intValue()
            if (r0 != r2) goto L74
            X.0KBn r0 = X.EnumC513410KBn.INCORRECT_TIKTOK_OR_GP_ACCOUNT
            r6.LIZJ = r0
            goto L74
        L88:
            if (r5 <= 0) goto L95
            X.0KBn r0 = X.EnumC513410KBn.NOT_SPECIAL_SCENE
            r6.LIZJ = r0
            java.lang.String r0 = "available"
            r6.LIZ = r0
            r6.LIZIZ = r0
            return
        L95:
            if (r7 == 0) goto La7
            boolean r0 = r7.LJII
            if (r0 != r2) goto La0
            java.lang.String r0 = "tpl_error"
        L9d:
            r6.LIZIZ = r0
            return
        La0:
            boolean r0 = r7.LJIIIIZZ
            if (r0 != r2) goto La7
            java.lang.String r0 = "iap_error"
            goto L9d
        La7:
            java.lang.String r0 = "unknown"
            goto L9d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KCA.LJFF(java.lang.Integer, int, X.0KCb, X.0KH1):void");
    }
}
