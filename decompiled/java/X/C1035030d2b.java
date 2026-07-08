package X;

import com.bytedance.ies.android.base.runtime.depend.IALogDepend;
import java.util.Map;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0d2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035030d2b {
    public static final C1035030d2b LIZ = new C1035030d2b();
    public static final C1007820cKi LIZIZ = C1007820cKi.LIZ;

    public static InterfaceC1007800cKg LIZ(InterfaceC1007800cKg... interfaceC1007800cKgArr) {
        if (interfaceC1007800cKgArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        InterfaceC1007800cKg c1023390cjp = interfaceC1007800cKgArr[0];
        C531650Kt9 it2 = new IntRange(1, interfaceC1007800cKgArr.length - 1).iterator();
        while (it2.LLILLL) {
            c1023390cjp = new C1023390cjp(c1023390cjp, interfaceC1007800cKgArr[it2.nextInt()]);
        }
        return c1023390cjp;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0d2c] */
    public static C1035040d2c LIZIZ(C1035030d2b c1035030d2b, final String str) {
        final IALogDepend iALogDepend = (IALogDepend) C2214471Bll.LJIIJ.LIZ();
        if (iALogDepend != null) {
            c1035030d2b.getClass();
            return new InterfaceC1007800cKg() { // from class: X.0d2c
                @Override // X.InterfaceC1007800cKg
                public final Map<String, Object> LIZ(C1196804mE c1196804mE, Map<String, Object> map, String str2) {
                    IALogDepend iALogDepend2 = iALogDepend;
                    String str3 = str;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(" = ");
                    sbLIZ.append(map);
                    iALogDepend2.d(str3, C2188811AlT.LIZIZ(sbLIZ));
                    return map;
                }
            };
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
