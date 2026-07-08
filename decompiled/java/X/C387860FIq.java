package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387860FIq extends AbstractC387850FIp {
    public final Effect LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C387860FIq)) {
            return false;
        }
        C387860FIq c387860FIq = (C387860FIq) obj;
        return Intrinsics.LJFF(this.LIZ, c387860FIq.LIZ) && this.LIZIZ == c387860FIq.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C387860FIq(Effect effect, boolean z) {
        this.LIZ = effect;
        this.LIZIZ = z;
    }
}
