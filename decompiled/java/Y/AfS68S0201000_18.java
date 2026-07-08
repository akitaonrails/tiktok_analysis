package Y;

import X.AbstractC316870CbV;
import X.C09JN;
import X.C0XIR;
import X.C1043010dFT;
import X.C1160360gIk;
import X.C1161040gJq;
import X.C1161140gK0;
import X.C1389890mGx;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C1C7U;
import X.C316650Cb9;
import X.C317290CcB;
import X.EnumC1160730gJL;
import X.EnumC1163900gOS;
import X.InterfaceC1167780gUi;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS129S0201000_2;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AfS68S0201000_18 implements C09JN {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS68S0201000_18 afS68S0201000_18, Object obj) {
        C0XIR c0xir;
        String errorMsg;
        C1C7U.LIZ("AddFeedVideoToMixHelper@fc03.addOrRemoveVideoToMix$result$2");
        Throwable th = (Throwable) obj;
        if (afS68S0201000_18.i2 == EnumC1163900gOS.VIDEOADD.getOperation()) {
            ((InterfaceC1167780gUi) afS68S0201000_18.l0).LIZIZ(false);
        } else {
            ((InterfaceC1167780gUi) afS68S0201000_18.l0).LIZ(false);
        }
        if ((th instanceof C0XIR) && (c0xir = (C0XIR) th) != null && (errorMsg = c0xir.getErrorMsg()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) afS68S0201000_18.l1);
            c1389890mGx.LJIIJ(errorMsg);
            c1389890mGx.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx((Activity) afS68S0201000_18.l1);
            c1389890mGx2.LJIIIZ(2131848597);
            c1389890mGx2.LJIIJJI();
        }
        C1C7U.LIZIZ("AddFeedVideoToMixHelper@fc03.addOrRemoveVideoToMix$result$2");
    }

    public static final void accept$1(AfS68S0201000_18 afS68S0201000_18, Object obj) {
        C1C7U.LIZ("RavenFragment@d0e1.runManualLoadMoreWithPendingContinuation$disposable$3");
        Throwable th = (Throwable) obj;
        ((RavenFragment) afS68S0201000_18.l0).oT(th, false);
        RavenFragment ravenFragment = (RavenFragment) afS68S0201000_18.l0;
        ravenFragment.LLL = false;
        ravenFragment.LLLFZ = false;
        ravenFragment.LLLLLJIL = false;
        ravenFragment.LLJJLIIIJLLLLLLLZ = false;
        ravenFragment.LLJL = false;
        ravenFragment.LLJLIL = false;
        ravenFragment.YT(EnumC1160730gJL.LL, "manualLoadMore error");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS68S0201000_18.l1;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception("Raven Request Error");
        c317290CcB.getClass();
        C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
        C189200o6.m2constructorimpl(c316650Cb9);
        interfaceC1364105Vn.resumeWith(c316650Cb9);
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS129S0201000_2(afS68S0201000_18.i2, (int) th, (Throwable) afS68S0201000_18.l0, (RavenFragment<Object>) 13));
        ((RavenFragment) afS68S0201000_18.l0).hS();
        ((RavenFragment) afS68S0201000_18.l0).uT("manual load more error", true);
        ((RavenFragment) afS68S0201000_18.l0).hT("manual load more error");
        ((RavenFragment) afS68S0201000_18.l0).kS("runManualLoadMore error");
        C1C7U.LIZIZ("RavenFragment@d0e1.runManualLoadMoreWithPendingContinuation$disposable$3");
    }

    public static final void accept$2(AfS68S0201000_18 afS68S0201000_18, Object obj) {
        C1C7U.LIZ("RavenFragment@d0e1.powerPageConfig$2$1$onLoadMore$7");
        C1161040gJq c1161040gJq = (C1161040gJq) obj;
        if (c1161040gJq.LLILLJJLI) {
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS129S0201000_2(afS68S0201000_18.i2, (int) c1161040gJq, (C1161040gJq) afS68S0201000_18.l0, (RavenFragment<Object>) 3));
            C1160360gIk c1160360gIk = ((RavenFragment) afS68S0201000_18.l0).LLJJIJIL;
            if (c1160360gIk != null) {
                c1160360gIk.LJIIIIZZ(c1161040gJq.LLILLJJLI, true);
            }
            C1161040gJq c1161040gJqWQ2 = ((RavenFragment) afS68S0201000_18.l0).PS().wQ2(c1161040gJq, null, null, new AwS562S0100000_18((RavenFragment) afS68S0201000_18.l0, 83));
            if (c1161040gJqWQ2 != null) {
                RavenFragment ravenFragment = (RavenFragment) afS68S0201000_18.l0;
                List list = (List) afS68S0201000_18.l1;
                List<C1161140gK0> listBU = ravenFragment.bU(c1161040gJqWQ2);
                if (listBU != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listBU, 10));
                    Iterator<C1161140gK0> it2 = listBU.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LIZLLL);
                    }
                    for (Object obj2 : C13LP.LJJJJLI(arrayList)) {
                        if (obj2 != null) {
                            list.add(obj2);
                        }
                    }
                }
            }
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS129S0201000_2(afS68S0201000_18.i2, (RavenFragment) afS68S0201000_18.l0, (List) afS68S0201000_18.l1, 4));
        }
        ((RavenFragment) afS68S0201000_18.l0).LLLLLJIL = false;
        C1C7U.LIZIZ("RavenFragment@d0e1.powerPageConfig$2$1$onLoadMore$7");
    }

    public static final void accept$3(AfS68S0201000_18 afS68S0201000_18, Object obj) {
        C1C7U.LIZ("RavenFragment@d0e1.runManualLoadMoreWithPendingContinuation$disposable$2");
        C1161040gJq c1161040gJq = (C1161040gJq) obj;
        if (c1161040gJq.LLILLJJLI) {
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS129S0201000_2(afS68S0201000_18.i2, (int) c1161040gJq, (C1161040gJq) afS68S0201000_18.l0, (RavenFragment<Object>) 16));
            C1160360gIk c1160360gIk = ((RavenFragment) afS68S0201000_18.l0).LLJJIJIL;
            if (c1160360gIk != null) {
                c1160360gIk.LJIIIIZZ(c1161040gJq.LLILLJJLI, true);
            }
            C1161040gJq c1161040gJqWQ2 = ((RavenFragment) afS68S0201000_18.l0).PS().wQ2(c1161040gJq, null, null, new AwS562S0100000_18((RavenFragment) afS68S0201000_18.l0, 2636));
            if (c1161040gJqWQ2 != null) {
                RavenFragment ravenFragment = (RavenFragment) afS68S0201000_18.l0;
                List list = (List) afS68S0201000_18.l1;
                List<C1161140gK0> listBU = ravenFragment.bU(c1161040gJqWQ2);
                if (listBU != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listBU, 10));
                    Iterator<C1161140gK0> it2 = listBU.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LIZLLL);
                    }
                    for (Object obj2 : C13LP.LJJJJLI(arrayList)) {
                        if (obj2 != null) {
                            list.add(obj2);
                        }
                    }
                }
            }
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS129S0201000_2(afS68S0201000_18.i2, (RavenFragment) afS68S0201000_18.l0, (List) afS68S0201000_18.l1, 12));
        }
        ((RavenFragment) afS68S0201000_18.l0).LLLLLJIL = false;
        C1C7U.LIZIZ("RavenFragment@d0e1.runManualLoadMoreWithPendingContinuation$disposable$2");
    }

    public AfS68S0201000_18(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
