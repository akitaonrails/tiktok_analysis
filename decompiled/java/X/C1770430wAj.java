package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ab.ShowWindow;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideFrequency;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770430wAj implements InterfaceC586170Myt {
    public static final C1770430wAj LL;
    public static C1770500wAq LLILLJJLI;
    public static EcSearchFeedVideoGuideFrequency LLILLL;

    static {
        C1770430wAj c1770430wAj = new C1770430wAj();
        LL = c1770430wAj;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIILL(c1770430wAj);
        }
        LIZIZ();
    }

    public static final void LIZIZ() {
        Object c098200Yq;
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        C1770500wAq c1770500wAq = new C1770500wAq(accountUserServiceLJIIJ.isLogin() ? accountUserServiceLJIIJ.getCurUserId() : "FAKE_USER");
        LLILLJJLI = c1770500wAq;
        try {
            String string = c1770500wAq.LIZIZ.getString(c1770500wAq.LIZ, null);
            if (string != null) {
                C1227904rF.LIZ.getClass();
                c098200Yq = (EcSearchFeedVideoGuideFrequency) C1227904rF.LIZIZ(string, EcSearchFeedVideoGuideFrequency.class);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        LLILLL = (EcSearchFeedVideoGuideFrequency) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public static void LIZLLL() {
        EcSearchFeedVideoGuideFrequency ecSearchFeedVideoGuideFrequency = LLILLL;
        if (ecSearchFeedVideoGuideFrequency == null) {
            ecSearchFeedVideoGuideFrequency = new EcSearchFeedVideoGuideFrequency(null, 0, null, 0, 0L, 31, null);
        }
        LIZJ(ecSearchFeedVideoGuideFrequency.copy(ecSearchFeedVideoGuideFrequency.timestamp, ecSearchFeedVideoGuideFrequency.times, ecSearchFeedVideoGuideFrequency.showRecords, 0, 0L));
    }

    public static void LJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        EcSearchFeedVideoGuideFrequency ecSearchFeedVideoGuideFrequency = LLILLL;
        if (ecSearchFeedVideoGuideFrequency == null) {
            ecSearchFeedVideoGuideFrequency = new EcSearchFeedVideoGuideFrequency(null, 0, null, 0, 0L, 31, null);
        }
        List<ShowWindow> list = C682620Qq4.LIZ().showWindow;
        ArrayList arrayList = new ArrayList();
        for (ShowWindow showWindow : list) {
            ShowWindow showWindow2 = showWindow;
            if (showWindow2.duration > 0 && showWindow2.count > 0) {
                arrayList.add(showWindow);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Integer numValueOf = Integer.valueOf(((ShowWindow) it2.next()).duration);
            while (it2.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((ShowWindow) it2.next()).duration);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            if (numValueOf != null) {
                long millis = jCurrentTimeMillis - TimeUnit.MINUTES.toMillis(numValueOf.intValue());
                List<Long> list2 = ecSearchFeedVideoGuideFrequency.showRecords;
                ArrayList arrayList2 = new ArrayList();
                for (Long l : list2) {
                    if (l.longValue() >= millis) {
                        arrayList2.add(l);
                    }
                }
                LIZJ(ecSearchFeedVideoGuideFrequency.copy(ecSearchFeedVideoGuideFrequency.timestamp, ecSearchFeedVideoGuideFrequency.times, C13LP.LJLILLLLZI(Long.valueOf(jCurrentTimeMillis), arrayList2), ecSearchFeedVideoGuideFrequency.nonClickCount, ecSearchFeedVideoGuideFrequency.lastNonClickTimeStamp));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public static boolean LIZ(Function1 function1) {
        List<Long> list;
        EcSearchFeedVideoGuideFrequency ecSearchFeedVideoGuideFrequency;
        ?? arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        EcSearchFeedVideoGuideFrequency ecSearchFeedVideoGuideFrequency2 = LLILLL;
        if (ecSearchFeedVideoGuideFrequency2 != null) {
            list = ecSearchFeedVideoGuideFrequency2.showRecords;
        } else {
            list = null;
        }
        List<ShowWindow> list2 = C682620Qq4.LIZ().showWindow;
        ArrayList<ShowWindow> arrayList2 = new ArrayList();
        for (ShowWindow showWindow : list2) {
            if (((Boolean) function1.invoke(showWindow)).booleanValue()) {
                arrayList2.add(showWindow);
            }
        }
        for (ShowWindow showWindow2 : arrayList2) {
            long millis = jCurrentTimeMillis - TimeUnit.MINUTES.toMillis(showWindow2.duration);
            if (list != null) {
                arrayList = new ArrayList();
                for (Long l : list) {
                    if (l.longValue() >= millis) {
                        arrayList.add(l);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if (arrayList.size() >= showWindow2.count) {
                return true;
            }
        }
        int i = C682620Qq4.LIZ().continousNonClickCount;
        int i2 = C682620Qq4.LIZ().continousNonClickCooldownMinutes;
        long millis2 = TimeUnit.MINUTES.toMillis(i2);
        if (i > 0 && i2 > 0 && millis2 > 0 && (ecSearchFeedVideoGuideFrequency = LLILLL) != null) {
            int i3 = ecSearchFeedVideoGuideFrequency.nonClickCount;
            long j = ecSearchFeedVideoGuideFrequency.lastNonClickTimeStamp;
            if (i3 >= i && j > 0 && jCurrentTimeMillis - j <= millis2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZJ(EcSearchFeedVideoGuideFrequency ecSearchFeedVideoGuideFrequency) {
        Object c098200Yq;
        LLILLL = ecSearchFeedVideoGuideFrequency;
        C1770500wAq c1770500wAq = LLILLJJLI;
        if (c1770500wAq != null) {
            try {
                C1227904rF.LIZ.getClass();
                String strLJI = C1227904rF.LJI(ecSearchFeedVideoGuideFrequency);
                if (strLJI != null) {
                    c1770500wAq.LIZIZ.storeString(c1770500wAq.LIZ, strLJI);
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static void LJFF(EcSearchFeedVideoGuideFrequency ecSearchFeedVideoGuideFrequency) {
        EcSearchFeedVideoGuideFrequency ecSearchFeedVideoGuideFrequency2 = LLILLL;
        if (ecSearchFeedVideoGuideFrequency2 == null) {
            ecSearchFeedVideoGuideFrequency2 = new EcSearchFeedVideoGuideFrequency(null, 0, null, 0, 0L, 31, null);
        }
        LIZJ(ecSearchFeedVideoGuideFrequency2.copy(ecSearchFeedVideoGuideFrequency.timestamp, ecSearchFeedVideoGuideFrequency.times, ecSearchFeedVideoGuideFrequency2.showRecords, ecSearchFeedVideoGuideFrequency2.nonClickCount, ecSearchFeedVideoGuideFrequency2.lastNonClickTimeStamp));
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        LIZIZ();
    }
}
