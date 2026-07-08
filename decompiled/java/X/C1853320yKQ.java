package X;

import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853320yKQ implements InterfaceC0148002o {
    public final C1853460yKe LL;
    public final List<C1853460yKe> LLILLJJLI;
    public final C291001Au<C1853870yLJ> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Integer> LLILZIL;
    public final C291001Au<List<TikTokMediaModel>> LLILZLL;
    public final C291001Au<C1853460yKe> LLIZ;
    public final C291001Au<C1853710yL3> LLIZLLLIL;
    public final C291001Au<C1853710yL3> LLJ;
    public final int LLJI;
    public final boolean LLJIJIL;

    public C1853320yKQ() {
        this(0, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1853320yKQ)) {
            return false;
        }
        C1853320yKQ c1853320yKQ = (C1853320yKQ) obj;
        return Intrinsics.LJFF(this.LL, c1853320yKQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1853320yKQ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1853320yKQ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1853320yKQ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1853320yKQ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1853320yKQ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1853320yKQ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1853320yKQ.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1853320yKQ.LLJ) && this.LLJI == c1853320yKQ.LLJI && this.LLJIJIL == c1853320yKQ.LLJIJIL;
    }

    public final int hashCode() {
        C1853460yKe c1853460yKe = this.LL;
        int iHashCode = (((((((((((c1853460yKe == null ? 0 : c1853460yKe.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        C291001Au<C1853460yKe> c291001Au = this.LLIZ;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C1853710yL3> c291001Au2 = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<C1853710yL3> c291001Au3 = this.LLJ;
        return ((((iHashCode3 + (c291001Au3 != null ? c291001Au3.hashCode() : 0)) * 31) + this.LLJI) * 31) + C786410Ut5.Z2(this.LLJIJIL);
    }

    public final String toString() {
        return "TemplateListState(selectTemplateItem=" + this.LL + ", templateItemList=" + this.LLILLJJLI + ", onPicSelectFinished=" + this.LLILLL + ", onGalleryClose=" + this.LLILZ + ", onPicSelectBegin=" + this.LLILZIL + ", onPicSelectFinishedCommonMode=" + this.LLILZLL + ", scrollToTemplateItem=" + this.LLIZ + ", returnTakoToEditPrompt=" + this.LLIZLLLIL + ", returnTakoToCreate=" + this.LLJ + ", maskForVideoPlay=" + this.LLJI + ", videoPlayEvent=" + this.LLJIJIL + ')';
    }

    public C1853320yKQ(int i, int i2) {
        C13BV c13bv;
        C291001Au c291001Au;
        C291001Au c291001Au2;
        C291001Au c291001Au3;
        C291001Au c291001Au4;
        boolean z;
        int i3 = i;
        if ((i2 & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i2 & 4) != 0) {
            c291001Au = new C291001Au(null);
        } else {
            c291001Au = null;
        }
        if ((i2 & 8) != 0) {
            c291001Au2 = new C291001Au(Boolean.FALSE);
        } else {
            c291001Au2 = null;
        }
        if ((i2 & 16) != 0) {
            c291001Au3 = new C291001Au(-1);
        } else {
            c291001Au3 = null;
        }
        if ((i2 & 32) != 0) {
            c291001Au4 = new C291001Au(null);
        } else {
            c291001Au4 = null;
        }
        i3 = (i2 & 512) != 0 ? 0 : i3;
        if ((i2 & 1024) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(null, c13bv, c291001Au, c291001Au2, c291001Au3, c291001Au4, null, null, null, i3, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1853320yKQ(C1853460yKe c1853460yKe, List<C1853460yKe> list, C291001Au<C1853870yLJ> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Integer> c291001Au3, C291001Au<? extends List<TikTokMediaModel>> c291001Au4, C291001Au<C1853460yKe> c291001Au5, C291001Au<C1853710yL3> c291001Au6, C291001Au<C1853710yL3> c291001Au7, int i, boolean z) {
        this.LL = c1853460yKe;
        this.LLILLJJLI = list;
        this.LLILLL = c291001Au;
        this.LLILZ = c291001Au2;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = c291001Au4;
        this.LLIZ = c291001Au5;
        this.LLIZLLLIL = c291001Au6;
        this.LLJ = c291001Au7;
        this.LLJI = i;
        this.LLJIJIL = z;
    }

    public static C1853320yKQ LIZ(C1853320yKQ c1853320yKQ, C1853460yKe c1853460yKe, List list, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, int i, boolean z, int i2) {
        C291001Au<C1853460yKe> c291001Au7;
        boolean z2 = z;
        int i3 = i;
        C291001Au c291001Au8 = c291001Au6;
        C291001Au c291001Au9 = c291001Au5;
        C291001Au c291001Au10 = c291001Au4;
        C291001Au c291001Au11 = c291001Au3;
        C291001Au c291001Au12 = c291001Au2;
        C291001Au c291001Au13 = c291001Au;
        List list2 = list;
        C1853460yKe c1853460yKe2 = c1853460yKe;
        if ((i2 & 1) != 0) {
            c1853460yKe2 = c1853320yKQ.LL;
        }
        if ((i2 & 2) != 0) {
            list2 = c1853320yKQ.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            c291001Au13 = c1853320yKQ.LLILLL;
        }
        if ((i2 & 8) != 0) {
            c291001Au12 = c1853320yKQ.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c291001Au11 = c1853320yKQ.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            c291001Au10 = c1853320yKQ.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            c291001Au7 = c1853320yKQ.LLIZ;
        } else {
            c291001Au7 = null;
        }
        if ((i2 & 128) != 0) {
            c291001Au9 = c1853320yKQ.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            c291001Au8 = c1853320yKQ.LLJ;
        }
        if ((i2 & 512) != 0) {
            i3 = c1853320yKQ.LLJI;
        }
        if ((i2 & 1024) != 0) {
            z2 = c1853320yKQ.LLJIJIL;
        }
        c1853320yKQ.getClass();
        return new C1853320yKQ(c1853460yKe2, list2, c291001Au13, c291001Au12, c291001Au11, c291001Au10, c291001Au7, c291001Au9, c291001Au8, i3, z2);
    }
}
