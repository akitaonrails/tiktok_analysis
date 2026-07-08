package X;

import com.bytedance.lynx.hybrid.webkit.GlobalProps;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WTB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTB {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    public static void LIZ(final WebKitView webKitView, final Map map) {
        final C259800zU c259800zU = new C259800zU();
        if (map != null && !map.isEmpty()) {
            ?? J3 = C786410Ut5.J3(new JSONObject(map));
            c259800zU.element = J3;
            if (J3 == 0) {
                return;
            }
            Object tag = webKitView.getTag(R.id.jti);
            if (tag == null) {
                C086F c086f = C086F.LIZ;
                Runnable runnable = new Runnable() { // from class: X.0WTA
                    public final void LIZ() {
                        GlobalProps globalProps = new GlobalProps();
                        globalProps.LIZ = c259800zU.element;
                        globalProps.LIZIZ = map;
                        webKitView.getSettings().setJavaScriptEnabled(true);
                        webKitView.addJavascriptInterface(globalProps, "__globalprops");
                        webKitView.setTag(R.id.jti, globalProps);
                        C1490740otc.LIZ.LIZ("injectGlobalProps:successfully set", EnumC1490770otf.D, "webkit");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("GlobalPropsHelper$Companion@9e99.inject$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("GlobalPropsHelper$Companion@9e99.inject$1");
                    }
                };
                c086f.getClass();
                C086F.LJII(runnable);
                return;
            }
            if (!(tag instanceof GlobalProps)) {
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("injectGlobalProps:type mismatch, current type is ");
                sbLIZ.append(tag.getClass());
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "webkit");
                return;
            }
            C1490740otc.LIZ.LIZ("injectGlobalProps:already set", EnumC1490770otf.D, "webkit");
            GlobalProps globalProps = (GlobalProps) tag;
            globalProps.LIZ = (String) c259800zU.element;
            globalProps.LIZIZ = map;
        }
    }
}
