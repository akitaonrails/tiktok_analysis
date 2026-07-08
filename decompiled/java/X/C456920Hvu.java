package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456920Hvu extends AbstractC456780Hvg {
    public final Effect LIZIZ;
    public final File LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final double LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C456920Hvu)) {
            return false;
        }
        C456920Hvu c456920Hvu = (C456920Hvu) obj;
        return Intrinsics.LJFF(this.LIZIZ, c456920Hvu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c456920Hvu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c456920Hvu.LIZLLL) && Intrinsics.LJFF(this.LJ, c456920Hvu.LJ) && Double.compare(this.LJFF, c456920Hvu.LJFF) == 0 && this.LJI == c456920Hvu.LJI;
    }

    public final int hashCode() {
        return (((((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.X2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HasEffect(effect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", file=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hashQuery=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", searchSessionId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", weight=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", triggerTimeMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC456780Hvg
    public final long LIZ() {
        return this.LJI;
    }

    public C456920Hvu(Effect effect, File file, String str, String str2, double d, long j) {
        super(j);
        this.LIZIZ = effect;
        this.LIZJ = file;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = d;
        this.LJI = j;
    }
}
