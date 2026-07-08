package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S06, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S06 extends C09AY implements Function1<C711340RvI, Boolean> {
    public C0S06() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AwemeTextLabelModel label;
        C711340RvI c711340RvI2 = c711340RvI;
        C0S0L.LIZ.getClass();
        boolean z = false;
        if (C0S0L.LIZJ(c711340RvI2) && (((aweme = c711340RvI2.LIZ) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (label = awemeRawAd.getLabel()) == null || label.getCompliancePosition() != 5) && !C1017070cZd.LLIIIL(c711340RvI2.LIZ))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
