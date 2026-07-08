package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19Gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21511719Gp {
    public static boolean LIZIZ;
    public static Boolean LIZJ;
    public static final C21511719Gp LIZ = new C21511719Gp();
    public static final CopyOnWriteArrayList<Function0<Unit>> LIZLLL = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC21512019Gs>> LJ = new ConcurrentHashMap<>();

    public static String LIZ() {
        if (!C287690BPj.LIZ()) {
            return "is_chat_function_off";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_chat_function_off_");
        sbLIZ.append(C461720I8s.LIZIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZIZ(C21511719Gp c21511719Gp) {
        c21511719Gp.getClass();
        Keva repo = Keva.getRepo("disable_im_under_sixteen_repo");
        c21511719Gp.getClass();
        boolean zIsLogin = ((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin();
        c21511719Gp.getClass();
        boolean z = true;
        if (C287690BPj.LIZ()) {
            if (!zIsLogin) {
                return true;
            }
            return repo.getBoolean(LIZ(), false);
        }
        Boolean bool = LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (zIsLogin) {
            z = repo.getBoolean(LIZ(), false);
        }
        LIZJ = Boolean.valueOf(z);
        return z;
    }

    public static void LIZJ(Keva keva, boolean z) {
        boolean z2;
        if (!z) {
            LIZIZ = false;
        }
        if (C287690BPj.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Skip updating unused cache, isLogin = ");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (z) {
            z2 = keva.getBoolean(LIZ(), false);
        } else {
            z2 = true;
        }
        LIZJ = Boolean.valueOf(z2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("disable chat config updated isLogin = ");
        sbLIZ2.append(z);
        sbLIZ2.append(" isChatOff = ");
        sbLIZ2.append(LIZJ);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
