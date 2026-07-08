package X;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: X.1BXU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BXU {
    public static void LIZIZ(String str) {
        C1BXD.LIZIZ().LIZ.LIZIZ();
    }

    public static String LIZ(String str, String str2, String str3, EnumC2206581BXs enumC2206581BXs, String str4, String str5, String[] strArr, String[] strArr2) {
        if (TextUtils.isEmpty(str5)) {
            str5 = "-";
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        if (strArr2 == null) {
            strArr2 = new String[0];
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("engine=");
        sbLIZ.append(str);
        sbLIZ.append(" provider=");
        sbLIZ.append(str2);
        sbLIZ.append(" point=");
        sbLIZ.append(str3);
        sbLIZ.append(" thread=");
        sbLIZ.append(enumC2206581BXs);
        sbLIZ.append(" task=");
        sbLIZ.append(str4);
        sbLIZ.append(" biz=");
        sbLIZ.append(str5);
        sbLIZ.append(" deps=");
        sbLIZ.append(Arrays.toString(strArr));
        sbLIZ.append(" resources=");
        sbLIZ.append(Arrays.toString(strArr2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
