package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.AuthMaFPowerCell;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationCell;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j3F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266070j3F implements InterfaceC2211931Bhf {
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1266070j3F(Object obj, AuthMaFPowerCell<T> authMaFPowerCell) {
        this.$t = authMaFPowerCell;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0(C1266070j3F c1266070j3F, View view, String str) {
        C1074520e4I c1074520e4I;
        C1074850e4p c1074850e4p;
        User userLIZIZ;
        int iLIZ;
        AuthMaFPowerCell authMaFPowerCell = (AuthMaFPowerCell) c1266070j3F.l0;
        C1074850e4p c1074850e4p2 = (C1074850e4p) authMaFPowerCell.getItem();
        if (c1074850e4p2 != null && (c1074520e4I = c1074850e4p2.LLILLL) != null && (c1074850e4p = (C1074850e4p) authMaFPowerCell.getItem()) != null && (userLIZIZ = c1074850e4p.LIZIZ()) != null) {
            String str2 = c1074520e4I.LIZ;
            String str3 = c1074520e4I.LIZJ;
            String str4 = c1074520e4I.LIZIZ;
            String str5 = c1074520e4I.LIZLLL;
            C1074850e4p c1074850e4p3 = (C1074850e4p) authMaFPowerCell.getItem();
            if (c1074850e4p3 != null) {
                iLIZ = c1074850e4p3.LIZ();
            } else {
                iLIZ = 0;
            }
            new C1253970ijj(str2, userLIZIZ, str3, str4, str5, Integer.valueOf(iLIZ), 64).LIZLLL(null);
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            c1260910iuv.LJJIJLIJ(c1074520e4I.LIZ);
            c1260910iuv.LJJIL(c1074520e4I.LIZJ);
            c1260910iuv.LJJJJJ(c1074520e4I.LIZIZ);
            String str6 = c1074520e4I.LIZLLL;
            if (str6 == null) {
                str6 = "";
            }
            c1260910iuv.LJJLJ = str6;
            c1260910iuv.LJJLIIIJILLIZJL = AuthMaFPowerCell.N5(c1074520e4I.LJ);
            c1260910iuv.LJJJJLL();
            c1260910iuv.LJJLIIIJJI = EnumC1260930iux.SHOW;
            c1260910iuv.LJJJJZI(userLIZIZ);
            c1260910iuv.LJIILJJIL();
        }
    }

    public static final void LIZ$1(C1266070j3F c1266070j3F, View view, String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on simple expose for ");
        sbLIZ.append(((MutualRelationCell) c1266070j3F.l0).getAbsoluteAdapterPosition());
        C2188811AlT.LIZIZ(sbLIZ);
        C1164490gPP item = ((MutualRelationCell) c1266070j3F.l0).getItem();
        if (item != null) {
            final User user = item.LL;
            final int i2 = item.LLILLJJLI;
            new AbstractC1223210hw7(user, i2) { // from class: X.0hvy
                public final User LIZIZ;
                public final int LIZJ;
                public final String LIZLLL = "mutual_connection_list_user_show";
                public final Map<String, String> LJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1223120hvy)) {
                        return false;
                    }
                    C1223120hvy c1223120hvy = (C1223120hvy) obj;
                    return Intrinsics.LJFF(this.LIZIZ, c1223120hvy.LIZIZ) && this.LIZJ == c1223120hvy.LIZJ;
                }

                public final int hashCode() {
                    return (this.LIZIZ.hashCode() * 31) + this.LIZJ;
                }

                public final String toString() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("MutualConnectionListUserTracker(user=");
                    sbLIZ2.append(this.LIZIZ);
                    sbLIZ2.append(", index=");
                    sbLIZ2.append(this.LIZJ);
                    sbLIZ2.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }

                @Override // X.AbstractC1223210hw7
                public final String LIZ() {
                    return this.LIZLLL;
                }

                @Override // X.AbstractC1223210hw7
                public final Map<String, String> LIZIZ() {
                    return this.LJ;
                }

                {
                    String str2;
                    this.LIZIZ = user;
                    this.LIZJ = i2;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "mutual_connection_page");
                    if (user.getFollowStatus() == 2) {
                        str2 = "mutual";
                    } else {
                        str2 = "single";
                    }
                    c2344009Gk.LJIIIIZZ("follow_type", str2);
                    c2344009Gk.LIZJ(i2, "impr_order");
                    c2344009Gk.LJIIIIZZ("to_user_id", user.getUid());
                    this.LJ = c2344009Gk.LIZ;
                }
            }.LIZLLL(null);
        }
    }

    public static final void LIZ$2(C1266070j3F c1266070j3F, View view, String str) {
        int i;
        String str2;
        String str3;
        C1247270iYv item = ((RelationSearchCell) c1266070j3F.l0).getItem();
        User user = null;
        if (item != null) {
            user = item.LL;
        }
        C1247270iYv item2 = ((RelationSearchCell) c1266070j3F.l0).getItem();
        if (item2 != null) {
            i = item2.LLILLJJLI;
        } else {
            i = 0;
        }
        if (user != null) {
            RelationSearchCell relationSearchCell = (RelationSearchCell) c1266070j3F.l0;
            C1247190iYn c1247190iYn = C1247190iYn.LIZ;
            String enterFrom = relationSearchCell.getEnterFrom();
            c1247190iYn.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
            c2344009Gk.LJIIIIZZ("to_user_id", user.getUid());
            int followStatus = user.getFollowStatus();
            if (followStatus != 1) {
                if (followStatus != 2) {
                    str2 = "";
                } else {
                    str2 = "mutual";
                }
            } else {
                str2 = "single";
            }
            c2344009Gk.LJIIIIZZ("follow_status", str2);
            c2344009Gk.LJIIIIZZ("rank", String.valueOf(i));
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null && matchedFriendStruct.recType != null) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("has_label", str3);
            C20684815ws.LJIILLIIL("fans_following_page_search_result_show", c2344009Gk.LIZ);
            relationSearchCell.P5(user, EnumC1260930iux.SHOW);
        }
    }

    public static final void LIZ$3(C1266070j3F c1266070j3F, View view, String str) {
        Aweme aweme;
        User author;
        InterfaceC1259230isD interfaceC1259230isDLJJI;
        String requestId;
        C1259680isw c1259680isw = (C1259680isw) c1266070j3F.l0;
        String str2 = c1259680isw.LLILZLL;
        if (str2 != null && (aweme = c1259680isw.LLIZLLLIL) != null && (author = aweme.getAuthor()) != null && (interfaceC1259230isDLJJI = C1618440sDa.LIZIZ.LJJI()) != null) {
            Aweme aweme2 = ((C1259680isw) c1266070j3F.l0).LLIZLLLIL;
            if (aweme2 != null) {
                requestId = aweme2.getRequestId();
            } else {
                requestId = null;
            }
            interfaceC1259230isDLJJI.LIZ("story_show", str2, author, requestId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$4(C1266070j3F c1266070j3F, View view, String str) {
        String uid;
        ThoughtInfo thoughtInfo;
        String uid2;
        String uid3;
        SocialThoughtService socialThoughtService;
        ISocialThoughtDataCenterService iSocialThoughtDataCenterServiceLJJIIZI;
        AnonymousClass0951 anonymousClass0951LJI;
        StoryInboxItem storyInboxItem = (StoryInboxItem) ((StoryInboxCell) c1266070j3F.l0).getItem();
        if (storyInboxItem == null) {
            return;
        }
        View viewLJJZZI = ((StoryInboxCell) c1266070j3F.l0).r6().LJJZZI();
        if (viewLJJZZI.getVisibility() == 0 && viewLJJZZI.getAlpha() > 0.5f) {
            User user = storyInboxItem.getUser();
            String requestId = null;
            if (user == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            if (uid.length() > 0 && (socialThoughtService = (SocialThoughtService) PluggableExtentionKt.pluggableSpi$default(SocialThoughtService.class, false, false, false, 14, null)) != null && (iSocialThoughtDataCenterServiceLJJIIZI = socialThoughtService.LJJIIZI()) != null && (anonymousClass0951LJI = iSocialThoughtDataCenterServiceLJJIIZI.LJI(uid, false)) != null) {
                thoughtInfo = (ThoughtInfo) anonymousClass0951LJI.getValue();
            } else {
                thoughtInfo = null;
            }
            SocialThoughtService socialThoughtService2 = (SocialThoughtService) PluggableExtentionKt.pluggableSpi$default(SocialThoughtService.class, false, false, false, 14, null);
            if (socialThoughtService2 != null && socialThoughtService2.LIZIZ() != null) {
                User user2 = storyInboxItem.getUser();
                if (user2 != null) {
                    uid2 = user2.getUid();
                } else {
                    uid2 = null;
                }
                StoryInboxCell storyInboxCell = (StoryInboxCell) c1266070j3F.l0;
                boolean z = storyInboxCell.LLJL;
                String strLJJII = C1609930rzr.LJJII(storyInboxCell.X5());
                ((StoryInboxCell) c1266070j3F.l0).r6().LJIJ();
                User user3 = storyInboxItem.getUser();
                if (user3 != null) {
                    uid3 = user3.getUid();
                } else {
                    uid3 = null;
                }
                String strLJIILL = C341220DZg.LJIILL(storyInboxItem.getUser(), uid3);
                Integer numValueOf = Integer.valueOf(C1595350rcL.LIZ((StoryInboxCell) c1266070j3F.l0));
                User user4 = storyInboxItem.getUser();
                if (user4 != null) {
                    requestId = user4.getRequestId();
                }
                C341220DZg.LJIIJ(uid2, thoughtInfo, "notification_page", "top_cell_bubble", z, strLJJII, strLJIILL, numValueOf, requestId);
            }
        }
    }
}
