package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612620O1c implements InterfaceC636340Oxc<C612620O1c, AbstractC2004407tC> {
    public final C627660Ojc<AbstractC2004407tC> LL;
    public final C291001Au<Bitmap> LLILLJJLI;
    public final C291001Au<Bitmap> LLILLL;
    public final boolean LLILZ;

    public C612620O1c() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C612620O1c)) {
            return false;
        }
        C612620O1c c612620O1c = (C612620O1c) obj;
        return Intrinsics.LJFF(this.LL, c612620O1c.LL) && Intrinsics.LJFF(this.LLILLJJLI, c612620O1c.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c612620O1c.LLILLL) && this.LLILZ == c612620O1c.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneryPictureState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", displayingBitmap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", originalBimap=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasLastedSavedPicture=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<AbstractC2004407tC> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<AbstractC2004407tC> getListState() {
        return this.LL;
    }

    public /* synthetic */ C612620O1c(int i) {
        this(new C627660Ojc(null, null, null, null, 15), new C291001Au(null), new C291001Au(null), false);
    }

    public C612620O1c(C627660Ojc<AbstractC2004407tC> c627660Ojc, C291001Au<Bitmap> c291001Au, C291001Au<Bitmap> c291001Au2, boolean z) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = z;
    }

    public static C612620O1c LIZ(C612620O1c c612620O1c, C627660Ojc c627660Ojc, C291001Au c291001Au, C291001Au c291001Au2, boolean z, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c612620O1c.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c612620O1c.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c612620O1c.LLILLL;
        }
        if ((i & 8) != 0) {
            z = c612620O1c.LLILZ;
        }
        c612620O1c.getClass();
        return new C612620O1c(c627660Ojc, c291001Au, c291001Au2, z);
    }
}
