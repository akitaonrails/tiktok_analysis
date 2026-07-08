package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0i8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230880i8U {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0060 A[PHI: r1 r9 r10
      0x0060: PHI (r1v3 int) = (r1v1 int), (r1v4 int) binds: [B:68:0x00c0, B:34:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r9v4 boolean) = (r9v2 boolean), (r9v5 boolean) binds: [B:68:0x00c0, B:34:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r10v3 boolean) = (r10v1 boolean), (r10v4 boolean) binds: [B:68:0x00c0, B:34:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb A[PHI: r9
      0x00bb: PHI (r9v1 boolean) = (r9v0 boolean), (r9v7 boolean), (r9v7 boolean), (r9v7 boolean) binds: [B:62:0x00b7, B:22:0x0037, B:24:0x003d, B:26:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf A[PHI: r9 r10
      0x00bf: PHI (r9v2 boolean) = (r9v1 boolean), (r9v6 boolean), (r9v6 boolean) binds: [B:65:0x00bc, B:29:0x004c, B:31:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r10v1 boolean) = (r10v0 boolean), (r10v5 boolean), (r10v5 boolean) binds: [B:65:0x00bc, B:29:0x004c, B:31:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1230890i8V LIZ(android.os.Bundle r11) {
        /*
            r4 = 0
            if (r11 == 0) goto L9
            java.lang.String r0 = "enter_from"
            java.lang.String r4 = r11.getString(r0)
        L9:
            java.lang.String r8 = ""
            if (r4 != 0) goto Le
            r4 = r8
        Le:
            if (r11 == 0) goto L18
            java.lang.String r0 = "enter_method"
            java.lang.String r5 = r11.getString(r0)
            if (r5 != 0) goto L19
        L18:
            r5 = r8
        L19:
            r1 = 1
            if (r11 == 0) goto Lb6
            java.lang.String r0 = "is_full_screen"
            java.lang.String r0 = r11.getString(r0)
            if (r0 == 0) goto Lb6
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto Lb6
            int r0 = r0.intValue()
            if (r0 != r1) goto Lb3
            r9 = 1
        L31:
            java.lang.String r0 = "disable_background_mask"
            java.lang.String r0 = r11.getString(r0)
            if (r0 == 0) goto Lbb
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto Lbb
            int r0 = r0.intValue()
            if (r0 != r1) goto Lbb
            r10 = 1
        L46:
            java.lang.String r0 = "quick_chat_view_type"
            java.lang.String r0 = r11.getString(r0)
            if (r0 == 0) goto Lbf
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto Lbf
            int r1 = r0.intValue()
        L58:
            java.lang.String r0 = "traffic_type"
            java.lang.String r6 = r11.getString(r0)
            if (r6 != 0) goto L61
        L60:
            r6 = r8
        L61:
            if (r11 == 0) goto L6b
            java.lang.String r0 = "group_category"
            java.lang.String r7 = r11.getString(r0)
            if (r7 != 0) goto L6c
        L6b:
            r7 = r8
        L6c:
            if (r11 == 0) goto L77
            java.lang.String r0 = "group_type"
            java.lang.String r0 = r11.getString(r0)
            if (r0 == 0) goto L77
            r8 = r0
        L77:
            if (r11 == 0) goto Lac
            java.lang.String r0 = "business_type"
            java.lang.String r0 = r11.getString(r0)
            if (r0 == 0) goto Lac
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto Lac
            int r2 = r0.intValue()
        L8b:
            if (r11 == 0) goto La5
            java.lang.String r0 = "exclude_business_type"
            java.lang.String r0 = r11.getString(r0)
            if (r0 == 0) goto La5
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto La5
            int r3 = r0.intValue()
        L9f:
            X.0i8V r0 = new X.0i8V
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        La5:
            X.0hqs r0 = X.EnumC1219960hqs.UNKNOWN
            int r3 = r0.getValue()
            goto L9f
        Lac:
            X.0hqs r0 = X.EnumC1219960hqs.UNKNOWN
            int r2 = r0.getValue()
            goto L8b
        Lb3:
            r9 = 0
            goto L31
        Lb6:
            r9 = 1
            if (r11 == 0) goto Lbb
            goto L31
        Lbb:
            r10 = 0
            if (r11 == 0) goto Lbf
            goto L46
        Lbf:
            r1 = 1
            if (r11 == 0) goto L60
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1230880i8U.LIZ(android.os.Bundle):X.0i8V");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1228470i4b LIZIZ(android.os.Bundle r65) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1230880i8U.LIZIZ(android.os.Bundle):X.0i4b");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1228470i4b LIZJ(android.os.Bundle r56) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1230880i8U.LIZJ(android.os.Bundle):X.0i4b");
    }

    public static List LIZLLL(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            List listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJ.iterator();
            while (it2.hasNext()) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL((String) it2.next()).toString());
                if (numLJIIJJI != null) {
                    arrayList.add(numLJIIJJI);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
