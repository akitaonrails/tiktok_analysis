package X;

import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633560sby implements InterfaceC1633610sc3 {
    public final PanelInfoModel LIZ;
    public final C1633710scD LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633560sby)) {
            return false;
        }
        C1633560sby c1633560sby = (C1633560sby) obj;
        return Intrinsics.LJFF(this.LIZ, c1633560sby.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1633560sby.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelReceived(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", metrics=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1633560sby(PanelInfoModel panelInfoModel, C1633710scD c1633710scD) {
        this.LIZ = panelInfoModel;
        this.LIZIZ = c1633710scD;
    }
}
