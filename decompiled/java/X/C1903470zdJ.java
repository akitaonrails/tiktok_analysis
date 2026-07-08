package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903470zdJ extends C1619110sEf {
    public static final C1903470zdJ LL = new C1903470zdJ();

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        String bizExtraJsonStr;
        String string;
        String string2;
        Object c098200Yq;
        if (innerPushMessage != null && (bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr()) != null) {
            JSONObject jSONObject = new JSONObject(bizExtraJsonStr);
            Object objOpt = jSONObject.opt("channel_id");
            if (objOpt == null || (string = objOpt.toString()) == null) {
                string = "";
            }
            Object objOpt2 = jSONObject.opt("is_author");
            if (objOpt2 != null) {
                string2 = objOpt2.toString();
            } else {
                string2 = null;
            }
            C0OPQ c0opq = C0OPQ.LIZ;
            C1903470zdJ c1903470zdJ = LL;
            String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
            c1903470zdJ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (mobEventJsonStr != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject(mobEventJsonStr);
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        linkedHashMap.put(next, jSONObject2.optString(next));
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
            linkedHashMap.put("action_type", "show");
            Boolean boolValueOf = Boolean.valueOf(Intrinsics.LJFF(string2, "1"));
            c0opq.getClass();
            C0OPQ.LJ(boolValueOf, string, linkedHashMap);
        }
    }
}
