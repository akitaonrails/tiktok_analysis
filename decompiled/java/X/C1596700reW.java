package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0reW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596700reW implements InterfaceC1597070rf7 {
    public static final C1596700reW LIZ = new C1596700reW();

    @Override // X.InterfaceC1597700rg8
    public final Object LIZJ(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super C1160260gIa<? extends InterfaceC1891350zJl>> interfaceC1364105Vn) {
        return C1597080rf8.LIZ(this, c1596730reZ, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1597070rf7
    public final Object LIZLLL(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super Map<EnumC1597060rf6, ? extends C1160260gIa<? extends InterfaceC1891350zJl>>> interfaceC1364105Vn) {
        Integer num;
        List listLIZLLL;
        if (c1596730reZ.LIZ == 1) {
            if (c1596730reZ.LIZIZ != EnumC1597050rf5.REFRESH) {
                return C2097608Jq.LJ();
            }
            List<AnonymousClass0060> list = c1596730reZ.LJ;
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass0060 anonymousClass0060 : list) {
                if (anonymousClass0060 instanceof C1596740rea) {
                    arrayList.add(anonymousClass0060);
                }
            }
            C1596740rea c1596740rea = (C1596740rea) ((AnonymousClass0060) C13LP.LJJJLL(arrayList));
            if (c1596740rea != null) {
                num = c1596740rea.LIZLLL;
            } else {
                num = null;
            }
            try {
                FollowingInterestUsersResponse followingInterestUsersResponseLIZIZ = C1596470re9.LIZIZ(num, false, false, 14);
                if (followingInterestUsersResponseLIZIZ.getCode() != 0) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchForYouFeed server error, code=");
                    sbLIZ.append(followingInterestUsersResponseLIZIZ.getCode());
                    C1720106oR.LIZ("FeedSkylightLiveDataFetcher", C2188811AlT.LIZIZ(sbLIZ));
                    return C2097608Jq.LJ();
                }
                List<FollowingInterestUser> followingInterestUsers = followingInterestUsersResponseLIZIZ.getFollowingInterestUsers();
                if (followingInterestUsers != null) {
                    Iterator<FollowingInterestUser> it2 = followingInterestUsers.iterator();
                    while (it2.hasNext()) {
                        it2.next().setLogPbBean(followingInterestUsersResponseLIZIZ.getLogPbBean());
                    }
                }
                boolean zLIZ = C1601110rld.LIZ();
                if (followingInterestUsers != null) {
                    listLIZLLL = C1596310rdt.LIZLLL(followingInterestUsers, zLIZ, false);
                } else {
                    listLIZLLL = C13BV.INSTANCE;
                }
                if (listLIZLLL.isEmpty()) {
                    return C2097608Jq.LJ();
                }
                return C2097908Jt.LIZJ(new Pair(EnumC1597060rf6.LIVE, new C1160260gIa(26, null, listLIZLLL, null, false, false)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fetchForYouFeed error: ");
                sbLIZ2.append(e.getMessage());
                C1720106oR.LIZ("FeedSkylightLiveDataFetcher", C2188811AlT.LIZIZ(sbLIZ2));
                return C2097608Jq.LJ();
            }
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("fetchGrouped: scene=");
        sbLIZ3.append(c1596730reZ.LIZ);
        sbLIZ3.append(" not supported on platform path yet");
        C1720106oR.LJI("FeedSkylightLiveDataFetcher", C2188811AlT.LIZIZ(sbLIZ3));
        return C2097608Jq.LJ();
    }
}
