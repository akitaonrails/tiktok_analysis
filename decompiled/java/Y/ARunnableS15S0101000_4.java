package Y;

import X.C1C7U;
import X.C341940Daq;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.ui.innerskylight.FollowingInnerSkylightAssem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS15S0101000_4 implements Runnable {
    public final int $t;
    public int i1;
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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((ViewOnAttachStateChangeListenerC20604515jv) this.l0).getParent() == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((ViewOnAttachStateChangeListenerC20604515jv) this.l0).getLayoutManager();
        int width = (((ViewOnAttachStateChangeListenerC20604515jv) this.l0).getWidth() - ((ViewOnAttachStateChangeListenerC20604515jv) this.l0).getPaddingLeft()) - ((ViewOnAttachStateChangeListenerC20604515jv) this.l0).getPaddingRight();
        int iLIZ = C341940Daq.LIZ(40.0d);
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(this.i1);
        if (viewFindViewByPosition != null) {
            ((ViewOnAttachStateChangeListenerC20604515jv) this.l0).smoothScrollBy(-(((width - iLIZ) / 2) - viewFindViewByPosition.getLeft()), 0);
        } else {
            linearLayoutManager.scrollToPositionWithOffset(this.i1, iLIZ < width ? (width - iLIZ) / 2 : (-(iLIZ - width)) / 2);
        }
        C786410Ut5.LLF(0, (ViewOnAttachStateChangeListenerC20604515jv) this.l0);
    }

    public static final void run$0(ARunnableS15S0101000_4 aRunnableS15S0101000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FollowingInnerSkylightAssem@81e1.smoothScrollToCenter$1");
        try {
            aRunnableS15S0101000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FollowingInnerSkylightAssem@81e1.smoothScrollToCenter$1");
    }

    public static final void run$1(ARunnableS15S0101000_4 aRunnableS15S0101000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ServicePlusTitleUnderstandingDelegate@4989.runModelWithInput$inferenceRequest$1$callback$1$1$1$1");
        try {
            ((Function1) aRunnableS15S0101000_4.l0).invoke(Integer.valueOf(aRunnableS15S0101000_4.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ServicePlusTitleUnderstandingDelegate@4989.runModelWithInput$inferenceRequest$1$callback$1$1$1$1");
    }

    public static final void run$2(ARunnableS15S0101000_4 aRunnableS15S0101000_4) {
        boolean zLIZ;
        GridLayoutManager gridLayoutManager;
        C1C7U.LIZ("AutoScrollMediaUtilKt@59ec.autoScrollToSelected$1");
        try {
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) aRunnableS15S0101000_4.l0).getLayoutManager();
            if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                gridLayoutManager.scrollToPositionWithOffset(aRunnableS15S0101000_4.i1, 8);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoScrollMediaUtilKt@59ec.autoScrollToSelected$1");
    }

    public static final void run$3(ARunnableS15S0101000_4 aRunnableS15S0101000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ScrollFrequencyOptimizer@6bb7.optimizeScrollFrequency$1");
        try {
            ((Function1) aRunnableS15S0101000_4.l0).invoke(Integer.valueOf(aRunnableS15S0101000_4.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScrollFrequencyOptimizer@6bb7.optimizeScrollFrequency$1");
    }

    public static final void run$4(ARunnableS15S0101000_4 aRunnableS15S0101000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ScrollFrequencyOptimizer@6bb7.optimizeScrollFrequency$2");
        try {
            ((Function1) aRunnableS15S0101000_4.l0).invoke(Integer.valueOf(aRunnableS15S0101000_4.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScrollFrequencyOptimizer@6bb7.optimizeScrollFrequency$2");
    }

    public static final void run$5(ARunnableS15S0101000_4 aRunnableS15S0101000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PgcSubFestBannerBinderAdapter@99e8.adjustTopBannerTitleIfNeeded$1");
        try {
            if (((TextView) aRunnableS15S0101000_4.l0).getLineCount() > 1) {
                ((TextView) aRunnableS15S0101000_4.l0).setTextSize(2, 13.0f);
                ((TextView) aRunnableS15S0101000_4.l0).setMaxLines(1);
                ((TextView) aRunnableS15S0101000_4.l0).setEllipsize(TextUtils.TruncateAt.END);
                ((TextView) aRunnableS15S0101000_4.l0).setTextColor(aRunnableS15S0101000_4.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PgcSubFestBannerBinderAdapter@99e8.adjustTopBannerTitleIfNeeded$1");
    }

    public ARunnableS15S0101000_4(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }

    public ARunnableS15S0101000_4(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, int i, FollowingInnerSkylightAssem followingInnerSkylightAssem, int i2) {
        this.$t = i2;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
        this.i1 = i;
    }
}
