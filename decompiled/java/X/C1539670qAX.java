package X;

import com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539670qAX extends C09AY implements Function2<C1539820qAm, Throwable, Unit> {
    public final /* synthetic */ List<Function2<C1539820qAm, Throwable, Unit>> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539670qAX(List<Function2<C1539820qAm, Throwable, Unit>> list, String str, String str2) {
        super(2);
        this.LL = list;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1539820qAm c1539820qAm, Throwable th) {
        C1539810qAl c1539810qAl;
        C1539820qAm c1539820qAm2 = c1539820qAm;
        if (c1539820qAm2 != null) {
            SSRCacheManager.LIZLLL.put(this.LLILLJJLI, c1539820qAm2);
        }
        for (Function2<C1539820qAm, Throwable, Unit> function2 : this.LL) {
            C1539820qAm c1539820qAm3 = null;
            if (c1539820qAm2 != null) {
                SSRCacheManager.LIZ.getClass();
                C1539810qAl c1539810qAl2 = c1539820qAm2.LIZ;
                if (c1539810qAl2 != null) {
                    c1539810qAl = new C1539810qAl(c1539810qAl2.LIZ, c1539810qAl2.LIZIZ, c1539810qAl2.LIZJ, c1539810qAl2.LIZLLL.LJ(), c1539810qAl2.LJ, c1539810qAl2.LJFF, c1539810qAl2.LJI);
                } else {
                    c1539810qAl = null;
                }
                c1539820qAm3 = new C1539820qAm(c1539810qAl, new LinkedHashMap(c1539820qAm2.LIZIZ), null);
            }
            function2.invoke(c1539820qAm3, th);
        }
        SSRCacheManager.LIZJ.remove(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
