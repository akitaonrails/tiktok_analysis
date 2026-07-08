package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ttP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682810ttP extends C09AY implements Function1<Object, C1685910tyP> {
    public C1682810ttP() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1685910tyP invoke(Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.FALSE)) {
            return new C1685910tyP(C1685910tyP.LJIIJ);
        }
        return new C1685910tyP(C1685850tyJ.LIZIZ(((Integer) obj).intValue()));
    }
}
