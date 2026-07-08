package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QHZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QHZ implements InterfaceC663910Q2j {
    public final Word LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0QHZ) && Intrinsics.LJFF(this.LIZ, ((C0QHZ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SugWordUpdateAction(firstWord=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QHZ(Word word) {
        this.LIZ = word;
    }
}
