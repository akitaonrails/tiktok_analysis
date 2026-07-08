package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: renamed from: X.0bG1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966470bG1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC965990bFF LL;
    public final /* synthetic */ LinkLayerMessage LLILLJJLI;
    public final /* synthetic */ GroupPlayer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966470bG1(InterfaceC965990bFF interfaceC965990bFF, LinkLayerMessage linkLayerMessage, GroupPlayer groupPlayer) {
        super(0);
        this.LL = interfaceC965990bFF;
        this.LLILLJJLI = linkLayerMessage;
        this.LLILLL = groupPlayer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLFFF(new LeaveGroupMessage(this.LLILLJJLI, this.LLILLL));
        return Unit.LIZ;
    }
}
