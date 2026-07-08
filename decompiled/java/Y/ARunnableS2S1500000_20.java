package Y;

import X.C1274190jGL;
import X.C1274810jHL;
import X.C1290800jh8;
import X.C1291600jiQ;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1274230jGP;
import X.InterfaceC1290730jh1;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.strategy.LinkMicLayoutConfig;
import com.ss.ttlivestreamer.livestreamv2.strategy.SimulcastConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS2S1500000_20 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
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

    public final void LIZ$0() {
        ((InterfaceC1274230jGP) this.l1).LJIILIIL(true);
        if (((C1274810jHL) this.l5).LJIIJJI) {
            return;
        }
        Gson gson = new Gson();
        LinkMicLayoutConfig linkMicLayoutConfig = (LinkMicLayoutConfig) GsonProtectorUtils.fromJson(gson, C786410Ut5.J3((JSONObject) this.l2), LinkMicLayoutConfig.class);
        linkMicLayoutConfig.LIZ = (JSONObject) this.l2;
        Object objFromJson = GsonProtectorUtils.fromJson(gson, C786410Ut5.J3((JSONObject) this.l3), (Class<Object>) SimulcastConfig.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLayoutInfo: SimulcastConfig");
        sbLIZ.append(objFromJson);
        sbLIZ.append(" config str:");
        sbLIZ.append((JSONObject) this.l2);
        sbLIZ.append(" layoutInfo:");
        sbLIZ.append((C1274190jGL) this.l4);
        sbLIZ.append(" simulcastType:");
        sbLIZ.append(this.s0);
        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        ((InterfaceC1274230jGP) this.l1).LJIJJ(((C1274810jHL) this.l5).LJI);
        ((InterfaceC1274230jGP) this.l1).LJIILJJIL(((C1274190jGL) this.l4).LIZ, linkMicLayoutConfig);
    }

    public static final void run$0(ARunnableS2S1500000_20 aRunnableS2S1500000_20) {
        HashMap map = (HashMap) aRunnableS2S1500000_20.l1;
        String str = aRunnableS2S1500000_20.s0;
        Bitmap bitmap = (Bitmap) aRunnableS2S1500000_20.l2;
        AtomicInteger atomicInteger = (AtomicInteger) aRunnableS2S1500000_20.l3;
        InterfaceC1290730jh1 interfaceC1290730jh1 = (InterfaceC1290730jh1) aRunnableS2S1500000_20.l4;
        C1291600jiQ c1291600jiQ = (C1291600jiQ) aRunnableS2S1500000_20.l5;
        C1C7U.LIZ("LynxBytedLottieView$fetchPolyfillBitmap$1$1$1@b93b.onSuccess$1L");
        map.put(str, bitmap);
        if (atomicInteger.decrementAndGet() == 0) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Bitmap bitmap2 = (Bitmap) entry.getValue();
                C1290800jh8 c1290800jh8 = c1291600jiQ.LIZLLL.get(key);
                if (c1290800jh8 != null) {
                    c1290800jh8.LJI = bitmap2;
                }
            }
            interfaceC1290730jh1.onSuccess("");
        }
        C1C7U.LIZIZ("LynxBytedLottieView$fetchPolyfillBitmap$1$1$1@b93b.onSuccess$1L");
    }

    public static final void run$1(ARunnableS2S1500000_20 aRunnableS2S1500000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.updateLayoutInfo$1");
        try {
            aRunnableS2S1500000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.updateLayoutInfo$1");
    }

    public static final void run$2(ARunnableS2S1500000_20 aRunnableS2S1500000_20) {
        HashMap map = (HashMap) aRunnableS2S1500000_20.l1;
        String str = aRunnableS2S1500000_20.s0;
        Bitmap bitmap = (Bitmap) aRunnableS2S1500000_20.l2;
        AtomicInteger atomicInteger = (AtomicInteger) aRunnableS2S1500000_20.l3;
        InterfaceC1290730jh1 interfaceC1290730jh1 = (InterfaceC1290730jh1) aRunnableS2S1500000_20.l4;
        C1291600jiQ c1291600jiQ = (C1291600jiQ) aRunnableS2S1500000_20.l5;
        C1C7U.LIZ("SDUIBytedLottieView$fetchPolyfillBitmap$1$1$1@129e.onSuccess$1L");
        map.put(str, bitmap);
        if (atomicInteger.decrementAndGet() == 0) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Bitmap bitmap2 = (Bitmap) entry.getValue();
                C1290800jh8 c1290800jh8 = c1291600jiQ.LIZLLL.get(key);
                if (c1290800jh8 != null) {
                    c1290800jh8.LJI = bitmap2;
                }
            }
            interfaceC1290730jh1.onSuccess("");
        }
        C1C7U.LIZIZ("SDUIBytedLottieView$fetchPolyfillBitmap$1$1$1@129e.onSuccess$1L");
    }

    public ARunnableS2S1500000_20(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
        this.l5 = obj5;
    }
}
