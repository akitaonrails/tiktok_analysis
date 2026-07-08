package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeCommerceRenewSetting;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0U3P, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U3P {
    public static final ConcurrentHashSet<C0U3Q> LIZ = new ConcurrentHashSet<>();
    public static final ConcurrentHashMap<C0U3Q, CopyOnWriteArrayList<Function1<Boolean, Unit>>> LIZIZ = new ConcurrentHashMap<>();
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static boolean LIZ(C0U3Q c0u3q) {
        C0U3Q c0u3q2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0u3q);
        sbLIZ.append(", current: ");
        ConcurrentHashSet<C0U3Q> concurrentHashSet = LIZ;
        sbLIZ.append(C13LP.LJJLIIIJ(concurrentHashSet, null, null, null, 0, null, AFwS245S0000000_12.get$arr$(103), 31));
        C20441214yg.LIZIZ("BM#check", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("K: ");
        C0U3Q c0u3q3 = C0U3Q.KARAOKE;
        sbLIZ2.append(c0u3q3.getFlag());
        sbLIZ2.append(", C: ");
        C0U3Q c0u3q4 = C0U3Q.COMMERCE_GOODS;
        sbLIZ2.append(c0u3q4.getFlag());
        C20441214yg.LIZIZ("BM#check", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("And: ");
        sbLIZ3.append(c0u3q3.getFlag() & c0u3q4.getFlag());
        C20441214yg.LIZIZ("BM#check", C2188811AlT.LIZIZ(sbLIZ3));
        ArrayList arrayList = new ArrayList();
        for (C0U3Q c0u3q5 : concurrentHashSet) {
            if (c0u3q5 != c0u3q) {
                arrayList.add(c0u3q5);
            }
        }
        if (!arrayList.isEmpty()) {
            if (LiveKaraokeCommerceRenewSetting.INSTANCE.getValue()) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if ((((C0U3Q) it2.next()).getFlag() & c0u3q.getFlag()) > 0) {
                            break;
                        }
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(((C0U3Q) it3.next()).getFlag()));
                }
                int flag = c0u3q.getFlag();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    flag &= ((Number) it4.next()).intValue();
                }
                if (flag != 0) {
                    return true;
                }
            }
            c0u3q2 = C0U3Q.KARAOKE;
            if (c0u3q == c0u3q2) {
            }
            return !LiveKaraokeCommerceRenewSetting.INSTANCE.getValue() ? false : false;
        }
        c0u3q2 = C0U3Q.KARAOKE;
        if (c0u3q == c0u3q2 || !LIZLLL) {
            if (!LiveKaraokeCommerceRenewSetting.INSTANCE.getValue() && c0u3q == c0u3q2 && LIZJ) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(C0U3Q c0u3q) {
        return LIZ.contains(c0u3q);
    }

    public static void LIZLLL(C0U3Q c0u3q) {
        if (c0u3q == C0U3Q.COMMERCE_GOODS) {
            LIZJ = true;
        }
        if (c0u3q == C0U3Q.LOCAL_SERVICE_GOODS) {
            LIZLLL = true;
        }
        LIZ.add(c0u3q);
        for (Map.Entry<C0U3Q, CopyOnWriteArrayList<Function1<Boolean, Unit>>> entry : LIZIZ.entrySet()) {
            Iterator<T> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(Boolean.valueOf(LIZ(entry.getKey())));
            }
        }
    }

    public static void LJ(C0U3Q c0u3q) {
        ConcurrentHashSet<C0U3Q> concurrentHashSet = LIZ;
        if (concurrentHashSet.contains(c0u3q)) {
            concurrentHashSet.remove(c0u3q);
            for (Map.Entry<C0U3Q, CopyOnWriteArrayList<Function1<Boolean, Unit>>> entry : LIZIZ.entrySet()) {
                Iterator<T> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    ((Function1) it2.next()).invoke(Boolean.valueOf(LIZ(entry.getKey())));
                }
            }
            if (c0u3q == C0U3Q.LOCAL_SERVICE_GOODS) {
                LIZLLL = false;
            }
        }
    }

    public static void LIZJ(C0U3Q c0u3q, Function1 function1) {
        ConcurrentHashMap<C0U3Q, CopyOnWriteArrayList<Function1<Boolean, Unit>>> concurrentHashMap = LIZIZ;
        CopyOnWriteArrayList<Function1<Boolean, Unit>> copyOnWriteArrayList = concurrentHashMap.get(c0u3q);
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            CopyOnWriteArrayList<Function1<Boolean, Unit>> copyOnWriteArrayList2 = concurrentHashMap.get(c0u3q);
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.add(function1);
            }
        } else {
            CopyOnWriteArrayList<Function1<Boolean, Unit>> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList3.add(function1);
            concurrentHashMap.put(c0u3q, copyOnWriteArrayList3);
        }
        function1.invoke(Boolean.valueOf(LIZ(c0u3q)));
    }
}
