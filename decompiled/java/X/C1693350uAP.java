package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693350uAP extends C09AY implements Function1<Object, C1694560uCM> {
    public C1693350uAP() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1694560uCM invoke(Object obj) {
        Object objLIZIZ;
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = ListProtector.get(list, i);
            C1687100u0K c1687100u0K = C1693270uAH.LJIJJLI;
            if ((Intrinsics.LJFF(obj2, Boolean.FALSE) && !(c1687100u0K instanceof InterfaceC1693850uBD)) || obj2 == null) {
                objLIZIZ = null;
            } else {
                objLIZIZ = c1687100u0K.LIZIZ(obj2);
            }
            arrayList.add(objLIZIZ);
        }
        return new C1694560uCM(arrayList);
    }
}
