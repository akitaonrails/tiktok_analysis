package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateAwemeInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660270Pv7 implements InterfaceC663910Q2j {
    public final SearchIntermediateAwemeInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C660270Pv7) && Intrinsics.LJFF(this.LIZ, ((C660270Pv7) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAddFeedAwemeAction(awemeInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C660270Pv7(SearchIntermediateAwemeInfo searchIntermediateAwemeInfo) {
        this.LIZ = searchIntermediateAwemeInfo;
    }
}
