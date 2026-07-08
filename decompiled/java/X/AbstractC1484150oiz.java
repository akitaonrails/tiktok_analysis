package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ttkvideoplayer.adapt.AdaptiveRule;
import com.ss.android.ugc.aweme.ttkvideoplayer.adapt.rule.normal.NormalRule;

/* JADX INFO: renamed from: X.0oiz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1484150oiz {
    public NormalRule LIZ;

    public abstract C585050Mx5 LIZ(C1484140oiy c1484140oiy);

    public abstract String LIZJ();

    public final C585050Mx5 LIZIZ(C1484140oiy c1484140oiy) {
        String str;
        String strLIZJ = LIZJ();
        AdaptiveRule adaptiveRule = c1484140oiy.LIZIZ;
        if (adaptiveRule != null) {
            str = adaptiveRule.ruleType;
        } else {
            str = null;
        }
        if (TextUtils.equals(strLIZJ, str)) {
            return LIZ(c1484140oiy);
        }
        NormalRule normalRule = this.LIZ;
        if (normalRule == null) {
            return null;
        }
        return normalRule.LIZIZ(c1484140oiy);
    }
}
