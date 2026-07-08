package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179160gn4 implements InterfaceC1891350zJl {
    public final int LL;
    public final PoiDetailTag LLILLJJLI;
    public final PoiDetailTagStyle LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1179160gn4)) {
            return false;
        }
        C1179160gn4 c1179160gn4 = (C1179160gn4) obj;
        return this.LL == c1179160gn4.LL && Intrinsics.LJFF(this.LLILLJJLI, c1179160gn4.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1179160gn4.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31;
        PoiDetailTagStyle poiDetailTagStyle = this.LLILLL;
        return iHashCode + (poiDetailTagStyle == null ? 0 : poiDetailTagStyle.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiTagItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", poiDetailTagStyle=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1179160gn4)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLJJLI, ((C1179160gn4) interfaceC1891350zJl).LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1179160gn4) || this.LL != ((C1179160gn4) interfaceC1891350zJl).LL) {
            return false;
        }
        return true;
    }

    public C1179160gn4(int i, PoiDetailTag poiDetailTag, PoiDetailTagStyle poiDetailTagStyle) {
        this.LL = i;
        this.LLILLJJLI = poiDetailTag;
        this.LLILLL = poiDetailTagStyle;
    }
}
