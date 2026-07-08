package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966420bFw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InterfaceC965990bFF LLILLJJLI;
    public final /* synthetic */ C965980bFE LLILLL;
    public final /* synthetic */ ReplyInviteMessage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966420bFw(boolean z, InterfaceC965990bFF interfaceC965990bFF, C965980bFE c965980bFE, ReplyInviteMessage replyInviteMessage) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = interfaceC965990bFF;
        this.LLILLL = c965980bFE;
        this.LLILZ = replyInviteMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            this.LLILLJJLI.LLIIZ(this.LLILLL.LL, this.LLILZ);
        } else {
            this.LLILLJJLI.LLIFFJFJJ(this.LLILLL.LL, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
