package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966520bG6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC965990bFF LL;
    public final /* synthetic */ C965980bFE LLILLJJLI;
    public final /* synthetic */ CancelApplyMessage LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966520bG6(InterfaceC965990bFF interfaceC965990bFF, C965980bFE c965980bFE, CancelApplyMessage cancelApplyMessage) {
        super(0);
        this.LL = interfaceC965990bFF;
        this.LLILLJJLI = c965980bFE;
        this.LLILLL = cancelApplyMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJLIIL(this.LLILLJJLI.LL, this.LLILLL);
        return Unit.LIZ;
    }
}
