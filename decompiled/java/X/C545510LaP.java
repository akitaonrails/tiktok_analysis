package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LaP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545510LaP<T> extends AbstractC551020LjI<T> {
    public final Source LIZ;
    public final List<C544530LXf> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final T LJIIJ;

    public C545510LaP() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C545510LaP)) {
            return false;
        }
        C545510LaP c545510LaP = (C545510LaP) obj;
        return this.LIZ == c545510LaP.LIZ && Intrinsics.LJFF(this.LIZIZ, c545510LaP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c545510LaP.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c545510LaP.LIZLLL) && Intrinsics.LJFF(this.LJ, c545510LaP.LJ) && Intrinsics.LJFF(this.LJFF, c545510LaP.LJFF) && Intrinsics.LJFF(this.LJI, c545510LaP.LJI) && Intrinsics.LJFF(this.LJII, c545510LaP.LJII) && this.LJIIIIZZ == c545510LaP.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c545510LaP.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c545510LaP.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ) * 31;
        String str = this.LJIIIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t = this.LJIIJ;
        return iHashCode2 + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        return "AIGCWorkflowLegacyBasicInput(source=" + this.LIZ + ", inputItems=" + this.LIZIZ + ", businessScene=" + this.LIZJ + ", taskType=" + this.LIZLLL + ", reqKey=" + this.LJ + ", reqJson=" + this.LJFF + ", prompt=" + this.LJI + ", effectId=" + this.LJII + ", outputCount=" + this.LJIIIIZZ + ", extra=" + this.LJIIIZ + ", businessExtra=" + this.LJIIJ + ')';
    }

    @Override // X.AbstractC551020LjI
    public final T LIZ() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC551020LjI
    public final String LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC551020LjI
    public final String LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC551020LjI
    public final Source LIZLLL() {
        return this.LIZ;
    }

    @Override // X.AbstractC551020LjI
    public final String LJ() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C545510LaP(Source source, List list, String str, String str2, String str3, String str4, C550580Lia c550580Lia) {
        this.LIZ = source;
        this.LIZIZ = list;
        this.LIZJ = "effect_aigc";
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = "";
        this.LJII = str4;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = null;
        this.LJIIJ = c550580Lia;
    }
}
