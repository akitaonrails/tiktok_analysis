package Y;

import X.C08Q0;
import X.C0BEC;
import X.C0C63;
import X.C0C64;
import X.C0CD2;
import X.C0X35;
import X.C1BCA;
import X.C1BWL;
import X.C202094145s;
import X.C292560BdO;
import X.C307990C5l;
import X.C308050C5r;
import X.C309220CAe;
import X.C844470XAv;
import X.EnumC309240CAg;
import X.EnumC312610CNf;
import android.os.SystemClock;
import com.ss.android.legoimpl.PreloadColdBootKevaValueTask;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AObjectS380S0100000_4 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS380S0100000_4 aObjectS380S0100000_4) {
        PreloadColdBootKevaValueTask preloadColdBootKevaValueTask = (PreloadColdBootKevaValueTask) aObjectS380S0100000_4.l0;
        preloadColdBootKevaValueTask.getClass();
        EnumC309240CAg enumC309240CAg = EnumC309240CAg.KV;
        C309220CAe.LIZIZ(enumC309240CAg, "cold_boot_keva_v2");
        C309220CAe.LJFF(enumC309240CAg, "cold_boot_keva_v2");
        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, preloadColdBootKevaValueTask);
        return null;
    }

    public static final Object invoke$1(AObjectS380S0100000_4 aObjectS380S0100000_4) {
        VideoBitRateABManager videoBitRateABManager = (VideoBitRateABManager) aObjectS380S0100000_4.l0;
        videoBitRateABManager.LJIIIZ(videoBitRateABManager.LJ);
        return null;
    }

    public static final Object invoke$2(AObjectS380S0100000_4 aObjectS380S0100000_4) {
        boolean z;
        ((C0C63) aObjectS380S0100000_4.l0).getClass();
        C844470XAv.LIZ.getClass();
        boolean z2 = true;
        if (C08Q0.LJ(C844470XAv.LIZ(), "ab_instance_anr_opt", false)) {
            C0C64.LIZJ = true;
        }
        boolean z3 = C292560BdO.LIZ;
        C292560BdO.LIZ = C08Q0.LJ(C844470XAv.LIZ(), "is_ab_exposure_vid_check_enabled", false);
        AwemeConfigCenter.LIZ();
        C308050C5r.LIZ = !((Boolean) C0CD2.LJJIII.getValue()).booleanValue();
        C307990C5l.LIZ = ((Boolean) C0CD2.LJIJ.getValue()).booleanValue();
        C307990C5l.LJFF = ((Boolean) C0CD2.LJIJI.getValue()).booleanValue();
        ((Boolean) C0CD2.LJIJJ.getValue()).booleanValue();
        ((Boolean) C0CD2.LJJIFFI.getValue()).booleanValue();
        C307990C5l.LIZIZ = ((Boolean) C0CD2.LJIJJLI.getValue()).booleanValue();
        C307990C5l.LIZJ = ((Boolean) C0CD2.LJIL.getValue()).booleanValue();
        int iIntValue = ((Number) C0CD2.LJJ.getValue()).intValue();
        if ((iIntValue & 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        C307990C5l.LIZLLL = z;
        if ((iIntValue & 2) <= 0) {
            z2 = false;
        }
        C307990C5l.LJ = z2;
        ((Number) C0CD2.LJJI.getValue()).intValue();
        C08Q0.LIZIZ(C1BWL.LIZ(), 0, "opt_gson_tostring_type");
        C0BEC.LIZ(C1BWL.LIZ());
        ((Number) C0CD2.LJJII.getValue()).intValue();
        C202094145s.LJIILLIIL = SystemClock.uptimeMillis();
        C0X35.LJIIJJI("application_initbefore_init_ab", false);
        return 0;
    }

    public AObjectS380S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
