package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X79, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X79 extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ WebKitView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X79(WebKitView webKitView) {
        super(1);
        this.LL = webKitView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C0X78 c0x78;
        String str2 = str;
        if (str2 != null) {
            WebKitView webKitView = this.LL;
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int iOptInt = jSONObject.optInt("preload_type", 0);
                String strOptString = jSONObject.optString("request_loader_type");
                if (Intrinsics.LJFF(strOptString, "FILE")) {
                    c0x78 = C0X78.TTWEB_OFFLINE;
                } else if (Intrinsics.LJFF(strOptString, "TTNET")) {
                    c0x78 = C0X78.TTWEB_TTNET;
                } else if (iOptInt != 0) {
                    c0x78 = C0X78.TTWEB_PRELOAD;
                }
                if (c0x78 != null) {
                    String value = c0x78.getValue();
                    try {
                        C086F c086f = C086F.LIZ;
                        C0X77 c0x77 = new C0X77(webKitView, value, jSONObject);
                        c086f.getClass();
                        C086F.LJI(c0x77);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        return Unit.LIZ;
    }
}
