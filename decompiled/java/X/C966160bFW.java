package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.im.PermitJoinGroupContent;

/* JADX INFO: renamed from: X.0bFW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966160bFW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PermitJoinGroupContent LL;
    public final /* synthetic */ InterfaceC965990bFF LLILLJJLI;
    public final /* synthetic */ LinkLayerMessage LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966160bFW(PermitJoinGroupContent permitJoinGroupContent, InterfaceC965990bFF interfaceC965990bFF, LinkLayerMessage linkLayerMessage) {
        super(0);
        this.LL = permitJoinGroupContent;
        this.LLILLJJLI = interfaceC965990bFF;
        this.LLILLL = linkLayerMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PermitJoinGroupContent permitJoinGroupContent = this.LL;
        int i = permitJoinGroupContent.type;
        if (i == 102) {
            InterfaceC965990bFF interfaceC965990bFF = this.LLILLJJLI;
            LinkLayerMessage linkLayerMessage = this.LLILLL;
            interfaceC965990bFF.LJLI(new ReplyInviteGroupMessage(linkLayerMessage, permitJoinGroupContent.agreeStatus, permitJoinGroupContent.approver, linkLayerMessage.bizContent));
        } else if (i == 100) {
            InterfaceC965990bFF interfaceC965990bFF2 = this.LLILLJJLI;
            LinkLayerMessage linkLayerMessage2 = this.LLILLL;
            interfaceC965990bFF2.LLIIIJ(new PermitApplyGroupMessage(linkLayerMessage2, permitJoinGroupContent.agreeStatus, permitJoinGroupContent.approver, linkLayerMessage2.bizContent));
        }
        return Unit.LIZ;
    }
}
