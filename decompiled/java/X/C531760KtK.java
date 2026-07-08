package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0KtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531760KtK {
    public static final C531760KtK LIZ = new C531760KtK();
    public static final Map<String, C532330KuF> LIZIZ = new LinkedHashMap();

    public static final void LIZ(String str, Pair<String, String> pair, int i, String str2, String str3, Function1<? super C532330KuF, Unit> function1, Function2<? super String, ? super String, Unit> function2) {
        Object obj;
        C533090KvT c533090KvT = C533090KvT.LIZIZ;
        if (c533090KvT.LJFF() && (obj = ((LinkedHashMap) LIZIZ).get(str)) != 0) {
            function1.invoke(obj);
        } else {
            ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class)).LJI(str, pair, i, c533090KvT.LIZIZ().getSecond(), function1, function2, AFwS239S0000000_8.get$arr$(339), str2, str3);
        }
    }
}
