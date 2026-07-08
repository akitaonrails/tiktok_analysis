package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806190Vjt extends AbstractC806220Vjw {
    public final InterfaceC806180Vjs LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C806190Vjt) && Intrinsics.LJFF(this.LIZIZ, ((C806190Vjt) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Leaf(strategy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C806190Vjt(InterfaceC806180Vjs interfaceC806180Vjs) {
        this.LIZIZ = interfaceC806180Vjs;
    }
}
