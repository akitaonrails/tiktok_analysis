package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332460D1o implements Serializable {
    public final List<C0D4T> previewReviews;
    public final EnumC332480D1q source;

    public final C332460D1o copy(List<C0D4T> list, EnumC332480D1q enumC332480D1q) {
        return new C332460D1o(list, enumC332480D1q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332460D1o)) {
            return false;
        }
        C332460D1o c332460D1o = (C332460D1o) obj;
        return Intrinsics.LJFF(this.previewReviews, c332460D1o.previewReviews) && this.source == c332460D1o.source;
    }

    public int hashCode() {
        return (this.previewReviews.hashCode() * 31) + this.source.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewListState(previewReviews=");
        sbLIZ.append(this.previewReviews);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332460D1o(List<C0D4T> list, EnumC332480D1q enumC332480D1q) {
        this.previewReviews = list;
        this.source = enumC332480D1q;
    }
}
