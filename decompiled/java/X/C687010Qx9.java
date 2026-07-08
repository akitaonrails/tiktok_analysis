package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687010Qx9 implements InterfaceC1891350zJl {
    public final C444910HcX LL;
    public final C419910GdJ LLILLJJLI;
    public final View.OnClickListener LLILLL;
    public final boolean LLILZ;
    public final EnumC036600Ay LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C687010Qx9)) {
            return false;
        }
        C687010Qx9 c687010Qx9 = (C687010Qx9) obj;
        return Intrinsics.LJFF(this.LL, c687010Qx9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c687010Qx9.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c687010Qx9.LLILLL) && this.LLILZ == c687010Qx9.LLILZ && this.LLILZIL == c687010Qx9.LLILZIL;
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
        int iHashCode3 = (((iHashCode2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        EnumC036600Ay enumC036600Ay = this.LLILZIL;
        return iHashCode3 + (enumC036600Ay != null ? enumC036600Ay.hashCode() : 0);
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
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILZIL);
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

    public /* synthetic */ C687010Qx9(C444910HcX c444910HcX, C419910GdJ c419910GdJ, View.OnClickListener onClickListener, boolean z) {
        this(c444910HcX, c419910GdJ, onClickListener, z, null);
    }

    public C687010Qx9(C444910HcX c444910HcX, C419910GdJ c419910GdJ, View.OnClickListener onClickListener, boolean z, EnumC036600Ay enumC036600Ay) {
        this.LL = c444910HcX;
        this.LLILLJJLI = c419910GdJ;
        this.LLILLL = onClickListener;
        this.LLILZ = z;
        this.LLILZIL = enumC036600Ay;
    }
}
