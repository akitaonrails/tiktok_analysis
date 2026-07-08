package X;

import com.ss.android.ugc.aweme.experiment.PhotoModeAfterCreationFreqCtrlConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: X.1Bqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217591Bqn {
    public static PhotoModeAfterCreationFreqCtrlConfig LIZ() {
        C2217601Bqo.LIZ.getClass();
        return (PhotoModeAfterCreationFreqCtrlConfig) C2217601Bqo.LIZJ.getValue();
    }

    public static C2217581Bqm LIZIZ() {
        return C2217581Bqm.LIZJ.getValue();
    }

    public static String LJ(String str) {
        return C786410Ut5.j4("uid_%s_consecutive_item_exit_count", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static String LJFF(String str) {
        return C786410Ut5.j4("uid_%s_daily_exposure_keys_set", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static String LJI(String str) {
        return C786410Ut5.j4("uid_%s_daily_total_exposure_count", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static String LJII(String str) {
        return C786410Ut5.j4("uid_%s_exposure_level", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static String LJIIIIZZ(String str) {
        return C786410Ut5.j4("uid_%s_level_no_click_count", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static String LIZJ(String str, String str2) {
        return C786410Ut5.j4("gid_%s_%s_no_click_count", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public static String LIZLLL(String str, String str2) {
        return C786410Ut5.j4("item_%s_%s_is_exited", Arrays.copyOf(new Object[]{str, str2}, 2));
    }
}
