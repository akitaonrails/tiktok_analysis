package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.GamePreregisterResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882110z4r extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1882050z4l LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1882110z4r(Function1<? super Boolean, Unit> function1, boolean z, String str, C1882050z4l c1882050z4l) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = c1882050z4l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(Boolean.TRUE);
        GamePreregisterResultParam gamePreregisterResultParam = new GamePreregisterResultParam();
        boolean z = this.LLILLJJLI;
        String str = this.LLILLL;
        C1882050z4l c1882050z4l = this.LLILZ;
        gamePreregisterResultParam.isRegister = !z;
        gamePreregisterResultParam.gameId = str;
        gamePreregisterResultParam.result = false;
        gamePreregisterResultParam.from = c1882050z4l.LL.getPage().LIZLLL();
        C1882650z5j.LIZIZ("gamePartnershipMixViewReserveCompletion", gamePreregisterResultParam);
        return Unit.LIZ;
    }
}
