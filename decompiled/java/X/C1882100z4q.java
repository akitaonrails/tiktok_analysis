package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.GamePreregisterResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882100z4q extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1882050z4l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882100z4q(C1882050z4l c1882050z4l, String str) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c1882050z4l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C20441214yg.LIZIZ("GamePreregisterService", "handleGamePreregisterRequestEvent requestPreregisterGame onSuccess");
        GamePreregisterResultParam gamePreregisterResultParam = new GamePreregisterResultParam();
        String str = this.LL;
        C1882050z4l c1882050z4l = this.LLILLJJLI;
        gamePreregisterResultParam.isRegister = false;
        gamePreregisterResultParam.gameId = str;
        gamePreregisterResultParam.result = true;
        gamePreregisterResultParam.from = c1882050z4l.LL.getPage().LIZLLL();
        C1882650z5j.LIZIZ("gamePartnershipMixViewReserveAndOpenCompletion", gamePreregisterResultParam);
        return Unit.LIZ;
    }
}
