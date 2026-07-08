package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bF5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965890bF5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC965990bFF LL;
    public final /* synthetic */ C965980bFE LLILLJJLI;
    public final /* synthetic */ LinkUser LLILLL;
    public final /* synthetic */ OnLineMicInfo LLILZ;
    public final /* synthetic */ LinkLayerMessage LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965890bF5(InterfaceC965990bFF interfaceC965990bFF, C965980bFE c965980bFE, LinkUser linkUser, OnLineMicInfo onLineMicInfo, LinkLayerMessage linkLayerMessage) {
        super(0);
        this.LL = interfaceC965990bFF;
        this.LLILLJJLI = c965980bFE;
        this.LLILLL = linkUser;
        this.LLILZ = onLineMicInfo;
        this.LLILZIL = linkLayerMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLIILZL(this.LLILLJJLI.LL, new DirectJoinMessage(this.LLILLL, this.LLILZ, C954920axO.LJ(this.LLILZIL, null)));
        return Unit.LIZ;
    }
}
