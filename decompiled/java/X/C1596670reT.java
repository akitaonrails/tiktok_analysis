package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0reT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596670reT implements InterfaceC1597070rf7 {
    public static final C1596670reT LIZ = new C1596670reT();

    @Override // X.InterfaceC1597700rg8
    public final Object LIZJ(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super C1160260gIa<? extends InterfaceC1891350zJl>> interfaceC1364105Vn) {
        return C1597080rf8.LIZ(this, c1596730reZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
    @Override // X.InterfaceC1597070rf7
    public final Object LIZLLL(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super Map<EnumC1597060rf6, ? extends C1160260gIa<? extends InterfaceC1891350zJl>>> interfaceC1364105Vn) {
        boolean z;
        String str;
        List listLIZ;
        List listLIZIZ;
        if (c1596730reZ.LIZIZ == EnumC1597050rf5.REFRESH) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C2097608Jq.LJ();
        }
        try {
            FollowingInterestUsersResponse followingInterestUsersResponseLIZIZ = C1596470re9.LIZIZ(null, Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), true), true, 2);
            if (followingInterestUsersResponseLIZIZ.getCode() != 0) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchGrouped server error, code=");
                sbLIZ.append(followingInterestUsersResponseLIZIZ.getCode());
                C1720106oR.LIZ("FollowingFeedLiveSkylightFetcher", C2188811AlT.LIZIZ(sbLIZ));
                return C2097608Jq.LJ();
            }
            List<FollowingInterestUser> followingInterestUsers = followingInterestUsersResponseLIZIZ.getFollowingInterestUsers();
            if (followingInterestUsers == null) {
                C1596130rdb c1596130rdb = C1596130rdb.LIZ;
                int i2 = c1596730reZ.LIZ;
                str = null;
                FollowingInterestUsersResponse followingInterestUsersResponse = new FollowingInterestUsersResponse(0, new ArrayList(), new ArrayList(), 0, 0L, null, null);
                c1596130rdb.getClass();
                C1596130rdb.LJIILIIL(i2, followingInterestUsersResponse);
                listLIZ = C13BV.INSTANCE;
            } else {
                ArrayList arrayList = new ArrayList(followingInterestUsers);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((FollowingInterestUser) it2.next()).setLogPbBean(followingInterestUsersResponseLIZIZ.getLogPbBean());
                }
                C1596460re8 c1596460re8 = new C1596460re8();
                boolean zLIZ = C1601110rld.LIZ();
                boolean zLJIILLIIL = c1596460re8.LJIILLIIL();
                c1596460re8.LJIL(null, arrayList);
                C1596130rdb c1596130rdb2 = C1596130rdb.LIZ;
                int i3 = c1596730reZ.LIZ;
                str = null;
                FollowingInterestUsersResponse followingInterestUsersResponse2 = new FollowingInterestUsersResponse(followingInterestUsersResponseLIZIZ.getCode(), arrayList, followingInterestUsersResponseLIZIZ.getEcLiveEventList(), 0, 0L, followingInterestUsersResponseLIZIZ.getLogPbBean(), null);
                c1596130rdb2.getClass();
                C1596130rdb.LJIILIIL(i3, followingInterestUsersResponse2);
                listLIZ = C1596310rdt.LIZ(C1596310rdt.LIZLLL(arrayList, zLIZ, zLJIILLIIL), zLJIILLIIL, zLIZ);
            }
            List<FollowingInterestUser> ecLiveEventList = followingInterestUsersResponseLIZIZ.getEcLiveEventList();
            if (ecLiveEventList != null) {
                listLIZIZ = C1596310rdt.LIZIZ(ecLiveEventList);
            } else {
                listLIZIZ = C13BV.INSTANCE;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(EnumC1597060rf6.LIVE, new C1160260gIa(26, str, listLIZ, str, false, false));
            if (!listLIZIZ.isEmpty()) {
                linkedHashMap.put(EnumC1597060rf6.LIVE_EVENT, new C1160260gIa(26, str, listLIZIZ, str, false, false));
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchGrouped error: ");
            sbLIZ2.append(e.getMessage());
            C1720106oR.LIZ("FollowingFeedLiveSkylightFetcher", C2188811AlT.LIZIZ(sbLIZ2));
            return C2097608Jq.LJ();
        }
    }
}
