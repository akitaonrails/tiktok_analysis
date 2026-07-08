package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kSV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320170kSV<T> implements InterfaceC1320070kSL<InterfaceC1320200kSY<T>> {
    public final List<InterfaceC1320070kSL<InterfaceC1320200kSY<T>>> LIZ;
    public final boolean LIZIZ;

    @Override // X.InterfaceC1320070kSL
    public final Object get() {
        return new C1320180kSW(this);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZIZ(this.LIZ, "list");
        return c1320100kSOLIZIZ.toString();
    }

    public C1320170kSV(List list) {
        C1322350kW1.LIZ("List of suppliers is empty!", !((ArrayList) list).isEmpty());
        this.LIZ = list;
        this.LIZIZ = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1320170kSV)) {
            return false;
        }
        return C1320090kSN.LIZ(this.LIZ, ((C1320170kSV) obj).LIZ);
    }
}
