package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448390nnJ extends AbstractC1448380nnI {
    public final Effect LIZ;
    public final EnumC1641530sop LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1448390nnJ)) {
            return false;
        }
        C1448390nnJ c1448390nnJ = (C1448390nnJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1448390nnJ.LIZ) && this.LIZIZ == c1448390nnJ.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowNew(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", warning=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1448390nnJ(Effect effect, EnumC1641530sop enumC1641530sop) {
        this.LIZ = effect;
        this.LIZIZ = enumC1641530sop;
    }
}
