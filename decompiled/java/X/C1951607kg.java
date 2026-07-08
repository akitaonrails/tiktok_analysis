package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1951607kg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1951607kg(Context context, String str, boolean z) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        Activity activityLIZIZ;
        Context context = this.LL;
        Uri uri = UriProtector.parse(this.LLILLJJLI);
        boolean z2 = false;
        if (Intrinsics.LJFF(uri.getAuthority(), "lynxview_popup") || Intrinsics.LJFF(uri.getAuthority(), "webview_popup") || Intrinsics.LJFF(uri.getAuthority(), "roma_redirect")) {
            z = true;
            if (!this.LLILLL) {
                AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
                if (abstractC1387200mCcLIZLLL == null || (activityLIZIZ = abstractC1387200mCcLIZLLL.LIZIZ()) == null) {
                    z = false;
                    z2 = true;
                } else {
                    context = activityLIZIZ;
                    z = false;
                }
            }
        } else {
            z = false;
        }
        Uri.Builder builderScheme = uri.buildUpon().scheme("aweme");
        if (z2) {
            builderScheme.appendQueryParameter("bypass_presentation_hook", CardStruct.IStatusCode.DEFAULT);
        }
        String string = builderScheme.build().toString();
        if (this.LLILLL) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, "//main");
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.addFlags(536870912);
            if (z) {
                smartRouteBuildRoute.withParam("pendingPopup", string);
            }
            smartRouteBuildRoute.open();
        }
        if (!z) {
            SmartRouter.buildRoute(context, string).open();
        }
        return Unit.LIZ;
    }
}
