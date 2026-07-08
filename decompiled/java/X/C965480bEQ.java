package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.AsyncAuxStreamCreateTask;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAuxStreamHandleTiming;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965480bEQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965480bEQ(C1276910jKj c1276910jKj) {
        super(0);
        this.LL = c1276910jKj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1279800jPO interfaceC1279800jPO;
        InterfaceC1279800jPO interfaceC1279800jPO2 = this.LL.LLJJJ;
        if (interfaceC1279800jPO2 != null) {
            interfaceC1279800jPO2.LJLJI(new RtcStartResultMessage(true, null));
        }
        if (LinkMicAuxStreamHandleTiming.INSTANCE.enable()) {
            C1276910jKj c1276910jKj = this.LL;
            if (c1276910jKj.LLILZ.LIZ.netMode != 1 && (interfaceC1279800jPO = c1276910jKj.LLJJJ) != null) {
                interfaceC1279800jPO.LJJLIIIJ();
            }
        } else {
            InterfaceC1279800jPO interfaceC1279800jPO3 = this.LL.LLJJJ;
            if (interfaceC1279800jPO3 != null) {
                interfaceC1279800jPO3.LJJLIIIJ();
            }
        }
        C1276910jKj c1276910jKj2 = this.LL;
        AsyncAuxStreamCreateTask asyncAuxStreamCreateTask = c1276910jKj2.LLJLIL;
        if (asyncAuxStreamCreateTask != null) {
            c1276910jKj2.LLJLIL = null;
            asyncAuxStreamCreateTask.callback.onCreated(c1276910jKj2.LJJJLIIL(asyncAuxStreamCreateTask.config));
        }
        return Unit.LIZ;
    }
}
