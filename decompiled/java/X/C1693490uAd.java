package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693490uAd extends C09AY implements Function1<Object, C1693480uAc> {
    public C1693490uAd() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1693480uAc invoke(Object obj) {
        C1692070u8L c1692070u8L;
        C1693820uBA c1693820uBA;
        C1682440tso c1682440tso;
        C1693390uAT c1693390uAT;
        C1693520uAg c1693520uAg;
        C1695380uDg c1695380uDg;
        C1693660uAu c1693660uAu;
        C1693860uBE c1693860uBE;
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        C1693790uB7 c1693790uB7 = null;
        if (obj2 != null) {
            c1692070u8L = (C1692070u8L) obj2;
        } else {
            c1692070u8L = null;
        }
        int i = c1692070u8L.LIZ;
        Object obj3 = ListProtector.get(list, 1);
        if (obj3 != null) {
            c1693820uBA = (C1693820uBA) obj3;
        } else {
            c1693820uBA = null;
        }
        int i2 = c1693820uBA.LIZ;
        Object obj4 = ListProtector.get(list, 2);
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        C1693740uB2 c1693740uB2 = C1693270uAH.LJIJ;
        Boolean bool = Boolean.FALSE;
        if ((Intrinsics.LJFF(obj4, bool) && !(c1693740uB2 instanceof InterfaceC1693850uBD)) || obj4 == null) {
            c1682440tso = null;
        } else {
            c1682440tso = (C1682440tso) c1693740uB2.LIZIZ(obj4);
        }
        long j = c1682440tso.LIZ;
        Object obj5 = ListProtector.get(list, 3);
        C1693390uAT c1693390uAT2 = C1693390uAT.LIZJ;
        C1687100u0K c1687100u0K = C1693270uAH.LJIIL;
        if ((Intrinsics.LJFF(obj5, bool) && !(c1687100u0K instanceof InterfaceC1693850uBD)) || obj5 == null) {
            c1693390uAT = null;
        } else {
            c1693390uAT = (C1693390uAT) c1687100u0K.LIZIZ(obj5);
        }
        Object obj6 = ListProtector.get(list, 4);
        C1687100u0K c1687100u0K2 = C1693780uB6.LIZ;
        if ((Intrinsics.LJFF(obj6, bool) && !(c1687100u0K2 instanceof InterfaceC1693850uBD)) || obj6 == null) {
            c1693520uAg = null;
        } else {
            c1693520uAg = (C1693520uAg) c1687100u0K2.LIZIZ(obj6);
        }
        Object obj7 = ListProtector.get(list, 5);
        C1687100u0K c1687100u0K3 = C1693270uAH.LJIL;
        if ((Intrinsics.LJFF(obj7, bool) && !(c1687100u0K3 instanceof InterfaceC1693850uBD)) || obj7 == null) {
            c1695380uDg = null;
        } else {
            c1695380uDg = (C1695380uDg) c1687100u0K3.LIZIZ(obj7);
        }
        Object obj8 = ListProtector.get(list, 6);
        C1687100u0K c1687100u0K4 = C1693780uB6.LIZIZ;
        if ((Intrinsics.LJFF(obj8, bool) && !(c1687100u0K4 instanceof InterfaceC1693850uBD)) || obj8 == null) {
            c1693660uAu = null;
        } else {
            c1693660uAu = (C1693660uAu) c1687100u0K4.LIZIZ(obj8);
        }
        int i3 = c1693660uAu.LIZ;
        Object obj9 = ListProtector.get(list, 7);
        if (obj9 != null) {
            c1693860uBE = (C1693860uBE) obj9;
        } else {
            c1693860uBE = null;
        }
        int i4 = c1693860uBE.LIZ;
        Object obj10 = ListProtector.get(list, 8);
        C1687100u0K c1687100u0K5 = C1693780uB6.LIZJ;
        if ((!Intrinsics.LJFF(obj10, bool) || (c1687100u0K5 instanceof InterfaceC1693850uBD)) && obj10 != null) {
            c1693790uB7 = (C1693790uB7) c1687100u0K5.LIZIZ(obj10);
        }
        return new C1693480uAc(i, i2, j, c1693390uAT, c1693520uAg, c1695380uDg, i3, i4, c1693790uB7);
    }
}
