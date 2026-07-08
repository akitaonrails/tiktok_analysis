package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bG9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966550bG9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC965990bFF LL;
    public final /* synthetic */ C965980bFE LLILLJJLI;
    public final /* synthetic */ LeaveMessage LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966550bG9(InterfaceC965990bFF interfaceC965990bFF, C965980bFE c965980bFE, LeaveMessage leaveMessage) {
        super(0);
        this.LL = interfaceC965990bFF;
        this.LLILLJJLI = c965980bFE;
        this.LLILLL = leaveMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJLLILLLL(this.LLILLJJLI.LL, this.LLILLL);
        return Unit.LIZ;
    }
}
