package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedCenterRecallArea;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0go9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179830go9 implements InterfaceC1891350zJl {
    public final String LL;
    public final PoiFeedCenterRecallArea LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1179830go9)) {
            return false;
        }
        C1179830go9 c1179830go9 = (C1179830go9) obj;
        return Intrinsics.LJFF(this.LL, c1179830go9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1179830go9.LLILLJJLI) && this.LLILLL == c1179830go9.LLILLL && this.LLILZ == c1179830go9.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapDetailFilterOptionItem(areaText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiFeedCenterRecallArea=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", appliedSelectedState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", currentSelectedState=");
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
        C1179830go9 c1179830go9;
        PoiFeedCenterRecallArea poiFeedCenterRecallArea = this.LLILLJJLI;
        PoiFeedCenterRecallArea poiFeedCenterRecallArea2 = null;
        if ((interfaceC1891350zJl instanceof C1179830go9) && (c1179830go9 = (C1179830go9) interfaceC1891350zJl) != null) {
            poiFeedCenterRecallArea2 = c1179830go9.LLILLJJLI;
        }
        return Intrinsics.LJFF(poiFeedCenterRecallArea, poiFeedCenterRecallArea2);
    }

    public static C1179830go9 LIZ(C1179830go9 c1179830go9, boolean z) {
        String str = c1179830go9.LL;
        PoiFeedCenterRecallArea poiFeedCenterRecallArea = c1179830go9.LLILLJJLI;
        c1179830go9.getClass();
        return new C1179830go9(str, poiFeedCenterRecallArea, z, false);
    }

    public C1179830go9(String str, PoiFeedCenterRecallArea poiFeedCenterRecallArea, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = poiFeedCenterRecallArea;
        this.LLILLL = z;
        this.LLILZ = z2;
    }
}
