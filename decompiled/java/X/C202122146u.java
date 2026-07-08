package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.146u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202122146u extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202122146u(boolean z, boolean z2, int i, int i2, int i3) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        boolean z = this.LL;
        boolean z2 = this.LLILLJJLI;
        int i = this.LLILLL;
        int i2 = this.LLILZ;
        int i3 = this.LLILZIL;
        jSONObject.put("dex2oat_task_has_triggered", z);
        jSONObject.put("dex2oat_cmd_has_triggered", z2);
        jSONObject.put("dex2oat_cmd_not_triggered_reason", i);
        jSONObject.put("dex2oat_cmd_execute_result", i2);
        jSONObject.put("dex2oat_cmd_triggered_type", i3);
        C20684815ws.LJIJ("force_dex2oat_report", jSONObject);
        return Unit.LIZ;
    }
}
