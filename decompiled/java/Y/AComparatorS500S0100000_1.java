package Y;

import X.C20085613iQ;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AComparatorS500S0100000_1 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS500S0100000_1(IdentityInfoOption identityInfoOption, int i) {
        this.$t = i;
        this.l0 = identityInfoOption;
    }

    public static final int compare$0(AComparatorS500S0100000_1 aComparatorS500S0100000_1, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Boolean.valueOf(!Intrinsics.LJFF(((IdentityInfoOption) obj).getType(), ((IdentityInfoOption) aComparatorS500S0100000_1.l0).getType())), Boolean.valueOf(!Intrinsics.LJFF(((IdentityInfoOption) obj2).getType(), ((IdentityInfoOption) aComparatorS500S0100000_1.l0).getType())));
    }

    public static final int compare$1(AComparatorS500S0100000_1 aComparatorS500S0100000_1, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Boolean.valueOf(!Intrinsics.LJFF(((IdentityInfoOption) obj).getType(), ((IdentityInfoOption) aComparatorS500S0100000_1.l0).getType())), Boolean.valueOf(!Intrinsics.LJFF(((IdentityInfoOption) obj2).getType(), ((IdentityInfoOption) aComparatorS500S0100000_1.l0).getType())));
    }
}
