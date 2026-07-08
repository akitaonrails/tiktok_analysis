package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C040900Cp {
    public final EnumC040800Co LIZ;
    public final String LIZIZ;

    public C040900Cp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C040900Cp)) {
            return false;
        }
        C040900Cp c040900Cp = (C040900Cp) obj;
        return this.LIZ == c040900Cp.LIZ && Intrinsics.LJFF(this.LIZIZ, c040900Cp.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaModelModifyState(mediaModelState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", epAIGCId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C040900Cp(int i) {
        this(EnumC040800Co.DEFAULT, "");
    }

    public C040900Cp(EnumC040800Co enumC040800Co, String str) {
        this.LIZ = enumC040800Co;
        this.LIZIZ = str;
    }
}
