package Y;

import X.AbstractC1335900krs;
import X.C0I6Y;
import X.C1C7U;
import X.C631370Opb;
import X.C786410Ut5;
import X.C869590Y9l;
import X.InterfaceC461380I7k;
import android.net.Uri;
import android.view.View;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class ARunnableS4S0600000_14 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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
        if (Intrinsics.LJFF(((C869590Y9l) this.l0).getUuid(), C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ((AwemeCardAssem) this.l1)).getUuid())) {
            TuxSpinner tuxSpinnerQp = ((AwemeCardAssem) this.l1).Qp();
            if (tuxSpinnerQp != null) {
                C786410Ut5.LLZILL(tuxSpinnerQp, 8);
            }
            ((AbstractC1335900krs) this.l2).cm((Uri) this.l3, (View) this.l4, (Throwable) this.l5);
        }
    }

    public final void LIZ$1() {
        if (Intrinsics.LJFF(((C869590Y9l) this.l0).getUuid(), C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ((AwemeCardAssem) this.l1)).getUuid())) {
            super/*X.0krs*/.Bh((Uri) this.l3, (View) this.l4);
            TuxSpinner tuxSpinnerQp = ((AwemeCardAssem) this.l1).Qp();
            if (tuxSpinnerQp != null) {
                C786410Ut5.LLZILL(tuxSpinnerQp, 0);
            }
            ((AbstractC1335900krs) this.l5).Bh((Uri) this.l3, (View) this.l4);
        }
    }

    public static final void run$0(ARunnableS4S0600000_14 aRunnableS4S0600000_14) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeCardAssem@3383.loadThumbnail$2$onFailed$1");
        try {
            aRunnableS4S0600000_14.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeCardAssem@3383.loadThumbnail$2$onFailed$1");
    }

    public static final void run$1(ARunnableS4S0600000_14 aRunnableS4S0600000_14) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeCardAssem@3383.loadThumbnail$2$onStart$1");
        try {
            aRunnableS4S0600000_14.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeCardAssem@3383.loadThumbnail$2$onStart$1");
    }

    public ARunnableS4S0600000_14(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
        this.l5 = obj6;
    }
}
