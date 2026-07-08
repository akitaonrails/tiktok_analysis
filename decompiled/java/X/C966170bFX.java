package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: renamed from: X.0bFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966170bFX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ LinkLayerMessage LLILLJJLI;
    public final /* synthetic */ C966220bFc LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966170bFX(C966020bFI c966020bFI, LinkLayerMessage linkLayerMessage, C966220bFc c966220bFc) {
        super(0);
        this.LL = c966020bFI;
        this.LLILLJJLI = linkLayerMessage;
        this.LLILLL = c966220bFc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            LinkLayerMessage linkLayerMessage = this.LLILLJJLI;
            C966220bFc c966220bFc = this.LLILLL;
            int i = c966220bFc.LIZIZ ? 1 : 2;
            C967180bHA c967180bHA = c966220bFc.LIZ;
            GroupPlayer groupPlayer = new GroupPlayer();
            groupPlayer.channelId = c967180bHA.LIZIZ;
            new Player(c967180bHA.LIZ, c967180bHA.LIZJ);
            interfaceC965990bFF.LJLI(new ReplyInviteGroupMessage(linkLayerMessage, i, groupPlayer, this.LLILLJJLI.bizContent));
        }
        return Unit.LIZ;
    }
}
