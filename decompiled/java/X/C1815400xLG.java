package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815400xLG implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final ImageModel LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1815400xLG)) {
            return false;
        }
        C1815400xLG c1815400xLG = (C1815400xLG) obj;
        return Intrinsics.LJFF(this.LL, c1815400xLG.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1815400xLG.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1815400xLG.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1815400xLG.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1815400xLG.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        ImageModel imageModel = this.LLILLL;
        return ((((iHashCode + (imageModel == null ? 0 : imageModel.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntelligentTemplateForYouUpdateItem(noticeContent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", noticeSchema=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", noticeIcon=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", noticeHeading=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", updateBtnText=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1815400xLG() {
        this(null, "", "", "", "");
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1815400xLG(ImageModel imageModel, String str, String str2, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = imageModel;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
