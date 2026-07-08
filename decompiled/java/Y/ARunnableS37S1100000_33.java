package Y;

import X.C0FNV;
import X.C1ANM;
import X.C1C7U;
import X.C20327114gH;
import X.C547220LdA;
import X.C826780Wc0;
import X.DialogC1389620mGW;
import X.InterfaceC2186411Ahb;
import com.bytedance.pipo.ocr.view.CardOcrActivity;
import com.bytedance.pipo.ocr.view.component.IOcrComponent;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS37S1100000_33 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        DialogC1389620mGW dialogC1389620mGW = ((C1ANM) this.l1).LLJLILLLLZIIL;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        long jCurrentTimeMillis = ((C1ANM) this.l1).LLJLL > 0 ? System.currentTimeMillis() - ((C1ANM) this.l1).LLJLL : 0L;
        C547220LdA.LIZIZ(((C1ANM) this.l1).LLJJJIL, new C20327114gH(jCurrentTimeMillis, this.s0));
        ((C1ANM) this.l1).LLLLIL().LIZLLL.invoke(Long.valueOf(jCurrentTimeMillis), ((C1ANM) this.l1).LLLLLLIL());
        C1ANM c1anm = (C1ANM) this.l1;
        Integer numValueOf = Integer.valueOf(c1anm.LLJZ);
        int iIntValue = numValueOf.intValue() > 0 ? numValueOf.intValue() : ((C1ANM) this.l1).LLLLILI().LIZ.LJI;
        Integer numValueOf2 = Integer.valueOf(((C1ANM) this.l1).LLJZIJLIL);
        ((C1ANM) this.l1).LLLLLLLLL(c1anm.LLLLLJIL(iIntValue, numValueOf2.intValue() > 0 ? numValueOf2.intValue() : ((C1ANM) this.l1).LLLLILI().LIZ.LJII));
    }

    public static final void run$0(ARunnableS37S1100000_33 aRunnableS37S1100000_33) {
        boolean zLIZ;
        InterfaceC2186411Ahb toast;
        C1C7U.LIZ("CardOcrActivity@bb9e.showErrorToast$1");
        try {
            IOcrComponent iOcrComponentLIZ = C826780Wc0.LIZ();
            if (iOcrComponentLIZ != null && (toast = iOcrComponentLIZ.getToast((CardOcrActivity) aRunnableS37S1100000_33.l1)) != null) {
                CardOcrActivity cardOcrActivity = (CardOcrActivity) aRunnableS37S1100000_33.l1;
                String str = aRunnableS37S1100000_33.s0;
                if (str == null) {
                    str = "";
                }
                toast.LIZ(str, cardOcrActivity);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CardOcrActivity@bb9e.showErrorToast$1");
    }

    public static final void run$1(ARunnableS37S1100000_33 aRunnableS37S1100000_33) {
        boolean zLIZ;
        C1C7U.LIZ("CameoPlayerScene@cabc.playListener$1$onRenderFirstFrame$1");
        try {
            aRunnableS37S1100000_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameoPlayerScene@cabc.playListener$1$onRenderFirstFrame$1");
    }

    public ARunnableS37S1100000_33(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
