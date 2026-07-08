package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03lP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C936903lP implements InterfaceC0148002o {
    public final List<String> LL;
    public final String LLILLJJLI;
    public final Image LLILLL;
    public final int LLILZ;
    public final C937203lS LLILZIL;
    public final C937003lQ LLILZLL;
    public final int LLIZ;
    public final Boolean LLIZLLLIL;
    public final Object LLJ;
    public final String LLJI;
    public final int LLJIJIL;

    public C936903lP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C936903lP)) {
            return false;
        }
        C936903lP c936903lP = (C936903lP) obj;
        return Intrinsics.LJFF(this.LL, c936903lP.LL) && Intrinsics.LJFF(this.LLILLJJLI, c936903lP.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c936903lP.LLILLL) && this.LLILZ == c936903lP.LLILZ && Intrinsics.LJFF(this.LLILZIL, c936903lP.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c936903lP.LLILZLL) && this.LLIZ == c936903lP.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c936903lP.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c936903lP.LLJ) && Intrinsics.LJFF(this.LLJI, c936903lP.LLJI) && this.LLJIJIL == c936903lP.LLJIJIL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.LLILLL;
        int iHashCode3 = (((((((((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31;
        Boolean bool = this.LLIZLLLIL;
        int iHashCode4 = (((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LLJ.hashCode()) * 31;
        String str2 = this.LLJI;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLJIJIL;
    }

    public final String toString() {
        return "SeaSkuSpecState(checkedSpecIds=" + this.LL + ", selectedSkuId=" + this.LLILLJJLI + ", currentImage=" + this.LLILLL + ", currentImagePosition=" + this.LLILZ + ", quantityInfo=" + this.LLILZIL + ", stockInfo=" + this.LLILZLL + ", skuRefreshType=" + this.LLIZ + ", keyBoardVisibility=" + this.LLIZLLLIL + ", forceRefreshKeyBoard=" + this.LLJ + ", textExpandChangedId=" + this.LLJI + ", textExpandRevision=" + this.LLJIJIL + ')';
    }

    public C936903lP(int i) {
        this(C13BV.INSTANCE, null, null, 0, new C937203lS(0), new C937003lQ(null, null, 7), 0, null, new Object(), null, 0);
    }

    public C936903lP(List<String> list, String str, Image image, int i, C937203lS c937203lS, C937003lQ c937003lQ, int i2, Boolean bool, Object obj, String str2, int i3) {
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = image;
        this.LLILZ = i;
        this.LLILZIL = c937203lS;
        this.LLILZLL = c937003lQ;
        this.LLIZ = i2;
        this.LLIZLLLIL = bool;
        this.LLJ = obj;
        this.LLJI = str2;
        this.LLJIJIL = i3;
    }

    public static C936903lP LIZ(C936903lP c936903lP, List list, String str, Image image, int i, C937203lS c937203lS, C937003lQ c937003lQ, int i2, Boolean bool, Object obj, String str2, int i3, int i4) {
        int i5 = i3;
        String str3 = str2;
        Object obj2 = obj;
        Boolean bool2 = bool;
        int i6 = i2;
        C937003lQ c937003lQ2 = c937003lQ;
        C937203lS c937203lS2 = c937203lS;
        int i7 = i;
        Image image2 = image;
        String str4 = str;
        List list2 = list;
        if ((i4 & 1) != 0) {
            list2 = c936903lP.LL;
        }
        if ((i4 & 2) != 0) {
            str4 = c936903lP.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            image2 = c936903lP.LLILLL;
        }
        if ((i4 & 8) != 0) {
            i7 = c936903lP.LLILZ;
        }
        if ((i4 & 16) != 0) {
            c937203lS2 = c936903lP.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            c937003lQ2 = c936903lP.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            i6 = c936903lP.LLIZ;
        }
        if ((i4 & 128) != 0) {
            bool2 = c936903lP.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            obj2 = c936903lP.LLJ;
        }
        if ((i4 & 512) != 0) {
            str3 = c936903lP.LLJI;
        }
        if ((i4 & 1024) != 0) {
            i5 = c936903lP.LLJIJIL;
        }
        c936903lP.getClass();
        return new C936903lP(list2, str4, image2, i7, c937203lS2, c937003lQ2, i6, bool2, obj2, str3, i5);
    }
}
