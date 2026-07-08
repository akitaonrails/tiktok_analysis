package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.school.service.SchoolFlowLauncher;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iX5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246130iX5 {
    public static boolean LIZIZ;
    public static final C1246130iX5 LIZ = new C1246130iX5();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(847));

    public static String LIZLLL() {
        User currentUser;
        String uid;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        return (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) ? "" : uid;
    }

    public static Keva LJ() {
        return (Keva) LIZJ.getValue();
    }

    public static void LJII() {
        int iLIZ = C1387310mCn.LIZ(System.currentTimeMillis());
        if (LJ().getInt(LJFF("day"), -1) != iLIZ) {
            LJ().storeInt(LJFF("day"), iLIZ);
            Keva kevaLJ = LJ();
            String strLJFF = LJFF("show_aids_string_set");
            C08CX c08cx = C08CX.INSTANCE;
            kevaLJ.storeStringSet(strLJFF, c08cx);
            LJ().storeStringSet(LJFF("click_aids_string_set"), c08cx);
        }
    }

    public static boolean LIZIZ(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        User author2;
        MatchedFriendStruct matchedFriendStruct2;
        SchoolMutualStruct schoolMutualStruct;
        String str;
        User author3;
        MatchedFriendStruct matchedFriendStruct3;
        SchoolMutualStruct schoolMutualStruct2;
        String str2;
        if (!C1245620iWG.LIZ() || aweme == null || (author = aweme.getAuthor()) == null || (matchedFriendStruct = author.getMatchedFriendStruct()) == null || matchedFriendStruct.schoolMutualStruct == null || (author2 = aweme.getAuthor()) == null || (matchedFriendStruct2 = author2.getMatchedFriendStruct()) == null || (schoolMutualStruct = matchedFriendStruct2.schoolMutualStruct) == null || (str = schoolMutualStruct.schoolId) == null || str.length() == 0 || (author3 = aweme.getAuthor()) == null || (matchedFriendStruct3 = author3.getMatchedFriendStruct()) == null || (schoolMutualStruct2 = matchedFriendStruct3.schoolMutualStruct) == null || (str2 = schoolMutualStruct2.schoolName) == null || str2.length() == 0) {
            return false;
        }
        return true;
    }

    public static String LIZJ(SchoolMutualStruct schoolMutualStruct) {
        if (schoolMutualStruct == null) {
            return "";
        }
        int i = schoolMutualStruct.schoolContentType;
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "college_related_post";
        }
        int i2 = schoolMutualStruct.viewerVerifyStatus;
        if (i2 != 1) {
            if (i2 != 2) {
                return "";
            }
            return "college_member_post_potential";
        }
        return "college_member_post";
    }

    public static String LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJIIIIZZ(String str) {
        if (LIZLLL().length() == 0 || str.length() == 0) {
            return true;
        }
        LJII();
        Keva kevaLJ = LJ();
        String strLJFF = LJFF("show_aids_string_set");
        C08CX c08cx = C08CX.INSTANCE;
        Set<String> stringSet = kevaLJ.getStringSet(strLJFF, c08cx);
        Set<String> stringSet2 = LJ().getStringSet(LJFF("click_aids_string_set"), c08cx);
        int size = stringSet.size();
        int size2 = stringSet2.size();
        C1246150iX7.LIZ.getClass();
        if (size >= C1246150iX7.LIZ().fypAnchorShowThreshold || size - size2 >= C1246150iX7.LIZ().fypAnchorViewWithoutClickThreshold) {
            return false;
        }
        return true;
    }

    public static void LIZ(Aweme aweme, boolean z) {
        MatchedFriendStruct matchedFriendStruct;
        SchoolMutualStruct schoolMutualStruct;
        MatchedFriendStruct matchedFriendStruct2;
        if (!LIZIZ(aweme)) {
            return;
        }
        String aid = aweme.getAid();
        String str = "";
        if (aid == null) {
            aid = "";
        }
        if (LIZLLL().length() != 0 && aid.length() != 0) {
            LJII();
            LinkedHashSet linkedHashSet = new LinkedHashSet(LJ().getStringSet(LJFF("show_aids_string_set"), C08CX.INSTANCE));
            if (linkedHashSet.add(aid)) {
                LJ().storeStringSet(LJFF("show_aids_string_set"), linkedHashSet);
            }
        }
        C1245860iWe c1245860iWe = new C1245860iWe(EnumC1231460i9Q.HOMEPAGE_HOT, null, null);
        SchoolMutualStruct schoolMutualStruct2 = null;
        if (z) {
            C1245880iWg c1245880iWg = C1245880iWg.LIZ;
            User author = aweme.getAuthor();
            if (author != null && (matchedFriendStruct2 = author.getMatchedFriendStruct()) != null) {
                schoolMutualStruct2 = matchedFriendStruct2.schoolMutualStruct;
            }
            String strLIZJ = LIZJ(schoolMutualStruct2);
            String strValueOf = String.valueOf(aweme.getAwemeType());
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            String aid2 = aweme.getAid();
            c1245880iWg.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
            c2344009Gk.LJIIIIZZ("anchor_type", strLIZJ);
            c2344009Gk.LJIIIIZZ("aweme_type", strValueOf);
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            c2344009Gk.LJIIIIZZ("group_id", aid2);
            C20684815ws.LJIILLIIL("ttsocial_school_anchor_entrance_show", c2344009Gk.LIZ);
            return;
        }
        C1245880iWg c1245880iWg2 = C1245880iWg.LIZ;
        User author2 = aweme.getAuthor();
        if (author2 != null && (matchedFriendStruct = author2.getMatchedFriendStruct()) != null && (schoolMutualStruct = matchedFriendStruct.schoolMutualStruct) != null && schoolMutualStruct.viewerVerifyStatus == 2) {
            int i = schoolMutualStruct.schoolContentType;
            if (i != 1) {
                if (i == 2) {
                    str = "college_related_post_potential";
                }
            } else {
                str = "college_member_post_potential";
            }
        }
        String strValueOf2 = String.valueOf(aweme.getAwemeType());
        String authorUid2 = AwemeExtKt.getAuthorUid(aweme);
        String aid3 = aweme.getAid();
        c1245880iWg2.getClass();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        C1245880iWg.LIZ(c2344009Gk2, c1245860iWe);
        c2344009Gk2.LJIIIIZZ("enter_method", str);
        c2344009Gk2.LJIIIIZZ("aweme_type", strValueOf2);
        c2344009Gk2.LJIIIIZZ("author_id", authorUid2);
        c2344009Gk2.LJIIIIZZ("group_id", aid3);
        C20684815ws.LJIILLIIL("ttsocial_add_school_btn_show", c2344009Gk2.LIZ);
    }

    public static void LJI(Context context, Aweme aweme, boolean z) {
        MatchedFriendStruct matchedFriendStruct;
        SchoolMutualStruct schoolMutualStruct;
        String str;
        String str2;
        C19EG c19egLIZIZ;
        SchoolFlowLauncher schoolFlowLauncher;
        MatchedFriendStruct matchedFriendStruct2;
        SchoolMutualStruct schoolMutualStruct2;
        MatchedFriendStruct matchedFriendStruct3;
        User author = aweme.getAuthor();
        if (author == null || (matchedFriendStruct = author.getMatchedFriendStruct()) == null || (schoolMutualStruct = matchedFriendStruct.schoolMutualStruct) == null || (str = schoolMutualStruct.schoolId) == null || str.length() == 0 || (str2 = schoolMutualStruct.schoolName) == null || str2.length() == 0 || context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (schoolFlowLauncher = (SchoolFlowLauncher) PluggableExtentionKt.pluggableSpi$default(SchoolFlowLauncher.class, false, false, false, 14, null)) == null) {
            return;
        }
        C1245860iWe c1245860iWe = new C1245860iWe(EnumC1231460i9Q.HOMEPAGE_HOT, null, null);
        c19egLIZIZ.getSupportFragmentManager().LJZL(new AbstractC813200VvC() { // from class: X.0iX6
            @Override // X.AbstractC813200VvC
            public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                if (Intrinsics.LJFF(fragment.getTag(), "CampusFlowFragment")) {
                    C1246130iX5.LIZ.getClass();
                    if (C1246130iX5.LIZIZ) {
                        C1483410ohn.LJLJJI().LJIILLIIL();
                        C1246130iX5.LIZIZ = false;
                    }
                    fragmentManager.LLIILZL(this);
                }
            }
        }, false);
        schoolFlowLauncher.LIZIZ(c19egLIZIZ, new C1245830iWb(EnumC338580DPc.FIND_SCHOOL_FRIENDS, c1245860iWe, false, EnumC338600DPe.POST, aweme.getAid(), schoolMutualStruct, false, 68));
        String aid = aweme.getAid();
        String str3 = "";
        if (aid == null) {
            aid = "";
        }
        if (LIZLLL().length() != 0 && aid.length() != 0) {
            LJII();
            LinkedHashSet linkedHashSet = new LinkedHashSet(LJ().getStringSet(LJFF("click_aids_string_set"), C08CX.INSTANCE));
            if (linkedHashSet.add(aid)) {
                LJ().storeStringSet(LJFF("click_aids_string_set"), linkedHashSet);
            }
        }
        SchoolMutualStruct schoolMutualStruct3 = null;
        if (z) {
            C1245880iWg c1245880iWg = C1245880iWg.LIZ;
            User author2 = aweme.getAuthor();
            if (author2 != null && (matchedFriendStruct3 = author2.getMatchedFriendStruct()) != null) {
                schoolMutualStruct3 = matchedFriendStruct3.schoolMutualStruct;
            }
            String strLIZJ = LIZJ(schoolMutualStruct3);
            String strValueOf = String.valueOf(aweme.getAwemeType());
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            String aid2 = aweme.getAid();
            c1245880iWg.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
            c2344009Gk.LJIIIIZZ("anchor_type", strLIZJ);
            c2344009Gk.LJIIIIZZ("aweme_type", strValueOf);
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            c2344009Gk.LJIIIIZZ("group_id", aid2);
            C20684815ws.LJIILLIIL("ttsocial_school_anchor_entrance_click", c2344009Gk.LIZ);
        } else {
            C1245880iWg c1245880iWg2 = C1245880iWg.LIZ;
            User author3 = aweme.getAuthor();
            if (author3 != null && (matchedFriendStruct2 = author3.getMatchedFriendStruct()) != null && (schoolMutualStruct2 = matchedFriendStruct2.schoolMutualStruct) != null && schoolMutualStruct2.viewerVerifyStatus == 2) {
                int i = schoolMutualStruct2.schoolContentType;
                if (i != 1) {
                    if (i == 2) {
                        str3 = "college_related_post_potential";
                    }
                } else {
                    str3 = "college_member_post_potential";
                }
            }
            String strValueOf2 = String.valueOf(aweme.getAwemeType());
            String authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            String aid3 = aweme.getAid();
            c1245880iWg2.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            C1245880iWg.LIZ(c2344009Gk2, c1245860iWe);
            c2344009Gk2.LJIIIIZZ("enter_method", str3);
            c2344009Gk2.LJIIIIZZ("aweme_type", strValueOf2);
            c2344009Gk2.LJIIIIZZ("author_id", authorUid2);
            c2344009Gk2.LJIIIIZZ("group_id", aid3);
            C20684815ws.LJIILLIIL("ttsocial_add_school_btn_click", c2344009Gk2.LIZ);
        }
        if (C1483410ohn.LJLJJI().isPlaying()) {
            C1483410ohn.LJLJJI().LIZ();
            LIZIZ = true;
        }
    }
}
