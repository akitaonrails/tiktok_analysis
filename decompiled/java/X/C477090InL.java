package X;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0InL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C477090InL extends C2217421BqW implements Function0<Integer> {
    public final /* synthetic */ AbstractC476820Imu LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C477090InL(AbstractC476820Imu abstractC476820Imu) {
        super(0, C1449605lu.class, "getModulePosition", "resetNearbyContainerController$getModulePosition(Lcom/ss/android/ugc/aweme/live/skylight/SkylightContainerManager;)I", 0);
        this.LL = abstractC476820Imu;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        ViewGroup viewGroup = this.LL.LJJIII;
        return Integer.valueOf((viewGroup == null || viewGroup.getVisibility() != 0) ? 2 : 1);
    }
}
