package X;

import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.search.router.ECSearchRouterInterceptor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04P8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04P8 extends C09AY implements Function0<List<IInterceptor>> {
    public C04P8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<IInterceptor> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ECSearchRouterInterceptor());
        return arrayList;
    }
}
