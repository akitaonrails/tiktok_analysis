package X;

import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362120lYA implements InterfaceC2753014t {
    public final SharePackage LL;
    public final C897520ZIw LLILLJJLI;
    public final C1362110lY9 LLILLL;
    public final InterfaceC1363370laB LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362120lYA)) {
            return false;
        }
        C1362120lYA c1362120lYA = (C1362120lYA) obj;
        return Intrinsics.LJFF(this.LL, c1362120lYA.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1362120lYA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1362120lYA.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1362120lYA.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C897520ZIw c897520ZIw = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (c897520ZIw == null ? 0 : c897520ZIw.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        InterfaceC1363370laB interfaceC1363370laB = this.LLILZ;
        return iHashCode2 + (interfaceC1363370laB != null ? interfaceC1363370laB.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelConfigSource(sharePackage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", activityStatusClient=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", panelUIConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", activityStatusParamsProvider=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1362120lYA(SharePackage sharePackage, C897520ZIw c897520ZIw, C1362110lY9 c1362110lY9, C1362150lYD c1362150lYD) {
        this.LL = sharePackage;
        this.LLILLJJLI = c897520ZIw;
        this.LLILLL = c1362110lY9;
        this.LLILZ = c1362150lYD;
    }
}
