package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987280bna extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (this.$t != 0) {
            super.LJJZ(interfaceC1541990qEH);
        } else {
            C20441214yg.LIZIZ("RematchGuideButton", "lynx rematch button destroy");
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        if (this.$t != 0) {
            super.LJL(interfaceC1541990qEH, str, c1542120qEU);
        } else {
            LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (this.$t != 0) {
            super.LJLIIIL(interfaceC1541990qEH);
        } else {
            C20441214yg.LIZIZ("RematchGuideButton", "lynx rematch button load finish");
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (this.$t != 0) {
            super.LJLIIL(interfaceC1541990qEH, str);
        } else {
            C20441214yg.LIZIZ("RematchGuideButton", "lynx rematch button load start");
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        if (1 - this.$t != 0) {
            super.onDestroy();
        } else {
            onDestroy$0(this);
        }
    }

    public static final void onDestroy$0(C987280bna c987280bna) {
        ((ViewOnClickListenerC986770bml) c987280bna.l0).LLLIIIL = null;
        C20441214yg.LIZIZ("CoHostWindowView", "on close Match Item detail==>");
    }

    public C987280bna(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJL$0(C987280bna c987280bna, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx rematch button load failed, error = ");
        sbLIZ.append(c1542120qEU.LIZ());
        C20441214yg.LJ("RematchGuideButton", C2188811AlT.LIZIZ(sbLIZ));
        ((Function0) c987280bna.l0).invoke();
    }
}
