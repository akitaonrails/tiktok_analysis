package Y;

import X.C0J3L;
import X.C1161920gLG;
import X.C20441214yg;
import X.C465900IOu;
import X.C784440Upu;
import X.C915980Zwa;
import X.C974540bT2;
import X.EnumC919210a1n;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchAudienceWidgetV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AObjectS68S0000000_15 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public AObjectS68S0000000_15(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS68S0000000_15 aObjectS68S0000000_15) {
        return String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId());
    }

    public static final Object invoke$1(AObjectS68S0000000_15 aObjectS68S0000000_15) {
        C784440Upu.LIZ().LIZIZ(new C465900IOu(8));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS68S0000000_15 aObjectS68S0000000_15) {
        C20441214yg.LJIIIZ("MultiCoHostWidget", "loadMatchWidget cache miss");
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        c974540bT2.LJJJLL(C915980Zwa.LJI().LJIIJ().getChannelId(), EnumC919210a1n.SUPPORT_MULTI);
        C0J3L c0j3l = C0J3L.COHOST_LINKED;
        c974540bT2.LJJLIL(false);
        return new MatchAudienceWidgetV2(c0j3l);
    }
}
