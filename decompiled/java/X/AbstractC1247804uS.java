package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04uS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1247804uS {
    public String toString() {
        if (Intrinsics.LJFF(this, C1247704uR.LIZ)) {
            return "Init";
        }
        if (!(this instanceof C1247604uQ)) {
            throw new C1954807lC();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Control(apiId: ");
        sbLIZ.append(((C1247604uQ) this).LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
