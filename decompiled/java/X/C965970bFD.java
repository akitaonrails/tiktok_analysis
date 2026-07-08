package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tikcast.linkmic.common.GroupPlayer;
import webcast.im.CancelJoinGroupContent;

/* JADX INFO: renamed from: X.0bFD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965970bFD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CancelJoinGroupContent LL;
    public final /* synthetic */ InterfaceC965990bFF LLILLJJLI;
    public final /* synthetic */ LinkLayerMessage LLILLL;
    public final /* synthetic */ List<GroupPlayer> LLILZ;
    public final /* synthetic */ GroupPlayer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965970bFD(CancelJoinGroupContent cancelJoinGroupContent, InterfaceC965990bFF interfaceC965990bFF, LinkLayerMessage linkLayerMessage, List<GroupPlayer> list, GroupPlayer groupPlayer) {
        super(0);
        this.LL = cancelJoinGroupContent;
        this.LLILLJJLI = interfaceC965990bFF;
        this.LLILLL = linkLayerMessage;
        this.LLILZ = list;
        this.LLILZIL = groupPlayer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.LL.type;
        if (i == 102) {
            this.LLILLJJLI.LJLIIIL(new CancelInviteGroupMessage(this.LLILLL, this.LLILZ, this.LLILZIL));
        } else if (i == 100) {
            this.LLILLJJLI.LLIIIZ(new CancelApplyGroupMessage(this.LLILLL, this.LLILZ, this.LLILZIL));
        }
        return Unit.LIZ;
    }
}
