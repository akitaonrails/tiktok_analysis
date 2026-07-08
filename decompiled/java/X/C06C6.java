package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06C6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06C6 {
    public static final C06C6 LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public static final C06C7<StreakPetData> LJ;
    public static final C06C7<C1569306Cl> LJFF;
    public static final List<C06C8> LJI;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06C6.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C06C6 c06c6 = new C06C6();
        LIZIZ = c06c6;
        C1598406Nq c1598406Nq = c06c6.LIZ;
        if (c1598406Nq == null) {
            synchronized (c06c6) {
                c1598406Nq = c06c6.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c06c6.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LJ = new C06C7<>();
        LJFF = new C06C7<>();
        LJI = new ArrayList();
    }

    public static StreakPetData LIZ(String str) {
        StreakPetData streakPetDataLIZJ;
        C06C7<StreakPetData> c06c7 = LJ;
        synchronized (c06c7) {
            streakPetDataLIZJ = c06c7.LIZIZ.LIZJ(str);
        }
        StreakPetData streakPetData = streakPetDataLIZJ;
        if (streakPetData != null) {
            return streakPetData;
        }
        C23250099c.LIZLLL(LIZLLL, null, null, new C066O(str, null), 3);
        return null;
    }

    public static StreakPetData LIZIZ(String str) {
        StreakPetData streakPetDataLIZJ;
        C06C7<StreakPetData> c06c7 = LJ;
        synchronized (c06c7) {
            streakPetDataLIZJ = c06c7.LIZIZ.LIZJ(str);
        }
        StreakPetData streakPetData = streakPetDataLIZJ;
        if (streakPetData != null) {
            return streakPetData;
        }
        C1569106Cj.LJ.getClass();
        C1569106Cj.LJI.getClass();
        StreakPetData streakPetDataLIZLLL = C1569106Cj.LIZLLL(str);
        if (streakPetDataLIZLLL != null) {
            c06c7.LIZIZ(str, streakPetDataLIZLLL);
            return streakPetDataLIZLLL;
        }
        return null;
    }

    public static void LIZLLL(C06C8 c06c8) {
        List<C06C8> list = LJI;
        synchronized (list) {
            try {
                if (!((ArrayList) list).isEmpty()) {
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        if (((C06C8) it2.next()) == c06c8) {
                            break;
                        }
                    }
                    ((ArrayList) LJI).add(c06c8);
                } else {
                    ((ArrayList) LJI).add(c06c8);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJ(C06C8 c06c8) {
        List<C06C8> list = LJI;
        synchronized (list) {
            try {
                ((ArrayList) list).remove(c06c8);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJFF(String str, StreakPetData streakPetData, StreakPetData streakPetData2) {
        if (Intrinsics.LJFF(streakPetData2, LJ.LIZIZ(str, streakPetData2))) {
            return;
        }
        List<C06C8> list = LJI;
        synchronized (list) {
            try {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((C06C8) it2.next()).SI2(str, streakPetData, streakPetData2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LIZJ(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
        C1572806Du.LL.Hf(streakPetData, streakPetData2, j, z, c06cf, str);
    }
}
