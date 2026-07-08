package X;

import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307220C2m extends C09AY implements Function0<Boolean> {
    public C307220C2m() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        return Boolean.valueOf((iAppContextService == null || !iAppContextService.LIZLLL()) ? C307260C2q.LIZ.isNewUser() ? ((Boolean) C307240C2o.LIZ.getValue()).booleanValue() : ((Boolean) C0BIO.LIZ.getValue()).booleanValue() : true);
    }
}
