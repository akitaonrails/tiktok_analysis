package X;

import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659600Pu2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C659560Pty LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r19) {
        /*
            r9 = 0
            r14 = r19
            if (r14 == 0) goto Lbd
            X.00zU r2 = new X.00zU
            r2.<init>()
            X.00zU r1 = new X.00zU
            r1.<init>()
            java.util.List r3 = r14.getAnchors()
            if (r3 == 0) goto Lb6
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb6
            X.07ik r4 = new X.07ik
            r4.<init>(r3)
            kotlin.jvm.internal.AwS376S0200000_10 r3 = new kotlin.jvm.internal.AwS376S0200000_10
            r0 = 36
            r3.<init>(r1, r14, r0)
            X.08QU r5 = X.C09RB.LJIJI(r4, r3)
            java.lang.Object r8 = X.C09RB.LJIIL(r5)
            r7 = r8
            com.ss.android.ugc.aweme.feed.model.search.ProductAnchor r7 = (com.ss.android.ugc.aweme.feed.model.search.ProductAnchor) r7
            if (r7 == 0) goto Lb4
            com.ss.android.ugc.aweme.feed.model.EnhancedProduct r10 = r7.enhancedProduct
            if (r10 == 0) goto La9
            java.lang.String r6 = r10.getProductIdStr()
            if (r6 == 0) goto La9
            boolean r0 = X.C123100dR.LIZ(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La9
            if (r7 == 0) goto L72
            java.util.List<com.ss.android.ugc.aweme.search.ecom.data.Product> r0 = r7.productList
            if (r0 == 0) goto Lab
            java.util.Iterator r4 = r0.iterator()
        L58:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.ss.android.ugc.aweme.search.ecom.data.Product r0 = (com.ss.android.ugc.aweme.search.ecom.data.Product) r0
            java.lang.String r0 = r0.LIZIZ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L58
            if (r3 == 0) goto La9
            r9 = r3
        L72:
            r2.element = r9
            r0 = 176(0xb0, float:2.47E-43)
            kotlin.jvm.internal.AFwS241S0000000_10 r0 = kotlin.jvm.internal.AFwS241S0000000_10.get$arr$(r0)
            X.126t r0 = X.C09RB.LJIILJJIL(r5, r0)
            int r0 = X.C09RB.LJFF(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r9 = r8
        L87:
            X.0Pty r8 = new X.0Pty
            com.ss.android.ugc.aweme.feed.model.search.ProductAnchor r9 = (com.ss.android.ugc.aweme.feed.model.search.ProductAnchor) r9
            T r11 = r2.element
            com.ss.android.ugc.aweme.search.ecom.data.Product r11 = (com.ss.android.ugc.aweme.search.ecom.data.Product) r11
            T r13 = r1.element
            java.lang.String r13 = (java.lang.String) r13
            X.0Pu2 r0 = X.C659620Pu4.LLJILJILJ
            r0.getClass()
            r15 = r12
            r16 = r9
            r17 = r11
            r18 = r10
            r19 = r13
            com.ss.android.ugc.aweme.feed.model.EnhancedProduct$Style r14 = LIZJ(r14, r15, r16, r17, r18, r19)
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        La9:
            if (r7 == 0) goto L72
        Lab:
            java.util.List<com.ss.android.ugc.aweme.search.ecom.data.Product> r0 = r7.productList
            if (r0 == 0) goto L72
            java.lang.Object r9 = X.C13LP.LJJJLL(r0)
            goto L72
        Lb4:
            r10 = r9
            goto L72
        Lb6:
            r0 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r10 = r9
            goto L87
        Lbd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C659600Pu2.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):X.0Pty");
    }

    public static String LIZIZ(Product product, int i) {
        String str = null;
        if (i <= 0 || product == null || ((str = product.elasticTitle) != null && str.length() > 0)) {
            return str;
        }
        return product.title;
    }

    public static boolean LJ(ProductAnchor productAnchor, String str, int i) {
        List<Product> list;
        Product product;
        String strLIZIZ;
        List<Product> list2;
        if (productAnchor == null || (list = productAnchor.productList) == null || (product = (Product) C13LP.LJJJLL(list)) == null || (strLIZIZ = product.LIZIZ()) == null || strLIZIZ.length() <= 0) {
            return false;
        }
        Product product2 = null;
        if (1 == 0) {
            return false;
        }
        if (C123100dR.LIZ(str) && (list2 = productAnchor.productList) != null) {
            Iterator<Product> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Product next = it2.next();
                if (Intrinsics.LJFF(next.LIZIZ(), str)) {
                    product2 = next;
                    break;
                }
            }
            Product product3 = product2;
            if (product3 != null) {
                product = product3;
            }
        }
        if (LIZIZ(product, i) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if (r3 == 0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.EnhancedProduct.Style LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r7, java.lang.Integer r8, com.ss.android.ugc.aweme.feed.model.search.ProductAnchor r9, com.ss.android.ugc.aweme.search.ecom.data.Product r10, com.ss.android.ugc.aweme.feed.model.EnhancedProduct r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C659600Pu2.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, com.ss.android.ugc.aweme.feed.model.search.ProductAnchor, com.ss.android.ugc.aweme.search.ecom.data.Product, com.ss.android.ugc.aweme.feed.model.EnhancedProduct, java.lang.String):com.ss.android.ugc.aweme.feed.model.EnhancedProduct$Style");
    }
}
