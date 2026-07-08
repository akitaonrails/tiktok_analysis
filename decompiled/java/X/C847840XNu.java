package X;

import com.bytedance.sdk.account.region.TTPInterceptor;
import com.ss.android.ugc.aweme.account.network.ttp.TTPInterceptorWrapper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847840XNu extends C09AY implements Function0<TTPInterceptor> {
    public final /* synthetic */ TTPInterceptorWrapper LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C847840XNu(TTPInterceptorWrapper tTPInterceptorWrapper) {
        super(0);
        this.LL = tTPInterceptorWrapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TTPInterceptor invoke() {
        return new TTPInterceptor(this.LL.LL);
    }
}
