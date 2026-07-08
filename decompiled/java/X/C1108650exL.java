package X;

import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0exL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108650exL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1108560exC LL;
    public final /* synthetic */ SubPinCard LLILLJJLI;
    public final /* synthetic */ C1108790exZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108650exL(C1108560exC c1108560exC, SubPinCard subPinCard, C1108790exZ c1108790exZ) {
        super(0);
        this.LL = c1108560exC;
        this.LLILLJJLI = subPinCard;
        this.LLILLL = c1108790exZ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IPinCardService iPinCardServiceLJIIIIZZ = this.LL.LJIIIIZZ();
        EnumC1107860ew4 enumC1107860ew4 = EnumC1107860ew4.SUB_PERKS;
        SubPinCard subPinCard = this.LLILLJJLI;
        C1108560exC c1108560exC = this.LL;
        iPinCardServiceLJIIIIZZ.DP(enumC1107860ew4, new C011S(subPinCard, c1108560exC.LLJIJIL, c1108560exC.LLJILJIL, c1108560exC.LJI()), this.LLILLL.LIZIZ, 30000L, null);
        return Unit.LIZ;
    }
}
