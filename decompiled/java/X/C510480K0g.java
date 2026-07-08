package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C510480K0g implements InterfaceC339570DSx {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final PGCGetSubPrivilegeDetailResponse.Data LIZLLL;
    public SubscriptionPrivilegeDetailFragment LJ;

    public void LIZ() {
    }

    public String LIZIZ() {
        return this.LIZJ;
    }

    public int LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC339570DSx
    public String LJJJ() {
        return this.LIZ;
    }

    public C510480K0g(String str, int i, String str2, PGCGetSubPrivilegeDetailResponse.Data data, SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = data;
        this.LJ = subscriptionPrivilegeDetailFragment;
    }
}
