package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619730sFf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1619730sFf(int i, int i2, int i3, int i4, long j, String str) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = str;
        this.LLILZLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("request_success", String.valueOf(this.LL));
        linkedHashMap.put("request_type", String.valueOf(this.LLILLJJLI));
        linkedHashMap.put("request_cnt", String.valueOf(this.LLILLL));
        linkedHashMap.put("retry_cnt", String.valueOf(this.LLILZ));
        linkedHashMap.put("touch_point_ids", this.LLILZIL);
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
        linkedHashMap.put("region", abstractC1896090zRP != null ? abstractC1896090zRP.LJIJJ() : null);
        linkedHashMap.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
        linkedHashMap.put("is_login", C1894310zOX.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("touch_points_request", linkedHashMap);
        }
        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
        int i = this.LL;
        long j = this.LLILZLL;
        int i2 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        int i4 = this.LLILZ;
        c1893680zNW.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            jSONObject.put("region", abstractC1896090zRP2 != null ? abstractC1896090zRP2.LJIJJ() : null);
            jSONObject.put("duration", j);
            jSONObject.put("request_type", i2);
            jSONObject.put("request_cnt", i3);
            jSONObject.put("retry_cnt", i4);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ2 != null) {
            interfaceC1897260zTILIZIZ2.LIZIZ("touchpoint_request_monitor", jSONObject);
        }
        return Unit.LIZ;
    }
}
