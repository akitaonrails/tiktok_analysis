package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Z6O, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z6O {
    public static final C0Z6O LIZIZ = new C0Z6O();
    public final /* synthetic */ C0Z6S LIZ = new C0Z6S();

    public final void LIZ(String str, C742250T9r c742250T9r, Integer num) {
        if (str == null || c742250T9r == null) {
            return;
        }
        Map<String, String> mapLIZ = c742250T9r.LIZ();
        int iLIZ = C1527905yX.LIZ(num);
        this.LIZ.getClass();
        Map mapLIZ2 = C0Z6S.LIZ(iLIZ, str, mapLIZ);
        this.LIZ.getClass();
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("imsdk_group_chat_remove_member", mapLIZ2);
    }
}
