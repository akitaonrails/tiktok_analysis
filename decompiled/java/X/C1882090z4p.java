package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.GamePreregisterResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882090z4p extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1882050z4l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882090z4p(C1882050z4l c1882050z4l, String str) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c1882050z4l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        C20441214yg.LJ("GamePreregisterService", "handleGamePreregisterRequestEvent requestPreregisterGame onFailure");
        GamePreregisterResultParam gamePreregisterResultParam = new GamePreregisterResultParam();
        String str = this.LL;
        C1882050z4l c1882050z4l = this.LLILLJJLI;
        gamePreregisterResultParam.isRegister = false;
        gamePreregisterResultParam.gameId = str;
        gamePreregisterResultParam.result = false;
        gamePreregisterResultParam.from = c1882050z4l.LL.getPage().LIZLLL();
        C1882650z5j.LIZIZ("gamePartnershipMixViewReserveAndOpenCompletion", gamePreregisterResultParam);
        return Unit.LIZ;
    }
}
