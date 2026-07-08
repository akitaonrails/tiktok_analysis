package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693320uAM extends C09AY implements Function1<Object, C1693340uAO> {
    public C1693320uAM() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1693340uAO invoke(Object obj) {
        C1685910tyP c1685910tyP;
        C1378605aS c1378605aS;
        List list = (List) obj;
        Object obj2 = ListProtector.get(list, 0);
        int i = C1685910tyP.LJIIJJI;
        C1693740uB2 c1693740uB2 = C1693270uAH.LJIIZILJ;
        Boolean bool = Boolean.FALSE;
        Float f = null;
        if ((Intrinsics.LJFF(obj2, bool) && !(c1693740uB2 instanceof InterfaceC1693850uBD)) || obj2 == null) {
            c1685910tyP = null;
        } else {
            c1685910tyP = (C1685910tyP) c1693740uB2.LIZIZ(obj2);
        }
        long j = c1685910tyP.LIZ;
        Object obj3 = ListProtector.get(list, 1);
        C1693740uB2 c1693740uB22 = C1693270uAH.LJIJI;
        if ((Intrinsics.LJFF(obj3, bool) && !(c1693740uB22 instanceof InterfaceC1693850uBD)) || obj3 == null) {
            c1378605aS = null;
        } else {
            c1378605aS = (C1378605aS) c1693740uB22.LIZIZ(obj3);
        }
        long j2 = c1378605aS.LIZ;
        Object obj4 = ListProtector.get(list, 2);
        if (obj4 != null) {
            f = (Float) obj4;
        }
        return new C1693340uAO(f.floatValue(), j, j2);
    }
}
