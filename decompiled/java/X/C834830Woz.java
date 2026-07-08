package X;

import android.text.TextUtils;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyViewModel;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Woz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834830Woz {
    public static void LIZ(LobbyViewModel lobbyViewModel, String str) {
        if (lobbyViewModel != null && !TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(str);
            sbLIZ.append("] ");
            sbLIZ.append("provider currently does not support logging out, please contact Lobby developer for further details.");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C2193741AtQ c2193741AtQ = new C2193741AtQ(str, 2);
            c2193741AtQ.LIZ = false;
            c2193741AtQ.LIZIZ = new C851480Xak(1, strLIZIZ);
            lobbyViewModel.xQ2(new AuthResult(c2193741AtQ));
        }
    }

    public static void LIZIZ(LobbyViewModel lobbyViewModel, String str, int i) {
        if (lobbyViewModel != null && !TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(str);
            sbLIZ.append("] ");
            sbLIZ.append("provider is not available, make sure you have added it to your dependency.");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C2193741AtQ c2193741AtQ = new C2193741AtQ(str, i);
            c2193741AtQ.LIZ = false;
            c2193741AtQ.LIZIZ = new C851480Xak(2, strLIZIZ, "before_goto_URL");
            lobbyViewModel.xQ2(new AuthResult(c2193741AtQ));
        }
    }
}
