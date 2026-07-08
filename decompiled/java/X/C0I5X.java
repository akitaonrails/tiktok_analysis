package X;

import com.ss.android.ugc.aweme.im.message.content.BaseText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I5X, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5X implements C0I5T {
    public final BaseText LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0I5X) && Intrinsics.LJFF(this.LIZ, ((C0I5X) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedThought(thoughtText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I5X(BaseText baseText) {
        this.LIZ = baseText;
    }
}
