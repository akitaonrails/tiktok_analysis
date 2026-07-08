package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tikcast.linkmic.common.GroupPlayer;
import webcast.im.JoinGroupContent;

/* JADX INFO: renamed from: X.0bF4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965880bF4 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ JoinGroupContent LL;
    public final /* synthetic */ InterfaceC965990bFF LLILLJJLI;
    public final /* synthetic */ LinkLayerMessage LLILLL;
    public final /* synthetic */ GroupPlayer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965880bF4(JoinGroupContent joinGroupContent, InterfaceC965990bFF interfaceC965990bFF, LinkLayerMessage linkLayerMessage, GroupPlayer groupPlayer) {
        super(0);
        this.LL = joinGroupContent;
        this.LLILLJJLI = interfaceC965990bFF;
        this.LLILLL = linkLayerMessage;
        this.LLILZ = groupPlayer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.LL.type;
        if (i == 102) {
            InterfaceC965990bFF interfaceC965990bFF = this.LLILLJJLI;
            LinkLayerMessage linkLayerMessage = this.LLILLL;
            interfaceC965990bFF.LJLLL(new InviteGroupMessage(linkLayerMessage, this.LLILZ, linkLayerMessage.bizContent, C158B.LIZ(), false));
        } else if (i == 100) {
            InterfaceC965990bFF interfaceC965990bFF2 = this.LLILLJJLI;
            LinkLayerMessage linkLayerMessage2 = this.LLILLL;
            interfaceC965990bFF2.LJL(new ApplyGroupMessage(linkLayerMessage2, this.LLILZ, linkLayerMessage2.bizContent));
        }
        return Unit.LIZ;
    }
}
