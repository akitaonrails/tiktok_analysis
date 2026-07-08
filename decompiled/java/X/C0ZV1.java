package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0ZV1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZV1 {
    public static final ConcurrentHashMap<String, C0ZV2> LIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(586));

    public static GroupInviteInfoModel LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            Object object = new ObjectInputStream(new ByteArrayInputStream(((Keva) LIZIZ.getValue()).getBytes(LIZJ(str), new byte[0]))).readObject();
            if (object instanceof GroupInviteInfoModel) {
                return (GroupInviteInfoModel) object;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("group_invite_link");
        sbLIZ.append('_');
        sbLIZ.append(C461720I8s.LIZIZ());
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(String str, boolean z, Function1 function1, Function1 function12) {
        String strLIZJ = LIZJ(str);
        if ((((Keva) LIZIZ.getValue()).getBytes(strLIZJ, new byte[0]).length != 0 && !z) || !C0ZFW.LIZ.LJIIJJI(str)) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C914180Ztg(CoroutineExceptionHandler.LJJLIL, function12, 8))), null, null, new C900670ZUz(str, strLIZJ, null, function1, function12), 3);
    }
}
