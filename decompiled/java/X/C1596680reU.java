package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0reU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596680reU implements InterfaceC1597070rf7 {
    public static final C1596680reU LIZ = new C1596680reU();

    @Override // X.InterfaceC1597700rg8
    public final Object LIZJ(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super C1160260gIa<? extends InterfaceC1891350zJl>> interfaceC1364105Vn) {
        return C1597080rf8.LIZ(this, c1596730reZ, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1597070rf7
    public final Object LIZLLL(C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super Map<EnumC1597060rf6, ? extends C1160260gIa<? extends InterfaceC1891350zJl>>> interfaceC1364105Vn) {
        boolean z;
        InterfaceC473370IhL interfaceC473370IhLLIZLLL;
        Pair pairLIZ;
        FollowingInterestUsersResponse followingInterestUsersResponseLIZIZ;
        List listLIZLLL;
        if (c1596730reZ.LIZIZ == EnumC1597050rf5.REFRESH) {
            z = true;
        } else {
            z = false;
        }
        if (z && C0ACG.LIZ() && ((Boolean) C0BLF.LIZ.getValue()).booleanValue()) {
            try {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null) {
                    interfaceC473370IhLLIZLLL = iLiveOuterService.LIZLLL();
                } else {
                    interfaceC473370IhLLIZLLL = null;
                }
                if (interfaceC473370IhLLIZLLL != null) {
                    pairLIZ = C473360IhK.LIZ(C2097608Jq.LJ());
                } else {
                    pairLIZ = null;
                }
                if (interfaceC473370IhLLIZLLL != null && pairLIZ != null) {
                    followingInterestUsersResponseLIZIZ = C20639915pd.LIZ((String) pairLIZ.getSecond(), (List) pairLIZ.getFirst());
                } else {
                    followingInterestUsersResponseLIZIZ = C1596470re9.LIZIZ(null, false, false, 14);
                }
                if (followingInterestUsersResponseLIZIZ.getCode() != 0) {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZ("FriendsFeedLiveSkylightFetcher", "fetchGrouped server error, code=" + followingInterestUsersResponseLIZIZ.getCode());
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
                return C2097908Jt.LIZJ(new Pair(EnumC1597060rf6.LIVE, new C1160260gIa(26, null, listLIZLLL, null, false, false)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchGrouped error: ");
                sbLIZ.append(e.getMessage());
                C1720106oR.LIZ("FriendsFeedLiveSkylightFetcher", C2188811AlT.LIZIZ(sbLIZ));
                return C2097608Jq.LJ();
            }
        }
        return C2097608Jq.LJ();
    }
}
