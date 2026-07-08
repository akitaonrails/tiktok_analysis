package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596080NZm implements InterfaceC0148002o {
    public final AbstractC621770Oa7 LL;

    public C596080NZm() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C596080NZm) && Intrinsics.LJFF(this.LL, ((C596080NZm) obj).LL);
    }

    public final int hashCode() {
        AbstractC621770Oa7 abstractC621770Oa7 = this.LL;
        if (abstractC621770Oa7 == null) {
            return 0;
        }
        return abstractC621770Oa7.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECPhotoSearchBubbleState(state=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C596080NZm(AbstractC621770Oa7 abstractC621770Oa7) {
        this.LL = abstractC621770Oa7;
    }
}
