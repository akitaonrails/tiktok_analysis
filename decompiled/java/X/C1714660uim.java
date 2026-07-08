package X;

import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS141S1200000_26;

/* JADX INFO: renamed from: X.0uim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714660uim {
    public final C1713570uh1 LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public long LIZLLL;
    public long LJ = System.currentTimeMillis();

    public final void LJ(String str) {
        String str2 = this.LIZJ;
        if (str2 != null && str2.length() > 0) {
            this.LIZJ = null;
            str = str2;
        }
        LIZ("fp_sdk_bnpl_leave_page", C2097608Jq.LJIIIIZZ(new Pair("leave_type", str), new Pair("stay_time", String.valueOf(System.currentTimeMillis() - this.LIZLLL))));
    }

    public final void LJI(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", "{1,OK}");
        linkedHashMap.put("popup_id", str);
        LIZ("fp_sdk_bnpl_popup_show", linkedHashMap);
    }

    public C1714660uim(C1713570uh1 c1713570uh1, String str) {
        this.LIZ = c1713570uh1;
        this.LIZIZ = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C1714660uim r5, java.lang.String r6) {
        /*
            r2 = r5
            X.0uh1 r0 = r2.LIZ
            r3 = 0
            if (r0 == 0) goto L17
            com.bytedance.pipo.verify.base.model.VerifyInfo r0 = r0.LJIIIZ()
            if (r0 == 0) goto L17
            java.lang.String r1 = r0.verifyType
            if (r1 == 0) goto L17
            int r0 = r1.hashCode()
            switch(r0) {
                case 65768: goto L50;
                case 78078: goto L45;
                case 78603: goto L3a;
                case 79221: goto L2f;
                case 2241553: goto L24;
                default: goto L17;
            }
        L17:
            java.lang.String r4 = ""
        L19:
            kotlin.jvm.internal.AwS36S2200000_26 r0 = new kotlin.jvm.internal.AwS36S2200000_26
            r5 = 1
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            X.C1714230ui5.LIZLLL(r0)
            return
        L24:
            java.lang.String r0 = "ID-C"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            java.lang.String r4 = "fp_sdk_bnpl_idc_click"
            goto L19
        L2f:
            java.lang.String r0 = "PIN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            java.lang.String r4 = "fp_sdk_bnpl_pin_click"
            goto L19
        L3a:
            java.lang.String r0 = "OTP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            java.lang.String r4 = "fp_sdk_bnpl_otp_click"
            goto L19
        L45:
            java.lang.String r0 = "OCR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            java.lang.String r4 = "rd_pipo_veri_center_page_click"
            goto L19
        L50:
            java.lang.String r0 = "BIO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            java.lang.String r4 = "fp_sdk_bnpl_bio_click"
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1714660uim.LIZJ(X.0uim, java.lang.String):void");
    }

    public final void LIZ(String str, Map<String, String> map) {
        C1714230ui5.LIZLLL(new AwS141S1200000_26(this, (C1714660uim) str, (String) map, (Map<String, String>) 11));
    }

    public final void LIZIZ(String str, String str2) {
        LIZ(str, C2097608Jq.LJIIIIZZ(new Pair("obj_id", str2), new Pair("click_use_time", String.valueOf(System.currentTimeMillis() - this.LJ))));
    }

    public final void LJII(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("popup_id", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZ(str2, linkedHashMap);
    }

    public final void LJFF(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", str);
        linkedHashMap.put("popup_id", str2);
        LIZ(str3, linkedHashMap);
    }

    public static void LIZLLL(C1714660uim c1714660uim, BaseResponse baseResponse, long j, long j2, int i) {
        long j3 = j;
        BaseResponse baseResponse2 = baseResponse;
        if ((i & 1) != 0) {
            baseResponse2 = null;
        }
        if ((i & 2) != 0) {
            j3 = c1714660uim.LJ;
        }
        C1714230ui5.LIZLLL(new C1714430uiP(baseResponse2, j3, j2, null, c1714660uim));
    }
}
