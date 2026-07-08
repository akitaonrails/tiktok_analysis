package X;

import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0IyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractActivityC483870IyH extends BaseActivity implements InterfaceC497601wk {
    public C1DFK LL;

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        C1DFB c1dfb = C0PEM.LIZJ;
        C1DFK c1dfk = this.LL;
        if (c1dfk == null) {
            c1dfk = null;
        }
        return c1dfb.plus(c1dfk);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C1DFK c1dfk = this.LL;
        if (c1dfk == null) {
            c1dfk = null;
        }
        c1dfk.LIZIZ(null);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        activityConfiguration(AFwS237S0000000_7.get$arr$(352));
        super.onCreate(bundle);
        this.LL = C23118094a.LIZ();
    }
}
