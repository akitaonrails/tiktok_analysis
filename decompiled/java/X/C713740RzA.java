package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713740RzA extends C09AY implements Function1<C711340RvI, Boolean> {
    public C713740RzA() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        Aweme aweme = c711340RvI.LIZ;
        boolean z = false;
        if (aweme != null && C1575980r76.LJI(aweme.getAid()) && aweme.getAwemeType() == 333) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
