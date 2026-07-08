package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965490bER extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LinkLayerMessage LL;
    public final /* synthetic */ InterfaceC965990bFF LLILLJJLI;
    public final /* synthetic */ C965980bFE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965490bER(InterfaceC965990bFF interfaceC965990bFF, C965980bFE c965980bFE, LinkLayerMessage linkLayerMessage) {
        super(0);
        this.LL = linkLayerMessage;
        this.LLILLJJLI = interfaceC965990bFF;
        this.LLILLL = c965980bFE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Player player;
        String str;
        CreateChannelContent createChannelContent = this.LL.createChannelContent;
        C965980bFE c965980bFE = this.LLILLL;
        if (createChannelContent != null) {
            player = createChannelContent.owner;
            str = createChannelContent.ownerLinkMicId;
        } else {
            player = null;
            str = null;
        }
        LinkUser linkUserLJ = c965980bFE.LJ(player, str);
        InterfaceC965990bFF interfaceC965990bFF = this.LLILLJJLI;
        C966020bFI c966020bFI = this.LLILLL.LL;
        c966020bFI.LJ();
        interfaceC965990bFF.LLIIJI(c966020bFI, new CreateChannelMessage(linkUserLJ, C954920axO.LJ(this.LL, null)));
        return Unit.LIZ;
    }
}
