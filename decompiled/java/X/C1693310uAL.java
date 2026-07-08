package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693310uAL extends C09AY implements Function1<Object, C1692270u8f<? extends Object>> {
    public C1693310uAL() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1692270u8f<? extends Object> invoke(Object obj) {
        EnumC1693540uAi enumC1693540uAi;
        Integer num;
        Integer num2;
        String str;
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        String str2 = null;
        objLIZIZ = null;
        Object objLIZIZ = null;
        objLIZIZ = null;
        Object objLIZIZ2 = null;
        objLIZIZ = null;
        Object objLIZIZ3 = null;
        objLIZIZ = null;
        Object objLIZIZ4 = null;
        objLIZIZ = null;
        Object objLIZIZ5 = null;
        objLIZIZ = null;
        Object objLIZIZ6 = null;
        if (obj2 != null) {
            enumC1693540uAi = (EnumC1693540uAi) obj2;
        } else {
            enumC1693540uAi = null;
        }
        Object obj3 = ListProtector.get(list, 2);
        if (obj3 != null) {
            num = (Integer) obj3;
        } else {
            num = null;
        }
        int iIntValue = num.intValue();
        Object obj4 = ListProtector.get(list, 3);
        if (obj4 != null) {
            num2 = (Integer) obj4;
        } else {
            num2 = null;
        }
        int iIntValue2 = num2.intValue();
        Object obj5 = ListProtector.get(list, 4);
        if (obj5 != null) {
            str = (String) obj5;
        } else {
            str = null;
        }
        switch (enumC1693540uAi.ordinal()) {
            case 0:
                Object obj6 = ListProtector.get(list, 1);
                C1687100u0K c1687100u0K = C1693270uAH.LJII;
                if ((!Intrinsics.LJFF(obj6, Boolean.FALSE) || (c1687100u0K instanceof InterfaceC1693850uBD)) && obj6 != null) {
                    objLIZIZ = c1687100u0K.LIZIZ(obj6);
                }
                return new C1692270u8f<>(objLIZIZ, iIntValue, iIntValue2, str);
            case 1:
                Object obj7 = ListProtector.get(list, 1);
                C1687100u0K c1687100u0K2 = C1693270uAH.LJIIIIZZ;
                if ((!Intrinsics.LJFF(obj7, Boolean.FALSE) || (c1687100u0K2 instanceof InterfaceC1693850uBD)) && obj7 != null) {
                    objLIZIZ2 = c1687100u0K2.LIZIZ(obj7);
                }
                return new C1692270u8f<>(objLIZIZ2, iIntValue, iIntValue2, str);
            case 2:
                Object obj8 = ListProtector.get(list, 1);
                C1687100u0K c1687100u0K3 = C1693270uAH.LIZLLL;
                if ((!Intrinsics.LJFF(obj8, Boolean.FALSE) || (c1687100u0K3 instanceof InterfaceC1693850uBD)) && obj8 != null) {
                    objLIZIZ3 = c1687100u0K3.LIZIZ(obj8);
                }
                return new C1692270u8f<>(objLIZIZ3, iIntValue, iIntValue2, str);
            case 3:
                Object obj9 = ListProtector.get(list, 1);
                C1687100u0K c1687100u0K4 = C1693270uAH.LJ;
                if ((!Intrinsics.LJFF(obj9, Boolean.FALSE) || (c1687100u0K4 instanceof InterfaceC1693850uBD)) && obj9 != null) {
                    objLIZIZ4 = c1687100u0K4.LIZIZ(obj9);
                }
                return new C1692270u8f<>(objLIZIZ4, iIntValue, iIntValue2, str);
            case 4:
                Object obj10 = ListProtector.get(list, 1);
                C1687100u0K c1687100u0K5 = C1693270uAH.LJFF;
                if ((!Intrinsics.LJFF(obj10, Boolean.FALSE) || (c1687100u0K5 instanceof InterfaceC1693850uBD)) && obj10 != null) {
                    objLIZIZ5 = c1687100u0K5.LIZIZ(obj10);
                }
                return new C1692270u8f<>(objLIZIZ5, iIntValue, iIntValue2, str);
            case 5:
                Object obj11 = ListProtector.get(list, 1);
                C1687100u0K c1687100u0K6 = C1693270uAH.LJI;
                if ((!Intrinsics.LJFF(obj11, Boolean.FALSE) || (c1687100u0K6 instanceof InterfaceC1693850uBD)) && obj11 != null) {
                    objLIZIZ6 = c1687100u0K6.LIZIZ(obj11);
                }
                return new C1692270u8f<>(objLIZIZ6, iIntValue, iIntValue2, str);
            case 6:
                Object obj12 = ListProtector.get(list, 1);
                if (obj12 != null) {
                    str2 = (String) obj12;
                }
                return new C1692270u8f<>(new C1556440qba(str2), iIntValue, iIntValue2, str);
            default:
                throw new C1954807lC();
        }
    }
}
