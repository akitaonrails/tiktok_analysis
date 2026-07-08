package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687020QxA implements InterfaceC1891350zJl {
    public final C444910HcX LL;
    public final C419910GdJ LLILLJJLI;
    public final View.OnClickListener LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C687020QxA)) {
            return false;
        }
        C687020QxA c687020QxA = (C687020QxA) obj;
        return Intrinsics.LJFF(this.LL, c687020QxA.LL) && Intrinsics.LJFF(this.LLILLJJLI, c687020QxA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c687020QxA.LLILLL) && this.LLILZ == c687020QxA.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C419910GdJ c419910GdJ = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31;
        View.OnClickListener onClickListener = this.LLILLL;
        return ((iHashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEllipsisTextItem(textTitle=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(", textIcon=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listener=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFirst=");
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

    public C687020QxA(C444910HcX c444910HcX, C419910GdJ c419910GdJ, View.OnClickListener onClickListener, boolean z) {
        this.LL = c444910HcX;
        this.LLILLJJLI = c419910GdJ;
        this.LLILLL = onClickListener;
        this.LLILZ = z;
    }
}
