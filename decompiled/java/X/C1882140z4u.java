package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.GamePreregisterResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882140z4u extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1882050z4l LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882140z4u(Function0<Unit> function0, boolean z, String str, C1882050z4l c1882050z4l) {
        super(1);
        this.LL = function0;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = c1882050z4l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        this.LL.invoke();
        GamePreregisterResultParam gamePreregisterResultParam = new GamePreregisterResultParam();
        boolean z = this.LLILLJJLI;
        String str = this.LLILLL;
        C1882050z4l c1882050z4l = this.LLILZ;
        gamePreregisterResultParam.isRegister = !z;
        gamePreregisterResultParam.gameId = str;
        gamePreregisterResultParam.result = true;
        gamePreregisterResultParam.from = c1882050z4l.LL.getPage().LIZLLL();
        C1882650z5j.LIZIZ("gamePartnershipMixViewReserveCompletion", gamePreregisterResultParam);
        return Unit.LIZ;
    }
}
