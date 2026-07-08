package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01nI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C439001nI {
    public static final C439001nI LIZ = new C439001nI();
    public static final Keva LIZIZ = Keva.getRepo("story_archive_v2");

    public static String LIZ() {
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) {
            return null;
        }
        return currentUser.getUid();
    }

    public static boolean LIZLLL() {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ALBUM_ON_THIS_DAY_QUERY_DATE_");
        sbLIZ.append(LIZ());
        if (keva.getString(C2188811AlT.LIZIZ(sbLIZ), "").length() == 0) {
            return true;
        }
        return !Intrinsics.LJFF(r3, new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())));
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ALBUM_ENTRANCE_SHOW_");
        sbLIZ.append(LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ALBUM_TOOLTIP_SHOW_");
        sbLIZ.append(LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
