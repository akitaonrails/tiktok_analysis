package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.List;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08G1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08G1 {
    public static List LIZ(String str) {
        String strLJJJJZ = a0.LJJJJZ("#", str);
        if (strLJJJJZ.length() != 6 && strLJJJJZ.length() != 8) {
            return C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        if (strLJJJJZ.length() == 6) {
            String strSubstring = strLJJJJZ.substring(0, 2);
            CharsKt__CharJVMKt.checkRadix(16);
            float f = CastIntegerProtector.parseInt(strSubstring, 16) / 255.0f;
            String strSubstring2 = strLJJJJZ.substring(2, 4);
            CharsKt__CharJVMKt.checkRadix(16);
            float f2 = CastIntegerProtector.parseInt(strSubstring2, 16) / 255.0f;
            String strSubstring3 = strLJJJJZ.substring(4, 6);
            CharsKt__CharJVMKt.checkRadix(16);
            return C1697810uHb.LJIIJJI(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(CastIntegerProtector.parseInt(strSubstring3, 16) / 255.0f), Float.valueOf(1.0f));
        }
        String strSubstring4 = strLJJJJZ.substring(0, 2);
        CharsKt__CharJVMKt.checkRadix(16);
        float f3 = CastIntegerProtector.parseInt(strSubstring4, 16) / 255.0f;
        String strSubstring5 = strLJJJJZ.substring(2, 4);
        CharsKt__CharJVMKt.checkRadix(16);
        float f4 = CastIntegerProtector.parseInt(strSubstring5, 16) / 255.0f;
        String strSubstring6 = strLJJJJZ.substring(4, 6);
        CharsKt__CharJVMKt.checkRadix(16);
        float f5 = CastIntegerProtector.parseInt(strSubstring6, 16) / 255.0f;
        String strSubstring7 = strLJJJJZ.substring(6, 8);
        CharsKt__CharJVMKt.checkRadix(16);
        return C1697810uHb.LJIIJJI(Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(CastIntegerProtector.parseInt(strSubstring7, 16) / 255.0f), Float.valueOf(f3));
    }
}
