package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571980r0e implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final UrlModel LLILLL;
    public final Uri LLILZ;
    public final C291001Au<C0N7M> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1571980r0e)) {
            return false;
        }
        C1571980r0e c1571980r0e = (C1571980r0e) obj;
        return Intrinsics.LJFF(this.LL, c1571980r0e.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1571980r0e.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1571980r0e.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1571980r0e.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1571980r0e.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        Uri uri = this.LLILZ;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        C291001Au<C0N7M> c291001Au = this.LLILZIL;
        return iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectDoneState(effectName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", author=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", originalEffectImage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", editedImage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", uiEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1571980r0e(String str, String str2, UrlModel urlModel, Uri uri, C291001Au<? extends C0N7M> c291001Au) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = urlModel;
        this.LLILZ = uri;
        this.LLILZIL = c291001Au;
    }
}
