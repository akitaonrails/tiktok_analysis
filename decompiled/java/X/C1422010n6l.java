package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422010n6l extends AbstractC1406770miB {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Effect LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1422010n6l)) {
            return false;
        }
        C1422010n6l c1422010n6l = (C1422010n6l) obj;
        return Intrinsics.LJFF(this.LIZ, c1422010n6l.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1422010n6l.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1422010n6l.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1422010n6l.LIZLLL) && this.LJ == c1422010n6l.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropShow(searchMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", panelUnfold=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", effect=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1422010n6l(int i, Effect effect, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = effect;
        this.LJ = i;
    }
}
