package X;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881130YhT {
    public final int LIZ = C310690CFv.LIZ().unreadChatsCountLimit;
    public long LIZIZ = System.currentTimeMillis();
    public final Map<InterfaceC1491305sd, C879540Yeu<?>> LIZJ = new LinkedHashMap();
    public final TreeSet<C879540Yeu<?>> LIZLLL = new TreeSet<>(new Comparator() { // from class: X.0YhV
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C0Y8T c0y8t;
            long sortOrder;
            C0Y8T c0y8t2;
            C879540Yeu c879540Yeu = (C879540Yeu) obj2;
            T t = ((C879540Yeu) obj).LIZJ;
            if (t instanceof C0Y8T) {
                c0y8t = (C0Y8T) t;
            } else {
                c0y8t = null;
            }
            long sortOrder2 = Long.MAX_VALUE;
            if (c0y8t != null) {
                sortOrder = c0y8t.getSortOrder();
            } else {
                sortOrder = Long.MAX_VALUE;
            }
            T t2 = c879540Yeu.LIZJ;
            if ((t2 instanceof C0Y8T) && (c0y8t2 = (C0Y8T) t2) != null) {
                sortOrder2 = c0y8t2.getSortOrder();
            }
            return Intrinsics.LJII(sortOrder2, sortOrder);
        }
    });
}
