package Y;

import X.C0I0B;
import X.C0O27;
import X.C0ZE7;
import X.C0ZE8;
import X.C1252610ihX;
import X.C1391190mJ3;
import X.C1649006cy;
import X.C1705506m5;
import X.C1722406oo;
import X.C19727912Gn;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C343970De7;
import X.C876890Yad;
import X.C897370ZIh;
import X.C897400ZIk;
import X.C897430ZIn;
import X.C897460ZIq;
import X.C897490ZIt;
import X.EnumC1910440zoY;
import X.InterfaceC897380ZIi;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.analytics.IIMRecUserAnalytics;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.cell.GroupDetailMemberCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.RecentActivityCardUISlot;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListRecentActivityAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.ui.ReadUserCell;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public class ACListenerS50S0400000_14 implements View.OnClickListener {
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
        }
    }

    public static final void onClick$0(ACListenerS50S0400000_14 aCListenerS50S0400000_14, View view) {
        IUserProfilePreload iUserProfilePreload = (IUserProfilePreload) PluggableExtentionKt.pluggableSpiForReal(IUserProfilePreload.class);
        if (iUserProfilePreload != null) {
            iUserProfilePreload.LIZ((User) aCListenerS50S0400000_14.l0);
        }
        IIMChatAnalytics.LIZ.getClass();
        IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
        C1252610ihX c1252610ihXLIZ = null;
        if (iIMChatAnalyticsLIZ != null) {
            iIMChatAnalyticsLIZ.LJ(C0I0B.LJFF.LIZIZ(), null, ((IMUser) aCListenerS50S0400000_14.l1).getUid(), ((GroupDetailMemberCell) aCListenerS50S0400000_14.l2).getEnterFrom(), null, String.valueOf(System.currentTimeMillis()));
        }
        IIMRecUserAnalytics.LIZ.getClass();
        IIMRecUserAnalytics iIMRecUserAnalyticsLIZ = C897430ZIn.LIZ();
        if (iIMRecUserAnalyticsLIZ != null) {
            iIMRecUserAnalyticsLIZ.LIZJ((User) aCListenerS50S0400000_14.l0, ((GroupDetailMemberCell) aCListenerS50S0400000_14.l2).getEnterFrom());
        }
        IIMRecUserAnalytics iIMRecUserAnalyticsLIZ2 = C897430ZIn.LIZ();
        if (iIMRecUserAnalyticsLIZ2 != null) {
            c1252610ihXLIZ = iIMRecUserAnalyticsLIZ2.LIZ((User) aCListenerS50S0400000_14.l0, ((GroupDetailMemberCell) aCListenerS50S0400000_14.l2).getEnterFrom());
        }
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            iDmHelperLIZ.LJIIL(((IMUser) aCListenerS50S0400000_14.l1).getUid(), ((GroupDetailMemberCell) aCListenerS50S0400000_14.l2).getEnterFrom(), c1252610ihXLIZ);
        }
        if (((GroupDetailMemberCell) aCListenerS50S0400000_14.l2).LLJJI.getValue() != null) {
            GroupDetailMemberCell groupDetailMemberCell = (GroupDetailMemberCell) aCListenerS50S0400000_14.l2;
            C897400ZIk c897400ZIk = (C897400ZIk) aCListenerS50S0400000_14.l3;
            C0ZE7 c0ze7 = (C0ZE7) groupDetailMemberCell.LLJILJIL.getValue();
            c0ze7.LJII = Boolean.valueOf(c897400ZIk.LLILLL);
            C897490ZIt.LIZIZ(c0ze7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS50S0400000_14 r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS50S0400000_14.onClick$1(Y.ACListenerS50S0400000_14, android.view.View):void");
    }

    public static final void onClick$2(ACListenerS50S0400000_14 aCListenerS50S0400000_14, View view) {
        String nickName;
        IMRecentActivityService.LIZ.getClass();
        C1649006cy.LIZ().LIZJ().LIZ(((C1722406oo) aCListenerS50S0400000_14.l0).activityType);
        MessageListRecentActivityAbility messageListRecentActivityAbility = (MessageListRecentActivityAbility) ((RecentActivityCardUISlot) aCListenerS50S0400000_14.l1).LLJL.getValue();
        if (messageListRecentActivityAbility != null) {
            Context context = ((View) aCListenerS50S0400000_14.l2).getContext();
            String strValueOf = String.valueOf(((C1722406oo) aCListenerS50S0400000_14.l0).awemeId);
            Aweme aweme = ((RecentActivityCardUISlot) aCListenerS50S0400000_14.l1).LLJZIJLIL;
            String strValueOf2 = String.valueOf(((C1722406oo) aCListenerS50S0400000_14.l0).creatorUserId);
            IMUser iMUser = (IMUser) aCListenerS50S0400000_14.l3;
            if (iMUser != null) {
                nickName = iMUser.getNickName();
            } else {
                nickName = null;
            }
            messageListRecentActivityAbility.GY0(context, strValueOf, ((C1722406oo) aCListenerS50S0400000_14.l0).activityType, aweme, strValueOf2, nickName);
        }
    }

    public static final void onClick$3(ACListenerS50S0400000_14 aCListenerS50S0400000_14, View view) {
        IIMAnonymousService iIMAnonymousService = (IIMAnonymousService) PluggableExtentionKt.pluggableSpi$default(IIMAnonymousService.class, false, false, false, 14, null);
        String str = "";
        if (iIMAnonymousService != null) {
            String str2 = ((C0O27) aCListenerS50S0400000_14.l0).LLILLJJLI;
            String uid = ((IMUser) aCListenerS50S0400000_14.l1).getUid();
            if (uid == null) {
                uid = "";
            }
            if (iIMAnonymousService.LIZLLL(str2, uid, false)) {
                C19EG currentActivity = ((ReadUserCell) aCListenerS50S0400000_14.l2).getCurrentActivity();
                if (currentActivity != null) {
                    C0O27 c0o27 = (C0O27) aCListenerS50S0400000_14.l0;
                    IMUser iMUser = (IMUser) aCListenerS50S0400000_14.l1;
                    IIMAnonymousService iIMAnonymousService2 = (IIMAnonymousService) PluggableExtentionKt.pluggableSpi$default(IIMAnonymousService.class, false, false, false, 14, null);
                    if (iIMAnonymousService2 != null) {
                        String str3 = c0o27.LLILLJJLI;
                        String uid2 = iMUser.getUid();
                        if (uid2 != null) {
                            str = uid2;
                        }
                        iIMAnonymousService2.LIZIZ(currentActivity, "read_list", str3, str);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        IUserProfilePreload iUserProfilePreload = (IUserProfilePreload) PluggableExtentionKt.pluggableSpiForReal(IUserProfilePreload.class);
        if (iUserProfilePreload != null) {
            iUserProfilePreload.LIZ((User) aCListenerS50S0400000_14.l3);
        }
        IIMChatAnalytics.LIZ.getClass();
        IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
        C1252610ihX c1252610ihXLIZ = null;
        if (iIMChatAnalyticsLIZ != null) {
            iIMChatAnalyticsLIZ.LJ(C0I0B.LJFF.LIZIZ(), null, ((User) aCListenerS50S0400000_14.l3).getUid(), "member_list", null, String.valueOf(System.currentTimeMillis()));
        }
        IIMRecUserAnalytics.LIZ.getClass();
        IIMRecUserAnalytics iIMRecUserAnalyticsLIZ = C897430ZIn.LIZ();
        if (iIMRecUserAnalyticsLIZ != null) {
            iIMRecUserAnalyticsLIZ.LIZJ((User) aCListenerS50S0400000_14.l3, null);
        }
        IIMRecUserAnalytics iIMRecUserAnalyticsLIZ2 = C897430ZIn.LIZ();
        if (iIMRecUserAnalyticsLIZ2 != null) {
            c1252610ihXLIZ = iIMRecUserAnalyticsLIZ2.LIZ((User) aCListenerS50S0400000_14.l3, null);
        }
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            iDmHelperLIZ.LJIIL(((C0O27) aCListenerS50S0400000_14.l0).LL.getUid(), "read_user_list", c1252610ihXLIZ);
        }
        String uid3 = ((C0O27) aCListenerS50S0400000_14.l0).LL.getUid();
        boolean z = ((ReadUserCell) aCListenerS50S0400000_14.l2).LLILLJJLI;
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("click_dm_seen_tab", C2097608Jq.LJIIIIZZ(new Pair("click_user_id", uid3), new Pair("activeStatus", String.valueOf(z ? 1 : 0))));
        if (((C19727912Gn) ((ReadUserCell) aCListenerS50S0400000_14.l2).LLILZLL.getValue()).LLJ) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
            C0ZE7 c0ze7 = new C0ZE7(((ReadUserCell) aCListenerS50S0400000_14.l2).getCurrentLifecycleOwner());
            c0ze7.LJII = Boolean.TRUE;
            c0ze7.LIZIZ(EnumC1910440zoY.DM_SEEN_TAB);
            c0ze7.LIZJ = ((C0O27) aCListenerS50S0400000_14.l0).LL.getUid();
            c0ze7.LJFF = "profile";
            c0ze7.LIZLLL = EnumC1910440zoY.CHAT_ROOM.getValue();
            c0ze8LJIIJJI.LIZ(c0ze7, false, C0I0B.LJFF.LIZIZ());
        }
        Fragment fragmentLIZIZ = C897460ZIq.LIZIZ(((ReadUserCell) aCListenerS50S0400000_14.l2).itemView);
        if (fragmentLIZIZ != null) {
            String str4 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragmentLIZIZ, C343970De7.LIZ);
        }
    }

    public ACListenerS50S0400000_14(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
