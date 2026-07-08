package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711530Rvb extends C09AY implements Function1<C711340RvI, Boolean> {
    public C711530Rvb() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        Aweme aweme;
        C711340RvI c711340RvI2 = c711340RvI;
        boolean z = false;
        if (C729510SjV.LJJIJIL(c711340RvI2.LIZ) && (aweme = c711340RvI2.LIZ) != null && aweme.getIsTikTokStory() && aweme.getAwemeType() == 5457746) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
