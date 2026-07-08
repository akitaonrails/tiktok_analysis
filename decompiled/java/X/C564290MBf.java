package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi;
import com.ss.android.ugc.aweme.services.ExitBackgroundActivityImpl;

/* JADX INFO: renamed from: X.0MBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564290MBf implements ExitBackgroundActivityApi {
    public static final C564290MBf LIZIZ = new C564290MBf();
    public final /* synthetic */ ExitBackgroundActivityApi LIZ = ExitBackgroundActivityImpl.createExitBackgroundActivityApibyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi
    public final String activityType(Activity activity) {
        return this.LIZ.activityType(activity);
    }
}
