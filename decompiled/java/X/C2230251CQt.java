package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1CQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230251CQt {
    public final String LIZ;
    public final String LIZIZ;
    public final char[] LIZJ;
    public final int LIZLLL;
    public int LJ;

    public C2230251CQt(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str.toCharArray();
        this.LIZLLL = str.length();
    }

    public final float LIZ(Context context, int i, StringBuilder sb) {
        String packageName;
        if (i != -1) {
            String strSubstring = sb.substring(1, i);
            String strSubstring2 = sb.substring(i + 1);
            if (Intrinsics.LJFF(strSubstring, "dimen")) {
                packageName = context.getPackageName();
            } else if (Intrinsics.LJFF(strSubstring, "android:dimen")) {
                packageName = "android";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown identifier ");
                sbLIZ.append((Object) sb);
                sbLIZ.append(", ");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append('=');
                sbLIZ.append(this.LIZ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            int iN3 = C786410Ut5.n3(context.getResources(), strSubstring2, "dimen", packageName);
            if (iN3 == 0) {
                if (C1CRB.LLILZLL != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append((Object) sb);
                    sbLIZ2.append(" is not supported in AndroidStudio Preview, ");
                    sbLIZ2.append(this.LIZIZ);
                    sbLIZ2.append('=');
                    sbLIZ2.append(this.LIZ);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("unknown identifier ");
                sbLIZ3.append((Object) sb);
                sbLIZ3.append(", ");
                sbLIZ3.append(this.LIZIZ);
                sbLIZ3.append('=');
                sbLIZ3.append(this.LIZ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            return context.getResources().getDimension(iN3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("unknown token ");
        sbLIZ4.append((Object) sb);
        sbLIZ4.append(", ");
        sbLIZ4.append(this.LIZIZ);
        sbLIZ4.append('=');
        sbLIZ4.append(this.LIZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f6, code lost:
    
        if (r6.equals("left") != false) goto L70;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.Context r11, int r12, java.lang.StringBuilder r13) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2230251CQt.LIZIZ(android.content.Context, int, java.lang.StringBuilder):java.lang.Object");
    }
}
