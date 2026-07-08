package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C392001fi extends AbstractC392801fq {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ = "effect_message";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C392001fi)) {
            return false;
        }
        C392001fi c392001fi = (C392001fi) obj;
        return Intrinsics.LJFF(this.LIZ, c392001fi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c392001fi.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectMessage(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC392801fq
    public final String LIZ() {
        return this.LIZJ;
    }

    public C392001fi(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
