package X;

import android.os.Handler;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEasyExitCardConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0ITa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467000ITa {
    public final DataChannel LIZ;
    public final C0IHG LIZIZ;
    public final Map<Integer, Long> LIZJ;
    public final Pair<String, String> LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(329));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(328));
    public boolean LJI = true;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public InterfaceC1100800ekg LJIIJ;
    public C467010ITb LJIIJJI;
    public CountDownTimerC521500Kcm LJIIL;
    public CountDownTimerC521500Kcm LJIILIIL;

    public final LiveEasyExitCardConfig LIZIZ() {
        return (LiveEasyExitCardConfig) this.LJFF.getValue();
    }

    public final void LIZ(C0IHG c0ihg, Pair<String, String> pair) {
        InterfaceC1100800ekg interfaceC1100800ekg;
        if (c0ihg != null) {
            ((C0IHF) c0ihg).LIZ(pair);
        }
        ((Handler) this.LJ.getValue()).removeCallbacksAndMessages(null);
        CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LJIIL;
        if (countDownTimerC521500Kcm != null) {
            countDownTimerC521500Kcm.cancel();
        }
        CountDownTimerC521500Kcm countDownTimerC521500Kcm2 = this.LJIILIIL;
        if (countDownTimerC521500Kcm2 != null) {
            countDownTimerC521500Kcm2.cancel();
        }
        C467010ITb c467010ITb = this.LJIIJJI;
        if (c467010ITb != null && (interfaceC1100800ekg = this.LJIIJ) != null) {
            interfaceC1100800ekg.LJII(c467010ITb);
        }
        this.LJIIIZ = true;
    }

    public C467000ITa(DataChannel dataChannel, C0IHF c0ihf, Map map, Pair pair) {
        this.LIZ = dataChannel;
        this.LIZIZ = c0ihf;
        this.LIZJ = map;
        this.LIZLLL = pair;
    }
}
