package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlayerRenderViewRebuildCleanupFix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1AZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181561AZm implements InterfaceC2182661AbY {
    public volatile InterfaceC2181941AaO LL;
    public Pair<Integer, Integer> LLILLJJLI = new Pair<>(0, 0);

    @Override // X.InterfaceC2182661AbY
    public final C2182101Aae LIZ() {
        Pair<Integer, Integer> resolution;
        InterfaceC2181941AaO interfaceC2181941AaO = this.LL;
        if (interfaceC2181941AaO == null || (resolution = interfaceC2181941AaO.getResolution()) == null) {
            return null;
        }
        if (resolution.getFirst().intValue() != this.LLILLJJLI.getFirst().intValue() || resolution.getSecond().intValue() != this.LLILLJJLI.getSecond().intValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPlayerResolution, w:");
            sbLIZ.append(resolution.getFirst().intValue());
            sbLIZ.append(", h:");
            sbLIZ.append(resolution.getSecond().intValue());
            C20441214yg.LIZIZ("LinkMicLayoutStreamPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLILLJJLI = resolution;
        return new C2182101Aae(resolution.getFirst().intValue(), resolution.getSecond().intValue());
    }

    public final void LIZIZ() {
        InterfaceC2181941AaO interfaceC2181941AaO = this.LL;
        this.LL = null;
        if (!LinkMicPlayerRenderViewRebuildCleanupFix.INSTANCE.isEnable() || interfaceC2181941AaO == null) {
            return;
        }
        if (C500260Jjc.LJJIIJ()) {
            interfaceC2181941AaO.reset();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C500260Jjc.LJJLIIIJILLIZJL(new C2182011AaV(interfaceC2181941AaO, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
            C20441214yg.LJFF("LinkMicLayoutStreamPlayerImpl", "resetPlayerOnUiThread interrupted", e);
        }
    }

    @Override // X.InterfaceC2182661AbY
    public final void reset() {
        C20441214yg.LJIIIZ("LinkMicLayoutStreamPlayerImpl", "reset");
        InterfaceC2181941AaO interfaceC2181941AaO = this.LL;
        if (interfaceC2181941AaO != null) {
            interfaceC2181941AaO.reset();
        }
    }

    public C2181561AZm(InterfaceC2181941AaO interfaceC2181941AaO) {
        this.LL = interfaceC2181941AaO;
    }

    @Override // X.InterfaceC2182661AbY
    public final void LIZJ(C1283980jW8 c1283980jW8) {
        String strLJIIJJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update frame: ");
        sbLIZ.append(c1283980jW8);
        sbLIZ.append(", bizPlayer=");
        InterfaceC2181941AaO interfaceC2181941AaO = this.LL;
        if (interfaceC2181941AaO != null) {
            strLJIIJJI = C500260Jjc.LJIIJJI(interfaceC2181941AaO);
        } else {
            strLJIIJJI = null;
        }
        sbLIZ.append(strLJIIJJI);
        C20441214yg.LJIIIZ("LinkMicLayoutStreamPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2181941AaO interfaceC2181941AaO2 = this.LL;
        if (interfaceC2181941AaO2 != null) {
            interfaceC2181941AaO2.LIZ((int) c1283980jW8.LIZ, (int) c1283980jW8.LIZIZ, (int) c1283980jW8.LIZJ, (int) c1283980jW8.LIZLLL);
        }
    }
}
