package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969370bKh extends C09AY implements Function2<String, Long, Unit> {
    public final /* synthetic */ C969390bKj LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ JSONObject LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C969370bKh(C969390bKj c969390bKj, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        super(2);
        this.LL = c969390bKj;
        this.LLILLJJLI = str;
        this.LLILLL = jSONObject;
        this.LLILZ = jSONObject2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Long l) {
        JSONObject jSONObject;
        String str2 = str;
        l.longValue();
        if ((!a0.LJJJIL(str2)) && !Intrinsics.LJFF(str2, "{}")) {
            C969390bKj c969390bKj = this.LL;
            String str3 = this.LLILLJJLI;
            JSONObject jSONObject2 = this.LLILLL;
            JSONObject jSONObject3 = this.LLILZ;
            c969390bKj.getClass();
            JSONObject jSONObject4 = new JSONObject();
            if (jSONObject3 != null && jSONObject3.has("code")) {
                try {
                    JSONObject jSONObject5 = new JSONObject();
                    C0K04.LJFF("code", JSONObjectProtectorUtils.getString(jSONObject3, "code"), jSONObject5);
                    C0K04.LJI("code", new JSONArray().put(jSONObject5), jSONObject4);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJFF("LiveLogService", "", th);
                }
            }
            try {
                jSONObject = new JSONObject(C786410Ut5.J3(jSONObject2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = new JSONObject();
            }
            C0K04.LJII("extra", jSONObject, jSONObject3);
            C0K04.LJI("event", new JSONArray().put(jSONObject), jSONObject4);
            InterfaceC969400bKk interfaceC969400bKk = c969390bKj.LJI;
            if (interfaceC969400bKk != null) {
                interfaceC969400bKk.LIZIZ(false, -1L, true, str3, C786410Ut5.J3(jSONObject4), false);
            }
        }
        return Unit.LIZ;
    }
}
