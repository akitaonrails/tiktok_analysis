package Y;

import X.C1259360isQ;
import X.C14AC;
import X.C14B8;
import X.C1602160rnK;
import X.C1720106oR;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C425410GmB;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoPreviewActivity;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS5S0202000_19 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C14AC c14ac = (C14AC) this.l1;
        if (c14ac.LLJIJIL) {
            return;
        }
        c14ac.LJJZ();
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.l0;
        layoutParams.width = this.i2;
        layoutParams.height = this.i3;
        C14B8 c14b8 = ((C14AC) this.l1).LLILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c14b8);
        c14b8.setLayoutParams(layoutParams);
        C14B8 c14b82 = ((C14AC) this.l1).LLILLL;
        int visibility = c14b82.getVisibility();
        c14b82.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c14b82);
    }

    public final void LIZ$1() {
        int width = ((FrameLayout) this.l0).getWidth();
        int height = ((FrameLayout) this.l0).getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        float f = this.i2 / this.i3;
        float f2 = width;
        float f3 = height;
        if (f > f2 / f3) {
            height = (int) (f2 / f);
        } else {
            width = (int) (f3 * f);
        }
        FrameLayout frameLayout = ((ProfileBgVideoPreviewActivity) this.l1).LLILZIL;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
            layoutParams.gravity = 17;
            C786410Ut5.a6(frameLayout, layoutParams);
        }
        SmartImageView smartImageView = ((ProfileBgVideoPreviewActivity) this.l1).LLILZLL;
        if (smartImageView != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(width, height);
            layoutParams2.gravity = 17;
            C786410Ut5.G6(smartImageView, layoutParams2);
        }
        ProfileBgVideoPreviewActivity profileBgVideoPreviewActivity = (ProfileBgVideoPreviewActivity) this.l1;
        C425410GmB c425410GmB = profileBgVideoPreviewActivity.LLIZ;
        if (c425410GmB != null) {
            HandlerHook.viewPost(c425410GmB, new ARunnableS119S0100000_19(profileBgVideoPreviewActivity, 150));
        }
        ((ProfileBgVideoPreviewActivity) this.l1).LLLZLZ();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Preview: adjusted container to ");
        sbLIZ.append(width);
        sbLIZ.append('x');
        sbLIZ.append(height);
        sbLIZ.append(", video=");
        sbLIZ.append(this.i2);
        sbLIZ.append('x');
        sbLIZ.append(this.i3);
        C1720106oR.LJI("ProfileBackground", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void run$0(ARunnableS5S0202000_19 aRunnableS5S0202000_19) {
        boolean zLIZ;
        C1C7U.LIZ("VerifyDialog@71f4.changeDialog$2");
        try {
            aRunnableS5S0202000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VerifyDialog@71f4.changeDialog$2");
    }

    public static final void run$1(ARunnableS5S0202000_19 aRunnableS5S0202000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBgVideoPreviewActivity@7f12.adjustVideoContainerSize$1");
        try {
            aRunnableS5S0202000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBgVideoPreviewActivity@7f12.adjustVideoContainerSize$1");
    }

    public static final void run$2(ARunnableS5S0202000_19 aRunnableS5S0202000_19) {
        C1259360isQ c1259360isQ = (C1259360isQ) aRunnableS5S0202000_19.l0;
        int i = aRunnableS5S0202000_19.i2;
        int i2 = aRunnableS5S0202000_19.i3;
        List<Aweme> list = (List) aRunnableS5S0202000_19.l1;
        c1259360isQ.getClass();
        C1C7U.LIZ("AwemeAdapter@6f5.insertLatestData$1L");
        RecyclerView recyclerView = c1259360isQ.LLILLL;
        if (recyclerView != null && !recyclerView.isComputingLayout()) {
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("insertLatestData. loadLatestInsertCount = ");
            sbLIZ.append(i);
            sbLIZ.append(", headerLoadingShowing = ");
            sbLIZ.append(c1259360isQ.LLJILJILJ);
            sbLIZ.append(", placeHolderRemovedCount = ");
            sbLIZ.append(i2);
            sbLIZ.append(", countBeforeAweme:");
            sbLIZ.append(c1259360isQ.LLLJL());
            C2188811AlT.LIZIZ(sbLIZ);
            if (c1259360isQ.LLJILJILJ) {
                c1259360isQ.LLJILJILJ = false;
                c1259360isQ.notifyItemRemoved(0);
                c1259360isQ.notifyItemRangeInserted(0, c1259360isQ.LLLJL() + i);
                if (i2 != 0) {
                    c1259360isQ.notifyItemChanged(i + c1259360isQ.LLLJL(), Integer.valueOf(i2));
                }
            }
            c1259360isQ.LLLLLLLLL(list);
            C1C7U.LIZIZ("AwemeAdapter@6f5.insertLatestData$1L");
            return;
        }
        C1C7U.LIZIZ("AwemeAdapter@6f5.insertLatestData$1L");
    }

    public ARunnableS5S0202000_19(Object obj, int i, int i2, Object obj2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = obj2;
    }
}
