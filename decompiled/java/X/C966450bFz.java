package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966450bFz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC966890bGh<LeaveChannelResult> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966450bFz(C965820bEy c965820bEy) {
        super(0);
        this.LL = c965820bEy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC966890bGh<LeaveChannelResult> interfaceC966890bGh = this.LL;
        if (interfaceC966890bGh != null) {
            interfaceC966890bGh.LIZIZ(LinkCoreError.Companion.getCHANNEL_ID_INVALID(), new Throwable("The channel id is invalid."));
        }
        return Unit.LIZ;
    }
}
