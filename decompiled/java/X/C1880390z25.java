package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.preregister.GamePreRegisterCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0z25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880390z25 extends C09AY implements Function2<Boolean, Throwable, Unit> {
    public final /* synthetic */ GamePreRegisterCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880390z25(GamePreRegisterCard gamePreRegisterCard) {
        super(2);
        this.LL = gamePreRegisterCard;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Throwable th) {
        if (bool.booleanValue()) {
            this.LL.LJJJJZ(false);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pre-register checkLogin failed, error = ");
            sbLIZ.append(th);
            C20441214yg.LIZIZ("GamePreRegisterCard", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }
}
