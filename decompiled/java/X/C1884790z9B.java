package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.common.model.GameInfoCardModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroCardAssem;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0z9B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884790z9B extends C09AY implements Function2<UIAssem, Boolean, Unit> {
    public final /* synthetic */ GameIntroCardAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884790z9B(GameIntroCardAssem gameIntroCardAssem) {
        super(2);
        this.LL = gameIntroCardAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Boolean bool) {
        String str;
        GameStationGameInfo gameStationGameInfo;
        Boolean bool2 = bool;
        if (bool2 != null) {
            GameIntroCardAssem gameIntroCardAssem = this.LL;
            if (bool2.booleanValue()) {
                C16F5 c16f5 = gameIntroCardAssem.LLJJJJ;
                if (c16f5 != null) {
                    c16f5.setText(gameIntroCardAssem.tp(gameIntroCardAssem.ip().LLILZIL));
                }
                gameIntroCardAssem.mp();
                C16F5 c16f52 = gameIntroCardAssem.LLJJJJLIIL;
                if (c16f52 != null) {
                    c16f52.setText(gameIntroCardAssem.LLJLILLLLZIIL);
                }
            } else {
                C16F5 c16f53 = gameIntroCardAssem.LLJJJJ;
                if (c16f53 != null) {
                    GameInfoCardModel gameInfoCardModel = ((C1884770z99) gameIntroCardAssem.ip().getState()).LL;
                    if (gameInfoCardModel == null || (gameStationGameInfo = gameInfoCardModel.gameInfo) == null || (str = gameStationGameInfo.introduction) == null) {
                        str = "";
                    }
                    c16f53.setText(gameIntroCardAssem.tp(str));
                }
                gameIntroCardAssem.mp();
                C16F5 c16f54 = gameIntroCardAssem.LLJJJJLIIL;
                if (c16f54 != null) {
                    c16f54.setText(gameIntroCardAssem.LLJLIL);
                }
            }
        }
        return Unit.LIZ;
    }
}
