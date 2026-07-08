package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0cYL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016270cYL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC1032120cxu interfaceC1032120cxu, Integer num) {
        Object hostModel;
        String str;
        if (interfaceC1032120cxu == null || (hostModel = interfaceC1032120cxu.getHostModel()) == null) {
            return;
        }
        if (num == null) {
            str = "othershow";
        } else {
            str = "othershow_fail";
        }
        HashMap<String, Object> customAdExtraDataParams = interfaceC1032120cxu.getCustomAdExtraDataParams();
        if (num != null) {
            customAdExtraDataParams.put("fail_reason", Integer.valueOf(num.intValue()));
        }
        interfaceC1032120cxu.trackEvent(new C1031480cws("draw_ad", str, "reward_timer", customAdExtraDataParams), hostModel);
    }
}
