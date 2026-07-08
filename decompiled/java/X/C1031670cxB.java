package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0cxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031670cxB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC1031540cwy interfaceC1031540cwy, boolean z) {
        Object hostModel;
        String str;
        if (interfaceC1031540cwy != null && (hostModel = interfaceC1031540cwy.getHostModel()) != null) {
            HashMap<String, Object> customAdExtraDataParams = interfaceC1031540cwy.getCustomAdExtraDataParams();
            if (!z) {
                str = "click";
            } else {
                str = "slide";
            }
            customAdExtraDataParams.put("click_type", str);
            interfaceC1031540cwy.trackEvent(new C1031310cwb("direct_openpage_ad", "click", "page", customAdExtraDataParams), hostModel);
        }
    }
}
