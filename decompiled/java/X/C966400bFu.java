package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966400bFu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC965990bFF LL;
    public final /* synthetic */ LinkLayerMessage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966400bFu(InterfaceC965990bFF interfaceC965990bFF, LinkLayerMessage linkLayerMessage) {
        super(0);
        this.LL = interfaceC965990bFF;
        this.LLILLJJLI = linkLayerMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC965990bFF interfaceC965990bFF = this.LL;
        LinkLayerMessage linkLayerMessage = this.LLILLJJLI;
        interfaceC965990bFF.LLFZ(new P2PGroupChangeMessage(linkLayerMessage, linkLayerMessage.bizContent));
        return Unit.LIZ;
    }
}
