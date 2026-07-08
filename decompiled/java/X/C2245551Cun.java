package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245551Cun extends C09AY implements Function0<ICommerceFeatureCenter> {
    public C2245551Cun() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ICommerceFeatureCenter invoke() {
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null) {
            return iCommerceService.LJFF();
        }
        return null;
    }
}
