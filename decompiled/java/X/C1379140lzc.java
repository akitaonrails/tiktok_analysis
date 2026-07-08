package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.ss.android.ugc.airemix.api.service.cameocheck.IAIRemixCameoPermissionService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeAutoRotationServiceImpl;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.AIRemixInfo;
import com.ss.android.ugc.aweme.feed.model.AnalyticsEntranceStatus;
import com.ss.android.ugc.aweme.feed.model.AnalyticsEntranceStatusKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.DuetHelperKt;
import com.ss.android.ugc.aweme.feed.model.InsightsEligibilityStatus;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import com.ss.android.ugc.aweme.share.ISharePanelService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.experiment.CreatorAssistantEntrancesExperiment;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import xtc.l1;

/* JADX INFO: renamed from: X.0lzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379140lzc {
    public static final ArrayList<String> LJIJI = C1697810uHb.LJ("report", "save", "captions");
    public static final List<String> LJIJJ;
    public static final List<String> LJIJJLI;
    public static final List<String> LJIL;
    public static final List<String> LJJ;
    public static final List<String> LJJI;
    public static final List<String> LJJIFFI;
    public final /* synthetic */ C1379240lzm LIZ;
    public final Aweme LIZIZ;
    public final boolean LIZJ;
    public final Activity LIZLLL;
    public final Fragment LJ;
    public final C1371600lnS LJFF;
    public final C0HTT<C737030Svd> LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final boolean LJIILJJIL;
    public final String LJIILL;
    public final EnumC1369720lkQ LJIILLIIL;
    public final SharePackage LJIIZILJ;
    public final List<Function0<Unit>> LJIJ;

    static {
        C1697810uHb.LJ("save", "save_photo", "top", "bc_view_insights", "insight", "promote", "author_auto_dubbing", "promote_for_others", "promote_for_others_fyp", "play_list", "privacy", "delete");
        C1697810uHb.LJ("save", "save_photo", "report");
        LJIJJ = C1697810uHb.LJIIJJI("report", "mute_their_posts", "share_to_story", "delete", "privacy", "edit_post", "ad_settings", "top", "play_list", "ai_remix");
        LJIJJLI = Collections.singletonList("delete");
        LJIL = C1697810uHb.LJIIJJI("report", "mute_their_posts");
        LJJ = C1697810uHb.LJIIJJI("report", "mute_their_posts", "share_to_story");
        LJJI = C1697810uHb.LJIIJJI("report", "mute_their_posts", "dislike", "share_to_story", "delete", "privacy", "save", "save_photo", "edit_post", "top", "play_list", "ad_settings");
        LJJIFFI = C1697810uHb.LJIIJJI("report", "share_to_story", "delete", "privacy", "save", "save_photo", "edit_post", "top", "play_list", "ad_settings");
    }

    public final InterfaceC1370310llN LIZIZ() {
        if (!C1373290lqB.LIZ("casting", this.LJIILL, this.LIZIZ.awemeACLShareInfo) || LJIILIIL(true)) {
            return null;
        }
        C1252604vE.LIZ.getClass();
        if (!C1252604vE.LIZ() || C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
            return null;
        }
        C1D0F c1d0f = C1D0F.LIZ;
        Activity activity = this.LIZLLL;
        c1d0f.getClass();
        C2110408Oo.LIZ.getClass();
        if (C2110408Oo.LIZIZ()) {
            a.LIZLLL(activity);
        } else {
            C23250099c.LIZLLL((InterfaceC497601wk) C1D0F.LIZIZ.getValue(), null, null, new C319470Cfh(null), 3);
        }
        return c1d0f.LIZLLL(this.LIZIZ, this.LJIIIIZZ, this.LJIILL);
    }

    public final boolean LJ() {
        if (!C1373290lqB.LIZ("dislike", this.LJIILL, this.LIZIZ.awemeACLShareInfo) || this.LIZJ || C1017070cZd.LJJLIL(this.LIZIZ)) {
            return false;
        }
        if (!Intrinsics.LJFF(this.LJIIIIZZ, "homepage_hot") && !Intrinsics.LJFF(this.LJIIIIZZ, "homepage_explore") && !Intrinsics.LJFF(this.LJIIIIZZ, "homepage_popular") && !Intrinsics.LJFF(this.LJIIIIZZ, "homepage_nearby") && !Intrinsics.LJFF(this.LJIIIIZZ, "homepage_podcast") && !LJFF() && !LJIILJJIL() && (!Intrinsics.LJFF(this.LJIIIIZZ, "general_search") || !C1ER1.LIZIZ.LJLJJI(this.LIZIZ))) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            if ((!c1er1.LLJJL(this.LJIIIIZZ) || !c1er1.LJLJJI(this.LIZIZ)) && ((this.LIZIZ.getAwemeRawAd() == null || !TalentAdRevenueShareServiceImpl.LJIIL().LJIIIZ()) && !C1591530rWB.LIZIZ.N7(this.LJIIIIZZ) && ((!Intrinsics.LJFF(this.LJIIIIZZ, "homepage_follow") || !AwemeExtKt.isAdTraffic(this.LIZIZ)) && (!Intrinsics.LJFF(this.LJIIIIZZ, "others_homepage") || !AwemeExtKt.isAdTraffic(this.LIZIZ))))) {
                if (!Intrinsics.LJFF(this.LJIIIIZZ, "homepage_friends") || !AwemeExtKt.isAdTraffic(this.LIZIZ)) {
                    return false;
                }
                if (C729980SkG.LJIIIIZZ(this.LIZIZ) && !C707230Rof.LJ(this.LIZIZ)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean LJFF() {
        return Intrinsics.LJFF(this.LJIIIIZZ, "homepage_playmode_top") || Intrinsics.LJFF(this.LJIIIIZZ, "homepage_playmode_new") || Intrinsics.LJFF(this.LJIIIIZZ, "homepage_playmode_moodboost");
    }

    public final void LJI() {
        InterfaceC1370310llN interfaceC1370310llN;
        InterfaceC1370310llN next;
        InterfaceC1370310llN next2;
        InterfaceC1370310llN next3;
        InterfaceC1370310llN next4;
        Bundle bundle;
        HashMap map = new HashMap();
        for (InterfaceC1370310llN interfaceC1370310llN2 : this.LJFF.LJFF) {
            List list = (List) map.get(interfaceC1370310llN2.key());
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(interfaceC1370310llN2);
                map.put(interfaceC1370310llN2.key(), arrayList);
            } else {
                list.add(interfaceC1370310llN2);
            }
        }
        this.LJFF.LJFF.clear();
        boolean z = Intrinsics.LJFF(this.LJII, "share_panel") || Intrinsics.LJFF(this.LJII, "normal_share");
        if (this.LJIILLIIL == EnumC1369720lkQ.VERTICAL && map.containsKey("dislike") && z) {
            List list2 = (List) map.get("dislike");
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            for (Object obj : list2) {
                if (obj instanceof C1376770lvn) {
                    this.LJFF.LJFF.add((InterfaceC1370310llN) obj);
                    map.remove("dislike");
                }
            }
        }
        C1865390ydt.LIZ.getClass();
        if (!C1865390ydt.LIZ()) {
            map.remove("insight");
        }
        for (Map.Entry entry : map.entrySet()) {
            entry.getKey();
            List list3 = (List) entry.getValue();
            if (list3.size() > 1) {
                List<InterfaceC1370310llN> list4 = this.LJFF.LJFF;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    InterfaceC1370310llN interfaceC1370310llN3 = (InterfaceC1370310llN) obj2;
                    if (Intrinsics.LJFF(this.LJII, "share_panel") || Intrinsics.LJFF(this.LJII, "normal_share")) {
                        if (interfaceC1370310llN3.LJIIJ() == C0M7Z.ShareButton) {
                            arrayList2.add(obj2);
                        }
                    } else if (interfaceC1370310llN3.LJIIJ() == C0M7Z.LongPress) {
                        arrayList2.add(obj2);
                    }
                }
                list4.addAll(arrayList2);
            } else {
                this.LJFF.LJFF.addAll(list3);
            }
        }
        if (!this.LJIILJJIL) {
            Iterator<InterfaceC1370310llN> it2 = this.LJFF.LJFF.iterator();
            while (it2.hasNext()) {
                if (!LJIJI.contains(it2.next().key())) {
                    it2.remove();
                }
            }
            List<InterfaceC1370310llN> list5 = this.LJFF.LJFF;
            if (C713290RyR.LIZ) {
                final Aweme aweme = this.LIZIZ;
                final String str = this.LJIIIIZZ;
                final String str2 = this.LJII;
                list5.add(new InterfaceC1370310llN(aweme, str, str2) { // from class: X.0SsB
                    public final Aweme LL;
                    public final String LLILLJJLI;
                    public final String LLILLL;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return 2131826887;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "auto_rotation";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
                        c2344009Gk.LJIIIIZZ("enter_method", this.LLILLL);
                        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(this.LL));
                        String aid = this.LL.getAid();
                        if (aid == null) {
                            aid = "";
                        }
                        c2344009Gk.LJIIIIZZ("group_id", aid);
                        c2344009Gk.LJIIIIZZ("setting_app_rotate_status", !(LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZLLL() ^ true) ? "on" : "off");
                        c2344009Gk.LJIIIIZZ("set_method", "full_screen_panel");
                        c2344009Gk.LJIIIIZZ("default_app_rotate_status", C2531909w5.LIZIZ ? "on" : "off");
                        c2344009Gk.LJIIIIZZ("phone_rotate_status", LandscapeAutoRotationServiceImpl.LJIIIIZZ().LJII() ? "on" : "off");
                        c2344009Gk.LJIIIIZZ("app_rotate_status", LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZLLL() ? "on" : "off");
                        C20684815ws.LJIILLIIL("rotate_landscape_screen_setting", c2344009Gk.LIZ);
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return LJIIIIZZ();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZLLL() ^ true ? R.raw.icon_rotate_device_off_fill : R.raw.icon_rotate_device_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                        LandscapeAutoRotationServiceImpl.LJIIIIZZ().LJI(!r2.LIZLLL(), true, true, true);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }

                    {
                        this.LL = aweme;
                        this.LLILLJJLI = str;
                        this.LLILLL = str2;
                    }
                });
            }
            if (C2552609zQ.LIZ && Intrinsics.LJFF(this.LJIIIIZZ, "homepage_hot")) {
                LJJII();
            }
        }
        LJII();
        LJIIIIZZ(this.LJFF.LJFF);
        List<InterfaceC1370310llN> list6 = this.LJFF.LJFF;
        SharePackage sharePackage = this.LJIIZILJ;
        if (sharePackage != null && (bundle = sharePackage.extras) != null && bundle.getBoolean("is_friends_v3_text")) {
            C19719612Di.LJJIIJ(list6, new AwS592S0100000_13((List) (C729980SkG.LJIIIIZZ(this.LIZIZ) ? LJIJJLI : LJIL), (List<String>) 75), false);
        }
        List<InterfaceC1370310llN> list7 = this.LJFF.LJFF;
        ArrayList arrayList3 = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<InterfaceC1370310llN> it3 = list7.iterator();
        while (true) {
            interfaceC1370310llN = null;
            if (it3.hasNext()) {
                next = it3.next();
                if (next instanceof C1379760m0c) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        arrayList3.add(LIZLLL(this, jCurrentTimeMillis, "share_duet", LIZJ(next)));
        Iterator<InterfaceC1370310llN> it4 = list7.iterator();
        while (true) {
            if (it4.hasNext()) {
                next2 = it4.next();
                if (next2 instanceof C1379780m0e) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        arrayList3.add(LIZLLL(this, jCurrentTimeMillis, "share_stitch", LIZJ(next2)));
        Iterator<InterfaceC1370310llN> it5 = list7.iterator();
        while (true) {
            if (it5.hasNext()) {
                next3 = it5.next();
                if (next3 instanceof C1376170lup) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        arrayList3.add(LIZLLL(this, jCurrentTimeMillis, "share_download", LIZJ(next3)));
        Iterator<InterfaceC1370310llN> it6 = list7.iterator();
        while (true) {
            if (it6.hasNext()) {
                next4 = it6.next();
                if (next4 instanceof C1377760lxO) {
                    break;
                }
            } else {
                next4 = null;
                break;
            }
        }
        arrayList3.add(LIZLLL(this, jCurrentTimeMillis, "share_create_sticker", LIZJ(next4)));
        Iterator<InterfaceC1370310llN> it7 = list7.iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            InterfaceC1370310llN next5 = it7.next();
            if (next5 instanceof C1364420lbs) {
                interfaceC1370310llN = next5;
                break;
            }
        }
        arrayList3.add(LIZLLL(this, jCurrentTimeMillis, "share_share_to_story", LIZJ(interfaceC1370310llN)));
        ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJJIJIL(arrayList3);
        ISharePanelService iSharePanelService = (ISharePanelService) PluggableExtentionKt.pluggableSpi$default(ISharePanelService.class, false, false, false, 14, null);
        if (iSharePanelService != null) {
            iSharePanelService.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final void LJII() {
        ?? arrayList;
        if (Intrinsics.LJFF(this.LJIILL, "long_press")) {
            arrayList = C1379430m05.LIZIZ;
            if (arrayList == 0) {
                List<ShareItemOrderBean> list = C1374860lsi.LIZJ().LIZJ;
                if (list == null || list.isEmpty()) {
                    List listLIZIZ = C1380680m26.LIZIZ();
                    arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
                    Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((ShareItemOrderBean) it2.next()).actionId);
                    }
                } else {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<ShareItemOrderBean> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next().actionId);
                    }
                    C1379430m05.LIZIZ = arrayList;
                }
            }
        } else {
            arrayList = C1379430m05.LIZ;
            if (arrayList == 0) {
                List<ShareItemOrderBean> list2 = C1374860lsi.LIZJ().LIZIZ;
                if (list2 == null || list2.isEmpty()) {
                    List listLIZJ = C1380680m26.LIZJ();
                    arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
                    Iterator it4 = ((ArrayList) listLIZJ).iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((ShareItemOrderBean) it4.next()).actionId);
                    }
                } else {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<ShareItemOrderBean> it5 = list2.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(it5.next().actionId);
                    }
                    C1379430m05.LIZ = arrayList;
                }
            }
        }
        this.LJFF.LJJ = new AwS592S0100000_13((List) arrayList, (List<String>) 73);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1370310llN LJIIJJI() {
        /*
            r14 = this;
            android.app.Activity r6 = r14.LIZLLL
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r14.LIZIZ
            java.lang.String r4 = r14.LJII
            java.lang.String r3 = r14.LJIILL
            X.0HTT<X.0Svd> r2 = r14.LJI
            com.ss.android.ugc.aweme.feed.model.AwemeACLShare r1 = r5.awemeACLShareInfo
            java.lang.String r0 = "why_this_video"
            boolean r0 = X.C1373290lqB.LIZ(r0, r3, r1)
            r13 = 0
            r9 = 0
            if (r0 == 0) goto L59
            X.0C64 r8 = X.C0C64.LJIILLIIL()
            r7 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "why_this_post_reverse"
            r1 = 1
            int r0 = r8.LJIJ(r7, r9, r0, r1)
            if (r0 == r1) goto L59
            com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJI()
            androidx.lifecycle.MutableLiveData r0 = r0.LJJIII()
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L59
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r5)
            if (r0 != 0) goto L5c
            java.lang.Class<com.ss.android.ugc.aweme.main.IMainPageFragment> r8 = com.ss.android.ugc.aweme.main.IMainPageFragment.class
            r12 = 14
            r10 = r9
            r11 = r9
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.main.IMainPageFragment r0 = (com.ss.android.ugc.aweme.main.IMainPageFragment) r0
            if (r0 == 0) goto L5a
            java.lang.String r1 = r0.LJJLIIIJJI()
        L51:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L69
        L59:
            return r13
        L5a:
            r1 = r13
            goto L51
        L5c:
            java.util.List r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getRecReasonsEntry(r5)
            if (r0 == 0) goto L59
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L69
            return r13
        L69:
            boolean r0 = r6 instanceof X.C19EG
            if (r0 == 0) goto L59
            X.0m17 r1 = new X.0m17
            X.19EG r6 = (X.C19EG) r6
            r1.<init>(r5, r6, r4, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeACLShare r0 = r5.awemeACLShareInfo
            X.0llN r13 = X.C1373290lqB.LIZJ(r1, r3, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379140lzc.LJIIJJI():X.0llN");
    }

    public final boolean LJIIL() {
        Bundle bundle;
        SharePackage sharePackage = this.LJIIZILJ;
        return (sharePackage == null || (bundle = sharePackage.extras) == null || !bundle.getBoolean("is_friends_v3_repost")) ? false : true;
    }

    public final boolean LJIILJJIL() {
        Bundle bundle;
        SharePackage sharePackage = this.LJIIZILJ;
        return (sharePackage == null || (bundle = sharePackage.extras) == null || !bundle.getBoolean("is_tako_ai_video")) ? false : true;
    }

    public final void LJIILL() {
        C0M7D c0m7dLIZ;
        IAIRemixService.LIZ.getClass();
        InterfaceC563140M6u interfaceC563140M6uLJIIIZ = C563030M6j.LIZ().LJIIIZ();
        boolean z = true;
        boolean z2 = interfaceC563140M6uLJIIIZ != null && interfaceC563140M6uLJIIIZ.LJ();
        if (!z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryAddAction: skip, thirdRow=");
            sbLIZ.append(z2);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("AIRemixFeature", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!C1373290lqB.LIZ("ai_remix", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryAddAction: skip by server control, awemeId=");
            sbLIZ2.append(this.LIZIZ.getAid());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("AIRemixFeature", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        boolean zLIZ = C0SP9.LIZ(this.LIZIZ);
        int iLIZ = C286000BIw.LIZ();
        if (!zLIZ && C286000BIw.LIZ() != 0) {
            z = false;
        }
        if (!z) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("tryAddAction: skip, awemeId=");
            sbLIZ3.append(this.LIZIZ.getAid());
            sbLIZ3.append(", canAIRemix=");
            sbLIZ3.append(zLIZ);
            sbLIZ3.append(", hasEntrance=");
            AIRemixInfo aIRemixInfo = this.LIZIZ.aiRemixInfo;
            sbLIZ3.append(aIRemixInfo != null ? aIRemixInfo.getHasEntrance() : null);
            sbLIZ3.append(", entranceMode=");
            sbLIZ3.append(iLIZ);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("AIRemixFeature", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("tryAddAction: adding, awemeId=");
        sbLIZ4.append(this.LIZIZ.getAid());
        sbLIZ4.append(", entranceEnabled=");
        sbLIZ4.append(zLIZ);
        sbLIZ4.append(", entranceMode=");
        sbLIZ4.append(iLIZ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("AIRemixFeature", C2188811AlT.LIZIZ(sbLIZ4));
        if (zLIZ) {
            IAIRemixCameoPermissionService.LIZ.getClass();
            IAIRemixCameoPermissionService iAIRemixCameoPermissionServiceLIZ = C0M7A.LIZ();
            String aid = this.LIZIZ.getAid();
            AIRemixInfo aIRemixInfo2 = this.LIZIZ.aiRemixInfo;
            c0m7dLIZ = iAIRemixCameoPermissionServiceLIZ.LIZ(aid, null, aIRemixInfo2 != null ? aIRemixInfo2.getCameoIds() : null);
            c0m7dLIZ.LIZ();
        } else {
            C0M7E c0m7e = C0M7D.LIZ;
            AIRemixInfo aIRemixInfo3 = this.LIZIZ.aiRemixInfo;
            List<String> cameoIds = aIRemixInfo3 != null ? aIRemixInfo3.getCameoIds() : null;
            c0m7e.getClass();
            c0m7dLIZ = C0M7E.LIZ(cameoIds);
        }
        C1371600lnS c1371600lnS = this.LJFF;
        C0M7S c0m7s = new C0M7S(this.LIZIZ, this.LJIIIIZZ, c0m7dLIZ, zLIZ);
        ((ArrayList) this.LJIJ).add(new AwS552S0100000_8(c0m7s, 997));
        c1371600lnS.LIZJ(C1373290lqB.LIZJ(c0m7s, this.LJIILL, this.LIZIZ.awemeACLShareInfo));
    }

    public final void LJIILLIIL() {
        if (C1373290lqB.LIZ("ad_settings", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            if (Intrinsics.LJFF(this.LJIIIIZZ, "homepage_podcast") && C729980SkG.LJIIIIZZ(this.LIZIZ)) {
                return;
            }
            C1057370dcd.LIZ();
            if (!C729980SkG.LJIIIIZZ(this.LIZIZ) || C729510SjV.LJJI(this.LIZIZ) || ComplianceServiceProvider.LJIJJ().LJJIIZ()) {
                return;
            }
            boolean zLJIIJJI = ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJIIJJI();
            C1379560m0I.LIZ.getClass();
            boolean adAuthorization = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAdAuthorization();
            if (zLJIIJJI || adAuthorization) {
                this.LJFF.LIZJ(C1373290lqB.LIZJ(new C1210120hb0(this.LIZIZ, this.LJIIIIZZ), this.LJIILL, this.LIZIZ.awemeACLShareInfo));
            }
        }
    }

    public final void LJIIZILJ() {
        C1373290lqB.LIZ("ad_share_data_action", this.LJIILL, this.LIZIZ.awemeACLShareInfo);
    }

    public final void LJIJ() {
        C1373290lqB.LIZ("admin", this.LJIILL, this.LIZIZ.awemeACLShareInfo);
    }

    public final void LJIJI() {
        if (this.LIZIZ.isAd() || C10EU.LJIILIIL()) {
            return;
        }
        C735280Sso c735280Sso = C735280Sso.LIZ;
        Aweme aweme = this.LIZIZ;
        c735280Sso.getClass();
        if (!C735280Sso.LIZJ(aweme) || C729980SkG.LJIIIIZZ(this.LIZIZ)) {
            if (C729980SkG.LJIIIIZZ(this.LIZIZ)) {
                if (((CreatorAssistantEntrancesExperiment.EnableCreatorAssistantEntrances) CreatorAssistantEntrancesExperiment.LIZIZ.getValue()).enableEntranceForCreator != 0 && C1373290lqB.LIZ("ask_creator_assistant_creator_aweme_action", this.LJIILL, this.LIZIZ.awemeACLShareInfo) && ((Boolean) C0AQZ.LIZ.getValue()).booleanValue()) {
                    C1371600lnS c1371600lnS = this.LJFF;
                    final Activity activity = this.LIZLLL;
                    final Aweme aweme2 = this.LIZIZ;
                    c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(activity, aweme2) { // from class: X.0R0G
                        public static final /* synthetic */ int LLILLL = 0;
                        public final Activity LL;
                        public final Aweme LLILLJJLI;

                        @Override // X.InterfaceC1370310llN
                        public final float LIZLLL() {
                            return -1.0f;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJI() {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJII() {
                            return R.raw.icon_creator_assistant;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJIIIIZZ() {
                            return R.raw.icon_creator_assistant;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJIIIZ() {
                            return false;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final Integer LJIILJJIL() {
                            return null;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJIJJLI() {
                            return 0;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJIJ(ImageView imageView, View view, int i) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final Integer LJJIJIIJIL() {
                            return null;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJIL() {
                            return true;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String LJJIZ() {
                            return "";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJJJI(BaseSharePackage baseSharePackage) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final Integer LJJJJIZL() {
                            return null;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJJJL() {
                            return true;
                        }

                        @Override // X.InterfaceC1370450llb
                        public final int LJJJJLI() {
                            return 100;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJJLZIJ() {
                            return false;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJJLIIIJJIZ() {
                            return 2131839339;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJLIIIJL() {
                            return false;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String key() {
                            return "ask_creator_assistant_creator_aweme_action";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String label() {
                            return "";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean enable() {
                            return AwemeExtKt.isPublic(this.LLILLJJLI);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJIIJJI() {
                            return !enable() ? 1 : 0;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final C0M7Z LJIIJ() {
                            return C0M7Z.ShareButton;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final EnumC1216710hld LJJJZ() {
                            return EnumC1216710hld.NORMAL;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJIJJ(TextView textView) {
                            C1370320llO.LJ(this, textView);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                            return C1370320llO.LIZJ(enumC1369720lkQ);
                        }

                        {
                            this.LL = activity;
                            this.LLILLJJLI = aweme2;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) throws JSONException {
                            Object objLJJJLL;
                            UrlModel originCover;
                            List<String> urlList;
                            UrlModel cover;
                            List<String> urlList2;
                            if (!enable()) {
                                if (!AwemeExtKt.isPublic(this.LLILLJJLI)) {
                                    C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
                                    c1389890mGx.LJIIIZ(2131826540);
                                    c1389890mGx.LJIIJJI();
                                    return;
                                }
                                return;
                            }
                            Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=tiktok_creator_ai_assistant_conversation").buildUpon();
                            builderBuildUpon.appendQueryParameter("enter_from", "share_panel");
                            builderBuildUpon.appendQueryParameter("enter_method", "click_share_panel");
                            builderBuildUpon.appendQueryParameter("share_type", "creator_aweme");
                            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                            SparkContext sparkContext = new SparkContext();
                            sparkContext.LJJLIIJ(builderBuildUpon.build().toString());
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("aweme_id", this.LLILLJJLI.getAid());
                            Video video = this.LLILLJJLI.getVideo();
                            if (video == null || (cover = video.getCover()) == null || (urlList2 = cover.getUrlList()) == null || (objLJJJLL = C13LP.LJJJLL(urlList2)) == null) {
                                Video video2 = this.LLILLJJLI.getVideo();
                                if (video2 != null && (originCover = video2.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null) {
                                    objLJJJLL = C13LP.LJJJLL(urlList);
                                } else {
                                    objLJJJLL = null;
                                }
                            }
                            jSONObject.put("video_cover", objLJJJLL);
                            String strJ3 = C786410Ut5.J3(jSONObject);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("data", strJ3);
                            sparkContext.initData = C786410Ut5.J3(jSONObject2);
                            c1537900q7g.getClass();
                            new C1541950qED(context, sparkContext).LIZIZ();
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                            C1370320llO.LIZ(this, view, baseSharePackage);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                            C1370320llO.LIZIZ(this, view, baseSharePackage);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                            C1370320llO.LIZLLL(context, baseSharePackage, this);
                        }
                    }, this.LJIILL, aweme2.awemeACLShareInfo));
                    return;
                }
                return;
            }
            if (((CreatorAssistantEntrancesExperiment.EnableCreatorAssistantEntrances) CreatorAssistantEntrancesExperiment.LIZIZ.getValue()).enableEntranceForUser == 0 || !C1373290lqB.LIZ("ask_creator_assistant_user_aweme_action", this.LJIILL, this.LIZIZ.awemeACLShareInfo) || !((Boolean) C280330Ayl.LIZ.getValue()).booleanValue() || ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFollowerCount() < 1000) {
                return;
            }
            C1371600lnS c1371600lnS2 = this.LJFF;
            final Aweme aweme3 = this.LIZIZ;
            c1371600lnS2.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(aweme3) { // from class: X.0R0E
                public final Aweme LL;

                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJIIIZ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIJJLI() {
                    return 0;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIJ(ImageView imageView, View view, int i) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJIL() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJJJIZL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJJL() {
                    return true;
                }

                @Override // X.InterfaceC1370450llb
                public final int LJJJJLI() {
                    return 100;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJLZIJ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return 2131839339;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "ask_creator_assistant_user_aweme_action";
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    return R.raw.icon_creator_assistant;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return R.raw.icon_creator_assistant;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                {
                    this.LL = aweme3;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIJJ(TextView textView) {
                    C1370320llO.LJ(this, textView);
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                    return C1370320llO.LIZJ(enumC1369720lkQ);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) throws JSONException {
                    Object objLJJJLL;
                    UrlModel originCover;
                    List<String> urlList;
                    UrlModel cover;
                    List<String> urlList2;
                    Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=tiktok_creator_ai_assistant_conversation").buildUpon();
                    builderBuildUpon.appendQueryParameter("enter_from", "share_panel");
                    builderBuildUpon.appendQueryParameter("enter_method", "click_share_panel");
                    builderBuildUpon.appendQueryParameter("share_type", "user_aweme");
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(builderBuildUpon.build().toString());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aweme_id", this.LL.getAid());
                    Video video = this.LL.getVideo();
                    if (video == null || (cover = video.getCover()) == null || (urlList2 = cover.getUrlList()) == null || (objLJJJLL = C13LP.LJJJLL(urlList2)) == null) {
                        Video video2 = this.LL.getVideo();
                        if (video2 != null && (originCover = video2.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null) {
                            objLJJJLL = C13LP.LJJJLL(urlList);
                        } else {
                            objLJJJLL = null;
                        }
                    }
                    jSONObject.put("video_cover", objLJJJLL);
                    String strJ3 = C786410Ut5.J3(jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", strJ3);
                    sparkContext.initData = C786410Ut5.J3(jSONObject2);
                    c1537900q7g.getClass();
                    new C1541950qED(context, sparkContext).LIZIZ();
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZLLL(context, baseSharePackage, this);
                }
            }, this.LJIILL, aweme3.awemeACLShareInfo));
        }
    }

    public final void LJIJJ() {
        if (C1373290lqB.LIZ("auto_scroll", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            l1.LIZ.getClass();
            if (!l1.LIZ() || l1.LIZ() || AwemeExtKt.isAdTraffic(this.LIZIZ) || TextUtils.equals(this.LJIILIIL, "graphic_detail") || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || this.LIZIZ.getAwemeType() == 101) {
                return;
            }
            Activity activityLJFF = C2214201BlK.LJFF();
            if ((activityLJFF == null || !C0SXF.LJIL(activityLJFF)) && TextUtils.equals(this.LJIIIIZZ, "homepage_hot")) {
                C1371600lnS c1371600lnS = this.LJFF;
                final Aweme aweme = this.LIZIZ;
                final String str = this.LJIIIIZZ;
                final String str2 = this.LJII;
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(aweme, str, str2) { // from class: X.0lzr
                    public static final /* synthetic */ int LLILZ = 0;
                    public final Aweme LL;
                    public final String LLILLJJLI;
                    public final String LLILLL;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "auto_scroll";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return C1379280lzq.LIZ();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return C1379280lzq.LIZIZ();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return C1379280lzq.LIZJ() ? 2131826952 : 2131826953;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[PHI: r2
                      0x003f: PHI (r2v1 com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility) = 
                      (r2v0 com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility)
                      (r2v0 com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility)
                      (r2v0 com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility)
                      (r2v0 com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility)
                      (r2v4 com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility)
                      (r2v4 com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility)
                     binds: [B:6:0x0010, B:8:0x0016, B:10:0x001e, B:12:0x002d, B:14:0x0037, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC1370310llN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJIILIIL(android.content.Context r5, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r6) {
                        /*
                            r4 = this;
                            android.app.Activity r1 = X.C2214201BlK.LJFF()
                            boolean r0 = r1 instanceof X.C19EG
                            if (r0 != 0) goto L9
                            return
                        L9:
                            X.19EG r1 = (X.C19EG) r1
                            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZJ(r1)
                            r2 = 0
                            if (r0 == 0) goto L3f
                            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = X.C0DMM.LIZ(r0)
                            if (r1 == 0) goto L3f
                            java.lang.String r0 = "For You"
                            androidx.fragment.app.Fragment r1 = r1.Ki(r0)
                            if (r1 == 0) goto L3f
                            java.lang.Class<com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent> r0 = com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent.class
                            X.12Dl r0 = X.C13LE.LIZ(r0)
                            X.C1578630rBN.LJIIL(r1, r0)
                            X.0Q7z r1 = X.C1578630rBN.LJ(r1)
                            if (r1 == 0) goto L3f
                            java.lang.Class<com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility> r0 = com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility.class
                            X.01wD r2 = X.C1558520qew.LIZ(r1, r0, r2)
                            com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility r2 = (com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility) r2
                            if (r2 == 0) goto L3f
                            X.0MwJ r1 = r2.xo1()
                            if (r1 != 0) goto L41
                        L3f:
                            X.0MwJ r1 = X.EnumC584570MwJ.AUTO_SCROLL_STATE_STOP
                        L41:
                            X.0MwJ r0 = X.EnumC584570MwJ.AUTO_SCROLL_STATE_STOP
                            if (r1 != r0) goto L81
                            X.09Gk r3 = new X.09Gk
                            r3.<init>()
                            java.lang.String r1 = r4.LLILLJJLI
                            java.lang.String r0 = "enter_from"
                            r3.LJIIIIZZ(r0, r1)
                            java.lang.String r1 = r4.LLILLL
                            java.lang.String r0 = "enter_method"
                            r3.LJIIIIZZ(r0, r1)
                            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
                            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
                            java.lang.String r0 = "author_id"
                            r3.LJIIIIZZ(r0, r1)
                            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
                            java.lang.String r1 = r0.getAid()
                            if (r1 != 0) goto L6d
                            java.lang.String r1 = ""
                        L6d:
                            java.lang.String r0 = "group_id"
                            r3.LJIIIIZZ(r0, r1)
                            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
                            java.lang.String r0 = "turn_on_auto_scroll"
                            X.C20684815ws.LJIILLIIL(r0, r1)
                            if (r2 == 0) goto L80
                            r1 = 1
                            r0 = 0
                            r2.lZ(r1, r0)
                        L80:
                            return
                        L81:
                            if (r2 == 0) goto L80
                            java.lang.String r1 = r4.LLILLL
                            r0 = 1
                            r2.qt0(r1, r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1379290lzr.LJIILIIL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }

                    {
                        this.LL = aweme;
                        this.LLILLJJLI = str;
                        this.LLILLL = str2;
                    }
                }, this.LJIILL, aweme.awemeACLShareInfo));
            }
        }
    }

    public final void LJIL() {
        C1379120lza c1379120lza = C1379120lza.LIZ;
        String str = this.LJII;
        c1379120lza.getClass();
        if (!C1379120lza.LIZIZ(str) || !C1379120lza.LIZLLL(this.LJIIZILJ, this.LJIIIIZZ)) {
            InterfaceC1370310llN interfaceC1370310llNLIZIZ = LIZIZ();
            if (interfaceC1370310llNLIZIZ != null) {
                this.LJFF.LIZJ(C1373290lqB.LIZJ(interfaceC1370310llNLIZIZ, this.LJIILL, this.LIZIZ.awemeACLShareInfo));
                return;
            }
            return;
        }
        InterfaceC1370310llN interfaceC1370310llNLIZIZ2 = LIZIZ();
        if (interfaceC1370310llNLIZIZ2 != null) {
            InterfaceC1370310llN interfaceC1370310llNLIZJ = C1373290lqB.LIZJ(interfaceC1370310llNLIZIZ2, this.LJIILL, this.LIZIZ.awemeACLShareInfo);
            if (interfaceC1370310llNLIZJ.enable()) {
                this.LJFF.LIZJ(interfaceC1370310llNLIZJ);
            }
        }
    }

    public final void LJJ() {
        if (C1373290lqB.LIZ("favorite", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            IFavoriteService iFavoriteService = (IFavoriteService) ServiceManager.get().getService(IFavoriteService.class);
            if (iFavoriteService == null || iFavoriteService.LJIIZILJ()) {
                if (!(((Number) C0AQY.LIZ.getValue()).intValue() == 0) ? !(AwemeExtKt.isAdTraffic(this.LIZIZ) || AwemeSaaSExtKt.isLive(this.LIZIZ) || TextUtils.equals(this.LJIIIIZZ, "graphic_detail") || TextUtils.equals(this.LJIILIIL, "graphic_detail") || LJIILJJIL()) : !(AwemeSaaSExtKt.isLive(this.LIZIZ) || TextUtils.equals(this.LJIIIIZZ, "graphic_detail") || TextUtils.equals(this.LJIILIIL, "graphic_detail"))) {
                    if (!((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIIIZZ()) {
                        return;
                    }
                }
                C1371600lnS c1371600lnS = this.LJFF;
                Activity activity = this.LIZLLL;
                Aweme aweme = this.LIZIZ;
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new C734790Ss1(activity, aweme, this.LJIIIIZZ, this.LJII, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL), this.LJIILL, aweme.awemeACLShareInfo));
            }
        }
    }

    public final void LJJI() {
        if (C1373290lqB.LIZ("im_create_group", this.LJIILL, this.LIZIZ.awemeACLShareInfo) && !LJFF()) {
            InterfaceC1370360llS interfaceC1370360llS = C1370370llT.LJFF;
            if (interfaceC1370360llS == null || !interfaceC1370360llS.LJ()) {
                IInternalShareApi.LIZ.getClass();
                C1229130i5f c1229130i5fLJIIZILJ = C1370970lmR.LIZ().LIZIZ().LJIIZILJ(this.LJIIZILJ);
                if (c1229130i5fLJIIZILJ != null) {
                    this.LJFF.LIZJ(C1373290lqB.LIZJ(c1229130i5fLJIIZILJ, this.LJIILL, this.LIZIZ.awemeACLShareInfo));
                }
            }
        }
    }

    public final void LJJIFFI() {
        if (C1373290lqB.LIZ("delete", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            if (!C729980SkG.LJIIIIZZ(this.LIZIZ)) {
                C547860LeC.LIZ.getClass();
                if (!C547860LeC.LIZLLL().LIZIZ(this.LIZIZ)) {
                    return;
                }
            }
            this.LJFF.LIZJ(C1373290lqB.LIZJ(new C1375980luW(this.LIZIZ, this.LJIIIIZZ, this.LJII, this.LJI), this.LJIILL, this.LIZIZ.awemeACLShareInfo));
        }
    }

    public final void LJJIII() {
        Video video;
        ACLCommonShare downloadGeneral;
        if (C1373290lqB.LIZ("save", this.LJIILL, this.LIZIZ.awemeACLShareInfo) && !C10EU.LJIIIIZZ() && C312230CLt.LJ("panel_download_bar") && !Intrinsics.LJFF(this.LJIIIIZZ, "homepage_podcast")) {
            AwemeACLShare awemeACLShare = this.LIZIZ.awemeACLShareInfo;
            if ((awemeACLShare != null && (downloadGeneral = awemeACLShare.getDownloadGeneral()) != null && downloadGeneral.getShowType() == 0) || !AwemeExtKt.isSharedStoryVisible(this.LIZIZ) || C729510SjV.LJIJI(this.LIZIZ) || this.LIZIZ.getIsCommentPostVideo() || C729510SjV.LJJIIZI(this.LIZIZ) || C729510SjV.LJIL(this.LIZIZ)) {
                return;
            }
            String str = Intrinsics.LJFF(this.LJII, "share_panel") ? "click_download_icon" : "long_press_download";
            InterfaceC1370310llN interfaceC1370310llNLIZJ = C1373290lqB.LIZJ(new C1376170lup(this.LIZLLL, this.LIZIZ, this.LJIIIIZZ, str, this.LJIIIZ, 32), this.LJIILL, this.LIZIZ.awemeACLShareInfo);
            if (interfaceC1370310llNLIZJ.enable() && C297600BlW.LIZ() && ((video = this.LIZIZ.getVideo()) == null || video.getDownloadNoWatermarkAddr() == null)) {
                ACLCommonShare aCLCommonShareLIZIZ = C1373290lqB.LIZIZ(interfaceC1370310llNLIZJ.key(), this.LJIILL, this.LIZIZ.awemeACLShareInfo);
                C1374940lsq c1374940lsq = C1374940lsq.LIZ;
                Aweme aweme = this.LIZIZ;
                int showType = aCLCommonShareLIZIZ != null ? aCLCommonShareLIZIZ.getShowType() : 0;
                String str2 = this.LJIIIIZZ;
                int transcode = aCLCommonShareLIZIZ != null ? aCLCommonShareLIZIZ.getTranscode() : -1;
                c1374940lsq.getClass();
                C1374940lsq.LIZ(showType, transcode, aweme, "show", str, str2);
            }
            this.LJFF.LIZJ(interfaceC1370310llNLIZJ);
        }
    }

    public final void LJJIIJ() {
        if (C1373290lqB.LIZ("duet", this.LJIILL, this.LIZIZ.awemeACLShareInfo) && !C10IT.LJIIIZ(this.LIZIZ)) {
            if (!DuetHelperKt.canAddDuet(this.LIZIZ, C729980SkG.LJIIIIZZ(this.LIZIZ)) || Intrinsics.LJFF(this.LJIIIIZZ, "homepage_podcast")) {
                return;
            }
            C1371600lnS c1371600lnS = this.LJFF;
            final Aweme aweme = this.LIZIZ;
            final String str = this.LJIIIIZZ;
            final String str2 = this.LJII;
            c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(aweme, str, str2) { // from class: X.0m0c
                public static final /* synthetic */ int LLILZIL = 0;
                public final Aweme LL;
                public final String LLILLJJLI;
                public final String LLILLL;
                public boolean LLILZ;

                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    return R.raw.icon_duet_fill;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return R.raw.icon_2pt_duet;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJIIIZ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIJJLI() {
                    return 0;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJIL() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJJJIZL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJJL() {
                    return true;
                }

                @Override // X.InterfaceC1370450llb
                public final int LJJJJLI() {
                    return 100;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJLZIJ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "duet";
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    VideoUrlModel playAddr;
                    boolean zLJIIIIZZ = C729980SkG.LJIIIIZZ(this.LL);
                    boolean zLIZ = C10IT.LIZ(this.LL);
                    boolean z = C2222691Bz1.LJIIIIZZ() && !C746350TPl.LIZ.LIZ().LIZ().booleanValue();
                    boolean zLIZJ = ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZJ(this.LL.getMusic());
                    boolean z2 = this.LL.getAwemeType() == 150;
                    Video video = this.LL.getVideo();
                    return (DuetHelperKt.setGrayForDuet(this.LL, zLJIIIIZZ, zLIZ, z, zLIZJ) || z2 || ((video == null || (playAddr = video.getPlayAddr()) == null) ? false : playAddr.isHaveHdr())) ? false : true;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().showDuetWithReact() ? 2131832491 : 2131832475;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIJJ(TextView textView) {
                    C1370320llO.LJ(this, textView);
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                    return C1370320llO.LIZJ(enumC1369720lkQ);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    if (this.LL.isAd() && enable()) {
                        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", this.LL.getAwemeRawAd());
                        c1022820ciuLIZLLL.LIZJ("duet", "refer");
                        c1022820ciuLIZLLL.LJII();
                    }
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    C19EG c19eg;
                    FragmentManager supportFragmentManager;
                    List<Fragment> listLJJLIIIJL;
                    Fragment fragment;
                    Aweme aweme2 = this.LL;
                    String str3 = this.LLILLJJLI;
                    boolean zEnable = enable();
                    ShareDependService.LIZ.getClass();
                    ShareDependServiceImpl.LJJJJI().LJIJ(aweme2, str3, "share_panel", null, zEnable);
                    if (!C630030OnR.LIZ(context, this.LL, this.LLILLJJLI)) {
                        return;
                    }
                    if (this.LL.getAwemeType() == 150) {
                        if (C299060Bns.LIZ()) {
                            Activity activityLIZ = C1388190mED.LIZ(context);
                            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && (fragment = (Fragment) C13LP.LJJLIIIJL(listLJJLIIIJL)) != null) {
                                C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                                c1389880mGw.LJIIIZ(context.getString(2131844963));
                                c1389880mGw.LJIIJ();
                                return;
                            }
                            return;
                        }
                        C1233040iBy c1233040iBy = new C1233040iBy(context);
                        c1233040iBy.LIZJ(context.getString(2131844963));
                        c1233040iBy.LIZLLL();
                        return;
                    }
                    if (this.LL.isAd() && enable()) {
                        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", this.LL.getAwemeRawAd());
                        c1022820ciuLIZLLL.LIZJ("duet", "refer");
                        c1022820ciuLIZLLL.LJII();
                    }
                    if (this.LL.isSubOnlyVideo() && !C729980SkG.LJIIIIZZ(this.LL)) {
                        return;
                    }
                    C1379770m0d.LIZ(context, this.LL, this.LLILLL, this.LLILLJJLI, "share_panel", null, false, true);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZLLL(context, baseSharePackage, this);
                }

                {
                    this.LL = aweme;
                    this.LLILLJJLI = str;
                    this.LLILLL = str2;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIJ(ImageView imageView, View view, int i) {
                    if (!this.LLILZ) {
                        Aweme aweme2 = this.LL;
                        String str3 = this.LLILLJJLI;
                        boolean zEnable = enable();
                        ShareDependService.LIZ.getClass();
                        ShareDependServiceImpl.LJJJJI().LJIIZILJ(aweme2, str3, "share_panel", null, zEnable);
                    }
                    this.LLILZ = true;
                }
            }, this.LJIILL, aweme.awemeACLShareInfo));
        }
    }

    public final void LJJIIJZLJL() {
        final int value;
        List<EditPostBizPermissionStruct> list;
        C0JMD c0jmdLIZ;
        if (C1373290lqB.LIZ("edit_post", this.LJIILL, this.LIZIZ.awemeACLShareInfo) && C729980SkG.LJIIIIZZ(this.LIZIZ)) {
            EditPostPermission editPostPermission = this.LIZIZ.getEditPostPermission();
            if (editPostPermission == null || (list = editPostPermission.bizPermission) == null) {
                value = C0JMD.NO_SHOW.getValue();
            } else {
                ArrayList<EditPostBizPermissionStruct> arrayList = new ArrayList();
                for (EditPostBizPermissionStruct editPostBizPermissionStruct : list) {
                    EnumC1379590m0L.Companion.getClass();
                    if (((ArrayList) C1379480m0A.LIZ()).contains(Integer.valueOf(editPostBizPermissionStruct.bizType))) {
                        arrayList.add(editPostBizPermissionStruct);
                    }
                }
                Map<Integer, InterfaceC1379450m07> map = C1379470m09.LIZ;
                ArrayList arrayList2 = new ArrayList();
                for (EditPostBizPermissionStruct editPostBizPermissionStruct2 : arrayList) {
                    C0JMD[] c0jmdArrValues = C0JMD.values();
                    int length = c0jmdArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            C0JMD c0jmd = c0jmdArrValues[i];
                            if (c0jmd.getValue() == editPostBizPermissionStruct2.bizStatus) {
                                InterfaceC1379450m07 interfaceC1379450m07 = (InterfaceC1379450m07) ((LinkedHashMap) C1379470m09.LIZ).get(Integer.valueOf(editPostBizPermissionStruct2.bizType));
                                arrayList2.add(new EditPostBizPermissionStruct(editPostBizPermissionStruct2.bizType, (interfaceC1379450m07 == null || (c0jmdLIZ = interfaceC1379450m07.LIZ(c0jmd)) == null) ? editPostBizPermissionStruct2.bizStatus : c0jmdLIZ.getValue()));
                            } else {
                                i++;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((EditPostBizPermissionStruct) it2.next()).bizStatus));
                }
                C0JMD c0jmd2 = C0JMD.GRAYED_OUT_FOR_MODERATION;
                if (arrayList3.contains(Integer.valueOf(c0jmd2.getValue()))) {
                    value = c0jmd2.getValue();
                } else {
                    C0JMD c0jmd3 = C0JMD.SHOW;
                    if (arrayList3.contains(Integer.valueOf(c0jmd3.getValue()))) {
                        value = c0jmd3.getValue();
                    } else {
                        C0JMD c0jmd4 = C0JMD.GRAYED_OUT_FOR_IN_PROCESS;
                        if (arrayList3.contains(Integer.valueOf(c0jmd4.getValue()))) {
                            value = c0jmd4.getValue();
                        } else {
                            C0JMD c0jmd5 = C0JMD.GRAYED_OUT_FOR_FREQ_CONTROL;
                            if (arrayList3.contains(Integer.valueOf(c0jmd5.getValue()))) {
                                value = c0jmd5.getValue();
                            } else {
                                C0JMD c0jmd6 = C0JMD.GRAYED_OUT_FOR_TIME_EXPIRATION;
                                value = arrayList3.contains(Integer.valueOf(c0jmd6.getValue())) ? c0jmd6.getValue() : C0JMD.NO_SHOW.getValue();
                            }
                        }
                    }
                }
            }
            if (value != C0JMD.NO_SHOW.getValue()) {
                C1371600lnS c1371600lnS = this.LJFF;
                final Aweme aweme = this.LIZIZ;
                final String str = this.LJIIIIZZ;
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(value, aweme, str) { // from class: X.0m0K
                    public final Aweme LL;
                    public final String LLILLJJLI;
                    public final int LLILLL;
                    public final List<Integer> LLILZ;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return R.raw.icon_pen_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return R.raw.icon_2pt_pen;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i2) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return 2131833469;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "edit_post";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return this.LLILLL == C0JMD.SHOW.getValue();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    public final void LIZ(String str2) {
                        String str3;
                        int i2;
                        int i3 = this.LLILLL;
                        String str4 = "";
                        if (i3 == C0JMD.GRAYED_OUT_FOR_FREQ_CONTROL.getValue()) {
                            str3 = "beyond_edit_cnt";
                        } else if (i3 == C0JMD.GRAYED_OUT_FOR_MODERATION.getValue()) {
                            str3 = "under_review";
                        } else if (i3 == C0JMD.GRAYED_OUT_FOR_TIME_EXPIRATION.getValue()) {
                            str3 = "beyond_edit_days";
                        } else if (i3 != C0JMD.GRAYED_OUT_FOR_IN_PROCESS.getValue()) {
                            str3 = "";
                        } else {
                            str3 = "in_process";
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
                        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                        String aid = this.LL.getAid();
                        if (aid != null) {
                            str4 = aid;
                        }
                        c2344009Gk.LJIIIIZZ("group_id", str4);
                        c2344009Gk.LIZLLL(C1443290nf5.LIZ().passedDaysAfterPost(this.LL.getCreateTime()), "after_post_days");
                        c2344009Gk.LJIIIIZZ("grey_reason", str3);
                        if (str3.length() > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        c2344009Gk.LIZJ(i2, "is_grey_status");
                        c2344009Gk.LIZJ(this.LL.getAwemeType(), "aweme_type");
                        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
                    @Override // X.InterfaceC1370310llN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJIILIIL(android.content.Context r15, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r16) {
                        /*
                            Method dump skipped, instruction units count: 305
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1379580m0K.LJIILIIL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
                    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<java.lang.Integer>] */
                    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
                    {
                        ?? arrayList4;
                        List<EditPostBizPermissionStruct> list2;
                        this.LL = aweme;
                        this.LLILLJJLI = str;
                        this.LLILLL = value;
                        EditPostPermission editPostPermission2 = aweme.getEditPostPermission();
                        if (editPostPermission2 != null && (list2 = editPostPermission2.bizPermission) != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (EditPostBizPermissionStruct editPostBizPermissionStruct3 : list2) {
                                if (editPostBizPermissionStruct3.bizStatus == C0JMD.GRAYED_OUT_FOR_TIME_EXPIRATION.getValue()) {
                                    arrayList5.add(editPostBizPermissionStruct3);
                                }
                            }
                            arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(Integer.valueOf(((EditPostBizPermissionStruct) it3.next()).bizType));
                            }
                        } else {
                            arrayList4 = C13BV.INSTANCE;
                        }
                        this.LLILZ = arrayList4;
                        LIZ("edit_post_show");
                    }
                }, this.LJIILL, this.LIZIZ.awemeACLShareInfo));
            }
        }
    }

    public final void LJJIIZ() {
        if (C1373290lqB.LIZ("top", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            if ((LJIIL() && C729980SkG.LJIIIIZZ(this.LIZIZ)) || AwemeExtKt.isPrivate(this.LIZIZ)) {
                return;
            }
            ShareDependService.LIZ.getClass();
            if (!ShareDependServiceImpl.LJJJJI().LJIJJLI(this.LIZIZ) && ShareDependServiceImpl.LJJJJI().LJIIIZ(this.LIZIZ) == 0) {
                User author = this.LIZIZ.getAuthor();
                if (author == null) {
                    return;
                }
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(author.getUid())) {
                    return;
                }
            }
            C1371600lnS c1371600lnS = this.LJFF;
            Aweme aweme = this.LIZIZ;
            c1371600lnS.LIZJ(C1373290lqB.LIZJ(new C1387480mD4(aweme, this.LJIIIIZZ, this.LJII), this.LJIILL, aweme.awemeACLShareInfo));
        }
    }

    public final void LJJIIZI() {
        if (C1373290lqB.LIZ("playback_speed", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            C589960NBy c589960NBy = C589960NBy.LIZ;
            Aweme aweme = this.LIZIZ;
            c589960NBy.getClass();
            if (C589960NBy.LIZ(aweme)) {
                C1D0F c1d0f = C1D0F.LIZ;
                if (c1d0f == null || !c1d0f.isConnected()) {
                    C1371600lnS c1371600lnS = this.LJFF;
                    final Aweme aweme2 = this.LIZIZ;
                    final C0HTT<C737030Svd> c0htt = this.LJI;
                    c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(c0htt, aweme2) { // from class: X.0lvz
                        public static final /* synthetic */ int LLILLL = 0;
                        public final Aweme LL;
                        public final C0HTT<C737030Svd> LLILLJJLI;

                        @Override // X.InterfaceC1370310llN
                        public final float LIZLLL() {
                            return -1.0f;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJI() {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJII() {
                            return R.raw.icon_speed_meter_fill;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJIIIIZZ() {
                            return R.raw.icon_2pt_speed;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJIIIZ() {
                            return false;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final Integer LJIILJJIL() {
                            return null;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJIJJLI() {
                            return 0;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJIJ(ImageView imageView, View view, int i) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final Integer LJJIJIIJIL() {
                            return null;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJIL() {
                            return true;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String LJJIZ() {
                            return "";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJJJI(BaseSharePackage baseSharePackage) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final Integer LJJJJIZL() {
                            return null;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJJJL() {
                            return false;
                        }

                        @Override // X.InterfaceC1370450llb
                        public final int LJJJJLI() {
                            return 100;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJJLZIJ() {
                            return false;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJJLIIIJJIZ() {
                            return 2131840511;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJLIIIJL() {
                            return false;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean enable() {
                            return true;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String key() {
                            return "playback_speed";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String label() {
                            return "";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJIIJJI() {
                            return !enable() ? 1 : 0;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final C0M7Z LJIIJ() {
                            return C0M7Z.ShareButton;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final EnumC1216710hld LJJJZ() {
                            return EnumC1216710hld.NORMAL;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJIJJ(TextView textView) {
                            C1370320llO.LJ(this, textView);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                            return C1370320llO.LIZJ(enumC1369720lkQ);
                        }

                        {
                            this.LL = aweme2;
                            this.LLILLJJLI = c0htt;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                            String string = baseSharePackage.extras.getString("enter_from", "");
                            C1386110mAr c1386110mAr = C1386110mAr.LIZ;
                            Aweme aweme3 = this.LL;
                            c1386110mAr.getClass();
                            C1386110mAr.LIZLLL(aweme3, string, "click_share_button");
                            baseSharePackage.extras.putBoolean("should_keep_loop_collection_sign", true);
                            if (baseSharePackage.extras.getBoolean("is_from_long_press_panel", false)) {
                                FeedCommonService feedCommonService = (FeedCommonService) PluggableExtentionKt.pluggableSpi$default(FeedCommonService.class, false, false, false, 14, null);
                                if (feedCommonService != null) {
                                    feedCommonService.LJIIZILJ(context, this.LL, string);
                                    return;
                                }
                                return;
                            }
                            C589960NBy.LIZ.getClass();
                            C1440005kM.LIZ(new C739410SzT(string, "click_share_button"));
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                            String string;
                            Bundle bundle;
                            C1386110mAr c1386110mAr = C1386110mAr.LIZ;
                            Aweme aweme3 = this.LL;
                            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
                                string = bundle.getString("enter_from", "");
                            } else {
                                string = null;
                            }
                            c1386110mAr.getClass();
                            C1386110mAr.LJFF(aweme3, string, "click_share_button");
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                            C1370320llO.LIZ(this, view, baseSharePackage);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                            C1370320llO.LIZIZ(this, view, baseSharePackage);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                            C1370320llO.LIZLLL(context, baseSharePackage, this);
                        }
                    }, this.LJIILL, aweme2.awemeACLShareInfo));
                }
            }
        }
    }

    public final void LJJIJ() {
        SendMessageTemplateTask sendMessageTemplateTask;
        BaseTemplate baseTemplate;
        if (C1375880luM.LIZIZ(this.LIZIZ)) {
            IMAIRemixBridgeApi.LIZ.getClass();
            IMAIRemixBridgeApi iMAIRemixBridgeApiLIZ = C0H0Z.LIZ();
            boolean z = (iMAIRemixBridgeApiLIZ == null || iMAIRemixBridgeApiLIZ.LIZIZ()) ? false : true;
            SharePackage sharePackage = this.LJIIZILJ;
            String strLIZIZ = (sharePackage == null || (sendMessageTemplateTask = sharePackage.sendMessageTemplateTask) == null || (baseTemplate = sendMessageTemplateTask.template) == null) ? null : C902260ZaS.LIZIZ(baseTemplate);
            if (z && C703302op.LIZ(strLIZIZ)) {
                return;
            }
            this.LJFF.LIZJ(C1373290lqB.LIZJ(new C1375680lu2(this.LIZLLL, this.LIZIZ, this.LJIIIIZZ, Intrinsics.LJFF(this.LJII, "share_panel") ? "click_download_icon" : "long_press_download", this.LJIIIZ), this.LJIILL, this.LIZIZ.awemeACLShareInfo));
        }
    }

    public final void LJJIJIIJI() {
        AnalyticsEntranceStatus analyticsEntranceStatus;
        if (C1373290lqB.LIZ("insight", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            Aweme aweme = this.LIZIZ;
            if (curUser == null || aweme == null) {
                return;
            }
            if ((curUser.getIsCreater() || curUser.hasAnalyticsMetrics || AwemeExtKt.getInsightsEligibilityStatus(aweme) == InsightsEligibilityStatus.AVAILABLE || ((analyticsEntranceStatus = AwemeExtKt.getAnalyticsEntranceStatus(aweme)) != null && AnalyticsEntranceStatusKt.canShowAnalytics(analyticsEntranceStatus))) && C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
                C1371600lnS c1371600lnS = this.LJFF;
                final Activity activity = this.LIZLLL;
                final Aweme aweme2 = this.LIZIZ;
                final String str = this.LJII;
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(activity, aweme2, str) { // from class: X.0hZx
                    public static final /* synthetic */ int LLILZ = 0;
                    public final Activity LL;
                    public final Aweme LLILLJJLI;
                    public final String LLILLL;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return R.raw.icon_line_chart_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return R.raw.icon_2pt_line_chart;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return 2131836178;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "insight";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return AnalyticsEntranceStatusKt.isFallback(AwemeExtKt.getAnalyticsEntranceStatus(this.LLILLJJLI)) ? !AwemeExtKt.getInsightsEligibilityStatus(this.LLILLJJLI).isIneligible() : AnalyticsEntranceStatusKt.isAnalyticsEnable(AwemeExtKt.getAnalyticsEntranceStatus(this.LLILLJJLI)) && AwemeExtKt.isPublic(this.LLILLJJLI);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:38:0x015f A[PHI: r3
                      0x015f: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:36:0x0134, B:30:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC1370310llN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJIILIIL(android.content.Context r10, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r11) {
                        /*
                            Method dump skipped, instruction units count: 455
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1209470hZx.LJIILIIL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }

                    {
                        this.LL = activity;
                        this.LLILLJJLI = aweme2;
                        this.LLILLL = str;
                    }
                }, this.LJIILL, aweme2.awemeACLShareInfo));
            }
        }
    }

    public final void LJJIJIL() {
        List<InterfaceC1370310llN> list = this.LJFF.LJFF;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<InterfaceC1370310llN> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().key(), "mute_their_posts")) {
                    return;
                }
            }
        }
        if (C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(this.LJ) || LJIILIIL(false)) {
            User repostUser = LJIIL() ? AwemeBizExtKt.getRepostUser(this.LIZIZ) : this.LIZIZ.getAuthor();
            if (C1392850mLj.LIZ(repostUser)) {
                C1393100mM8.LJFF(repostUser);
                C1371600lnS c1371600lnS = this.LJFF;
                String str = this.LJIIIIZZ;
                C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
                Aweme aweme = this.LIZIZ;
                c1587170rP9.getClass();
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new C1392980mLw(repostUser, str, "story_page", C1587170rP9.LIZLLL(aweme), EnumC1393020mM0.SHARE, this.LJ, null), this.LJIILL, this.LIZIZ.awemeACLShareInfo));
            }
        }
    }

    public final void LJJIJL() {
        if (C1373290lqB.LIZ("play_list", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            if (!(Intrinsics.LJFF(this.LJIIIIZZ, "homepage_podcast") && C729980SkG.LJIIIIZZ(this.LIZIZ)) && C729980SkG.LJIIIIZZ(this.LIZIZ) && ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).needShowAddOrRemoveButton()) {
                C1371600lnS c1371600lnS = this.LJFF;
                final Aweme aweme = this.LIZIZ;
                final String str = this.LJIIIIZZ;
                final String str2 = this.LJII;
                final C0HTT<C737030Svd> c0htt = this.LJI;
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(aweme, str, str2, c0htt) { // from class: X.0StW
                    public static final /* synthetic */ int LLILZIL = 0;
                    public final Aweme LL;
                    public final String LLILLJJLI;
                    public final String LLILLL;
                    public final WeakReference<C0HTT<C737030Svd>> LLILZ;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return R.raw.icon_playlist_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "play_list";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    public final boolean LIZ() {
                        C735280Sso c735280Sso = C735280Sso.LIZ;
                        Aweme aweme2 = this.LL;
                        c735280Sso.getClass();
                        if (C735280Sso.LJI(aweme2)) {
                            return true;
                        }
                        return C298660BnE.LIZ() && C735280Sso.LJIIIIZZ(this.LL);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return C735730StX.LIZ(this.LL);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return (((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIJL(this.LL) && LIZ()) ? 2131846232 : 2131825158;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        AwemeCommerceStruct commerceVideoAuthInfo;
                        return LIZ() && !this.LL.getPlaylistBlocked() && ((commerceVideoAuthInfo = this.LL.getCommerceVideoAuthInfo()) == null || commerceVideoAuthInfo.getDarkPostStatus() != 1);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                        boolean z;
                        C735280Sso c735280Sso = C735280Sso.LIZ;
                        Aweme aweme2 = this.LL;
                        c735280Sso.getClass();
                        boolean zLJIIIIZZ = C735280Sso.LJIIIIZZ(aweme2);
                        if (C735280Sso.LJI(this.LL) || (C298660BnE.LIZ() && zLJIIIIZZ)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.LL.getPlaylistBlocked()) {
                            ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIIZI(context);
                            return;
                        }
                        AwemeCommerceStruct commerceVideoAuthInfo = this.LL.getCommerceVideoAuthInfo();
                        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.getDarkPostStatus() == 1) {
                            C1233040iBy c1233040iBy = new C1233040iBy(context);
                            c1233040iBy.LIZIZ(2131830485);
                            c1233040iBy.LIZLLL();
                            return;
                        }
                        if (zLJIIIIZZ && !C298660BnE.LIZ()) {
                            C1233040iBy c1233040iBy2 = new C1233040iBy(context);
                            c1233040iBy2.LIZIZ(2131849242);
                            c1233040iBy2.LIZLLL();
                            return;
                        }
                        if (z) {
                            if (((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIJL(this.LL)) {
                                C737030Svd c737030Svd = new C737030Svd(56, this.LL);
                                c737030Svd.LJIIJ = this.LLILLL;
                                c737030Svd.LJIIL = this.LLILLJJLI;
                                C0HTT<C737030Svd> c0htt2 = this.LLILZ.get();
                                if (c0htt2 == null) {
                                    return;
                                }
                                c0htt2.LLIIL(c737030Svd);
                                return;
                            }
                            C737030Svd c737030Svd2 = new C737030Svd(55, this.LL);
                            c737030Svd2.LJIIJ = this.LLILLL;
                            c737030Svd2.LJIIL = this.LLILLJJLI;
                            C0HTT<C737030Svd> c0htt3 = this.LLILZ.get();
                            if (c0htt3 == null) {
                                return;
                            }
                            c0htt3.LLIIL(c737030Svd2);
                            return;
                        }
                        C1233040iBy c1233040iBy3 = new C1233040iBy(context);
                        c1233040iBy3.LIZIZ(2131850548);
                        c1233040iBy3.LIZLLL();
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }

                    {
                        this.LL = aweme;
                        this.LLILLJJLI = str;
                        this.LLILLL = str2;
                        this.LLILZ = new WeakReference<>(c0htt);
                    }
                }, this.LJIILL, this.LIZIZ.awemeACLShareInfo));
            }
        }
    }

    public final void LJJIJLIJ() {
        if (C1373290lqB.LIZ("privacy", this.LJIILL, this.LIZIZ.awemeACLShareInfo) && C729980SkG.LJIIIIZZ(this.LIZIZ)) {
            C1371600lnS c1371600lnS = this.LJFF;
            Aweme aweme = this.LIZIZ;
            c1371600lnS.LIZJ(C1373290lqB.LIZJ(new C1210450hbX(aweme, this.LJIIIIZZ, this.LJII), this.LJIILL, aweme.awemeACLShareInfo));
        }
    }

    public final void LJJIL() {
        if (C1373290lqB.LIZ("promote", this.LJIILL, this.LIZIZ.awemeACLShareInfo) && C1379360lzy.LIZIZ.contains(Integer.valueOf(this.LIZIZ.getHasPromoteEntry()))) {
            if ((Intrinsics.LJFF(this.LJIIIIZZ, "homepage_podcast") && C729980SkG.LJIIIIZZ(this.LIZIZ)) || LJFF() || !Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid(), AwemeExtKt.getAuthorUid(this.LIZIZ))) {
                return;
            }
            C733570Sq3.LIZ.getClass();
            final Integer numValueOf = C733570Sq3.LIZIZ ? Integer.valueOf(R.anim.fl) : null;
            ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class);
            C733650SqB.LIZ.getClass();
            if (TextUtils.equals(C733650SqB.LIZIZ, "promote")) {
                iCommercePromoteService.LJJIJIIJI(this.LIZIZ);
            }
            final C1891540zK4 c1891540zK4LJJIJ = iCommercePromoteService.LJJIJ(new InterfaceC1891550zK5() { // from class: X.0lzn
                @Override // X.InterfaceC1891550zK5
                public final String LIZIZ() {
                    return "myself";
                }

                @Override // X.InterfaceC1891550zK5
                public final String getEnterFrom() {
                    return "video";
                }

                @Override // X.InterfaceC1891550zK5
                public final Map<String, Object> getExtra() {
                    return null;
                }

                @Override // X.InterfaceC1891550zK5
                public final String getSchema() {
                    return null;
                }

                @Override // X.InterfaceC1891550zK5
                public final String LIZ() {
                    return this.LIZ.LJII;
                }

                @Override // X.InterfaceC1891550zK5
                public final Aweme getAweme() {
                    return this.LIZ.LIZIZ;
                }

                @Override // X.InterfaceC1891550zK5
                public final Context getContext() {
                    return this.LIZ.LIZLLL;
                }

                @Override // X.InterfaceC1891550zK5
                public final String getItemId() {
                    return this.LIZ.LIZIZ.getAid();
                }

                @Override // X.InterfaceC1891550zK5
                public final String getPageType() {
                    return this.LIZ.LJIIIIZZ;
                }
            });
            final ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) ServiceManager.get().getService(ICommercePromoteLogger.class);
            C1371600lnS c1371600lnS = this.LJFF;
            final Aweme aweme = this.LIZIZ;
            final String str = this.LJIIIIZZ;
            final String str2 = this.LJII;
            final Activity activity = this.LIZLLL;
            final C1379490m0B c1379490m0BLIZ = LIZ(this.LJIIZILJ, str, R.raw.icon_fire_4, R.raw.icon_fire_fill);
            c1371600lnS.LIZJ(new InterfaceC1370310llN(aweme, str, str2, numValueOf, activity, c1891540zK4LJJIJ, iCommercePromoteLogger, c1379490m0BLIZ) { // from class: X.0m0R
                public final Aweme LL;
                public final String LLILLJJLI;
                public final String LLILLL;
                public final Integer LLILZ;
                public final Activity LLILZIL;
                public final C0SCM LLILZLL;
                public final ICommercePromoteLogger LLIZ;
                public final InterfaceC1219880hqk LLIZLLLIL;

                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return R.raw.icon_2pt_fire;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJIIIZ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIJJLI() {
                    return 0;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJIL() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJJJIZL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJJL() {
                    return false;
                }

                @Override // X.InterfaceC1370450llb
                public final int LJJJJLI() {
                    return 100;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJLZIJ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return 2131845525;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "promote";
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    InterfaceC1219880hqk interfaceC1219880hqk = this.LLIZLLLIL;
                    return interfaceC1219880hqk != null ? interfaceC1219880hqk.LJII() : R.raw.icon_fire_fill;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    return C1379360lzy.LIZLLL.contains(Integer.valueOf(this.LL.getHasPromoteEntry()));
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    String strLJIJJ;
                    Activity activity2 = this.LLILZIL;
                    return (activity2 == null || (strLJIJJ = ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJIJJ(activity2, this.LL)) == null) ? "" : strLJIJJ;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIJJ(TextView textView) {
                    C1370320llO.LJ(this, textView);
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                    return C1370320llO.LIZJ(enumC1369720lkQ);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    String str3;
                    if (!enable()) {
                        Activity activity2 = this.LLILZIL;
                        if (activity2 != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activity2);
                            c1389890mGx.LJIIJ(this.LL.getPromoteToast());
                            c1389890mGx.LJIIJJI();
                        }
                    } else {
                        ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ().LIZ(this.LL.getAid());
                        C0SCM c0scm = this.LLILZLL;
                        if (c0scm != null) {
                            c0scm.open();
                        }
                    }
                    ICommercePromoteLogger iCommercePromoteLogger2 = this.LLIZ;
                    if (iCommercePromoteLogger2 != null) {
                        Aweme aweme2 = this.LL;
                        String str4 = this.LLILLL;
                        String str5 = this.LLILLJJLI;
                        C733570Sq3.LIZ.getClass();
                        if (C733570Sq3.LIZIZ()) {
                            str3 = "1";
                        } else {
                            str3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        iCommercePromoteLogger2.LJIIIZ(aweme2, "video", "myself", str4, str5, str3, null);
                    }
                    C666390QBx.LIZ = this.LL;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZLLL(context, baseSharePackage, this);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIJ(ImageView imageView, View view, int i) {
                    Integer num = this.LLILZ;
                    if (num != null) {
                        imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), num.intValue()));
                    }
                }

                {
                    this.LL = aweme;
                    this.LLILLJJLI = str;
                    this.LLILLL = str2;
                    this.LLILZ = numValueOf;
                    this.LLILZIL = activity;
                    this.LLILZLL = c1891540zK4LJJIJ;
                    this.LLIZ = iCommercePromoteLogger;
                    this.LLIZLLLIL = c1379490m0BLIZ;
                }
            });
            c1891540zK4LJJIJ.preload();
            iCommercePromoteLogger.LJIIJJI("video", this.LIZIZ, "myself", this.LJII, this.LJIIIIZZ, C733570Sq3.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT, null, null);
        }
    }

    public final void LJJIZ() {
        if (C1373290lqB.LIZ("promote_for_others", this.LJIILL, this.LIZIZ.awemeACLShareInfo) && C1379360lzy.LIZJ.contains(Integer.valueOf(this.LIZIZ.getHasPromoteEntry()))) {
            if ((TextUtils.equals(this.LJIIIIZZ, "homepage_hot") && !C1911600zqQ.LIZIZ.LJ()) || LJFF() || Intrinsics.LJFF(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid(), AwemeExtKt.getAuthorUid(this.LIZIZ))) {
                return;
            }
            C733570Sq3.LIZ.getClass();
            final Integer numValueOf = C733570Sq3.LIZIZ ? Integer.valueOf(R.anim.fl) : null;
            final C1891540zK4 c1891540zK4LJJIJ = ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJIJ(new InterfaceC1891550zK5() { // from class: X.0lzo
                @Override // X.InterfaceC1891550zK5
                public final String LIZIZ() {
                    return "others";
                }

                @Override // X.InterfaceC1891550zK5
                public final String getEnterFrom() {
                    return "video";
                }

                @Override // X.InterfaceC1891550zK5
                public final Map<String, Object> getExtra() {
                    return null;
                }

                @Override // X.InterfaceC1891550zK5
                public final String getSchema() {
                    return null;
                }

                @Override // X.InterfaceC1891550zK5
                public final String LIZ() {
                    return this.LIZ.LJII;
                }

                @Override // X.InterfaceC1891550zK5
                public final Aweme getAweme() {
                    return this.LIZ.LIZIZ;
                }

                @Override // X.InterfaceC1891550zK5
                public final Context getContext() {
                    return this.LIZ.LIZLLL;
                }

                @Override // X.InterfaceC1891550zK5
                public final String getItemId() {
                    return this.LIZ.LIZIZ.getAid();
                }

                @Override // X.InterfaceC1891550zK5
                public final String getPageType() {
                    return this.LIZ.LJIIIIZZ;
                }
            });
            final ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) ServiceManager.get().getService(ICommercePromoteLogger.class);
            C1371600lnS c1371600lnS = this.LJFF;
            final Aweme aweme = this.LIZIZ;
            final String str = this.LJIIIIZZ;
            final String str2 = this.LJII;
            final Activity activity = this.LIZLLL;
            final C1379490m0B c1379490m0BLIZ = LIZ(this.LJIIZILJ, str, R.raw.icon_fire_4, R.raw.icon_fire_fill);
            c1371600lnS.LIZJ(new InterfaceC1370310llN(aweme, str, str2, numValueOf, activity, c1891540zK4LJJIJ, iCommercePromoteLogger, c1379490m0BLIZ) { // from class: X.0m0Q
                public final Aweme LL;
                public final String LLILLJJLI;
                public final String LLILLL;
                public final Integer LLILZ;
                public final Activity LLILZIL;
                public final C0SCM LLILZLL;
                public final ICommercePromoteLogger LLIZ;
                public final InterfaceC1219880hqk LLIZLLLIL;

                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return R.raw.icon_2pt_fire;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJIIIZ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIJJLI() {
                    return 0;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJIL() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJJJIZL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJJL() {
                    return false;
                }

                @Override // X.InterfaceC1370450llb
                public final int LJJJJLI() {
                    return 100;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJLZIJ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return 2131845525;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "promote_for_others";
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    InterfaceC1219880hqk interfaceC1219880hqk = this.LLIZLLLIL;
                    return interfaceC1219880hqk != null ? interfaceC1219880hqk.LJII() : R.raw.icon_fire_fill;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    return this.LL.getHasPromoteEntry() == 1;
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    String strLJIJJ;
                    Activity activity2 = this.LLILZIL;
                    return (activity2 == null || (strLJIJJ = ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJIJJ(activity2, this.LL)) == null) ? "" : strLJIJJ;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIJJ(TextView textView) {
                    C1370320llO.LJ(this, textView);
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                    return C1370320llO.LIZJ(enumC1369720lkQ);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    C19EG c19eg;
                    FragmentManager supportFragmentManager;
                    List<Fragment> listLJJLIIIJL;
                    Fragment fragment;
                    if (!enable()) {
                        Activity activity2 = this.LLILZIL;
                        if (activity2 != null) {
                            if (C299060Bns.LIZ()) {
                                if ((activity2 instanceof C19EG) && (c19eg = (C19EG) activity2) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && (fragment = (Fragment) C13LP.LJJLIIIJL(listLJJLIIIJL)) != null) {
                                    C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                                    c1389880mGw.LJIIIZ(this.LL.getPromoteToast());
                                    c1389880mGw.LJIIJ();
                                }
                            } else {
                                C1389890mGx c1389890mGx = new C1389890mGx(activity2);
                                c1389890mGx.LJIIJ(this.LL.getPromoteToast());
                                c1389890mGx.LJIIJJI();
                            }
                        }
                    } else {
                        C0SCM c0scm = this.LLILZLL;
                        if (c0scm != null) {
                            c0scm.open();
                        }
                    }
                    ICommercePromoteLogger iCommercePromoteLogger2 = this.LLIZ;
                    if (iCommercePromoteLogger2 != null) {
                        iCommercePromoteLogger2.LJIIIZ(this.LL, "video", "others", this.LLILLL, this.LLILLJJLI, null, null);
                    }
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZIZ(this, view, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZLLL(context, baseSharePackage, this);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIJ(ImageView imageView, View view, int i) {
                    Integer num = this.LLILZ;
                    if (num != null) {
                        imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), num.intValue()));
                    }
                }

                {
                    this.LL = aweme;
                    this.LLILLJJLI = str;
                    this.LLILLL = str2;
                    this.LLILZ = numValueOf;
                    this.LLILZIL = activity;
                    this.LLILZLL = c1891540zK4LJJIJ;
                    this.LLIZ = iCommercePromoteLogger;
                    this.LLIZLLLIL = c1379490m0BLIZ;
                }
            });
            c1891540zK4LJJIJ.preload();
            iCommercePromoteLogger.LJIIJJI("video", this.LIZIZ, "others", this.LJII, this.LJIIIIZZ, null, null, null);
        }
    }

    public final void LJJJ() {
        if (TextUtils.equals(this.LJIIIIZZ, "homepage_hot") && C1379360lzy.LIZJ.contains(Integer.valueOf(this.LIZIZ.getHasPromoteEntry()))) {
            ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class);
            if (iCommercePromoteService.LJFF() && !Intrinsics.LJFF(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid(), AwemeExtKt.getAuthorUid(this.LIZIZ))) {
                C733570Sq3.LIZ.getClass();
                final Integer numValueOf = C733570Sq3.LIZIZ ? Integer.valueOf(R.anim.fl) : null;
                final C1891540zK4 c1891540zK4LJJIJ = iCommercePromoteService.LJJIJ(new InterfaceC1891550zK5() { // from class: X.0lzp
                    @Override // X.InterfaceC1891550zK5
                    public final String LIZIZ() {
                        return "others";
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final String getEnterFrom() {
                        return "video";
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final Map<String, Object> getExtra() {
                        return null;
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final String getSchema() {
                        return null;
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final String LIZ() {
                        return this.LIZ.LJII;
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final Aweme getAweme() {
                        return this.LIZ.LIZIZ;
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final Context getContext() {
                        return this.LIZ.LIZLLL;
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final String getItemId() {
                        return this.LIZ.LIZIZ.getAid();
                    }

                    @Override // X.InterfaceC1891550zK5
                    public final String getPageType() {
                        return this.LIZ.LJIIIIZZ;
                    }
                });
                final ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) ServiceManager.get().getService(ICommercePromoteLogger.class);
                C1371600lnS c1371600lnS = this.LJFF;
                final Aweme aweme = this.LIZIZ;
                final String str = this.LJIIIIZZ;
                final String str2 = this.LJII;
                final Activity activity = this.LIZLLL;
                final C1379490m0B c1379490m0BLIZ = LIZ(this.LJIIZILJ, str, R.raw.icon_fire_4, R.raw.icon_fire_fill);
                c1371600lnS.LIZJ(new InterfaceC1370310llN(aweme, str, str2, numValueOf, activity, c1891540zK4LJJIJ, iCommercePromoteLogger, c1379490m0BLIZ) { // from class: X.0m0P
                    public final Aweme LL;
                    public final String LLILLJJLI;
                    public final String LLILLL;
                    public final Integer LLILZ;
                    public final Activity LLILZIL;
                    public final C0SCM LLILZLL;
                    public final ICommercePromoteLogger LLIZ;
                    public final InterfaceC1219880hqk LLIZLLLIL;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return R.raw.icon_2pt_fire;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return 2131845525;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "promote_for_others_fyp";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                        ICommercePromoteLogger iCommercePromoteLogger2 = this.LLIZ;
                        if (iCommercePromoteLogger2 != null) {
                            iCommercePromoteLogger2.LJIIJJI("video", this.LL, "others", this.LLILLL, this.LLILLJJLI, null, null, null);
                        }
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        InterfaceC1219880hqk interfaceC1219880hqk = this.LLIZLLLIL;
                        return interfaceC1219880hqk != null ? interfaceC1219880hqk.LJII() : R.raw.icon_fire_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return this.LL.getHasPromoteEntry() == 1;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        String strLJIJJ;
                        Activity activity2 = this.LLILZIL;
                        return (activity2 == null || (strLJIJJ = ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJIJJ(activity2, this.LL)) == null) ? "" : strLJIJJ;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                        C19EG c19eg;
                        FragmentManager supportFragmentManager;
                        List<Fragment> listLJJLIIIJL;
                        Fragment fragment;
                        if (!enable()) {
                            Activity activity2 = this.LLILZIL;
                            if (activity2 != null) {
                                if (C299060Bns.LIZ()) {
                                    if ((activity2 instanceof C19EG) && (c19eg = (C19EG) activity2) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && (fragment = (Fragment) C13LP.LJJLIIIJL(listLJJLIIIJL)) != null) {
                                        C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                                        c1389880mGw.LJIIIZ(this.LL.getPromoteToast());
                                        c1389880mGw.LJIIJ();
                                    }
                                } else {
                                    C1389890mGx c1389890mGx = new C1389890mGx(activity2);
                                    c1389890mGx.LJIIJ(this.LL.getPromoteToast());
                                    c1389890mGx.LJIIJJI();
                                }
                            }
                        } else {
                            C0SCM c0scm = this.LLILZLL;
                            if (c0scm != null) {
                                c0scm.open();
                            }
                        }
                        ICommercePromoteLogger iCommercePromoteLogger2 = this.LLIZ;
                        if (iCommercePromoteLogger2 != null) {
                            iCommercePromoteLogger2.LJIIIZ(this.LL, "video", "others", this.LLILLL, this.LLILLJJLI, null, null);
                        }
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                        Integer num = this.LLILZ;
                        if (num != null) {
                            imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), num.intValue()));
                        }
                    }

                    {
                        this.LL = aweme;
                        this.LLILLJJLI = str;
                        this.LLILLL = str2;
                        this.LLILZ = numValueOf;
                        this.LLILZIL = activity;
                        this.LLILZLL = c1891540zK4LJJIJ;
                        this.LLIZ = iCommercePromoteLogger;
                        this.LLIZLLLIL = c1379490m0BLIZ;
                    }
                });
                c1891540zK4LJJIJ.preload();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI() {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379140lzc.LJJJI():void");
    }

    public final void LJJJIL() {
        if (!C1373290lqB.LIZ("report", this.LJIILL, this.LIZIZ.awemeACLShareInfo) || C729980SkG.LJIIIIZZ(this.LIZIZ) || this.LIZJ) {
            return;
        }
        C1371600lnS c1371600lnS = this.LJFF;
        Aweme aweme = this.LIZIZ;
        c1371600lnS.LIZJ(C1373290lqB.LIZJ(new C736320SuU(aweme, this.LJI, this.LJIIIIZZ, this.LJII), this.LJIILL, aweme.awemeACLShareInfo));
    }

    public final void LJJJJ() {
        C1371600lnS c1371600lnS = this.LJFF;
        Aweme aweme = this.LIZIZ;
        c1371600lnS.LIZJ(C1373290lqB.LIZJ(new C736320SuU(aweme, this.LJI, this.LJIIIIZZ, this.LJII, this.LIZLLL, this.LJ), this.LJIILL, aweme.awemeACLShareInfo));
    }

    public final void LJJJJI() {
        Bundle bundle;
        String string;
        SharePackage sharePackage = this.LJIIZILJ;
        String str = "";
        if (sharePackage != null && (bundle = sharePackage.extras) != null && (string = bundle.getString("tab_name", "")) != null) {
            str = string;
        }
        String str2 = C1369870lkf.LJJIJIIJIL;
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService != null) {
            InterfaceC1370310llN interfaceC1370310llNLL = iSearchService.LL(str2, this.LJIIIIZZ, str, this.LIZIZ);
            if (interfaceC1370310llNLL != null) {
                this.LJFF.LIZJ(C1373290lqB.LIZJ(interfaceC1370310llNLL, this.LJIILL, this.LIZIZ.awemeACLShareInfo));
            }
        }
    }

    public final void LJJJJIZL() {
        Aweme aweme;
        if (!C1373290lqB.LIZ("share_to_story", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            EnumC729530SjX enumC729530SjX = EnumC729530SjX.SHARE_PANEL_ACL;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(enumC729530SjX.getId(), "reason");
            C20684815ws.LJIILLIIL("share_to_story_entrance_not_showing", c2344009Gk.LIZ);
            return;
        }
        if (C1618440sDa.LIZIZ.LJIJJLI().LJIJI(this.LIZIZ, false)) {
            if (!Intrinsics.LJFF(this.LJIILL, "share_panel") || !C298550Bn3.LIZ() || (aweme = this.LIZIZ) == null || AwemeSaaSExtKt.isLive(aweme)) {
                C1371600lnS c1371600lnS = this.LJFF;
                Aweme aweme2 = this.LIZIZ;
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new C1364420lbs(aweme2, this.LJIIIIZZ), this.LJIILL, aweme2.awemeACLShareInfo));
            }
        }
    }

    public final void LJJJJJ() {
        Bundle bundle;
        final String string;
        Bundle bundle2;
        SharePackage sharePackage = this.LJIIZILJ;
        if (sharePackage == null || (bundle = sharePackage.extras) == null || (string = bundle.getString("conversation_id")) == null) {
            return;
        }
        SharePackage sharePackage2 = this.LJIIZILJ;
        final String string2 = (sharePackage2 == null || (bundle2 = sharePackage2.extras) == null) ? null : bundle2.getString("chat_type");
        Bundle arguments = this.LJ.getArguments();
        String string3 = arguments != null ? arguments.getString("previous_page") : null;
        Bundle arguments2 = this.LJ.getArguments();
        Integer numValueOf = arguments2 != null ? Integer.valueOf(arguments2.getInt("msg_type")) : null;
        final EnumC1381750m3p enumC1381750m3p = !Intrinsics.LJFF(string3, "chat_settings") ? null : (numValueOf == null || numValueOf.intValue() != 1809) ? EnumC1381750m3p.PRIVATE_MEDIA : EnumC1381750m3p.SHARED_VIDEO;
        C1371600lnS c1371600lnS = this.LJFF;
        String imItemId = AwemeBizExtKt.getImItemId(this.LIZIZ);
        final Long lLJIILIIL = imItemId != null ? C2095008Iq.LJIILIIL(imItemId) : null;
        c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(lLJIILIIL, string, string2, enumC1381750m3p) { // from class: X.0m0V
            public static final /* synthetic */ int LLILZIL = 0;
            public final Long LL;
            public final String LLILLJJLI;
            public final String LLILLL;
            public final EnumC1381750m3p LLILZ;

            @Override // X.InterfaceC1370310llN
            public final float LIZLLL() {
                return -1.0f;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJI() {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJII() {
                return R.raw.icon_bubble_ellipsis_right_fill;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIIIZZ() {
                return R.raw.icon_bubble_ellipsis_right_fill;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJIILJJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIJJLI() {
                return 0;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIJ(ImageView imageView, View view, int i) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJIL() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String LJJIZ() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJI(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJJJIZL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJJL() {
                return false;
            }

            @Override // X.InterfaceC1370450llb
            public final int LJJJJLI() {
                return 100;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJLZIJ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJLIIIJJIZ() {
                return 2131832156;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJLIIIJL() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String key() {
                return "show_in_chat";
            }

            @Override // X.InterfaceC1370310llN
            public final String label() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIJJI() {
                return !enable() ? 1 : 0;
            }

            @Override // X.InterfaceC1370310llN
            public final C0M7Z LJIIJ() {
                return C0M7Z.ShareButton;
            }

            @Override // X.InterfaceC1370310llN
            public final EnumC1216710hld LJJJZ() {
                return EnumC1216710hld.NORMAL;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIJJ(TextView textView) {
                C1370320llO.LJ(this, textView);
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                return C1370320llO.LIZJ(enumC1369720lkQ);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                IIMMediaGridAnalytics iIMMediaGridAnalytics = (IIMMediaGridAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMediaGridAnalytics.class, false, false, false, 14, null);
                if (iIMMediaGridAnalytics != null) {
                    iIMMediaGridAnalytics.LIZ("ttsocial_show_in_chat_btn_click", iIMMediaGridAnalytics.LIZIZ("chat_settings", this.LLILLJJLI, EnumC1379720m0Y.LONG_PRESS, this.LLILLL, this.LLILZ), C0I0B.LJFF.LIZIZ());
                }
                C1336205Ku.LIZ(false).getImChatService().LJIIZILJ(context, this.LL, this.LLILLJJLI);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZLLL(context, baseSharePackage, this);
            }

            {
                this.LL = lLJIILIIL;
                this.LLILLJJLI = string;
                this.LLILLL = string2;
                this.LLILZ = enumC1381750m3p;
            }
        }, this.LJIILL, this.LIZIZ.awemeACLShareInfo));
    }

    public final void LJJJJJL() {
        if (C1373290lqB.LIZ("video_tag_edit", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            if (Intrinsics.LJFF(this.LJIIIIZZ, "homepage_podcast") && C729980SkG.LJIIIIZZ(this.LIZIZ)) {
                return;
            }
            if ((C298710BnJ.LIZ() || C298690BnH.LIZIZ()) && C729980SkG.LJIIIIZZ(this.LIZIZ)) {
                C1371600lnS c1371600lnS = this.LJFF;
                final Aweme aweme = this.LIZIZ;
                final String str = this.LJIIIIZZ;
                final String str2 = this.LJII;
                final String strLJIIIZ = LJIIIZ(aweme);
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(str, str2, strLJIIIZ, aweme) { // from class: X.0Ss3
                    public final Aweme LL;
                    public final String LLILLJJLI;
                    public final String LLILLL;
                    public final String LLILZ;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return R.raw.icon_person_pen_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return R.raw.icon_2pt_person_plus;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return 2131849585;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "video_tag_edit";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                        String aid;
                        String authorUid;
                        int privateStatus = 0;
                        List<InteractionTagUserInfo> list = null;
                        if (C298690BnH.LIZJ()) {
                            Activity activityLIZ = C0FNT.LIZ(context);
                            if (activityLIZ != null && (activityLIZ instanceof C19EG)) {
                                C737450SwJ c737450SwJ = C737450SwJ.LIZIZ;
                                C19EG c19eg = (C19EG) activityLIZ;
                                String str3 = this.LLILLJJLI;
                                Aweme aweme2 = this.LL;
                                AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme2);
                                if (statusSafety != null) {
                                    privateStatus = statusSafety.getPrivateStatus();
                                }
                                InteractionTagInfo interactionTagInfo = this.LL.getInteractionTagInfo();
                                if (interactionTagInfo != null) {
                                    list = interactionTagInfo.taggedUsers;
                                }
                                c737450SwJ.LIZLLL(c19eg, str3, aweme2, privateStatus, list, new C734090Sqt(this));
                            }
                        } else {
                            Activity activityLIZ2 = C0FNT.LIZ(context);
                            if (activityLIZ2 != null && (activityLIZ2 instanceof C19EG)) {
                                C737450SwJ c737450SwJ2 = C737450SwJ.LIZIZ;
                                String str4 = this.LLILLJJLI;
                                Aweme aweme3 = this.LL;
                                AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme3);
                                if (statusSafety2 != null) {
                                    privateStatus = statusSafety2.getPrivateStatus();
                                }
                                InteractionTagInfo interactionTagInfo2 = this.LL.getInteractionTagInfo();
                                if (interactionTagInfo2 != null) {
                                    list = interactionTagInfo2.taggedUsers;
                                }
                                c737450SwJ2.LIZJ(activityLIZ2, str4, aweme3, privateStatus, list, new OnActivityResultCallback() { // from class: X.0Ss4
                                    @Override // com.bytedance.router.OnActivityResultCallback
                                    public final void onActivityResult(int i, int i2, Intent intent) {
                                    }
                                });
                            }
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
                        c2344009Gk.LJIIIIZZ("enter_method", this.LLILLL);
                        Aweme aweme4 = this.LL;
                        String str5 = "";
                        if (aweme4 == null || (aid = aweme4.getAid()) == null) {
                            aid = "";
                        }
                        c2344009Gk.LJIIIIZZ("group_id", aid);
                        Aweme aweme5 = this.LL;
                        if (aweme5 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme5)) != null) {
                            str5 = authorUid;
                        }
                        c2344009Gk.LJIIIIZZ("author_id", str5);
                        c2344009Gk.LJIIIIZZ("click_type", "click_edit");
                        c2344009Gk.LJIIIIZZ("anchor_type", this.LLILZ);
                        C20684815ws.LJIILLIIL("click_tag_edit", c2344009Gk.LIZ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }

                    {
                        this.LL = aweme;
                        this.LLILLJJLI = str;
                        this.LLILLL = str2;
                        this.LLILZ = strLJIIIZ;
                    }
                }, this.LJIILL, this.LIZIZ.awemeACLShareInfo));
            }
        }
    }

    public final void LJJJJL() {
        List<InteractionTagUserInfo> list;
        if (C1373290lqB.LIZ("video_tag_remove", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            InteractionTagInfo interactionTagInfo = this.LIZIZ.getInteractionTagInfo();
            boolean zLJIIZILJ = (interactionTagInfo == null || (list = interactionTagInfo.taggedUsers) == null || !(list.isEmpty() ^ true)) ? false : C10EU.LJIIZILJ(((InteractionTagUserInfo) ListProtector.get(list, 0)).uid);
            if ((C298710BnJ.LIZIZ() > 0 || C298690BnH.LIZIZ()) && zLJIIZILJ) {
                C1371600lnS c1371600lnS = this.LJFF;
                final Aweme aweme = this.LIZIZ;
                final String str = this.LJIIIIZZ;
                final String str2 = this.LJII;
                final String strLJIIIZ = LJIIIZ(aweme);
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(str, str2, strLJIIIZ, aweme) { // from class: X.0SsE
                    public final Aweme LL;
                    public final String LLILLJJLI;
                    public final String LLILLL;
                    public final String LLILZ;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return R.raw.icon_person_x_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return R.raw.icon_2pt_person_x_mark;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return 2131849588;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "video_tag_remove";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                        String aid;
                        String authorUid;
                        Activity activityLIZ = C0FNT.LIZ(context);
                        if (activityLIZ != null && (activityLIZ instanceof C19EG)) {
                            C737450SwJ.LIZIZ.LJI((C19EG) activityLIZ, this.LL, this.LLILLJJLI, this.LLILZ);
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
                        c2344009Gk.LJIIIIZZ("panel_source", this.LLILLL);
                        Aweme aweme2 = this.LL;
                        String str3 = "";
                        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                            aid = "";
                        }
                        c2344009Gk.LJIIIIZZ("group_id", aid);
                        Aweme aweme3 = this.LL;
                        if (aweme3 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme3)) != null) {
                            str3 = authorUid;
                        }
                        c2344009Gk.LJIIIIZZ("author_id", str3);
                        c2344009Gk.LJIIIIZZ("click_type", "click_remove");
                        c2344009Gk.LJIIIIZZ("anchor_type", this.LLILZ);
                        C20684815ws.LJIILLIIL("click_tag_edit", c2344009Gk.LIZ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }

                    {
                        this.LL = aweme;
                        this.LLILLJJLI = str;
                        this.LLILLL = str2;
                        this.LLILZ = strLJIIIZ;
                    }
                }, this.LJIILL, this.LIZIZ.awemeACLShareInfo));
            }
        }
    }

    public final void LJJJJLI() {
        int stitch;
        if (C1373290lqB.LIZ("stitch", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            if (this.LIZIZ.getAuthor() == null || !this.LIZIZ.getAuthor().isSecret() || C729980SkG.LJIIIIZZ(this.LIZIZ)) {
                InteractPermission interactPermission = this.LIZIZ.getInteractPermission();
                if (interactPermission != null) {
                    stitch = interactPermission.getStitch();
                    if (stitch == 4) {
                        return;
                    }
                } else {
                    stitch = 0;
                }
                if ((!C729980SkG.LJIIIIZZ(this.LIZIZ) && (stitch == 2 || this.LIZJ)) || Intrinsics.LJFF(this.LJIIIIZZ, "homepage_podcast") || C10IT.LJIIIZ(this.LIZIZ) || !AwemeExtKt.canStitchVideoType(this.LIZIZ) || this.LIZIZ.isWithPromotionalMusic() || this.LIZIZ.getStitchSetting() == 2) {
                    return;
                }
                C1371600lnS c1371600lnS = this.LJFF;
                final Aweme aweme = this.LIZIZ;
                final String str = this.LJIIIIZZ;
                final String str2 = this.LJII;
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(aweme, str, str2) { // from class: X.0m0e
                    public static final /* synthetic */ int LLILZ = 0;
                    public final Aweme LL;
                    public final String LLILLJJLI;
                    public final String LLILLL;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return R.raw.icon_stitch_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return R.raw.icon_2pt_stitch;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return 2131847909;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "stitch";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        VideoUrlModel playAddr;
                        int stitchSetting;
                        boolean zLIZLLL = C10IT.LIZLLL(this.LL);
                        Aweme aweme2 = this.LL;
                        boolean z = aweme2.getAuthor() != null && ((stitchSetting = aweme2.getAuthor().getStitchSetting()) == 0 || (stitchSetting == 1 && aweme2.getAuthor() != null && aweme2.getAuthor().getFollowStatus() == 2));
                        InteractPermission interactPermission2 = this.LL.getInteractPermission();
                        int stitch2 = interactPermission2 != null ? interactPermission2.getStitch() : 0;
                        boolean z2 = this.LL.getAwemeType() == 150;
                        Video video = this.LL.getVideo();
                        boolean zIsHaveHdr = (video == null || (playAddr = video.getPlayAddr()) == null) ? false : playAddr.isHaveHdr();
                        if (!zLIZLLL || stitch2 == 3) {
                            return false;
                        }
                        if (C729980SkG.LJIIIIZZ(this.LL) || (z && stitch2 != 1)) {
                            return ((this.LL.getAuthor().isSecret() && !C729980SkG.LJIIIIZZ(this.LL)) || ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZJ(this.LL.getMusic()) || zIsHaveHdr || z2) ? false : true;
                        }
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                        if (this.LL.isAd() && enable()) {
                            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", this.LL.getAwemeRawAd());
                            c1022820ciuLIZLLL.LIZJ("stitch", "refer");
                            c1022820ciuLIZLLL.LJII();
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
                    
                        if (r1 == false) goto L37;
                     */
                    @Override // X.InterfaceC1370310llN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJIILIIL(android.content.Context r6, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7) {
                        /*
                            Method dump skipped, instruction units count: 338
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1379780m0e.LJIILIIL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }

                    {
                        this.LL = aweme;
                        this.LLILLJJLI = str;
                        this.LLILLL = str2;
                    }
                }, this.LJIILL, aweme.awemeACLShareInfo));
            }
        }
    }

    public final void LJJJJLL() {
        if (C1373290lqB.LIZ("bc_view_insights", this.LJIILL, this.LIZIZ.awemeACLShareInfo)) {
            if (!(Intrinsics.LJFF(this.LJIIIIZZ, "homepage_podcast") && C729980SkG.LJIIIIZZ(this.LIZIZ)) && ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LIZIZ(this.LIZIZ, this.LJIIIIZZ)) {
                C1371600lnS c1371600lnS = this.LJFF;
                final Aweme aweme = this.LIZIZ;
                c1371600lnS.LIZJ(C1373290lqB.LIZJ(new InterfaceC1370310llN(aweme) { // from class: X.0e81
                    public final Aweme LL;

                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return R.raw.icon_line_chart_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return R.raw.icon_2pt_line_chart;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return 2131827287;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "bc_view_insights";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    {
                        this.LL = aweme;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                        ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LIZLLL(context, this.LL);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }
                }, this.LJIILL, aweme.awemeACLShareInfo));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0b27  */
    /* JADX WARN: Type inference failed for: r1v342, types: [X.0lzz] */
    /* JADX WARN: Type inference failed for: r2v85, types: [X.0lzj] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZI() {
        /*
            Method dump skipped, instruction units count: 3007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379140lzc.LJJJJZI():void");
    }

    public final void LJIJJLI() {
        if (LJIILJJIL()) {
            return;
        }
        InterfaceC1370310llN interfaceC1370310llNLIZ = C1376680lve.LIZ(this.LIZLLL, this.LJIIIIZZ, this.LIZIZ, this.LJIILL);
        if (interfaceC1370310llNLIZ != null) {
            this.LJFF.LIZJ(interfaceC1370310llNLIZ);
        }
    }

    public final void LJJII() {
        if (LJ()) {
            C1371600lnS c1371600lnS = this.LJFF;
            Aweme aweme = this.LIZIZ;
            c1371600lnS.LIZJ(C1373290lqB.LIZJ(new C737310Sw5(aweme, this.LJIIIIZZ), this.LJIILL, aweme.awemeACLShareInfo));
        }
    }

    public final void LJJIJIIJIL() {
        InterfaceC1370310llN interfaceC1370310llNLJJLIIIIJ;
        if (LJFF() || (interfaceC1370310llNLJJLIIIIJ = C621180OYa.LIZIZ.LJJLIIIIJ(this.LIZLLL, this.LIZIZ, "live_photo", this.LJII, this.LJIIIIZZ, this.LJIILL)) == null) {
            return;
        }
        this.LJFF.LIZJ(interfaceC1370310llNLJJLIIIIJ);
    }

    public final void LJJJJZ() {
        InterfaceC1370310llN interfaceC1370310llNLJIIJJI = LJIIJJI();
        if (interfaceC1370310llNLJIIJJI != null) {
            this.LJFF.LIZJ(C1373290lqB.LIZJ(interfaceC1370310llNLJIIJJI, this.LJIILL, this.LIZIZ.awemeACLShareInfo));
        }
    }

    public static final EnumC1379230lzl LIZJ(InterfaceC1370310llN interfaceC1370310llN) {
        if (interfaceC1370310llN == null) {
            return EnumC1379230lzl.HIDE;
        }
        if (interfaceC1370310llN.enable()) {
            return EnumC1379230lzl.SHOW;
        }
        return EnumC1379230lzl.DISABLE;
    }

    public static String LJIIIZ(Aweme aweme) {
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (interactionTagInfo != null) {
            int i = interactionTagInfo.interestLevel;
            if (i == InteractionTagInterestLevel.LOW.getLevel()) {
                return "low_interest";
            }
            if (i == InteractionTagInterestLevel.HIGH.getLevel()) {
                return "high_interest";
            }
            return "";
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.util.List<X.InterfaceC1370310llN> r5) {
        /*
            r4 = this;
            X.0rjG r1 = X.C1599640rjG.LIZIZ
            androidx.fragment.app.Fragment r0 = r4.LJ
            boolean r0 = r1.Pu(r0)
            r2 = 0
            if (r0 == 0) goto L21
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L1e
            java.util.List<java.lang.String> r3 = X.C1379140lzc.LJJ
        L13:
            kotlin.jvm.internal.AwS592S0100000_13 r1 = new kotlin.jvm.internal.AwS592S0100000_13
            r0 = 74
            r1.<init>(r3, r0)
            X.C19719612Di.LJJIIJ(r5, r1, r2)
        L1d:
            return
        L1e:
            java.util.List<java.lang.String> r3 = X.C1379140lzc.LJIJJ
            goto L13
        L21:
            androidx.fragment.app.Fragment r0 = r4.LJ
            boolean r0 = X.C1389300mG0.LJIILLIIL(r0)
            if (r0 == 0) goto L2c
            java.util.List<java.lang.String> r3 = X.C1379140lzc.LJJIFFI
            goto L13
        L2c:
            boolean r0 = X.C296380BjY.LIZ()
            if (r0 == 0) goto L51
            androidx.fragment.app.Fragment r0 = r4.LJ
            boolean r0 = X.C1389300mG0.LJIILIIL(r0)
            if (r0 == 0) goto L51
            java.util.Set<java.lang.String> r0 = X.C0T54.LIZ
            java.lang.String r1 = X.C1246920iYM.LIZIZ
            if (r1 == 0) goto L51
            int r0 = r1.length()
            if (r0 <= 0) goto L51
            java.util.Set<java.lang.String> r0 = X.C0T54.LIZ
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L51
            java.util.List<java.lang.String> r3 = X.C1379140lzc.LJJIFFI
            goto L13
        L51:
            androidx.fragment.app.Fragment r0 = r4.LJ
            boolean r0 = X.C1389300mG0.LJIILIIL(r0)
            if (r0 == 0) goto L68
            java.util.List<java.lang.String> r1 = X.C1379140lzc.LJJI
            java.lang.String r0 = "repost"
            java.util.List r1 = X.C13LP.LJLILLLLZI(r0, r1)
            java.lang.String r0 = "ai_remix"
            java.util.List r3 = X.C13LP.LJLILLLLZI(r0, r1)
            goto L13
        L68:
            androidx.fragment.app.Fragment r0 = r4.LJ
            boolean r0 = X.C1389300mG0.LJIILJJIL(r0)
            if (r0 == 0) goto L1d
            java.util.List<java.lang.String> r3 = X.C1379140lzc.LJJI
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379140lzc.LJIIIIZZ(java.util.List):void");
    }

    public final boolean LJIILIIL(boolean z) {
        boolean zPu = C1599640rjG.LIZIZ.Pu(this.LJ);
        boolean zLJIIJ = C1389300mG0.LJIIJ(this.LJ);
        boolean zLJIIL = C1389300mG0.LJIIL(this.LJ);
        if (!z) {
            zLJIIJ = zLJIIL;
        }
        if (!zPu && !zLJIIJ) {
            return false;
        }
        return true;
    }

    public final List LJIIJ(C1379210lzj c1379210lzj, C1379370lzz c1379370lzz) {
        String string;
        String string2;
        Long lValueOf;
        String string3;
        String string4;
        Integer numValueOf;
        String string5;
        boolean z;
        InterfaceC1370310llN interfaceC1370310llNLIZIZ;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        Bundle bundle7;
        Bundle bundle8;
        Bundle bundle9;
        SharePackage sharePackage = this.LJIIZILJ;
        if (sharePackage != null && (bundle9 = sharePackage.extras) != null) {
            bundle9.getBoolean("isVideoHolder");
        }
        SharePackage sharePackage2 = this.LJIIZILJ;
        if (sharePackage2 == null || (bundle8 = sharePackage2.extras) == null || (string = bundle8.getString("tab_name", "")) == null) {
            string = "";
        }
        Aweme aweme = this.LIZIZ;
        String str = this.LJIIIIZZ;
        String str2 = this.LJII;
        String str3 = this.LJIILIIL;
        Activity activity = this.LIZLLL;
        Fragment fragment = this.LJ;
        SharePackage sharePackage3 = this.LJIIZILJ;
        if (sharePackage3 != null && (bundle7 = sharePackage3.extras) != null) {
            string2 = bundle7.getString("explore_from_group_id", "");
        } else {
            string2 = null;
        }
        SharePackage sharePackage4 = this.LJIIZILJ;
        if (sharePackage4 != null && (bundle6 = sharePackage4.extras) != null) {
            lValueOf = Long.valueOf(bundle6.getLong("explore_topic_id", 0L));
        } else {
            lValueOf = null;
        }
        SharePackage sharePackage5 = this.LJIIZILJ;
        if (sharePackage5 != null && (bundle5 = sharePackage5.extras) != null) {
            string3 = bundle5.getString("explore_topic", "");
        } else {
            string3 = null;
        }
        SharePackage sharePackage6 = this.LJIIZILJ;
        if (sharePackage6 != null && (bundle4 = sharePackage6.extras) != null) {
            string4 = bundle4.getString("from_explore_page", "");
        } else {
            string4 = null;
        }
        SharePackage sharePackage7 = this.LJIIZILJ;
        if (sharePackage7 != null && (bundle3 = sharePackage7.extras) != null) {
            numValueOf = Integer.valueOf(bundle3.getInt("is_enter_graphic_detail", 0));
        } else {
            numValueOf = null;
        }
        SharePackage sharePackage8 = this.LJIIZILJ;
        if (sharePackage8 != null && (bundle2 = sharePackage8.extras) != null) {
            string5 = bundle2.getString("video_from", "");
        } else {
            string5 = null;
        }
        SharePackage sharePackage9 = this.LJIIZILJ;
        if (sharePackage9 != null && (bundle = sharePackage9.extras) != null) {
            z = bundle.getBoolean("isTakoAiVideo");
        } else {
            z = false;
        }
        C1379170lzf c1379170lzf = new C1379170lzf(aweme, str, str2, str3, activity, fragment, string, c1379210lzj, c1379370lzz, string2, lValueOf, string3, string4, numValueOf, string5, z, 64);
        ArrayList arrayList = new ArrayList();
        InterfaceC1370310llN interfaceC1370310llNLJIIJJI = LJIIJJI();
        if (interfaceC1370310llNLJIIJJI != null) {
            arrayList.add(interfaceC1370310llNLJIIJJI);
        }
        if (C1371040lmY.LIZ() && !C729980SkG.LJIIIIZZ(this.LIZIZ) && (interfaceC1370310llNLIZIZ = LIZIZ()) != null) {
            arrayList.add(interfaceC1370310llNLIZIZ);
        }
        C1379160lze c1379160lze = C1379160lze.LIZ;
        List<AbstractC1373870lr7> listLJ = c1379170lzf.LJ(null);
        c1379160lze.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC1373870lr7 abstractC1373870lr7 : (ArrayList) listLJ) {
            if (abstractC1373870lr7 instanceof C1373880lr8) {
                arrayList2.add(new C1376800lvq((C1373880lr8) abstractC1373870lr7));
            } else if (abstractC1373870lr7 instanceof C1373910lrB) {
                arrayList2.add(new C1376780lvo((C1373910lrB) abstractC1373870lr7));
            } else if (abstractC1373870lr7 instanceof C1373790lqz) {
                arrayList2.add(new C1376790lvp((C1373790lqz) abstractC1373870lr7));
            } else if (abstractC1373870lr7 instanceof C1376720lvi) {
                arrayList2.add(new C1376770lvn((C1376720lvi) abstractC1373870lr7));
            } else if (abstractC1373870lr7 instanceof C1373800lr0) {
                arrayList2.add(new C1376860lvw((C1373800lr0) abstractC1373870lr7));
            } else if (abstractC1373870lr7 instanceof C1379390m01) {
                arrayList2.add(new C1379950m0v((C1379390m01) abstractC1373870lr7));
            } else if (abstractC1373870lr7 instanceof C1379440m06) {
                arrayList2.add(new InterfaceC1370310llN() { // from class: X.0M80
                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return -1;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return -1;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 1;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return -1;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "share_channel";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.LongPress;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }
                });
            }
        }
        return C13LP.LJLIL(arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0m0B] */
    public static C1379490m0B LIZ(SharePackage sharePackage, String str, final int i, final int i2) {
        C1379120lza.LIZ.getClass();
        if (!C1379120lza.LIZLLL(sharePackage, str)) {
            return null;
        }
        return new InterfaceC1219880hqk() { // from class: X.0m0B
            @Override // X.InterfaceC1219880hqk
            public final int LJII() {
                return i2;
            }

            @Override // X.InterfaceC1219880hqk
            public final int LJIIIIZZ() {
                return i;
            }
        };
    }

    public static final C1381570m3X LIZLLL(C1379140lzc c1379140lzc, long j, String str, EnumC1379230lzl enumC1379230lzl) {
        String uid;
        String imprId;
        String aid = c1379140lzc.LIZIZ.getAid();
        String str2 = "";
        if (aid == null) {
            aid = "";
        }
        LogPbBean logPbBean = c1379140lzc.LIZIZ.getLogPbBean();
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
            str2 = imprId;
        }
        String strValueOf = String.valueOf(j);
        User author = c1379140lzc.LIZIZ.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        return new C1381570m3X(aid, str, str2, enumC1379230lzl, strValueOf, uid);
    }

    public C1379140lzc(Aweme aweme, boolean z, Activity activity, Fragment fragment, C1371600lnS c1371600lnS, C0HTT<C737030Svd> c0htt, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, boolean z2, String str8, EnumC1369720lkQ enumC1369720lkQ, SharePackage sharePackage) {
        this.LIZ = new C1379240lzm(c1371600lnS);
        this.LIZIZ = aweme;
        this.LIZJ = z;
        this.LIZLLL = activity;
        this.LJ = fragment;
        this.LJFF = c1371600lnS;
        this.LJI = c0htt;
        this.LJII = str;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = str3;
        this.LJIIJ = str4;
        this.LJIIJJI = str5;
        this.LJIIL = str6;
        this.LJIILIIL = str7;
        this.LJIILJJIL = z2;
        this.LJIILL = str8;
        this.LJIILLIIL = enumC1369720lkQ;
        this.LJIIZILJ = sharePackage;
        C1697810uHb.LJ("save");
        this.LJIJ = new ArrayList();
    }
}
