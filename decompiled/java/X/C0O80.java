package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.photosearch.repo.SearchPhotoInterceptor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0O80, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O80 implements InterfaceC736910SvR<InterfaceC614410O7z> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(668));

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final InterfaceC149400hg getOperator() {
        return new InterfaceC614410O7z() { // from class: X.0O7y
            @Override // X.InterfaceC614410O7z
            public final InterfaceC346201Wa<C0O7A<C0O93>> LLJZIJLIL(String str, long j, int i, String str2, String str3, int i2, String str4, String str5, int i3, int i4, int i5, int i6, String str6, String str7, String str8, String str9, LinkedHashMap<String, Integer> linkedHashMap, String str10, Integer num, String str11, Long l, Map<String, String> map, String str12, boolean z) {
                String curSecUserId;
                IAccountUserService iAccountUserService = (IAccountUserService) this.LL.LL.getValue();
                if (iAccountUserService != null) {
                    curSecUserId = iAccountUserService.getCurSecUserId();
                } else {
                    curSecUserId = null;
                }
                C613960O6g c613960O6gLIZ = C613940O6e.LIZ().LIZ(new C0O92(str, j, i, str2, str3, i2, str4, str5, i3, i4, i5, i6, str6, str7, str8, str9, linkedHashMap, str10, num, str11, l, map, str12, Boolean.valueOf(z)));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(curSecUserId);
                sbLIZ.append(str);
                C0O7F.LIZ(c613960O6gLIZ, new AbstractC614210O7f(C2188811AlT.LIZIZ(sbLIZ)) { // from class: X.0O7r
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
                C0O7F.LJI(c613960O6gLIZ, new C0O3U() { // from class: X.0CfP
                    @Override // X.C0O3U
                    public final <T> T create(Class<T> cls) {
                        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C1ER1.LIZIZ.LJIILJJIL());
                        c1499850p8JCreateBuilder.LIZ(new SearchPhotoInterceptor());
                        return (T) c1499850p8JCreateBuilder.build().retrofit.LIZ(cls);
                    }
                });
                return c613960O6gLIZ.LIZIZ();
            }
        };
    }
}
