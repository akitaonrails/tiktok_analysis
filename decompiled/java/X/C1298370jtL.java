package X;

import Y.ARunnableS120S0100000_20;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298370jtL implements InterfaceC1298410jtP {
    public final ArrayList<C1298170jt1> LIZ;
    public final WeakReference<AbstractC1317090kNX> LIZIZ;

    public final AbstractC1317090kNX LIZIZ() {
        return this.LIZIZ.get();
    }

    public C1298370jtL(AbstractC1317090kNX abstractC1317090kNX) {
        this.LIZIZ = new WeakReference<>(abstractC1317090kNX);
        new WeakReference(abstractC1317090kNX.LLILZIL);
        this.LIZ = new ArrayList<>();
    }

    @Override // X.InterfaceC1298410jtP
    public final void LIZ(EnumC1298380jtM enumC1298380jtM, C1298400jtO c1298400jtO) {
        if (this.LIZ.size() == 0) {
            return;
        }
        if (enumC1298380jtM != EnumC1298380jtM.kLynxEventTypeLayoutEvent) {
            if (enumC1298380jtM == EnumC1298380jtM.kLynxEventTypeCustomEvent) {
                String str = c1298400jtO.LIZIZ;
                if (!"scroll".equals(str) && !"scrolltoupper".equals(str) && !"scrolltolower".equals(str)) {
                    return;
                }
            } else {
                return;
            }
        }
        C1290750jh3.LJ(new ARunnableS120S0100000_20(this, 302));
    }
}
