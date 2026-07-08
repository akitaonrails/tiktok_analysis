package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QAN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAN implements InterfaceC736910SvR<Object> {
    public final InterfaceC2661011f LL;
    public final C01GW LLILLJJLI;
    public final C647230Pa5 LLILLL;

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    public C0QAN() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C1ER1.LIZIZ.LJIILJJIL());
        c1499850p8JCreateBuilder.LIZJ(C2336109Dj.LJI());
        this.LL = c1499850p8JCreateBuilder.build();
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1338));
        this.LLILLL = new C647230Pa5(this);
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLL;
    }

    public static Map LIZ(List list, SearchRequestParam searchRequestParam) {
        String strValue;
        try {
            Field[] declaredFields = SearchRequestParam.class.getDeclaredFields();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                for (Field field : declaredFields) {
                    String name = field.getName();
                    C09CT c09ct = (C09CT) field.getAnnotation(C09CT.class);
                    if (c09ct != null) {
                        strValue = c09ct.value();
                    } else {
                        strValue = null;
                    }
                    if (Intrinsics.LJFF(name, str) || Intrinsics.LJFF(strValue, str)) {
                        boolean z = true;
                        field.setAccessible(true);
                        Object obj = field.get(searchRequestParam);
                        if (obj != null) {
                            if (obj.toString().length() <= 0) {
                                z = false;
                            }
                            if (z) {
                                linkedHashMap.put(str, obj.toString());
                            }
                        }
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }
}
