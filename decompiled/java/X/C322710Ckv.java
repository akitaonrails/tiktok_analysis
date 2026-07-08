package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentContentAssem$layoutManager$1;

/* JADX INFO: renamed from: X.0Ckv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322710Ckv {
    public static void LIZIZ(LinearLayoutManager linearLayoutManager, int i, final Context context) {
        final double d = 80.0d;
        final int i2 = 100;
        C21674119s3 c21674119s3 = new C21674119s3(context, d, i2) { // from class: X.0DTI
            public final double LJIILL;
            public final int LJIILLIIL;

            @Override // X.C21674119s3
            public final int LJIILL() {
                return -1;
            }

            @Override // X.C21674119s3
            public final int LJIILIIL(int i3) {
                return this.LJIILLIIL;
            }

            @Override // X.C21674119s3
            public final int LJIIJ(int i3, View view) {
                return super.LJIIJ(i3, view) + C341940Daq.LIZ(this.LJIILL);
            }

            {
                this.LJIILL = d;
                this.LJIILLIIL = i2;
            }
        };
        c21674119s3.LIZ = i;
        linearLayoutManager.startSmoothScroll(c21674119s3);
    }

    public static final boolean LIZ(CommerceAgentContentAssem$layoutManager$1 commerceAgentContentAssem$layoutManager$1, C19EG c19eg, int i, boolean z) {
        if (c19eg != null) {
            if (z) {
                C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C322720Ckw(c19eg, commerceAgentContentAssem$layoutManager$1, i, null), 3);
                return true;
            }
            commerceAgentContentAssem$layoutManager$1.scrollToPosition(i);
            return true;
        }
        return false;
    }
}
