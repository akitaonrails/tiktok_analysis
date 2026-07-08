package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A3J, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A3J {
    public final TakoContentPreviewItem.Image LIZ;
    public final InterfaceC1361305Ul LIZIZ;
    public final Function0<Unit> LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A3J)) {
            return false;
        }
        C1A3J c1a3j = (C1A3J) obj;
        return Intrinsics.LJFF(this.LIZ, c1a3j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1a3j.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1a3j.LIZJ) && this.LIZLLL == c1a3j.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC1361305Ul interfaceC1361305Ul = this.LIZIZ;
        return ((((iHashCode + (interfaceC1361305Ul == null ? 0 : interfaceC1361305Ul.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewPayload(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contentPreviewCellAbility=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onDismiss=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isVideo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1A3J(TakoContentPreviewItem.Image image, InterfaceC1361305Ul interfaceC1361305Ul, Function0<Unit> function0, boolean z) {
        this.LIZ = image;
        this.LIZIZ = interfaceC1361305Ul;
        this.LIZJ = function0;
        this.LIZLLL = z;
    }
}
