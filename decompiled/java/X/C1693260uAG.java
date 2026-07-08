package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693260uAG extends C09AY implements Function1<Object, C1692220u8a> {
    public C1693260uAG() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1692220u8a invoke(Object obj) {
        List list;
        List list2 = (List) obj;
        Object obj2 = ListProtector.get(list2, 1);
        C1687100u0K c1687100u0K = C1693270uAH.LIZIZ;
        String str = null;
        if ((Intrinsics.LJFF(obj2, Boolean.FALSE) && !(c1687100u0K instanceof InterfaceC1693850uBD)) || obj2 == null) {
            list = null;
        } else {
            list = (List) c1687100u0K.LIZIZ(obj2);
        }
        Object obj3 = ListProtector.get(list2, 0);
        if (obj3 != null) {
            str = (String) obj3;
        }
        return new C1692220u8a((List<? extends C1692270u8f<? extends InterfaceC1692820u9Y>>) list, str);
    }
}
