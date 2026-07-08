package Y;

import X.AbstractC1325130kaV;
import X.AbstractC1327750kej;
import X.C1303970k2N;
import X.C1320970kTn;
import X.C1323050kX9;
import X.InterfaceC1304030k2T;
import X.InterfaceC1316680kMs;
import X.InterfaceC1320200kSY;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.lynx.canvas.KryptonApp;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class AObjectS294S0200000_20 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS294S0200000_20 aObjectS294S0200000_20) {
        C1303970k2N c1303970k2N = (C1303970k2N) aObjectS294S0200000_20.l0;
        CountDownLatch countDownLatch = (CountDownLatch) aObjectS294S0200000_20.l1;
        try {
            InterfaceC1304030k2T interfaceC1304030k2T = c1303970k2N.LIZ.LIZ.LIZJ;
            if (interfaceC1304030k2T != null && c1303970k2N.LIZIZ != null) {
                interfaceC1304030k2T.LIZLLL();
            }
            KryptonApp kryptonApp = c1303970k2N.LIZIZ;
            if (kryptonApp != null) {
                kryptonApp.LIZIZ();
            }
            c1303970k2N.LIZIZ = null;
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        countDownLatch.countDown();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS294S0200000_20 aObjectS294S0200000_20) {
        C1320970kTn c1320970kTn = (C1320970kTn) aObjectS294S0200000_20.l0;
        InterfaceC1320200kSY interfaceC1320200kSY = (InterfaceC1320200kSY) aObjectS294S0200000_20.l1;
        if (interfaceC1320200kSY != null) {
            c1320970kTn.getClass();
            interfaceC1320200kSY.close();
        }
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = c1320970kTn.LJIIIZ;
        c1320970kTn.LJIIIZ = null;
        Object obj = c1320970kTn.LJIIJ;
        c1320970kTn.LJIIJ = null;
        if (obj != null && (obj instanceof InterfaceC1316680kMs)) {
            ((InterfaceC1316680kMs) obj).LIZ();
        }
        if (c1323050kX9 != null) {
            C1323050kX9.LJII(c1323050kX9);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS294S0200000_20 aObjectS294S0200000_20) {
        ((ImageView) aObjectS294S0200000_20.l0).setImageBitmap(((AbstractC1325130kaV) ((AbstractC1327750kej) aObjectS294S0200000_20.l1)).getUnderlyingBitmap());
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS294S0200000_20 aObjectS294S0200000_20) {
        ((ImageView) aObjectS294S0200000_20.l0).setImageDrawable((Drawable) aObjectS294S0200000_20.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS294S0200000_20 aObjectS294S0200000_20) {
        ((ImageView) aObjectS294S0200000_20.l0).setImageBitmap((Bitmap) aObjectS294S0200000_20.l1);
        return Unit.LIZ;
    }

    public AObjectS294S0200000_20(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
