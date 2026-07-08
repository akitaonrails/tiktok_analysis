package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693090u9z extends C09AY implements Function1<Object, C1693020u9s> {
    public C1693090u9z() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1693020u9s invoke(Object obj) {
        String str;
        C1693060u9w c1693060u9w;
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        if (obj2 != null) {
            str = (String) obj2;
        } else {
            str = null;
        }
        Object obj3 = ListProtector.get(list, 1);
        C1687100u0K c1687100u0K = C1693270uAH.LJIIIZ;
        if ((Intrinsics.LJFF(obj3, Boolean.FALSE) && !(c1687100u0K instanceof InterfaceC1693850uBD)) || obj3 == null) {
            c1693060u9w = null;
        } else {
            c1693060u9w = (C1693060u9w) c1687100u0K.LIZIZ(obj3);
        }
        return new C1693020u9s(str, c1693060u9w, null);
    }
}
