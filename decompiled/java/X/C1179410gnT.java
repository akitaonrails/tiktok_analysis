package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.ImageUrlModel;

/* JADX INFO: renamed from: X.0gnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179410gnT {
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[PHI: r0
      0x005d: PHI (r0v6 java.util.Map<java.lang.String, java.lang.String>) = (r0v5 java.util.Map<java.lang.String, java.lang.String>), (r0v20 java.util.Map<java.lang.String, java.lang.String>) binds: [B:15:0x0040, B:21:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(android.content.Context r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1179410gnT.LIZ(android.content.Context, java.lang.String):java.lang.String");
    }

    public static final C1189360h3W LIZIZ(C1180600gpO c1180600gpO, Context context, ImageUrlModel imageUrlModel) {
        String strLIZ = LIZ(context, imageUrlModel.getUri());
        if (strLIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("smartLoad iconRes failed for uri ");
            sbLIZ.append(imageUrlModel.getUri());
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("smartLoad iconRes failed for uri ");
            sbLIZ2.append(imageUrlModel.getUri());
            C2188811AlT.LIZIZ(sbLIZ2);
            return c1180600gpO.LIZ(imageUrlModel);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("smartLoad iconRes success for uri ");
        sbLIZ3.append(imageUrlModel.getUri());
        C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("smartLoad iconRes success for uri ");
        sbLIZ4.append(imageUrlModel.getUri());
        C2188811AlT.LIZIZ(sbLIZ4);
        return c1180600gpO.LIZIZ(strLIZ);
    }

    public static final C1189360h3W LIZJ(C1180600gpO c1180600gpO, Context context, String str, String str2) {
        String strLIZ = LIZ(context, str2);
        if (strLIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("smartLoad iconRes failed for uri ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("smartLoad iconRes failed for uri ");
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
            return c1180600gpO.LIZIZ(str);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("smartLoad iconRes success for uri ");
        sbLIZ3.append(str2);
        C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("smartLoad iconRes success for uri ");
        sbLIZ4.append(str2);
        C2188811AlT.LIZIZ(sbLIZ4);
        return c1180600gpO.LIZIZ(strLIZ);
    }
}
