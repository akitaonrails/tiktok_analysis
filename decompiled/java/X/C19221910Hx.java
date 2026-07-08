package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.10Hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19221910Hx implements InterfaceC376620Epg {
    public static final IMainService LIZ = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);

    public static final int LIZ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIJ;
    }

    public static final String LIZIZ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZJ();
    }

    public static final Class<? extends C19EG> LIZJ() {
        return LIZ.getMainActivityClass();
    }

    public static final boolean LJFF() {
        C1528020prk.LIZ().getClass();
        return false;
    }

    public static final boolean LJI() {
        for (Activity activity : ActivityStack.getActivityStack()) {
            if ((activity instanceof C19EG) && LIZ.isMainActivity((C19EG) activity)) {
                return true;
            }
        }
        return false;
    }

    public final void LJII(C19EG c19eg) {
        Fragment fragmentBQ2;
        ((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).setUploadingStatus(true);
        if (C1585030rLh.LJIILL() && C1058550deX.LIZJ(c19eg, "USER")) {
            fragmentBQ2 = Hox.AQ2(c19eg).Ki("USER");
        } else {
            fragmentBQ2 = C343710Ddh.LIZ(c19eg).BQ2();
        }
        if (fragmentBQ2 != null) {
            C1075590e61.LIZ(fragmentBQ2).setState(AFwS283S0000000_35.get$arr$(197));
            return;
        }
        C19EG c19egLIZLLL = LIZLLL(c19eg, false);
        if (c19egLIZLLL == null) {
            return;
        }
        Fragment fragmentKi = Hox.AQ2(c19egLIZLLL).Ki("USER");
        if (!(fragmentKi instanceof I18nMyProfileFragment)) {
            return;
        }
        ((I18nMyProfileFragment) fragmentKi).sS();
    }

    public static final C19EG LIZLLL(C19EG c19eg, boolean z) {
        if (c19eg.getClass() == LIZ.getMainActivityClass()) {
            return c19eg;
        }
        for (Activity activity : ActivityStack.getActivityStack()) {
            if (activity.getClass() == LIZ.getMainActivityClass()) {
                return (C19EG) activity;
            }
        }
        if (z) {
            return c19eg;
        }
        return null;
    }

    public static final void LJ(C19EG c19eg, Pair<String, Music> pair) {
        Fragment fragmentBQ2;
        Hox.AQ2(c19eg).TQ2(new Bundle(), "USER", false);
        if (C1585030rLh.LJIILL() && C1058550deX.LIZJ(c19eg, "USER")) {
            fragmentBQ2 = Hox.AQ2(c19eg).Ki("USER");
        } else {
            fragmentBQ2 = C343710Ddh.LIZ(c19eg).BQ2();
        }
        if (fragmentBQ2 != null) {
            ProfileViewModel profileViewModelLIZ = C1075590e61.LIZ(fragmentBQ2);
            if (pair != null) {
                profileViewModelLIZ.setState(new AwS614S0100000_35(pair, (Pair<Integer, Integer>) 215));
            } else {
                profileViewModelLIZ.setState(AFwS283S0000000_35.get$arr$(197));
            }
        }
    }
}
