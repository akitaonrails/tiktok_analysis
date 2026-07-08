package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0pGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504880pGQ {
    public static final String LIZIZ(String str) {
        if (str.length() == 0) {
            return "";
        }
        int length = (str.length() / 2) - 3;
        int i = length + 6;
        Pair pair = new Pair(str.substring(length, i), a0.LJJJJZI(length, i, str).toString());
        byte[] bytes = ((String) pair.getFirst()).getBytes(Charsets.UTF_8);
        byte[] bArrDecode = Base64.decode((String) pair.getSecond(), 0);
        byte[] bArr = new byte[bArrDecode.length];
        int length2 = bArrDecode.length;
        for (int i2 = 0; i2 < length2; i2++) {
            bArr[i2] = (byte) (bArrDecode[i2] ^ bytes[i2 % bytes.length]);
        }
        return new String(bArr, Charsets.UTF_8);
    }

    public static final String LIZ(Object obj, boolean z) {
        String name;
        String str;
        String strLIZIZ;
        if (z) {
            name = obj.getClass().getSimpleName();
        } else {
            name = obj.getClass().getName();
        }
        try {
            if (!a0.LJJIIZI(name, "Activity", false) && !a0.LJJIIZI(name, "Fragment", false) && !a0.LJJIIZI(name, "Page", false) && !a0.LJJIIZI(name, "Dialog", false) && !a0.LJJIIZI(name, "View", false) && !a0.LJJIIZI(name, "Panel", false) && !a0.LJJIIZI(name, "Sheet", false) && !a0.LJJIIZI(name, "Component", false) && !a0.LJJIIZI(name, "Widget", false)) {
                Field declaredField = obj.getClass().getDeclaredField("_pnsPageId");
                boolean z2 = true;
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (str == null) {
                    strLIZIZ = "";
                } else {
                    strLIZIZ = LIZIZ(str);
                }
                if (strLIZIZ.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    return "";
                }
                if (!z) {
                    return strLIZIZ;
                }
                String str2 = (String) C13LP.LJJLIIIJL(a0.LJJLIIIJILLIZJL(strLIZIZ, new String[]{e3.d}, 0, 6));
                if (str2 == null) {
                    return "";
                }
                return str2;
            }
            return name;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return name;
        }
    }
}
