package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.1BDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201451BDz {
    public static volatile C2201451BDz LIZLLL = new C2201451BDz();
    public boolean LIZ;
    public final Set<Network> LIZIZ = new HashSet();
    public Context LIZJ;

    public final void LIZ() {
        NetworkInfo networkInfoLJIJ;
        int iLJLLILLLL;
        C1BER c1ber = C1BE8.LIZIZ().LIZJ;
        if (c1ber == null || !c1ber.LIZJ) {
            if (!LIZIZ()) {
                return;
            }
        } else if (((HashSet) this.LIZIZ).isEmpty()) {
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(this.LIZJ, "connectivity");
        if (connectivityManager == null || (networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager)) == null || !networkInfoLJIJ.isConnected() || (iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KI3kePSCIlq6CHqIYXJ2F/FTdUFhesRGBY8fpV7+Grf", null))) == 1 || iLJLLILLLL != 0) {
            return;
        }
        switch (C2204961BRm.LJLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KI3kePSCIlq6CHqIYXJ2F/FTdUFhesRGBY8fpV7+Grf", null))) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                break;
            case 19:
            default:
                String strLJLLI = C2204961BRm.LJLLI(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KI3kePSCIlq6CHqIYXJ2F/FTdUFhesRGBY8fpV7+Grf", null));
                if (!strLJLLI.equalsIgnoreCase("TD-SCDMA") && !strLJLLI.equalsIgnoreCase("WCDMA")) {
                    strLJLLI.equalsIgnoreCase("CDMA2000");
                    break;
                }
                break;
        }
    }

    public final boolean LIZIZ() {
        NetworkInfo networkInfoLJIJ;
        C1BER c1ber = C1BE8.LIZIZ().LIZJ;
        if (c1ber != null && c1ber.LIZJ) {
            return !((HashSet) this.LIZIZ).isEmpty();
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(this.LIZJ, "connectivity");
            if (connectivityManager == null || (networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager)) == null) {
                return false;
            }
            return networkInfoLJIJ.isConnected();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void LIZJ(Network network) {
        String str;
        boolean z = !((HashSet) this.LIZIZ).isEmpty();
        Iterator it2 = ((HashSet) this.LIZIZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Network network2 = (Network) it2.next();
            if (network2.equals(network)) {
                ((HashSet) this.LIZIZ).remove(network2);
                break;
            }
        }
        boolean zIsEmpty = ((HashSet) this.LIZIZ).isEmpty();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNetworkUnavailable: ");
        sbLIZ.append(network.toString());
        if (z && zIsEmpty) {
            str = ". network become lost!!!";
        } else {
            str = "";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
