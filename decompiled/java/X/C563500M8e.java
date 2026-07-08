package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C563500M8e extends C2217421BqW implements InterfaceC1685420txc<Context, Integer, Integer, String, String, Unit> {
    public C563500M8e(C0M96 c0m96) {
        super(5, c0m96, C0M96.class, "showStoryArchiveViewTooltip", "showStoryArchiveViewTooltip(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Context context, Integer num, Integer num2, String str, String str2) {
        final Context context2 = context;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        final String str3 = str;
        final String str4 = str2;
        this.receiver.getClass();
        C450720Hlu c450720Hlu = new C450720Hlu(context2);
        c450720Hlu.LJIIJ(2131833963);
        c450720Hlu.LIZ(iIntValue, iIntValue2);
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LJII = 3000L;
        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
        c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        c450720Hlu.LLILLJJLI.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c450720Hlu.LJIIIZ(true, new View.OnClickListener() { // from class: X.0M8f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C735840Sti.LIZ.getClass();
                C735840Sti.LJIJ("click", "upload_page");
                if (Intrinsics.LJFF(str3, "personal_homepage") && Intrinsics.LJFF(str4, "story_archive")) {
                    Activity activityLIZ = C1388190mED.LIZ(context2);
                    if (activityLIZ != null) {
                        activityLIZ.onBackPressed();
                        return;
                    }
                    return;
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C1388190mED.LIZ(context2), "//story/archive_v2");
                smartRouteBuildRoute.withParam("is_enter_from_gallery", true);
                smartRouteBuildRoute.withParam("enter_from", str3);
                smartRouteBuildRoute.open();
            }
        });
        c450720Hlu.LIZIZ().show();
        return Unit.LIZ;
    }
}
