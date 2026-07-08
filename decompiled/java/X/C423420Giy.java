package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.OpeningTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Giy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423420Giy implements InterfaceC1891350zJl {
    public final int LL;
    public final OpeningTime LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C423420Giy)) {
            return false;
        }
        C423420Giy c423420Giy = (C423420Giy) obj;
        return this.LL == c423420Giy.LL && Intrinsics.LJFF(this.LLILLJJLI, c423420Giy.LLILLJJLI) && this.LLILLL == c423420Giy.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiOpeningTimeItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", openingTime=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needHighLight=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C423420Giy)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLJJLI, ((C423420Giy) interfaceC1891350zJl).LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C423420Giy) || this.LL != ((C423420Giy) interfaceC1891350zJl).LL) {
            return false;
        }
        return true;
    }

    public C423420Giy(int i, OpeningTime openingTime, boolean z) {
        this.LL = i;
        this.LLILLJJLI = openingTime;
        this.LLILLL = z;
    }
}
