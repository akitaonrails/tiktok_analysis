package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;

/* JADX INFO: renamed from: X.0CXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C315190CXd implements InterfaceC908930ZlD {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC908930ZlD
    public final void LIZIZ() {
        LifecycleCoroutineScope lifecycleScope;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C0DJE(this, null), 2);
    }

    public C315190CXd(Context context, String str, String str2) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
