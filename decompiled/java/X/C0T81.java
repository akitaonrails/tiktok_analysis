package X;

import Y.ARunnableS7S1000000_12;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T81, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T81 {
    public static int LIZLLL;
    public static boolean LJFF;
    public static final C0T81 LIZ = new C0T81();
    public static final ConcurrentHashMap<String, Integer> LIZIZ = new ConcurrentHashMap<>();
    public static String LIZJ = "";
    public static final HashMap<String, ArrayList<Integer>> LJ = new HashMap<>();

    public final synchronized void LIZ(String str) {
        if (LJFF) {
            return;
        }
        if (str == null) {
            return;
        }
        C823050WQl.LIZLLL().submit(new ARunnableS7S1000000_12(str, 1));
        LJFF = true;
    }

    public final synchronized void LIZIZ(String str) {
        if (str.length() == 0) {
            return;
        }
        if (!Intrinsics.LJFF(LIZJ, str)) {
            LIZJ = str;
            int i = LIZLLL;
            if (i == 10) {
                Iterator<T> it2 = LJ.values().iterator();
                while (it2.hasNext()) {
                    ArrayList arrayList = (ArrayList) it2.next();
                    ListProtector.remove(arrayList, 0);
                    arrayList.add(0);
                }
            } else {
                LIZLLL = i + 1;
                Iterator<T> it3 = LJ.values().iterator();
                while (it3.hasNext()) {
                    ((ArrayList) it3.next()).add(0);
                }
            }
        }
    }
}
