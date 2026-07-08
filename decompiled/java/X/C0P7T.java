package X;

import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P7T, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P7T implements InterfaceC2753014t {
    public final Taco LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P7T) && Intrinsics.LJFF(this.LL, ((C0P7T) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchResultAutoPlayerSource(taco=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0P7T(Taco taco) {
        this.LL = taco;
        UUID.randomUUID().toString();
    }
}
