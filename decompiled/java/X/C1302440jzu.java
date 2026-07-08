package X;

import android.os.ParcelUuid;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.0jzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302440jzu {
    public static final C1302440jzu LIZ = new C1302440jzu();
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static final ParcelUuid LIZJ = ParcelUuid.fromString("e93d936b-3082-450e-9891-1d300c2198e6");
    public static final ParcelUuid LIZLLL = ParcelUuid.fromString("a1b8c6d4-e5f7-48a9-b0c1-d2e3f4a5b6c7");
    public static final ParcelUuid LJ = ParcelUuid.fromString("7c35e196-6e23-461a-8a27-7e45d6a299cf");
    public static final ParcelUuid LJFF = ParcelUuid.fromString("6b48e033-988f-406a-a3c9-1ab0880e485d");
    public static final HashMap<String, Pair<ParcelUuid, Set<Integer>>> LJI = new HashMap<>();
    public static final HashMap<Integer, Set<String>> LJII = new HashMap<>();

    public static int LIZLLL() {
        int andIncrement = LIZIZ.getAndIncrement();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startSession: sessionId=[");
        sbLIZ.append(andIncrement);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        return andIncrement;
    }

    public static void LIZ(int i) {
        List listLLIIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endSession: sessionId=[");
        sbLIZ.append(i);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        HashMap<Integer, Set<String>> map = LJII;
        if (!map.containsKey(Integer.valueOf(i))) {
            return;
        }
        Set<String> set = map.get(Integer.valueOf(i));
        if (set != null && (listLLIIII = C13LP.LLIIII(set)) != null) {
            for (Object obj : listLLIIII) {
                HashMap<String, Pair<ParcelUuid, Set<Integer>>> map2 = LJI;
                Pair<ParcelUuid, Set<Integer>> pair = map2.get(obj);
                if (pair != null) {
                    Set<Integer> second = pair.getSecond();
                    second.remove(Integer.valueOf(i));
                    if (second.size() == 0) {
                        map2.remove(obj);
                    }
                }
            }
        }
        LJII.remove(Integer.valueOf(i));
        LIZIZ.decrementAndGet();
    }

    public static ParcelUuid LIZIZ(int i, int i2, String str) {
        Set<Integer> second;
        if (i2 != 2) {
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return LJFF;
                    }
                    return LIZLLL;
                }
                return LJ;
            }
            return LIZJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sessionId=[");
        sbLIZ.append(i);
        sbLIZ.append("], btName=[");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        HashMap<Integer, Set<String>> map = LJII;
        Integer numValueOf = Integer.valueOf(i);
        final AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(804);
        map.computeIfAbsent(numValueOf, new Function() { // from class: X.0jzv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return aFwS229S0000000_2.invoke(obj);
            }
        }).add(str);
        HashMap<String, Pair<ParcelUuid, Set<Integer>>> map2 = LJI;
        if (map2.containsKey(str)) {
            Pair<ParcelUuid, Set<Integer>> pair = map2.get(str);
            if (pair != null && (second = pair.getSecond()) != null) {
                second.add(Integer.valueOf(i));
            }
            return pair.getFirst();
        }
        ParcelUuid parcelUuid = new ParcelUuid(UUID.randomUUID());
        map2.put(str, new Pair<>(parcelUuid, C093Y.LJ(Integer.valueOf(i))));
        return parcelUuid;
    }
}
