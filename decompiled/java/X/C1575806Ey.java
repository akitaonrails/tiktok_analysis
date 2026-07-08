package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.06Ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1575806Ey implements InterfaceC1564806As, C06F8 {
    public static final C1575806Ey LIZJ = new C1575806Ey();
    public static final Object LIZLLL = new Object();
    public static final C1575106Er LJ = new C1575106Er();
    public static final WeakHashMap<C06F6, Object> LJFF = new WeakHashMap<>();
    public static final C01GW LJI = C452501pT.LIZIZ(new C06F3());

    public static void LIZ(C06F6 c06f6) {
        synchronized (LJFF) {
            try {
                LJFF.put(c06f6, LIZLLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static StreakData LIZIZ(String str) {
        String curUserId;
        String strValueOf = String.valueOf(C0YNP.LJII(str));
        InterfaceC461710I8r interfaceC461710I8r = (InterfaceC461710I8r) LJI.getValue();
        if (interfaceC461710I8r != null) {
            curUserId = interfaceC461710I8r.getCurUserId();
        } else {
            curUserId = null;
        }
        if (Intrinsics.LJFF(strValueOf, curUserId)) {
            return null;
        }
        C06F5.LIZ.getClass();
        return C06F4.LIZIZ.LJII.LIZ.get(str);
    }

    public static StreakData LIZJ(String str) {
        String curUserId;
        boolean z;
        String strValueOf = String.valueOf(C0YNP.LJII(str));
        InterfaceC461710I8r interfaceC461710I8r = (InterfaceC461710I8r) LJI.getValue();
        if (interfaceC461710I8r != null) {
            curUserId = interfaceC461710I8r.getCurUserId();
        } else {
            curUserId = null;
        }
        if (Intrinsics.LJFF(strValueOf, curUserId)) {
            return null;
        }
        C06F5.LIZ.getClass();
        C1575906Ez c1575906Ez = C06F4.LIZIZ;
        c1575906Ez.LJFF.getClass();
        StreakData streakDataLJFF = StreakServerDataSource.LJFF(str);
        if (streakDataLJFF == null) {
            boolean z2 = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getServerDataOrFakeDataFromDatabase, serverData is null, convId=");
            sbLIZ.append(str);
            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            streakDataLJFF = null;
        }
        c1575906Ez.LJ.getClass();
        StreakData streakDataLJFF2 = C06FA.LJFF(str, false);
        if (streakDataLJFF2 == null) {
            boolean z3 = C1590906Kt.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getServerDataOrFakeDataFromDatabase, fakeData is null, return serverData, convId=");
            sbLIZ2.append(str);
            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            if (streakDataLJFF != null && streakDataLJFF2.createTime < streakDataLJFF.createTime) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                boolean z4 = C1590906Kt.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getServerDataOrFakeDataFromDatabase, choose fakeData, convId=");
                sbLIZ3.append(str);
                C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                if (((Boolean) C06F0.LIZ.getValue()).booleanValue()) {
                    C23250099c.LIZLLL(C06F0.LIZIZ, null, null, new AnonymousClass0666(true, streakDataLJFF, streakDataLJFF2, null), 3);
                }
                streakDataLJFF = streakDataLJFF2;
                c1575906Ez.LJII.LIZ.put(str, streakDataLJFF);
                return streakDataLJFF;
            }
            boolean z5 = C1590906Kt.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("getServerDataOrFakeDataFromDatabase, choose serverData, convId=");
            sbLIZ4.append(str);
            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            if (((Boolean) C06F0.LIZ.getValue()).booleanValue()) {
                C23250099c.LIZLLL(C06F0.LIZIZ, null, null, new AnonymousClass0666(false, streakDataLJFF, streakDataLJFF2, null), 3);
            }
        }
        if (streakDataLJFF == null) {
            if (C1567806Bw.LIZJ(str) == C06G4.USER) {
                streakDataLJFF = c1575906Ez.LIZJ;
            } else {
                streakDataLJFF = c1575906Ez.LIZLLL;
            }
        }
        c1575906Ez.LJII.LIZ.put(str, streakDataLJFF);
        return streakDataLJFF;
    }

    public static StreakData LJII(String str) {
        StreakData streakDataLIZIZ = LIZIZ(str);
        if (C1567806Bw.LIZJ(str) == C06G4.USER) {
            final String strValueOf = String.valueOf(C0YNP.LJII(str));
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            if (c1bgsLJ.LJ(strValueOf, null) == null) {
                c1bgsLJ.LJI(new InterfaceC1480505qt() { // from class: X.066T
                    @Override // X.InterfaceC1480505qt
                    public final void LIZ(Throwable th) {
                    }

                    @Override // X.InterfaceC1480505qt
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1480505qt
                    public final void LIZIZ(IMUser iMUser) {
                        String strLJ = C0YNP.LJ(strValueOf);
                        C1575806Ey.LIZJ.getClass();
                        StreakData streakDataLIZIZ2 = C1575806Ey.LIZIZ(strLJ);
                        if (streakDataLIZIZ2 != null) {
                            C1575806Ey.LJIIIZ(streakDataLIZIZ2, strLJ);
                        }
                    }
                }, strValueOf, null, "im_nudge_streak", true);
            }
        }
        if (streakDataLIZIZ == null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C066R(str, null), 3);
            return null;
        }
        return streakDataLIZIZ;
    }

    public static StreakData LJIIIIZZ(String str) {
        StreakData streakDataLIZIZ = LIZIZ(str);
        if (streakDataLIZIZ != null) {
            return streakDataLIZIZ;
        }
        return LIZJ(str);
    }

    @Override // X.C06F8
    public final void LJI(List<StreakData> list) {
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakDataManager: onGetStreakDataList, size=");
        sbLIZ.append(list.size());
        C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        for (StreakData streakData : list) {
            String str = streakData.convId;
            if (str != null && str.length() != 0) {
                LIZJ.getClass();
                LJIIIZ(streakData, str);
            } else {
                C1590906Kt.LIZJ("Streak: convId is null");
            }
        }
    }

    @C14EU(threadMode = ThreadMode.ASYNC)
    public final void onUserUpdate(C1434905jX c1434905jX) {
        String strLJ;
        StreakData streakDataLIZIZ;
        String uid = c1434905jX.LIZJ.getUid();
        if (uid != null && (streakDataLIZIZ = LIZIZ((strLJ = C0YNP.LJ(uid)))) != null) {
            LJIIIZ(streakDataLIZIZ, strLJ);
        }
    }

    public static void LJIIIZ(StreakData streakData, String str) {
        List listLLIIII;
        WeakHashMap<C06F6, Object> weakHashMap = LJFF;
        synchronized (weakHashMap) {
            try {
                try {
                    listLLIIII = C13LP.LLIIII(weakHashMap.keySet());
                } catch (NoSuchElementException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    listLLIIII = C13BV.INSTANCE;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((C06F6) it2.next()).r80(streakData, str);
        }
    }

    @Override // X.C06F8
    public final void LJ(StreakData streakData, String str) {
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakDataManager: onStreakDataUpdate, newStreakData=");
        sbLIZ.append(streakData);
        sbLIZ.append(", convId=");
        sbLIZ.append(str);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ(streakData, str);
    }

    @Override // X.C06F8
    public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
        C1566606Bk.LIZ.LIZLLL(str, streakData, streakData2);
    }

    @Override // X.C06F8
    public final void LJFF(String str, C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str2, StreakData streakData, StreakData streakData2, Map<String, String> map) {
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakDataManager: onReceiveCmdMessage, type=");
        sbLIZ.append(c06bd);
        sbLIZ.append(", newStreakData=");
        sbLIZ.append(streakData2);
        sbLIZ.append(", oldStreakData=");
        sbLIZ.append(streakData);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(C1566206Bg.LIZIZ(streakData2));
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1566606Bk.LIZ.LJ(c06bd, enumC1567006Bo, str2, streakData, streakData2, map);
    }
}
