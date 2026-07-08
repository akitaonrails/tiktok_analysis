package X;

import Y.AfS148S0200000_12;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.share.ShareApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0UkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781020UkO {
    public final List<User> LIZ = new ArrayList();
    public final List<User> LIZIZ = new ArrayList();
    public boolean LIZJ;

    public final void LIZ(long j, Fragment fragment, C786170Ush c786170Ush) {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((ShareApi) C480460Ism.LIZLLL(ShareApi.class)).getBatchShareUsers(j).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(fragment))).LIZ(new AfS148S0200000_12(this, c786170Ush, 28), new AfS148S0200000_12(this, c786170Ush, 29));
    }
}
