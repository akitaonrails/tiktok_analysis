package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03Nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C834403Nu {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:80:0x0126 A[PHI: r3
      0x0126: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v6 java.lang.String) binds: [B:79:0x0124, B:77:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a A[PHI: r3
      0x012a: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:79:0x0124, B:81:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedHashMap LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C834403Nu.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, java.util.Map):java.util.LinkedHashMap");
    }

    public static String LIZIZ(PudoAddress pudoAddress, String str) {
        String str2;
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        String string;
        if (pudoAddress == null || (str2 = pudoAddress.daInfo) == null || !(!a0.LJJJIL(str2)) || (mapLJIIJ = C1741890vQh.LJIIJ(str2)) == null || (obj = mapLJIIJ.get(str)) == null || (string = obj.toString()) == null || !(!a0.LJJJIL(string))) {
            return null;
        }
        return string;
    }

    public static String LIZJ(List list, Function1 function1) {
        String strLJIILLIIL = C09RB.LJIILLIIL(C09RB.LJIIIZ(C09RB.LJIJI(new C1939607ik(list), function1), AFwS228S0000000_1.get$arr$(893)), ",", null, null, null, 62);
        if (!(!a0.LJJJIL(strLJIILLIIL))) {
            return null;
        }
        return strLJIILLIIL;
    }
}
