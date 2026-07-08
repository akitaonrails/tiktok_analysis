package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0feQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135360feQ {
    public final InterfaceC1135560fek LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1135360feQ) && Intrinsics.LJFF(this.LIZ, ((C1135360feQ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftMessageInterceptorContext(contextProvider=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1135360feQ(InterfaceC1135560fek interfaceC1135560fek) {
        this.LIZ = interfaceC1135560fek;
    }
}
