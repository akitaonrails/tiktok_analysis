package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ocr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623470Ocr implements InterfaceC1891350zJl {
    public final String LL;
    public final UrlModel LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final User LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C623470Ocr)) {
            return false;
        }
        C623470Ocr c623470Ocr = (C623470Ocr) obj;
        return Intrinsics.LJFF(this.LL, c623470Ocr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c623470Ocr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c623470Ocr.LLILLL) && Intrinsics.LJFF(this.LLILZ, c623470Ocr.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c623470Ocr.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserItem(uid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shortId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", nickName=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C623470Ocr(String str, UrlModel urlModel, String str2, String str3, User user) {
        this.LL = str;
        this.LLILLJJLI = urlModel;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = user;
    }
}
