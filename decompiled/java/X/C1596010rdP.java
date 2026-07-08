package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0rdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596010rdP {
    public static final C1596010rdP LIZ = new C1596010rdP();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(332));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(331));

    public static void LIZLLL() {
        ILiveOuterService iLiveOuterService;
        InterfaceC486570J6h interfaceC486570J6hR3;
        if (!((Boolean) LIZIZ.getValue()).booleanValue() || (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) == null || (interfaceC486570J6hR3 = iLiveOuterService.r3()) == null) {
            return;
        }
        interfaceC486570J6hR3.LIZ(0, "ttlive_from_following_show_live", C2097908Jt.LIZJ(new Pair("source", "following")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1595260rcC LIZ(C1596020rdQ c1596020rdQ) {
        FollowingInterestUsersResponse followingInterestUsersResponse;
        List arrayList;
        EnumC1595320rcI enumC1595320rcI = c1596020rdQ.LIZIZ;
        T t = c1596020rdQ.LIZ;
        if ((t instanceof FollowingInterestUsersResponse) && (followingInterestUsersResponse = (FollowingInterestUsersResponse) t) != null) {
            Exception exc = c1596020rdQ.LIZJ;
            EnumC1595320rcI enumC1595320rcI2 = EnumC1595320rcI.FAIL;
            if (enumC1595320rcI == enumC1595320rcI2) {
                return new C1595260rcC(enumC1595320rcI2, new ArrayList(), CardStruct.IStatusCode.DEFAULT, exc, null, 0, false, false, 0, 496);
            }
            List<FollowingInterestUser> ecLiveEventList = followingInterestUsersResponse.getEcLiveEventList();
            if (ecLiveEventList != null) {
                arrayList = C1596310rdt.LIZIZ(ecLiveEventList);
            } else {
                arrayList = new ArrayList();
            }
            return new C1595260rcC(enumC1595320rcI, arrayList, CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
        }
        return new C1595260rcC(EnumC1595320rcI.SUCCESS, new ArrayList(), CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
    }

    public static void LJ(int i, long j) {
        if (((Boolean) LIZJ.getValue()).booleanValue()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "room_num");
            c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - j, "duration");
            c2344009Gk.LJIIIIZZ("enter_from_merge", "homepage_follow");
            c2344009Gk.LJIIIIZZ("enter_method", "live_cover");
            c2344009Gk.LJIIIIZZ("action_type", "click");
            c2344009Gk.LJIIIIZZ("request_api", "/aweme/v1/following/interest/users/");
            C20684815ws.LJIILLIIL("livesdk_live_request_response", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(int r5, int r6, X.C1595180rc4 r7) {
        /*
            java.lang.String r4 = "homepage_hot"
            if (r5 == 0) goto Le
            r0 = 1
            if (r5 == r0) goto L11
            r0 = 2
            if (r5 == r0) goto Lb
            return
        Lb:
            java.lang.String r2 = "homepage_follow"
            goto L12
        Le:
            java.lang.String r2 = "homepage_friends"
            goto L12
        L11:
            r2 = r4
        L12:
            java.lang.String r1 = "time_auto"
            if (r7 == 0) goto L7b
            java.lang.String r3 = r7.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
            if (r0 == 0) goto L3e
            java.lang.String r1 = "click"
        L20:
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            java.lang.String r0 = "enter_from_merge"
            r3.LJIIIIZZ(r0, r2)
            java.lang.String r2 = "enter_method"
            java.lang.String r0 = "live_cover"
            r3.LJIIIIZZ(r2, r0)
            java.lang.String r0 = "refresh_type"
            r3.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "livesdk_live_cover_refresh"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L3e:
            java.lang.String r0 = "homepage_folllow_refresh"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L78
            java.lang.String r3 = r7.LIZIZ
            int r0 = r3.hashCode()
            switch(r0) {
                case -1081415738: goto L6f;
                case -749022495: goto L64;
                case 36109281: goto L5d;
                case 1018444682: goto L52;
                default: goto L4f;
            }
        L4f:
            java.lang.String r1 = "auto"
            goto L20
        L52:
            java.lang.String r0 = "homepage_refresh"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4f
            java.lang.String r1 = "home_tab"
            goto L20
        L5d:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L20
            goto L4f
        L64:
            java.lang.String r0 = "pull_refresh"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4f
            java.lang.String r1 = "pull"
            goto L20
        L6f:
            java.lang.String r1 = "manual"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L20
            goto L4f
        L78:
            java.lang.String r1 = ""
            goto L20
        L7b:
            X.0rHr r0 = X.EnumC1582650rHr.REFRESH
            int r0 = r0.getType()
            if (r6 != r0) goto L86
            java.lang.String r1 = "refresh"
            goto L20
        L86:
            X.0rHr r0 = X.EnumC1582650rHr.POLLING
            int r0 = r0.getType()
            if (r6 == r0) goto L20
            X.0rHr r0 = X.EnumC1582650rHr.AUTO_REFRESH
            int r0 = r0.getType()
            if (r6 != r0) goto L99
            java.lang.String r1 = "auto_refresh"
            goto L20
        L99:
            java.lang.String r1 = java.lang.String.valueOf(r6)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596010rdP.LJFF(int, int, X.0rc4):void");
    }

    public static C1596020rdQ LIZIZ(int i, int i2, InterfaceC1596220rdk interfaceC1596220rdk, InterfaceC1596210rdj interfaceC1596210rdj, String str) {
        Object c098200Yq;
        Exception exc;
        C1597900rgS c1597900rgSLIZIZ;
        int size;
        int i3;
        int size2;
        EnumC1595320rcI enumC1595320rcI;
        ArrayList arrayList;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C0JAU.LIZLLL().LJIIIIZZ(0L);
            FollowingInterestUsersResponse followingInterestUsersResponseLJIJ = interfaceC1596220rdk.LJIJ(i2);
            List<FollowingInterestUser> followingInterestUsers = followingInterestUsersResponseLJIJ.getFollowingInterestUsers();
            if (followingInterestUsers != null) {
                size = followingInterestUsers.size();
            } else {
                size = 0;
            }
            LJ(size, jElapsedRealtime);
            String strLIZIZ = C1596560reI.LIZIZ(i);
            if (followingInterestUsersResponseLJIJ.getCode() == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            int code = followingInterestUsersResponseLJIJ.getCode();
            List<FollowingInterestUser> followingInterestUsers2 = followingInterestUsersResponseLJIJ.getFollowingInterestUsers();
            if (followingInterestUsers2 != null) {
                size2 = followingInterestUsers2.size();
            } else {
                size2 = 0;
            }
            C994000byQ.LIZIZ("skylight_live_request_time", new C117700cZ(strLIZIZ, i3, jElapsedRealtime2, i2, code, size2, null));
            List<FollowingInterestUser> followingInterestUsers3 = followingInterestUsersResponseLJIJ.getFollowingInterestUsers();
            if (followingInterestUsers3 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (FollowingInterestUser followingInterestUser : followingInterestUsers3) {
                    arrayList2.add(new Pair(followingInterestUser.getUser().roomData, followingInterestUser.getUser()));
                }
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null) {
                    iLiveOuterService.l6(SystemClock.uptimeMillis(), arrayList2);
                }
            }
            if (followingInterestUsersResponseLJIJ.getCode() != 0) {
                enumC1595320rcI = EnumC1595320rcI.FAIL;
            } else {
                enumC1595320rcI = EnumC1595320rcI.SUCCESS;
            }
            List<FollowingInterestUser> followingInterestUsers4 = followingInterestUsersResponseLJIJ.getFollowingInterestUsers();
            if (followingInterestUsers4 != null) {
                arrayList = new ArrayList(followingInterestUsers4);
            } else {
                arrayList = new ArrayList();
            }
            interfaceC1596210rdj.LJIL(null, arrayList);
            c098200Yq = new C1596020rdQ(new FollowingInterestUsersResponse(followingInterestUsersResponseLJIJ.getCode(), arrayList, followingInterestUsersResponseLJIJ.getEcLiveEventList(), followingInterestUsersResponseLJIJ.getVideoNum(), followingInterestUsersResponseLJIJ.getFirstVid(), followingInterestUsersResponseLJIJ.getLogPbBean(), null), enumC1595320rcI, null, 60);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (i != 0) {
                if (i == 2) {
                    c1597900rgSLIZIZ = C1597910rgT.LIZ();
                }
                C994000byQ.LIZIZ("skylight_live_request_time", new C117700cZ(C1596560reI.LIZIZ(i), 0, SystemClock.elapsedRealtime() - jElapsedRealtime, i2, -1, 0, thM5exceptionOrNullimpl));
                C1597470rfl.LIZ(C1596560reI.LIZIZ(i), thM5exceptionOrNullimpl, C2097608Jq.LJIIIIZZ(new Pair("checkpoint", "FeedSkylightLiveHelper#fetchLiveData"), new Pair("pull_type", String.valueOf(i2)), new Pair("repo_name", str)));
            } else {
                c1597900rgSLIZIZ = C1597910rgT.LIZIZ();
            }
            if (c1597900rgSLIZIZ != null) {
                c1597900rgSLIZIZ.LIZLLL(1, false, true);
            }
            C994000byQ.LIZIZ("skylight_live_request_time", new C117700cZ(C1596560reI.LIZIZ(i), 0, SystemClock.elapsedRealtime() - jElapsedRealtime, i2, -1, 0, thM5exceptionOrNullimpl));
            C1597470rfl.LIZ(C1596560reI.LIZIZ(i), thM5exceptionOrNullimpl, C2097608Jq.LJIIIIZZ(new Pair("checkpoint", "FeedSkylightLiveHelper#fetchLiveData"), new Pair("pull_type", String.valueOf(i2)), new Pair("repo_name", str)));
        }
        if (C596340NaC.LIZIZ().isEnabled && C596340NaC.LIZIZ().liveCacheEnable) {
            FollowingInterestUsersResponse followingInterestUsersResponse = new FollowingInterestUsersResponse(0, new ArrayList(), new ArrayList(), 0, 0L, null, null);
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl2 instanceof Exception) {
                exc = (Exception) thM5exceptionOrNullimpl2;
            } else {
                exc = null;
            }
            C1596020rdQ c1596020rdQ = new C1596020rdQ(followingInterestUsersResponse, null, exc, 54);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = c1596020rdQ;
            }
            return (C1596020rdQ) c098200Yq;
        }
        C1596020rdQ c1596020rdQ2 = new C1596020rdQ(new FollowingInterestUsersResponse(0, new ArrayList(), new ArrayList(), 0, 0L, null, null), EnumC1595320rcI.SUCCESS, null, 60);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = c1596020rdQ2;
        }
        return (C1596020rdQ) c098200Yq;
    }

    public static Map LIZJ(int i, EnumC1582650rHr enumC1582650rHr, Long l, Long l2, Integer num) {
        String str;
        String str2;
        int i2 = C1572410r1L.LIZ[enumC1582650rHr.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                str = "";
            } else {
                str = "high_value_explicit_refresh";
            }
        } else {
            str = "time_auto";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC1569120qw2 abstractC1569120qw2LIZIZ = C1569180qw8.LIZIZ(i);
        if (abstractC1569120qw2LIZIZ != null) {
            str2 = abstractC1569120qw2LIZIZ.LIZ;
        } else {
            str2 = null;
        }
        linkedHashMap.put("enter_from", str2);
        linkedHashMap.put("refresh_type", str);
        if (l != null) {
            linkedHashMap.put("anchor_id", String.valueOf(l.longValue()));
        }
        if (l2 != null) {
            linkedHashMap.put("room_id", String.valueOf(l2.longValue()));
        }
        if (num != null) {
            linkedHashMap.put("room_rank", String.valueOf(num.intValue()));
        }
        return linkedHashMap;
    }
}
