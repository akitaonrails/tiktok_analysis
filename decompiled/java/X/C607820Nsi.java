package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nsi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C607820Nsi implements Observer, InterfaceC1635506an {
    public final /* synthetic */ C607830Nsj LL;

    public C607820Nsi(C607830Nsj c607830Nsj) {
        this.LL = c607830Nsj;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, C607830Nsj.class, "onFollowStatusChanged", "onFollowStatusChanged(Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        this.LL.getClass();
        String userId = followStatus.getUserId();
        if (userId != null && followStatus.getFollowStatus() == 1) {
            C23250099c.LIZLLL((InterfaceC497601wk) C607830Nsj.LIZIZ.getValue(), null, null, new C607810Nsh(userId, C059B.FOLLOW_STATUS_CHANGE, null), 3);
        }
    }
}
