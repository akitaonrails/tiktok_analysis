package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.GamePartnershipService;
import com.bytedance.android.livesdk.game.model.UserInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ylh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1870230ylh extends C09AY implements Function2<JSONObject, UserInfo, Unit> {
    public final /* synthetic */ Function2<JSONObject, UserInfo, Unit> LL;
    public final /* synthetic */ GamePartnershipService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1870230ylh(Function2<? super JSONObject, ? super UserInfo, Unit> function2, GamePartnershipService gamePartnershipService) {
        super(2);
        this.LL = function2;
        this.LLILLJJLI = gamePartnershipService;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(JSONObject jSONObject, UserInfo userInfo) {
        UserInfo userInfo2 = userInfo;
        if (userInfo2 != null) {
            this.LLILLJJLI.LIZ().LIZJ = userInfo2;
        }
        this.LL.invoke(jSONObject, userInfo2);
        return Unit.LIZ;
    }
}
