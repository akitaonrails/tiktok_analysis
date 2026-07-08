package X;

import com.ss.android.ugc.aweme.property.CanvasDurationConfig;
import com.ss.android.ugc.aweme.services.external.IAVPhotoModeService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Drn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269171Drn extends C09AY implements Function0<C577620Ml6> {
    public C2269171Drn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Ml6] */
    @Override // kotlin.jvm.functions.Function0
    public final C577620Ml6 invoke() {
        return new IAVPhotoModeService() { // from class: X.0Ml6
            @Override // com.ss.android.ugc.aweme.services.external.IAVPhotoModeService
            public final Pair<Integer, Integer> getCanvasToVideoDuration() {
                CanvasDurationConfig canvasDurationConfig = C571540MbI.LIZ;
                return new Pair<>(Integer.valueOf(canvasDurationConfig.minDuration), Integer.valueOf(canvasDurationConfig.maxDuration));
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAVPhotoModeService
            public final boolean enableSaveSingleImageAsVideo() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_canvas_to_single_image", true) == 2;
            }
        };
    }
}
