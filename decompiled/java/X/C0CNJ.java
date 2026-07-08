package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0CNJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CNJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CNJ(C0CJT c0cjt) {
        super(0);
        this.LL = c0cjt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Integer numValueOf = Integer.valueOf(LivePreCreateNextRoomPlayer.ENABLE);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(this.LL, 214);
        C1491980ovc.LIZ.LIZ(new C1491990ovd("FetchABScheduleTaskIdle", true, EnumC1492100ovo.IDLE_BG, numValueOf), null, new AwS548S0100000_4(awS548S0100000_4, (Function0<Unit>) 29));
        return Unit.LIZ;
    }
}
