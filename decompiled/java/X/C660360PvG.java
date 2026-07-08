package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;

/* JADX INFO: renamed from: X.0PvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660360PvG {
    public static final boolean LIZ(Aweme aweme) {
        AwemeRiskModel awemeRiskModel;
        String url;
        if (aweme == null || !C729980SkG.LJIIJJI(aweme) || (awemeRiskModel = aweme.getAwemeRiskModel()) == null || !awemeRiskModel.isWarn()) {
            return false;
        }
        AwemeRiskModel awemeRiskModel2 = aweme.getAwemeRiskModel();
        if (awemeRiskModel2 != null && (url = awemeRiskModel2.getUrl()) != null && url.length() != 0) {
            return false;
        }
        return true;
    }
}
