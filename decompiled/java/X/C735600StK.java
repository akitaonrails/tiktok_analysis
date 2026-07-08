package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0StK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735600StK {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConnectNowMobCallback(sayHiCallback=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", followCallback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", messageCallback=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C735600StK(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function03;
    }
}
