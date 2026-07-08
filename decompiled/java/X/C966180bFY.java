package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: renamed from: X.0bFY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966180bFY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ LinkLayerMessage LLILLJJLI;
    public final /* synthetic */ C968090bId LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966180bFY(C966020bFI c966020bFI, LinkLayerMessage linkLayerMessage, C968090bId c968090bId) {
        super(0);
        this.LL = c966020bFI;
        this.LLILLJJLI = linkLayerMessage;
        this.LLILLL = c968090bId;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            LinkLayerMessage linkLayerMessage = this.LLILLJJLI;
            C968090bId c968090bId = this.LLILLL;
            int i = c968090bId.LIZIZ ? 1 : 2;
            C967180bHA c967180bHA = c968090bId.LIZ;
            GroupPlayer groupPlayer = new GroupPlayer();
            groupPlayer.channelId = c967180bHA.LIZIZ;
            new Player(c967180bHA.LIZ, c967180bHA.LIZJ);
            interfaceC965990bFF.LLIIIJ(new PermitApplyGroupMessage(linkLayerMessage, i, groupPlayer, this.LLILLJJLI.bizContent));
        }
        return Unit.LIZ;
    }
}
