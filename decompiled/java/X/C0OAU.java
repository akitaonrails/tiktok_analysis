package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0OAU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OAU implements InterfaceC736910SvR<C0OAQ> {
    public final C0OAW LL;
    public final C0OAV LLILLJJLI;

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0OAV] */
    public C0OAU() {
        C0OAW.LIZ.getClass();
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        this.LL = (C0OAW) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(C0OAW.class);
        this.LLILLJJLI = new C0OAQ() { // from class: X.0OAV
            @Override // X.C0OAQ
            public final Object LLIIIILZ(Long l, C0OAR c0oar) {
                return this.LL.LL.LIZ(l, 20, c0oar);
            }

            @Override // X.C0OAQ
            public final Object z0(Long l, C0OAR c0oar) {
                return this.LL.LL.LIZIZ(l, 20, c0oar);
            }

            @Override // X.C0OAQ
            public final Object LLILZ(String str, String str2, String str3, AbstractC23140094w abstractC23140094w) {
                return this.LL.LL.LIZJ(str, str2, str3, abstractC23140094w);
            }

            @Override // X.C0OAQ
            public final Object LLLLIILLL(int i, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
                return this.LL.LL.LIZLLL(str, i, 0, str2, interfaceC1364105Vn);
            }
        };
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }
}
