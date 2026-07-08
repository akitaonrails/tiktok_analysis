package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kTR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320750kTR<T> implements InterfaceC1320070kSL<InterfaceC1320200kSY<T>> {
    public final List<InterfaceC1320070kSL<InterfaceC1320200kSY<T>>> LIZ;

    @Override // X.InterfaceC1320070kSL
    public final Object get() {
        return new C1320930kTj(this);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZIZ(this.LIZ, "list");
        return c1320100kSOLIZIZ.toString();
    }

    public C1320750kTR(List<InterfaceC1320070kSL<InterfaceC1320200kSY<T>>> list) {
        C1322350kW1.LIZ("List of suppliers is empty!", !((ArrayList) list).isEmpty());
        this.LIZ = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1320750kTR)) {
            return false;
        }
        return C1320090kSN.LIZ(this.LIZ, ((C1320750kTR) obj).LIZ);
    }
}
