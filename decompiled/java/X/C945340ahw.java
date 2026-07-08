package X;

import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicParamCheckSetting;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0ahw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945340ahw {
    public final C474500IjA LIZ;
    public final List<C927240aEk> LIZIZ = new ArrayList();

    public final void LIZIZ() {
        if (LinkMicParamCheckSetting.config().getEnable() && ((C939210aY3.LIZJ() || LinkMicParamCheckSetting.config().getDebugConfig().getSaveStackTraceOnline()) && LinkMicParamCheckSetting.config().getDebugConfig().getSaveStackTraceEventList().contains(this.LIZ.LJIJ()))) {
            this.LIZ.LJJII(C13LQ.LJJL(ThreadMethodProxy.getStackTrace(C786410Ut5.u3()), new IntRange(3, 15)).toString(), "stacktrace");
        }
        InterfaceC927230aEj interfaceC927230aEjYd2 = ((ILinkCoreService) C1161920gLG.LIZJ(ILinkCoreService.class)).yd2();
        if (interfaceC927230aEjYd2 != null) {
            interfaceC927230aEjYd2.LIZ(this);
        }
    }

    public C945340ahw(C474500IjA c474500IjA) {
        this.LIZ = c474500IjA;
    }

    public final void LIZ(Pair<String, String>... pairArr) {
        ArrayList<Pair> arrayList = new ArrayList();
        for (Pair<String, String> pair : pairArr) {
            if (pair.getFirst().length() > 0 && pair.getSecond().length() > 0) {
                arrayList.add(pair);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        List<C927240aEk> list = this.LIZIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (Pair pair2 : arrayList) {
            arrayList2.add(new C927240aEk((String) pair2.getFirst(), (String) pair2.getSecond()));
        }
        ((ArrayList) list).addAll(arrayList2);
    }
}
