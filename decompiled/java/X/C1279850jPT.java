package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFirstFrameDropAfterEnd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279850jPT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279850jPT(C1276910jKj c1276910jKj, String str) {
        super(0);
        this.LL = c1276910jKj;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1279800jPO interfaceC1279800jPO;
        if ((!LinkMicFirstFrameDropAfterEnd.INSTANCE.enable() || !this.LL.LLJJIJIL) && (interfaceC1279800jPO = this.LL.LLJJJ) != null) {
            interfaceC1279800jPO.onUserJoined(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
