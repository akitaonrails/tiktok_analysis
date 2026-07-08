package X;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Uss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786280Uss implements InterfaceC19483011Ki {
    public final int $t;
    public Object l0;

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
            case 7:
                return test$7(this, obj);
            default:
                return false;
        }
    }

    public C786280Uss(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean test$0(C786280Uss c786280Uss, Object obj) {
        if (((SwipeUpGuideStrengthenLayout) c786280Uss.l0).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean test$1(C786280Uss c786280Uss, Object obj) {
        if (((Number) ((Pair) obj).getFirst()).longValue() == ((C752910Tg9) c786280Uss.l0).LLILZIL.getId()) {
            return true;
        }
        return false;
    }

    public static final boolean test$2(C786280Uss c786280Uss, Object obj) {
        if (((SwipeUpGuideStrengthenLayout) c786280Uss.l0).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean test$3(C786280Uss c786280Uss, Object obj) {
        if (((SwipeUpGuideStrengthenLayout) c786280Uss.l0).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean test$4(C786280Uss c786280Uss, Object obj) {
        if (((SwipeUpGuideStrengthenLayout) c786280Uss.l0).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean test$5(C786280Uss c786280Uss, Object obj) {
        IHostAction iHostAction = ((C0TBQ) c786280Uss.l0).LJ;
        if (iHostAction != null && iHostAction.getBgBroadcastServiceCreate()) {
            return true;
        }
        return false;
    }

    public static final boolean test$6(C786280Uss c786280Uss, Object obj) {
        IHostAction iHostAction = ((C0TBQ) c786280Uss.l0).LJ;
        if (iHostAction != null && iHostAction.getBgBroadcastServiceCreate()) {
            return true;
        }
        return false;
    }

    public static final boolean test$7(C786280Uss c786280Uss, Object obj) {
        ((C0UZT) c786280Uss.l0).getClass();
        return true;
    }
}
