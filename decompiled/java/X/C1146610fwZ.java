package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146610fwZ extends AbstractC1146640fwc {
    public final C262100zr LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1146610fwZ) && Intrinsics.LJFF(this.LIZ, ((C1146610fwZ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsInteractionEvent(jsEvent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1146610fwZ(C262100zr c262100zr) {
        this.LIZ = c262100zr;
    }
}
