package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17vi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21187217vi extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C21187517vl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C21187017vg LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21187217vi(String str, C21187517vl c21187517vl, String str2, C21187017vg c21187017vg, String str3, String str4, String str5, String str6) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c21187517vl;
        this.LLILLL = str2;
        this.LLILZ = c21187017vg;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LaneParams laneParams) {
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign(Scene.SCENE_SERVICE, this.LL);
        laneParams2.plusAssign("path", this.LLILLJJLI.LJIIJJI);
        laneParams2.plusAssign("source", this.LLILLL);
        laneParams2.plusAssign("result", Integer.valueOf(this.LLILZ.LIZ()));
        laneParams2.plusAssign("key", this.LLILZ.LIZ);
        laneParams2.plusAssign("type", Integer.valueOf(this.LLILZ.LIZIZ.getValue()));
        laneParams2.plusAssign("type_sec", this.LLILZ.LIZIZ.name());
        laneParams2.plusAssign("app_channel", C1547310qMr.LIZ());
        String str = this.LLILZIL;
        if (str != null) {
            laneParams2.plusAssign("js_version", str);
        }
        String str2 = this.LLILZLL;
        if (str2 != null) {
            laneParams2.plusAssign("rule_version", str2);
        }
        String str3 = this.LLILZ.LJ;
        if (str3 != null) {
            laneParams2.plusAssign("rule_id", str3);
        }
        String str4 = this.LLILZ.LJFF;
        if (str4 != null) {
            laneParams2.plusAssign("biz_id", str4);
        }
        String str5 = this.LLILZ.LJI;
        if (str5 != null) {
            laneParams2.plusAssign("btm", str5);
        }
        laneParams2.plusAssign("engine", this.LLIZ);
        String str6 = this.LLILLL;
        C21187517vl c21187517vl = this.LLILLJJLI;
        String str7 = this.LLIZLLLIL;
        try {
            JSONObject jSONObject = new JSONObject();
            if (str7 != null) {
                jSONObject.put("log_id", str7);
            }
            laneParams2.plusAssign("context", C786410Ut5.J3(jSONObject));
            if (C1915807eu.LIZ().enable) {
                laneParams2.plusAssign("cluster_key", C1953207kw.LIZJ(str6, c21187517vl.LJIIJJI));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
