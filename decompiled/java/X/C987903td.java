package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C987903td {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C987903td)) {
            return false;
        }
        C987903td c987903td = (C987903td) obj;
        return Intrinsics.LJFF(this.LIZ, c987903td.LIZ) && Intrinsics.LJFF(this.LIZIZ, c987903td.LIZIZ);
    }

    public final EnumC955203oM LIZ() {
        return Intrinsics.LJFF(this.LIZ, "ttf") ? EnumC955203oM.TTF : EnumC955203oM.TTS;
    }

    public final int LIZIZ() {
        return Intrinsics.LJFF(this.LIZ, "ttf") ? 2 : 0;
    }

    public final int LIZJ() {
        return Intrinsics.LJFF(this.LIZIZ, "us") ? EnumC969503qf.TTS_US_PRODUCT_DETAIL.getTemplate() : EnumC969503qf.DEFAULT.getTemplate();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" - ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C987903td(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
