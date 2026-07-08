package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.042X, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C042X {
    public static final C042Y LIZ(C042Y c042y) {
        C042Y c042y2 = new C042Y(c042y.LL, c042y.LLILLJJLI, c042y.LLILLL, c042y.LLILZ, c042y.LLILZIL, c042y.LLILZLL, c042y.LLIZ);
        c042y2.LLJI = c042y.LLJI;
        c042y2.LLIZLLLIL = c042y.LLIZLLLIL;
        c042y2.LLJ = c042y.LLJ;
        c042y2.LLJIJIL = c042y.LLJIJIL;
        c042y2.LLJILJIL = c042y.LLJILJIL;
        c042y2.LLJILJILJ = c042y.LLJILJILJ;
        c042y2.LLJILLL = c042y.LLJILLL;
        c042y2.LLJJ = c042y.LLJJ;
        c042y2.LLJJI = c042y.LLJJI;
        c042y2.LLJJIII = c042y.LLJJIII;
        c042y2.LLJJIJI = c042y.LLJJIJI;
        return c042y2;
    }

    public static final Skc LIZJ(List<SaleProp> list, String[] strArr, SkcInfo skcInfo) {
        List<Skc> list2;
        Object objLJJIIZ;
        if (skcInfo != null && list != null) {
            int i = 0;
            for (SaleProp saleProp : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (Intrinsics.LJFF(saleProp.propId, skcInfo.skcPropertyId) && (list2 = skcInfo.skcList) != null) {
                        for (Skc skc : list2) {
                            if (strArr != null) {
                                objLJJIIZ = C13LQ.LJJIIZ(i, strArr);
                            } else {
                                objLJJIIZ = null;
                            }
                            if (Intrinsics.LJFF(objLJJIIZ, skc.skcId)) {
                                return skc;
                            }
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<X.C042Y> LIZIZ(int r37, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r38, java.lang.String[] r39, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r40, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo r41, java.lang.Boolean r42, java.lang.Integer r43) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C042X.LIZIZ(int, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp, java.lang.String[], java.util.List, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo, java.lang.Boolean, java.lang.Integer):java.util.List");
    }
}
