package X;

import com.ss.android.ugc.aweme.discover.model.suggest.RecomDataWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667460QGa implements InterfaceC663910Q2j {
    public final RecomDataWrapper LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C667460QGa) && Intrinsics.LJFF(this.LIZ, ((C667460QGa) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestWordResUpdateAction(recomData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C667460QGa(RecomDataWrapper recomDataWrapper) {
        this.LIZ = recomDataWrapper;
    }
}
