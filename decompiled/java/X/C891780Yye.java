package X;

import Y.ACListenerS130S0200000_28;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.common.setting.MessagingToolsOptionURL;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.BusinessToolsItem;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS111S0400000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import wh6.AbS327S0300000_14;

/* JADX INFO: renamed from: X.0Yye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891780Yye {
    public static String LIZLLL = "click_button_icon";
    public static boolean LJ;
    public boolean LIZ;
    public C19EG LIZIZ;
    public Integer LIZJ;

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.util.ArrayList] */
    public final void LIZ(TuxIconView tuxIconView, TuxIconView tuxIconView2, TuxIconView tuxIconView3, boolean z, boolean z2) {
        int iIntValue;
        Integer numLIZ;
        boolean z3;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxPageHelper", "adjustCreateChatOrSearchEntranceViewIfNeed");
        TuxIconView tuxIconView4 = tuxIconView2;
        C891780Yye c891780Yye = this;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (tuxIconView4 != null) {
                C12ES.LJIILL(0, tuxIconView4);
                C786410Ut5.a9(tuxIconView4, new ACListenerS130S0200000_28(tuxIconView4, c891780Yye, 29));
            }
        } else if (tuxIconView4 != null) {
            C0DTR.LIZIZ(tuxIconView4);
        }
        C889930Yvf c889930Yvf = C889930Yvf.LIZ;
        TuxIconView tuxIconView5 = tuxIconView3;
        TuxIconView tuxIconView6 = tuxIconView;
        if (c889930Yvf.LIZJ() == C05RV.PERSONAL_INBOX && !C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIJJ().LIZIZ()) {
            if (tuxIconView5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
            }
        } else if (tuxIconView5 != null) {
            if (z && c891780Yye.LIZJ == null && c889930Yvf.LIZJ() == C05RV.BUSINESS_INBOX) {
                ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJIIJJI(EnumC891880Yyo.USER_ANALYTICS, "", new AwS111S0400000_14(c891780Yye, tuxIconView6, tuxIconView4, tuxIconView5, 0), AFwS248S0000000_14.get$arr$(44));
            }
            if (z2) {
                c891780Yye = c891780Yye;
                tuxIconView6 = tuxIconView6;
                tuxIconView4 = tuxIconView4;
                tuxIconView5 = tuxIconView5;
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1727606pe(c891780Yye, tuxIconView6, tuxIconView4, tuxIconView5, null), 3);
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new ArrayList();
            final AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c259800zU, (C259800zU<List<InterfaceC891770Yyd>>) 1092);
            final AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14(c891780Yye, 1093);
            List listLJIIJJI = C1697810uHb.LJIIJJI(new InterfaceC891770Yyd(awS558S0100000_14) { // from class: X.0YyX
                public final Function0<Boolean> LIZ;
                public final boolean LIZIZ = C889930Yvf.LIZ.LJIIL();
                public final int LIZJ = 2131845300;
                public final int LIZLLL = R.raw.icon_lines_horizontal_decrease_alt;
                public final String LJ = "click_option_multi_select";

                @Override // X.InterfaceC891770Yyd
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJI() {
                    return "select_chat_option";
                }

                @Override // X.InterfaceC891770Yyd
                public final void onShow() {
                }

                @Override // X.InterfaceC891770Yyd
                public final Integer LIZ() {
                    return Integer.valueOf(this.LIZLLL);
                }

                @Override // X.InterfaceC891770Yyd
                public final int LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJ() {
                    return this.LJ;
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean isEnabled() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = awS558S0100000_14;
                }

                @Override // X.InterfaceC891770Yyd
                public final InterfaceC1411705fn LIZJ(String str) {
                    return C05RE.LIZIZ(str);
                }

                @Override // X.InterfaceC891770Yyd
                public final void LIZLLL(Context context) {
                    C878950Ydx c878950YdxLIZLLL;
                    String str;
                    IMChatListApi.LJJIII.getClass();
                    InterfaceC882680Yjy interfaceC882680YjyLJJIL = C890330YwJ.LIZ().LJJIL();
                    if (interfaceC882680YjyLJJIL != null && (c878950YdxLIZLLL = interfaceC882680YjyLJJIL.LIZLLL()) != null) {
                        InterfaceC890150Yw1 interfaceC890150Yw1LIZIZ = C890330YwJ.LIZ().LIZIZ();
                        String str2 = c878950YdxLIZLLL.LLILLJJLI;
                        if (this.LIZ.invoke().booleanValue()) {
                            str = "click_inbox_title_bar_multiselect_btn";
                        } else {
                            str = "click_messaging_settings_option";
                        }
                        interfaceC890150Yw1LIZIZ.LJFF(str2, str, c878950YdxLIZLLL.LLILLL.getMobValue());
                        C1440005kM.LIZ(new C891720YyY(c878950YdxLIZLLL));
                    }
                }
            }, new InterfaceC891770Yyd() { // from class: X.05vG
                @Override // X.InterfaceC891770Yyd
                public final int LIZIZ() {
                    return 2131827522;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJ() {
                    return "click_option_message_notification";
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJI() {
                    return "message_notification_option";
                }

                @Override // X.InterfaceC891770Yyd
                public final void onShow() {
                }

                @Override // X.InterfaceC891770Yyd
                public final Integer LIZ() {
                    return Integer.valueOf(R.raw.icon_bell);
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean isEnabled() {
                    return C05RE.LIZ() == C05RV.BUSINESS_INBOX;
                }

                @Override // X.InterfaceC891770Yyd
                public final InterfaceC1411705fn LIZJ(String str) {
                    return C05RE.LIZIZ(str);
                }

                @Override // X.InterfaceC891770Yyd
                public final void LIZLLL(Context context) {
                    SmartRouter.buildRoute(context, "aweme://im/notification_settings").open();
                }
            }, new InterfaceC891770Yyd() { // from class: X.06nU
                @Override // X.InterfaceC891770Yyd
                public final int LIZIZ() {
                    return 2131830769;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJ() {
                    return "click_option_business_insights";
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJI() {
                    return "business_insights_option";
                }

                @Override // X.InterfaceC891770Yyd
                public final void onShow() {
                }

                @Override // X.InterfaceC891770Yyd
                public final Integer LIZ() {
                    return Integer.valueOf(R.raw.icon_line_chart);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
                @Override // X.InterfaceC891770Yyd
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean isEnabled() {
                    /*
                        r5 = this;
                        X.05RV r1 = X.C05RE.LIZ()
                        X.05RV r0 = X.C05RV.BUSINESS_INBOX
                        r3 = 0
                        if (r1 != r0) goto L37
                        X.06g9 r0 = com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService r4 = X.C1668706g9.LIZIZ
                        r2 = 1
                        if (r4 == 0) goto L37
                        X.06nD r1 = r4.LJFF()
                        if (r1 == 0) goto L38
                        X.0613 r0 = X.InterfaceC1712506nD.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = X.AnonymousClass0613.LIZ()
                        boolean r0 = r1.LJI(r0)
                        if (r0 != r2) goto L38
                    L28:
                        X.0C64 r2 = X.C0C64.LJIILLIIL()
                        java.lang.String r1 = "im_business_insights_entrance_enable"
                        r0 = 31744(0x7c00, float:4.4483E-41)
                        boolean r0 = r2.LJIIIZ(r0, r1, r3, r3)
                        if (r0 == 0) goto L37
                        r3 = 1
                    L37:
                        return r3
                    L38:
                        X.06nD r1 = r4.LJFF()
                        if (r1 == 0) goto L37
                        X.0613 r0 = X.InterfaceC1712506nD.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = X.AnonymousClass0613.LIZ()
                        boolean r0 = r1.LJIIIZ(r0)
                        if (r0 != r2) goto L37
                        X.0613 r0 = X.InterfaceC1712506nD.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = X.AnonymousClass0613.LIZ()
                        if (r0 == 0) goto L37
                        boolean r0 = r0.isAdult()
                        if (r0 != r2) goto L37
                        goto L28
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1714206nU.isEnabled():boolean");
                }

                @Override // X.InterfaceC891770Yyd
                public final InterfaceC1411705fn LIZJ(String str) {
                    return C05RE.LIZIZ(str);
                }

                @Override // X.InterfaceC891770Yyd
                public final void LIZLLL(Context context) {
                    String str = ((MessagingToolsOptionURL) C891860Yym.LIZIZ.getValue()).businessInsights;
                    if (str.length() == 0) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("&enter_from=professional_inbox&click_entry_time=");
                    sbLIZ.append(System.currentTimeMillis());
                    SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
                }
            }, new InterfaceC891770Yyd() { // from class: X.06nV
                public final boolean LIZ;
                public final int LIZIZ;
                public final int LIZJ;
                public final String LIZLLL;

                @Override // X.InterfaceC891770Yyd
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJI() {
                    return "quick_reply_chat_option";
                }

                @Override // X.InterfaceC891770Yyd
                public final void onShow() {
                }

                @Override // X.InterfaceC891770Yyd
                public final Integer LIZ() {
                    return Integer.valueOf(this.LIZJ);
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                {
                    /*
                        r4 = this;
                        r4.<init>()
                        X.05RV r1 = X.C05RE.LIZ()
                        X.05RV r0 = X.C05RV.BUSINESS_INBOX
                        if (r1 == r0) goto L22
                        X.0Yvf r0 = X.C889930Yvf.LIZ
                        boolean r0 = r0.LJIIIZ()
                        r3 = 0
                        if (r0 == 0) goto L23
                        X.0C64 r2 = X.C0C64.LJIILLIIL()
                        java.lang.String r1 = "creator_im_show_quick_reply_entrance"
                        r0 = 31744(0x7c00, float:4.4483E-41)
                        boolean r0 = r2.LJIIIZ(r0, r1, r3, r3)
                        if (r0 == 0) goto L23
                    L22:
                        r3 = 1
                    L23:
                        r4.LIZ = r3
                        r0 = 2131845301(0x7f1160b5, float:1.932402E38)
                        r4.LIZIZ = r0
                        r0 = 2130772775(0x7f010327, float:1.7148678E38)
                        r4.LIZJ = r0
                        java.lang.String r0 = "click_option_quick_replies"
                        r4.LIZLLL = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1714306nV.<init>():void");
                }

                @Override // X.InterfaceC891770Yyd
                public final int LIZIZ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean isEnabled() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC891770Yyd
                public final InterfaceC1411705fn LIZJ(String str) {
                    return C05RE.LIZIZ(str);
                }

                @Override // X.InterfaceC891770Yyd
                public final void LIZLLL(Context context) {
                    String strLIZIZ;
                    C891860Yym.LIZ.getClass();
                    String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
                    if (curUserId != null && curUserId.length() != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("aweme://im_quick_reply/manage_page?biz_uid=");
                        sbLIZ.append(curUserId);
                        sbLIZ.append("&fetch_Latest_data=1&enter_from=notification_page&enter_method=click_messaging_settings_option");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        strLIZIZ = "";
                    }
                    if (strLIZIZ.length() == 0) {
                        return;
                    }
                    SmartRouter.buildRoute(context, strLIZIZ).open();
                }
            }, new InterfaceC891770Yyd() { // from class: X.0Yyj
                @Override // X.InterfaceC891770Yyd
                public final int LIZIZ() {
                    return 2131828566;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJ() {
                    return "click_option_chat_intro";
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean LJFF() {
                    return true;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJI() {
                    return "chat_intro_option";
                }

                @Override // X.InterfaceC891770Yyd
                public final void onShow() {
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean isEnabled() {
                    if (!C889930Yvf.LIZ.LJIIIZ()) {
                        return false;
                    }
                    IMContactApi.LIZ.getClass();
                    InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
                    EnumC1725606pK enumC1725606pK = EnumC1725606pK.BUSINESS_TOOLS_ITEMS;
                    List<BusinessToolsItem> list = (List) interfaceC15516065qLIZJ.LJFF(enumC1725606pK, null, null, enumC1725606pK.getAllowUsingLocalStaleValue(), true);
                    if (list == null || list.isEmpty()) {
                        return false;
                    }
                    for (BusinessToolsItem businessToolsItem : list) {
                        Integer num = businessToolsItem.businessToolType;
                        int value = C0NCV.CHAT_INTRO.getValue();
                        if (num != null && num.intValue() == value) {
                            Integer num2 = businessToolsItem.businessToolStatus;
                            int value2 = EnumC891840Yyk.ENABLE.getValue();
                            if (num2 != null && num2.intValue() == value2) {
                                return true;
                            }
                        }
                    }
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final Integer LIZ() {
                    return Integer.valueOf(R.raw.icon_message_smile);
                }

                @Override // X.InterfaceC891770Yyd
                public final InterfaceC1411705fn LIZJ(String str) {
                    return C05RE.LIZIZ(str);
                }

                @Override // X.InterfaceC891770Yyd
                public final void LIZLLL(Context context) {
                    long jCurrentTimeMillis;
                    long jCurrentTimeMillis2;
                    String str = C891860Yym.LIZ.chatIntro;
                    if (str.length() == 0) {
                        return;
                    }
                    SmartRouter.buildRoute(context, str).open();
                    InterfaceC1411705fn interfaceC1411705fnLIZIZ = C05RE.LIZIZ("chat_intro_option");
                    if (interfaceC1411705fnLIZIZ != null) {
                        String strLIZIZ = C461720I8s.LIZIZ();
                        IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                        if (iMHostApi != null) {
                            jCurrentTimeMillis = iMHostApi.LIZIZ();
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                        if (iMHostApi2 != null) {
                            jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
                        } else {
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                        }
                        interfaceC1411705fnLIZIZ.LIZLLL(jCurrentTimeMillis, jCurrentTimeMillis2, strLIZIZ);
                    }
                }
            }, new InterfaceC891770Yyd() { // from class: X.0Yyi
                @Override // X.InterfaceC891770Yyd
                public final int LIZIZ() {
                    return 2131838054;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJ() {
                    return "click_option_new_follower_greeting";
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJI() {
                    return "follow_to_dm_option";
                }

                @Override // X.InterfaceC891770Yyd
                public final void onShow() {
                }

                @Override // X.InterfaceC891770Yyd
                public final Integer LIZ() {
                    return Integer.valueOf(R.raw.icon_message_smile);
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean isEnabled() {
                    if (C05RE.LIZ() != C05RV.BUSINESS_INBOX) {
                        return false;
                    }
                    IMContactApi.LIZ.getClass();
                    InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
                    EnumC1725606pK enumC1725606pK = EnumC1725606pK.BUSINESS_TOOLS_ITEMS;
                    List<BusinessToolsItem> list = (List) interfaceC15516065qLIZJ.LJFF(enumC1725606pK, null, null, enumC1725606pK.getAllowUsingLocalStaleValue(), true);
                    if (list == null || list.isEmpty()) {
                        return false;
                    }
                    for (BusinessToolsItem businessToolsItem : list) {
                        Integer num = businessToolsItem.businessToolType;
                        int value = C0NCV.FOLLOW_TO_DM.getValue();
                        if (num != null && num.intValue() == value) {
                            Integer num2 = businessToolsItem.businessToolStatus;
                            int value2 = EnumC891840Yyk.ENABLE.getValue();
                            if (num2 != null && num2.intValue() == value2) {
                                return true;
                            }
                        }
                    }
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final InterfaceC1411705fn LIZJ(String str) {
                    return C05RE.LIZIZ(str);
                }

                @Override // X.InterfaceC891770Yyd
                public final void LIZLLL(Context context) {
                    String str = C891860Yym.LIZ.followToDm;
                    if (str.length() == 0) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("&enter_from=click_messaging_settings_option&enter_method=inbox");
                    SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
                }
            }, new InterfaceC891770Yyd() { // from class: X.06nT
                public final boolean LIZ;
                public final int LIZIZ;
                public final int LIZJ;
                public final String LIZLLL;

                @Override // X.InterfaceC891770Yyd
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJI() {
                    return "message_center_option";
                }

                @Override // X.InterfaceC891770Yyd
                public final void onShow() {
                }

                @Override // X.InterfaceC891770Yyd
                public final Integer LIZ() {
                    return Integer.valueOf(this.LIZJ);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                {
                    /*
                        r5 = this;
                        r5.<init>()
                        X.06g9 r0 = com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService r4 = X.C1668706g9.LIZIZ
                        r2 = 0
                        r3 = 1
                        if (r4 == 0) goto L34
                        X.06nD r1 = r4.LJFF()
                        if (r1 == 0) goto L45
                        X.0613 r0 = X.InterfaceC1712506nD.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = X.AnonymousClass0613.LIZ()
                        boolean r0 = r1.LJFF(r0)
                        if (r0 != r3) goto L45
                    L23:
                        X.05RV r1 = X.C05RE.LIZ()
                        X.05RV r0 = X.C05RV.BUSINESS_INBOX
                        if (r1 == r0) goto L33
                        X.0Yvf r0 = X.C889930Yvf.LIZ
                        boolean r0 = r0.LJIIIZ()
                        if (r0 == 0) goto L34
                    L33:
                        r2 = 1
                    L34:
                        r5.LIZ = r2
                        r0 = 2131845302(0x7f1160b6, float:1.9324021E38)
                        r5.LIZIZ = r0
                        r0 = 2130773900(0x7f01078c, float:1.715096E38)
                        r5.LIZJ = r0
                        java.lang.String r0 = "click_option_message_center"
                        r5.LIZLLL = r0
                        return
                    L45:
                        X.06nD r1 = r4.LJFF()
                        if (r1 == 0) goto L34
                        X.0613 r0 = X.InterfaceC1712506nD.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = X.AnonymousClass0613.LIZ()
                        boolean r0 = r1.LJIIIZ(r0)
                        if (r0 != r3) goto L34
                        X.06nD r1 = r4.LJFF()
                        if (r1 == 0) goto L34
                        X.0613 r0 = X.InterfaceC1712506nD.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = X.AnonymousClass0613.LIZ()
                        boolean r0 = r1.LIZJ(r0)
                        if (r0 != r3) goto L34
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1714106nT.<init>():void");
                }

                @Override // X.InterfaceC891770Yyd
                public final int LIZIZ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean isEnabled() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC891770Yyd
                public final InterfaceC1411705fn LIZJ(String str) {
                    return C05RE.LIZIZ(str);
                }

                @Override // X.InterfaceC891770Yyd
                public final void LIZLLL(Context context) {
                    SmartRouter.buildRoute(context, ((MessagingToolsOptionURL) C891860Yym.LIZIZ.getValue()).messageCenterUrl).open();
                }
            }, new InterfaceC891770Yyd() { // from class: X.06nS
                public final boolean LIZ;
                public final int LIZIZ;
                public final int LIZJ;
                public final String LIZLLL;

                @Override // X.InterfaceC891770Yyd
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJI() {
                    return "faq_option";
                }

                @Override // X.InterfaceC891770Yyd
                public final void onShow() {
                }

                @Override // X.InterfaceC891770Yyd
                public final Integer LIZ() {
                    return Integer.valueOf(this.LIZJ);
                }

                {
                    C1668706g9 c1668706g9 = IIMBusinessChatService.LIZ;
                    InterfaceC1712506nD interfaceC1712506nDLJFF = C1668706g9.LIZ(c1668706g9).LJFF();
                    InterfaceC1712506nD.LIZ.getClass();
                    this.LIZ = !interfaceC1712506nDLJFF.LJIIIZ(AnonymousClass0613.LIZ()) && (C889930Yvf.LIZ.LJIIIZ() || C1668706g9.LIZ(c1668706g9).LJIIIIZZ().LIZ());
                    this.LIZIZ = 2131827452;
                    this.LIZJ = R.raw.icon_qa_ltr;
                    this.LIZLLL = "click_option_suggest_question";
                }

                @Override // X.InterfaceC891770Yyd
                public final int LIZIZ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean isEnabled() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC891770Yyd
                public final InterfaceC1411705fn LIZJ(String str) {
                    return C05RE.LIZIZ(str);
                }

                @Override // X.InterfaceC891770Yyd
                public final void LIZLLL(Context context) {
                    SmartRouter.buildRoute(context, ((MessagingToolsOptionURL) C891860Yym.LIZIZ.getValue()).faqUrl).open();
                }
            }, new InterfaceC891770Yyd(awS558S0100000_142) { // from class: X.0Yyf
                public static final /* synthetic */ int LJ = 0;
                public final boolean LIZ;
                public final int LIZIZ;
                public final int LIZJ;
                public final String LIZLLL;

                @Override // X.InterfaceC891770Yyd
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJI() {
                    return "promote_option";
                }

                @Override // X.InterfaceC891770Yyd
                public final Integer LIZ() {
                    return Integer.valueOf(this.LIZJ);
                }

                @Override // X.InterfaceC891770Yyd
                public final void onShow() {
                    C891810Yyh.LIZIZ("click_messaging_settings_option", false);
                }

                @Override // X.InterfaceC891770Yyd
                public final int LIZIZ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean isEnabled() {
                    return this.LIZ;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
                {
                    /*
                        r2 = this;
                        r2.<init>()
                        X.05RV r1 = X.C05RE.LIZ()
                        X.05RV r0 = X.C05RV.BUSINESS_INBOX
                        if (r1 != r0) goto L2b
                        java.lang.Object r0 = r3.l0
                        X.0Yye r0 = (X.C891780Yye) r0
                        java.lang.Integer r0 = r0.LIZJ
                        if (r0 == 0) goto L2b
                        int r0 = r0.intValue()
                        r1 = 1
                        if (r0 != r1) goto L2b
                    L1a:
                        r2.LIZ = r1
                        r0 = 2131845348(0x7f1160e4, float:1.9324114E38)
                        r2.LIZIZ = r0
                        r0 = 2130773854(0x7f01075e, float:1.7150866E38)
                        r2.LIZJ = r0
                        java.lang.String r0 = "click_option_promote_page"
                        r2.LIZLLL = r0
                        return
                    L2b:
                        r1 = 0
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C891790Yyf.<init>(kotlin.jvm.internal.AwS558S0100000_14):void");
                }

                @Override // X.InterfaceC891770Yyd
                public final InterfaceC1411705fn LIZJ(String str) {
                    return C05RE.LIZIZ(str);
                }

                @Override // X.InterfaceC891770Yyd
                public final void LIZLLL(Context context) {
                    C891810Yyh.LIZ(context, "click_messaging_settings_option");
                    C891810Yyh.LIZIZ("click_messaging_settings_option", true);
                }
            }, new C891740Yya(new AwS558S0100000_14(c259800zU, (C259800zU<List<InterfaceC891770Yyd>>) 1094)), new InterfaceC891770Yyd() { // from class: X.06k9
                @Override // X.InterfaceC891770Yyd
                public final int LIZIZ() {
                    return 2131848476;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJ() {
                    return "click_ai_assistant";
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.InterfaceC891770Yyd
                public final String LJI() {
                    return "ai_assistant_option";
                }

                @Override // X.InterfaceC891770Yyd
                public final void onShow() {
                }

                @Override // X.InterfaceC891770Yyd
                public final boolean isEnabled() {
                    if (!C889930Yvf.LIZ.LJIIIZ()) {
                        return false;
                    }
                    IMAIServiceAPI.LIZ.getClass();
                    return AnonymousClass0629.LIZ().LIZ().LJIIZILJ();
                }

                @Override // X.InterfaceC891770Yyd
                public final Integer LIZ() {
                    return Integer.valueOf(R.raw.icon_bubble_ai_ltr);
                }

                @Override // X.InterfaceC891770Yyd
                public final InterfaceC1411705fn LIZJ(String str) {
                    return C05RE.LIZIZ(str);
                }

                @Override // X.InterfaceC891770Yyd
                public final void LIZLLL(Context context) {
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if (activityLIZ == null) {
                        return;
                    }
                    IMAIServiceAPI.LIZ.getClass();
                    AnonymousClass0629.LIZ().LIZ().LJIJI(activityLIZ, false);
                }
            });
            ?? arrayList = new ArrayList();
            for (Object obj : listLJIIJJI) {
                if (((InterfaceC891770Yyd) obj).isEnabled()) {
                    arrayList.add(obj);
                }
            }
            c259800zU.element = arrayList;
            if (arrayList.isEmpty()) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
                return;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView5, 0);
            if (((List) c259800zU.element).size() == 1 && (numLIZ = ((InterfaceC891770Yyd) ListProtector.get((List) c259800zU.element, 0)).LIZ()) != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = R.raw.icon_ellipsis_horizontal;
            }
            tuxIconView5.setIconRes(iIntValue);
            C786410Ut5.I7(new AbS327S0300000_14(c259800zU, tuxIconView5, c891780Yye, 1), tuxIconView5);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ((Iterable) c259800zU.element).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (next instanceof C1714206nU) {
                    if (next != null) {
                        arrayList2.add(EnumC1411605fm.BUSINESS_INSIGHTS);
                    }
                }
            }
            Iterator it3 = ((Iterable) c259800zU.element).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (next2 instanceof C891830Yyj) {
                    if (next2 != null) {
                        arrayList2.add(EnumC1411605fm.CHAT_INTRO);
                    }
                }
            }
            IMChatListApi.LJJIII.getClass();
            C890330YwJ.LIZ().LJIIJ().showGuideBubbleForMessagingTool(tuxIconView5.getContext(), tuxIconView5, arrayList2);
        }
        if (tuxIconView4 != null && tuxIconView4.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || (tuxIconView5 != null && tuxIconView5.getVisibility() == 0)) {
            if (tuxIconView6 != null) {
                ViewGroup.LayoutParams layoutParams = tuxIconView6.getLayoutParams();
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.removeRule(21);
                    layoutParams2.addRule(20, -1);
                    C786410Ut5.W5(tuxIconView6, layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            return;
        }
        if (tuxIconView6 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = tuxIconView6.getLayoutParams();
        if (layoutParams3 != null) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.removeRule(20);
            layoutParams4.addRule(21, -1);
            C786410Ut5.W5(tuxIconView6, layoutParams4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }
}
