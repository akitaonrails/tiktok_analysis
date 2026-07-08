package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619740sFg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1619740sFg(int i, int i2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = this.LL;
            int i2 = this.LLILLJJLI;
            linkedHashMap.put("request_type", String.valueOf(i));
            linkedHashMap.put("request_cnt", String.valueOf(i2));
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            linkedHashMap.put("region", abstractC1896090zRP != null ? abstractC1896090zRP.LJIJJ() : null);
            linkedHashMap.put("is_login", C1894310zOX.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
            interfaceC1897260zTILIZIZ.LIZ("touch_point_start_request", linkedHashMap);
        }
        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
        int i3 = this.LL;
        int i4 = this.LLILLJJLI;
        c1893680zNW.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            jSONObject.put("region", abstractC1896090zRP2 != null ? abstractC1896090zRP2.LJIJJ() : null);
            jSONObject.put("request_type", i3);
            jSONObject.put("request_cnt", i4);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ2 != null) {
            interfaceC1897260zTILIZIZ2.LIZIZ("touchpoint_start_request_monitor", jSONObject);
        }
        return Unit.LIZ;
    }
}
