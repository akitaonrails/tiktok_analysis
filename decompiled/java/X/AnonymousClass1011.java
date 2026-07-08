package X;

import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1011, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class AnonymousClass1011 extends C2217421BqW implements Function1<View, Unit> {
    public AnonymousClass1011(AnonymousClass1014 anonymousClass1014) {
        super(1, anonymousClass1014, AnonymousClass1014.class, "click", "click(Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        AnonymousClass1014 anonymousClass1014 = (AnonymousClass1014) this.receiver;
        Function0<Unit> function0 = anonymousClass1014.LIZIZ.LJ;
        if (function0 != null) {
            function0.invoke();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(anonymousClass1014.LIZ, "//creator_care_mode/simplify_settings");
        smartRouteBuildRoute.withParam("enter_scene", anonymousClass1014.LIZIZ.LIZIZ.getValue());
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }
}
