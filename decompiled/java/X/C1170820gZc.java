package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170820gZc {
    public CollectionDetail LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170820gZc)) {
            return false;
        }
        C1170820gZc c1170820gZc = (C1170820gZc) obj;
        return Intrinsics.LJFF(this.LIZ, c1170820gZc.LIZ) && this.LIZIZ == c1170820gZc.LIZIZ;
    }

    public C1170820gZc(CollectionDetail collectionDetail, int i) {
        this.LIZ = collectionDetail;
        this.LIZIZ = i;
    }
}
