package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eIP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1083270eIP extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1083270eIP(ServiceRoutingDetector serviceRoutingDetector) {
        super(0);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        DataChannel dataChannel = this.LL.dataChannel;
        return Boolean.valueOf(dataChannel != null ? Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE) : false);
    }
}
