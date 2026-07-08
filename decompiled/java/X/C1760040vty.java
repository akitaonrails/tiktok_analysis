package X;

import Y.AComparatorS45S0000000_26;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.popup.libra.SeaPdpPopupConfigSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS104S0210000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760040vty {
    public final C1757400vpi LIZ;
    public final ViewGroup LIZIZ;
    public final FrameLayout LIZJ;
    public final CopyOnWriteArrayList<AbstractC1760060vu0> LIZLLL;
    public final CopyOnWriteArrayList<AbstractC1760060vu0> LJ;
    public AbstractC1760060vu0 LJFF;

    public final void LIZ() {
        ViewGroup viewGroup;
        Iterator<AbstractC1760060vu0> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(null, null);
        }
        this.LIZLLL.removeAll(this.LJ);
        this.LJ.clear();
        AbstractC1760060vu0 abstractC1760060vu0 = this.LJFF;
        if (abstractC1760060vu0 != null) {
            abstractC1760060vu0.LIZIZ(null, null);
        }
        this.LIZLLL.remove(this.LJFF);
        this.LJFF = null;
        Iterator<AbstractC1760060vu0> it3 = this.LIZLLL.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(null, null);
        }
        this.LIZLLL.clear();
        C786410Ut5.LJJJJIZL(this.LIZJ);
        ViewParent parent = this.LIZJ.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LIZJ, viewGroup);
    }

    public final void LIZLLL(boolean z) {
        ViewGroup viewGroup;
        AbstractC1760060vu0 abstractC1760060vu0 = this.LJFF;
        if (abstractC1760060vu0 != null) {
            abstractC1760060vu0.LIZIZ("exception", null);
            this.LJFF = null;
        }
        AbstractC1760060vu0 abstractC1760060vu02 = (AbstractC1760060vu0) C19719612Di.LJJIIZI(this.LJ);
        if (abstractC1760060vu02 == null) {
            if (this.LIZLLL.isEmpty() && this.LJ.isEmpty() && this.LJFF == null) {
                C786410Ut5.LJJJJIZL(this.LIZJ);
                ViewParent parent = this.LIZJ.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(this.LIZJ, viewGroup);
                    return;
                }
                return;
            }
            return;
        }
        this.LJFF = abstractC1760060vu02;
        AwS104S0210000_26 awS104S0210000_26 = new AwS104S0210000_26(abstractC1760060vu02, z, this, 10);
        if (this.LIZJ.getParent() == null) {
            this.LIZIZ.addView(this.LIZJ);
            C430110Gtl.LIZ(this.LIZJ, new AwS570S0100000_26(awS104S0210000_26, 1626));
        } else {
            awS104S0210000_26.invoke();
        }
    }

    public final C1760170vuB LJ(C1759970vtr c1759970vtr) {
        C1741570vQB c1741570vQB;
        if (C1759960vtq.LIZ[c1759970vtr.LIZIZ.ordinal()] == 1) {
            C1760170vuB c1760170vuB = new C1760170vuB(this.LIZ, this, this.LIZJ, c1759970vtr);
            this.LIZLLL.addIfAbsent(c1760170vuB);
            this.LJ.addIfAbsent(c1760170vuB);
            CopyOnWriteArrayList<AbstractC1760060vu0> copyOnWriteArrayList = this.LJ;
            if (copyOnWriteArrayList.size() > 1) {
                C08XD.LJJ(copyOnWriteArrayList, new AComparatorS45S0000000_26(8));
            }
            if (this.LJFF == null) {
                LIZLLL(false);
            }
            if (this.LIZLLL.size() > SeaPdpPopupConfigSettings.LIZIZ.popupListMaxThreshold && (c1741570vQB = c1759970vtr.LJI) != null) {
                c1741570vQB.LIZJ("popup", "over threshold", C2097608Jq.LJIIIIZZ(new Pair("type", Integer.valueOf(c1759970vtr.LIZIZ.getValue())), new Pair("schema", c1759970vtr.LIZJ), new Pair("quantity", Integer.valueOf(this.LIZLLL.size()))));
            }
            return c1760170vuB;
        }
        throw new C1954807lC();
    }

    public C1760040vty(C1757400vpi c1757400vpi, ViewGroup viewGroup) {
        this.LIZ = c1757400vpi;
        this.LIZIZ = viewGroup;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        this.LIZJ = frameLayout;
        this.LIZLLL = new CopyOnWriteArrayList<>();
        this.LJ = new CopyOnWriteArrayList<>();
    }

    public final Pair LIZJ(String str, C1760110vu5 c1760110vu5) {
        AbstractC1760060vu0 next;
        Iterator<AbstractC1760060vu0> it2 = this.LIZLLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LJFF, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC1760060vu0 abstractC1760060vu0 = next;
        if (abstractC1760060vu0 == null) {
            return new Pair(Boolean.FALSE, "component id absent");
        }
        C1741570vQB c1741570vQBLIZIZ = c1760110vu5.LIZIZ(abstractC1760060vu0.LJ, abstractC1760060vu0.LJFF, new LinkedHashMap());
        if (abstractC1760060vu0.LJII) {
            if (c1741570vQBLIZIZ != null) {
                c1760110vu5.LIZ(c1741570vQBLIZIZ, false, "has hidden");
            }
        } else {
            abstractC1760060vu0.LIZJ();
            if (!abstractC1760060vu0.LJIIIZ) {
                AbstractC1760060vu0.LJI(abstractC1760060vu0, "dismiss_unfinish", false, "action hide", null, 8);
            }
            if (c1741570vQBLIZIZ != null) {
                c1760110vu5.LIZ(c1741570vQBLIZIZ, true, null);
            }
        }
        if (Intrinsics.LJFF(abstractC1760060vu0, this.LJFF)) {
            this.LJFF = null;
            LIZLLL(true);
        } else {
            this.LJ.remove(abstractC1760060vu0);
        }
        return new Pair(Boolean.TRUE, "");
    }

    public final Pair LIZIZ(String str, String str2, C1760090vu3 c1760090vu3) {
        AbstractC1760060vu0 next;
        Iterator<AbstractC1760060vu0> it2 = this.LIZLLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LJFF, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC1760060vu0 abstractC1760060vu0 = next;
        if (abstractC1760060vu0 == null) {
            return new Pair(Boolean.FALSE, "component id absent");
        }
        abstractC1760060vu0.LIZIZ(str2, c1760090vu3);
        this.LIZLLL.remove(abstractC1760060vu0);
        if (Intrinsics.LJFF(abstractC1760060vu0, this.LJFF)) {
            this.LJFF = null;
            LIZLLL(true);
        } else {
            this.LJ.remove(abstractC1760060vu0);
        }
        return new Pair(Boolean.TRUE, "");
    }
}
