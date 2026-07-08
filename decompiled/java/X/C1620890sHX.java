package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.business.story.ui.cell.StorySkylightCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell;
import com.ss.android.ugc.aweme.ui.cell.publish.CollabInviteEditCell;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620890sHX implements InterfaceC2211931Bhf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2211931Bhf
    public final void LIZ(View view, String str) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view, str);
                break;
            case 1:
                LIZ$1(this, view, str);
                break;
            case 2:
                LIZ$2(this, view, str);
                break;
            case 3:
                LIZ$3(this, view, str);
                break;
            case 4:
                LIZ$4(this, view, str);
                break;
            case 5:
                LIZ$5(this, view, str);
                break;
            case 6:
                LIZ$6(this, view, str);
                break;
            case 7:
                LIZ$7(this, view, str);
                break;
        }
    }

    public C1620890sHX(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0(C1620890sHX c1620890sHX, View view, String str) {
        String str2;
        User author;
        Aweme aweme;
        StorySkylightCell storySkylightCell = (StorySkylightCell) c1620890sHX.l0;
        storySkylightCell.e6(100, (C1596360rdy) storySkylightCell.getItem());
        if (((StorySkylightCell) c1620890sHX.l0).uH2() == 1) {
            str2 = "homepage_hot";
        } else {
            str2 = "homepage_friends";
        }
        InterfaceC1597970rgZ interfaceC1597970rgZ = (InterfaceC1597970rgZ) ((StorySkylightCell) c1620890sHX.l0).LLJILLL.getValue();
        EnumC1260930iux enumC1260930iux = EnumC1260930iux.SHOW;
        C1596360rdy c1596360rdy = (C1596360rdy) ((StorySkylightCell) c1620890sHX.l0).getItem();
        if (c1596360rdy != null && (aweme = c1596360rdy.LLILLJJLI) != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        interfaceC1597970rgZ.LJFF(str2, "top_cell", enumC1260930iux, author, null, true);
    }

    public static final void LIZ$1(C1620890sHX c1620890sHX, View view, String str) {
        Map<String, String> mapLJ;
        C1261050iv9 item = ((SearchFriendCell) c1620890sHX.l0).getItem();
        if (item == null || (mapLJ = item.LLILLJJLI) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C20684815ws.LJIILLIIL("search_result_show", mapLJ);
        C1261050iv9 item2 = ((SearchFriendCell) c1620890sHX.l0).getItem();
        if (item2 != null) {
            SearchFriendCell searchFriendCell = (SearchFriendCell) c1620890sHX.l0;
            EnumC1260930iux enumC1260930iux = EnumC1260930iux.SHOW;
            searchFriendCell.getClass();
            SearchFriendCell.I5(item2, enumC1260930iux);
        }
    }

    public static final void LIZ$2(C1620890sHX c1620890sHX, View view, String str) {
        Map<String, String> mapLJ;
        String authorUid;
        String aid;
        String uid;
        Object c098200Yq;
        User user;
        Aweme aweme;
        Aweme aweme2;
        C1575080r5e c1575080r5e = ((CollabFeedInvitedCell) c1620890sHX.l0).N5().LL;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C241200wU c241200wU = C241200wU.LIZ;
        String str2 = mapLJ.get("enter_from");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C343260Dcy item = ((CollabFeedInvitedCell) c1620890sHX.l0).getItem();
        if (item == null || (aweme2 = item.LLILZ) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme2)) == null) {
            authorUid = "";
        }
        C343260Dcy item2 = ((CollabFeedInvitedCell) c1620890sHX.l0).getItem();
        if (item2 == null || (aweme = item2.LLILZ) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C343260Dcy item3 = ((CollabFeedInvitedCell) c1620890sHX.l0).getItem();
        if (item3 == null || (user = item3.LLILLJJLI) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        C343260Dcy item4 = ((CollabFeedInvitedCell) c1620890sHX.l0).getItem();
        int i = 0;
        if (item4 != null && item4.LLILZIL) {
            i = 1;
        }
        int i2 = i ^ 1;
        String str4 = mapLJ.get("user_type");
        if (str4 != null) {
            str3 = str4;
        }
        c241200wU.getClass();
        try {
            C0N4J.LIZ("show_collabed_user", new C241500wX(i2, str2, aid, authorUid, uid, str3));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static final void LIZ$3(C1620890sHX c1620890sHX, View view, String str) {
        Map<String, String> mapLJ;
        String aid;
        Aweme aweme;
        String authorUid;
        Aweme aweme2;
        C1575080r5e c1575080r5e = ((CollabFeedInvitedPendingCell) c1620890sHX.l0).I5().LL;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C241200wU c241200wU = C241200wU.LIZ;
        String str2 = mapLJ.get("enter_from");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C343240Dcw item = ((CollabFeedInvitedPendingCell) c1620890sHX.l0).getItem();
        if (item == null || (aweme2 = item.LLILLJJLI) == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        C343240Dcw item2 = ((CollabFeedInvitedPendingCell) c1620890sHX.l0).getItem();
        if (item2 != null && (aweme = item2.LLILLJJLI) != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str3 = authorUid;
        }
        c241200wU.getClass();
        C241200wU.LIZJ(str2, aid, str3, "collab_panel", "show", "");
    }

    public static final void LIZ$4(C1620890sHX c1620890sHX, View view, String str) {
        String str2;
        String uid;
        String str3;
        Object c098200Yq;
        C317150Cbx item;
        User user;
        Map<String, String> map = ((CollabInviteEditCell) c1620890sHX.l0).I5().LL;
        C241200wU c241200wU = C241200wU.LIZ;
        String str4 = map.get("previous_page");
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        C317150Cbx item2 = ((CollabInviteEditCell) c1620890sHX.l0).getItem();
        String str6 = null;
        if (item2 == null || (str2 = item2.LLILLL) == null) {
            str2 = "";
        }
        C317150Cbx item3 = ((CollabInviteEditCell) c1620890sHX.l0).getItem();
        if (item3 == null || (user = item3.LL) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        C317150Cbx item4 = ((CollabInviteEditCell) c1620890sHX.l0).getItem();
        if (item4 != null) {
            str3 = item4.LLILLL;
        } else {
            str3 = null;
        }
        if (!Intrinsics.LJFF(str3, "all_user") || ((item = ((CollabInviteEditCell) c1620890sHX.l0).getItem()) != null && (str6 = item.LLILLJJLI) != null)) {
            str5 = str6;
        }
        c241200wU.getClass();
        try {
            C0N4J.LIZ("invite_collab_head_show", new C016M(str4, str2, uid, str5));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$5(C1620890sHX c1620890sHX, View view, String str) {
        InterfaceC1605750rt7 interfaceC1605750rt7;
        if ((view instanceof InterfaceC1605750rt7) && (interfaceC1605750rt7 = (InterfaceC1605750rt7) view) != null) {
            ViewOnClickListenerC1605710rt3 viewOnClickListenerC1605710rt3 = (ViewOnClickListenerC1605710rt3) c1620890sHX.l0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((ViewOnClickListenerC1605710rt3) c1620890sHX.l0).LL.getTagName());
            sbLIZ.append("_show");
            viewOnClickListenerC1605710rt3.LJJI(C2188811AlT.LIZIZ(sbLIZ), interfaceC1605750rt7.getMode());
        }
    }

    public static final void LIZ$6(C1620890sHX c1620890sHX, View view, String str) {
        ((Function2) c1620890sHX.l0).invoke(view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$7(C1620890sHX c1620890sHX, View view, String str) {
        User author;
        Aweme storyCollection;
        StoryInboxCell storyInboxCell = (StoryInboxCell) c1620890sHX.l0;
        storyInboxCell.L6((StoryInboxItem) storyInboxCell.getItem(), 100);
        InterfaceC1597970rgZ interfaceC1597970rgZU6 = ((StoryInboxCell) c1620890sHX.l0).u6();
        EnumC1260930iux enumC1260930iux = EnumC1260930iux.SHOW;
        StoryInboxItem storyInboxItem = (StoryInboxItem) ((StoryInboxCell) c1620890sHX.l0).getItem();
        if (storyInboxItem != null && (storyCollection = storyInboxItem.getStoryCollection()) != null) {
            author = storyCollection.getAuthor();
        } else {
            author = null;
        }
        interfaceC1597970rgZU6.LJFF("notification_page", "top_cell", enumC1260930iux, author, null, true);
    }
}
