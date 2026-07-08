package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725070uzZ {
    public final Context LIZ;
    public final String LIZIZ;
    public final InterfaceC1725100uzc LIZJ;

    public C1725070uzZ(Context context, String str, C1725050uzX c1725050uzX) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = c1725050uzX;
    }

    public final void LIZ(String str, String str2, String str3, InterfaceC1725110uzd interfaceC1725110uzd, Function0<Unit> function0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action_type", str2);
        jSONObject.put("ui_type", str);
        jSONObject.put("reason", "click_button");
        if (Intrinsics.LJFF(str2, EnumC957903on.OPEN_SCHEMA.getValue())) {
            if (C1948507kB.LIZ(str3)) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ, str3);
                smartRouteBuildRoute.withParam("product", this.LIZIZ);
                smartRouteBuildRoute.open();
                function0.invoke();
                this.LIZJ.LIZ(null, "perform_button_action", jSONObject);
                return;
            }
            function0.invoke();
            this.LIZJ.LIZIZ("perform_button_action", EnumC1725040uzW.PERFORM_BUTTON_ACTION_SCHEMA_PARAM_NULL, null);
            return;
        }
        if (Intrinsics.LJFF(str2, EnumC957903on.CLOSE.getValue())) {
            function0.invoke();
            this.LIZJ.LIZ(null, "perform_button_action", jSONObject);
        } else {
            if (Intrinsics.LJFF(str2, EnumC957903on.REFRESH.getValue())) {
                function0.invoke();
                if (interfaceC1725110uzd != null) {
                    interfaceC1725110uzd.LIZIZ();
                }
                this.LIZJ.LIZ(null, "perform_button_action", jSONObject);
                return;
            }
            function0.invoke();
            this.LIZJ.LIZIZ("perform_button_action", EnumC1725040uzW.PERFORM_BUTTON_ACTION_UNKNOWN_ACTION, jSONObject);
        }
    }
}
