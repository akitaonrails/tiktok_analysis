package Y;

import X.C09JN;
import X.C0DOO;
import X.C0DOT;
import X.C1245860iWe;
import X.C13BV;
import X.C15438062q;
import X.C1C7U;
import X.C339420DSi;
import X.EnumC1231460i9Q;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SearchSchoolMembersViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public class AfS42S1100000_4 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS42S1100000_4 afS42S1100000_4, Object obj) {
        C1C7U.LIZ("SearchSchoolMembersViewModel@81bb.search$4");
        RelationSearchResponse relationSearchResponse = (RelationSearchResponse) obj;
        relationSearchResponse.checkValid();
        List<User> list = relationSearchResponse.searchUser;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            C0DOO c0doo = C0DOO.LIZ;
            C1245860iWe c1245860iWe = new C1245860iWe(EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE, null, null);
            String str = afS42S1100000_4.s0;
            C0DOT c0dot = C0DOT.NO_RESULT;
            Integer numValueOf = Integer.valueOf(list.size());
            c0doo.getClass();
            C0DOO.LJIIJ(c1245860iWe, str, c0dot, numValueOf);
        } else {
            C0DOO c0doo2 = C0DOO.LIZ;
            C1245860iWe c1245860iWe2 = new C1245860iWe(EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE, null, null);
            String str2 = afS42S1100000_4.s0;
            C0DOT c0dot2 = C0DOT.SUCCESS;
            Integer numValueOf2 = Integer.valueOf(list.size());
            c0doo2.getClass();
            C0DOO.LJIIJ(c1245860iWe2, str2, c0dot2, numValueOf2);
        }
        SearchSchoolMembersViewModel searchSchoolMembersViewModel = (SearchSchoolMembersViewModel) afS42S1100000_4.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (User user : list) {
            searchSchoolMembersViewModel.getClass();
            arrayList.add(new C339420DSi(user.getNickname(), user, Boolean.FALSE, Boolean.TRUE, (Integer) searchSchoolMembersViewModel.LLILLJJLI.invoke(Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()))));
        }
        ((SearchSchoolMembersViewModel) afS42S1100000_4.l1).setState(new AwS583S0100000_4(arrayList, (List<GroupUnsubscribeSetting>) 169));
        C1C7U.LIZIZ("SearchSchoolMembersViewModel@81bb.search$4");
    }

    public static final void accept$1(AfS42S1100000_4 afS42S1100000_4, Object obj) {
        C1C7U.LIZ("SearchSchoolMembersViewModel@81bb.search$5");
        C0DOO c0doo = C0DOO.LIZ;
        C1245860iWe c1245860iWe = new C1245860iWe(EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE, null, null);
        String str = afS42S1100000_4.s0;
        C0DOT c0dot = C0DOT.FAIL;
        c0doo.getClass();
        C0DOO.LJIIJ(c1245860iWe, str, c0dot, 0);
        ((SearchSchoolMembersViewModel) afS42S1100000_4.l1).setState(new AwS583S0100000_4((Throwable) obj, 170));
        C1C7U.LIZIZ("SearchSchoolMembersViewModel@81bb.search$5");
    }

    public AfS42S1100000_4(String str, SearchSchoolMembersViewModel searchSchoolMembersViewModel, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = searchSchoolMembersViewModel;
    }
}
