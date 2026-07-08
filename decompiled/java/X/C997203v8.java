package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03v8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C997203v8 implements InterfaceC997603vC, InterfaceC746802vq, C04DW {
    public final String LL;
    public final ECRichText LLILLJJLI;
    public final Integer LLILLL;
    public final boolean LLILZ;
    public String LLILZIL;
    public C09AY LLILZLL;
    public Padding LLIZ;
    public Integer LLIZLLLIL;
    public final int LLJ;

    public C997203v8() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C997203v8)) {
            return false;
        }
        C997203v8 c997203v8 = (C997203v8) obj;
        return Intrinsics.LJFF(this.LL, c997203v8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c997203v8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c997203v8.LLILLL) && this.LLILZ == c997203v8.LLILZ;
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        Integer num = this.LLILLL;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalTitleVO(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ecTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", titleId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showArrow=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLJ;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLILZIL = str;
    }

    public C997203v8(String str, ECRichText eCRichText, Integer num, int i) {
        boolean z;
        str = (i & 1) != 0 ? null : str;
        eCRichText = (i & 2) != 0 ? null : eCRichText;
        num = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LL = str;
        this.LLILLJJLI = eCRichText;
        this.LLILLL = num;
        this.LLILZ = z;
        this.LLILZIL = "undefined";
        this.LLJ = EnumC1752690vi7.UNSET.getValue();
    }
}
