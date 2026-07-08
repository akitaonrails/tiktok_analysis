package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185580gxQ {
    public static int LIZ;
    public static final List<C1185870gxt> LIZIZ = new ArrayList();

    public static void LIZ(String str, Function1 function1) {
        Long l;
        Object next;
        long jLongValue;
        long jCurrentTimeMillis;
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (true) {
            l = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C1185870gxt) next).LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1185870gxt c1185870gxt = (C1185870gxt) next;
        if (c1185870gxt == null) {
            return;
        }
        Long lValueOf = Long.valueOf(c1185870gxt.LIZIZ);
        if (C08A4.LIZIZ(Long.valueOf(lValueOf.longValue()))) {
            l = lValueOf;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (c1185870gxt.LIZJ > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - c1185870gxt.LIZJ;
        } else {
            jCurrentTimeMillis = 0;
        }
        long j = jLongValue + jCurrentTimeMillis;
        c1185870gxt.LIZIZ = 0L;
        c1185870gxt.LIZJ = -1L;
        if (j > 0) {
            function1.invoke(Long.valueOf(j));
        }
    }
}
