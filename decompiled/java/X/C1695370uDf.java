package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695370uDf extends C09AY implements Function1<Object, C1695380uDg> {
    public C1695370uDf() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1695380uDg invoke(Object obj) {
        C1695360uDe c1695360uDe;
        C1695410uDj c1695410uDj;
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        C1695400uDi c1695400uDi = null;
        if (obj2 != null) {
            c1695360uDe = (C1695360uDe) obj2;
        } else {
            c1695360uDe = null;
        }
        float f = c1695360uDe.LIZ;
        Object obj3 = ListProtector.get(list, 1);
        if (obj3 != null) {
            c1695410uDj = (C1695410uDj) obj3;
        } else {
            c1695410uDj = null;
        }
        int i = c1695410uDj.LIZ;
        Object obj4 = ListProtector.get(list, 2);
        if (obj4 != null) {
            c1695400uDi = (C1695400uDi) obj4;
        }
        return new C1695380uDg(f, i, c1695400uDi.LIZ);
    }
}
