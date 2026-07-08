package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Mb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571450Mb9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AbstractC201949140d abstractC201949140d, String str) {
        LIZIZ(C571440Mb8.LL, abstractC201949140d, str);
    }

    public static void LIZIZ(Function2 function2, AbstractC201949140d abstractC201949140d, String str) {
        int length;
        if (str != null && (length = str.length() / 4000) >= 0) {
            int i = 0;
            while (true) {
                int i2 = i * 4000;
                int i3 = i + 1;
                int length2 = i3 * 4000;
                if (length2 > str.length()) {
                    length2 = str.length();
                }
                if (i2 == length2) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("split log order ");
                sbLIZ.append(i3);
                sbLIZ.append(' ');
                sbLIZ.append(str.substring(i2, length2));
                function2.invoke(abstractC201949140d, C2188811AlT.LIZIZ(sbLIZ));
                if (i != length) {
                    i = i3;
                } else {
                    return;
                }
            }
        }
    }
}
