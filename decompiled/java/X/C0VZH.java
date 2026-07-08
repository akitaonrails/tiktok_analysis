package X;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VZH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZH {
    public static String LIZ = "";
    public static final ConcurrentHashMap<String, List<C0VZI>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentLinkedQueue<C0VZI> LIZJ = new ConcurrentLinkedQueue<>();

    public static List LIZ() {
        ConcurrentLinkedQueue<C0VZI> concurrentLinkedQueue = LIZJ;
        if (concurrentLinkedQueue.size() < 2) {
            return null;
        }
        try {
            return C13LP.LJJJJJ(1, C13LP.LLD(4, new ArrayList(concurrentLinkedQueue)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C0VZK.LIZ(thM5exceptionOrNullimpl, "conversion_recorder_getConversationHistory_error", C2097608Jq.LJIIJ(new Pair("message", "conversion_recorder_getConversationHistory_error")));
            }
            return null;
        }
    }

    public static void LIZIZ(String str) {
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            ConcurrentLinkedQueue<C0VZI> concurrentLinkedQueue = LIZJ;
            if (!concurrentLinkedQueue.isEmpty()) {
                try {
                    if (Intrinsics.LJFF(str, LIZ) && !Intrinsics.LJFF(((C0VZI) C13LP.LJJLIIIJILLIZJL(concurrentLinkedQueue)).LIZIZ, LIZ)) {
                        concurrentLinkedQueue.clear();
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C0VZK.LIZ(thM5exceptionOrNullimpl, "conversion_recorder_onActivityResumed_error", C2097608Jq.LJIIJ(new Pair("message", "conversion_recorder_onActivityResumed_error"), new Pair("activityName", str)));
                }
            }
        }
    }

    public static void LIZJ(Intent intent, Throwable th, C800390VaX c800390VaX) {
        ComponentName component;
        String strLJJIJIIJIL;
        String str;
        C0VZI c0vzi;
        C0VZI next;
        List<String> list;
        List<String> list2;
        int i = 0;
        if ((c800390VaX == null || c800390VaX.LIZ) && intent != null && (component = intent.getComponent()) != null && (strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEgAjS8/YVFkiQFyUc8nCTCgu6tyLzFKCahF3VTIPribWtK8mSiQy8TzOx0p1qgC4RIQrQQwjtBIA//HHlfTB83A=", null))) != null) {
            Uri data = intent.getData();
            String strLIZ = C0VZT.LIZ();
            String strLIZLLL = C0VZT.LIZLLL();
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            C0VYW.LIZ.getClass();
            ConcurrentHashMap<String, List<String>> concurrentHashMap = C0VYW.LIZIZ;
            if (!concurrentHashMap.containsKey(strLIZLLL) || (list = concurrentHashMap.get(strLIZLLL)) == null || list.size() != 1 || (list2 = concurrentHashMap.get(strLIZLLL)) == null || (str = (String) C13LP.LJJLIIIJL(list2)) == null) {
                str = "";
            }
            ConcurrentHashMap<String, List<C0VZI>> concurrentHashMap2 = LIZIZ;
            if (concurrentHashMap2.containsKey(strLJJIJIIJIL)) {
                List<C0VZI> arrayList = concurrentHashMap2.get(strLJJIJIIJIL);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                synchronized (arrayList) {
                    try {
                        Iterator<C0VZI> it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                C0VZI c0vzi2 = next;
                                if (Intrinsics.LJFF(c0vzi2.LIZ, strLIZLLL) && Intrinsics.LJFF(c0vzi2.LIZLLL, strLIZ) && Intrinsics.LJFF(c0vzi2.LIZIZ, strLJJIJIIJIL)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        c0vzi = next;
                        if (c0vzi == null) {
                            c0vzi = new C0VZI(strLIZLLL, strLJJIJIIJIL, str, strLIZ, C295401Cm.LIZ(data), th);
                            arrayList.add(c0vzi);
                        } else {
                            c0vzi.LJFF = th;
                            c0vzi.LIZJ = str;
                            c0vzi.LJ = C295401Cm.LIZ(data);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                c0vzi = new C0VZI(strLIZLLL, strLJJIJIIJIL, str, strLIZ, C295401Cm.LIZ(data), th);
                arrayList2.add(c0vzi);
                concurrentHashMap2.put(strLJJIJIIJIL, arrayList2);
            }
            if (Intrinsics.LJFF(c0vzi.LIZ, LIZ)) {
                Iterator<C0VZI> it3 = LIZJ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C0VZI next2 = it3.next();
                    if (i >= 0) {
                        if (Intrinsics.LJFF(next2.LIZ, c0vzi.LIZ)) {
                            if (i > 0) {
                                LIZJ.clear();
                            }
                        } else {
                            i++;
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            ConcurrentLinkedQueue<C0VZI> concurrentLinkedQueue = LIZJ;
            concurrentLinkedQueue.add(c0vzi);
            if (concurrentLinkedQueue.size() > 6) {
                concurrentLinkedQueue.poll();
            }
        }
    }
}
