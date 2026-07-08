package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1951207kc extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1951207kc(Function1<? super Boolean, Unit> function1, Context context, Integer num, String str, String str2, String str3, Map<String, String> map) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = context;
        this.LLILLL = num;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        Function1<Boolean, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
        if (zBooleanValue) {
            C1893580zNM c1893580zNM = C1893580zNM.LIZ;
            Context context = this.LLILLJJLI;
            Integer num = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            Map<String, String> map = this.LLIZ;
            c1893580zNM.getClass();
            C1893570zNL c1893570zNL = new C1893570zNL(str, str2);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C1893580zNM.LIZLLL(num, str, str2, str3, map));
            smartRouteBuildRoute.withCallback(c1893570zNL);
            smartRouteBuildRoute.open();
        }
        return Unit.LIZ;
    }
}
