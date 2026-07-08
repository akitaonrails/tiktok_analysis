package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05hE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1420605hE {
    public final Effect LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1420605hE)) {
            return false;
        }
        C1420605hE c1420605hE = (C1420605hE) obj;
        return Intrinsics.LJFF(this.LIZ, c1420605hE.LIZ) && this.LIZIZ == c1420605hE.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1420605hE.LIZJ);
    }

    public final int hashCode() {
        Effect effect = this.LIZ;
        int iHashCode = (((effect == null ? 0 : effect.hashCode()) * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchEffectResult(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lyricCoverUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1420605hE(Effect effect, int i, String str, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        str = (i2 & 4) != 0 ? null : str;
        this.LIZ = effect;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
