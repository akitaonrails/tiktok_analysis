package X;

import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ghu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175960ghu implements InterfaceC111300bX {
    public final InterfaceC332260D0u<SlashCellModel> LL;

    public C1175960ghu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1175960ghu) && Intrinsics.LJFF(this.LL, ((C1175960ghu) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashCellHierarchyData(glueSubscriber=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1175960ghu(Object obj) {
        this.LL = C1BNE.LIZ(null);
    }
}
