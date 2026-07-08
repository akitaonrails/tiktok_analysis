package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684840Qte implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C684840Qte)) {
            return false;
        }
        C684840Qte c684840Qte = (C684840Qte) obj;
        return Intrinsics.LJFF(this.LL, c684840Qte.LL) && this.LLILLJJLI == c684840Qte.LLILLJJLI && this.LLILLL == c684840Qte.LLILLL && this.LLILZ == c684840Qte.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchVideoDocItemRenderData(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", userDigg=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isInVisualSearch=");
        sbLIZ.append(this.LLILZ);
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

    public C684840Qte(int i, int i2, Aweme aweme, boolean z) {
        this.LL = aweme;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = z;
    }
}
