package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899550ZQr implements InterfaceC111300bX {
    public final C899480ZQk LL;
    public final C899480ZQk LLILLJJLI;
    public final int LLILLL = R.id.vf6;
    public final int LLILZ = R.id.eu1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C899550ZQr)) {
            return false;
        }
        C899550ZQr c899550ZQr = (C899550ZQr) obj;
        return Intrinsics.LJFF(this.LL, c899550ZQr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c899550ZQr.LLILLJJLI) && this.LLILLL == c899550ZQr.LLILLL && this.LLILZ == c899550ZQr.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkeletonLayoutConfig(sendTemplate=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", receiveTemplate=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", rootLayoutId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", contentLayoutId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C899550ZQr(C899480ZQk c899480ZQk, C899480ZQk c899480ZQk2) {
        this.LL = c899480ZQk;
        this.LLILLJJLI = c899480ZQk2;
    }
}
