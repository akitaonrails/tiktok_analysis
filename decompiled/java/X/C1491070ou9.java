package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerRefactorSetting;

/* JADX INFO: renamed from: X.0ou9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491070ou9 implements InterfaceC1491080ouA {
    @Override // X.InterfaceC1491080ouA
    public final AbstractC1700380uLk LIZ(Context context, C1502390pCP c1502390pCP, C1502360pCM c1502360pCM, String str, boolean z) {
        C1491040ou6 c1491040ou6 = new C1491040ou6(context);
        c1491040ou6.LIZIZ = c1502390pCP;
        c1491040ou6.LJI = c1502360pCM;
        c1491040ou6.LJII = str;
        c1491040ou6.LJIIIIZZ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSupportForceLowLatency:");
        sbLIZ.append(c1491040ou6.LJIIIIZZ);
        C827750WdZ.LIZJ("TTLivePlayerBuilder", C2188811AlT.LIZIZ(sbLIZ));
        if (LivePlayerRefactorSetting.INSTANCE.enableSwitchToMediaBox()) {
            return new C1699270uJx(c1491040ou6);
        }
        return new C1699260uJw(c1491040ou6);
    }
}
