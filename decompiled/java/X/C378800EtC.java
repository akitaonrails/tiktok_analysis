package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378800EtC {
    public final C0ERA LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C378800EtC) && Intrinsics.LJFF(this.LIZ, ((C378800EtC) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionFormatHeaderStates(contextData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C378800EtC(C0ERA c0era) {
        this.LIZ = c0era;
    }
}
