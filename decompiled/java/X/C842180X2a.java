package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okio.ByteString;

/* JADX INFO: renamed from: X.0X2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842180X2a {
    static {
        ByteString.encodeUtf8("\"\\");
        ByteString.encodeUtf8("\t ,=");
    }

    public static long LIZ(C0XLY c0xly) {
        String strLIZLLL = c0xly.LLILZLL.LIZLLL("Content-Length");
        if (strLIZLLL != null) {
            try {
                return CastLongProtector.parseLong(strLIZLLL);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return -1L;
            }
        }
        return -1L;
    }

    public static boolean LIZIZ(C0XLY c0xly) {
        if (c0xly.LL.method().equals("HEAD")) {
            return false;
        }
        int i = c0xly.LLILLL;
        if (i >= 100 && ((i < 200 || i == 204 || i == 304) && LIZ(c0xly) == -1 && !"chunked".equalsIgnoreCase(c0xly.LIZ("Transfer-Encoding", null)))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [long] */
    public static int LIZJ(int i, String str) {
        try {
            i = CastLongProtector.parseLong(str);
            if (i > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (i < 0) {
                return 0;
            }
            return (int) i;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    public static void LIZLLL(C0X2Z c0x2z, C0XLQ c0xlq, C0X1V c0x1v) {
        List<C842190X2b> listEmptyList;
        if (c0x2z == C0X2Z.LIZ) {
            return;
        }
        Pattern pattern = C842190X2b.LJIIIZ;
        List<String> listLJIIJJI = c0x1v.LJIIJJI("Set-Cookie");
        int size = listLJIIJJI.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C842190X2b c842190X2bLIZIZ = C842190X2b.LIZIZ(c0xlq, (String) ListProtector.get(listLJIIJJI, i));
            if (c842190X2bLIZIZ != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c842190X2bLIZIZ);
            }
        }
        if (arrayList != null) {
            listEmptyList = Collections.unmodifiableList(arrayList);
        } else {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        c0x2z.LIZIZ(c0xlq, listEmptyList);
    }

    public static int LJ(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }
}
