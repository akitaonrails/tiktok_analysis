package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS176S1100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838060xvo implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final ImageModel LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;
    public final Function0<Unit> LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1838060xvo)) {
            return false;
        }
        C1838060xvo c1838060xvo = (C1838060xvo) obj;
        return Intrinsics.LJFF(this.LL, c1838060xvo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1838060xvo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1838060xvo.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1838060xvo.LLILZ) && this.LLILZIL == c1838060xvo.LLILZIL && this.LLILZLL == c1838060xvo.LLILZLL && this.LLIZ == c1838060xvo.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1838060xvo.LLIZLLLIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        ImageModel imageModel = this.LLILZ;
        return ((((((((iHashCode + (imageModel == null ? 0 : imageModel.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DescriptionItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", creatorName=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", creatorAvatar=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", shouldHideFAQ=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", shouldShowCreatorInfo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", videoCount=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", onFaqClick=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1838060xvo) {
            C1838060xvo c1838060xvo = (C1838060xvo) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1838060xvo.LL, this.LL) && Intrinsics.LJFF(c1838060xvo.LLILLJJLI, this.LLILLJJLI) && Intrinsics.LJFF(c1838060xvo.LLILZ, this.LLILZ) && c1838060xvo.LLIZ == this.LLIZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1838060xvo) {
            C1838060xvo c1838060xvo = (C1838060xvo) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1838060xvo.LL, this.LL) && Intrinsics.LJFF(c1838060xvo.LLILLJJLI, this.LLILLJJLI) && Intrinsics.LJFF(c1838060xvo.LLILZ, this.LLILZ) && c1838060xvo.LLIZ == this.LLIZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1838060xvo(String str, String str2, String str3, ImageModel imageModel, boolean z, boolean z2, int i, AwS176S1100000_27 awS176S1100000_27) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = imageModel;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = i;
        this.LLIZLLLIL = awS176S1100000_27;
    }
}
