package X;

import com.ss.android.ugc.aweme.video.experiment.JatoBoostConfig;
import com.ss.android.ugc.aweme.video.experiment.JatoPlayConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Aka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188261Aka extends C09AY implements Function0<Unit> {
    public C2188261Aka() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        JatoBoostConfig jatoBoostConfig;
        JatoPlayConfig jatoPlayConfig = (JatoPlayConfig) C1848207Ls.LIZ.getValue();
        if (jatoPlayConfig != null && (jatoBoostConfig = jatoPlayConfig.preRenderConfig) != null && jatoBoostConfig.LIZ()) {
            C2188191AkT.LIZ(jatoBoostConfig);
        }
        return Unit.LIZ;
    }
}
