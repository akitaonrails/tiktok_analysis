package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05WE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05WE {
    public final Effect LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05WE)) {
            return false;
        }
        C05WE c05we = (C05WE) obj;
        return Intrinsics.LJFF(this.LIZ, c05we.LIZ) && Intrinsics.LJFF(this.LIZIZ, c05we.LIZIZ) && this.LIZJ == c05we.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResDownloadedInfo(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isUseCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05WE(Effect effect, String str, boolean z) {
        this.LIZ = effect;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
