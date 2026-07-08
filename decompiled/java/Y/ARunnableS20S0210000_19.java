package Y;

import X.C0SKF;
import X.C1219040hpO;
import X.C162B;
import X.C1664690tQB;
import X.C1C7U;
import X.C295750BiX;
import X.InterfaceC1209780haS;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS20S0210000_19 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (C295750BiX.LIZ()) {
            C162B.LIZIZ.bh(null, (List) this.l0);
        }
        if (C0SKF.LIZLLL(((FullFeedFragmentPanel) this.l1).getEventType())) {
            ((FullFeedFragmentPanel) this.l1).f().LIZJ(((FullFeedFragmentPanel) this.l1).getEventType(), !this.z2, (List) this.l0);
        }
    }

    public static final void run$0(ARunnableS20S0210000_19 aRunnableS20S0210000_19) {
        boolean zLIZ;
        C1C7U.LIZ("FullFeedFragmentPanel@9b2e.resetPrefetchTranslations$1");
        try {
            aRunnableS20S0210000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.resetPrefetchTranslations$1");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [STATE, java.lang.Object] */
    public static final void run$1(ARunnableS20S0210000_19 aRunnableS20S0210000_19) {
        C1664690tQB c1664690tQB = (C1664690tQB) aRunnableS20S0210000_19.l0;
        Function1 function1 = (Function1) aRunnableS20S0210000_19.l1;
        boolean z = aRunnableS20S0210000_19.z2;
        C1C7U.LIZ("StateContainer@6ecc.postState$1L");
        c1664690tQB.LIZ = function1.invoke(c1664690tQB.LIZ);
        c1664690tQB.LIZIZ(z);
        C1C7U.LIZIZ("StateContainer@6ecc.postState$1L");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [STATE, java.lang.Object] */
    public static final void run$2(ARunnableS20S0210000_19 aRunnableS20S0210000_19) {
        C1664690tQB c1664690tQB = (C1664690tQB) aRunnableS20S0210000_19.l0;
        Function1 function1 = (Function1) aRunnableS20S0210000_19.l1;
        boolean z = aRunnableS20S0210000_19.z2;
        C1C7U.LIZ("StateContainer@6ecc.setState$1L");
        c1664690tQB.LIZ = function1.invoke(c1664690tQB.LIZ);
        c1664690tQB.LIZIZ(z);
        C1C7U.LIZIZ("StateContainer@6ecc.setState$1L");
    }

    public static final void run$3(ARunnableS20S0210000_19 aRunnableS20S0210000_19) {
        boolean zLIZ;
        C1C7U.LIZ("DetailFriendsV3Operator@5dd.requestStandaloneLoadMore$2$4");
        try {
            ((C1219040hpO) aRunnableS20S0210000_19.l0).LLILZLL = false;
            InterfaceC1209780haS interfaceC1209780haS = ((C1219040hpO) aRunnableS20S0210000_19.l0).LLILZ;
            if (interfaceC1209780haS != null) {
                interfaceC1209780haS.Pj((List) aRunnableS20S0210000_19.l1, aRunnableS20S0210000_19.z2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetailFriendsV3Operator@5dd.requestStandaloneLoadMore$2$4");
    }

    public static final void run$4(ARunnableS20S0210000_19 aRunnableS20S0210000_19) {
        boolean zLIZ;
        C1C7U.LIZ("DetailFriendsV3Operator@5dd.bindView$4$1");
        try {
            InterfaceC1209780haS interfaceC1209780haS = ((C1219040hpO) aRunnableS20S0210000_19.l0).LLILZ;
            if (interfaceC1209780haS != null) {
                if (((List) aRunnableS20S0210000_19.l1).isEmpty()) {
                    interfaceC1209780haS.Ng1();
                } else {
                    interfaceC1209780haS.LLJJJIL((List) aRunnableS20S0210000_19.l1, aRunnableS20S0210000_19.z2);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetailFriendsV3Operator@5dd.bindView$4$1");
    }

    public static final void run$5(ARunnableS20S0210000_19 aRunnableS20S0210000_19) {
        boolean zLIZ;
        C1C7U.LIZ("DetailFriendsV3Operator@5dd.bindView$8$1");
        try {
            InterfaceC1209780haS interfaceC1209780haS = ((C1219040hpO) aRunnableS20S0210000_19.l0).LLILZ;
            if (interfaceC1209780haS != null) {
                interfaceC1209780haS.Pj((List) aRunnableS20S0210000_19.l1, aRunnableS20S0210000_19.z2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetailFriendsV3Operator@5dd.bindView$8$1");
    }

    public ARunnableS20S0210000_19(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
        this.z2 = z;
    }
}
