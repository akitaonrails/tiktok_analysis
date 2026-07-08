package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data.LiveTaskCardData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.183X, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C183X extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C183V LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ LiveTaskCardData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C183X(C183V c183v, Context context, LiveTaskCardData liveTaskCardData) {
        super(1);
        this.LL = c183v;
        this.LLILLJJLI = context;
        this.LLILLL = liveTaskCardData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) throws JSONException {
        C183V c183v = this.LL;
        C212210182u c212210182u = c183v.LLIZ;
        if (c212210182u != null) {
            Map<String, String> mapLJIIJ = c183v.LJIIJ();
            JSONObject jSONObjectLIZ = c212210182u.LIZ();
            Set<Map.Entry> setEntrySet = ((LinkedHashMap) mapLJIIJ).entrySet();
            if (setEntrySet != null) {
                for (Map.Entry entry : setEntrySet) {
                    jSONObjectLIZ.put((String) entry.getKey(), entry.getValue());
                }
            }
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("livesdk_tiktokec_card_click", jSONObjectLIZ);
        }
        this.LL.LJIIJJI(EnumC1779100wOi.VIEW_DETAIL);
        try {
            SmartRouter.buildRoute(this.LLILLJJLI, this.LLILLL.schema).open();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
