package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C051500Gr {
    public static String LIZ(String str, List list) {
        Object next;
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((Pair) next).getFirst(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Pair pair = (Pair) next;
        if (pair == null) {
            return null;
        }
        return (String) pair.getSecond();
    }
}
