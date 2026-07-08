package X;

import com.bytedance.android.livesdk.comp.impl.pcs.data.playentity.ServicePlusEntity;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20347714jb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ServicePlusEntity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20347714jb(ServicePlusEntity servicePlusEntity) {
        super(0);
        this.LL = servicePlusEntity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ServicePlusEntity servicePlusEntity = this.LL;
        DataChannel dataChannel = servicePlusEntity.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(servicePlusEntity);
        }
        return Unit.LIZ;
    }
}
