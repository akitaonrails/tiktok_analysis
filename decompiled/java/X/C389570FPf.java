package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0FPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389570FPf extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ C259800zU LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1801390wyf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C389570FPf(C259800zU c259800zU, long j, C1801390wyf c1801390wyf) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = j;
        this.LLILLL = c1801390wyf;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer, java.util.Timer] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) throws JSONException {
        if (this.LL.element == 0) {
            float fFloatValue = f.floatValue();
            C1537480q70 c1537480q70 = (C1537480q70) this.LLILLL.LLILZ.getValue();
            if (c1537480q70 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", 1600);
                jSONObject.put("data", Float.valueOf(fFloatValue));
                c1537480q70.LJJIIJZLJL(jSONObject, "studio.asrStateChange");
            }
            C259800zU c259800zU = this.LL;
            ?? pthreadTimer = new PthreadTimer("StudioToggleASR$throttledVolumeChange$2$invoke$$inlined$throttle$1");
            pthreadTimer.schedule(new C391480FWo(this.LL, 2), this.LLILLJJLI);
            c259800zU.element = pthreadTimer;
        }
        return Unit.LIZ;
    }
}
