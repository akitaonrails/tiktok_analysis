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
public class ARunnableS2S2300000_30 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

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

    public final void LIZ$1() {
        C148Q c148qPost = C1498550p6D.LIZ.LIZ.LJIIZILJ.post(this.s0, (Map) this.l2, this.s1.getBytes());
        String str = new String(c148qPost.LIZ, Charsets.UTF_8);
        C202164148k c202164148k = (C202164148k) this.l4;
        C14AH c14ah = (C14AH) this.l3;
        Map<String, String> map = c148qPost.LIZLLL;
        c202164148k.getClass();
        C202164148k.LJFF(c14ah, str, map);
        ((C202164148k) this.l4).LIZJ(c148qPost);
    }

    public final void LIZ$0() {
        String str = new String(BdTuring.getInstance().getConfig().getHttpClient().post(this.s0, (Map) this.l2, this.s1.getBytes()), Charsets.UTF_8);
        C202173148t c202173148t = (C202173148t) this.l4;
        C14AL c14al = (C14AL) this.l3;
        c202173148t.getClass();
        C202173148t.LJ(c14al, str);
    }

    public static final void run$0(ARunnableS2S2300000_30 aRunnableS2S2300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("VerifyDialogHandler@37d3.nativeRequest$1");
        try {
            aRunnableS2S2300000_30.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VerifyDialogHandler@37d3.nativeRequest$1");
    }

    public static final void run$1(ARunnableS2S2300000_30 aRunnableS2S2300000_30) {
        boolean zLIZ;
        C1C7U.LIZ("VerifyDialogHandler@2fa1.nativeRequest$1");
        try {
            aRunnableS2S2300000_30.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VerifyDialogHandler@2fa1.nativeRequest$1");
    }

    public ARunnableS2S2300000_30(Object obj, String str, Object obj2, String str2, Object obj3, int i) {
        this.$t = i;
        this.l4 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.s1 = str2;
        this.l3 = obj3;
    }
}
