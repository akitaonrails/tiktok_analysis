package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387650mDL<T> {
    public static final CommonApi LJII = (CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(CommonApi.class);
    public InterfaceC1387630mDJ<T> LIZ;
    public final String LIZIZ;
    public final EnumC1387660mDM LIZJ;
    public final List<C2259691DcV> LIZLLL;
    public final Class<T> LJ;
    public boolean LJI = true;
    public final String LJFF = null;

    public C1387650mDL(String str, EnumC1387660mDM enumC1387660mDM, List<C2259691DcV> list, Class<T> cls) {
        this.LIZIZ = str;
        this.LIZJ = enumC1387660mDM;
        this.LIZLLL = list;
        this.LJ = cls;
    }

    public static Object LIZ(EnumC1387660mDM enumC1387660mDM, Class cls, String str, String str2, List list) {
        HashMap map = new HashMap();
        if (!C086I.LIZIZ(list)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C2259691DcV c2259691DcV = (C2259691DcV) it2.next();
                map.put(c2259691DcV.LL, c2259691DcV.LLILLJJLI);
            }
        }
        if (enumC1387660mDM == EnumC1387660mDM.POST) {
            C0XDN.LIZJ(map, true);
            String str3 = LJII.doPost(str, map).execute().LIZIZ;
            if (String.class.equals(cls)) {
                return Api.LJI(str3, C0XIK.LIZ, str2, str);
            }
            return Api.LJI(str3, new C14SG(cls), str2, str);
        }
        if (enumC1387660mDM == EnumC1387660mDM.GET) {
            String str4 = LJII.doGet(str, map).execute().LIZIZ;
            if (String.class.equals(cls)) {
                return Api.LJI(str4, C0XIK.LIZ, str2, str);
            }
            return Api.LJI(str4, new C14SG(cls), str2, str);
        }
        throw new IllegalStateException("Unsupport http type !");
    }
}
