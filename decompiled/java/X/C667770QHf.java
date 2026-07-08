package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667770QHf implements InterfaceC663970Q2p {
    public final boolean LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final long LJI;
    public final long LJII;
    public final Word LJIIIIZZ;

    public C667770QHf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C667770QHf)) {
            return false;
        }
        C667770QHf c667770QHf = (C667770QHf) obj;
        return this.LIZ == c667770QHf.LIZ && this.LIZIZ == c667770QHf.LIZIZ && this.LIZJ == c667770QHf.LIZJ && Intrinsics.LJFF(this.LIZLLL, c667770QHf.LIZLLL) && Intrinsics.LJFF(this.LJ, c667770QHf.LJ) && Intrinsics.LJFF(this.LJFF, c667770QHf.LJFF) && this.LJI == c667770QHf.LJI && this.LJII == c667770QHf.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c667770QHf.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchClickSignalState(session_first_search=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", last_search_time=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", has_effective_click=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", last_group_id=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", last_search_source=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", last_search_query=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", last_group_id_play_time=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", total_play_time=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", cacheFirstWord=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C667770QHf(int i) {
        this(true, 0L, false, "", "", "", 0L, 0L, new Word());
    }

    public C667770QHf(boolean z, long j, boolean z2, String str, String str2, String str3, long j2, long j3, Word word) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = z2;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = j2;
        this.LJII = j3;
        this.LJIIIIZZ = word;
    }

    public static C667770QHf LIZ(C667770QHf c667770QHf, long j, boolean z, String str, String str2, String str3, long j2, long j3, Word word, int i) {
        boolean z2;
        Word word2 = word;
        long j4 = j3;
        long j5 = j2;
        String str4 = str2;
        String str5 = str;
        boolean z3 = z;
        String str6 = str3;
        long j6 = j;
        if ((i & 1) != 0) {
            z2 = c667770QHf.LIZ;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            j6 = c667770QHf.LIZIZ;
        }
        if ((i & 4) != 0) {
            z3 = c667770QHf.LIZJ;
        }
        if ((i & 8) != 0) {
            str5 = c667770QHf.LIZLLL;
        }
        if ((i & 16) != 0) {
            str4 = c667770QHf.LJ;
        }
        if ((i & 32) != 0) {
            str6 = c667770QHf.LJFF;
        }
        if ((i & 64) != 0) {
            j5 = c667770QHf.LJI;
        }
        if ((i & 128) != 0) {
            j4 = c667770QHf.LJII;
        }
        if ((i & 256) != 0) {
            word2 = c667770QHf.LJIIIIZZ;
        }
        c667770QHf.getClass();
        return new C667770QHf(z2, j6, z3, str5, str4, str6, j5, j4, word2);
    }
}
