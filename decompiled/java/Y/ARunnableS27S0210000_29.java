package Y;

import X.C12I7;
import X.C19554511ex;
import X.C19713012Au;
import X.C1C7U;
import X.C786410Ut5;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.discover.model.Banner;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS27S0210000_29 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final void run$0(ARunnableS27S0210000_29 aRunnableS27S0210000_29) {
        boolean zLIZ;
        C1C7U.LIZ("BeautyPresenter@f00c.updateBeautyAndFilter$1");
        try {
            if (aRunnableS27S0210000_29.z2) {
                ((C12I7) aRunnableS27S0210000_29.l1).LIZLLL();
            }
            C786410Ut5.LJLIIL(50L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS98S0200000_29(aRunnableS27S0210000_29, (List) aRunnableS27S0210000_29.l0, 12));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BeautyPresenter@f00c.updateBeautyAndFilter$1");
    }

    public static final void run$1(ARunnableS27S0210000_29 aRunnableS27S0210000_29) {
        boolean zLIZ;
        C1C7U.LIZ("FirstScreenLoadStrategy@4e58.delayRenderTask$1");
        try {
            if (!aRunnableS27S0210000_29.z2) {
                ((C19554511ex) aRunnableS27S0210000_29.l1).LJI.LJJLIIJ((ArrayList) aRunnableS27S0210000_29.l0);
                aRunnableS27S0210000_29.z2 = true;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FirstScreenLoadStrategy@4e58.delayRenderTask$1");
    }

    public static final void run$2(ARunnableS27S0210000_29 aRunnableS27S0210000_29) {
        boolean zLIZ;
        C1C7U.LIZ("AILiveToolbarProgressBar@4d3b.showNewItemPromote$1");
        try {
            if (((C19713012Au) aRunnableS27S0210000_29.l0).getTvTitle().getParent() != null) {
                C19713012Au c19713012Au = (C19713012Au) aRunnableS27S0210000_29.l0;
                if (c19713012Au.LLJI) {
                    c19713012Au.h0(new AwS573S0100000_29((Function0) aRunnableS27S0210000_29.l1, (Function0<? extends Banner>) 1098), true, aRunnableS27S0210000_29.z2);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AILiveToolbarProgressBar@4d3b.showNewItemPromote$1");
    }

    public ARunnableS27S0210000_29(C19554511ex c19554511ex, int i) {
        this.$t = i;
        this.l1 = c19554511ex;
        this.l0 = new ArrayList();
    }

    public ARunnableS27S0210000_29(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.z2 = z;
        this.l0 = obj2;
    }
}
