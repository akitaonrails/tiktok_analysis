package Y;

import X.AbstractC316870CbV;
import X.C013C;
import X.C09JN;
import X.C1043010dFT;
import X.C189200o6;
import X.C1C7U;
import X.C259800zU;
import X.C316650Cb9;
import X.C317290CcB;
import X.EnumC1160730gJL;
import X.InterfaceC1364105Vn;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.internal.AwS129S0201000_2;

/* JADX INFO: loaded from: classes19.dex */
public class AfS8S0401000_18 implements C09JN {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS8S0401000_18 afS8S0401000_18, Object obj) {
        C1C7U.LIZ("RavenFragment@d0e1.powerPageConfig$2$1$onLoadMore$8");
        Throwable th = (Throwable) obj;
        C013C c013c = (C013C) afS8S0401000_18.l0;
        if (!c013c.element) {
            c013c.element = true;
            Runnable runnable = (Runnable) ((C259800zU) afS8S0401000_18.l1).element;
            if (runnable != null) {
                ((RavenFragment) afS8S0401000_18.l2).GS().removeCallbacks(runnable);
            }
        }
        ((RavenFragment) afS8S0401000_18.l2).oT(th, false);
        RavenFragment ravenFragment = (RavenFragment) afS8S0401000_18.l2;
        ravenFragment.LLL = false;
        ravenFragment.LLLFZ = false;
        ravenFragment.LLLLLJIL = false;
        ravenFragment.LLJJLIIIJLLLLLLLZ = false;
        ravenFragment.LLJL = false;
        ravenFragment.LLJLIL = false;
        ravenFragment.YT(EnumC1160730gJL.LL, "onLoadMore error");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS8S0401000_18.l3;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception("Raven Request Error");
        c317290CcB.getClass();
        C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
        C189200o6.m2constructorimpl(c316650Cb9);
        interfaceC1364105Vn.resumeWith(c316650Cb9);
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS129S0201000_2(afS8S0401000_18.i4, (int) th, (Throwable) afS8S0401000_18.l2, (RavenFragment<Object>) 5));
        ((RavenFragment) afS8S0401000_18.l2).hS();
        ((RavenFragment) afS8S0401000_18.l2).uT("onLoadMore error", true);
        ((RavenFragment) afS8S0401000_18.l2).hT("load more error");
        ((RavenFragment) afS8S0401000_18.l2).kS("onLoadMore error");
        C1C7U.LIZIZ("RavenFragment@d0e1.powerPageConfig$2$1$onLoadMore$8");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS8S0401000_18 r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS8S0401000_18.accept$1(Y.AfS8S0401000_18, java.lang.Object):void");
    }

    public AfS8S0401000_18(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.i4 = i;
    }
}
