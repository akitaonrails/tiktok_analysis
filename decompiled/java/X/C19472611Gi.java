package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.11Gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19472611Gi extends AbstractC19472511Gh implements C11DA {
    public final Function0<Unit> LIZIZ;
    public final C01GW LIZJ;

    @Override // X.C11DA
    public final View getView() {
        return (View) this.LIZJ.getValue();
    }

    @Override // X.C11DA
    public final void LIZIZ(int i) {
        switch (i) {
            case 241:
                LIZLLL(R.id.z3m);
                break;
            case 242:
                LIZLLL(R.id.s8j);
                break;
            case 243:
                LIZLLL(R.id.z4v);
                break;
            case 244:
                LIZLLL(R.id.z4l);
                break;
        }
    }

    public C19472611Gi(ViewGroup viewGroup, Function0<Unit> function0) {
        this.LIZIZ = function0;
        this.LIZJ = C452501pT.LIZIZ(new AwS430S0200000_29(viewGroup, this, 106));
    }
}
