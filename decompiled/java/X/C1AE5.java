package X;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveParallelStreamCDNStrategyKey;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.ss.android.ugc.aweme.flush.LiveAppLogFlushExp;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.1AE5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AE5 {
    public static final C1AE5 LIZ = new C1AE5();
    public static long LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static final C01GW LJI;
    public static final C1AE7 LJII;

    static {
        LiveAppLogFlushExp.LIZ.getClass();
        if (LiveAppLogFlushExp.LIZ().enable && LiveAppLogFlushExp.LIZ().flushDelayTimeForehand * 1000 > 0) {
            C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.1AE6
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveAppLogFlushManager@944f.<init>$1");
                    if (((C606810Nr5) obj).LIZIZ) {
                        C1AE5.LIZ.getClass();
                        ((Handler) C1AE5.LIZLLL.getValue()).removeCallbacksAndMessages(null);
                    } else {
                        C1AE5.LIZ.getClass();
                        Handler handler = (Handler) C1AE5.LIZLLL.getValue();
                        C1AE7 c1ae7 = C1AE5.LJII;
                        LiveAppLogFlushExp.LIZ.getClass();
                        C786410Ut5.LJLIIL(LiveAppLogFlushExp.LIZ().flushDelayTimeForehand * 1000, handler, c1ae7);
                    }
                    C1C7U.LIZIZ("LiveAppLogFlushManager@944f.<init>$1");
                }
            });
        }
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LIZJ = C452501pT.LIZ(enumC452301pR, new C1AED());
        LIZLLL = C452501pT.LIZ(enumC452301pR, new C1AE9());
        LJ = C452501pT.LIZ(enumC452301pR, new C1AEC());
        LJFF = C452501pT.LIZ(enumC452301pR, new C1AEB());
        LJI = C452501pT.LIZ(enumC452301pR, new C1AEA());
        LJII = C1AE7.LL;
    }

    public static void LIZ(int i) {
        LiveAppLogFlushExp.LIZ.getClass();
        if (LiveAppLogFlushExp.LIZ().enable && C13LQ.LJIILJJIL(i, LiveAppLogFlushExp.LIZ().flushScenes)) {
            if (LiveAppLogFlushExp.LIZ().shouldJudgeTrafficStatus) {
                AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(69);
                IStarShipStrategy iStarShipStrategy = C326690CrL.LIZ;
                C1306400k6I c1306400k6I = new C1306400k6I(LiveParallelStreamCDNStrategyKey.INSTANCE.getValue());
                c1306400k6I.LIZ(1, "pricing_method_p95");
                iStarShipStrategy.runStrategy(c1306400k6I, new AwS586S0100000_7(aFwS237S0000000_7, 573));
                return;
            }
            LIZIZ(true);
        }
    }

    public static void LIZIZ(boolean z) {
        long[] jArr;
        if (z) {
            jArr = (long[]) LJFF.getValue();
        } else {
            jArr = (long[]) LJI.getValue();
        }
        for (long j : (long[]) LJ.getValue()) {
            for (long j2 : jArr) {
                long j3 = (j - j2) * 1000;
                if (j3 > 0) {
                    LIZ.getClass();
                    C786410Ut5.LJLIIL(j3, (Handler) LIZLLL.getValue(), LJII);
                }
            }
        }
    }
}
