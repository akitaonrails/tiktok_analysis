package X;

import android.content.Context;
import android.os.Handler;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.livesetting.clientai.LivePitayaPkgUpdateListSettings;
import com.bytedance.android.livesdk.livesetting.clientai.LivePitayaPkgUpdateStrategy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AwS107S1000000_23;

/* JADX INFO: renamed from: X.0pVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514480pVu implements InterfaceC19562711gH {
    public static InterfaceC420801kM LLILZ;
    public static final C1514480pVu LL = new C1514480pVu();
    public static final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public static final C01GW LLILLL = C292401Bi.LIZ(AFwS212S0000000_23.get$arr$(36));
    public static final RunnableC1514460pVs LLILZIL = RunnableC1514460pVs.LL;

    public static void LIZ() {
        C20441214yg.LIZIZ("LivePitayaPkgUpdateStrategy", "downloadPkgs");
        for (String str : LivePitayaPkgUpdateListSettings.INSTANCE.getDownloadPkgOptList()) {
            ((C1ATJ) LivePitayaEnv.LJIIL()).LIZ(str, new AwS107S1000000_23(str, 3), AFwS263S0000000_23.get$arr$(18));
        }
    }

    @Override // X.InterfaceC19562711gH
    public final void LLF(Context context) {
        C20441214yg.LIZIZ("LivePitayaPkgUpdateStrategy", "onEnterForeground");
        ((Handler) LLILLL.getValue()).removeCallbacks(LLILZIL);
    }

    @Override // X.InterfaceC19562711gH
    public final void LLLLIILLL(Context context) {
        C20441214yg.LIZIZ("LivePitayaPkgUpdateStrategy", "onEnterBackground");
        LivePitayaPkgUpdateStrategy livePitayaPkgUpdateStrategy = LivePitayaPkgUpdateStrategy.INSTANCE;
        if (livePitayaPkgUpdateStrategy.getStrategyVal() == livePitayaPkgUpdateStrategy.getDEFAULT()) {
            return;
        }
        C786410Ut5.LJLIIL(10000L, (Handler) LLILLL.getValue(), LLILZIL);
    }
}
