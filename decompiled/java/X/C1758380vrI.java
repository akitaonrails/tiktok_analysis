package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.Map;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.0vrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758380vrI implements IPdpStarter {
    public static Object LIZLLL;
    public C11JF LIZIZ;
    public long LIZJ = -1;

    public static final C1758370vrH LIZ(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z) {
        InterfaceC1758450vrP.LIZ.getClass();
        C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
        Boolean bool = Boolean.TRUE;
        String str = pdpEnterParam.selectedAddressId;
        C04J0 c04j0 = new C04J0();
        c04j0.LIZ.put("goda_v2_params", C10396044s.LIZ(AFwS228S0000000_1.get$arr$(342)));
        return C1758310vrB.LJJJJ(pdpEnterParam, false, 0, z, bool, str, null, c04j0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C19EG r25, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r26) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758380vrI.LIZJ(X.19EG, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):void");
    }

    public final boolean LIZIZ(C19EG c19eg, C1758370vrH c1758370vrH, IPdpStarter.PdpEnterParam pdpEnterParam, long j) throws Throwable {
        ProductPackStruct productPackStruct;
        String str;
        if (c1758370vrH.LIZLLL != null) {
            if (TextUtils.isEmpty(pdpEnterParam.chainKey) && (productPackStruct = c1758370vrH.LIZLLL) != null && (str = productPackStruct.chainKey) != null) {
                Map<String, Object> map = pdpEnterParam.visitReportParams;
                if (map != null) {
                    map.put("chain_key", str);
                }
                pdpEnterParam.setChainKey(str);
            }
            InterfaceC1758450vrP.LIZ.getClass();
            C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
            C1758310vrB.LJJIL(c1758370vrH.LIZ);
            ProductPackStruct productPackStruct2 = c1758370vrH.LIZLLL;
            int i = c1758370vrH.LIZIZ;
            getClass();
            LIZLLL(c19eg, pdpEnterParam, productPackStruct2, j, i, 0);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C19EG r9, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r10, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r11, long r12, int r14, int r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758380vrI.LIZLLL(X.19EG, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, long, int, int):void");
    }
}
