package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IIMMediaService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ryi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713460Ryi extends C09AY implements Function1<C711340RvI, Boolean> {
    public C713460Ryi() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        boolean z;
        if (c711340RvI.LIZ.getAwemeType() == 502 && PluggableExtentionKt.pluggableSpiForReal(IIMMediaService.class) != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
