package Y;

import X.C0HZQ;
import X.C1C7U;
import X.C418440Gaw;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS20S0110000_1 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final void run$0(ARunnableS20S0110000_1 aRunnableS20S0110000_1) {
        boolean zLIZ;
        C1C7U.LIZ("FullScreenScene@1492.showSaveBtn$3$1");
        try {
            if (aRunnableS20S0110000_1.z1) {
                ((View) aRunnableS20S0110000_1.l0).animate().translationY(C418440Gaw.LIZIZ(40)).setDuration(250L).start();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FullScreenScene@1492.showSaveBtn$3$1");
    }

    public static final void run$1(ARunnableS20S0110000_1 aRunnableS20S0110000_1) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreTopicFeedFooterCell@ad98.updateFooterText$1$1");
        try {
            if (aRunnableS20S0110000_1.z1) {
                ((TuxTextView) aRunnableS20S0110000_1.l0).setText(2131821454);
                ((TuxTextView) aRunnableS20S0110000_1.l0).setTuxFont(52);
                ((TuxTextView) aRunnableS20S0110000_1.l0).setTextColorRes(R.attr.a1h);
            } else {
                ((TuxTextView) aRunnableS20S0110000_1.l0).setText(2131821455);
                ((TuxTextView) aRunnableS20S0110000_1.l0).setTuxFont(51);
                ((TuxTextView) aRunnableS20S0110000_1.l0).setTextColorRes(R.attr.a1k);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreTopicFeedFooterCell@ad98.updateFooterText$1$1");
    }

    public static final void run$2(ARunnableS20S0110000_1 aRunnableS20S0110000_1) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreFeedFooterCell@a75d.updateFooterText$1$1");
        try {
            if (aRunnableS20S0110000_1.z1) {
                ((TuxTextView) aRunnableS20S0110000_1.l0).setText(2131821454);
                ((TuxTextView) aRunnableS20S0110000_1.l0).setTuxFont(52);
                ((TuxTextView) aRunnableS20S0110000_1.l0).setTextColorRes(R.attr.a1h);
            } else {
                ((TuxTextView) aRunnableS20S0110000_1.l0).setText(2131821455);
                ((TuxTextView) aRunnableS20S0110000_1.l0).setTuxFont(51);
                ((TuxTextView) aRunnableS20S0110000_1.l0).setTextColorRes(R.attr.a1k);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreFeedFooterCell@a75d.updateFooterText$1$1");
    }

    public static final void run$3(ARunnableS20S0110000_1 aRunnableS20S0110000_1) {
        boolean zLIZ;
        C1C7U.LIZ("OclCheckboxUtils@4070.setUpOCLCheckbox$2");
        try {
            ((C0HZQ) aRunnableS20S0110000_1.l0).setChecked(aRunnableS20S0110000_1.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OclCheckboxUtils@4070.setUpOCLCheckbox$2");
    }

    public ARunnableS20S0110000_1(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
