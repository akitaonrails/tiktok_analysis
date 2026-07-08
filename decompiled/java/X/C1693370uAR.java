package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693370uAR extends C09AY implements Function1<Object, C1693390uAT> {
    public C1693370uAR() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1693390uAT invoke(Object obj) {
        C1682440tso c1682440tso;
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        C1693740uB2 c1693740uB2 = C1693270uAH.LJIJ;
        Boolean bool = Boolean.FALSE;
        C1682440tso c1682440tso2 = null;
        if ((Intrinsics.LJFF(obj2, bool) && !(c1693740uB2 instanceof InterfaceC1693850uBD)) || obj2 == null) {
            c1682440tso = null;
        } else {
            c1682440tso = (C1682440tso) c1693740uB2.LIZIZ(obj2);
        }
        long j = c1682440tso.LIZ;
        Object obj3 = ListProtector.get(list, 1);
        if ((!Intrinsics.LJFF(obj3, bool) || (c1693740uB2 instanceof InterfaceC1693850uBD)) && obj3 != null) {
            c1682440tso2 = (C1682440tso) c1693740uB2.LIZIZ(obj3);
        }
        return new C1693390uAT(j, c1682440tso2.LIZ);
    }
}
