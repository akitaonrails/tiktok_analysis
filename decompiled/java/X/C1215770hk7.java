package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215770hk7 {
    public static final C1215770hk7 LIZ = new C1215770hk7();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(585));

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static boolean LIZIZ(String str) {
        String uniqueId;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (TextUtils.isEmpty(curUser.getUniqueId())) {
            uniqueId = curUser.getShortId();
        } else {
            uniqueId = curUser.getUniqueId();
        }
        return !Intrinsics.LJFF(str, uniqueId);
    }
}
