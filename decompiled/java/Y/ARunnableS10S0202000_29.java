package Y;

import X.C121I;
import X.C121W;
import X.C196868120s;
import X.C1C7U;
import android.graphics.Rect;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.videoarch.live.ttquic.TTLogManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS10S0202000_29 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS10S0202000_29 aRunnableS10S0202000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TTLogManager@b606.onAlog$2");
        try {
            synchronized (((TTLogManager) aRunnableS10S0202000_29.l1).mLogLock) {
                try {
                    int i = aRunnableS10S0202000_29.i2;
                    if (i == 1 || i == 101) {
                        AppLogNewUtils.onEventV3(TTLogManager.mAlogEventKey[aRunnableS10S0202000_29.i3], (JSONObject) aRunnableS10S0202000_29.l0);
                    }
                } finally {
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTLogManager@b606.onAlog$2");
    }

    public static final void run$1(ARunnableS10S0202000_29 aRunnableS10S0202000_29) {
        C121W c121w = (C121W) aRunnableS10S0202000_29.l0;
        int i = aRunnableS10S0202000_29.i2;
        int i2 = aRunnableS10S0202000_29.i3;
        int[] iArr = (int[]) aRunnableS10S0202000_29.l1;
        c121w.getClass();
        C1C7U.LIZ("FTCInfoStickerHelper@ec40.updateDataOnLayoutChanged$1L");
        if (i != 0 && i2 != 0 && iArr != null) {
            int i3 = iArr[1];
            new Rect(0, i3, i, i2 + i3);
            C1C7U.LIZIZ("FTCInfoStickerHelper@ec40.updateDataOnLayoutChanged$1L");
            return;
        }
        C1C7U.LIZIZ("FTCInfoStickerHelper@ec40.updateDataOnLayoutChanged$1L");
    }

    public static final void run$2(ARunnableS10S0202000_29 aRunnableS10S0202000_29) {
        C121W c121w = (C121W) aRunnableS10S0202000_29.l0;
        int i = aRunnableS10S0202000_29.i2;
        int i2 = aRunnableS10S0202000_29.i3;
        C121I c121i = (C121I) aRunnableS10S0202000_29.l1;
        c121w.getClass();
        C1C7U.LIZ("FTCInfoStickerHelper@ec40.reloadUI$1L");
        c121w.LJIIL(i, i2, c121i);
        c121w.LJIIJJI();
        C1C7U.LIZIZ("FTCInfoStickerHelper@ec40.reloadUI$1L");
    }

    public static final void run$3(ARunnableS10S0202000_29 aRunnableS10S0202000_29) {
        C196868120s c196868120s = (C196868120s) aRunnableS10S0202000_29.l0;
        int i = aRunnableS10S0202000_29.i2;
        int i2 = aRunnableS10S0202000_29.i3;
        C121I c121i = (C121I) aRunnableS10S0202000_29.l1;
        c196868120s.getClass();
        C1C7U.LIZ("InfoStickerHelper@8ef8.reloadUI$1L");
        c196868120s.LJIL(i, i2, c121i);
        c196868120s.LJIJJ();
        C1C7U.LIZIZ("InfoStickerHelper@8ef8.reloadUI$1L");
    }

    public ARunnableS10S0202000_29(Object obj, int i, int i2, Object obj2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = obj2;
    }
}
