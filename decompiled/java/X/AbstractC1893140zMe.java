package X;

import com.ss.android.ugc.aweme.poi.experiment.PoiThirdPartyRetainConfig;

/* JADX INFO: renamed from: X.0zMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1893140zMe extends AbstractC1201410hMx {
    public static final /* synthetic */ int LIZIZ = 0;

    @Override // X.AbstractC1201400hMw
    public final int LJ() {
        PoiThirdPartyRetainConfig.Frequency frequency;
        PoiThirdPartyRetainConfig.RetainConfig retainConfigLIZ = PoiThirdPartyRetainConfig.LIZ();
        if (retainConfigLIZ == null || (frequency = retainConfigLIZ.frequency) == null) {
            return 1;
        }
        return frequency.frequencyTimes;
    }

    @Override // X.AbstractC1201410hMx
    public final int LJII() {
        PoiThirdPartyRetainConfig.Frequency frequency;
        PoiThirdPartyRetainConfig.RetainConfig retainConfigLIZ = PoiThirdPartyRetainConfig.LIZ();
        if (retainConfigLIZ == null || (frequency = retainConfigLIZ.frequency) == null) {
            return 1;
        }
        return frequency.frequencyDay;
    }
}
