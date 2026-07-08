package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.09ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2400909ax {
    public static final String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" AND ");
            sbLIZ2.append(str2);
            str2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
