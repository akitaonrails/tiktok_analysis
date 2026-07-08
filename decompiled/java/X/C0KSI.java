package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0KSI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KSI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, boolean z, Map map) {
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_contract_status_result");
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        c512030K6fLIZ.LIZLLL.putAll((Map<? extends String, ? extends String>) map);
        c512030K6fLIZ.LIZ(Integer.valueOf(i), "duration");
        c512030K6fLIZ.LIZ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LIZIZ(int i, boolean z, Map map) {
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_create_contract_result");
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        c512030K6fLIZ.LIZLLL.putAll((Map<? extends String, ? extends String>) map);
        c512030K6fLIZ.LIZ(Integer.valueOf(i), "duration");
        c512030K6fLIZ.LIZ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LIZJ(int i, boolean z, Map map) {
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_fetch_product_result");
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        c512030K6fLIZ.LIZLLL.putAll((Map<? extends String, ? extends String>) map);
        c512030K6fLIZ.LIZ(Integer.valueOf(i), "duration");
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LIZLLL(int i, boolean z, Map map) {
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_iap_result");
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        c512030K6fLIZ.LIZLLL.putAll((Map<? extends String, ? extends String>) map);
        c512030K6fLIZ.LIZ(Integer.valueOf(i), "duration");
        c512030K6fLIZ.LIZ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }
}
