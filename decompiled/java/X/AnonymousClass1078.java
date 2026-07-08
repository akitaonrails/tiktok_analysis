package X;

/* JADX INFO: renamed from: X.1078, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1078 {
    public static final AnonymousClass1078 LIZ = new AnonymousClass1078();

    public static void LIZ(int i) {
        String str;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", "download_permission");
        if (i == 0) {
            str = "on";
        } else {
            str = "off";
        }
        c191969108h.LIZLLL("to_status", str);
        c191969108h.LIZ(C104L.LIZJ() ? 1 : 0, "is_private");
        c1163504gr.onEventV3("change_download_permission", c191969108h.LIZ);
    }
}
