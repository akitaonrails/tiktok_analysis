package Y;

import X.C1C7U;
import X.C2183341Ace;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2252261DDk;
import X.C426750GoL;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ugc.aweme.feed.adapter.widget.hotcomment.PreviewHotCommentWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.serviceplus.PreviewServicePlusBottomInfoWidget;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS13S0102000_33 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public final void LIZ$0() {
        synchronized (((b0) this.l0).mStateLock) {
            try {
                if (((b0) this.l0).mCurrentCameraState == 3) {
                    b0 b0Var = (b0) this.l0;
                    if (b0Var.mCameraSettings.LLILLJJLI == 1) {
                        b0Var.updateCameraState(2);
                    }
                    if (((b0) this.l0).mCameraInstance != null) {
                        ((b0) this.l0).mCameraInstance.LJJLIIIJL(this.i1, this.i2);
                    }
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can not takePicture on state : ");
                sbLIZ.append(((b0) this.l0).mCurrentCameraState);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                ((b0) this.l0).mCameraObserver.onError(-105, strLIZIZ);
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECameraServer", strLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ$1() {
        if (((b0) this.l0).mCurrentCameraState == 3) {
            if (((b0) this.l0).mCameraInstance != null) {
                ((b0) this.l0).mCameraInstance.LJJII(this.i1, this.i2);
                return;
            }
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set picture size failed, w: ");
        sbLIZ.append(this.i1);
        sbLIZ.append(", h: ");
        sbLIZ.append(this.i2);
        sbLIZ.append(", state: ");
        sbLIZ.append(((b0) this.l0).mCurrentCameraState);
        C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ$2() {
        ((TextView) ((PreviewHotCommentWidget) this.l0).LLJJJJJIL.getValue()).setText(((TextView) ((PreviewHotCommentWidget) this.l0).LLJJJJ.getValue()).getText());
        ((View) ((PreviewHotCommentWidget) this.l0).LLJJJIL.getValue()).scrollTo(0, 0);
        if (C426750GoL.LJ(((PreviewHotCommentWidget) this.l0).Q1())) {
            C2252261DDk c2252261DDkQ1 = ((PreviewHotCommentWidget) this.l0).Q1();
            int i = this.i1;
            c2252261DDkQ1.scrollTo((i + i) - this.i2, 0);
        }
    }

    public final void LIZ$3() {
        ((TextView) ((PreviewServicePlusBottomInfoWidget) this.l0).LLJJJIL.getValue()).setText(((TextView) ((PreviewServicePlusBottomInfoWidget) this.l0).LLJJJ.getValue()).getText());
        ((View) ((PreviewServicePlusBottomInfoWidget) this.l0).LLJJIJIL.getValue()).scrollTo(0, 0);
        if (C426750GoL.LJ(((PreviewServicePlusBottomInfoWidget) this.l0).M1())) {
            C2252261DDk c2252261DDkM1 = ((PreviewServicePlusBottomInfoWidget) this.l0).M1();
            int i = this.i1;
            c2252261DDkM1.scrollTo((i + i) - this.i2, 0);
        }
    }

    public static final void run$0(ARunnableS13S0102000_33 aRunnableS13S0102000_33) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.takePicture$1");
        try {
            aRunnableS13S0102000_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.takePicture$1");
    }

    public static final void run$1(ARunnableS13S0102000_33 aRunnableS13S0102000_33) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.setPictureSize$1");
        try {
            aRunnableS13S0102000_33.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.setPictureSize$1");
    }

    public static final void run$2(ARunnableS13S0102000_33 aRunnableS13S0102000_33) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewHotCommentWidget@4fa4.startMarquee$1$1");
        try {
            aRunnableS13S0102000_33.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewHotCommentWidget@4fa4.startMarquee$1$1");
    }

    public static final void run$3(ARunnableS13S0102000_33 aRunnableS13S0102000_33) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewServicePlusBottomInfoWidget@35a6.startMarquee$1$1");
        try {
            aRunnableS13S0102000_33.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewServicePlusBottomInfoWidget@35a6.startMarquee$1$1");
    }

    public ARunnableS13S0102000_33(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
