package X;

import Y.AfS181S0100000_12;
import android.app.Dialog;
import com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.lego.BetaAppTask;

/* JADX INFO: renamed from: X.0Usj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786190Usj implements InterfaceC586170Myt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        switch (this.$t) {
            case 0:
                onAccountResult$0(this, i, z, i2, user);
                break;
            case 1:
                onAccountResult$1(this, i, z, i2, user);
                break;
        }
    }

    public C786190Usj(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAccountResult$0(C786190Usj c786190Usj, int i, boolean z, int i2, User user) {
        if (z) {
            if (i == 1 || i == 2) {
                BetaAppTask betaAppTask = (BetaAppTask) c786190Usj.l0;
                betaAppTask.getClass();
                if (!BetaAppExperiment.LJIIIIZZ) {
                    C747460TTs c747460TTs = InterfaceC747470TTt.LIZ;
                    AfS181S0100000_12 afS181S0100000_12 = new AfS181S0100000_12(betaAppTask, 210);
                    c747460TTs.getClass();
                    C747460TTs.LIZIZ.LIZ().LJL(C11S5.LIZ()).LJJLL(afS181S0100000_12, C2040507z1.LL);
                }
            }
        }
    }

    public static final void onAccountResult$1(C786190Usj c786190Usj, int i, boolean z, int i2, User user) {
        AccountDeletedActivity accountDeletedActivity = (AccountDeletedActivity) c786190Usj.l0;
        accountDeletedActivity.LLJI = false;
        C0FNV.LIZ((Dialog) accountDeletedActivity.LLIZLLLIL.getValue());
    }
}
