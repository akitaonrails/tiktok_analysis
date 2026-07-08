package X;

import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822560WOo extends AbstractC822580WOq {
    public static final C822560WOo LIZ = new C822560WOo();
    public static final C822550WOn LIZIZ = new C822550WOn();

    @Override // X.InterfaceC822600WOs
    public final InterfaceC822600WOs getNext() {
        return LIZIZ;
    }

    @Override // X.InterfaceC822570WOp
    public final Pair LIZ(LynxView lynxView, String str) {
        Object tag;
        final String str2;
        String strLIZ;
        if (lynxView != null) {
            tag = lynxView.getTag(R.id.cy2);
        } else {
            tag = null;
        }
        final boolean zLJFF = Intrinsics.LJFF("bullet", tag);
        if (str == null) {
            str2 = "AndroidNotSet";
        } else {
            str2 = str;
        }
        C15O7.LIZJ(new Callable() { // from class: X.0WVg
            @Override // java.util.concurrent.Callable
            public final Object call() throws JSONException {
                C1C7U.LIZ("MonitorProcessor@a1de.reportBulletLynxLoad$1");
                String str3 = zLJFF ? "bullet_new" : "others";
                C1520360pfO c1520360pfO = new C1520360pfO("bdx_monitor_container_coverage_lynx_pv");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_url", str2);
                jSONObject.put("container_type", str3);
                c1520360pfO.LIZLLL = jSONObject;
                c1520360pfO.LIZ = str2;
                c1520360pfO.LJIIL = new C1520400pfS();
                C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                c1520380pfQ.getClass();
                C1520380pfQ.LIZ(c1520350pfNLIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MonitorProcessor@a1de.reportBulletLynxLoad$1");
                return unit;
            }
        });
        Pair pairLIZ = LIZIZ.LIZ(lynxView, str);
        if (!((Boolean) pairLIZ.getSecond()).booleanValue()) {
            C295501Cn c295501CnLIZIZ = C295301Cl.LIZIZ((String) pairLIZ.getFirst());
            if (c295501CnLIZIZ == null || (strLIZ = c295501CnLIZIZ.LIZ()) == null) {
                strLIZ = "";
            }
            C822610WOt.LIZ(new C824330WVj(10003, strLIZ));
        }
        return pairLIZ;
    }

    @Override // X.AbstractC822580WOq, X.InterfaceC822590WOr
    public final String onLoadUrl(WebView webView, final String str) {
        if (str != null) {
            final String name = webView.getClass().getName();
            C15O7.LIZJ(new Callable() { // from class: X.0WVf
                @Override // java.util.concurrent.Callable
                public final Object call() throws JSONException {
                    C1C7U.LIZ("MonitorProcessor@a1de.reportBulletWebLoad$1");
                    if (u.LJJIIJZLJL(str, "http", false)) {
                        String string = "";
                        try {
                            string = UriProtector.parse(str).buildUpon().clearQuery().toString();
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                        C1520360pfO c1520360pfO = new C1520360pfO("bdx_monitor_container_coverage_web_pv");
                        JSONObject jSONObject = new JSONObject();
                        String str2 = str;
                        String str3 = name;
                        jSONObject.put("web_url", str2);
                        jSONObject.put("webview_class", str3);
                        c1520360pfO.LIZLLL = jSONObject;
                        c1520360pfO.LIZ = string;
                        c1520360pfO.LJIIL = new C1520400pfS();
                        C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
                        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                        c1520380pfQ.getClass();
                        C1520380pfQ.LIZ(c1520350pfNLIZ);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MonitorProcessor@a1de.reportBulletWebLoad$1");
                    return unit;
                }
            });
        }
        return super.onLoadUrl(webView, str);
    }
}
