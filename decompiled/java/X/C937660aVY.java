package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aVY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937660aVY extends AbstractC937680aVa {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C937660aVY)) {
            return false;
        }
        C937660aVY c937660aVY = (C937660aVY) obj;
        return Intrinsics.LJFF(this.LIZ, c937660aVY.LIZ) && this.LIZIZ == c937660aVY.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdatePlayToolRunningState(linkMicAbility=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isRunning=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C937660aVY(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
