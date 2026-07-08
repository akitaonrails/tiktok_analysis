package Y;

import X.C09JN;
import android.util.Pair;
import com.bytedance.android.widget.WidgetManager;

/* JADX INFO: loaded from: classes36.dex */
public class AfS204S0100000_35 implements C09JN {
    public final int $t;
    public Object l0;

    public static final void accept$0(AfS204S0100000_35 afS204S0100000_35, Object obj) {
        ((WidgetManager) afS204S0100000_35.l0).lambda$startBatchLoadView$4((Pair) obj);
    }

    public static final void accept$1(AfS204S0100000_35 afS204S0100000_35, Object obj) {
        ((WidgetManager) afS204S0100000_35.l0).lambda$startBatchLoadView$5((Throwable) obj);
    }

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public AfS204S0100000_35(WidgetManager widgetManager, int i) {
        this.$t = i;
        this.l0 = widgetManager;
    }
}
