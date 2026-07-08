package X;

import com.bytedance.im.core.proto.Response;

/* JADX INFO: renamed from: X.0Y8L, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8L {
    public static C0Y8K LIZ(Response response) {
        int iIntValue;
        Integer num = response.status_code;
        int iIntValue2 = -9999;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -9999;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status_code ");
        Integer num2 = response.status_code;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        sbLIZ.append(iIntValue2);
        sbLIZ.append(" log_id: ");
        String str = response.log_id;
        if (str == null) {
            str = "null_log_id";
        }
        sbLIZ.append(str);
        sbLIZ.append("  error: ");
        String str2 = response.error_desc;
        if (str2 == null) {
            str2 = "unknown_error";
        }
        sbLIZ.append(str2);
        return new C0Y8K(iIntValue, C2188811AlT.LIZIZ(sbLIZ), response);
    }
}
