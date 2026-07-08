package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897600ZJe extends C09AY implements Function1<User, Unit> {
    public C897600ZJe() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(User user) {
        boolean z;
        User user2 = user;
        if (user2.getUid() != null) {
            LruCache<String, Integer> lruCache = C1918307fJ.LIZ;
            boolean zLIZLLL = C1918307fJ.LIZLLL(user2.getActivityStatusSetting(), user2.getUid(), true);
            String uid = user2.getUid();
            if (!user2.isBlock && !user2.isBlocked()) {
                z = false;
            } else {
                z = true;
            }
            boolean zLIZJ = C1918307fJ.LIZJ(uid, z, true);
            if (zLIZLLL || zLIZJ) {
                ((ActivityStatusService) C0ZJX.LIZIZ.getValue()).LJII(user2.getUid());
            }
        }
        return Unit.LIZ;
    }
}
