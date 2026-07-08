package Y;

import X.C1077790e9Z;
import X.C1111930f2d;
import X.EnumC1087640ePS;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AObjectS87S0110000_17 implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS87S0110000_17 aObjectS87S0110000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS87S0110000_17.l0;
        boolean z = aObjectS87S0110000_17.z1;
        C1077790e9Z c1077790e9Z = (C1077790e9Z) obj;
        c1111930f2d.getClass();
        int iOrdinal = c1077790e9Z.LIZIZ.ordinal();
        EnumC1087640ePS enumC1087640ePS = EnumC1087640ePS.LEVEL_CRITICAL;
        if (iOrdinal <= enumC1087640ePS.ordinal()) {
            c1111930f2d.LLF(ScalableDowngradeSetting.getPublicScreenRefreshInterval(c1111930f2d.LLJIJIL));
            int i = c1111930f2d.LLJIJIL;
            c1111930f2d.LLJILJILJ = i;
            c1111930f2d.LLLJL.LJJIIZ = i;
            return null;
        }
        if (c1077790e9Z.LIZ.ordinal() >= c1077790e9Z.LIZIZ.ordinal() || c1077790e9Z.LIZ.ordinal() > enumC1087640ePS.ordinal()) {
            return null;
        }
        int i2 = C1111930f2d.LJJLJLI(c1111930f2d.LLLJL.LJI).consumeInterval;
        if (c1111930f2d.LJLJLLL(z)) {
            c1111930f2d.LLF(LivePreCreateNextRoomPlayer.ENABLE);
        } else {
            c1111930f2d.LLF(i2);
        }
        int i3 = c1111930f2d.LLJIJIL;
        c1111930f2d.LLJILJILJ = i3;
        c1111930f2d.LLLJL.LJJIIZ = i3;
        return null;
    }

    public static final Object invoke$1(AObjectS87S0110000_17 aObjectS87S0110000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS87S0110000_17.l0;
        boolean z = aObjectS87S0110000_17.z1;
        c1111930f2d.getClass();
        if (LiveHostAutoAdaptiveParams.INSTANCE.isDisable("publish_screen_refresh")) {
            int publicScreenRefreshIntervalTime = LiveHostAutoAdaptiveParams.getValue().getPublicScreenRefreshIntervalTime();
            c1111930f2d.LLJIJIL = publicScreenRefreshIntervalTime;
            c1111930f2d.LLJILJILJ = publicScreenRefreshIntervalTime;
            c1111930f2d.LLLJL.LJJIIZ = publicScreenRefreshIntervalTime;
        } else {
            int i = C1111930f2d.LJJLJLI(c1111930f2d.LLLJL.LJI).consumeInterval;
            if (c1111930f2d.LJLJLLL(z)) {
                c1111930f2d.LLJIJIL = LivePreCreateNextRoomPlayer.ENABLE;
            } else {
                c1111930f2d.LLJIJIL = i;
            }
            int i2 = c1111930f2d.LLJIJIL;
            c1111930f2d.LLJILJILJ = i2;
            c1111930f2d.LLLJL.LJJIIZ = i2;
        }
        return Unit.LIZ;
    }

    public AObjectS87S0110000_17(C1111930f2d c1111930f2d, boolean z, int i) {
        this.$t = i;
        this.l0 = c1111930f2d;
        this.z1 = z;
    }
}
