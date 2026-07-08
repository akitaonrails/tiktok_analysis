package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.app.launch.MobLaunchImpl;
import com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi;

/* JADX INFO: renamed from: X.10Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19264010Yc implements IMobLaunchApi {
    public static final C19264010Yc LIZIZ = new C19264010Yc();
    public final /* synthetic */ IMobLaunchApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void LIZ(boolean z) {
        this.LIZ.LIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void LIZIZ(Uri uri, String str, boolean z) {
        this.LIZ.LIZIZ(uri, str, z);
    }

    public C19264010Yc() {
        Object objLIZ = C04TD.LIZ(IMobLaunchApi.class, false);
        this.LIZ = objLIZ != null ? (IMobLaunchApi) objLIZ : new MobLaunchImpl();
    }
}
