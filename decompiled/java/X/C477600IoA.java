package X;

import com.bytedance.android.livesdk.livesetting.linkmic.HangoutLandingBySkylightRoomSetting;
import com.bytedance.android.livesdk.model.message.MultiGuestHangoutLandingMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0IoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477600IoA {
    public static volatile boolean LIZ;
    public static volatile int LIZIZ;
    public static volatile long LIZJ;
    public static volatile long LIZLLL;
    public static final C477590Io9 LJ = new InterfaceC477620IoC() { // from class: X.0Io9
        public final String LIZ = "WebcastMultiGuestHangoutLandingMessage";

        @Override // X.InterfaceC477620IoC
        public final String getMethod() {
            return this.LIZ;
        }

        @Override // X.InterfaceC477620IoC
        public final void LIZ(byte[] bArr) {
            Object c098200Yq;
            C0IMD c0imdLJI;
            C1516680pZS c1516680pZS;
            MultiGuestHangoutLandingMessage multiGuestHangoutLandingMessage;
            if (!HangoutLandingBySkylightRoomSetting.INSTANCE.getValue()) {
                return;
            }
            try {
                C1515210pX5.LIZLLL().getClass();
                c0imdLJI = C1515210pX5.LJI(MultiGuestHangoutLandingMessage.class);
                c1516680pZS = new C1516680pZS();
                c1516680pZS.LJIIL(new C1506330pIl(bArr));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (c0imdLJI != null && (multiGuestHangoutLandingMessage = (MultiGuestHangoutLandingMessage) c0imdLJI.LIZJ(c1516680pZS)) != null) {
                if (multiGuestHangoutLandingMessage.currentTime <= C477600IoA.LIZLLL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("HangoutLandingMessage handle ignore stale currentTime, currentTime=");
                    sbLIZ.append(multiGuestHangoutLandingMessage.currentTime);
                    sbLIZ.append(", cachedCurrentTime=");
                    sbLIZ.append(C477600IoA.LIZLLL);
                    C20441214yg.LIZIZ("legolas_im", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                C477600IoA.LIZIZ = multiGuestHangoutLandingMessage.landingStrategy;
                C477600IoA.LIZJ = multiGuestHangoutLandingMessage.expireTime;
                C477600IoA.LIZLLL = multiGuestHangoutLandingMessage.currentTime;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("HangoutLandingMessage handle update cache, currentTime=");
                sbLIZ2.append(multiGuestHangoutLandingMessage.currentTime);
                sbLIZ2.append(", landingStrategy=");
                sbLIZ2.append(multiGuestHangoutLandingMessage.landingStrategy);
                sbLIZ2.append(", expireTime=");
                sbLIZ2.append(multiGuestHangoutLandingMessage.expireTime);
                C20441214yg.LIZIZ("legolas_im", C2188811AlT.LIZIZ(sbLIZ2));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C20441214yg.LJFF("legolas_im", "HangoutLandingMessage handle error:", thM5exceptionOrNullimpl);
                }
            }
        }
    };
}
