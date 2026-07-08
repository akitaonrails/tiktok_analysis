package X;

import android.animation.ValueAnimator;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eHR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1082670eHR extends ElementSpecImpl implements Observer<C1082760eHa> {
    public final AbstractC1080560eE2 LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    public final ValueAnimator LIZ() {
        return (ValueAnimator) this.LLILLL.getValue();
    }

    public final ConstraintProperty LIZIZ() {
        return (ConstraintProperty) this.LLILLJJLI.getValue();
    }

    public AbstractC1082670eHR(int i, AbstractC1080560eE2 abstractC1080560eE2) {
        super(i);
        this.LL = abstractC1080560eE2;
        this.LLILLJJLI = C292401Bi.LIZ(new AwS561S0100000_17(this, 639));
        this.LLILLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 638));
        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 681));
    }
}
