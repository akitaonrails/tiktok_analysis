package X;

import Y.AObjectS103S0101000_34;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219901BuW extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219901BuW(C2220021Bui c2220021Bui) {
        super(2, c2220021Bui, C2220021Bui.class, "setScreenBrightness", "setScreenBrightness(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue = num.intValue();
        C2220021Bui c2220021Bui = (C2220021Bui) this.receiver;
        c2220021Bui.getClass();
        double dOptDouble = jSONObject.optDouble("value", -2.0d);
        if (dOptDouble == -1.0d) {
            dOptDouble = -1.0d;
        } else if (0.0d > dOptDouble || dOptDouble > 1.0d) {
            C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
            c2220021Bui.LIZIZ.LJJLIIJ(Integer.valueOf(iIntValue), C2220191Buz.LIZ("setScreenBrightness:fail invalid value"));
            return C2220181Buy.LJ;
        }
        final C2219681BuA c2219681BuA = c2220021Bui.LIZ.LJFF;
        final float f = (float) dOptDouble;
        final AObjectS103S0101000_34 aObjectS103S0101000_34 = new AObjectS103S0101000_34(c2220021Bui, iIntValue, 7);
        c2219681BuA.getClass();
        c2219681BuA.LJJZZIII(new Function0() { // from class: X.1BuO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C2219681BuA c2219681BuA2 = c2219681BuA;
                float f2 = f;
                Function0 function0 = aObjectS103S0101000_34;
                Activity activity = c2219681BuA2.LIZ.LIZJ.getActivity();
                if (activity == null) {
                    return Unit.LIZ;
                }
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = f2;
                window.setAttributes(attributes);
                function0.invoke();
                return Unit.LIZ;
            }
        });
        return C2220181Buy.LJ;
    }
}
