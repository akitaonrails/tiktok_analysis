package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0eVT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091370eVT {
    public static final Keva LIZ = Keva.getRepo("gift_gallery");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static boolean LIZ() {
        C0JT6<Double> c0jt6 = InterfaceC1106030et7.J6;
        Double dLIZ = c0jt6.LIZ();
        int iDoubleValue = dLIZ != null ? (int) dLIZ.doubleValue() : -1;
        ?? r2 = iDoubleValue;
        if (iDoubleValue == -1) {
            Keva keva = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gift_gallery_shown_");
            sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
            boolean z = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
            c0jt6.LIZJ(Double.valueOf(z ? 1.0d : 0.0d));
            r2 = z;
        }
        return r2 == 1;
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_shown_first_gallery_popup_");
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
