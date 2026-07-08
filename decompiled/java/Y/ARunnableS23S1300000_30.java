package Y;

import X.C148Q;
import X.C1498550p6D;
import X.C14AH;
import X.C14AL;
import X.C1C7U;
import X.C202164148k;
import X.C202173148t;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS23S1300000_30 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
        C148Q c148q = C1498550p6D.LIZ.LIZ.LJIIZILJ.get(this.s0, (Map) this.l1);
        String str = new String(c148q.LIZ, Charsets.UTF_8);
        C202164148k c202164148k = (C202164148k) this.l3;
        C14AH c14ah = (C14AH) this.l2;
        Map<String, String> map = c148q.LIZLLL;
        c202164148k.getClass();
        C202164148k.LJFF(c14ah, str, map);
        ((C202164148k) this.l3).LIZJ(c148q);
    }

    public static final void run$0(ARunnableS23S1300000_30 aRunnableS23S1300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("VerifyDialogHandler@37d3.nativeRequest$2");
        try {
            String str = new String(BdTuring.getInstance().getConfig().getHttpClient().get(aRunnableS23S1300000_30.s0, (Map) aRunnableS23S1300000_30.l1), Charsets.UTF_8);
            C202173148t c202173148t = (C202173148t) aRunnableS23S1300000_30.l3;
            C14AL c14al = (C14AL) aRunnableS23S1300000_30.l2;
            c202173148t.getClass();
            C202173148t.LJ(c14al, str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VerifyDialogHandler@37d3.nativeRequest$2");
    }

    public static final void run$1(ARunnableS23S1300000_30 aRunnableS23S1300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("VerifyDialogHandler@2fa1.nativeRequest$2");
        try {
            aRunnableS23S1300000_30.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VerifyDialogHandler@2fa1.nativeRequest$2");
    }

    public ARunnableS23S1300000_30(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l3 = obj;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
