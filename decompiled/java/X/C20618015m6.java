package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15m6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20618015m6 implements InterfaceC1891350zJl {
    public final EnumC20618215m8 LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final UrlModel LLILZ;
    public final EnumC20616515lr LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final boolean LLIZLLLIL;
    public final IMContact LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20618015m6)) {
            return false;
        }
        C20618015m6 c20618015m6 = (C20618015m6) obj;
        return this.LL == c20618015m6.LL && Intrinsics.LJFF(this.LLILLJJLI, c20618015m6.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c20618015m6.LLILLL) && Intrinsics.LJFF(this.LLILZ, c20618015m6.LLILZ) && this.LLILZIL == c20618015m6.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c20618015m6.LLILZLL) && this.LLIZ == c20618015m6.LLIZ && this.LLIZLLLIL == c20618015m6.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c20618015m6.LLJ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.LLILZ;
        int iHashCode4 = (((((((((iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        IMContact iMContact = this.LLJ;
        return iHashCode4 + (iMContact != null ? iMContact.hashCode() : 0);
    }

    public final String LIZ() {
        int i = C20618415mA.LIZ[this.LL.ordinal()];
        if (i == 1) {
            return C0YNP.LJ(this.LLILLL);
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        String str = this.LLILLL;
        return str == null ? "" : str;
    }

    public final String toString() {
        int i = C20618415mA.LIZ[this.LL.ordinal()];
        if (i == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("user=");
            sbLIZ.append(this.LLILLL);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("group chat=");
        sbLIZ2.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C20618015m6)) {
            return false;
        }
        C20618015m6 c20618015m6 = (C20618015m6) interfaceC1891350zJl;
        if (this.LL != c20618015m6.LL || !Intrinsics.LJFF(this.LLILZLL, c20618015m6.LLILZLL) || this.LLILZIL != c20618015m6.LLILZIL || this.LLIZLLLIL != c20618015m6.LLIZLLLIL || !Intrinsics.LJFF(this.LLILLJJLI, c20618015m6.LLILLJJLI) || !Intrinsics.LJFF(this.LLILLL, c20618015m6.LLILLL) || !Intrinsics.LJFF(this.LLILZ, c20618015m6.LLILZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C20618015m6)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLL, ((C20618015m6) interfaceC1891350zJl).LLILLL);
    }

    public C20618015m6(EnumC20618215m8 enumC20618215m8, String str, String str2, UrlModel urlModel, EnumC20616515lr enumC20616515lr, String str3, int i, boolean z, IMContact iMContact) {
        this.LL = enumC20618215m8;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = urlModel;
        this.LLILZIL = enumC20616515lr;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = z;
        this.LLJ = iMContact;
    }
}
