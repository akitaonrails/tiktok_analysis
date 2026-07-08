package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.091z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23065091z {
    public final HorizontalEffectsModel LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23065091z)) {
            return false;
        }
        C23065091z c23065091z = (C23065091z) obj;
        return Intrinsics.LJFF(this.LIZ, c23065091z.LIZ) && this.LIZIZ == c23065091z.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizontalEffectsResult(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestDurationMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C23065091z(HorizontalEffectsModel horizontalEffectsModel, long j) {
        this.LIZ = horizontalEffectsModel;
        this.LIZIZ = j;
    }
}
