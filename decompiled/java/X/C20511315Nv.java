package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20511315Nv implements InterfaceC1891350zJl {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Image LLILZLL;
    public final SalePropTag LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final Integer LLJILJILJ;
    public final Integer LLJILLL;
    public final int LLJJ;
    public final InterfaceC20511615Ny LLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20511315Nv)) {
            return false;
        }
        C20511315Nv c20511315Nv = (C20511315Nv) obj;
        return this.LL == c20511315Nv.LL && this.LLILLJJLI == c20511315Nv.LLILLJJLI && this.LLILLL == c20511315Nv.LLILLL && Intrinsics.LJFF(this.LLILZ, c20511315Nv.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c20511315Nv.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c20511315Nv.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c20511315Nv.LLIZ) && this.LLIZLLLIL == c20511315Nv.LLIZLLLIL && this.LLJ == c20511315Nv.LLJ && this.LLJI == c20511315Nv.LLJI && this.LLJIJIL == c20511315Nv.LLJIJIL && this.LLJILJIL == c20511315Nv.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c20511315Nv.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c20511315Nv.LLJILLL) && this.LLJJ == c20511315Nv.LLJJ && Intrinsics.LJFF(this.LLJJI, c20511315Nv.LLJJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = ((((((((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        Image image = this.LLILZLL;
        int iHashCode = (iZ2 + (image == null ? 0 : image.hashCode())) * 31;
        SalePropTag salePropTag = this.LLIZ;
        int iHashCode2 = (((((((((((iHashCode + (salePropTag == null ? 0 : salePropTag.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI) * 31) + this.LLJIJIL) * 31) + this.LLJILJIL) * 31;
        Integer num = this.LLJILJILJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJILLL;
        return ((((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LLJJ) * 31) + this.LLJJI.hashCode();
    }

    public final String toString() {
        return "SeaSkuImageSpecItemVO(groupIndex=" + this.LL + ", valueIndex=" + this.LLILLJJLI + ", hasInit=" + this.LLILLL + ", id=" + this.LLILZ + ", text=" + this.LLILZIL + ", image=" + this.LLILZLL + ", salePropTag=" + this.LLIZ + ", hasStock=" + this.LLIZLLLIL + ", isSelected=" + this.LLJ + ", textMaxWidth=" + this.LLJI + ", specTextMaxLines=" + this.LLJIJIL + ", specTextViewHeight=" + this.LLJILJIL + ", specTextContainerHeight=" + this.LLJILJILJ + ", benefitTextViewHeight=" + this.LLJILLL + ", sizeType=" + this.LLJJ + ", clickListener=" + this.LLJJI + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        if (!(interfaceC1891350zJl instanceof C20511315Nv)) {
            return false;
        }
        C20511315Nv c20511315Nv = (C20511315Nv) interfaceC1891350zJl;
        if (c20511315Nv.LL != this.LL || c20511315Nv.LLILLJJLI != this.LLILLJJLI || c20511315Nv.LLILLL != this.LLILLL || !Intrinsics.LJFF(c20511315Nv.LLILZ, this.LLILZ) || c20511315Nv.LLIZLLLIL != this.LLIZLLLIL || c20511315Nv.LLJ != this.LLJ || c20511315Nv.LLJI != this.LLJI || c20511315Nv.LLJIJIL != this.LLJIJIL || c20511315Nv.LLJILJIL != this.LLJILJIL || !Intrinsics.LJFF(c20511315Nv.LLJILJILJ, this.LLJILJILJ) || !Intrinsics.LJFF(c20511315Nv.LLJILLL, this.LLJILLL)) {
            return false;
        }
        if (c20511315Nv.LLIZ != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLIZ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2 || c20511315Nv.LLJJ != this.LLJJ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C20511315Nv) && Intrinsics.LJFF(((C20511315Nv) interfaceC1891350zJl).LLILZ, this.LLILZ)) {
            return true;
        }
        return false;
    }

    public C20511315Nv(int i, int i2, boolean z, String str, String str2, Image image, SalePropTag salePropTag, boolean z2, boolean z3, int i3, int i4, int i5, Integer num, Integer num2, int i6, C04GK c04gk) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = image;
        this.LLIZ = salePropTag;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
        this.LLJI = i3;
        this.LLJIJIL = i4;
        this.LLJILJIL = i5;
        this.LLJILJILJ = num;
        this.LLJILLL = num2;
        this.LLJJ = i6;
        this.LLJJI = c04gk;
    }
}
