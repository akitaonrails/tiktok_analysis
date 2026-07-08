package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0QuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685330QuR implements InterfaceC736910SvR<InterfaceC685360QuU> {
    public final InterfaceC2661011f LL = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C1ER1.LIZIZ.LJIILJJIL());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1337));
    public final C685320QuQ LLILLL = new C685320QuQ(this);

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLL;
    }
}
