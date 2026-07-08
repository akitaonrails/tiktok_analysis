package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.01Mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C320901Mh {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        return C930540aK4.LJIJJ(UserService.getInstance().user().LJIJJLI());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZJ() {
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        return num != null && num.intValue() == 2;
    }

    public static void LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanTicketComponent-");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
    }
}
