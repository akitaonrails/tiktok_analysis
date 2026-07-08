package X;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HVP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HVP implements InterfaceC0148002o {
    public final Boolean LL;
    public final C0HVI LLILLJJLI;
    public final C0HVW LLILLL;
    public final C0HVQ LLILZ;
    public final C291001Au<String> LLILZIL;
    public final Boolean LLILZLL;
    public final Integer LLIZ;
    public final C291001Au<CopyOnWriteArrayList<C0H7E>> LLIZLLLIL;
    public final C291001Au<Boolean> LLJ;
    public final Boolean LLJI;

    public C0HVP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HVP)) {
            return false;
        }
        C0HVP c0hvp = (C0HVP) obj;
        return Intrinsics.LJFF(this.LL, c0hvp.LL) && this.LLILLJJLI == c0hvp.LLILLJJLI && this.LLILLL == c0hvp.LLILLL && this.LLILZ == c0hvp.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0hvp.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0hvp.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0hvp.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0hvp.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0hvp.LLJ) && Intrinsics.LJFF(this.LLJI, c0hvp.LLJI);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C0HVI c0hvi = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c0hvi == null ? 0 : c0hvi.hashCode())) * 31;
        C0HVW c0hvw = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c0hvw == null ? 0 : c0hvw.hashCode())) * 31;
        C0HVQ c0hvq = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c0hvq == null ? 0 : c0hvq.hashCode())) * 31;
        C291001Au<String> c291001Au = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        Boolean bool2 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.LLIZ;
        int iHashCode7 = (((((iHashCode6 + (num == null ? 0 : num.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31;
        Boolean bool3 = this.LLJI;
        return iHashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalServiceAlbumVMState(albumPermissionDone=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", albumPermissionStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", takePhotoStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", currentStage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedAlbum=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showAllPhotos=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", currentPage=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", selectedPhotos=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", showToast=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", showAlbumPage=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0HVP(int i) {
        this(null, null, null, null, null, null, null, new C291001Au(null), new C291001Au(null), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0HVP(Boolean bool, C0HVI c0hvi, C0HVW c0hvw, C0HVQ c0hvq, C291001Au<String> c291001Au, Boolean bool2, Integer num, C291001Au<? extends CopyOnWriteArrayList<C0H7E>> c291001Au2, C291001Au<Boolean> c291001Au3, Boolean bool3) {
        this.LL = bool;
        this.LLILLJJLI = c0hvi;
        this.LLILLL = c0hvw;
        this.LLILZ = c0hvq;
        this.LLILZIL = c291001Au;
        this.LLILZLL = bool2;
        this.LLIZ = num;
        this.LLIZLLLIL = c291001Au2;
        this.LLJ = c291001Au3;
        this.LLJI = bool3;
    }

    public static C0HVP LIZ(C0HVP c0hvp, Boolean bool, C0HVI c0hvi, C0HVW c0hvw, C0HVQ c0hvq, C291001Au c291001Au, Boolean bool2, C291001Au c291001Au2, C291001Au c291001Au3, Boolean bool3, int i) {
        Integer num;
        Boolean bool4 = bool3;
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        Boolean bool5 = bool2;
        C291001Au c291001Au6 = c291001Au;
        C0HVQ c0hvq2 = c0hvq;
        C0HVW c0hvw2 = c0hvw;
        C0HVI c0hvi2 = c0hvi;
        Boolean bool6 = bool;
        if ((i & 1) != 0) {
            bool6 = c0hvp.LL;
        }
        if ((i & 2) != 0) {
            c0hvi2 = c0hvp.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c0hvw2 = c0hvp.LLILLL;
        }
        if ((i & 8) != 0) {
            c0hvq2 = c0hvp.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au6 = c0hvp.LLILZIL;
        }
        if ((i & 32) != 0) {
            bool5 = c0hvp.LLILZLL;
        }
        if ((i & 64) != 0) {
            num = c0hvp.LLIZ;
        } else {
            num = null;
        }
        if ((i & 128) != 0) {
            c291001Au5 = c0hvp.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au4 = c0hvp.LLJ;
        }
        if ((i & 512) != 0) {
            bool4 = c0hvp.LLJI;
        }
        c0hvp.getClass();
        return new C0HVP(bool6, c0hvi2, c0hvw2, c0hvq2, c291001Au6, bool5, num, c291001Au5, c291001Au4, bool4);
    }
}
