package X;

import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eEW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1080860eEW extends ElementSpecImpl {
    public final AbstractC1080560eE2 LL;
    public final C01GW LLILLJJLI;

    public final ValueAnimator LIZ() {
        return (ValueAnimator) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        super.onDispose();
        if (LIZ().isRunning()) {
            LIZ().cancel();
        }
    }

    public C1080860eEW(AbstractC1080560eE2 abstractC1080560eE2) {
        super(R.id.kw9);
        this.LL = abstractC1080560eE2;
        this.LLILLJJLI = C292401Bi.LIZ(new AwS561S0100000_17(this, 636));
    }
}
