package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto.PreloadBillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03R4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C03R4 {
    public abstract Object LIZ(C03WX c03wx, C03R6 c03r6, InterfaceC1748810vbr interfaceC1748810vbr, Integer num, C03RX c03rx, C03RW c03rw, String str, Integer num2, EnumC840403Qc enumC840403Qc, InterfaceC1364105Vn<? super BillInfoResponse> interfaceC1364105Vn);

    public static void LIZIZ(C03R4 c03r4, C03R6 c03r6, InterfaceC497601wk interfaceC497601wk, C03WX c03wx, long j, Integer num, C03RX c03rx, C03RW c03rw, String str, Integer num2, int i) {
        int i2;
        String strGenCacheKey;
        EnumC840403Qc enumC840403Qc;
        Integer num3 = num2;
        C03RW c03rw2 = c03rw;
        C03RX c03rx2 = c03rx;
        Integer num4 = num;
        String str2 = str;
        long j2 = j;
        if ((i & 8) != 0) {
            j2 = 0;
        }
        if ((i & 32) != 0) {
            num4 = null;
        }
        if ((i & 64) != 0) {
            c03rx2 = null;
        }
        if ((i & 128) != 0) {
            c03rw2 = null;
        }
        if ((i & 256) != 0) {
            str2 = null;
        }
        if ((i & 512) != 0) {
            num3 = null;
        }
        c03r4.getClass();
        if (c03rw2 != null) {
            i2 = c03rw2.LIZIZ;
        } else {
            i2 = -1;
        }
        Integer numLJIIIIZZ = C928203k0.LIZ.LJIIIIZZ(str2, i2, num3, new AwS545S0100000_1(c03r6, 1820), 0, null, 0);
        int value = C03SW.COMBINED_SKU_FLOW.getValue();
        if (((numLJIIIIZZ == null || numLJIIIIZZ.intValue() != value) && c03rw2 != null && c03rw2.LIZ == C03R5.COMBINED_SKU.getValue()) || (strGenCacheKey = c03r6.genCacheKey(numLJIIIIZZ)) == null || C843303Rf.LIZJ(num4, strGenCacheKey)) {
            return;
        }
        if (c03r6 instanceof PreloadBillInfoRequest) {
            enumC840403Qc = EnumC840403Qc.PRELOAD_API;
        } else {
            enumC840403Qc = EnumC840403Qc.PRELOAD_FULL_DATA_API;
        }
        C843303Rf.LJFF(strGenCacheKey, new C03RS(C03RT.PRELOADING, null, enumC840403Qc, c03rx2, c03rw2, 8), num4);
        C03RV c03rv = C03RV.LIZ;
        C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C03QV(j2, c03r4, c03wx, c03r6, null, num4, c03rx2, c03rw2, str2, num3, enumC840403Qc, null), 3);
        c03rv.getClass();
        C03RV.LIZIZ = c099gLIZIZ;
    }
}
