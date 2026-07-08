package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711670Rvp extends C09AY implements Function1<C711340RvI, Boolean> {
    public C711670Rvp() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        C711340RvI c711340RvI2 = c711340RvI;
        Aweme aweme = c711340RvI2.LIZ;
        String str = c711340RvI2.LIZJ;
        boolean z = true;
        if (c711340RvI2.LIZLLL != 1) {
            z = false;
        }
        return Boolean.valueOf(C729510SjV.LJJIII(aweme, str, z));
    }
}
