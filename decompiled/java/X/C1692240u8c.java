package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0u8c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692240u8c {
    public static final int LIZ(int i, List list) {
        int i2;
        int i3 = ((C1692260u8e) C13LP.LJJLIIIJJI(list)).LIZJ;
        if (i > ((C1692260u8e) C13LP.LJJLIIIJJI(list)).LIZJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Index ");
            sbLIZ.append(i);
            sbLIZ.append(" should be less or equal than last line's end ");
            sbLIZ.append(i3);
            C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= size) {
                i2 = (i4 + size) >>> 1;
                C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(list, i2);
                if (c1692260u8e.LIZIZ > i) {
                    size = i2 - 1;
                } else {
                    if (c1692260u8e.LIZJ > i) {
                        break;
                    }
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        if (i2 >= 0 && i2 < arrayList.size()) {
            return i2;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Found paragraph index ");
        sbLIZ2.append(i2);
        sbLIZ2.append(" should be in range [0, ");
        sbLIZ2.append(arrayList.size());
        sbLIZ2.append(").\nDebug info: index=");
        sbLIZ2.append(i);
        sbLIZ2.append(", paragraphs=[");
        sbLIZ2.append(C09RP.LIZ(list, null, AFwS266S0000000_25.get$arr$(608), 31));
        sbLIZ2.append(']');
        C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return i2;
    }

    public static final int LIZIZ(int i, List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(arrayList, i3);
            if (c1692260u8e.LIZLLL > i) {
                size = i3 - 1;
            } else if (c1692260u8e.LJ <= i) {
                i2 = i3 + 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int LIZJ(List<C1692260u8e> list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((C1692260u8e) C13LP.LJJLIIIJJI(list)).LJI) {
            return ((ArrayList) list).size() - 1;
        }
        int size = ((ArrayList) list).size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(list, i2);
            if (c1692260u8e.LJFF > f) {
                size = i2 - 1;
            } else if (c1692260u8e.LJI <= f) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static final void LIZLLL(List<C1692260u8e> list, long j, Function1<? super C1692260u8e, Unit> function1) {
        int size = ((ArrayList) list).size();
        for (int iLIZ = LIZ(C1692280u8g.LJI(j), list); iLIZ < size; iLIZ++) {
            C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(list, iLIZ);
            if (c1692260u8e.LIZIZ < C1692280u8g.LJFF(j)) {
                if (c1692260u8e.LIZIZ != c1692260u8e.LIZJ) {
                    function1.invoke(c1692260u8e);
                }
            } else {
                return;
            }
        }
    }
}
