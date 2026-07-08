package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.model.message.linkcore.InviteContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966070bFN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C965980bFE LL;
    public final /* synthetic */ InterfaceC965990bFF LLILLJJLI;
    public final /* synthetic */ InviteMessage LLILLL;
    public final /* synthetic */ LinkLayerMessage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966070bFN(C965980bFE c965980bFE, InterfaceC965990bFF interfaceC965990bFF, InviteMessage inviteMessage, LinkLayerMessage linkLayerMessage) {
        super(0);
        this.LL = c965980bFE;
        this.LLILLJJLI = interfaceC965990bFF;
        this.LLILLL = inviteMessage;
        this.LLILZ = linkLayerMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C966020bFI c966020bFI = this.LL.LL;
        if (c966020bFI.LIZIZ) {
            this.LLILLJJLI.LJLLLL(c966020bFI, this.LLILLL);
        } else {
            InviteContent inviteContent = this.LLILZ.inviteContent;
            if (LinkCoreModelKt.playerIsCurrentUserOrNull(inviteContent != null ? inviteContent.invitee : null)) {
                this.LLILLJJLI.LJLJJI(this.LL.LL, this.LLILLL);
            } else {
                C965980bFE c965980bFE = this.LL;
                C1AZW.LJIIIZ(c965980bFE.LL.LJJ, c965980bFE.LLILZLL, "handleInviteMessageForAudience: moderator receive invite message", null, null);
            }
        }
        return Unit.LIZ;
    }
}
