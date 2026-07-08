package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.GameDownloadResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882120z4s extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C1882060z4m LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882120z4s(Function0<Unit> function0, C1882060z4m c1882060z4m) {
        super(1);
        this.LL = function0;
        this.LLILLJJLI = c1882060z4m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        this.LL.invoke();
        GameDownloadResultParam gameDownloadResultParam = new GameDownloadResultParam();
        C1882060z4m c1882060z4m = this.LLILLJJLI;
        gameDownloadResultParam.result = true;
        gameDownloadResultParam.gameId = C1882380z5I.LJFF(C1882380z5I.LIZJ(c1882060z4m.LL.getPage()), "game_id");
        gameDownloadResultParam.from = c1882060z4m.LL.getPage().LIZLLL();
        C1882650z5j.LIZIZ("gamePartnershipMixViewDownloadCompletion", gameDownloadResultParam);
        return Unit.LIZ;
    }
}
