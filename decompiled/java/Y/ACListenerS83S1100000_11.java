package Y;

import X.AbstractC704860Rkq;
import X.C1336205Ku;
import X.C1618440sDa;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2189821An6;
import X.C424420Gka;
import X.C704840Rko;
import X.C704940Rky;
import X.C705130RlH;
import X.C705140RlI;
import X.C705230RlR;
import X.C705340Rlc;
import X.C724240Sb0;
import X.C729510SjV;
import X.EnumC714710S1t;
import X.EnumC896890ZGl;
import X.InterfaceC1365380ldQ;
import X.InterfaceC702810RhX;
import X.InterfaceC714600S1i;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomFriendsV3DetailStoryDMAssem;
import com.ss.android.ugc.aweme.detail.component.biz.friends.FriendsDetailBottomBarQuickDMAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.service.IQuickDmService;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class ACListenerS83S1100000_11 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

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
        }
    }

    public static final void onClick$0(ACListenerS83S1100000_11 aCListenerS83S1100000_11, View view) {
        Integer numValueOf;
        InterfaceC714600S1i quickReplyAnalytics;
        String uid;
        int followStatus;
        User author;
        String str;
        String str2;
        Map<String, String> extra;
        BottomFriendsV3DetailStoryDMAssem bottomFriendsV3DetailStoryDMAssem = (BottomFriendsV3DetailStoryDMAssem) aCListenerS83S1100000_11.l1;
        String str3 = aCListenerS83S1100000_11.s0;
        Aweme aweme = bottomFriendsV3DetailStoryDMAssem.LLJILLL;
        if (aweme != null) {
            C424420Gka.LIZ().LIZJ(str3);
            Aweme aweme2 = bottomFriendsV3DetailStoryDMAssem.LLJILLL;
            if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                C2189821An6 c2189821An6Xp0 = bottomFriendsV3DetailStoryDMAssem.xp0();
                if (c2189821An6Xp0 == null || (extra = c2189821An6Xp0.getExtra()) == null || (str = extra.get("enter_position")) == null) {
                    str = "feed";
                }
                InterfaceC1365380ldQ interfaceC1365380ldQ = (InterfaceC1365380ldQ) bottomFriendsV3DetailStoryDMAssem.LLJI.getValue();
                String eventType = bottomFriendsV3DetailStoryDMAssem.getEventType();
                EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_STORY_QUICK_ENTRANCE;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("dm_reply_type", "emoji");
                if (C729510SjV.LJJIJIL(aweme2)) {
                    str2 = "story";
                } else {
                    str2 = "post";
                }
                linkedHashMap.put("story_type", str2);
                linkedHashMap.put("use_story_gid", aweme2.getAid());
                linkedHashMap.put("friends_tab_version", "v3.0");
                linkedHashMap.put("is_detail_page", "1");
                if (C729510SjV.LJJIJIL(aweme2)) {
                    String strLJII = C729510SjV.LJII(aweme2);
                    if (strLJII.length() > 0) {
                        linkedHashMap.put("from_story_collection_id", strLJII);
                    }
                }
                interfaceC1365380ldQ.LJJJI(str3, author, aweme2, eventType, enumC896890ZGl, str, null, null, false, linkedHashMap, new AwS220S0300000_11(aweme2, author, bottomFriendsV3DetailStoryDMAssem, 24));
                bottomFriendsV3DetailStoryDMAssem.ap("click_story_dm_input_box", "click_exposed_emoji");
                bottomFriendsV3DetailStoryDMAssem.bp(EnumC714710S1t.CLICK_OUTER_EMOJI);
            }
            IIMService iIMService = (IIMService) bottomFriendsV3DetailStoryDMAssem.LLJ.getValue();
            if (iIMService != null && (quickReplyAnalytics = iIMService.getQuickReplyAnalytics()) != null) {
                String eventType2 = bottomFriendsV3DetailStoryDMAssem.getEventType();
                User author2 = aweme.getAuthor();
                if (author2 == null || (uid = author2.getUid()) == null) {
                    uid = "";
                }
                User author3 = aweme.getAuthor();
                if (author3 != null) {
                    followStatus = author3.getFollowStatus();
                } else {
                    followStatus = 0;
                }
                quickReplyAnalytics.LJI(followStatus, eventType2, "emoji", uid);
            }
            IQuickDmService quickDmService = C1336205Ku.LIZ(false).getQuickDmService();
            Fragment fragmentLJI = C724240Sb0.LJI(bottomFriendsV3DetailStoryDMAssem);
            if (fragmentLJI != null) {
                numValueOf = Integer.valueOf(fragmentLJI.hashCode());
            } else {
                numValueOf = null;
            }
            quickDmService.onQuickReplyEmojiSendAnimations(view, str3, numValueOf, new AwS555S0100000_11(aweme, 1477));
            C1618440sDa.LIZIZ.LJJLIIIJL().LJ(view, null, null);
        }
    }

    public static final void onClick$1(ACListenerS83S1100000_11 aCListenerS83S1100000_11, View view) {
        User author;
        Aweme aweme;
        InterfaceC1365380ldQ shareService;
        String str;
        FriendsDetailBottomBarQuickDMAssem friendsDetailBottomBarQuickDMAssem = (FriendsDetailBottomBarQuickDMAssem) aCListenerS83S1100000_11.l1;
        String str2 = aCListenerS83S1100000_11.s0;
        Aweme aweme2 = friendsDetailBottomBarQuickDMAssem.LLJJJ;
        if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
            C424420Gka.LIZ().LIZJ(str2);
            IMSharePanelApi iMSharePanelApi = (IMSharePanelApi) PluggableExtentionKt.pluggableSpi$default(IMSharePanelApi.class, false, false, false, 14, null);
            if (iMSharePanelApi != null && (shareService = iMSharePanelApi.getShareService()) != null) {
                EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_MUF_QUICK_ENTRANCE;
                Pair[] pairArr = new Pair[7];
                pairArr[0] = new Pair("dm_reply_type", "emoji");
                if (C729510SjV.LJJIJIL(aweme2)) {
                    str = "story";
                } else {
                    str = "post";
                }
                pairArr[1] = new Pair("story_type", str);
                pairArr[2] = new Pair("use_story_gid", aweme2.getAid());
                pairArr[3] = new Pair("enter_method", "friend_tab_exposed_emoji");
                pairArr[4] = new Pair("friends_tab_version", "v3.0");
                pairArr[5] = new Pair("is_detail_page", "1");
                pairArr[6] = new Pair("is_collapse_reposts", CardStruct.IStatusCode.DEFAULT);
                aweme = aweme2;
                shareService.LJJJI(str2, author, aweme2, "homepage_friends", enumC896890ZGl, "feed", null, null, true, C2097608Jq.LJIIJ(pairArr), new AwS377S0200000_11(friendsDetailBottomBarQuickDMAssem, author, 127));
            } else {
                aweme = aweme2;
            }
            C1336205Ku.LIZ(false).getQuickDmService().onQuickReplyEmojiSendAnimations(view, str2, null, new AwS555S0100000_11(aweme, 1511));
            friendsDetailBottomBarQuickDMAssem.up(EnumC714710S1t.CLICK_OUTER_EMOJI);
        }
    }

    public static final void onClick$2(ACListenerS83S1100000_11 aCListenerS83S1100000_11, View view) {
        InterfaceC702810RhX interfaceC702810RhX;
        C705340Rlc c705340Rlc = ((C705140RlI) aCListenerS83S1100000_11.l1).LJIILIIL;
        if (c705340Rlc != null) {
            c705340Rlc.LIZIZ(aCListenerS83S1100000_11.s0);
        }
        C705140RlI c705140RlI = (C705140RlI) aCListenerS83S1100000_11.l1;
        C704840Rko c704840Rko = c705140RlI.LJII;
        if (c704840Rko != null && (interfaceC702810RhX = c704840Rko.LJI) != null) {
            interfaceC702810RhX.LIZIZ();
        }
        c705140RlI.LJIILJJIL();
        C20684815ws.LJFF().submit(new ARunnableS80S0200000_11(c705140RlI, view, 43));
    }

    public static final void onClick$3(ACListenerS83S1100000_11 aCListenerS83S1100000_11, View view) {
        InterfaceC702810RhX interfaceC702810RhX;
        C705340Rlc c705340Rlc = ((C705130RlH) aCListenerS83S1100000_11.l1).LJIILIIL;
        if (c705340Rlc != null) {
            c705340Rlc.LIZIZ(aCListenerS83S1100000_11.s0);
        }
        C705130RlH c705130RlH = (C705130RlH) aCListenerS83S1100000_11.l1;
        C704840Rko c704840Rko = c705130RlH.LJII;
        if (c704840Rko != null && (interfaceC702810RhX = c704840Rko.LJI) != null) {
            interfaceC702810RhX.LIZIZ();
        }
        c705130RlH.LJIILJJIL();
        C20684815ws.LJFF().submit(new ARunnableS80S0200000_11(c705130RlH, view, 44));
    }

    public static final void onClick$4(ACListenerS83S1100000_11 aCListenerS83S1100000_11, View view) {
        String aid;
        Aweme aweme;
        InterfaceC702810RhX interfaceC702810RhX;
        Aweme aweme2;
        C705230RlR c705230RlR = (C705230RlR) aCListenerS83S1100000_11.l1;
        Boolean bool = Boolean.TRUE;
        c705230RlR.getClass();
        C704940Rky c704940Rky = C704940Rky.LIZ;
        T t = c705230RlR.LJIIL;
        List listSingletonList = Collections.singletonList(new Pair("button.is_clicked", bool));
        c704940Rky.getClass();
        AbstractC704860Rkq abstractC704860RkqLIZ = C704940Rky.LIZ(t, listSingletonList);
        if (abstractC704860RkqLIZ != null) {
            abstractC704860RkqLIZ.LIZ();
        }
        C705340Rlc c705340Rlc = ((C705230RlR) aCListenerS83S1100000_11.l1).LJIILIIL;
        if (c705340Rlc != null) {
            c705340Rlc.LIZIZ(aCListenerS83S1100000_11.s0);
        }
        C705230RlR c705230RlR2 = (C705230RlR) aCListenerS83S1100000_11.l1;
        c705230RlR2.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component: ");
        sbLIZ.append(c705230RlR2.LIZJ);
        sbLIZ.append(", template: ");
        sbLIZ.append(c705230RlR2.LJ);
        sbLIZ.append(", start reporting fdmt click, aid: ");
        VideoItemParams videoItemParams = c705230RlR2.LJIIJJI;
        String aid2 = null;
        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        C704840Rko c704840Rko = c705230RlR2.LJII;
        if (c704840Rko != null && (interfaceC702810RhX = c704840Rko.LJI) != null) {
            interfaceC702810RhX.LIZIZ();
        }
        c705230RlR2.LJIILJJIL();
        C20684815ws.LJFF().submit(new ARunnableS80S0200000_11(c705230RlR2, view, 83));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("component: ");
        sbLIZ2.append(c705230RlR2.LIZJ);
        sbLIZ2.append(", template: ");
        sbLIZ2.append(c705230RlR2.LJ);
        sbLIZ2.append(", finish reporting fdmt click, aid: ");
        VideoItemParams videoItemParams2 = c705230RlR2.LJIIJJI;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ2.append(aid2);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public ACListenerS83S1100000_11(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public ACListenerS83S1100000_11(BottomFriendsV3DetailStoryDMAssem bottomFriendsV3DetailStoryDMAssem, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = bottomFriendsV3DetailStoryDMAssem;
        this.s0 = str;
    }
}
