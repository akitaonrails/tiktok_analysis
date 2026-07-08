package X;

import android.view.View;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gjj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423890Gjj implements InterfaceC683020Qqi {
    public final View LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C423890Gjj) && Intrinsics.LJFF(this.LIZ, ((C423890Gjj) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Custom(view=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C423890Gjj(RelationButton relationButton) {
        this.LIZ = relationButton;
    }
}
