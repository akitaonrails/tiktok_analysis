package X;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0S7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716280S7u implements C0S8O {
    public final LifecycleCoroutineScope LIZ;
    public final C0S8S LIZIZ;
    public final Function0<Aweme> LIZJ;
    public final Function0<InterfaceC692440REc> LIZLLL;
    public final IFeedPanelPlatformAbility LJ;
    public final Function0<Unit> LJFF;

    @Override // X.C0S8O
    public final void LIZ(List<C0S81> list) {
        InterfaceC692440REc interfaceC692440REcInvoke = this.LIZLLL.invoke();
        if (interfaceC692440REcInvoke == null) {
            return;
        }
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, interfaceC692440REcInvoke.getCount());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            arrayList.add(interfaceC692440REcInvoke.getItem(it2.nextInt()));
        }
        List<? extends Aweme> listLJJJJLI = C13LP.LJJJJLI(arrayList);
        C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
        List<Aweme> listLJFF = C716300S7w.LIZ().LJFF(listLJJJJLI, list);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((ArrayList) listLJJJJLI).iterator();
        while (it3.hasNext()) {
            arrayList2.add(((Aweme) it3.next()).getAid());
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<Aweme> it4 = listLJFF.iterator();
        while (it4.hasNext()) {
            arrayList3.add(it4.next().getAid());
        }
        LifecycleCoroutineScope lifecycleCoroutineScope = this.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ, null, new C716290S7v(interfaceC692440REcInvoke, listLJFF, this, list, null), 2);
    }

    @Override // X.C0S8O
    public final void LIZIZ(List list) {
        C0S8S c0s8s;
        Aweme awemeInvoke = this.LIZJ.invoke();
        if (awemeInvoke != null) {
            C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
            C0S8V c0s8vLIZ = C716300S7w.LIZ().LIZ(awemeInvoke, list);
            if (c0s8vLIZ != null && (c0s8s = this.LIZIZ) != null) {
                AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1554);
                FrameLayout frameLayout = c0s8s.LIZ;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                FrameLayout frameLayout2 = c0s8s.LIZIZ;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(8, frameLayout2);
                }
                ((C0S8T) c0s8s.LIZ(c0s8vLIZ)).LIZIZ(awS555S0100000_11);
            }
        }
    }

    @Override // X.C0S8O
    public final void LIZJ(List<C0S81> list) {
        C0S8S c0s8s;
        Aweme awemeInvoke = this.LIZJ.invoke();
        if (awemeInvoke != null) {
            C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
            C0S8V c0s8vLIZ = C716300S7w.LIZ().LIZ(awemeInvoke, list);
            if (c0s8vLIZ != null && (c0s8s = this.LIZIZ) != null) {
                FrameLayout frameLayout = c0s8s.LIZ;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                FrameLayout frameLayout2 = c0s8s.LIZIZ;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(8, frameLayout2);
                }
                ((C0S8T) c0s8s.LIZ(c0s8vLIZ)).LIZJ();
            }
        }
    }

    public C716280S7u(LifecycleCoroutineScope lifecycleCoroutineScope, C0S8S c0s8s, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112, IFeedPanelPlatformAbility iFeedPanelPlatformAbility, AwS555S0100000_11 awS555S0100000_113) {
        this.LIZ = lifecycleCoroutineScope;
        this.LIZIZ = c0s8s;
        this.LIZJ = awS555S0100000_11;
        this.LIZLLL = awS555S0100000_112;
        this.LJ = iFeedPanelPlatformAbility;
        this.LJFF = awS555S0100000_113;
    }
}
