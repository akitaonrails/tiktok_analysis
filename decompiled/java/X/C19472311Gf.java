package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.11Gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19472311Gf extends AbstractC19472511Gh implements C11D9 {
    public final Function0<Unit> LIZIZ;
    public final C01GW LIZJ;

    @Override // X.C11D9
    public final View getView() {
        return (View) this.LIZJ.getValue();
    }

    @Override // X.C11D9
    public final void LIZ(int i) {
        switch (i) {
            case 241:
                int size = this.LIZ.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C786410Ut5.LJLLLLLL(8, this.LIZ.valueAt(i2));
                }
                break;
            case 242:
                LIZLLL(R.id.z3o);
                break;
            case 243:
                LIZLLL(R.id.z3p);
                break;
        }
    }

    public C19472311Gf(ViewGroup viewGroup, Function0<Unit> function0) {
        this.LIZIZ = function0;
        this.LIZJ = C452501pT.LIZIZ(new AwS430S0200000_29(viewGroup, this, 107));
    }
}
