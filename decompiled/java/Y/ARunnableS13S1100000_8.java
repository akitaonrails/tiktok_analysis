package Y;

import X.C0MPG;
import X.C1389890mGx;
import X.C1C7U;
import X.C20622515mp;
import X.C785410UrT;
import X.C816490W1f;
import android.view.View;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.vesdk.VEMediaParser;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS13S1100000_8 implements Runnable {
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
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS13S1100000_8 aRunnableS13S1100000_8) {
        boolean zLIZ;
        C1C7U.LIZ("VEMediaParserProviderV2@d09d.releaseProvider$2");
        try {
            VEMediaParser vEMediaParser = (VEMediaParser) ((LinkedHashMap) ((VEMediaParserProviderV2) aRunnableS13S1100000_8.l1).LLILLJJLI).get(aRunnableS13S1100000_8.s0);
            if (vEMediaParser != null) {
                VEMediaParserProviderV2 vEMediaParserProviderV2 = (VEMediaParserProviderV2) aRunnableS13S1100000_8.l1;
                vEMediaParserProviderV2.LLILLJJLI.put(aRunnableS13S1100000_8.s0, null);
                vEMediaParser.release();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEMediaParserProviderV2@d09d.releaseProvider$2");
    }

    public static final void run$1(ARunnableS13S1100000_8 aRunnableS13S1100000_8) {
        boolean zLIZ;
        C1C7U.LIZ("MvNetDialog@19.showDialogDelayed$1");
        try {
            C0MPG c0mpg = (C0MPG) aRunnableS13S1100000_8.l1;
            String str = aRunnableS13S1100000_8.s0;
            if (!C20622515mp.LJIILIIL(c0mpg.LLIZLLLIL)) {
                c0mpg.show();
                C785410UrT.LIZIZ(c0mpg);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(c0mpg);
                C816490W1f.LIZ(c0mpg);
            }
            c0mpg.setMessage(str);
            c0mpg.LIZIZ();
            c0mpg.LLJI.start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MvNetDialog@19.showDialogDelayed$1");
    }

    public static final void run$2(ARunnableS13S1100000_8 aRunnableS13S1100000_8) {
        boolean zLIZ;
        C1C7U.LIZ("VEMediaParserFrameProviderImpl@276f.releaseProvider$2");
        try {
            VEMediaParser vEMediaParser = (VEMediaParser) ((LinkedHashMap) ((VEMediaParserFrameProviderImpl) aRunnableS13S1100000_8.l1).LLILLL).get(aRunnableS13S1100000_8.s0);
            if (vEMediaParser != null) {
                VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl = (VEMediaParserFrameProviderImpl) aRunnableS13S1100000_8.l1;
                String str = aRunnableS13S1100000_8.s0;
                vEMediaParser.release();
                vEMediaParserFrameProviderImpl.LLILLL.put(str, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEMediaParserFrameProviderImpl@276f.releaseProvider$2");
    }

    public static final void run$3(ARunnableS13S1100000_8 aRunnableS13S1100000_8) {
        boolean zLIZ;
        C1C7U.LIZ("TextImageForwardResolver@7aa9.publishWithEditModel$1$3$1$1");
        try {
            ((Function1) aRunnableS13S1100000_8.l1).invoke(aRunnableS13S1100000_8.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextImageForwardResolver@7aa9.publishWithEditModel$1$3$1$1");
    }

    public static final void run$4(ARunnableS13S1100000_8 aRunnableS13S1100000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AIPlaygroundBaseScene@969a.showErrorToastIfNeed$1");
        try {
            C1389890mGx c1389890mGx = new C1389890mGx((View) aRunnableS13S1100000_8.l1);
            c1389890mGx.LJIIJ(aRunnableS13S1100000_8.s0);
            c1389890mGx.LIZLLL(8000L);
            c1389890mGx.LIZ.LIZ.LJFF = false;
            c1389890mGx.LJIIJJI();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AIPlaygroundBaseScene@969a.showErrorToastIfNeed$1");
    }

    public ARunnableS13S1100000_8(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
