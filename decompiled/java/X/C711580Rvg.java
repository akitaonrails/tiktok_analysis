package X;

import android.app.Activity;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711580Rvg extends C09AY implements Function1<C711590Rvh, View> {
    public C711580Rvg() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(C711590Rvh c711590Rvh) {
        View viewLIZIZ;
        Activity activityLIZ = C1388190mED.LIZ(c711590Rvh.LIZIZ);
        if (activityLIZ != null) {
            if (!((Boolean) C2184411AeN.LIZIZ.getValue()).booleanValue() || !C2184411AeN.LJIIIZ.compareAndSet(false, true) || (viewLIZIZ = C21146717pB.LIZIZ(activityLIZ, R.layout.dl1, null, false)) == null) {
                return C20673215v0.LIZJ(R.layout.dl1, activityLIZ);
            }
            return viewLIZIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
