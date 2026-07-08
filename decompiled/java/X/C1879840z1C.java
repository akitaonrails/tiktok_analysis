package X;

import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879840z1C extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1881590z41 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879840z1C(C1881590z41 c1881590z41) {
        super(0);
        this.LL = c1881590z41;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GameCTAInfo gameCTAInfo;
        GameCTAInfo gameCTAInfo2;
        String strLJFF = C1882380z5I.LJFF(this.LL.LJII(), "task_id");
        String strLJFF2 = C1882380z5I.LJFF(this.LL.LJII(), "host_id");
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ = this.LL.LJIIIZ();
        GameStationGameInfo gameStationGameInfo = this.LL.LLJILLL;
        String str = null;
        Integer numValueOf = (gameStationGameInfo == null || (gameCTAInfo2 = gameStationGameInfo.gameCtaInfo) == null) ? null : Integer.valueOf(gameCTAInfo2.gameCtaStatus);
        GameStationGameInfo gameStationGameInfo2 = this.LL.LLJILLL;
        if (gameStationGameInfo2 != null && (gameCTAInfo = gameStationGameInfo2.gameCtaInfo) != null) {
            str = gameCTAInfo.ctaLogExtra;
        }
        C1880070z1Z.LIZLLL(interfaceC1881340z3cLJIIIZ, numValueOf, strLJFF2, strLJFF, true, str);
        C1879830z1B.LIZ(this.LL.LJIIIZ());
        return Unit.LIZ;
    }
}
