package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755410vmV implements InterfaceC1406670mi1 {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final C1549130qPn LLILZIL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1755410vmV)) {
            return false;
        }
        C1755410vmV c1755410vmV = (C1755410vmV) obj;
        return Intrinsics.LJFF(this.LL, c1755410vmV.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1755410vmV.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1755410vmV.LLILLL) && this.LLILZ == c1755410vmV.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1755410vmV.LLILZIL);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
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
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31;
        C1549130qPn c1549130qPn = this.LLILZIL;
        return iHashCode2 + (c1549130qPn != null ? c1549130qPn.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpLynxVO(schema=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", json=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", viewType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", brickName=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", lynxRenderMode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public C1755410vmV(String str, String str2, String str3, int i) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = i;
    }
}
