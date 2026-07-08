package X;

import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.downlink.StarshipDownlinkData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS125S0110000_7;

/* JADX INFO: renamed from: X.0CW0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CW0 {
    public static Function1<? super String, Unit> LIZIZ;
    public static final C0CW0 LIZ = new C0CW0();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2851));
    public static final C0CW1 LIZLLL = new C0CW2<StarshipDownlinkData>() { // from class: X.0CW1
        @Override // X.C0CW2
        public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
            StarshipDownlinkData starshipDownlinkData = (StarshipDownlinkData) baseDownlinkData;
            try {
                C0CW0.LIZ.getClass();
                C23250099c.LIZLLL((InterfaceC497601wk) C0CW0.LIZJ.getValue(), null, null, new C314890CVz(starshipDownlinkData, null), 3);
                awS125S0110000_7.invoke();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    };
}
