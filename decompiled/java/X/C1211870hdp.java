package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211870hdp extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1211870hdp(int i, Context context, String str, Function0 function0) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILLJJLI, "//setting/findcontact");
        smartRouteBuildRoute.withParam("enter_from", this.LLILLL);
        smartRouteBuildRoute.withParam("is_rec", this.LLILZ);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }
}
