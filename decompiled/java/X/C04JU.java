package X;

import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS64S0301000_1;

/* JADX INFO: renamed from: X.04JU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JU implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(C04JU c04ju) {
        ((Function0) c04ju.l0).invoke();
        return true;
    }

    public static final boolean onPreDraw$1(C04JU c04ju) {
        ((Function0) c04ju.l0).invoke();
        return true;
    }

    public C04JU(AwS64S0301000_1 awS64S0301000_1, int i) {
        this.$t = i;
        this.l0 = awS64S0301000_1;
    }
}
