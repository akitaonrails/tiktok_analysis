package Y;

import X.C2273631Dyz;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.otis.resource.psi.ResourcePsiMonitor;

/* JADX INFO: loaded from: classes36.dex */
public class ARunnableS29S0210000_35 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    public static final void run$0(ARunnableS29S0210000_35 aRunnableS29S0210000_35) {
        ((WidgetManager) aRunnableS29S0210000_35.l0).lambda$loadInternal$12((Widget) aRunnableS29S0210000_35.l1, aRunnableS29S0210000_35.z2);
    }

    public static final void run$1(ARunnableS29S0210000_35 aRunnableS29S0210000_35) {
        ((ResourcePsiMonitor) aRunnableS29S0210000_35.l0).lambda$init$0((C2273631Dyz) aRunnableS29S0210000_35.l1, aRunnableS29S0210000_35.z2);
    }

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

    public ARunnableS29S0210000_35(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
