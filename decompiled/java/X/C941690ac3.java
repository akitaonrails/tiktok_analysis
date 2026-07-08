package X;

import Y.ARunnableS115S0100000_15;
import Y.ARunnableS19S1200000_15;
import android.os.Handler;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ac3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941690ac3 implements InterfaceC941900acO {
    public final String LL;
    public final InterfaceC941860acK LLILLJJLI;
    public final Handler LLILLL;
    public volatile boolean LLILZLL;
    public List<String> LLILZ = new ArrayList();
    public List<String> LLILZIL = new ArrayList();
    public final ARunnableS115S0100000_15 LLIZ = new ARunnableS115S0100000_15(this, 211);

    public final void LIZ(EnumC941710ac5 enumC941710ac5) {
        this.LLILZLL = true;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        String strLIZ = C01EI.LIZ(68, "MutexTask");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMutexFinish, ");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("targetAbilityName=");
        sbLIZ2.append(this.LL);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(", mutexFinishReason=");
        sbLIZ.append(enumC941710ac5);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI(strLIZ, strLIZIZ);
        this.LLILLL.removeCallbacks(this.LLIZ);
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIJJI(this);
        }
        this.LLILLJJLI.LIZIZ(enumC941710ac5);
    }

    @Override // X.InterfaceC941900acO
    public final void LIZJ(C01EL c01el, String str) {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS19S1200000_15(this, str, c01el, 3));
    }

    public C941690ac3(String str, C941740ac8 c941740ac8, BPEAHandler bPEAHandler) {
        this.LL = str;
        this.LLILLJJLI = c941740ac8;
        this.LLILLL = bPEAHandler;
    }
}
