package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SlideEntrance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753000vic implements InterfaceC746802vq {
    public final String LL;
    public final SlideEntrance LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1753000vic)) {
            return false;
        }
        C1753000vic c1753000vic = (C1753000vic) obj;
        return Intrinsics.LJFF(this.LL, c1753000vic.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1753000vic.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1753000vic.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1753000vic.LLILZ);
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
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedViewMoreItem(scene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", slideEntrance=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", btm=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", moduleDaInfo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public C1753000vic(String str, SlideEntrance slideEntrance, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = slideEntrance;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }
}
