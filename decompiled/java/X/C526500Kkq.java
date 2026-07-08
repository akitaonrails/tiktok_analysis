package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kkq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526500Kkq {
    public final List<TikTokMediaModel> LIZ;
    public final C375830EoP<Integer> LIZIZ;
    public final C375830EoP<List<TikTokMediaModel>> LIZJ;
    public final C375830EoP<Pair<TikTokMediaModel, InterfaceC526490Kkp>> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C526500Kkq)) {
            return false;
        }
        C526500Kkq c526500Kkq = (C526500Kkq) obj;
        return Intrinsics.LJFF(this.LIZ, c526500Kkq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c526500Kkq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c526500Kkq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c526500Kkq.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C375830EoP<Integer> c375830EoP = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<List<TikTokMediaModel>> c375830EoP2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        C375830EoP<Pair<TikTokMediaModel, InterfaceC526490Kkp>> c375830EoP3 = this.LIZLLL;
        return iHashCode3 + (c375830EoP3 != null ? c375830EoP3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumBottomSelectionListState(selectedList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scrollPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", refreshItems=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", refreshItem=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C526500Kkq(List<? extends TikTokMediaModel> list, C375830EoP<Integer> c375830EoP, C375830EoP<List<TikTokMediaModel>> c375830EoP2, C375830EoP<Pair<TikTokMediaModel, InterfaceC526490Kkp>> c375830EoP3) {
        this.LIZ = list;
        this.LIZIZ = c375830EoP;
        this.LIZJ = c375830EoP2;
        this.LIZLLL = c375830EoP3;
    }

    public static C526500Kkq LIZ(C526500Kkq c526500Kkq, List list, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, int i) {
        if ((i & 1) != 0) {
            list = c526500Kkq.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP = c526500Kkq.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP2 = c526500Kkq.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP3 = c526500Kkq.LIZLLL;
        }
        c526500Kkq.getClass();
        return new C526500Kkq(list, c375830EoP, c375830EoP2, c375830EoP3);
    }
}
