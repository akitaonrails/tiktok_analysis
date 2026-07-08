package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0O84, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O84 implements InterfaceC736910SvR<InterfaceC346301Wb> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(538));

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final InterfaceC149400hg getOperator() {
        return new InterfaceC346301Wb() { // from class: X.0O82
            @Override // X.InterfaceC346301Wb
            public final InterfaceC346201Wa<C0O7A<C0O88>> LJJJIL(String str) {
                String curSecUserId;
                IAccountUserService iAccountUserService = (IAccountUserService) this.LL.LL.getValue();
                if (iAccountUserService != null) {
                    curSecUserId = iAccountUserService.getCurSecUserId();
                } else {
                    curSecUserId = null;
                }
                C613960O6g c613960O6gLIZ = C613940O6e.LIZ().LIZ(new C0O86(str));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(curSecUserId);
                sbLIZ.append(str);
                C0O7F.LIZ(c613960O6gLIZ, new AbstractC614210O7f(C2188811AlT.LIZIZ(sbLIZ)) { // from class: X.0O7o
                    public final String LIZIZ;
                    public final C614260O7k LIZJ;

                    @Override // X.InterfaceC614350O7t
                    public final String LIZ() {
                        return this.LIZIZ;
                    }

                    @Override // X.AbstractC614210O7f
                    public final AbstractC614250O7j LIZIZ() {
                        return this.LIZJ;
                    }

                    {
                        this.LIZIZ = str;
                        C614260O7k c614260O7k = C614260O7k.LIZIZ;
                        c614260O7k.LIZ = C614270O7l.LIZIZ.LIZ | c614260O7k.LIZ;
                        this.LIZJ = c614260O7k;
                    }
                });
                C0O7F.LJI(c613960O6gLIZ, new C0O3U() { // from class: X.0O83
                    @Override // X.C0O3U
                    public final <T> T create(Class<T> cls) {
                        Object service;
                        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
                        if (C1157804fw.LIZ()) {
                            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                            if (service == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchBubbleRepositoryPartial");
                            }
                        } else {
                            service = ServiceManager.get().getService(ISearchService.class);
                            if (service == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchBubbleRepositoryPartial");
                            }
                        }
                        return (T) iRetrofitFactory.createBuilder(((C0O85) service).LJIILJJIL()).build().retrofit.LIZ(cls);
                    }
                });
                return c613960O6gLIZ.LIZIZ();
            }
        };
    }
}
