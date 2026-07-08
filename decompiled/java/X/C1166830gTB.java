package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166830gTB implements InterfaceC1164430gPJ {
    public final boolean LL;
    public final PoiMapModeCategory LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1166830gTB)) {
            return false;
        }
        C1166830gTB c1166830gTB = (C1166830gTB) obj;
        return this.LL == c1166830gTB.LL && Intrinsics.LJFF(this.LLILLJJLI, c1166830gTB.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModeNavTabCategoryItem(selected=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", categoryData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1166830gTB c1166830gTB;
        PoiMapModeCategory poiMapModeCategory;
        String tabCode = null;
        if (interfaceC1891350zJl instanceof C1166830gTB) {
            c1166830gTB = (C1166830gTB) interfaceC1891350zJl;
        } else {
            c1166830gTB = null;
        }
        String tabCode2 = this.LLILLJJLI.getTabCode();
        if (c1166830gTB != null && (poiMapModeCategory = c1166830gTB.LLILLJJLI) != null) {
            tabCode = poiMapModeCategory.getTabCode();
        }
        return Intrinsics.LJFF(tabCode2, tabCode);
    }

    public C1166830gTB(boolean z, PoiMapModeCategory poiMapModeCategory) {
        this.LL = z;
        this.LLILLJJLI = poiMapModeCategory;
    }
}
