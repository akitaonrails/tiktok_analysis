package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.048p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10497048p extends AbstractC10502048u {
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10497048p) && Intrinsics.LJFF(this.LIZIZ, ((C10497048p) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpInterestItemTextData(text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C10497048p(String str) {
        super(EnumC10498048q.TEXT);
        this.LIZIZ = str;
    }
}
