package X;

import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.landscapefeeds.LiveLandNoMoreFragment;
import com.bytedance.android.livesdk.performance.memory.WatchMemoryOptimizeSetting;
import com.bytedance.android.livesdk.profile.cell.HeaderCell;
import com.bytedance.android.livesdk.variant.ui.VariantCardFragment;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521960KdW implements InterfaceC19483011Ki {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ boolean test$5(C521960KdW c521960KdW, Object obj) {
        return ((Boolean) ((Function1) c521960KdW.l0).invoke(obj)).booleanValue();
    }

    @Override // X.InterfaceC19483011Ki
    public final boolean test(Object obj) {
        switch (this.$t) {
            case 0:
                return test$0(this, obj);
            case 1:
                return test$1(this, obj);
            case 2:
                return test$2(this, obj);
            case 3:
                return test$3(this, obj);
            case 4:
                return test$4(this, obj);
            case 5:
                return test$5(this, obj);
            case 6:
                return test$6(this, obj);
            default:
                return false;
        }
    }

    public C521960KdW(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean test$0(C521960KdW c521960KdW, Object obj) {
        long j = ((C497640JfO) obj).LIZ;
        Long l = (Long) c521960KdW.l0;
        if (l != null && j == l.longValue()) {
            return true;
        }
        return false;
    }

    public static final boolean test$1(C521960KdW c521960KdW, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) c521960KdW.l0;
        String str = LivePlayFragment._pnsPageId;
        return livePlayFragment.getUserVisibleHint();
    }

    public static final boolean test$2(C521960KdW c521960KdW, Object obj) {
        return ((VariantCardFragment) c521960KdW.l0).getUserVisibleHint();
    }

    public static final boolean test$3(C521960KdW c521960KdW, Object obj) {
        return ((LiveLandNoMoreFragment) c521960KdW.l0).getUserVisibleHint();
    }

    public static final boolean test$4(C521960KdW c521960KdW, Object obj) {
        if (((Number) ((Pair) obj).getFirst()).longValue() == ((HeaderCell) c521960KdW.l0).LL.LJII) {
            return true;
        }
        return false;
    }

    public static final boolean test$6(C521960KdW c521960KdW, Object obj) {
        ((C0ISA) c521960KdW.l0).getClass();
        if (!WatchMemoryOptimizeSetting.needToYield()) {
            return true;
        }
        return true ^ C0ISA.LIZIZ;
    }
}
