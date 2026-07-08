package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.banner.TaskProgressBinder;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.binder.DivideBinder;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.binder.NormalTextBinder;

/* JADX INFO: renamed from: X.0g4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151730g4p implements ViewModelStoreOwner {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        switch (this.$t) {
            case 0:
                return getViewModelStore$0(this);
            case 1:
                return getViewModelStore$1(this);
            case 2:
                return getViewModelStore$2(this);
            default:
                return null;
        }
    }

    public static final ViewModelStore getViewModelStore$0(C1151730g4p c1151730g4p) {
        return (ViewModelStore) ((TaskProgressBinder) c1151730g4p.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$1(C1151730g4p c1151730g4p) {
        return (ViewModelStore) ((DivideBinder) c1151730g4p.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$2(C1151730g4p c1151730g4p) {
        return (ViewModelStore) ((NormalTextBinder) c1151730g4p.l0).LL.getValue();
    }

    public C1151730g4p(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
