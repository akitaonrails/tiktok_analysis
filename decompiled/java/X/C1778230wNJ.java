package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wNJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778230wNJ extends AbstractC1778220wNI {
    public final Long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1778230wNJ) && Intrinsics.LJFF(this.LIZIZ, ((C1778230wNJ) obj).LIZIZ);
    }

    public final int hashCode() {
        Long l = this.LIZIZ;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterRecord(actualTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778230wNJ(Long l) {
        super(EnumC1778330wNT.ENTER_RECORD);
        this.LIZIZ = l;
    }
}
