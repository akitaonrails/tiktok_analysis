package X;

import Y.ACallableS431S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.ss.android.ugc.aweme.notification.utils.SharePhotoModeHelper;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19335210kg implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C19335210kg c19335210kg, C15O7 c15o7) {
        C1C7U.LIZ("SharePhotoModeHelper@7395.requestSharePhotoModeInfo$1");
        SharePhotoModeHelper.SharePhotoModeInfoResponse sharePhotoModeInfoResponse = (SharePhotoModeHelper.SharePhotoModeInfoResponse) c15o7.LJIIL();
        if (sharePhotoModeInfoResponse != null) {
            Function1 function1 = (Function1) c19335210kg.l0;
            Context context = (Context) c19335210kg.l1;
            if (sharePhotoModeInfoResponse.statusCode == 0) {
                function1.invoke(sharePhotoModeInfoResponse.photoModeInfo);
            } else {
                SharePhotoModeHelper.LIZ.getClass();
                SharePhotoModeHelper.LIZ(context);
                function1.invoke(null);
            }
        } else {
            SharePhotoModeHelper sharePhotoModeHelper = SharePhotoModeHelper.LIZ;
            Context context2 = (Context) c19335210kg.l1;
            Function1 function12 = (Function1) c19335210kg.l0;
            sharePhotoModeHelper.getClass();
            SharePhotoModeHelper.LIZ(context2);
            function12.invoke(null);
        }
        C1C7U.LIZIZ("SharePhotoModeHelper@7395.requestSharePhotoModeInfo$1");
        return null;
    }

    public static final Object then$1(C19335210kg c19335210kg, C15O7 c15o7) throws Throwable {
        int i;
        UgNewFeedPendant newFeedPendant;
        List<UrlModel> resourceUrl;
        List<String> bigPngFragmentsUrls;
        List<String> smallPngFragmentsUrls;
        UgNewFeedPendant newFeedPendant2;
        UgNewFeedPendant newFeedPendant3;
        UgNewFeedPendant newFeedPendant4;
        List<UrlModel> resourceUrl2;
        String lottieFileMd5;
        List<String> lottieFileZip;
        UgNewFeedPendant newFeedPendant5;
        UgNewFeedPendant newFeedPendant6;
        C1C7U.LIZ("UniversalPendantManager@ae01.tryShowFissionFeedPendant$2");
        if (((Boolean) c15o7.LJIIL()).booleanValue()) {
            C1912010zr5 c1912010zr5 = new C1912010zr5();
            AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28((C1912080zrC) c19335210kg.l0, (Context) c19335210kg.l1, 134);
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28((C1912080zrC) c19335210kg.l0, 921);
            AwS429S0200000_28 awS429S0200000_282 = new AwS429S0200000_28((C1912080zrC) c19335210kg.l0, (Context) c19335210kg.l1, 135);
            C1912080zrC c1912080zrC = (C1912080zrC) c19335210kg.l0;
            c1912010zr5.LIZ = c1912080zrC.LJIIJ;
            c1912010zr5.LIZIZ = awS429S0200000_28;
            c1912010zr5.LIZJ = awS572S0100000_28;
            c1912010zr5.LIZLLL = awS429S0200000_282;
            c1912080zrC.LIZJ = new C1912140zrI(((C1912080zrC) c19335210kg.l0).LJI, new C1912000zr4(c1912010zr5), (Context) c19335210kg.l1);
            float fLIZJ = C497820Jfg.LIZJ((Context) c19335210kg.l1) + 0.0f;
            C1912080zrC c1912080zrC2 = (C1912080zrC) c19335210kg.l0;
            View view = c1912080zrC2.LIZLLL;
            if (view instanceof FrameLayout) {
                ((ViewGroup) view).addView(c1912080zrC2.LIZJ);
            }
            int iLJIILJJIL = C12ES.LJIILJJIL(fLIZJ, ((C1912080zrC) c19335210kg.l0).LIZ);
            C1912080zrC c1912080zrC3 = (C1912080zrC) c19335210kg.l0;
            int iLJIIJ = C12ES.LJIIJ(c1912080zrC3.LIZ);
            if (C12ES.LJIIIIZZ(c1912080zrC3.LIZ) > 1280 && iLJIIJ > 720) {
                i = 64;
            } else {
                i = 54;
            }
            int i2 = iLJIILJJIL + i;
            ViewGroup.LayoutParams layoutParams = ((C1912080zrC) c19335210kg.l0).LIZJ.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) C12ES.LIZJ(i2, ((C1912080zrC) c19335210kg.l0).LIZ);
                C1912140zrI c1912140zrI = ((C1912080zrC) c19335210kg.l0).LIZJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1912140zrI);
                c1912140zrI.setLayoutParams(layoutParams);
            }
            final C1911950zqz c1911950zqz = new C1911950zqz();
            final C1912080zrC c1912080zrC4 = (C1912080zrC) c19335210kg.l0;
            int i3 = c1912080zrC4.LJI;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        InterfaceC1912070zrB interfaceC1912070zrB = new InterfaceC1912070zrB() { // from class: X.0zr0
                            @Override // X.InterfaceC1912070zrB
                            public final void onFail() {
                            }

                            @Override // X.InterfaceC1912070zrB
                            public final void onSuccess() throws Throwable {
                                try {
                                    c1911950zqz.LIZ = c1912080zrC4.LJIIL.LIZJ(0);
                                    c1911950zqz.LIZIZ = c1912080zrC4.LJIIL.LIZJ(1);
                                    C1911950zqz c1911950zqz2 = c1911950zqz;
                                    C1911970zr1 c1911970zr1 = c1912080zrC4.LJIIL;
                                    if (!c1911970zr1.LJI) {
                                        throw new Throwable("HAS NOT inited");
                                    }
                                    C1911980zr2 c1911980zr2 = c1911970zr1.LJFF;
                                    c1911950zqz2.LIZJ = c1911980zr2 != null ? c1911980zr2.LIZLLL() : null;
                                    C1912140zrI c1912140zrI2 = c1912080zrC4.LIZJ;
                                    if (c1912140zrI2 != null) {
                                        C1911950zqz c1911950zqz3 = c1911950zqz;
                                        c1911950zqz3.getClass();
                                        c1912140zrI2.LIZ(new C1911990zr3(c1911950zqz3));
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        };
                        try {
                            UgAwemeActivitySetting ugAwemeActivitySetting = c1912080zrC4.LIZIZ;
                            if (ugAwemeActivitySetting != null && (newFeedPendant6 = ugAwemeActivitySetting.getNewFeedPendant()) != null) {
                                lottieFileMd5 = newFeedPendant6.getLottieFileMd5();
                            } else {
                                lottieFileMd5 = null;
                            }
                            UgAwemeActivitySetting ugAwemeActivitySetting2 = ((C1912080zrC) c19335210kg.l0).LIZIZ;
                            if (ugAwemeActivitySetting2 != null && (newFeedPendant5 = ugAwemeActivitySetting2.getNewFeedPendant()) != null) {
                                lottieFileZip = newFeedPendant5.getLottieFileZip();
                            } else {
                                lottieFileZip = null;
                            }
                            if (lottieFileMd5 != null && lottieFileZip != null) {
                                C1912080zrC c1912080zrC5 = (C1912080zrC) c19335210kg.l0;
                                c1912080zrC5.LJIIL.LIZIZ(c1912080zrC5.LJIILIIL, lottieFileMd5, lottieFileZip);
                            }
                            C1911970zr1 c1911970zr1 = ((C1912080zrC) c19335210kg.l0).LJIIL;
                            synchronized (c1911970zr1.LJIIIZ) {
                                try {
                                    ((ArrayList) c1911970zr1.LJII).add(interfaceC1912070zrB);
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            C1911970zr1 c1911970zr12 = ((C1912080zrC) c19335210kg.l0).LJIIL;
                            Context context = (Context) c19335210kg.l1;
                            if (c1911970zr12.LJI) {
                                if (!c1911970zr12.LJIIIIZZ) {
                                    c1911970zr12.LJIIIIZZ = true;
                                    C15O7.LIZJ(new ACallableS431S0100000_28(c1911970zr12, 29)).LJ(new C19335310kh(c1911970zr12, context, 9), C15O7.LJIIIIZZ, null);
                                }
                            } else {
                                throw new Throwable("HAS NOT inited");
                            }
                        } catch (C316660CbA e) {
                            TryCatchGuardChecker.doCheck(e);
                            ((C1912080zrC) c19335210kg.l0).getClass();
                        }
                    }
                } else {
                    try {
                        UgAwemeActivitySetting ugAwemeActivitySetting3 = c1912080zrC4.LIZIZ;
                        if (ugAwemeActivitySetting3 != null && (newFeedPendant4 = ugAwemeActivitySetting3.getNewFeedPendant()) != null && (resourceUrl2 = newFeedPendant4.getResourceUrl()) != null && resourceUrl2.size() == 2) {
                            c1911950zqz.LIZLLL = (UrlModel) ListProtector.get(resourceUrl2, 0);
                            c1911950zqz.LJ = (UrlModel) ListProtector.get(resourceUrl2, 1);
                            C1912140zrI c1912140zrI2 = ((C1912080zrC) c19335210kg.l0).LIZJ;
                            if (c1912140zrI2 != null) {
                                c1912140zrI2.LIZ(new C1911990zr3(c1911950zqz));
                            }
                        }
                    } catch (C316660CbA e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        ((C1912080zrC) c19335210kg.l0).getClass();
                    }
                }
            } else {
                try {
                    UgAwemeActivitySetting ugAwemeActivitySetting4 = c1912080zrC4.LIZIZ;
                    if (ugAwemeActivitySetting4 != null && (newFeedPendant3 = ugAwemeActivitySetting4.getNewFeedPendant()) != null) {
                        bigPngFragmentsUrls = newFeedPendant3.getBigPngFragmentsUrls();
                    } else {
                        bigPngFragmentsUrls = null;
                    }
                    c1911950zqz.LJFF = bigPngFragmentsUrls;
                    UgAwemeActivitySetting ugAwemeActivitySetting5 = ((C1912080zrC) c19335210kg.l0).LIZIZ;
                    if (ugAwemeActivitySetting5 != null && (newFeedPendant2 = ugAwemeActivitySetting5.getNewFeedPendant()) != null) {
                        smallPngFragmentsUrls = newFeedPendant2.getSmallPngFragmentsUrls();
                    } else {
                        smallPngFragmentsUrls = null;
                    }
                    c1911950zqz.LJI = smallPngFragmentsUrls;
                } catch (C316660CbA th) {
                }
                try {
                    UgAwemeActivitySetting ugAwemeActivitySetting6 = ((C1912080zrC) c19335210kg.l0).LIZIZ;
                    if (ugAwemeActivitySetting6 != null && (newFeedPendant = ugAwemeActivitySetting6.getNewFeedPendant()) != null && (resourceUrl = newFeedPendant.getResourceUrl()) != null && resourceUrl.size() == 2) {
                        c1911950zqz.LIZLLL = (UrlModel) ListProtector.get(resourceUrl, 0);
                        c1911950zqz.LJ = (UrlModel) ListProtector.get(resourceUrl, 1);
                        C1912140zrI c1912140zrI3 = ((C1912080zrC) c19335210kg.l0).LIZJ;
                        if (c1912140zrI3 != null) {
                            c1912140zrI3.LIZ(new C1911990zr3(c1911950zqz));
                        }
                    }
                } catch (C316660CbA e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    ((C1912080zrC) c19335210kg.l0).getClass();
                    e3.toString();
                }
            }
        }
        C1C7U.LIZIZ("UniversalPendantManager@ae01.tryShowFissionFeedPendant$2");
        return null;
    }

    public static final Object then$2(C19335210kg c19335210kg, C15O7 c15o7) throws JSONException {
        int i;
        Map<String, String> map;
        String string;
        String str;
        Activity activityLIZ;
        ICreativeSAAService iCreativeSAAService;
        Activity activityLIZ2;
        ICreativeSAAService iCreativeSAAService2;
        C1C7U.LIZ("PromoteReplaceMusicManager@8b4f.postRequest$2");
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
            i = 1;
            if (!Intrinsics.LJFF(((PromoteReplaceMusicRequest) c19335210kg.l0).getRequestFrom(), "from_jsb")) {
                if (C1911640zqU.LJIIL == 1) {
                    Context context = (Context) c19335210kg.l1;
                    if (context != null && (activityLIZ2 = C1388190mED.LIZ(context)) != null && (iCreativeSAAService2 = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) != null) {
                        iCreativeSAAService2.finishCurrentPage(activityLIZ2);
                    }
                    IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("music_id", ((PromoteReplaceMusicRequest) c19335210kg.l0).getReplaceMusicRequest().getMusicId());
                    iEventCenter.LIZ("promote_change_music_post", C786410Ut5.J3(jSONObject));
                } else {
                    Context context2 = (Context) c19335210kg.l1;
                    if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null && (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) != null) {
                        iCreativeSAAService.finishCurrentPage(activityLIZ);
                    }
                    C1911640zqU c1911640zqU = C1911640zqU.LIZ;
                    Context context3 = (Context) c19335210kg.l1;
                    c1911640zqU.getClass();
                    if (context3 != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String str2 = C1911640zqU.LIZIZ;
                        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                        Map<String, String> map2 = C1395970mQl.LIZ;
                        try {
                            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                            map = C1395970mQl.LIZ;
                            Map<String, String> map3 = (Map) settingsManagerLIZLLL.LJIIIIZZ("promote_entrance_schema", Map.class, map);
                            if (map3 != null) {
                                map = map3;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1AF0.LJ(th);
                            map = C1395970mQl.LIZ;
                        }
                        String str3 = map.get("video");
                        if (TextUtils.isEmpty(str3)) {
                            string = "";
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str3);
                            sbLIZ.append("&source=");
                            sbLIZ.append("modify_setting");
                            sbLIZ.append("&use_spark=1");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            String strLJI = C1911570zqN.LJI();
                            if (!TextUtils.isEmpty(strLJI)) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLIZIZ);
                                sbLIZ2.append("&userId=");
                                sbLIZ2.append(strLJI);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                            if (!TextUtils.isEmpty(str2) && !TextUtils.equals("during_live", "modify_setting")) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(strLIZIZ);
                                sbLIZ3.append("&item_id=");
                                sbLIZ3.append(str2);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            }
                            if (TextUtils.equals("during_live", "modify_setting")) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(strLIZIZ);
                                sbLIZ4.append("&room_id=");
                                sbLIZ4.append(str2);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                            }
                            if (lValueOf != null) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(strLIZIZ);
                                sbLIZ5.append("&click_time=");
                                sbLIZ5.append(lValueOf);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                            }
                            if (!TextUtils.isEmpty(null)) {
                                if (Intrinsics.LJFF(null, "myself")) {
                                    str = "1";
                                } else {
                                    str = "2";
                                }
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append(strLIZIZ);
                                sbLIZ6.append("&promote_by=");
                                sbLIZ6.append(str);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                            }
                            if (Intrinsics.LJFF("modify_setting", "video")) {
                                Intrinsics.LJFF(null, "myself");
                            }
                            if (!TextUtils.isEmpty(null)) {
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append(strLIZIZ);
                                sbLIZ7.append("&page_type=");
                                sbLIZ7.append((String) null);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
                            }
                            if (!TextUtils.isEmpty(null)) {
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append(strLIZIZ);
                                sbLIZ8.append("&panel_source=");
                                sbLIZ8.append((String) null);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
                            }
                            if (!TextUtils.isEmpty(null)) {
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append(strLIZIZ);
                                sbLIZ9.append("&session_id=");
                                sbLIZ9.append((String) null);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
                            }
                            string = C2821017j.LIZ(UriProtector.parse(strLIZIZ), C1697810uHb.LJIILJJIL("enable_prefetch", "enable_pending_js_task")).toString();
                        }
                        SmartRouter.buildRoute(context3, UriProtector.parse(string).buildUpon().appendQueryParameter("type", "change_music").build().toString()).open();
                        IEventCenter iEventCenter2 = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("itemId", C1911640zqU.LIZIZ);
                        iEventCenter2.LIZ("promote_change_music_post", C786410Ut5.J3(jSONObject2));
                    }
                }
            }
        } else {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("retry_scene", String.valueOf(((PromoteReplaceMusicRequest) c19335210kg.l0).getRetryScene()));
            c2344009Gk.LJIIIIZZ("modify_music_id", ((PromoteReplaceMusicRequest) c19335210kg.l0).getReplaceMusicRequest().getEditMusicStruct().getMusicID());
            c2344009Gk.LJIIIIZZ("pre_music_id", ((PromoteReplaceMusicRequest) c19335210kg.l0).getOriginalMusicID());
            c2344009Gk.LJIIIIZZ("item_id", ((PromoteReplaceMusicRequest) c19335210kg.l0).getItemID());
            C20684815ws.LJIILLIIL("Promote_modify_music_request_failed", c2344009Gk.LIZ);
            i = -2;
        }
        Integer numValueOf = Integer.valueOf(i);
        C1C7U.LIZIZ("PromoteReplaceMusicManager@8b4f.postRequest$2");
        return numValueOf;
    }

    public static final Object then$3(C19335210kg c19335210kg, C15O7 c15o7) {
        boolean z;
        C1C7U.LIZ("PraiseDialogHelper@da9c.tryShowIncentiveDialog$1");
        if (!Intrinsics.LJFF(((InterfaceC1875070ytV) c19335210kg.l0).getIgnoreFrequencyControl(), Boolean.TRUE)) {
            C1909230zmb c1909230zmb = C1909230zmb.LIZ;
            Activity activity = (Activity) c19335210kg.l1;
            c1909230zmb.getClass();
            EnumC1909250zmd enumC1909250zmd = EnumC1909250zmd.INCENTIVE;
            if (C1909230zmb.LIZIZ(activity, enumC1909250zmd)) {
                C1909300zmi c1909300zmi = new C1909300zmi(enumC1909250zmd);
                C844470XAv.LIZ.getClass();
                if (TextUtils.equals(String.valueOf(C844470XAv.LIZIZ()), c1909300zmi.LJI)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(enumC1909250zmd);
                    sbLIZ.append(": current version clicked");
                    SettingsManager.LIZLLL().getClass();
                    sbLIZ.append(SettingsManager.LJ("tt_praise_dialog_show_type", 2));
                    C1909270zmf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("PraiseDialogHelper@da9c.tryShowIncentiveDialog$1");
        return boolValueOf;
    }

    public C19335210kg(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
