package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.PcsAudienceDecorationWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145180fuG extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ PcsAudienceDecorationWidget LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145180fuG(PcsAudienceDecorationWidget pcsAudienceDecorationWidget, long j) {
        super(1);
        this.LL = pcsAudienceDecorationWidget;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        DataChannel dataChannel = this.LL.dataChannel;
        c062p.LIZ = new C1145200fuI(this.LLILLJJLI, EnumC1083620eIy.AUDIENCE, dataChannel);
        return Unit.LIZ;
    }
}
