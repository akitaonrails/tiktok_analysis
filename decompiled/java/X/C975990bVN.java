package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS30S0000100_15;

/* JADX INFO: renamed from: X.0bVN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975990bVN implements InterfaceC976900bWq {
    public final C975960bVK LIZ;

    public final void LIZIZ() {
        this.LIZ.LJLI(null);
        C975960bVK c975960bVK = this.LIZ;
        c975960bVK.LJJJJIZL = 0L;
        c975960bVK.LJIJI = new C976920bWs();
        C975960bVK c975960bVK2 = this.LIZ;
        c975960bVK2.LJJJJJ = null;
        c975960bVK2.LJIILL = null;
        C974450bSt c974450bSt = C973890bRz.LIZ;
        C973890bRz.LJII = 0L;
        C973890bRz.LIZ.LJJLJ(null);
    }

    public final void LIZJ() {
        C20441214yg.LIZIZ("MatchModelUpdater", "clearTeams: ");
        List<C976480bWA> value = this.LIZ.LJJJLIIL.getValue();
        if (value != null) {
            value.clear();
        }
    }

    public final void LJ() {
        MutableLiveData<List<C976480bWA>> mutableLiveData = this.LIZ.LJJJLIIL;
        mutableLiveData.setValue(mutableLiveData.getValue());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyMatchTeamsChanged, matchModel.matchTeams.value = ");
        List<C976480bWA> value = this.LIZ.LJJJLIIL.getValue();
        sbLIZ.append(value != null ? Integer.valueOf(value.size()) : null);
        C20441214yg.LIZIZ("MatchModelUpdater", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C975990bVN(C975960bVK c975960bVK) {
        this.LIZ = c975960bVK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0169  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    @Override // X.InterfaceC976900bWq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.List<tikcast.linkmic.common.SpotInfo> r14) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975990bVN.LIZ(java.util.List):void");
    }

    public final long LIZLLL(Long l) {
        List<C976480bWA> value;
        Object next;
        if (l == null || l.longValue() == 0 || (value = this.LIZ.LJJJLIIL.getValue()) == null) {
            return 0L;
        }
        C197024126s c197024126s = new C197024126s(C09RB.LJIILIIL(new C1939607ik(value), AFwS250S0000000_15.get$arr$(153)));
        while (true) {
            if (c197024126s.hasNext()) {
                next = c197024126s.next();
                if (((C976800bWg) next).LIZ == l.longValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C976800bWg c976800bWg = (C976800bWg) next;
        if (c976800bWg == null) {
            return 0L;
        }
        return c976800bWg.LIZIZ;
    }

    public final C976480bWA LJII(long j) {
        List<C976480bWA> value = this.LIZ.LJJJLIIL.getValue();
        C976480bWA c976480bWA = null;
        if (value == null) {
            return null;
        }
        Iterator<C976480bWA> it2 = value.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C976480bWA next = it2.next();
            if (next.LIZ == j) {
                c976480bWA = next;
                break;
            }
        }
        return c976480bWA;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.util.Map<java.lang.Long, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult> r18) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975990bVN.LJIIIIZZ(java.util.Map):void");
    }

    public final void LJIIJJI(List<C954460awe> list) {
        C954460awe c954460awe;
        Object objRemove;
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(list.isEmpty())) && ((c954460awe = (C954460awe) C13LP.LJJJLL(list)) == null || c954460awe.LJ != this.LIZ.LJJJJLL)) {
            ArrayList arrayList = new ArrayList(list);
            Iterator<C954460awe> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().LJ == this.LIZ.LJJJJLL) {
                    if (i != -1 && (objRemove = ListProtector.remove(arrayList, i)) != null) {
                        ListProtector.add(arrayList, 0, objRemove);
                    }
                } else {
                    i++;
                }
            }
            list = arrayList;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sorted user list size = ");
        sbLIZ.append(list.size());
        C20441214yg.LIZIZ("modelUpdater", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("linkedHostList size = ");
        sbLIZ2.append(this.LIZ.LJJJLL.size());
        C20441214yg.LIZIZ("modelUpdater", C2188811AlT.LIZIZ(sbLIZ2));
        try {
            List<C954460awe> list2 = this.LIZ.LJJJLL;
            ArrayList<C954460awe> arrayList2 = new ArrayList();
            for (C954460awe c954460awe2 : list2) {
                C954460awe c954460awe3 = c954460awe2;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C954460awe> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Long.valueOf(it3.next().LJ));
                }
                if (!arrayList3.contains(Long.valueOf(c954460awe3.LJ))) {
                    arrayList2.add(c954460awe2);
                }
            }
            for (C954460awe c954460awe4 : arrayList2) {
                long jLIZLLL = LIZLLL(Long.valueOf(c954460awe4.LJ));
                long j = c954460awe4.LJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("belong teamID ");
                sbLIZ3.append(jLIZLLL);
                C20441214yg.LIZIZ("modelUpdater", C2188811AlT.LIZIZ(sbLIZ3));
                C975960bVK c975960bVK = this.LIZ;
                if (c975960bVK.LIZLLL == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
                    List<C976480bWA> value = c975960bVK.LJJJLIIL.getValue();
                    if (value != null) {
                        C19719612Di.LJJIIJ(value, new AwS30S0000100_15(jLIZLLL, 12), true);
                    }
                } else {
                    List<C976480bWA> value2 = c975960bVK.LJJJLIIL.getValue();
                    if (value2 != null) {
                        for (C976480bWA c976480bWA : value2) {
                            List<C976800bWg> list3 = c976480bWA.LJFF;
                            if (list3 != null) {
                                C19719612Di.LJJIIJ(list3, new AwS30S0000100_15(j, 13), true);
                            }
                            List<C976800bWg> list4 = c976480bWA.LJFF;
                            if (list4 == null || ((ArrayList) list4).isEmpty()) {
                                C20441214yg.LJ("MatchModelUpdate", "Error, some Team no Users now");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("modelUpdater", e);
        }
        this.LIZ.LJJJLL = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(long r16, java.util.List<java.lang.Long> r18) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975990bVN.LJFF(long, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x035c A[PHI: r6
      0x035c: PHI (r6v18 com.bytedance.android.livesdk.model.message.battle.BattleSetting) = 
      (r6v4 com.bytedance.android.livesdk.model.message.battle.BattleSetting)
      (r6v19 com.bytedance.android.livesdk.model.message.battle.BattleSetting)
     binds: [B:140:0x035a, B:137:0x0354] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x041f A[PHI: r1
      0x041f: PHI (r1v12 com.bytedance.android.livesdkapi.depend.model.live.match.MatchThemeDisplayResource) = 
      (r1v7 com.bytedance.android.livesdkapi.depend.model.live.match.MatchThemeDisplayResource)
      (r1v13 com.bytedance.android.livesdkapi.depend.model.live.match.MatchThemeDisplayResource)
     binds: [B:185:0x041d, B:182:0x0417] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0194 A[LOOP:1: B:56:0x018e->B:58:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bc  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.List<? extends com.bytedance.android.livesdk.model.message.TeamUsersInfo>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<com.bytedance.android.livesdk.model.message.TeamUsersInfo>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(final com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r20, final com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r21, final long r22) {
        /*
            Method dump skipped, instruction units count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975990bVN.LJI(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage, com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse, long):void");
    }

    public final void LJIIJ(long j, long j2, long j3, long j4, long j5) {
        C976480bWA c976480bWALJII = LJII(j2);
        if (c976480bWALJII == null || j <= c976480bWALJII.LIZIZ) {
            return;
        }
        c976480bWALJII.LIZIZ = j;
        c976480bWALJII.LIZLLL = j3;
        c976480bWALJII.LIZJ = j4;
        c976480bWALJII.LJ = j5;
    }

    public final void LJIIIZ(long j, long j2, long j3, long j4, long j5, long j6) {
        C976480bWA c976480bWALJII = LJII(j3);
        if (c976480bWALJII == null) {
            return;
        }
        List<C976800bWg> list = c976480bWALJII.LJFF;
        Object obj = null;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((C976800bWg) next).LIZ == j4) {
                    obj = next;
                    break;
                }
            }
            C976800bWg c976800bWg = (C976800bWg) obj;
            if (c976800bWg != null) {
                long j7 = c976800bWg.LJ;
                if (j < j7) {
                    return;
                }
                if (j7 == j && c976800bWg.LJFF == j2) {
                    int i = (c976480bWALJII.LIZJ > j5 ? 1 : (c976480bWALJII.LIZJ == j5 ? 0 : -1));
                }
                c976800bWg.LJ = j;
                c976800bWg.LJFF = j2;
                c976800bWg.LJI = j6;
                c976800bWg.LJII = j5;
                c976480bWALJII.LIZLLL = j2;
                c976480bWALJII.LJ = j6;
            }
        }
    }
}
