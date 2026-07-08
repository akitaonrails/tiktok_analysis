package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* JADX INFO: renamed from: X.19ZO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19ZO extends AbstractC787190UuL {
    public final PowerManager LIZJ;
    public final /* synthetic */ AppCompatDelegateImpl LIZLLL;

    @Override // X.AbstractC787190UuL
    public final IntentFilter LIZIZ() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // X.AbstractC787190UuL
    public final int LIZJ() {
        return C19ZP.LIZ(this.LIZJ) ? 2 : 1;
    }

    @Override // X.AbstractC787190UuL
    public final void LIZLLL() {
        this.LIZLLL.LIZLLL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19ZO(AppCompatDelegateImpl appCompatDelegateImpl, Context context) {
        super(appCompatDelegateImpl);
        this.LIZLLL = appCompatDelegateImpl;
        this.LIZJ = (PowerManager) C786410Ut5.H2(C786410Ut5.N3(context), "power");
    }
}
