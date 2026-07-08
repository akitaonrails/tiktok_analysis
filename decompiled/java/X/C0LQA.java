package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LQA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQA {
    public static final ConcurrentHashMap<EnumC543480LTe, CopyOnWriteArraySet<String>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<EnumC543480LTe, CopyOnWriteArraySet<String>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Pair<String, EnumC543480LTe>, CopyOnWriteArraySet<String>> LIZJ = new ConcurrentHashMap<>();

    static {
        CopyOnWriteArraySet<String> copyOnWriteArraySetPutIfAbsent;
        Iterator<C0LQ8> it2 = C0LQ8.getEntries().iterator();
        while (it2.hasNext()) {
            LIZ(EnumC543480LTe.SAVE, it2.next());
        }
        Iterator<C0LQ3> it3 = C0LQ3.getEntries().iterator();
        while (it3.hasNext()) {
            LIZ(EnumC543480LTe.RESTORE, it3.next());
        }
        EnumC543480LTe enumC543480LTe = EnumC543480LTe.RESTORE;
        String[] strArr = {"landing_"};
        ConcurrentHashMap<EnumC543480LTe, CopyOnWriteArraySet<String>> concurrentHashMap = LIZIZ;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = concurrentHashMap.get(enumC543480LTe);
        if (copyOnWriteArraySet == null && (copyOnWriteArraySetPutIfAbsent = concurrentHashMap.putIfAbsent(enumC543480LTe, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
            copyOnWriteArraySet = copyOnWriteArraySetPutIfAbsent;
        }
        copyOnWriteArraySet.addAll(C13LQ.LJJLL(strArr));
    }

    public static void LIZ(EnumC543480LTe enumC543480LTe, C0LQB c0lqb) {
        CopyOnWriteArraySet<String> copyOnWriteArraySetPutIfAbsent;
        CopyOnWriteArraySet<String> copyOnWriteArraySetPutIfAbsent2;
        int i = C0LQ7.LIZ[c0lqb.getScope().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ConcurrentHashMap<Pair<String, EnumC543480LTe>, CopyOnWriteArraySet<String>> concurrentHashMap = LIZJ;
                    Pair<String, EnumC543480LTe> pair = new Pair<>("common", enumC543480LTe);
                    CopyOnWriteArraySet<String> copyOnWriteArraySet = concurrentHashMap.get(pair);
                    if (copyOnWriteArraySet == null && (copyOnWriteArraySetPutIfAbsent2 = concurrentHashMap.putIfAbsent(pair, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
                        copyOnWriteArraySet = copyOnWriteArraySetPutIfAbsent2;
                    }
                    copyOnWriteArraySet.add(c0lqb.getBranchName());
                    return;
                }
                throw new C1954807lC();
            }
            ConcurrentHashMap<EnumC543480LTe, CopyOnWriteArraySet<String>> concurrentHashMap2 = LIZ;
            CopyOnWriteArraySet<String> copyOnWriteArraySet2 = concurrentHashMap2.get(enumC543480LTe);
            if (copyOnWriteArraySet2 == null && (copyOnWriteArraySetPutIfAbsent = concurrentHashMap2.putIfAbsent(enumC543480LTe, (copyOnWriteArraySet2 = new CopyOnWriteArraySet<>()))) != null) {
                copyOnWriteArraySet2 = copyOnWriteArraySetPutIfAbsent;
            }
            copyOnWriteArraySet2.add(c0lqb.getBranchName());
        }
    }
}
