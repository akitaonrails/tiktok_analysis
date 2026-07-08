package X;

import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.HashtagId;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopCloneConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10yD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19419110yD {
    public static final C19419110yD LIZ = new C19419110yD();
    public static final VopCloneConfig LIZIZ = new VopCloneConfig(0, null, "aweme://webview?url=https%3A%2F%2Fsami.tiktokv.com%2Fvop_h5%2Findex.html%3Fuse_spark%3D1%26sign_up_origin%3Dinbox%26is_first_enter%3D0", 0, "http://sami-va.tiktokv.com/internal", "http://sami-sg.tiktokv.com/internal", 50000, "audio_metrics", 30000, Float.valueOf(0.2f), Float.valueOf(20.0f), 3, Float.valueOf(0.3f), 24000, "", 50, 44100, 1, 512);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(390));

    public static boolean LIZ() {
        boolean z = C19422210yi.LIZIZ() || C19422210yi.LIZJ() || C19422210yi.LIZ();
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        boolean z2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAccountType() == 3;
        C01GW c01gw = LIZJ;
        Integer num = ((VopCloneConfig) c01gw.getValue()).isShowVopEntry;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        String str = ((VopCloneConfig) c01gw.getValue()).webUrl;
        if (str == null) {
            str = "";
        }
        return str.length() > 0 && zIsLogin && !z2 && !z;
    }

    public static boolean LIZIZ(String str) {
        List<HashtagId> list;
        if (!LIZ() || str == null || str.length() == 0 || (list = ((VopCloneConfig) LIZJ.getValue()).hashtagIdGroup) == null || list.isEmpty()) {
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
