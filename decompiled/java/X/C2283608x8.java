package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08x8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2283608x8 {
    public static final boolean LIZ(String str) {
        List listLJJLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCManager -> containWhitelist: info = ");
        sbLIZ.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        boolean z = false;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        Set setLJJL = null;
        Object[] objArr = (Object[]) SettingsManager.LIZLLL().LJIIIIZZ("valid_AIGC_categorys", String[].class, null);
        if (objArr != null && (listLJJLL = C13LQ.LJJLL(objArr)) != null) {
            setLJJL = C13LP.LJJL(listLJJLL, C13LP.LLIIJI(listLJJLIIIJILLIZJL));
        }
        if (setLJJL == null || setLJJL.isEmpty()) {
            z = true;
        }
        return true ^ z;
    }
}
