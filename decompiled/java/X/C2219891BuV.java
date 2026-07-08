package X;

import Y.AObjectS103S0101000_34;
import android.app.Activity;
import android.view.Window;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BuV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219891BuV extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219891BuV(C2220021Bui c2220021Bui) {
        super(2, c2220021Bui, C2220021Bui.class, "setKeepScreenOn", "setKeepScreenOn(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        Boolean bool;
        int iIntValue = num.intValue();
        C2220021Bui c2220021Bui = (C2220021Bui) this.receiver;
        c2220021Bui.getClass();
        Object objOpt = jSONObject.opt("keepScreenOn");
        if (objOpt instanceof Boolean) {
            bool = (Boolean) objOpt;
        } else {
            if (objOpt instanceof String) {
                String lowerCase = ((String) objOpt).toLowerCase(Locale.ROOT);
                if (Intrinsics.LJFF(lowerCase, "true")) {
                    bool = Boolean.TRUE;
                } else if (Intrinsics.LJFF(lowerCase, "false")) {
                    bool = Boolean.FALSE;
                }
            }
            C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
            c2220021Bui.LIZIZ.LJJLIIJ(Integer.valueOf(iIntValue), C2220191Buz.LIZ("setKeepScreenOn:fail invalid value"));
            return C2220181Buy.LJ;
        }
        if (bool != null) {
            final C2219681BuA c2219681BuA = c2220021Bui.LIZ.LJFF;
            final boolean zBooleanValue = bool.booleanValue();
            final AObjectS103S0101000_34 aObjectS103S0101000_34 = new AObjectS103S0101000_34(c2220021Bui, iIntValue, 8);
            c2219681BuA.getClass();
            c2219681BuA.LJJZZIII(new Function0() { // from class: X.1BuI
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    C2219681BuA c2219681BuA2 = c2219681BuA;
                    boolean z = zBooleanValue;
                    Function0 function0 = aObjectS103S0101000_34;
                    Activity activity = c2219681BuA2.LIZ.LIZJ.getActivity();
                    if (activity == null) {
                        return Unit.LIZ;
                    }
                    Window window = activity.getWindow();
                    if (z) {
                        window.addFlags(128);
                    } else {
                        window.clearFlags(128);
                    }
                    function0.invoke();
                    return Unit.LIZ;
                }
            });
            return C2220181Buy.LJ;
        }
        C2220181Buy c2220181Buy2 = C2220181Buy.LIZJ;
        c2220021Bui.LIZIZ.LJJLIIJ(Integer.valueOf(iIntValue), C2220191Buz.LIZ("setKeepScreenOn:fail invalid value"));
        return C2220181Buy.LJ;
    }
}
