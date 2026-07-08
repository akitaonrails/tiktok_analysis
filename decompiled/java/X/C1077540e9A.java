package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0e9A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077540e9A extends AbstractC1542200qEc {
    public final int $t;

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (this.$t != 0) {
            super.LJLIIL(interfaceC1541990qEH, str);
        } else {
            LJLIIL$0(this, interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (this.$t != 0) {
            super.LJLJI(interfaceC1541990qEH);
        } else {
            LJLJI$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) {
        if (1 - this.$t != 0) {
            super.LJLLJ(sparkContext, c1548490qOl);
        } else {
            LJLLJ$0(this, sparkContext, c1548490qOl);
        }
    }

    public C1077540e9A(int i) {
        this.$t = i;
    }

    public C1077540e9A(C1037080d5u c1037080d5u, int i) {
        this.$t = i;
    }

    public static final void LJLJI$0(C1077540e9A c1077540e9A, InterfaceC1541990qEH interfaceC1541990qEH) {
        final EnumC1067640dtC type;
        InterfaceC1531560pxS interfaceC1531560pxS;
        C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
        if (hybridContext != null && (interfaceC1531560pxS = hybridContext.hybridParams) != null) {
            type = interfaceC1531560pxS.getType();
        } else {
            type = null;
        }
        C1075770e6J c1075770e6J = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
        if (c1075770e6J != null) {
            final WeakReference weakReference = new WeakReference(interfaceC1541990qEH);
            c1075770e6J.LJIJ(InterfaceC1028200cra.class, new AbstractC1047330dMR(weakReference) { // from class: X.0dYF
                @Override // X.AbstractC1047330dMR, X.InterfaceC1028200cra
                public final EnumC1054630dYD LJ() {
                    EnumC1067640dtC enumC1067640dtC = type;
                    return enumC1067640dtC == EnumC1067640dtC.LYNX ? EnumC1054630dYD.LYNX : enumC1067640dtC == EnumC1067640dtC.WEB ? EnumC1054630dYD.WEB : enumC1067640dtC == EnumC1067640dtC.SDUI ? EnumC1054630dYD.SDUI : EnumC1054630dYD.NONE;
                }
            });
        }
    }

    public static final void LJLIIL$0(C1077540e9A c1077540e9A, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1543410qGZ c1543410qGZLJIIJ;
        Iterator it2 = ((ArrayList) C1054670dYH.LIZ).iterator();
        while (it2.hasNext()) {
            for (Class cls : ((InterfaceC667380QFs) it2.next()).LIZ(interfaceC1541990qEH)) {
                C1075770e6J c1075770e6J = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
                if (c1075770e6J != null && (c1543410qGZLJIIJ = c1075770e6J.LJIIJ()) != null) {
                    c1543410qGZLJIIJ.LJFF(cls, EnumC1063300dmC.ALL);
                }
            }
        }
    }

    public static final void LJLLJ$0(C1077540e9A c1077540e9A, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        if (sparkContext != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJL(sparkContext);
        }
    }
}
