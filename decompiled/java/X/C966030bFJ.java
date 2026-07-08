package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966030bFJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C965980bFE LL;
    public final /* synthetic */ C2231741CWm LLILLJJLI;
    public final /* synthetic */ LinkLayerMessage LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966030bFJ(C965980bFE c965980bFE, C2231741CWm c2231741CWm, LinkLayerMessage linkLayerMessage) {
        super(0);
        this.LL = c965980bFE;
        this.LLILLJJLI = c2231741CWm;
        this.LLILLL = linkLayerMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C965980bFE c965980bFE = this.LL;
        C965350bED c965350bED = c965980bFE.LL.LJJ;
        String str = c965980bFE.LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleLayerMessage joinGroupDirectModel = ");
        sbLIZ.append(this.LLILLJJLI.LJJIII);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LinkLayerMessage linkLayerMessage = this.LLILLL;
        C07W8 c07w8 = this.LLILLJJLI.LJJIII;
        JoinGroupDirectIMModel joinGroupDirectIMModel = new JoinGroupDirectIMModel(linkLayerMessage, c07w8 != null ? c07w8.LIZ : 0L, linkLayerMessage.bizContent);
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LL.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            interfaceC965990bFF.LJJJLIIL(joinGroupDirectIMModel);
        }
        return Unit.LIZ;
    }
}
