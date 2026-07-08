package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.HybridLabelTagType;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.mutual.IMutualRelationService;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationServiceImpl;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ra6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698200Ra6 {
    public static final C698200Ra6 LIZ = new C698200Ra6();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1919807fY());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1919907fZ());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1919707fX());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1919607fW());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1919507fV());

    public static boolean LIZIZ(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        String str;
        MatchedFriendStruct matchedFriendStruct2;
        SchoolMutualStruct schoolMutualStruct;
        if (aweme != null && !LJ(aweme) && !AwemeBizExtKt.getReplaceRecTagByRepost(aweme)) {
            if (C1245620iWG.LIZ()) {
                C1246130iX5 c1246130iX5 = C1246130iX5.LIZ;
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                c1246130iX5.getClass();
                if (C1246130iX5.LJIIIIZZ(aid)) {
                    User author2 = aweme.getAuthor();
                    if (author2 != null && (matchedFriendStruct2 = author2.getMatchedFriendStruct()) != null && (schoolMutualStruct = matchedFriendStruct2.schoolMutualStruct) != null) {
                        str = schoolMutualStruct.anchor;
                    } else {
                        str = null;
                    }
                    if (C123100dR.LIZ(str)) {
                        return true;
                    }
                }
            }
            if (C123100dR.LIZ(C727520SgI.LIZJ(aweme)) && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && matchedFriendStruct.socialUIConfig != 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdTagPosition() == 1) {
            return true;
        }
        if (!aweme.isAd() && ((C300940Bqu.LIZ() || C299470BoX.LIZ()) && !C10EU.LJIILLIIL(aweme.getAuthor()))) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme, Function1 function1) {
        String str;
        if (aweme == null || LJ(aweme)) {
            return false;
        }
        List<AwemeHybridLabelModel> hybridLabels = aweme.getHybridLabels();
        if (!C866950Xzh.LIZIZ(hybridLabels)) {
            return false;
        }
        C698200Ra6 c698200Ra6 = LIZ;
        int i = ((AwemeHybridLabelModel) ListProtector.get(hybridLabels, 0)).labelType;
        c698200Ra6.getClass();
        if (i == HybridLabelTagType.FRIEND.getValue()) {
            str = "high_tag_friend";
        } else if (i == HybridLabelTagType.FOLLOWING.getValue()) {
            str = "high_tag_following";
        } else if (i == HybridLabelTagType.UNKNOWN.getValue()) {
            str = "high_tag_relation_unknown";
        } else {
            str = "";
        }
        if (function1 != null) {
            function1.invoke(str);
        }
        if (str.length() <= 0 || AwemeBizExtKt.getReplaceRecTagByRepost(aweme)) {
            return false;
        }
        return true;
    }

    public static String LIZLLL(C698200Ra6 c698200Ra6, String str) {
        c698200Ra6.getClass();
        if (str == null) {
            return "";
        }
        if (str.length() <= 18) {
            return str;
        }
        C1360520lVa c1360520lVa = new C1360520lVa();
        if (str.length() > 18) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int iFollowing = characterInstance.following(18);
            if (iFollowing == -1) {
                iFollowing = str.length();
            }
            int i = iFollowing - 1;
            if (Character.isHighSurrogate(str.charAt(i))) {
                iFollowing = i;
            }
            str = str.substring(0, iFollowing);
        }
        c1360520lVa.LIZ.append((CharSequence) str);
        c1360520lVa.LIZ.append((CharSequence) "...");
        return c1360520lVa.LIZ.toString();
    }

    public static void LIZ(final Aweme aweme, List list, final View view, final String str, final boolean z) {
        AwemeHybridLabelModel awemeHybridLabelModel = (AwemeHybridLabelModel) C13LP.LJJJLZIJ(0, list);
        if (awemeHybridLabelModel != null && awemeHybridLabelModel.labelType == HybridLabelTagType.PRIVACY.getValue()) {
            return;
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0STb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                Aweme aweme2;
                User author;
                MatchedFriendStruct matchedFriendStruct;
                MutualStruct mutualStruct;
                List<MutualUser> list2;
                Aweme aweme3;
                User author2;
                MatchedFriendStruct matchedFriendStruct2;
                MutualStruct mutualStruct2;
                List<MutualUser> list3;
                int i;
                User author3;
                MatchedFriendStruct matchedFriendStruct3;
                MutualStruct mutualStruct3;
                String secUid;
                String uid;
                MatchedFriendStruct matchedFriendStruct4;
                MutualStruct mutualStruct4;
                String str3;
                String str4;
                User author4;
                MatchedFriendStruct matchedFriendStruct5;
                User author5;
                MatchedFriendStruct matchedFriendStruct6;
                if (C0OBG.LIZIZ(view2)) {
                    return;
                }
                if (z) {
                    C1246130iX5 c1246130iX5 = C1246130iX5.LIZ;
                    Aweme aweme4 = aweme;
                    c1246130iX5.getClass();
                    if (C1246130iX5.LIZIZ(aweme4)) {
                        C1246130iX5.LJI(view.getContext(), aweme, true);
                        return;
                    }
                }
                C698200Ra6 c698200Ra6 = C698200Ra6.LIZ;
                Aweme aweme5 = aweme;
                c698200Ra6.getClass();
                Integer numValueOf = null;
                if (aweme5 != null && (author5 = aweme5.getAuthor()) != null && (matchedFriendStruct6 = author5.getMatchedFriendStruct()) != null) {
                    str2 = matchedFriendStruct6.recType;
                } else {
                    str2 = null;
                }
                String str5 = "";
                if (str2 == null) {
                    str2 = "";
                }
                if ((Intrinsics.LJFF(str2, "3-1") || Intrinsics.LJFF(str2, "3-2") || Intrinsics.LJFF(str2, "3-3")) && (aweme2 = aweme) != null && (author = aweme2.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && (mutualStruct = matchedFriendStruct.mMutualStruct) != null && (list2 = mutualStruct.userList) != null && !list2.isEmpty()) {
                    C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                    c2276471E8n.d("FeedSocialTagUtil", "[click event]");
                    User author6 = aweme.getAuthor();
                    if (author6 != null && (matchedFriendStruct4 = author6.getMatchedFriendStruct()) != null && (mutualStruct4 = matchedFriendStruct4.mMutualStruct) != null) {
                        numValueOf = Integer.valueOf(mutualStruct4.mutualType);
                    }
                    String strLIZ = C1847707Ln.LIZ(view.getContext(), numValueOf);
                    c2276471E8n.d("FeedSocialTagUtil", String.valueOf(C1388190mED.LIZIZ(view.getContext())));
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
                    if (c19egLIZIZ != null && (aweme3 = aweme) != null && (author2 = aweme3.getAuthor()) != null && (matchedFriendStruct2 = author2.getMatchedFriendStruct()) != null && (mutualStruct2 = matchedFriendStruct2.mMutualStruct) != null && (list3 = mutualStruct2.userList) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (MutualUser mutualUser : list3) {
                            if (mutualUser != null && (uid = mutualUser.getUid()) != null) {
                                arrayList.add(uid);
                            }
                        }
                        ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
                        ArrayList arrayList3 = new ArrayList();
                        for (MutualUser mutualUser2 : list3) {
                            if (mutualUser2 != null && (secUid = mutualUser2.getSecUid()) != null) {
                                arrayList3.add(secUid);
                            }
                        }
                        ArrayList<String> arrayList4 = new ArrayList<>(arrayList3);
                        C698200Ra6.LIZ.getClass();
                        if (aweme3 != null && (author3 = aweme3.getAuthor()) != null && (matchedFriendStruct3 = author3.getMatchedFriendStruct()) != null && (mutualStruct3 = matchedFriendStruct3.mMutualStruct) != null) {
                            i = mutualStruct3.total;
                        } else {
                            i = 0;
                        }
                        IMutualRelationService iMutualRelationServiceLIZJ = MutualRelationServiceImpl.LIZJ();
                        if (strLIZ == null) {
                            strLIZ = c19egLIZIZ.getString(2131836397);
                        }
                        iMutualRelationServiceLIZJ.LIZ(c19egLIZIZ, arrayList2, arrayList4, i, strLIZ, null);
                    }
                    C1360540lVc c1360540lVc = C1360540lVc.LIZIZ;
                    C1260910iuv c1260910iuv = new C1260910iuv(0);
                    String str6 = str;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    c1260910iuv.LJJIJLIJ(str5);
                    c1260910iuv.LJJLIIIJJI = EnumC1260930iux.CLICK_REC_LABEL;
                    c1260910iuv.LJJLL = EnumC721820STc.CLICK_REC_LABEL.getType();
                    c1260910iuv.LJIJI(aweme);
                    c1260910iuv.LJJJJZI(aweme.getAuthor());
                    Aweme aweme6 = aweme;
                    if (C296550Bjp.LIZ()) {
                        c1260910iuv.LJJJJLI(aweme6.getRequestId());
                    } else {
                        c1260910iuv.LJJJJLI(aweme6.getLogPbString());
                    }
                    c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.ITEM;
                    c1260910iuv.LJJJJLL();
                    ((C1260910iuv) c1360540lVc.LIZ(aweme, c1260910iuv)).LJJJJI();
                    return;
                }
                C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(view.getContext());
                if (c19egLIZIZ2 != null) {
                    String str7 = str;
                    Aweme aweme7 = aweme;
                    C1440005kM.LIZ(new C0SPE(c19egLIZIZ2.hashCode(), 0));
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    C19651011uW c19651011uW = C19651011uW.LIZIZ;
                    C735410St1 c735410St1 = new C735410St1();
                    if (str7 == null) {
                        str3 = "";
                    } else {
                        str3 = str7;
                    }
                    c735410St1.LIZLLL = str3;
                    c735410St1.LJJLIIJ = AwemeExtKt.getAuthorUid(aweme7);
                    c735410St1.LJZL = Boolean.TRUE;
                    if (aweme7 == null || (author4 = aweme7.getAuthor()) == null || (matchedFriendStruct5 = author4.getMatchedFriendStruct()) == null || (str4 = matchedFriendStruct5.recType) == null) {
                        str4 = "";
                    }
                    c735410St1.LJIJJ = str4;
                    c735410St1.LJJLIIIJILLIZJL = "click_rec_label";
                    Object objLJIIIZ = c19651011uW.LJIIIZ(aweme7, c735410St1);
                    c735840Sti.getClass();
                    C735840Sti.LIZIZ(aweme7, objLJIIIZ);
                    ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
                    C1360540lVc c1360540lVc2 = C1360540lVc.LIZIZ;
                    C1260910iuv c1260910iuv2 = new C1260910iuv(0);
                    if (str7 != null) {
                        str5 = str7;
                    }
                    c1260910iuv2.LJJIJLIJ(str5);
                    c1260910iuv2.LJJLIIIJJI = EnumC1260930iux.ENTER_PROFILE;
                    c1260910iuv2.LJJLL = EnumC721820STc.CLICK_REC_LABEL.getType();
                    c1260910iuv2.LJIJI(aweme7);
                    c1260910iuv2.LJJJJZI(aweme7.getAuthor());
                    if (C296550Bjp.LIZ()) {
                        c1260910iuv2.LJJJJLI(aweme7.getRequestId());
                    } else {
                        c1260910iuv2.LJJJJLI(aweme7.getLogPbString());
                    }
                    c1260910iuv2.LJJLIIIJILLIZJL = EnumC1260920iuw.ITEM;
                    c1260910iuv2.LJJJJLL();
                    Object objLJIIIZ2 = c19651011uW.LJIIIZ(aweme7, c1260910iuv2);
                    C735840Sti.LIZIZ(aweme7, objLJIIIZ2);
                    ((C1260910iuv) c1360540lVc2.LIZ(aweme7, objLJIIIZ2)).LJJJJI();
                }
            }
        }, view);
    }
}
