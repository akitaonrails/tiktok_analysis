package Y;

import X.C09JN;
import X.C1171300gaO;
import X.C1C7U;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;

/* JADX INFO: loaded from: classes19.dex */
public class AfS0S0120100_18 implements C09JN {
    public final int $t;
    public long j3;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0120100_18 afS0S0120100_18, Object obj) {
        C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$6");
        C1171300gaO c1171300gaO = (C1171300gaO) afS0S0120100_18.l0;
        boolean z = afS0S0120100_18.z1;
        boolean z2 = afS0S0120100_18.z2;
        long j = afS0S0120100_18.j3;
        c1171300gaO.getClass();
        C1171300gaO.LJLZ((CollectionListResponse) obj, z, z2, j);
        C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$6");
    }

    public static final void accept$1(AfS0S0120100_18 afS0S0120100_18, Object obj) {
        C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$res$5");
        C1171300gaO c1171300gaO = (C1171300gaO) afS0S0120100_18.l0;
        boolean z = afS0S0120100_18.z1;
        boolean z2 = afS0S0120100_18.z2;
        long j = afS0S0120100_18.j3;
        c1171300gaO.getClass();
        C1171300gaO.LJLZ((CollectionListResponse) obj, z, z2, j);
        C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getVideoCollectionList$res$5");
    }

    public AfS0S0120100_18(C1171300gaO c1171300gaO, boolean z, boolean z2, long j, int i) {
        this.$t = i;
        this.l0 = c1171300gaO;
        this.z1 = z;
        this.z2 = z2;
        this.j3 = j;
    }
}
