package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627790sSf extends C05N3 {
    public final Effect LIZ;
    public final String LIZIZ;
    public final EnumC122700dN LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1627790sSf)) {
            return false;
        }
        C1627790sSf c1627790sSf = (C1627790sSf) obj;
        return Intrinsics.LJFF(this.LIZ, c1627790sSf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1627790sSf.LIZIZ) && this.LIZJ == c1627790sSf.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1627790sSf.LIZLLL);
    }

    public final int hashCode() {
        Effect effect = this.LIZ;
        int iHashCode = (((effect == null ? 0 : effect.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        EnumC122700dN enumC122700dN = this.LIZJ;
        return ((iHashCode + (enumC122700dN != null ? enumC122700dN.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenTrending(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", entryPoint=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1627790sSf(Effect effect, String str, EnumC122700dN enumC122700dN, String str2) {
        this.LIZ = effect;
        this.LIZIZ = str;
        this.LIZJ = enumC122700dN;
        this.LIZLLL = str2;
    }
}
