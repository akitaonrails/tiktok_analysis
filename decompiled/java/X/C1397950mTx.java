package X;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397950mTx extends AbstractC1387200mCc {
    public final Activity LIZLLL;
    public final C19EG LJ;
    public final C01GW LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1397950mTx) && Intrinsics.LJFF(this.LIZLLL, ((C1397950mTx) obj).LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    @Override // X.AbstractC1387200mCc
    public final void LIZ() {
        this.LIZLLL.finish();
    }

    @Override // X.AbstractC1387200mCc
    public final FragmentManager LJ() {
        C19EG c19eg = this.LJ;
        if (c19eg != null) {
            return c19eg.getSupportFragmentManager();
        }
        return null;
    }

    @Override // X.AbstractC1387200mCc
    public final View LJI() {
        return this.LIZLLL.findViewById(R.id.content);
    }

    @Override // X.AbstractC1387200mCc
    public final ViewModelProvider LJIIIZ() {
        return (ViewModelProvider) this.LJFF.getValue();
    }

    @Override // X.AbstractC1387200mCc
    public final String toString() {
        return super.toString();
    }

    @Override // X.AbstractC1387200mCc
    public final Activity LIZIZ() {
        return this.LIZLLL;
    }

    public C1397950mTx(Activity activity) {
        C19EG c19eg;
        super(activity);
        this.LIZLLL = activity;
        if (activity instanceof C19EG) {
            c19eg = (C19EG) activity;
        } else {
            c19eg = null;
        }
        this.LJ = c19eg;
        this.LJFF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1691));
    }

    @Override // X.AbstractC1387200mCc
    public final void LJIIJJI(Intent intent) throws Throwable {
        C2204961BRm.LJIIL(-1, this.LIZLLL, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyaZuUa/F3eRxQvzbV2VGWKMV+asO8tMEo", null));
    }
}
