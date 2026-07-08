package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment.MRCImpressionEventAbModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046540dLA extends C09AY implements Function0<MRCImpressionEventAbModel> {
    public C1046540dLA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment.MRCImpressionEventAbModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final MRCImpressionEventAbModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MRCImpressionEventAbModel mRCImpressionEventAbModel = C1046530dL9.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("mrc_impression_experiment", MRCImpressionEventAbModel.class, mRCImpressionEventAbModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : mRCImpressionEventAbModel;
    }
}
