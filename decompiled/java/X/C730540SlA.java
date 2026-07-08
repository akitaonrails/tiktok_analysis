package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SlA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730540SlA extends C09AY implements Function2<VideoDiggAssem, C291001Au<? extends Aweme>, Unit> {
    public C730540SlA() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDiggAssem videoDiggAssem, C291001Au<? extends Aweme> c291001Au) {
        VideoDiggAssem videoDiggAssem2 = videoDiggAssem;
        C291001Au<? extends Aweme> c291001Au2 = c291001Au;
        videoDiggAssem2.getClass();
        boolean zLJI = MethodIDManager.LJI(71795);
        if (c291001Au2 == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            videoDiggAssem2.Fp().Ar((Aweme) c291001Au2.LIZ);
            C0C64.LJIILLIIL().LJIL(31744, 1, "hybrid_test_experiment_string", "default", false);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        return Unit.LIZ;
    }
}
