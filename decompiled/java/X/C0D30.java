package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D30, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D30 {
    public static final C0D30 LIZ = new C0D30();

    public static double LIZIZ(Number number) {
        double dPow = Math.pow(10.0d, C0D48.LIZIZ().priceFractionDigits);
        if (number != null) {
            return number.doubleValue() / dPow;
        }
        return 0.0d;
    }

    public static List LIZLLL(PdpSupplementData pdpSupplementData) {
        List list;
        if (pdpSupplementData == null || (list = pdpSupplementData.productSpuImageList) == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String strLJ = C0D4H.LJ((String) it2.next());
            if (strLJ != null) {
                arrayList.add(strLJ);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            String strLIZJ = C0D4H.LIZJ(str);
            if (strLIZJ != null) {
                str = strLIZJ;
            }
            if (hashSet.add(str)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final void LIZJ(List<String> list, List<C0D3D> list2) {
        String string = a0.LJLIIIL(C13LP.LJJLIIIJ(list, "\n", null, null, 0, null, null, 62)).toString();
        if (string.length() > 0) {
            ((ArrayList) list2).add(new C0D3C("", string));
            ((ArrayList) list).clear();
            return;
        }
        ((ArrayList) list).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0D3I LJ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r18, java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D30.LJ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto, java.lang.String, java.util.Map):X.0D3I");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[PHI: r6
      0x0034: PHI (r6v19 java.lang.String) = (r6v0 java.lang.String), (r6v20 java.lang.String) binds: [B:19:0x0032, B:17:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[PHI: r6
      0x0038: PHI (r6v18 java.lang.String) = (r6v0 java.lang.String), (r6v19 java.lang.String) binds: [B:19:0x0032, B:21:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c A[PHI: r5 r6
      0x003c: PHI (r5v0 java.lang.String) = (r5v35 java.lang.String), (r5v36 java.lang.String) binds: [B:23:0x003a, B:21:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r6v1 java.lang.String) = (r6v18 java.lang.String), (r6v19 java.lang.String) binds: [B:23:0x003a, B:21:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0485 A[PHI: r2
      0x0485: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v19 java.lang.String) binds: [B:287:0x0482, B:268:0x0449] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0487 A[PHI: r3
      0x0487: PHI (r3v13 java.lang.Integer) = (r3v12 java.lang.Integer), (r3v15 java.lang.Integer), (r3v15 java.lang.Integer) binds: [B:284:0x047e, B:276:0x045b, B:292:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[PHI: r5 r6
      0x005a: PHI (r5v34 java.lang.String) = (r5v0 java.lang.String), (r5v0 java.lang.String), (r5v35 java.lang.String) binds: [B:25:0x003e, B:29:0x0058, B:23:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r6v17 java.lang.String) = (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v18 java.lang.String) binds: [B:25:0x003e, B:29:0x0058, B:23:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0618 A[PHI: r9
      0x0618: PHI (r9v22 ??) = (r9v11 ??), (r9v23 ??) binds: [B:385:0x0616, B:602:0x0618] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x074a A[PHI: r9
      0x074a: PHI (r9v12 ??) = (r9v39 ??), (r9v40 ??), (r9v41 ??), (r9v42 ??) binds: [B:385:0x0616, B:387:0x061a, B:389:0x0624, B:391:0x062a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0828 A[PHI: r1
      0x0828: PHI (r1v55 X.0D36) = (r1v52 X.0D36), (r1v68 X.0D36) binds: [B:494:0x0800, B:505:0x0823] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0911 A[PHI: r1
      0x0911: PHI (r1v53 X.0D36) = (r1v52 X.0D36), (r1v55 X.0D36) binds: [B:494:0x0800, B:507:0x082a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x096a  */
    /* JADX WARN: Type inference failed for: r3v18, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v77, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v78, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v79, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r9v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0D3K LIZ(X.C0D30 r58, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r59, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r60, java.lang.String r61, com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData r62, boolean r63, java.lang.String r64, int r65) {
        /*
            Method dump skipped, instruction units count: 2418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D30.LIZ(X.0D30, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto, java.lang.String, com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData, boolean, java.lang.String, int):X.0D3K");
    }
}
