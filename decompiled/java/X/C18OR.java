package X;

import com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService;
import com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;

/* JADX INFO: renamed from: X.18OR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18OR {
    public static final ICommerceService LIZ() {
        ICommerceService iCommerceServiceCreateICommerceServicebyMonsterPlugin = CommerceService.createICommerceServicebyMonsterPlugin(false);
        return iCommerceServiceCreateICommerceServicebyMonsterPlugin == null ? new EmptyCommerceService() : iCommerceServiceCreateICommerceServicebyMonsterPlugin;
    }
}
