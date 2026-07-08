package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadApiData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.080Y, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080Y extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2130208We LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C080Y(C2130208We c2130208We, String str, Map<String, ? extends Object> map, String str2) {
        super(0);
        this.LL = c2130208We;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C080X c080x = this.LL.LIZIZ;
        String str = this.LLILLJJLI;
        Map<String, ? extends Object> map = this.LLILLL;
        String str2 = this.LLILZ;
        if (c080x.LIZIZ().contains(str)) {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayListLIZ = C2131308Wp.LIZ();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayListLIZ) {
                    if (Intrinsics.LJFF(((ECPreloadApiData) obj).api, str)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
                if ((!arrayList.isEmpty()) && map != null) {
                    c080x.LIZ.invoke(arrayList, map, str2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Unit.LIZ;
    }
}
