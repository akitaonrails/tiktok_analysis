package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u0I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687080u0I extends C09AY implements Function1<Object, C1686970u07> {
    public C1687080u0I() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1686970u07 invoke(Object obj) {
        C1692220u8a c1692220u8a;
        C1692280u8g c1692280u8g;
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        C1687100u0K c1687100u0K = C1693270uAH.LIZ;
        Boolean bool = Boolean.FALSE;
        if ((Intrinsics.LJFF(obj2, bool) && !(c1687100u0K instanceof InterfaceC1693850uBD)) || obj2 == null) {
            c1692220u8a = null;
        } else {
            c1692220u8a = (C1692220u8a) c1687100u0K.LIZIZ(obj2);
        }
        Object obj3 = ListProtector.get(list, 1);
        int i = C1692280u8g.LIZJ;
        C1687100u0K c1687100u0K2 = C1693270uAH.LJIILL;
        if ((Intrinsics.LJFF(obj3, bool) && !(c1687100u0K2 instanceof InterfaceC1693850uBD)) || obj3 == null) {
            c1692280u8g = null;
        } else {
            c1692280u8g = (C1692280u8g) c1687100u0K2.LIZIZ(obj3);
        }
        return new C1686970u07(c1692220u8a, c1692280u8g.LIZ, (C1692280u8g) null);
    }
}
