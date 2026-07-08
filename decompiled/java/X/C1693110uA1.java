package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693110uA1 extends C09AY implements Function1<Object, C1693060u9w> {
    public C1693110uA1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1693060u9w invoke(Object obj) {
        C1693450uAZ c1693450uAZ;
        C1693450uAZ c1693450uAZ2;
        C1693450uAZ c1693450uAZ3;
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        C1687100u0K c1687100u0K = C1693270uAH.LJIIIIZZ;
        Boolean bool = Boolean.FALSE;
        C1693450uAZ c1693450uAZ4 = null;
        if ((Intrinsics.LJFF(obj2, bool) && !(c1687100u0K instanceof InterfaceC1693850uBD)) || obj2 == null) {
            c1693450uAZ = null;
        } else {
            c1693450uAZ = (C1693450uAZ) c1687100u0K.LIZIZ(obj2);
        }
        Object obj3 = ListProtector.get(list, 1);
        if ((Intrinsics.LJFF(obj3, bool) && !(c1687100u0K instanceof InterfaceC1693850uBD)) || obj3 == null) {
            c1693450uAZ2 = null;
        } else {
            c1693450uAZ2 = (C1693450uAZ) c1687100u0K.LIZIZ(obj3);
        }
        Object obj4 = ListProtector.get(list, 2);
        if ((Intrinsics.LJFF(obj4, bool) && !(c1687100u0K instanceof InterfaceC1693850uBD)) || obj4 == null) {
            c1693450uAZ3 = null;
        } else {
            c1693450uAZ3 = (C1693450uAZ) c1687100u0K.LIZIZ(obj4);
        }
        Object obj5 = ListProtector.get(list, 3);
        if ((!Intrinsics.LJFF(obj5, bool) || (c1687100u0K instanceof InterfaceC1693850uBD)) && obj5 != null) {
            c1693450uAZ4 = (C1693450uAZ) c1687100u0K.LIZIZ(obj5);
        }
        return new C1693060u9w(c1693450uAZ, c1693450uAZ2, c1693450uAZ3, c1693450uAZ4);
    }
}
