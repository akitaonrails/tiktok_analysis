package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C461501qv implements InterfaceC461401qu {
    public final Effect LIZ;
    public final EnumC122700dN LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C461501qv)) {
            return false;
        }
        C461501qv c461501qv = (C461501qv) obj;
        return Intrinsics.LJFF(this.LIZ, c461501qv.LIZ) && this.LIZIZ == c461501qv.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Selected(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C461501qv(Effect effect, EnumC122700dN enumC122700dN) {
        this.LIZ = effect;
        this.LIZIZ = enumC122700dN;
    }
}
