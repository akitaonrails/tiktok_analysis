package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14sX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20403114sX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C20394514r9 LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20403114sX(C20394514r9 c20394514r9, C20402114sN c20402114sN) {
        super(0);
        this.LL = c20394514r9;
        this.LLILLJJLI = c20402114sN;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannel dataChannel = this.LL.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.SX0(C168A.class, Boolean.TRUE);
        }
        this.LLILLJJLI.invoke();
        return Unit.LIZ;
    }
}
