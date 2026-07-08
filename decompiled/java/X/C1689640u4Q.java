package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0u4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689640u4Q {
    public static final C01GW<C1689640u4Q> LIZJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(583));
    public final Keva LIZ;
    public final Keva LIZIZ;

    public C1689640u4Q() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ble_connect_now_");
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        sbLIZ.append(iAccountUserServiceLJFF != null ? iAccountUserServiceLJFF.getCurUserId() : null);
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = Keva.getRepo("ble_connect_now_did_keva");
    }
}
