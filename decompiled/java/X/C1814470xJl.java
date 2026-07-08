package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814470xJl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DataChannel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814470xJl(DataChannel dataChannel) {
        super(0);
        this.LL = dataChannel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.SX0(C772010UQd.class, new HashMap());
        return Unit.LIZ;
    }
}
