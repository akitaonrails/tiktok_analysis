package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434570H2h extends AbstractC434530H2d implements InterfaceC435460H5s {
    public final Aweme LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ = 110;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434570H2h)) {
            return false;
        }
        C434570H2h c434570H2h = (C434570H2h) obj;
        return Intrinsics.LJFF(this.LL, c434570H2h.LL) && this.LLILLJJLI == c434570H2h.LLILLJJLI && this.LLILLL == c434570H2h.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReferenceAwemeRenderItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC434530H2d
    public final int LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC435460H5s
    public final Aweme getAweme() {
        return this.LL;
    }

    @Override // X.InterfaceC434580H2i
    public final int getIndex() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC434580H2i
    public final int getItemCount() {
        return this.LLILLL;
    }

    public C434570H2h(int i, int i2, Aweme aweme) {
        this.LL = aweme;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
