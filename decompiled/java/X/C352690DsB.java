package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352690DsB {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C352690DsB)) {
            return false;
        }
        C352690DsB c352690DsB = (C352690DsB) obj;
        return Intrinsics.LJFF(this.LIZ, c352690DsB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c352690DsB.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayerItemEffectInfo(effectResId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panelName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C352690DsB(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
