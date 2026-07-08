package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.experiment.RegexpString;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0iL6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238700iL6 {
    public static final C1238700iL6 LIZ = new C1238700iL6();
    public static final C19633311rf LIZIZ;

    static {
        C844470XAv.LIZ.getClass();
        LIZIZ = new C19633311rf(C844470XAv.LIZ(), "change_username");
    }

    public static final boolean LIZIZ() {
        return LIZ(C10EU.LIZJ(C0XQ7.LJFF().getCurUser()));
    }

    public static final boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Regex regex = new Regex("^(?![0-9]+$)[a-z0-9_.]{1,23}[a-z0-9_]$");
        try {
            SettingsManager.LIZLLL().getClass();
            String str2 = ((RegexpString) SettingsManager.LJII("handle_settings", RegexpString.class)).regexp;
            if (str2 != null) {
                regex = new Regex(str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            regex = new Regex("^(?![0-9]+$)[a-z0-9_.]{1,23}[a-z0-9_]$");
        }
        return regex.matches(str);
    }
}
