package X;

import com.bytedance.android.livesdk.api.revenue.strategy.guide.TriggerApi;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01JR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01JR implements InterfaceC1145110fu9 {
    public long LIZ;
    public final List<String> LIZIZ = LiveClientTriggerConfig.INSTANCE.guideTriggerBusinessNames();

    @Override // X.InterfaceC1145110fu9
    public final List<String> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1145110fu9
    public final void LIZIZ(String str, C01JS c01js) {
        String strOptString;
        JSONArray jSONArray;
        JSONObject jSONObjectOptJSONObject;
        long j = c01js.LIZJ;
        long j2 = this.LIZ;
        if (j2 == 0) {
            return;
        }
        C206400qs c206400qs = TriggerApi.LIZ;
        List listSingletonList = Collections.singletonList(str);
        String str2 = c01js.LIZIZ;
        String str3 = c01js.LIZLLL;
        String str4 = c01js.LJII;
        String str5 = c01js.LJI;
        try {
            jSONArray = c01js.LJIIIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (jSONArray != null) {
            int i = 0;
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, jSONArray.length()).iterator();
            loop0: while (it2.LLILLL) {
                JSONArray jSONArrayOptJSONArray = c01js.LJIIIZ.optJSONArray(it2.nextInt());
                if (jSONArrayOptJSONArray != null) {
                    C531650Kt9 it3 = C13LZ.LJIILJJIL(i, jSONArrayOptJSONArray.length()).iterator();
                    while (it3.LLILLL) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(it3.nextInt());
                        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("params")) != null) {
                            strOptString = jSONObjectOptJSONObject.optString("sub_trigger_name");
                        } else {
                            strOptString = null;
                        }
                        if (C500260Jjc.LJJIIZ(strOptString)) {
                            break loop0;
                        }
                    }
                }
                i = 0;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            strOptString = null;
        } else {
            strOptString = null;
        }
        c206400qs.getClass();
        C206400qs.LIZIZ(j2, listSingletonList, str2, j, str3, str4, str5, strOptString, null);
    }
}
