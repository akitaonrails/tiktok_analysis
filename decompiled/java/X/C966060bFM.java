package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.PermitApplyContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966060bFM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InterfaceC965990bFF LLILLJJLI;
    public final /* synthetic */ C965980bFE LLILLL;
    public final /* synthetic */ PermitApplyMessage LLILZ;
    public final /* synthetic */ LinkLayerMessage LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966060bFM(boolean z, InterfaceC965990bFF interfaceC965990bFF, C965980bFE c965980bFE, PermitApplyMessage permitApplyMessage, LinkLayerMessage linkLayerMessage) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = interfaceC965990bFF;
        this.LLILLL = c965980bFE;
        this.LLILZ = permitApplyMessage;
        this.LLILZIL = linkLayerMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            this.LLILLJJLI.LJLJLJ(this.LLILLL.LL, this.LLILZ);
        } else {
            PermitApplyContent permitApplyContent = this.LLILZIL.permitApplyContent;
            if (LinkCoreModelKt.playerIsCurrentUserOrNull(permitApplyContent != null ? permitApplyContent.applier : null)) {
                this.LLILLJJLI.LJLZ(this.LLILLL.LL, this.LLILZ);
            } else {
                C965980bFE c965980bFE = this.LLILLL;
                C1AZW.LJIIIZ(c965980bFE.LL.LJJ, c965980bFE.LLILZLL, "onAudienceHandlePermitApplyMessage: moderator receive permit message", null, null);
            }
        }
        return Unit.LIZ;
    }
}
