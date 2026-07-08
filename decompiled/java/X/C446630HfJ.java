package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446630HfJ extends AbstractC446650HfL {
    public final CollectionDetail LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C446630HfJ)) {
            return false;
        }
        C446630HfJ c446630HfJ = (C446630HfJ) obj;
        return Intrinsics.LJFF(this.LIZ, c446630HfJ.LIZ) && this.LIZIZ == c446630HfJ.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Detail(detail=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C446630HfJ(CollectionDetail collectionDetail, int i) {
        this.LIZ = collectionDetail;
        this.LIZIZ = i;
    }
}
