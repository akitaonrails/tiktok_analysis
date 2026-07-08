package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ComponentData;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999700c7c implements InterfaceC1000310c8b {
    public static WeakReference<Context> LIZJ;
    public static final C999700c7c LIZ = new C999700c7c();
    public static final ConcurrentHashMap<String, C999790c7l> LIZIZ = new ConcurrentHashMap<>();
    public static final String LIZLLL = "feed_lynx_product_banner_preload_cache_error";
    public static final int LJ = 6;
    public static final int LJFF = 4;

    @Override // X.InterfaceC1000310c8b
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIIJ() {
        return LJIJJ().size();
    }

    @Override // X.InterfaceC1000310c8b
    public final String LJIILIIL() {
        return LIZLLL;
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIILJJIL() {
        return LJFF;
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIJI() {
        return LJ;
    }

    @Override // X.InterfaceC1000310c8b
    public final ConcurrentHashMap<String, C999790c7l> LJIJJ() {
        return LIZIZ;
    }

    @Override // X.InterfaceC1000310c8b
    public final WeakReference<Context> LJIL() {
        return LIZJ;
    }

    @Override // X.InterfaceC1000310c8b
    public final void releaseAll() {
        C1000300c8a.LJ(this);
    }

    @Override // X.InterfaceC1000310c8b
    public final AbstractC999780c7k LIZ(String str) {
        return C1000300c8a.LIZIZ(this, str);
    }

    public final void LIZIZ(Context context) {
        C1000300c8a.LIZ(this, context);
        C622680Oba.LIZJ(this);
    }

    @Override // X.InterfaceC1000310c8b
    public final boolean LJIIJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getLiveAdCardModel() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1000310c8b, X.InterfaceC990700bt6
    public final void LJIIZILJ(String str) {
        C1000300c8a.LJFF(this, str);
    }

    @Override // X.InterfaceC990700bt6
    public final void LJIJ(Aweme aweme) {
        C1000300c8a.LIZLLL(this, aweme);
    }

    @Override // X.InterfaceC1000310c8b
    public final void LJIJJLI(WeakReference<Context> weakReference) {
        LIZJ = weakReference;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(C997410c3v c997410c3v) {
        int iHashCode;
        int i;
        for (C999790c7l c999790c7l : LIZIZ.values()) {
            C999730c7f c999730c7f = c999790c7l.LJIIIIZZ;
            if (c999730c7f != null) {
                int i2 = c997410c3v.LIZIZ;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c999730c7f.LIZ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    iHashCode = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (i2 == iHashCode) {
                    if (c997410c3v.LIZ == 1) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    c999790c7l.LIZLLL(i);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1000310c8b
    public final void LJIILL(Context context, Aweme aweme) {
        LiveAdCardModel liveAdCardModel;
        ComponentData componentData;
        CardStruct cardStruct;
        String cardUrl;
        Integer numValueOf;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        User user;
        String str;
        String uniqueId;
        Number numberValueOf;
        UrlModel avatarMedium;
        List<String> urlList;
        String strJ3;
        String string;
        String string2;
        String str2;
        List<String> urlList2;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
        C999790c7l c999790c7l = new C999790c7l();
        String nativeSiteCustomData = null;
        c999790c7l.LIZJ = new SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB(context, null == true ? 1 : 0, 62);
        C999730c7f c999730c7f = new C999730c7f(C988590bph.LIZ(), c999790c7l);
        c999790c7l.LJIIIIZZ = c999730c7f;
        c999730c7f.LIZIZ();
        ConcurrentHashMap<String, C999790c7l> concurrentHashMap = LIZIZ;
        C999790c7l c999790c7l2 = concurrentHashMap.get(aweme.getAid());
        if (c999790c7l2 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c999790c7l2.LIZJ) != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = c999790c7l2.LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3);
            }
            c999790c7l2.LIZLLL = null;
        }
        concurrentHashMap.put(aweme.getAid(), c999790c7l);
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (liveAdCardModel = awemeRawAd.getLiveAdCardModel()) != null && (componentData = liveAdCardModel.getComponentData()) != null && (cardStruct = componentData.cardInfo) != null && (cardUrl = cardStruct.getCardUrl()) != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(cardUrl).buildUpon();
            n nVar = new n();
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            String str3 = "";
            if (awemeRawAd2 != null) {
                Long adId = awemeRawAd2.getAdId();
                if (adId != null) {
                    string = adId.toString();
                } else {
                    string = null;
                }
                nVar.LJJIIJ("adId", string);
                nVar.LJJIIJ("creativeId", awemeRawAd2.getCreativeIdStr());
                nVar.LJJIIJ("logExtra", awemeRawAd2.getLogExtra());
                Long groupId = awemeRawAd2.getGroupId();
                if (groupId != null) {
                    string2 = groupId.toString();
                } else {
                    string2 = null;
                }
                nVar.LJJIIJ("groupId", string2);
                UrlModel clickTrackUrlList = awemeRawAd2.getClickTrackUrlList();
                if (clickTrackUrlList != null && (urlList2 = clickTrackUrlList.getUrlList()) != null && !urlList2.isEmpty()) {
                    h hVar = new h();
                    Iterator<String> it2 = urlList2.iterator();
                    while (it2.hasNext()) {
                        hVar.LJJIII(it2.next());
                    }
                    nVar.LJJIFFI("clickTrackUrlList", hVar);
                }
                String nativeSiteAdInfo = awemeRawAd2.getNativeSiteAdInfo();
                if (nativeSiteAdInfo == null) {
                    nativeSiteAdInfo = "";
                }
                nVar.LJJIIJ("pageData", nativeSiteAdInfo);
                NativeSiteConfig nativeSiteConfig = awemeRawAd2.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str2 = nativeSiteConfig.lynxScheme;
                } else {
                    str2 = null;
                }
                nVar.LJJIIJ("lynxSchema", str2);
            }
            nVar.LJJIIJ("itemId", String.valueOf(aweme.getAid()));
            nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(context) ? 1 : 0), "isRTL");
            JSONObject cardData = cardStruct.getCardData();
            if (cardData != null && (strJ3 = C786410Ut5.J3(cardData)) != null) {
                str3 = strJ3;
            }
            nVar.LJJIIJ("cardData", str3);
            nVar.LJJIII(Integer.valueOf(C497820Jfg.LIZJ(context)), "topSafeAreaHeight");
            nVar.LJJIII(1, "isCardState");
            if (C1017070cZd.LLLIL(aweme)) {
                User author = aweme.getAuthor();
                if (author != null && (avatarMedium = author.getAvatarMedium()) != null && (urlList = avatarMedium.getUrlList()) != null) {
                    str = (String) ListProtector.get(urlList, 0);
                } else {
                    str = null;
                }
                nVar.LJJIIJ("userAvatar", str);
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    uniqueId = author2.getUniqueId();
                } else {
                    uniqueId = null;
                }
                nVar.LJJIIJ("userNickname", uniqueId);
                User author3 = aweme.getAuthor();
                if (author3 != null) {
                    numberValueOf = Integer.valueOf(author3.getFollowerCount());
                } else {
                    numberValueOf = null;
                }
                nVar.LJJIII(numberValueOf, "followNumber");
            }
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 == null) {
                awemeRawAd3 = new AwemeRawAd();
            }
            AdLiveEnterRoomConfig adLiveEnterRoomConfigLIZJ = C1019100ccu.LIZJ(aweme, awemeRawAd3);
            LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
            if (newLiveRoomDataExt != null && (user = newLiveRoomDataExt.owner) != null) {
                numValueOf = Integer.valueOf(user.getFollowStatus());
            } else {
                numValueOf = null;
            }
            adLiveEnterRoomConfigLIZJ.followStatus = String.valueOf(numValueOf);
            nVar.LJJIIJ("adLiveJson", C08JS.LIZLLL(adLiveEnterRoomConfigLIZJ));
            Object liveProduct = liveAdCardModel.getLiveProduct();
            if (liveProduct != null) {
                nVar.LJJIIJ("productInfo", C08JS.LIZLLL(liveProduct));
            }
            Object frontendExtraData = liveAdCardModel.getFrontendExtraData();
            if (frontendExtraData != null) {
                nVar.LJJIIJ("frontendExtraData", C08JS.LIZLLL(frontendExtraData));
            }
            builderBuildUpon.appendQueryParameter("initialData", nVar.toString());
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = c999790c7l.LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getKitView() != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c999790c7l.LIZJ) != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
            C999730c7f c999730c7f2 = c999790c7l.LJIIIIZZ;
            if (c999730c7f2 != null) {
                String string3 = builderBuildUpon.toString();
                Bundle bundle = new Bundle();
                InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
                if (interfaceC1000280c8YLIZ != null) {
                    interfaceC1000280c8YLIZ.LJIJJ(context, bundle, aweme);
                }
                AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                if (awemeRawAd4 != null) {
                    nativeSiteCustomData = awemeRawAd4.getNativeSiteCustomData();
                }
                C786410Ut5.LJJJI("bundle_native_site_custom_data", nativeSiteCustomData, bundle);
                c999730c7f2.LIZ(bundle, string3);
            }
        }
    }

    @Override // X.InterfaceC990700bt6
    public final void LJIILLIIL(int i, List list) {
        C1000300c8a.LIZJ(i, this, list);
    }
}
