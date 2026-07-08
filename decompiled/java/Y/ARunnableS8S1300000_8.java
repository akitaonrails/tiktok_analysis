package Y;

import X.C097U;
import X.C0M8O;
import X.C0MH7;
import X.C1322110kVd;
import X.C19EG;
import X.C1C7U;
import X.C564410MBr;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS137S0400000_8;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS8S1300000_8 implements Runnable {
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
        int width = ((C1322110kVd) this.l1).getWidth();
        Bitmap bitmapLIZIZ = C097U.LIZIZ(width, (int) (width / ((((VideoPublishEditModel) this.l2).videoWidth() * 1.0f) / ((VideoPublishEditModel) this.l2).videoHeight())), this.s0);
        C0MH7.LJ(new AwS409S0200000_8(bitmapLIZIZ, (C19EG) this.l3, 126), new AwS137S0400000_8(bitmapLIZIZ, (C19EG) this.l3, (C1322110kVd) this.l1, (VideoPublishEditModel) this.l2, 8));
    }

    public static final void run$0(ARunnableS8S1300000_8 aRunnableS8S1300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AILiveDialogUtils@47a4.showFirstGuide$guideConfig$2$1");
        try {
            ((Function0) aRunnableS8S1300000_8.l1).invoke();
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aRunnableS8S1300000_8.l2;
            ShortVideoContext shortVideoContext = (ShortVideoContext) aRunnableS8S1300000_8.l3;
            String str = aRunnableS8S1300000_8.s0;
            c564410MBr.getClass();
            C564410MBr.LJIILL(videoPublishEditModel, shortVideoContext, "proceed", str, null, null);
            C0M8O.LIZ.getClass();
            C0M8O.LJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AILiveDialogUtils@47a4.showFirstGuide$guideConfig$2$1");
    }

    public static final void run$1(ARunnableS8S1300000_8 aRunnableS8S1300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("CoverExtKt@ad6c.setThumbImageWithUri$1");
        try {
            aRunnableS8S1300000_8.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CoverExtKt@ad6c.setThumbImageWithUri$1");
    }

    public ARunnableS8S1300000_8(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.l2 = obj3;
        this.s0 = str;
        this.l3 = obj;
    }
}
