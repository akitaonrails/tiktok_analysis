package X;

import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.EOY2025Experiment;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.EOYResourceParams;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MQ1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MQ1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(29));

    public static boolean LIZ() {
        return ((EOY2025Experiment.EOY2025Config) EOY2025Experiment.LIZIZ.getValue()).enableCelebration == 1;
    }

    public static boolean LIZIZ() {
        ICelebrationCreateService iCelebrationCreateService;
        return ((EOY2025Experiment.EOY2025Config) EOY2025Experiment.LIZIZ.getValue()).enableCreateTabEntrance == 1 && (iCelebrationCreateService = (ICelebrationCreateService) LIZ.getValue()) != null && iCelebrationCreateService.isEoYOngoingToday();
    }

    public static boolean LIZLLL() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "fix_eoy_res_download", true, true);
    }

    public static EOYResourceParams LJ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EOYResourceParams eOYResourceParams = C0MQ0.LIZ;
        EOYResourceParams eOYResourceParams2 = (EOYResourceParams) c0c64LJIILLIIL.LJJII(EOYResourceParams.class, eOYResourceParams, "eoy_2025_resource_config", true);
        return eOYResourceParams2 != null ? eOYResourceParams2 : eOYResourceParams;
    }

    public static boolean LIZJ(int i) {
        if (!LJFF(i)) {
            if (i == 2 && LIZ()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean LJFF(int i) {
        if (i != 2 || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_eoy_otd_new_style", true, false)) {
            return false;
        }
        return true;
    }

    public static boolean LJI(int i) {
        if (i != 2 || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_eoy_ui_preview_jump_edit", true, false)) {
            return false;
        }
        return true;
    }
}
