package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.ToIntFunction;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.1303, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1303 {
    public static final Logger LIZ = Logger.getLogger(AnonymousClass1303.class.getName());
    public static final int[] LIZIZ = new int[0];
    public static final AnonymousClass1301[] LIZJ = new AnonymousClass1301[0];
    public static final C19939112zt[] LIZLLL = new C19939112zt[0];
    public static final C199422130y[] LJ = new C199422130y[0];
    public static final AnonymousClass1305[] LJFF = new AnonymousClass1305[0];
    public static final C19939212zu[] LJI = new C19939212zu[0];
    public static final ConcurrentHashMap<C199437131n, C199437131n> LJII = new ConcurrentHashMap<>();
    public static volatile C132M LJIIIIZZ = null;

    public static String LIZIZ(AnonymousClass1302 anonymousClass1302, AnonymousClass1301 anonymousClass1301, String str) {
        if (anonymousClass1301 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anonymousClass1301.LLILZ);
            sbLIZ.append('.');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        String str2 = anonymousClass1302.LLILLJJLI.getPackage();
        if (!str2.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append('.');
            sbLIZ2.append(str);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return str;
    }

    public static <T> T LIZ(T[] tArr, int i, ToIntFunction<T> toIntFunction, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            T t = tArr[i5];
            int iApplyAsInt = toIntFunction.applyAsInt(t);
            if (i2 < iApplyAsInt) {
                i3 = i5 - 1;
            } else if (i2 > iApplyAsInt) {
                i4 = i5 + 1;
            } else {
                return t;
            }
        }
        return null;
    }
}
