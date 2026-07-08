package X;

import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.HashtagId;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopSignUpConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10yB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19418910yB {
    public static final C19418910yB LIZ = new C19418910yB();
    public static final VopSignUpConfig LIZIZ = new VopSignUpConfig(0, null, "");
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(391));

    public static boolean LIZ() {
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        boolean z = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAccountType() == 3;
        C01GW c01gw = LIZJ;
        Integer num = ((VopSignUpConfig) c01gw.getValue()).isShowVopEntry;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        String str = ((VopSignUpConfig) c01gw.getValue()).webUrl;
        if (str == null) {
            str = "";
        }
        return str.length() > 0 && zIsLogin && !z;
    }

    public static boolean LIZIZ(String str) {
        List<HashtagId> list;
        if (!LIZ() || str == null || str.length() == 0 || (list = ((VopSignUpConfig) LIZJ.getValue()).hashtagIdGroup) == null || list.isEmpty()) {
            return false;
        }
        Iterator<HashtagId> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().hashtagID, str)) {
                return true;
            }
        }
        return false;
    }
}
