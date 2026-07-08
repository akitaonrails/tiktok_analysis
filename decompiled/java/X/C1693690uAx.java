package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693690uAx extends C09AY implements Function1<Object, C1692280u8g> {
    public C1693690uAx() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1692280u8g invoke(Object obj) {
        Integer num;
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        Integer num2 = null;
        if (obj2 != null) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        int iIntValue = num.intValue();
        Object obj3 = ListProtector.get(list, 1);
        if (obj3 != null) {
            num2 = (Integer) obj3;
        }
        return new C1692280u8g(C1680680tpy.LIZ(iIntValue, num2.intValue()));
    }
}
