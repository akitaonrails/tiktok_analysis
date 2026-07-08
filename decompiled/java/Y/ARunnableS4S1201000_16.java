package Y;

import X.C1032880cz8;
import X.C1032890cz9;
import X.C1032900czA;
import X.C1032910czB;
import X.C1C7U;
import X.C2201308jr;
import X.C786410Ut5;
import X.InterfaceC1033130czX;
import X.InterfaceC1033150czZ;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS252S0000000_16;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS4S1201000_16 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
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
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        String str = (String) ((HashMap) this.l1).get("task_id");
        if (str == null) {
            str = "";
        }
        C1032910czB.LJ(this.i3, (InterfaceC1033130czX) this.l2, str);
        C1032890cz9 c1032890cz9 = C1032890cz9.LIZ;
        String str2 = this.s0;
        InterfaceC1033130czX interfaceC1033130czX = (InterfaceC1033130czX) this.l2;
        HashMap map = (HashMap) this.l1;
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(276);
        c1032890cz9.getClass();
        C1032890cz9.LJIIIZ(str2, interfaceC1033130czX, map, aFwS252S0000000_16);
    }

    public final void LIZ$1() {
        String str = (String) ((HashMap) this.l1).get("task_id");
        if (str == null) {
            str = "";
        }
        C1032900czA.LJII(this.i3, (InterfaceC1033150czZ) this.l2, str);
        C1032880cz8.LJIIIIZZ(this.s0, (InterfaceC1033150czZ) this.l2, (HashMap) this.l1, AFwS252S0000000_16.get$arr$(608));
    }

    public static final void run$0(ARunnableS4S1201000_16 aRunnableS4S1201000_16) {
        boolean zLIZ;
        C1C7U.LIZ("RewardAdCacheManager@34ce.concurrentRequestWithFixedInterval$1");
        try {
            aRunnableS4S1201000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RewardAdCacheManager@34ce.concurrentRequestWithFixedInterval$1");
    }

    public static final void run$1(ARunnableS4S1201000_16 aRunnableS4S1201000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AITheaterImageSpan$Companion@7464.buildPreviewContentView$1$onFailed$1");
        try {
            Bitmap bitmapLIZ = C2201308jr.LIZ(C786410Ut5.N3((Context) aRunnableS4S1201000_16.l1), aRunnableS4S1201000_16.i3, aRunnableS4S1201000_16.s0);
            SmartImageView smartImageView = (SmartImageView) aRunnableS4S1201000_16.l2;
            HandlerHook.viewPost(smartImageView, new ARunnableS85S0200000_16(bitmapLIZ, smartImageView, 32));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AITheaterImageSpan$Companion@7464.buildPreviewContentView$1$onFailed$1");
    }

    public static final void run$2(ARunnableS4S1201000_16 aRunnableS4S1201000_16) {
        boolean zLIZ;
        C1C7U.LIZ("GmtRewardAdCacheManager@e95.concurrentRequestWithFixedInterval$1");
        try {
            aRunnableS4S1201000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GmtRewardAdCacheManager@e95.concurrentRequestWithFixedInterval$1");
    }

    public ARunnableS4S1201000_16(Object obj, String str, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i3 = i;
        this.l2 = obj2;
    }
}
