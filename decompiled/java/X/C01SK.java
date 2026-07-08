package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.01SK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01SK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Room LL;
    public final /* synthetic */ C01SI LLILLJJLI;
    public final /* synthetic */ InterfaceC756140TlM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01SK(Room room, C01SI c01si, InterfaceC756140TlM interfaceC756140TlM) {
        super(0);
        this.LL = room;
        this.LLILLJJLI = c01si;
        this.LLILLL = interfaceC756140TlM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Room room = this.LL;
        if (room != null) {
            ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).Wo2(room.getId(), new AwS394S0200000_28(this.LLILLJJLI, this.LLILLL, 5));
        }
        return Unit.LIZ;
    }
}
