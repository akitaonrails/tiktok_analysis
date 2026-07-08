package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883450z71 implements InterfaceC1883470z73 {
    public final /* synthetic */ C1883550z7B LIZ;

    public C1883450z71(C1883550z7B c1883550z7B) {
        this.LIZ = c1883550z7B;
    }

    @Override // X.InterfaceC1883470z73
    public final void LIZJ(int i) {
        C1883550z7B c1883550z7B = this.LIZ;
        Iterator it2 = ((ArrayList) c1883550z7B.LLJJJIL).iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(((C1883100z6S) it2.next()).LLILLL.tabClass, "videos")) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == i) {
            c1883550z7B.LLILZ.getEventCenter().LIZIZ(null, "scroll_to_bottom");
        }
        Iterator it3 = this.LIZ.LLILZ.LJIJJLI().LJIILIIL().iterator();
        while (it3.hasNext()) {
            ((InterfaceC1883470z73) it3.next()).LIZJ(i);
        }
    }

    @Override // X.InterfaceC1883470z73
    public final void LIZ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tab =");
        sbLIZ.append(i);
        sbLIZ.append(" scrolling scrollY=");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("MixTabItemNestedScrollView", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = this.LIZ.LLILZ.LJIJJLI().LJIILIIL().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1883470z73) it2.next()).LIZ(i, i2);
        }
    }

    @Override // X.InterfaceC1883470z73
    public final void LIZIZ(int i, AbstractC1883160z6Y abstractC1883160z6Y) {
        Iterator it2 = this.LIZ.LLILZ.LJIJJLI().LJIILIIL().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1883470z73) it2.next()).LIZIZ(i, abstractC1883160z6Y);
        }
    }

    @Override // X.InterfaceC1883470z73
    public final void LIZLLL(int i, int i2) {
        C1883550z7B c1883550z7B = this.LIZ;
        if (i2 == 0) {
            C1883100z6S c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(i, c1883550z7B.LLJJJIL);
            if (c1883100z6S != null) {
                c1883100z6S.retry();
            }
        } else {
            c1883550z7B.getClass();
        }
        Iterator it2 = this.LIZ.LLILZ.LJIJJLI().LJIILIIL().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1883470z73) it2.next()).LIZLLL(i, i2);
        }
    }
}
