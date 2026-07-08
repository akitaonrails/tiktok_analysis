package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadArgument;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarDownloadArg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HHV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$enterDownloadSharePage$1$1$1", f = "SocialAvatarServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0HHV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0HHY LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ DialogC1389620mGW LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ SocialAvatarDownloadArg LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HHV(C0HHY c0hhy, String str, int i, DialogC1389620mGW dialogC1389620mGW, C19EG c19eg, SocialAvatarDownloadArg socialAvatarDownloadArg, InterfaceC1364105Vn<? super C0HHV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0hhy;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = dialogC1389620mGW;
        this.LLILZIL = c19eg;
        this.LLILZLL = socialAvatarDownloadArg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HHV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C0HFH {
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.enterDownloadSharePage$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            SocialAvatarDownloadArgument socialAvatarDownloadArgument = new SocialAvatarDownloadArgument(this.LL.LJFF(C0HHW.DISPLAY_BACKGROUND), this.LL.LJFF(C0HHW.DOWNLOAD_CARD), this.LL.LJFF(C0HHW.DOWNLOAD_STATIC_BACKGROUND), this.LL.LJFF(C0HHW.DOWNLOAD_MASK), this.LL.LJFF(C0HHW.STATIC_AVATAR), this.LL.LJFF(C0HHW.DYNAMIC_AVATAR), this.LLILLJJLI, C2286608xc.LJ(this.LLILLL));
            C786410Ut5.LJIIJ(this.LLILZ);
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(this.LLILZIL, "social_avatar", true)) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILZIL, "//user/social_avatar/download");
                smartRouteBuildRoute.withNavArg(this.LLILZLL);
                smartRouteBuildRoute.withParam("social_avatar_background_resources", socialAvatarDownloadArgument);
                smartRouteBuildRoute.open();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.enterDownloadSharePage$1$1$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C0HFH(e);
        }
    }
}
