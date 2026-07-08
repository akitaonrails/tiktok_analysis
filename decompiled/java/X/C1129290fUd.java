package X;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.IndexedValue;

/* JADX INFO: renamed from: X.0fUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129290fUd {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static int LIZ(long j, LinkedList linkedList) {
        AbstractC1126600fQI abstractC1126600fQI;
        if (j <= 0) {
            return -1;
        }
        Iterator it2 = C13LP.LLIIL(linkedList).iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                return -1;
            }
            IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
            T t = indexedValue.LIZIZ;
            if (!(t instanceof C292301Bh) && (abstractC1126600fQI = (AbstractC1126600fQI) t) != null && abstractC1126600fQI.LJI() == j) {
                return indexedValue.LIZ;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1129280fUc r17, long r18, X.InterfaceC1364105Vn<? super X.C189200o6<X.C1886107a7>> r20) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1129290fUd.LIZIZ(X.0fUc, long, X.05Vn):java.lang.Object");
    }
}
