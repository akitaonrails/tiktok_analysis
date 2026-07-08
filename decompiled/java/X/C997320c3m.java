package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0c3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997320c3m<V, DEP> {
    public final Function1<DEP, V> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C997320c3m(Function1<? super DEP, ? extends V> function1) {
        this.LIZ = function1;
    }

    public final Object LIZ(InterfaceC1010530cP5 interfaceC1010530cP5) {
        return this.LIZ.invoke((DEP) interfaceC1010530cP5.Mh());
    }
}
