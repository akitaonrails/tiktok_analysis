package X;

/* JADX INFO: renamed from: X.107B, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C107B {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i) {
        String str;
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "off";
            }
        } else {
            str = "on";
        }
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
        c191969108h.LIZLLL("to_status", str);
        c191969108h.LIZLLL("action", "change_status");
        c1163504gr.onEventV3("change_viewer_status", c191969108h.LIZ);
    }
}
