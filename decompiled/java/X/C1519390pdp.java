package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.ban.IUserBanDepService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS61S0500000_28;

/* JADX INFO: renamed from: X.0pdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519390pdp {
    public static final /* synthetic */ C1519390pdp LIZ = new C1519390pdp();

    public static IUserBanDepService LIZ() {
        IUserBanDepService iUserBanDepService = (IUserBanDepService) PluggableExtentionKt.pluggableSpi$default(IUserBanDepService.class, false, false, false, 14, null);
        return iUserBanDepService == null ? new IUserBanDepService() { // from class: X.0pdo
            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final boolean LIZ() {
                return false;
            }

            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final void LIZIZ(AtomicBoolean atomicBoolean) {
            }

            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final AtomicBoolean LIZJ() {
                return null;
            }

            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final void LIZLLL(AwS61S0500000_28 awS61S0500000_28, C1917460zzs c1917460zzs) {
            }

            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final C1914170zuZ LJ() {
                return null;
            }

            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final boolean LJFF() {
                return false;
            }

            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final int LJI() {
                return 1;
            }

            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final int getAppId() {
                return -1;
            }

            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final String getUserId() {
                return "";
            }

            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final void logout() {
            }

            @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
            public final Gson getGson() {
                return new e().LIZ();
            }
        } : iUserBanDepService;
    }
}
