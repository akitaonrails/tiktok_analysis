package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603310rpB {
    public static final C1603310rpB LIZ = new C1603310rpB();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C990290bsR());
    public static Long LIZJ;
    public static boolean LIZLLL;

    public static void LIZIZ(String str) throws JSONException {
        Long l;
        String str2;
        C01GW c01gw = LIZIZ;
        C1603320rpC c1603320rpC = (C1603320rpC) ((LinkedHashMap) c01gw.getValue()).get(str);
        if (c1603320rpC == null) {
            return;
        }
        if (C20684815ws.LJI("request_to_show_interval")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("request_type", c1603320rpC.LIZIZ.getValue());
            jSONObject.putOpt("request_id", c1603320rpC.LIZ);
            jSONObject.putOpt("request_timestamp", Long.valueOf(c1603320rpC.LIZJ));
            jSONObject.putOpt("response_timestamp", Long.valueOf(c1603320rpC.LIZLLL));
            jSONObject.putOpt("request_latency", Long.valueOf(c1603320rpC.LJ));
            jSONObject.putOpt("this_brush_first_video_show_timestamp", Long.valueOf(System.currentTimeMillis()));
            if (c1603320rpC.LIZIZ == EnumC1603300rpA.OPEN) {
                l = null;
            } else {
                l = LIZJ;
            }
            jSONObject.putOpt("last_brush_last_video_show_timestamp", l);
            if (LIZLLL) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.putOpt("is_optimized_by_show_gap", str2);
            C20684815ws.LJIJ("request_to_show_interval", jSONObject);
        }
        LIZLLL = false;
        ((HashMap) c01gw.getValue()).remove(str);
    }

    public static final void LIZ(int i, List list) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            c098200Yq = (Aweme) list.get(i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Aweme aweme = (Aweme) c098200Yq;
        if (aweme != null && AwemeBizExtKt.getRid(aweme) != null) {
            AwemeBizExtKt.getRid(aweme);
            try {
                c098200Yq2 = (Aweme) list.get(i - 1);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            Aweme aweme2 = (Aweme) obj;
            String str = "";
            if (aweme2 != null) {
                String rid = AwemeBizExtKt.getRid(aweme2);
                if (rid == null || rid.length() == 0 || !Intrinsics.LJFF(AwemeBizExtKt.getRid(aweme2), AwemeBizExtKt.getRid(aweme))) {
                    C1603310rpB c1603310rpB = LIZ;
                    String rid2 = AwemeBizExtKt.getRid(aweme);
                    if (rid2 != null) {
                        str = rid2;
                    }
                    c1603310rpB.getClass();
                    LIZIZ(str);
                }
            } else {
                C1603310rpB c1603310rpB2 = LIZ;
                String rid3 = AwemeBizExtKt.getRid(aweme);
                if (rid3 != null) {
                    str = rid3;
                }
                c1603310rpB2.getClass();
                LIZIZ(str);
            }
            LIZJ = Long.valueOf(System.currentTimeMillis());
            return;
        }
        LIZJ = Long.valueOf(System.currentTimeMillis());
    }
}
