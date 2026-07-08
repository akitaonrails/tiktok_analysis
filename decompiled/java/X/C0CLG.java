package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commercialize.anchor.settings.CardFrequency;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0CLG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CLG {
    public static final C0CLG LIZ = new C0CLG();
    public static final Keva LIZIZ = Keva.getRepo("commerce_anchor_keva");
    public static final String LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final long LJI;

    static {
        User curUser;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        LIZJ = (iAccountUserServiceLJFF == null || (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) == null) ? null : curUser.getUid();
        CardFrequency cardFrequencyLIZ = C305820Bym.LIZ();
        Integer intervalHours = cardFrequencyLIZ.getIntervalHours();
        LIZLLL = intervalHours != null ? intervalHours.intValue() : 120;
        Integer displayTimesPerDay = cardFrequencyLIZ.getDisplayTimesPerDay();
        LJ = displayTimesPerDay != null ? displayTimesPerDay.intValue() : 5;
        LJFF = 3600000;
        LJI = 86400000L;
    }
}
