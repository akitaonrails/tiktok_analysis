package Y;

import X.C08Q0;
import X.C0L7R;
import X.C1C7U;
import X.C2105908Mv;
import android.content.Context;
import com.bytedance.common.jato.memory.LessMadviseOpt;
import com.bytedance.crash.Npth;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS22S0110000_3 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS22S0110000_3 aRunnableS22S0110000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.delayShowDialog$1");
        try {
            ((C0L7R) aRunnableS22S0110000_3.l0).LJJJJIZL(0, aRunnableS22S0110000_3.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.delayShowDialog$1");
    }

    public static final void run$1(ARunnableS22S0110000_3 aRunnableS22S0110000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FeedInsertHelper@32b1.notifyComplete$1");
        try {
            ((Function1) aRunnableS22S0110000_3.l0).invoke(Boolean.valueOf(aRunnableS22S0110000_3.z1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedInsertHelper@32b1.notifyComplete$1");
    }

    public static final void run$2(ARunnableS22S0110000_3 aRunnableS22S0110000_3) {
        String[] strArrSplit;
        boolean z = aRunnableS22S0110000_3.z1;
        Context context = (Context) aRunnableS22S0110000_3.l0;
        C1C7U.LIZ("ColdBootHelper@3c45.setMadviseEnabled$1L");
        if (z) {
            int iLIZIZ = C08Q0.LIZIZ(context, 0, "less_madvise_opt_config_mode");
            String strLIZLLL = C08Q0.LIZLLL(context, "less_madvise_opt_files", "");
            if (strLIZLLL != null) {
                strArrSplit = strLIZLLL.split(":");
            } else {
                strArrSplit = new String[0];
            }
            for (String str : strArrSplit) {
                if (!C2105908Mv.LIZ(str)) {
                    LessMadviseOpt.LIZ(str);
                }
            }
            if (iLIZIZ != 0) {
                LessMadviseOpt.LIZIZ(true);
            }
            Npth.addTag("jato_madvise_opt", String.valueOf(iLIZIZ));
        } else {
            LessMadviseOpt.LIZIZ(false);
        }
        C1C7U.LIZIZ("ColdBootHelper@3c45.setMadviseEnabled$1L");
    }

    public ARunnableS22S0110000_3(Context context, int i) {
        this.$t = i;
        this.z1 = true;
        this.l0 = context;
    }

    public ARunnableS22S0110000_3(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
