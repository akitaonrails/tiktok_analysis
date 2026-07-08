package Y;

import X.C03I6;
import X.C03I7;
import X.C03O0;
import X.C1C7U;
import X.C2188811AlT;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS1S2100000_1 implements Runnable {
    public final int $t;
    public Object l2;
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
        TextPaint paint = ((TuxTextView) this.l2).getPaint();
        float width = (((TuxTextView) this.l2).getWidth() - ((TuxTextView) this.l2).getPaddingLeft()) - ((TuxTextView) this.l2).getPaddingRight();
        if (width <= 0.0f || paint.measureText(this.s0) <= width) {
            ((TuxTextView) this.l2).setEllipsize(null);
            return;
        }
        int iLJJJ = a0.LJJJ(this.s0, this.s1, 0, false, 6);
        if (iLJJJ == -1) {
            ((TuxTextView) this.l2).setEllipsize(TextUtils.TruncateAt.MIDDLE);
            ((TuxTextView) this.l2).setText(this.s0);
            return;
        }
        int length = this.s1.length() + iLJJJ;
        String strSubstring = this.s0.substring(0, iLJJJ);
        String strSubstring2 = this.s0.substring(length);
        float fMeasureText = ((width - paint.measureText(strSubstring)) - paint.measureText(strSubstring2)) - paint.measureText("...");
        if (fMeasureText <= 0.0f) {
            ((TuxTextView) this.l2).setEllipsize(TextUtils.TruncateAt.MIDDLE);
            ((TuxTextView) this.l2).setText(this.s0);
            return;
        }
        String strSubstring3 = this.s1.substring(0, paint.breakText(this.s1, true, fMeasureText, null));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strSubstring);
        sbLIZ.append(strSubstring3);
        sbLIZ.append("...");
        sbLIZ.append(strSubstring2);
        ((TuxTextView) this.l2).setText(C2188811AlT.LIZIZ(sbLIZ));
        ((TuxTextView) this.l2).setEllipsize(null);
    }

    public static final void run$0(ARunnableS1S2100000_1 aRunnableS1S2100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("EcLiveFcpButtonUtils@aff6.onEcGoLiveFcpComponentClick$1");
        try {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Fragment) aRunnableS1S2100000_1.l2, aRunnableS1S2100000_1.s0);
            smartRouteBuildRoute.withParam("source_btm_token", aRunnableS1S2100000_1.s1);
            smartRouteBuildRoute.open();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcLiveFcpButtonUtils@aff6.onEcGoLiveFcpComponentClick$1");
    }

    public static final void run$1(ARunnableS1S2100000_1 aRunnableS1S2100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("SeaIdentityChecker@5a30.check$2");
        try {
            C03O0 c03o0 = C03O0.LIZ;
            String str = aRunnableS1S2100000_1.s0;
            C03I6 c03i6 = (C03I6) aRunnableS1S2100000_1.l2;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = c03i6.LIZ;
            String str2 = aRunnableS1S2100000_1.s1;
            OspBottomViewModel ospBottomViewModel = c03i6.LIZLLL;
            c03o0.getClass();
            C03O0.LLFZ(str, orderSubmitAssemViewModel, str2, ospBottomViewModel, null, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaIdentityChecker@5a30.check$2");
    }

    public static final void run$2(ARunnableS1S2100000_1 aRunnableS1S2100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("SeaOneStepClickActionChecker@820.check$2");
        try {
            C03O0 c03o0 = C03O0.LIZ;
            String str = aRunnableS1S2100000_1.s0;
            C03I7 c03i7 = (C03I7) aRunnableS1S2100000_1.l2;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = c03i7.LIZ;
            String str2 = aRunnableS1S2100000_1.s1;
            OspBottomViewModel ospBottomViewModel = c03i7.LIZLLL;
            c03o0.getClass();
            C03O0.LLFZ(str, orderSubmitAssemViewModel, str2, ospBottomViewModel, null, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaOneStepClickActionChecker@820.check$2");
    }

    public static final void run$3(ARunnableS1S2100000_1 aRunnableS1S2100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinBoardGuideViewHolder@d365.ellipsizeNicknameInTitle$1");
        try {
            aRunnableS1S2100000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinBoardGuideViewHolder@d365.ellipsizeNicknameInTitle$1");
    }

    public ARunnableS1S2100000_1(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
