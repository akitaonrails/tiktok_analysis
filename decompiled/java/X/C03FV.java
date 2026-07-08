package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchTo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03FV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03FV {
    public final Object LIZ;
    public DispatchTo LIZIZ;

    public C03FV() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C03FV) && Intrinsics.LJFF(this.LIZ, ((C03FV) obj).LIZ);
    }

    public final ReachableAddress LIZ() {
        Object obj = this.LIZ;
        if (obj instanceof ReachableAddress) {
            return (ReachableAddress) obj;
        }
        return null;
    }

    public final List<Region> LIZIZ() {
        Object obj = this.LIZ;
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public C03FV(Object obj) {
        this.LIZ = obj;
    }

    public final void LIZJ(Function1 function1) {
        ReachableAddress reachableAddressLIZ = LIZ();
        if (reachableAddressLIZ != null) {
            function1.invoke(reachableAddressLIZ);
        }
    }

    public final void LIZLLL(Function1 function1) {
        List<Region> listLIZIZ = LIZIZ();
        if (listLIZIZ != null) {
            function1.invoke(listLIZIZ);
        }
    }
}
