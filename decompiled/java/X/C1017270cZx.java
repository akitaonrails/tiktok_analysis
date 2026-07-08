package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.slide.ProfileAdWebModel;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService;
import com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageLogger;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.IFeedSharePlayInfoHelperProvider;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0cZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017270cZx implements InterfaceC1022300ci4 {
    public static boolean LJI;
    public Aweme LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1017310ca1());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1017320ca2());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1017330ca3());
    public final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(459));
    public final InterfaceC581520MrO LJFF = ((IMeasurementService) ServiceManager.get().getService(IMeasurementService.class)).LJFF();

    @Override // X.InterfaceC1022300ci4
    public final void LJIJJ() {
    }

    public final ICommerceGlueOutService LJJIIJZLJL() {
        return (ICommerceGlueOutService) this.LIZJ.getValue();
    }

    public final IMainService LJJIIZ() {
        return (IMainService) this.LIZLLL.getValue();
    }

    public final InterfaceC688220Qz6 LJJIIZI() {
        return (InterfaceC688220Qz6) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJJIIJ() {
        IMainService iMainServiceLJJIIZ = LJJIIZ();
        if (iMainServiceLJJIIZ != null) {
            iMainServiceLJJIIZ.clearDelayedPostMessage();
        }
    }

    public static void LJJIJIIJIL(Context context) {
        C0SPE c0spe = new C0SPE(context.hashCode());
        c0spe.LIZJ = "scroll_to_slide";
        C1440005kM.LIZ(new C690450R6l("homepage_hot"));
        C1440005kM.LIZ(c0spe);
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJIIIIZZ(Context context, Aweme aweme) {
        String str;
        HashMap map;
        AwemeRawAd awemeRawAd;
        Integer numValueOf;
        User author;
        AwemeRawAd awemeRawAdLJJIJL;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        User author2;
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL;
        Integer numValueOf2 = null;
        String str2 = "photo";
        if (TextUtils.isEmpty(null)) {
            str = "photo";
        } else {
            str = null;
        }
        C1012040cRW.LIZIZ().LJIIIIZZ = 64;
        C1017290cZz.LIZIZ("click_avatar");
        if (C1019620cdk.LIZIZ(3, aweme) && (iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL()) != null) {
            iCommerceGlueOutServiceLJJIIJZLJL.LJJJJJL(C1019620cdk.LIZJ(aweme));
        }
        if (!C1017070cZd.LL(aweme)) {
            if (C1017070cZd.LLJI(aweme)) {
                ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL2 = LJJIIJZLJL();
                if (iCommerceGlueOutServiceLJJIIJZLJL2 != null) {
                    iCommerceGlueOutServiceLJJIIJZLJL2.LJJJJL(context, aweme, str);
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "click_source", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZJ(str, "refer");
                c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
                c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
                c1022820ciuLIZLLL.LJIIIIZZ();
                return;
            }
            if (!C1017070cZd.LJLJJLL(aweme) || (author2 = aweme.getAuthor()) == null || !author2.isLive() || !C1492170ovv.LIZ() || author2.isBlock()) {
                ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL3 = LJJIIJZLJL();
                if (iCommerceGlueOutServiceLJJIIJZLJL3 != null) {
                    iCommerceGlueOutServiceLJJIIJZLJL3.LJJJJL(context, aweme, str);
                }
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "click_source", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL2.LIZJ(str, "refer");
                c1022820ciuLIZLLL2.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
                c1022820ciuLIZLLL2.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
                c1022820ciuLIZLLL2.LJIIIIZZ();
            }
            if (C1017070cZd.LLF(aweme) || ((aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && awemeRawAd3.liveRoom == 1) || C1017070cZd.LLD(aweme))) {
                ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL4 = LJJIIJZLJL();
                if (iCommerceGlueOutServiceLJJIIJZLJL4 != null) {
                    iCommerceGlueOutServiceLJJIIJZLJL4.LJJIIJ(context, aweme, str);
                    return;
                }
                return;
            }
            if (!C1017070cZd.LJJLIIIJJI(aweme, false) && !C1017070cZd.LJJLIIIJILLIZJL(aweme, false) && !C1017070cZd.LLJJIJIL(aweme, "draw_ad", "photo") && !C1017070cZd.LJJZ(aweme, "draw_ad", "photo") && !C1017070cZd.LJJLIIIJJIZ(aweme) && !C1017070cZd.LJLZ(aweme)) {
                if (AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.getProfileWithWebview() == 1) {
                    ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL5 = LJJIIJZLJL();
                    if (iCommerceGlueOutServiceLJJIIJZLJL5 == null) {
                        return;
                    }
                    iCommerceGlueOutServiceLJJIIJZLJL5.LJJIIJ(context, aweme, "photo");
                    return;
                }
                if (!C1017070cZd.LL(aweme) && C1017070cZd.LLJJI(aweme, "draw_ad", C1017290cZz.LIZ())) {
                    IFullScreenLandingPageLogger iFullScreenLandingPageLogger = (IFullScreenLandingPageLogger) PluggableExtentionKt.pluggableSpi$default(IFullScreenLandingPageLogger.class, false, false, false, 14, null);
                    if (iFullScreenLandingPageLogger == null) {
                        return;
                    }
                    iFullScreenLandingPageLogger.LIZ(aweme, "photo");
                    return;
                }
                if (!AwemeExtKt.isPseudoAd(aweme)) {
                    awemeRawAdLJJIJL = aweme.getAwemeRawAd();
                } else {
                    awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
                }
                C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "otherclick", awemeRawAdLJJIJL);
                c1022820ciuLIZLLL3.LIZJ(str, "refer");
                c1022820ciuLIZLLL3.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
                c1022820ciuLIZLLL3.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
                if (str != null) {
                    str2 = str;
                }
                LJJIJIL(c1022820ciuLIZLLL3, aweme, str2);
                c1022820ciuLIZLLL3.LJII();
                return;
            }
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL6 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL6 == null) {
                return;
            }
            iCommerceGlueOutServiceLJJIIJZLJL6.LJJIIJ(context, aweme, str);
            return;
        }
        if (C1017070cZd.LJIIJ(aweme)) {
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null && C1017180cZo.LJJIJ(awemeRawAd4)) {
                AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
                if (awemeRawAd5 != null && C1017180cZo.LJIIJJI(awemeRawAd5)) {
                    C1022820ciu c1022820ciuLIZLLL4 = C2184171Adz.LIZLLL("draw_ad", "click", aweme.getAwemeRawAd());
                    c1022820ciuLIZLLL4.LIZJ("photo", "refer");
                    LJJIJIL(c1022820ciuLIZLLL4, aweme, "photo");
                    c1022820ciuLIZLLL4.LJII();
                    return;
                }
                C1022820ciu c1022820ciuLIZLLL5 = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL5.LIZJ("photo", "refer");
                LJJIJIL(c1022820ciuLIZLLL5, aweme, "photo");
                c1022820ciuLIZLLL5.LJII();
                return;
            }
            C1022820ciu c1022820ciuLIZLLL6 = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL6.LIZJ(str, "refer");
            c1022820ciuLIZLLL6.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
            c1022820ciuLIZLLL6.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
            if (str != null) {
                str2 = str;
            }
            LJJIJIL(c1022820ciuLIZLLL6, aweme, str2);
            c1022820ciuLIZLLL6.LJII();
            return;
        }
        if (C1017070cZd.LJJJJL(aweme)) {
            if (!C1017070cZd.LJLJJLL(aweme) || (author = aweme.getAuthor()) == null || !author.isLive() || !C1492170ovv.LIZ() || author.isBlock()) {
                if (C1017070cZd.LLLLIIIILLL(aweme)) {
                    map = new HashMap();
                    AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
                    if (awemeRawAd6 != null) {
                        numValueOf = Integer.valueOf(awemeRawAd6.getAdAvatarLinkTagStyle());
                    } else {
                        numValueOf = null;
                    }
                    map.put("photo_link", numValueOf);
                } else {
                    map = null;
                }
                ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL7 = LJJIIJZLJL();
                if (iCommerceGlueOutServiceLJJIIJZLJL7 != null) {
                    iCommerceGlueOutServiceLJJIIJZLJL7.LJJJIL(context, aweme, str, map);
                }
                C1022820ciu c1022820ciuLIZLLL7 = C2184171Adz.LIZLLL("draw_ad", "click_source", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL7.LIZJ(str, "refer");
                c1022820ciuLIZLLL7.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
                c1022820ciuLIZLLL7.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
                if (C1017070cZd.LLLLIIIILLL(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    numValueOf2 = Integer.valueOf(awemeRawAd.getAdAvatarLinkTagStyle());
                }
                c1022820ciuLIZLLL7.LIZIZ(numValueOf2, "photo_link");
                c1022820ciuLIZLLL7.LJIIIIZZ();
            }
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL8 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL8 != null) {
                iCommerceGlueOutServiceLJJIIJZLJL8.LJJIIJ(context, aweme, str);
                return;
            }
            return;
        }
        C1022820ciu c1022820ciuLIZLLL8 = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL8.LIZJ(str, "refer");
        c1022820ciuLIZLLL8.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
        c1022820ciuLIZLLL8.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
        if (str != null) {
            str2 = str;
        }
        LJJIJIL(c1022820ciuLIZLLL8, aweme, str2);
        c1022820ciuLIZLLL8.LJII();
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJIIIZ(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJL;
        AwemeRawAd awemeRawAd;
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL;
        C1017290cZz.LIZIZ("click_name");
        if (!C1017070cZd.LL(aweme)) {
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL2 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL2 != null) {
                iCommerceGlueOutServiceLJJIIJZLJL2.LJJJJL(context, aweme, "name");
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "click_source", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("name", "refer");
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
            c1022820ciuLIZLLL.LJIIIIZZ();
            if (C1017070cZd.LLF(aweme) && (iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL()) != null) {
                iCommerceGlueOutServiceLJJIIJZLJL.LJJJJIZL(context, aweme);
            }
            if (!C1017070cZd.LJJLIIIJJI(aweme, false) && !C1017070cZd.LJJLIIIJILLIZJL(aweme, false) && !C1017070cZd.LLJJIJIL(aweme, "draw_ad", "name") && !C1017070cZd.LJJZ(aweme, "draw_ad", "name") && !C1017070cZd.LJJLIIIJJIZ(aweme) && !C1017070cZd.LJLZ(aweme)) {
                if (AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getProfileWithWebview() == 1) {
                    ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL3 = LJJIIJZLJL();
                    if (iCommerceGlueOutServiceLJJIIJZLJL3 != null) {
                        iCommerceGlueOutServiceLJJIIJZLJL3.LJJIIJ(context, aweme, "name");
                        return;
                    }
                    return;
                }
                if (!C1017070cZd.LL(aweme) && C1017070cZd.LLJJI(aweme, "draw_ad", C1017290cZz.LIZ())) {
                    IFullScreenLandingPageLogger iFullScreenLandingPageLogger = (IFullScreenLandingPageLogger) PluggableExtentionKt.pluggableSpi$default(IFullScreenLandingPageLogger.class, false, false, false, 14, null);
                    if (iFullScreenLandingPageLogger == null) {
                        return;
                    }
                    iFullScreenLandingPageLogger.LIZ(aweme, "name");
                    return;
                }
                if (!AwemeExtKt.isPseudoAd(aweme)) {
                    awemeRawAdLJJIJL = aweme.getAwemeRawAd();
                } else {
                    awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
                }
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "otherclick", awemeRawAdLJJIJL);
                c1022820ciuLIZLLL2.LIZJ("name", "refer");
                c1022820ciuLIZLLL2.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
                c1022820ciuLIZLLL2.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
                LJJIJIL(c1022820ciuLIZLLL2, aweme, "name");
                c1022820ciuLIZLLL2.LJII();
                return;
            }
            C1012040cRW.LIZIZ().LJIIIIZZ = 39;
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL4 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL4 == null) {
                return;
            }
            iCommerceGlueOutServiceLJJIIJZLJL4.LJJIIJ(context, aweme, "name");
            return;
        }
        if (C1017070cZd.LJIIJ(aweme)) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && C1017180cZo.LJJIJ(awemeRawAd2)) {
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null && C1017180cZo.LJIIJJI(awemeRawAd3)) {
                    C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "click", aweme.getAwemeRawAd());
                    c1022820ciuLIZLLL3.LIZJ("name", "refer");
                    LJJIJIL(c1022820ciuLIZLLL3, aweme, "name");
                    c1022820ciuLIZLLL3.LJII();
                    return;
                }
                C1022820ciu c1022820ciuLIZLLL4 = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL4.LIZJ("name", "refer");
                LJJIJIL(c1022820ciuLIZLLL4, aweme, "name");
                c1022820ciuLIZLLL4.LJII();
                return;
            }
            C1022820ciu c1022820ciuLIZLLL5 = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL5.LIZJ("name", "refer");
            c1022820ciuLIZLLL5.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
            c1022820ciuLIZLLL5.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
            LJJIJIL(c1022820ciuLIZLLL5, aweme, "name");
            c1022820ciuLIZLLL5.LJII();
            return;
        }
        if (C1017070cZd.LJJJJL(aweme)) {
            C1012040cRW.LIZIZ().LJIIIIZZ = 39;
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL5 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL5 != null) {
                iCommerceGlueOutServiceLJJIIJZLJL5.LJJJJL(context, aweme, "name");
            }
            C1022820ciu c1022820ciuLIZLLL6 = C2184171Adz.LIZLLL("draw_ad", "click_source", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL6.LIZJ("name", "refer");
            c1022820ciuLIZLLL6.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
            c1022820ciuLIZLLL6.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
            c1022820ciuLIZLLL6.LJIIIIZZ();
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL6 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL6 == null) {
                return;
            }
            iCommerceGlueOutServiceLJJIIJZLJL6.LJJIIJ(context, aweme, "name");
            return;
        }
        C1022820ciu c1022820ciuLIZLLL7 = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL7.LIZJ("name", "refer");
        c1022820ciuLIZLLL7.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
        c1022820ciuLIZLLL7.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
        LJJIJIL(c1022820ciuLIZLLL7, aweme, "name");
        c1022820ciuLIZLLL7.LJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03ef  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // X.InterfaceC1022300ci4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.content.Context r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017270cZx.LJIIJJI(android.content.Context, java.lang.String):void");
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJIIL(Context context, Aweme aweme) {
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL != null) {
            iCommerceGlueOutServiceLJJIIJZLJL.LJJIIZI(context, aweme);
        }
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJIILIIL(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        String str;
        if (C583160Mu2.LJFF) {
            C583160Mu2.LJ = true;
        }
        if (!C1017070cZd.LL(aweme)) {
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL != null) {
                if (C1017070cZd.LJLJJLL(aweme)) {
                    str = "video";
                } else {
                    str = "";
                }
                iCommerceGlueOutServiceLJJIIJZLJL.LJJIJIIJI(context, aweme, str);
            }
            if (!C1017070cZd.LLJJIJIL(aweme, "draw_ad", "slide") && !C1017070cZd.LJJZ(aweme, "draw_ad", "slide")) {
                if (AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.getProfileWithWebview() == 1) {
                    ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL2 = LJJIIJZLJL();
                    if (iCommerceGlueOutServiceLJJIIJZLJL2 != null) {
                        iCommerceGlueOutServiceLJJIIJZLJL2.LJJIIJ(context, aweme, "slide");
                        return;
                    }
                    return;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
                C1022820ciu c1022820ciuLJJIJIL = C1017070cZd.LJJIJIL(aweme, "draw_ad", "otherclick");
                if (c1022820ciuLJJIJIL != null) {
                    c1022820ciuLIZLLL = c1022820ciuLJJIJIL;
                }
                c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
                c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
                c1022820ciuLIZLLL.LIZJ("slide", "refer");
                LJJIJIL(c1022820ciuLIZLLL, aweme, "slide");
                c1022820ciuLIZLLL.LJII();
                return;
            }
            if (C1017530caN.LIZ(context, aweme) && C1017070cZd.LJJJJL(aweme)) {
                if (!C1017530caN.LJI) {
                    return;
                }
                C1017530caN.LIZ.getClass();
                C1017530caN.LJ(aweme, "STATUS_ON_PAGE_SELECTED");
                C1017530caN.LJI = false;
            }
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL3 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL3 == null) {
                return;
            }
            iCommerceGlueOutServiceLJJIIJZLJL3.LJJIIJ(context, aweme, "slide");
            return;
        }
        if (C1017070cZd.LJIIJ(aweme)) {
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null && C1017180cZo.LJJIJ(awemeRawAd3)) {
                AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                if (awemeRawAd4 != null && C1017180cZo.LJIIJJI(awemeRawAd4)) {
                    ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL4 = LJJIIJZLJL();
                    if (iCommerceGlueOutServiceLJJIIJZLJL4 != null) {
                        iCommerceGlueOutServiceLJJIIJZLJL4.LJIJ(context, aweme);
                    }
                    IMainService iMainServiceLJJIIZ = LJJIIZ();
                    if (iMainServiceLJJIIZ == null) {
                        return;
                    }
                    iMainServiceLJJIIZ.logFeedRawAdClick(context, aweme, "slide");
                    return;
                }
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL2.LIZJ("slide", "refer");
                LJJIJIL(c1022820ciuLIZLLL2, aweme, "slide");
                c1022820ciuLIZLLL2.LJII();
                return;
            }
            C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL3.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
            c1022820ciuLIZLLL3.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
            c1022820ciuLIZLLL3.LIZJ("slide", "refer");
            LJJIJIL(c1022820ciuLIZLLL3, aweme, "slide");
            c1022820ciuLIZLLL3.LJII();
            return;
        }
        IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
        C1026350cob.LJ("homepage_hot");
        if (iAdWebUtils.bv(aweme, "draw_ad", "slide", false)) {
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL5 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL5 != null) {
                iCommerceGlueOutServiceLJJIIJZLJL5.LJIJ(context, aweme);
            }
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL6 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL6 == null) {
                return;
            }
            iCommerceGlueOutServiceLJJIIJZLJL6.LJJIIJ(context, aweme, "slide");
            return;
        }
        if (C1017070cZd.LJLJL(aweme)) {
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.allowJumpToPlayStore()) {
                ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL7 = LJJIIJZLJL();
                if (iCommerceGlueOutServiceLJJIIJZLJL7 != null) {
                    iCommerceGlueOutServiceLJJIIJZLJL7.LJIJ(context, aweme);
                }
                ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL8 = LJJIIJZLJL();
                if (iCommerceGlueOutServiceLJJIIJZLJL8 == null) {
                    return;
                }
                iCommerceGlueOutServiceLJJIIJZLJL8.LJJIIJ(context, aweme, "slide");
                return;
            }
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL9 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL9 == null) {
                return;
            }
            iCommerceGlueOutServiceLJJIIJZLJL9.LJIJ(context, aweme);
            return;
        }
        if (C1017070cZd.LLIIIJ(aweme) && C0BJ0.LIZ()) {
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL10 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL10 != null) {
                iCommerceGlueOutServiceLJJIIJZLJL10.LJIJ(context, aweme);
            }
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL11 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL11 == null) {
                return;
            }
            iCommerceGlueOutServiceLJJIIJZLJL11.LJJIIJ(context, aweme, "slide");
            return;
        }
        if (C1017070cZd.LJJJJL(aweme)) {
            if (C1017530caN.LIZ(context, aweme)) {
                if (!C1017530caN.LJI) {
                    return;
                }
                C1017530caN.LIZ.getClass();
                C1017530caN.LJ(aweme, "STATUS_ON_PAGE_SELECTED");
                C1017530caN.LJI = false;
            }
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL12 = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL12 != null) {
                iCommerceGlueOutServiceLJJIIJZLJL12.LJIJ(context, aweme);
            }
            IMainService iMainServiceLJJIIZ2 = LJJIIZ();
            if (iMainServiceLJJIIZ2 == null) {
                return;
            }
            iMainServiceLJJIIZ2.logFeedRawAdClick(context, aweme, "slide");
            return;
        }
        C1022820ciu c1022820ciuLIZLLL4 = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL4.LIZJ("slide", "refer");
        c1022820ciuLIZLLL4.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
        c1022820ciuLIZLLL4.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
        LJJIJIL(c1022820ciuLIZLLL4, aweme, "slide");
        c1022820ciuLIZLLL4.LJII();
    }

    public final void LJJIJIIJI(Context context, Aweme aweme) {
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL != null) {
            iCommerceGlueOutServiceLJJIIJZLJL.LJIJ(context, aweme);
        }
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL2 = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL2 != null) {
            iCommerceGlueOutServiceLJJIIJZLJL2.LJJIIJ(context, aweme, "slide");
        }
    }

    public static void LJJIJIL(C1022820ciu c1022820ciu, Aweme aweme, String str) {
        String productId;
        String str2;
        int size;
        List<PhotoModeImageUrlModel> imageList;
        if (C1017070cZd.LLIIL(aweme)) {
            C1010280cOg.LIZ.getClass();
            int i = C1010280cOg.LJI;
            IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
            if (C1009740cNo.LJIIL(aweme)) {
                str2 = "page_location";
            } else {
                str2 = "image_location";
            }
            c1022820ciu.LIZIZ(Integer.valueOf(i + 1), str2);
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            c1022820ciu.LIZIZ(Integer.valueOf(size), "image_cnt");
            c1022820ciu.LIZIZ(C1010280cOg.LJII, "enter_method");
            c1022820ciu.LIZIZ(Long.valueOf(System.currentTimeMillis() - C1010280cOg.LJIIJ), "first_slide_duration");
            c1022820ciu.LIZIZ(iAdPhotoModeService.LJIJJ(i, aweme), "image_show_count");
            Object obj = C1010280cOg.LJIIIIZZ;
            if (obj != null) {
                c1022820ciu.LIZIZ(obj, "slide_area");
            }
            c1022820ciu.LIZ(iAdPhotoModeService.LIZLLL(aweme));
            if (C1017070cZd.LJI(aweme)) {
                c1022820ciu.LIZ(iAdPhotoModeService.LJJIIJ(aweme));
            }
        }
        if ((TextUtils.equals(str, "photo") || TextUtils.equals(str, "name")) && (productId = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).getProductId()) != null && C123100dR.LIZ(productId)) {
            c1022820ciu.LIZIZ(productId, "product_id");
        }
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJ(Context context, Aweme aweme, int i) {
        if (AwemeExtKt.isPseudoAd(aweme) && !C1017070cZd.LJIIL(aweme)) {
            return;
        }
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL != null) {
            iCommerceGlueOutServiceLJJIIJZLJL.LJIIIZ(aweme);
        }
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL2 = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL2 != null) {
            iCommerceGlueOutServiceLJJIIJZLJL2.LJJ(context, aweme);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x067c  */
    @Override // X.InterfaceC1022300ci4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(android.content.Context r23, com.ss.android.ugc.aweme.feed.model.Aweme r24, int r25) {
        /*
            Method dump skipped, instruction units count: 2380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017270cZx.LJFF(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJIIJ(Context context, Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAdLJJIJL;
        VideoUrlModel playAddr;
        AwemeRawAd awemeRawAdLJJIJL2;
        VideoUrlModel playAddr2;
        String originUri = null;
        if (z) {
            ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL();
            if (iCommerceGlueOutServiceLJJIIJZLJL != null) {
                iCommerceGlueOutServiceLJJIIJZLJL.LJ(context, aweme);
            }
            if (!AwemeExtKt.isPseudoAd(aweme)) {
                awemeRawAdLJJIJL2 = aweme.getAwemeRawAd();
            } else {
                awemeRawAdLJJIJL2 = C1017070cZd.LJJIJL(aweme);
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "like", awemeRawAdLJJIJL2);
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
            Video video = aweme.getVideo();
            if (video != null && (playAddr2 = video.getPlayAddr()) != null) {
                originUri = playAddr2.getOriginUri();
            }
            c1022820ciuLIZLLL.LIZIZ(originUri, "bsh_video_id");
            c1022820ciuLIZLLL.LJIIIIZZ();
            return;
        }
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL2 = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL2 != null) {
            iCommerceGlueOutServiceLJJIIJZLJL2.LJFF(context, aweme);
        }
        if (!AwemeExtKt.isPseudoAd(aweme)) {
            awemeRawAdLJJIJL = aweme.getAwemeRawAd();
        } else {
            awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
        }
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "like_cancel", awemeRawAdLJJIJL);
        c1022820ciuLIZLLL2.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
        c1022820ciuLIZLLL2.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
        Video video2 = aweme.getVideo();
        if (video2 != null && (playAddr = video2.getPlayAddr()) != null) {
            originUri = playAddr.getOriginUri();
        }
        c1022820ciuLIZLLL2.LIZIZ(originUri, "bsh_video_id");
        c1022820ciuLIZLLL2.LJIIIIZZ();
    }

    @Override // X.InterfaceC1022300ci4
    public final boolean LJIILJJIL(Aweme aweme, C19EG c19eg, float f) {
        int i;
        IAdWebUtils iAdWebUtils;
        if (!C1017530caN.LIZ(c19eg, aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if ((awemeRawAd != null && awemeRawAd.isOpenSystemBrowser() && ((iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null)) == null || !iAdWebUtils.Wu(aweme.getAwemeRawAd()))) || !C1017070cZd.LJJJJL(aweme)) {
            return false;
        }
        float fCeil = (float) Math.ceil(f * 100);
        C1017530caN c1017530caN = C1017530caN.LIZ;
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        c1017530caN.getClass();
        if (C1017530caN.LIZJ(awemeRawAd2)) {
            i = ((ProfileAdWebModel) C1017350ca5.LIZIZ.getValue()).trackLynxProcess;
        } else {
            i = ((ProfileAdWebModel) C1017350ca5.LIZIZ.getValue()).trackWebProcess;
        }
        if (fCeil < i || C1017530caN.LIZLLL(aweme)) {
            return false;
        }
        C1017530caN.LJ(aweme, "STATUS_ON_PAGE_SCROLL");
        return true;
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJIJI(Context context, Aweme aweme, int i) {
        AwemeRawAd awemeRawAdLJJIJL;
        if (AwemeExtKt.isPseudoAd(aweme) && !C1017070cZd.LJIIL(aweme)) {
            return;
        }
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL != null) {
            iCommerceGlueOutServiceLJJIIJZLJL.LJIIIZ(aweme);
        }
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL2 = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL2 != null) {
            iCommerceGlueOutServiceLJJIIJZLJL2.LJJ(context, aweme);
        }
        if (LJI) {
            if (!AwemeExtKt.isPseudoAd(aweme)) {
                awemeRawAdLJJIJL = aweme.getAwemeRawAd();
            } else {
                awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "first_play", awemeRawAdLJJIJL);
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
            c1022820ciuLIZLLL.LJII();
            LJI = false;
        }
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJIL(Aweme aweme, Context context, EnumC1035330d35 enumC1035330d35) {
        ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL();
        if (iTalentAdRevenueShareServiceLJIIL != null && enumC1035330d35 != null && iTalentAdRevenueShareServiceLJIIL.LJIIIZ() && AwemeExtKt.getMonetizationData(aweme) != null) {
            AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData(aweme);
            if (monetizationData != null) {
                iTalentAdRevenueShareServiceLJIIL.LIZIZ(monetizationData, enumC1035330d35.getAREA());
                return;
            }
            return;
        }
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL != null) {
            iCommerceGlueOutServiceLJJIIJZLJL.LJJJLIIL(context, aweme);
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "music_click", AwemeExtKt.getMonetizationData(aweme));
        c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
        c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
        c1022820ciuLIZLLL.LIZ(EngagementTraceImpl.LIZIZ().LIZ());
        c1022820ciuLIZLLL.LJIIIIZZ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    @Override // X.InterfaceC1022300ci4
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIFFI(android.content.Context r19, com.ss.android.ugc.aweme.feed.model.Aweme r20, int r21) {
        /*
            Method dump skipped, instruction units count: 1654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017270cZx.LJJIFFI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJII(Aweme aweme, Context context, boolean z, boolean z2) {
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
        boolean zIsReportTopviewShown;
        String creativeIdStr;
        if ((C581720Mri.LIZ(aweme) || C1017070cZd.LJLJLJ(aweme)) && z) {
            return;
        }
        this.LIZ = aweme;
        IMainService iMainServiceLJJIIZ = LJJIIZ();
        InterfaceC988260bpA interfaceC988260bpALIZLLL = null;
        if (iMainServiceLJJIIZ != null) {
            String aid = aweme.getAid();
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                creativeIdStr = awemeRawAd.getCreativeIdStr();
            } else {
                creativeIdStr = null;
            }
            iMainServiceLJJIIZ.saveShowAd(aid, creativeIdStr);
        }
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL != null) {
            iCommerceGlueOutServiceLJJIIJZLJL.LJI(context, aweme);
        }
        if (!AwemeSaaSExtKt.isLive(aweme)) {
            if (C1017070cZd.LLIZLLLIL(aweme) && !C1017070cZd.LLJILLL(aweme)) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    zIsReportTopviewShown = awemeRawAd2.isReportTopviewShown();
                } else {
                    zIsReportTopviewShown = false;
                }
                if (((Boolean) C0A3E.LIZ.getValue()).booleanValue() && zIsReportTopviewShown) {
                    return;
                } else {
                    this.LJFF.LIZIZ(aweme, "top_view", new InterfaceC587270N1p() { // from class: X.0N20
                        @Override // X.InterfaceC587270N1p
                        public final String getValue() {
                            return "top_view";
                        }
                    }, new AwS382S0200000_16(this, context, 86));
                }
            }
            LJI = true;
        }
        C1012040cRW c1012040cRWLIZ = ((IFeedSharePlayInfoHelperProvider) ServiceManager.get().getService(IFeedSharePlayInfoHelperProvider.class)).LIZ();
        if (C1010120cOQ.LJIJI(aweme) && C292430BdB.LIZ() && (interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL()) != null) {
            interfaceC988260bpALIZLLL = interfaceC657510PqfLIZLLL.LIZLLL(aweme);
        }
        if (z2) {
            ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LIZJ(true);
            if (C292430BdB.LIZ()) {
                if (interfaceC988260bpALIZLLL != null) {
                    interfaceC988260bpALIZLLL.zG(new AwS260S0300000_16(this, context, aweme, 24));
                    return;
                }
                return;
            }
            if (!CommerceSearchAdConfigSetting.LIZ().enableDedupShowAndOmsdk && !c1012040cRWLIZ.LJIIJ && !C1017070cZd.LLILL(aweme, "general_search")) {
                ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL2 = LJJIIJZLJL();
                if (iCommerceGlueOutServiceLJJIIJZLJL2 != null) {
                    iCommerceGlueOutServiceLJJIIJZLJL2.LJJIL(context, aweme);
                }
                c1012040cRWLIZ.LJIIJ = true;
            }
            LJJIIZI().LJIIJ(aweme.getAwemeRawAd(), true, ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LJI());
            ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LIZIZ();
            return;
        }
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL3 = LJJIIJZLJL();
        if (iCommerceGlueOutServiceLJJIIJZLJL3 != null) {
            iCommerceGlueOutServiceLJJIIJZLJL3.LJJIJ(aweme);
        }
        if (!C1010120cOQ.LJIJI(aweme)) {
            return;
        }
        ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LIZJ(false);
        if (C292430BdB.LIZ()) {
            if (interfaceC988260bpALIZLLL == null) {
                return;
            }
            interfaceC988260bpALIZLLL.Uh2();
            return;
        }
        c1012040cRWLIZ.LJIIJ = true;
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJJ(int i, long j, Context context, Aweme aweme) {
        ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL;
        if ((!AwemeExtKt.isPseudoAd(aweme) || C1017070cZd.LJIIL(aweme)) && (iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL()) != null) {
            iCommerceGlueOutServiceLJJIIJZLJL.LJJIJIL(i, j, aweme);
        }
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJI(Aweme aweme, Context context, String str, C581980Ms8 c581980Ms8, int i) {
        if (C1017070cZd.LLIIL(aweme)) {
            return;
        }
        LJJIJ(context, aweme, str, c581980Ms8, i, null);
    }

    public final void LJJIJ(Context context, Aweme aweme, String str, C581980Ms8 c581980Ms8, int i, String str2) {
        if (TextUtils.equals(str, aweme.getAid())) {
            if (AwemeExtKt.isAdTraffic(aweme) || C1017070cZd.LJIIL(aweme)) {
                ((IMeasurementService) ServiceManager.get().getService(IMeasurementService.class)).LIZ();
                if (C586770Mzr.LIZ(str)) {
                    ICommerceGlueOutService iCommerceGlueOutServiceLJJIIJZLJL = LJJIIJZLJL();
                    if (iCommerceGlueOutServiceLJJIIJZLJL != null) {
                        iCommerceGlueOutServiceLJJIIJZLJL.LJJIJIIJIL(context, aweme, c581980Ms8, i);
                    }
                    if (str2 != null && str2.length() != 0) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJ(c581980Ms8, "real_time");
                        c2344009Gk.LJIIIIZZ("predict_time", str2);
                        C20684815ws.LJIILLIIL("ad_duration_prediction", c2344009Gk.LIZ);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1022300ci4
    public final void LJJI(Aweme aweme, Context context, Aweme aweme2, String str, C581980Ms8 c581980Ms8, int i, String str2) {
        if (str == null || aweme2 == null) {
            return;
        }
        if ((aweme != null && TextUtils.equals(aweme2.getAid(), aweme.getAid())) || C1017070cZd.LLIIL(aweme2)) {
            return;
        }
        LJJIJ(context, aweme2, str, c581980Ms8, i, str2);
    }
}
