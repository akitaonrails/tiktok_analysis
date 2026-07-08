package Y;

import X.C1475000oUE;
import X.InterfaceC1523020pjg;
import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AObjectS296S0200000_23 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS296S0200000_23 aObjectS296S0200000_23) {
        ((InterfaceC1523020pjg) aObjectS296S0200000_23.l0).LIZJ(null, (byte[]) aObjectS296S0200000_23.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS296S0200000_23 aObjectS296S0200000_23) {
        ((InterfaceC1523020pjg) aObjectS296S0200000_23.l0).LIZJ(null, (byte[]) aObjectS296S0200000_23.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS296S0200000_23 aObjectS296S0200000_23) {
        DVideoPreloadManager dVideoPreloadManager = (DVideoPreloadManager) aObjectS296S0200000_23.l0;
        dVideoPreloadManager.LIZIZ.LJJIJL((Map) aObjectS296S0200000_23.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS296S0200000_23 aObjectS296S0200000_23) {
        DVideoPreloadManager dVideoPreloadManager = (DVideoPreloadManager) aObjectS296S0200000_23.l0;
        dVideoPreloadManager.LIZIZ.LJJJJZ((SimVideoUrlModel) aObjectS296S0200000_23.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS296S0200000_23 aObjectS296S0200000_23) {
        if (((DVideoPreloadManager) aObjectS296S0200000_23.l0).LIZLLL.get(((SimVideoUrlModel) aObjectS296S0200000_23.l1).getUri()) != null) {
            C1475000oUE.LJIIIIZZ().monitorStatusRate("aweme_media_play_stastics_log", 0, null);
        } else {
            C1475000oUE.LJIIIIZZ().monitorStatusRate("aweme_media_play_stastics_log", 1, null);
        }
        return Unit.LIZ;
    }

    public AObjectS296S0200000_23(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
