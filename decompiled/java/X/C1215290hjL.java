package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215290hjL implements InterfaceC0148002o {
    public final C291001Au<MusicAwemeList> LL;
    public final C291001Au<Integer> LLILLJJLI;
    public final C291001Au<List<Aweme>> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1215290hjL)) {
            return false;
        }
        C1215290hjL c1215290hjL = (C1215290hjL) obj;
        return Intrinsics.LJFF(this.LL, c1215290hjL.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1215290hjL.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1215290hjL.LLILLL);
    }

    public final int hashCode() {
        C291001Au<MusicAwemeList> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Integer> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<List<Aweme>> c291001Au3 = this.LLILLL;
        return iHashCode2 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicAwemeListState(musicAwemeList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", focusBtnAnimation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", allThreeColumnsAwemeList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1215290hjL(C291001Au<? extends MusicAwemeList> c291001Au, C291001Au<Integer> c291001Au2, C291001Au<? extends List<? extends Aweme>> c291001Au3) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
    }

    public static C1215290hjL LIZ(C1215290hjL c1215290hjL, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1215290hjL.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1215290hjL.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c1215290hjL.LLILLL;
        }
        c1215290hjL.getClass();
        return new C1215290hjL(c291001Au, c291001Au2, c291001Au3);
    }
}
