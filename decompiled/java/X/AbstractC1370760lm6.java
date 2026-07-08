package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.channel.SubscribeInviteChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSubscribeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.aweme.wallpaper.IWallpaperServiceApi;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1370760lm6 implements ShareDependService {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(18));

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean LJJIJIIJI() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null) {
            return false;
        }
        if (abstractC1387200mCcLIZIZ.LIZ instanceof MainRootFragment) {
            Activity activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            if (C1559540qga.LIZ(activityLIZIZ != null ? C1388190mED.LIZIZ(activityLIZIZ) : null)) {
                InterfaceC1603190roz interfaceC1603190roz = (InterfaceC1603190roz) abstractC1387200mCcLIZIZ.LIZ;
                return interfaceC1603190roz.getCurFragment() == null || !(interfaceC1603190roz.getCurFragment() instanceof InterfaceC1593630rZZ) || !((InterfaceC1593630rZZ) interfaceC1603190roz.getCurFragment()).Vp() || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
            }
        }
        return abstractC1387200mCcLIZIZ.LIZ instanceof InterfaceC1058480deQ;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJI(boolean z) {
        FullFeedFragmentPanel.f371X = z;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final int LJIIIZ(Aweme aweme) {
        CommercePermissionStruct commercePermission;
        User author = aweme.getAuthor();
        if (author != null) {
            if (((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(author.getUid()) && (commercePermission = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getCommercePermission()) != null && commercePermission.topItem == 1) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean LJIJJLI(Aweme aweme) {
        if (aweme != null && aweme.getAuthor() != null && TextUtils.equals(AwemeExtKt.getAuthorUid(aweme), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getCommerceUserLevel() == 0 && aweme.getAuthor() != null && aweme.getAuthor().getCommerceUserLevel() == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final SubscribeInviteChannel LJJIII(LiveSubscribeSharePackage liveSubscribeSharePackage) {
        return new SubscribeInviteChannel(liveSubscribeSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIIZI(String str) {
        C621180OYa.LIZIZ.LJJLIIIJL(str);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIL(C2344009Gk c2344009Gk) {
        C20684815ws.LJIILLIIL("download", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final C19292410dm LJJJ(User user) {
        return new C19292410dm(user);
    }

    public static Object LIZ(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJ(String str, BaseSharePackage baseSharePackage) {
        InterfaceC1036110d4L interfaceC1036110d4L;
        C1529880puk c1529880puk = SparkContext.Companion;
        String string = baseSharePackage.extras.getString("spark_container_id");
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(string);
        if (c1537480q70LIZIZ != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) c1537480q70LIZIZ.LJFF(InterfaceC1036110d4L.class)) != null) {
            interfaceC1036110d4L.LJJIIZI(baseSharePackage.url);
            return;
        }
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
        if (awemeEr != null && AwemeExtKt.isAdTraffic(awemeEr)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", "copy", awemeEr.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(baseSharePackage.url, "url");
            c1022820ciuLIZLLL.LIZIZ(LIZ(baseSharePackage.extras, "first_page"), "first_page");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        if (baseSharePackage.extras.getInt("anchor_type") > 0) {
            C1040580dBY c1040580dBY = new C1040580dBY(C08JS.LIZ(baseSharePackage.extras.getString("non_ad_model"), NonAdWebModel.class));
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJIILLIIL, new AwS595S0100000_16(baseSharePackage, 33));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIJ(String str, BaseSharePackage baseSharePackage) {
        C1529880puk c1529880puk = SparkContext.Companion;
        String string = baseSharePackage.extras.getString("spark_container_id");
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(string);
        InterfaceC1036110d4L interfaceC1036110d4L = null;
        if (c1537480q70LIZIZ != null) {
            interfaceC1036110d4L = (InterfaceC1036110d4L) c1537480q70LIZIZ.LJFF(InterfaceC1036110d4L.class);
        }
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LJJIZ(baseSharePackage.extras.getString("shareIdList"), baseSharePackage.url);
            return;
        }
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
        if (awemeEr != null && AwemeExtKt.isAdTraffic(awemeEr)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", "share", awemeEr.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(LIZ(baseSharePackage.extras, "current_url"), "url");
            c1022820ciuLIZLLL.LIZIZ(LIZ(baseSharePackage.extras, "first_page"), "first_page");
            c1022820ciuLIZLLL.LIZIZ(LIZ(baseSharePackage.extras, "shareIdList"), "share_uid");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        if (baseSharePackage.extras.getInt("anchor_type") > 0) {
            C1040580dBY c1040580dBY = new C1040580dBY(C08JS.LIZ(baseSharePackage.extras.getString("non_ad_model"), NonAdWebModel.class));
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJIJ, new AwS595S0100000_16(baseSharePackage, 37));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIL(String str, BaseSharePackage baseSharePackage) {
        InterfaceC1036110d4L interfaceC1036110d4L;
        C1529880puk c1529880puk = SparkContext.Companion;
        String string = baseSharePackage.extras.getString("spark_container_id");
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(string);
        if (c1537480q70LIZIZ != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) c1537480q70LIZIZ.LJFF(InterfaceC1036110d4L.class)) != null) {
            interfaceC1036110d4L.LJIIL(baseSharePackage.url);
            return;
        }
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
        if (awemeEr != null && AwemeExtKt.isAdTraffic(awemeEr)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", "report", awemeEr.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(LIZ(baseSharePackage.extras, "current_url"), "url");
            c1022820ciuLIZLLL.LIZIZ(LIZ(baseSharePackage.extras, "first_page"), "first_page");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        if (baseSharePackage.extras.getInt("anchor_type") > 0) {
            C1040580dBY c1040580dBY = new C1040580dBY(C08JS.LIZ(baseSharePackage.extras.getString("non_ad_model"), NonAdWebModel.class));
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJIILJJIL, new AwS595S0100000_16(baseSharePackage, 36));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIILLIIL(String str, BaseSharePackage baseSharePackage) {
        String creativeIdStr;
        String logExtra;
        InterfaceC1036110d4L interfaceC1036110d4L;
        C1529880puk c1529880puk = SparkContext.Companion;
        String string = baseSharePackage.extras.getString("spark_container_id");
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(string);
        if (c1537480q70LIZIZ != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) c1537480q70LIZIZ.LJFF(InterfaceC1036110d4L.class)) != null) {
            interfaceC1036110d4L.LJJIJIL(baseSharePackage.url);
            return;
        }
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
        if (awemeEr != null && AwemeExtKt.isAdTraffic(awemeEr)) {
            C1068590duj c1068590duj = new C1068590duj();
            C1023960ckk c1023960ckk = C1068600duk.LIZLLL;
            AwemeRawAd awemeRawAd = awemeEr.getAwemeRawAd();
            String str2 = "";
            if (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
                creativeIdStr = "";
            }
            AwemeRawAd awemeRawAd2 = awemeEr.getAwemeRawAd();
            if (awemeRawAd2 != null && (logExtra = awemeRawAd2.getLogExtra()) != null) {
                str2 = logExtra;
            }
            c1068590duj.logAd(c1023960ckk, creativeIdStr, str2, null, new AwS595S0100000_16(baseSharePackage, 32));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIJI(Context context, String str) {
        HashMap map = new HashMap();
        map.put("anchor_type", "analytics");
        String str2 = AddWikiActivity._pnsPageId;
        C11W4.LIZ(context, str, map, C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJ(Aweme aweme, Activity activity) {
        C2413209cw.LIZ.getClass();
        IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
        if (iWallpaperServiceApiLIZ != null) {
            iWallpaperServiceApiLIZ.LIZ(aweme, activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIFFI(Aweme aweme, String str) {
        new C15OG();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("entrance_type", "description");
        c2344009Gk.LJFF("duet_item_id", aweme.getAid());
        if (aweme.getDuettedInfo() != null) {
            c2344009Gk.LJFF("duet_from_item_id", aweme.getDuettedInfo().getOriginalItemId());
        }
        c2344009Gk.LJFF("action_type", "click");
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("duet_original_entrance", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIIJZLJL(String str, BaseSharePackage baseSharePackage) {
        InterfaceC1036110d4L interfaceC1036110d4L;
        C1529880puk c1529880puk = SparkContext.Companion;
        String string = baseSharePackage.extras.getString("spark_container_id");
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(string);
        if (c1537480q70LIZIZ != null) {
            interfaceC1036110d4L = (InterfaceC1036110d4L) c1537480q70LIZIZ.LJFF(InterfaceC1036110d4L.class);
        } else {
            interfaceC1036110d4L = null;
        }
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LJIILIIL(1, baseSharePackage.url);
            return;
        }
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
        if (awemeEr != null && AwemeExtKt.isAdTraffic(awemeEr)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", "refresh", awemeEr.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(LIZ(baseSharePackage.extras, "current_url"), "url");
            c1022820ciuLIZLLL.LIZIZ(LIZ(baseSharePackage.extras, "first_page"), "first_page");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        if (baseSharePackage.extras.getInt("anchor_type") > 0) {
            C1040580dBY c1040580dBY = new C1040580dBY(C08JS.LIZ(baseSharePackage.extras.getString("non_ad_model"), NonAdWebModel.class));
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJIILL, new AwS595S0100000_16(baseSharePackage, 35));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final C2344009Gk LJJIJ(C2344009Gk c2344009Gk, Aweme aweme) {
        String uid;
        String uid2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            c2344009Gk.LJFF("item_author_type", CardStruct.IStatusCode.DEFAULT);
            return c2344009Gk;
        }
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, uid2)) {
            c2344009Gk.LJFF("item_author_type", "1");
            return c2344009Gk;
        }
        c2344009Gk.LJFF("item_author_type", "2");
        return c2344009Gk;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIJIL(Context context, boolean z) {
        ((InterfaceC1370780lm8) C1489140or2.LIZ(context, InterfaceC1370780lm8.class)).LIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIJL(Aweme aweme, String str) {
        new C15OG();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("entrance_type", "description");
        c2344009Gk.LJFF("duet_item_id", aweme.getAid());
        if (aweme.getDuettedInfo() != null) {
            c2344009Gk.LJFF("duet_from_item_id", aweme.getDuettedInfo().getOriginalItemId());
        }
        c2344009Gk.LJFF("action_type", "show");
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("duet_original_entrance", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIJLIJ(String str, BaseSharePackage baseSharePackage) {
        InterfaceC1036110d4L interfaceC1036110d4L;
        C1529880puk c1529880puk = SparkContext.Companion;
        String string = baseSharePackage.extras.getString("spark_container_id");
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(string);
        if (c1537480q70LIZIZ != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) c1537480q70LIZIZ.LJFF(InterfaceC1036110d4L.class)) != null) {
            interfaceC1036110d4L.LJJIJIIJIL(baseSharePackage.url);
            return;
        }
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
        if (awemeEr != null && AwemeExtKt.isAdTraffic(awemeEr)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", "open_url_h5", awemeEr.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(baseSharePackage.url, "url");
            c1022820ciuLIZLLL.LIZIZ(LIZ(baseSharePackage.extras, "first_page"), "first_page");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        if (baseSharePackage.extras.getInt("anchor_type") > 0) {
            C1040580dBY c1040580dBY = new C1040580dBY(C08JS.LIZ(baseSharePackage.extras.getString("non_ad_model"), NonAdWebModel.class));
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJIIZILJ, new AwS595S0100000_16(baseSharePackage, 34));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final ImChannel LJJJIL(SharePackage sharePackage, String str) {
        return new ImChannel(sharePackage, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0llr] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.19EG, android.content.Context, android.view.ContextThemeWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v51, types: [X.0lcL] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tux.sheet.sheet.TuxSheet LJII(android.app.Activity r14, final X.C1371590lnR r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 1303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1370760lm6.LJII(android.app.Activity, X.0lnR, android.os.Bundle):com.bytedance.tux.sheet.sheet.TuxSheet");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIIIZZ(String str, String str2, String str3) {
        new C15OG();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("author_id", str2);
        c2344009Gk.LJFF("group_id", str3);
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("duet_button_click", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJI(String str, String str2, String str3) {
        new C15OF();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("author_id", str2);
        c0lab.LJ("group_id", str3);
        C20684815ws.LJIILLIIL("stitch_button_show", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final DialogC1365000lco LJJII(Activity activity, C1371590lnR c1371590lnR, int i) {
        return new DialogC1365000lco(activity, c1371590lnR, i);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final String LJJIIJ(int i, Aweme aweme, String str) {
        return C2277881EDy.LIZIZ.disLikeAweme(aweme, i, str, 0, 0);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIJIIJIL(String str, String str2, String str3) {
        new C15OG();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("author_id", str2);
        c2344009Gk.LJFF("group_id", str3);
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("duet_button_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIL(Aweme aweme, Activity activity, String str, String str2) {
        new C15OF().LIZJ(aweme, activity, str, str2, true);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIIZ(Context context, String str, int i, int i2) {
        IMovieReuseService iMovieReuseServiceLJ = MovieReuseServiceImpl.LJ();
        IMovieReuseService.LIZ.getClass();
        iMovieReuseServiceLJ.LIZJ(context, 2, str, null, Integer.valueOf(i), null, null, i2, true, null, null, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LIZIZ(Activity activity, LiveEventSharePackage liveEventSharePackage, String str, long j, Pair pair) {
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZIZ().LIZIZ(activity, liveEventSharePackage, str, j, pair);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIZILJ(Aweme aweme, String str, String str2, String str3, boolean z) {
        new C15OG();
        C15OG.LJIIJ(aweme, str, str2, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIJ(Aweme aweme, String str, String str2, String str3, boolean z) {
        new C15OG();
        C15OG.LIZ(aweme, str, str2, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJJJ(Context context, Aweme aweme, boolean z, ArrayList arrayList, int i, boolean z2, String str) {
        C1393930mNT c1393930mNT = new C1393930mNT();
        c1393930mNT.LJIIL = Integer.valueOf(i);
        if (aweme.getMusic() != null) {
            c1393930mNT.LIZJ = aweme.getMusic();
        }
        if (z) {
            c1393930mNT.LIZIZ = "green_screen";
            aweme.getAid();
        } else {
            c1393930mNT.LIZLLL = "prop_auto";
        }
        c1393930mNT.LJFF = "prop_reuse";
        c1393930mNT.LJ = "prop_reuse";
        c1393930mNT.LJIIIIZZ = str;
        c1393930mNT.LJIILLIIL = true;
        C1387380mCu c1387380mCuLJIIZILJ = C1394340mO8.LJIIZILJ(aweme);
        c1393930mNT.LJI = c1387380mCuLJIIZILJ.LIZLLL;
        c1393930mNT.LJII = c1387380mCuLJIIZILJ.LIZJ;
        ((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LJFF(context, arrayList, c1393930mNT.LIZ(), z2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJFF(String str, Aweme aweme, Activity activity, String str2, String str3, String str4, Map<String, String> map, boolean z, boolean z2) {
        C15OG c15og = new C15OG();
        c15og.LIZIZ = str;
        c15og.LIZJ = map;
        c15og.LJIJI = z;
        c15og.LJJIIZ = z2;
        c15og.LJIJ = str3;
        c15og.LJIIZILJ = str4;
        c15og.LIZJ(activity, aweme, str2);
    }
}
