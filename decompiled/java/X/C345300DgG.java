package X;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345300DgG extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0OGR LLILZ;
    public final /* synthetic */ Function2<Integer, List<Uri>, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C345300DgG(C19EG c19eg, int i, boolean z, C0OGR c0ogr, Function2<? super Integer, ? super List<Uri>, Unit> function2) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = c0ogr;
        this.LLILZIL = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        CreativeToolsPluginService creativeToolsPluginService;
        if (bool.booleanValue() && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null && creativeToolsPluginService.LJI(this.LL)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, "//tako/camera/capture");
            smartRouteBuildRoute.withParam("current_pic_display_item_count", this.LLILLJJLI);
            smartRouteBuildRoute.withParam("hide_gallery_entrance", this.LLILLL);
            smartRouteBuildRoute.withParam("mob_params", this.LLILZ);
            final Function2<Integer, List<Uri>, Unit> function2 = this.LLILZIL;
            smartRouteBuildRoute.open(1, new OnActivityResultCallback() { // from class: X.0DgA
                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i, int i2, Intent intent) {
                    if (intent != null) {
                        Function2<Integer, List<Uri>, Unit> function22 = function2;
                        ArrayList arrayList = new ArrayList();
                        if (i2 == -1) {
                            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("KEY_MEDIA_LIST");
                            if (parcelableArrayListExtra != null) {
                                arrayList = new ArrayList(parcelableArrayListExtra);
                            } else {
                                arrayList = new ArrayList();
                            }
                        }
                        function22.invoke(Integer.valueOf(i2), arrayList);
                    }
                }
            });
        }
        return Unit.LIZ;
    }
}
