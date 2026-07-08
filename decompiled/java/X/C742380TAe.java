package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CPlusSettings;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0TAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742380TAe {
    public static final C742380TAe LIZ = new C742380TAe();

    public static final CPlusSettings LIZIZ() {
        try {
            return (CPlusSettings) SettingsManager.LIZLLL().LJIIIIZZ("creator_plus_settings", CPlusSettings.class, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String LIZ() {
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null) {
            return "ENROLL_DIALOG_SHOW_KEY";
        }
        String uniqueId = curUser.getUniqueId();
        String shortId = (uniqueId == null || uniqueId.length() == 0) ? curUser.getShortId() : curUser.getUniqueId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ENROLL_DIALOG_SHOW_KEY");
        sbLIZ.append('_');
        sbLIZ.append(shortId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
