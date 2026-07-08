package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: renamed from: X.0cmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025240cmo extends C09AY implements Function0<SparseArray<InterfaceC988500bpY>> {
    public C1025240cmo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SparseArray<InterfaceC988500bpY> invoke() {
        SparseArray<InterfaceC988500bpY> sparseArray = new SparseArray<>();
        sparseArray.put(4, new InterfaceC988510bpZ() { // from class: X.0cfP
            @Override // X.InterfaceC988510bpZ
            public final void LIZJ(AwemeRawAd awemeRawAd) {
                C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                UrlModel playTrackUrlList = awemeRawAd.getPlayTrackUrlList();
                Long creativeId = awemeRawAd.getCreativeId();
                String logExtra = awemeRawAd.getLogExtra();
                new AwS630S0100000_16(awemeRawAd, 1);
                c2201701BEy.getClass();
                C2201701BEy.LIZ("play", playTrackUrlList, creativeId, logExtra);
            }

            @Override // X.InterfaceC988510bpZ
            public final void LJIIL(Context context, Aweme aweme) {
                if (context != null && aweme.getActivityPendant() != null) {
                    CommerceActivityStruct activityPendant = aweme.getActivityPendant();
                    if ((!TextUtils.isEmpty(activityPendant.jumpOpenUrl) && AbstractC1025070cmX.LJIILJJIL(context, activityPendant.jumpOpenUrl, false)) || TextUtils.isEmpty(activityPendant.jumpWebUrl)) {
                        return;
                    }
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        C1028050crL.LIZIZ(context, activityPendant.jumpWebUrl, activityPendant.title, false, null, C1025130cmd.LIZ(awemeRawAd), new C1028060crM(awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), awemeRawAd.getDownloadUrl(), awemeRawAd.getPackageName(), awemeRawAd.getAppName(), awemeRawAd.getType()), 0);
                    } else {
                        C1028050crL.LIZIZ(context, activityPendant.jumpWebUrl, activityPendant.title, false, null, false, null, 0);
                    }
                }
            }

            @Override // X.InterfaceC988510bpZ
            public final boolean LJJIIZ(Context context, Aweme aweme) {
                boolean zLIZ;
                if (context == null || aweme == null || aweme.getSpecialSticker() == null) {
                    return false;
                }
                String openUrl = aweme.getSpecialSticker().getOpenUrl();
                if (!TextUtils.isEmpty(openUrl)) {
                    return AbstractC1025070cmX.LJIILJJIL(context, openUrl, false);
                }
                String linkUrl = aweme.getSpecialSticker().getLinkUrl();
                if (AwemeExtKt.isAdTraffic(aweme)) {
                    zLIZ = C1025130cmd.LIZ(aweme.getAwemeRawAd());
                } else {
                    zLIZ = true;
                }
                return C1028050crL.LIZIZ(context, linkUrl, aweme.getSpecialSticker().getTitle(), false, null, zLIZ, null, 0);
            }

            @Override // X.InterfaceC988510bpZ
            public final boolean LIZ(Context context, Aweme aweme, int i, InterfaceC1021920chS interfaceC1021920chS) {
                return C1021860chM.LJJJI(context, aweme, 9, C1017140cZk.LIZ);
            }
        });
        sparseArray.put(5, new AdCommentDependImpl());
        sparseArray.put(17, new InterfaceC1000280c8Y() { // from class: X.0cmj
            @Override // X.InterfaceC1000280c8Y
            public final C1020280ceo LJJIIJ() {
                return new C1020280ceo();
            }

            @Override // X.InterfaceC1000280c8Y
            public final boolean LJIIIIZZ(Aweme aweme) {
                if (aweme == null || !C1017070cZd.LLILLJJLI(aweme)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1000280c8Y
            public final void LJIIJJI(Context context) {
                C730040SkM.LIZIZ(context, "click_ad_web");
            }

            @Override // X.InterfaceC1000280c8Y
            public final String LJJI(Context context, Aweme aweme) {
                return C1016550cYn.LIZIZ(context, aweme, true);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC1000280c8Y
            public final boolean LJJIFFI(Context context, Aweme aweme) {
                String type;
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null || (type = awemeRawAd.getType()) == null) {
                    return false;
                }
                switch (type.hashCode()) {
                    case -1434340858:
                        if (!type.equals("paid_content")) {
                            return false;
                        }
                        return C1021860chM.LJJIJL(context, aweme, -1);
                    case 96801:
                        if (!type.equals("app")) {
                            return false;
                        }
                        C1021860chM.LJJIJIL(context, aweme, -1, null);
                        return true;
                    case 106642798:
                        if (!type.equals("phone")) {
                            return false;
                        }
                        return AbstractC1025070cmX.LJFF(context, aweme, -1);
                    case 954925063:
                        if (!type.equals("message")) {
                            return false;
                        }
                        return AbstractC1025070cmX.LJJIJ(-1, context, aweme, true);
                    case 957829685:
                        if (!type.equals("counsel")) {
                            return false;
                        }
                        return AbstractC1025070cmX.LJ(context, aweme, -1);
                    default:
                        return false;
                }
            }

            @Override // X.InterfaceC1000280c8Y
            public final void LJIILJJIL(AwemeRawAd awemeRawAd, boolean z, String str) {
                C1024890cmF.LIZIZ(awemeRawAd, z, false, str, true);
            }

            @Override // X.InterfaceC1000280c8Y
            public final void LJIJJ(Context context, Bundle bundle, Aweme aweme) {
                String str;
                C1027640cqg.LIZ(context, bundle, aweme);
                C1027640cqg.LIZIZ(context, bundle, aweme);
                if (context != null && aweme != null && aweme.getAwemeRawAd() != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd.getNonNativeClick() == 0) {
                        C786410Ut5.LJJJI("bundle_native_site_ad_info", awemeRawAd.getNativeSiteAdInfo(), bundle);
                        if (awemeRawAd.getNativeSiteCustomData() != null) {
                            C786410Ut5.LJJJI("bundle_native_site_custom_data", awemeRawAd.getNativeSiteCustomData(), bundle);
                        }
                        if (C1029500ctg.LIZIZ.getAdLynxLandPageUtil().LIZLLL(awemeRawAd)) {
                            bundle.putLong("bundle_real_ad_id", awemeRawAd.getAdId().longValue());
                            C786410Ut5.LJJJI("bundle_render_type", awemeRawAd.getNativeSiteConfig().renderType, bundle);
                            C786410Ut5.LJJJI("bundle_lynx_scheme", awemeRawAd.getNativeSiteConfig().lynxScheme, bundle);
                            bundle.putInt("bundle_lynx_landing_style", awemeRawAd.getNativeSiteConfig().lynxLandingStyle);
                            if (aweme.getVideo() != null && aweme.getVideo().getOriginCover() != null && !C086I.LIZIZ(aweme.getVideo().getOriginCover().getUrlList())) {
                                C786410Ut5.LJJJI("bundle_full_screen_bg_image", (String) ListProtector.get(aweme.getVideo().getOriginCover().getUrlList(), 0), bundle);
                            }
                            List<String> list = awemeRawAd.getNativeSiteConfig().geckoChannel;
                            if (!C086I.LIZIZ(list)) {
                                str = (String) ListProtector.get(list, 0);
                            } else {
                                str = "";
                            }
                            C786410Ut5.LJJJI("lynx_channel_name", str, bundle);
                            if (awemeRawAd.getNativeSiteConfig().secondPageGeckoChannel != null) {
                                C786410Ut5.LJJJIL(bundle, "bundle_second_page_gecko_channels", (ArrayList) awemeRawAd.getNativeSiteConfig().secondPageGeckoChannel);
                            }
                            C786410Ut5.LJJJI("bundle_native_site_app_data", awemeRawAd.getAppData(), bundle);
                        }
                    }
                }
                C1027640cqg.LIZLLL(context, bundle, aweme);
                C1027640cqg.LIZJ(context, bundle);
            }

            @Override // X.InterfaceC1000280c8Y
            public final boolean LJJIII(Context context, Aweme aweme, String str) {
                return C1024900cmG.LJII(context, -1, str, aweme, false, false);
            }

            @Override // X.InterfaceC1000280c8Y
            public final C1029690ctz LJJIIJZLJL(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str, AbstractC1024610cln abstractC1024610cln) {
                return new C1029690ctz(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, str, abstractC1024610cln);
            }

            @Override // X.InterfaceC1000280c8Y
            public final boolean LIZ(Context context, Aweme aweme, int i, InterfaceC1021920chS interfaceC1021920chS) {
                return C1021860chM.LJJJI(context, aweme, 48, C1028670csL.LIZ);
            }

            @Override // X.InterfaceC1000280c8Y
            public final void LJIIIZ(Context context, Aweme aweme, int i, InterfaceC1021920chS interfaceC1021920chS) {
                C1021860chM.LJJIJIL(context, aweme, i, interfaceC1021920chS);
            }
        });
        sparseArray.put(19, new InterfaceC1025280cms() { // from class: X.0cmq
            @Override // X.InterfaceC1025280cms
            public final boolean LIZ(Context context, Aweme aweme, int i, InterfaceC1021920chS interfaceC1021920chS) {
                return C1021860chM.LJJJI(context, aweme, i, C2261001Dec.LIZ);
            }
        });
        return sparseArray;
    }
}
