package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682480tss extends C09AY implements Function1<Object, C1682440tso> {
    public C1682480tss() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1682440tso invoke(Object obj) {
        Float f;
        if (Intrinsics.LJFF(obj, Boolean.FALSE)) {
            return new C1682440tso(C1682440tso.LIZJ);
        }
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        C1682450tsp c1682450tsp = null;
        if (obj2 != null) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        float fFloatValue = f.floatValue();
        Object obj3 = ListProtector.get(list, 1);
        if (obj3 != null) {
            c1682450tsp = (C1682450tsp) obj3;
        }
        return new C1682440tso(C1682430tsn.LJFF(fFloatValue, c1682450tsp.LIZ));
    }
}
