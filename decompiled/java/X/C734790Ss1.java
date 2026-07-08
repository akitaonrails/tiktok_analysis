package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.ICollectAweme;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS190S1100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ss1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734790Ss1 implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLJI = 0;
    public final Activity LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public C616430OFt LLJ;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_bookmark_fill;
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
        return "favorite";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        Aweme aweme = this.LLILLJJLI;
        return (aweme == null || !AwemeExtKt.isCollected(aweme)) ? R.raw.icon_2pt_bookmark : R.raw.icon_2pt_bookmark_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        if (AwemeExtKt.isCollected(this.LLILLJJLI)) {
            ShareFlavorService.LIZ.getClass();
            C04UB.LIZ().LIZ();
            return 2131826478;
        }
        ShareFlavorService.LIZ.getClass();
        C04UB.LIZ().LJ();
        return 2131826477;
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

    public final void LIZ(Context context) {
        int i;
        String string;
        String string2;
        String logExtra;
        Object obj;
        Map<String, ? extends Object> mapLJIIL;
        Long creativeId;
        Long adId;
        String string3;
        String string4;
        String logExtra2;
        Object obj2;
        Map<String, ? extends Object> mapLJIIL2;
        Long creativeId2;
        Long adId2;
        C616430OFt c616430OFt;
        Object authorUid;
        Activity activityLIZ;
        C19EG c19eg;
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            if (!AwemeExtKt.isCollected(aweme)) {
                String curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
                Aweme aweme2 = this.LLILLJJLI;
                if (aweme2 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme2);
                } else {
                    authorUid = null;
                }
                if ((!curSecUserId.equals(authorUid)) && !C1030680cva.LJIIJJI(this.LLILLJJLI) && ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIJ() && !Keva.getRepo("keva_favorite_notify_optimize_repo").getBoolean("keva_has_shown_favorite_notify_optimize_sheet", false) && ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIJJLI()) {
                    if (context != null) {
                        activityLIZ = C1388190mED.LIZ(context);
                    } else {
                        activityLIZ = null;
                    }
                    if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                        C0OFO.LIZ(c19eg, this.LLILLL, this.LLILLJJLI);
                        return;
                    }
                    return;
                }
            }
            if (!C298410Bmp.LIZ()) {
                if (this.LLJ == null) {
                    C616430OFt c616430OFt2 = new C616430OFt();
                    this.LLJ = c616430OFt2;
                    c616430OFt2.LLILZLL = this.LLILLL;
                }
                C616430OFt c616430OFt3 = this.LLJ;
                if (c616430OFt3 == null) {
                    c616430OFt = null;
                } else {
                    c616430OFt = c616430OFt3;
                }
                c616430OFt.LLILLJJLI = new InterfaceC616440OFu() { // from class: X.0O9K
                    @Override // X.InterfaceC616440OFu
                    public final void p30(Exception exc) {
                    }

                    @Override // X.InterfaceC616440OFu
                    public final void ZX() {
                        if (AwemeExtKt.isCollected(this.LL.LLILLJJLI)) {
                            this.LL.LLILLJJLI.setCollectStatus(0);
                            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Br(0, this.LL.LLILLJJLI.getAid());
                            C1440005kM.LIZ(new C737030Svd(54, this.LL.LLILLJJLI));
                            String aid = this.LL.LLILLJJLI.getAid();
                            C1440005kM.LIZ(new C731710Sn3(aid != null ? aid : "", 0, false));
                            return;
                        }
                        this.LL.LLILLJJLI.setCollectStatus(1);
                        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Br(1, this.LL.LLILLJJLI.getAid());
                        C313310CPx.LIZ.getClass();
                        C1440005kM.LIZ(new C737030Svd(54, this.LL.LLILLJJLI));
                        String aid2 = this.LL.LLILLJJLI.getAid();
                        C1440005kM.LIZ(new C731710Sn3(aid2 != null ? aid2 : "", 1, false));
                        C01GW<C740490T2x> c01gw = C740490T2x.LIZLLL;
                        if (C739240SzC.LIZ(this.LL.LLILLL)) {
                            C01GW<C740370T2l> c01gw2 = C740370T2l.LJIIL;
                            C582330Msh.LIZ().LJ(6);
                        }
                    }

                    @Override // X.InterfaceC616440OFu
                    public final void Me1(String str) {
                        if (str != null && ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIJJI() <= 0) {
                            C1389890mGx c1389890mGx = new C1389890mGx(this.LL.LL);
                            c1389890mGx.LJIIJ(str);
                            c1389890mGx.LJIIJJI();
                        }
                    }
                };
                if (c616430OFt3 == null) {
                    c616430OFt3 = null;
                }
                c616430OFt3.LIZJ(2, this.LLILLJJLI.getAid(), Integer.valueOf(!AwemeExtKt.isCollected(this.LLILLJJLI) ? 1 : 0), Integer.valueOf(this.LLILLJJLI.getAwemeType()));
                return;
            }
            Boolean boolLIZ = ((IAwemeCollectionState) ServiceManager.get().getService(IAwemeCollectionState.class)).LIZ(this.LLILLJJLI);
            String aid = this.LLILLJJLI.getAid();
            if (aid == null) {
                return;
            }
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(boolLIZ, bool)) {
                i = 2131828351;
            } else {
                i = 2131828935;
            }
            String string5 = C1BWL.LIZ().getString(i);
            if (!Intrinsics.LJFF(boolLIZ, bool)) {
                ICollect iCollect = (ICollect) ServiceManager.get().getService(ICollectAweme.class);
                Aweme aweme3 = this.LLILLJJLI;
                if (!AwemeExtKt.isMonetizationTraffic(aweme3)) {
                    mapLJIIL2 = C2097608Jq.LJ();
                } else {
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    Map<String, Object> mapLIZ = EngagementTraceImpl.LIZIZ().LIZ();
                    Pair[] pairArr = new Pair[7];
                    AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData(aweme3);
                    if (monetizationData != null && (adId2 = monetizationData.getAdId()) != null) {
                        string3 = adId2.toString();
                    } else {
                        string3 = null;
                    }
                    pairArr[0] = new Pair("ad_id", string3);
                    AwemeRawAd monetizationData2 = AwemeExtKt.getMonetizationData(aweme3);
                    if (monetizationData2 != null && (creativeId2 = monetizationData2.getCreativeId()) != null) {
                        string4 = creativeId2.toString();
                    } else {
                        string4 = null;
                    }
                    pairArr[1] = new Pair("creative_id", string4);
                    AwemeRawAd monetizationData3 = AwemeExtKt.getMonetizationData(aweme3);
                    if (monetizationData3 != null) {
                        logExtra2 = monetizationData3.getLogExtra();
                    } else {
                        logExtra2 = null;
                    }
                    pairArr[2] = new Pair("log_extra", logExtra2);
                    pairArr[3] = new Pair("user_agent", C1489110oqz.LIZ("other"));
                    pairArr[4] = new Pair("access", C786410Ut5.b3(contextLIZ));
                    pairArr[5] = new Pair("package", contextLIZ.getPackageName());
                    android.util.Pair<String, Boolean> pairLIZ = C614430O8b.LIZ(contextLIZ);
                    if (pairLIZ != null) {
                        obj2 = pairLIZ.first;
                    } else {
                        obj2 = null;
                    }
                    pairArr[6] = new Pair("google_aid", obj2);
                    mapLJIIL2 = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), mapLIZ);
                }
                iCollect.collect(aid, mapLJIIL2, new AwS190S1100000_9(this, string5, 4), new AwS623S0100000_9(this, 188));
                return;
            }
            ICollect iCollect2 = (ICollect) ServiceManager.get().getService(ICollectAweme.class);
            Aweme aweme4 = this.LLILLJJLI;
            if (!AwemeExtKt.isMonetizationTraffic(aweme4)) {
                mapLJIIL = C2097608Jq.LJ();
            } else {
                C844470XAv.LIZ.getClass();
                Context contextLIZ2 = C844470XAv.LIZ();
                Map<String, Object> mapLIZ2 = EngagementTraceImpl.LIZIZ().LIZ();
                Pair[] pairArr2 = new Pair[7];
                AwemeRawAd monetizationData4 = AwemeExtKt.getMonetizationData(aweme4);
                if (monetizationData4 != null && (adId = monetizationData4.getAdId()) != null) {
                    string = adId.toString();
                } else {
                    string = null;
                }
                pairArr2[0] = new Pair("ad_id", string);
                AwemeRawAd monetizationData5 = AwemeExtKt.getMonetizationData(aweme4);
                if (monetizationData5 != null && (creativeId = monetizationData5.getCreativeId()) != null) {
                    string2 = creativeId.toString();
                } else {
                    string2 = null;
                }
                pairArr2[1] = new Pair("creative_id", string2);
                AwemeRawAd monetizationData6 = AwemeExtKt.getMonetizationData(aweme4);
                if (monetizationData6 != null) {
                    logExtra = monetizationData6.getLogExtra();
                } else {
                    logExtra = null;
                }
                pairArr2[2] = new Pair("log_extra", logExtra);
                pairArr2[3] = new Pair("user_agent", C1489110oqz.LIZ("other"));
                pairArr2[4] = new Pair("access", C786410Ut5.b3(contextLIZ2));
                pairArr2[5] = new Pair("package", contextLIZ2.getPackageName());
                android.util.Pair<String, Boolean> pairLIZ2 = C614430O8b.LIZ(contextLIZ2);
                if (pairLIZ2 != null) {
                    obj = pairLIZ2.first;
                } else {
                    obj = null;
                }
                pairArr2[6] = new Pair("google_aid", obj);
                mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr2), mapLIZ2);
            }
            iCollect2.unCollect(aid, mapLJIIL, new AwS190S1100000_9(this, string5, 3), null);
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        Aweme aweme = this.LLILLJJLI;
        if (aweme == null) {
            return R.attr.a1p;
        }
        if (AwemeExtKt.isCollected(aweme)) {
            return R.attr.ny;
        }
        if (enumC1369720lkQ == EnumC1369720lkQ.VERTICAL) {
            return R.attr.a1p;
        }
        return R.attr.a1j;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        int i;
        String region;
        PhotoModeImageInfo photoModeImageInfo;
        int i2 = baseSharePackage.extras.getInt("is_enter_graphic_detail", 0);
        if (!AwemeExtKt.isCollected(this.LLILLJJLI)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
            c2344009Gk.LJIIIIZZ("group_id", this.LLILLJJLI.getAid());
            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(this.LLILLJJLI));
            c2344009Gk.LJIIIIZZ("enter_method", "click_share_button");
            c2344009Gk.LJIIIIZZ("panel_source", this.LLILZ);
            c2344009Gk.LJIIIIZZ("tag_id", this.LLILZIL);
            c2344009Gk.LJ(Boolean.valueOf(AwemeBizExtKt.isHighlighted(this.LLILLJJLI)), "is_highlighted");
            c2344009Gk.LIZJ(AwemeBizExtKt.getOriginalPos(this.LLILLJJLI), "rank_index");
            c2344009Gk.LIZJ(this.LLILLJJLI.getAwemeType(), "aweme_type");
            c2344009Gk.LIZJ(C735370Ssx.LJIILL(this.LLILLJJLI), "pic_cnt");
            Aweme aweme = this.LLILLJJLI;
            if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && photoModeImageInfo.hasTitle()) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "has_title");
            C1359610lU7.LJ(c2344009Gk, this.LLILLJJLI, null);
            if (Intrinsics.LJFF(this.LLILLL, "homepage_nearby")) {
                C1606660rua.LIZIZ.LIZJ(this.LLILLL, (HashMap) c2344009Gk.LIZ, this.LLILLJJLI, true);
            }
            C1367960lha.LIZ.getClass();
            Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(this.LLILLJJLI, null);
            if (!mapLJIILJJIL.isEmpty()) {
                c2344009Gk.LJII(mapLJIILJJIL);
            }
            Map mapLJIILJJIL2 = C1367960lha.LIZ().LJIILJJIL(this.LLILLJJLI, null);
            if (!mapLJIILJJIL2.isEmpty()) {
                c2344009Gk.LJII(mapLJIILJJIL2);
            }
            C1ER1.LIZIZ.LJJJJ().LIZ(c2344009Gk, this.LLILLJJLI);
            if (this.LLIZLLLIL.length() > 0) {
                c2344009Gk.LJFF("from_page", this.LLIZLLLIL);
            }
            if (Intrinsics.LJFF("homepage_country", this.LLILLL) && this.LLILLJJLI.getAuthor() != null) {
                if (this.LLILLJJLI.getAuthor() == null) {
                    region = "";
                } else {
                    region = this.LLILLJJLI.getAuthor().getRegion();
                }
                c2344009Gk.LJFF("country_name", region);
            }
            if (this.LLILZLL.length() > 0) {
                c2344009Gk.LJFF("parent_tag_id", this.LLILZLL);
            }
            if (this.LLIZ.length() > 0) {
                c2344009Gk.LJFF("category_name", this.LLIZ);
            }
            if (!Intrinsics.LJFF(this.LLILLL, "from_music")) {
                c2344009Gk.LIZJ(((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJI(context, this.LLILLJJLI), "music_name");
            }
            C735840Sti c735840Sti = C735840Sti.LIZ;
            c2344009Gk.LJII(C584760Mwc.LIZIZ(C0SUC.LIZ(context).getPreviousPage(), C0SUC.LIZ(context).getFromGroupId()));
            Aweme aweme2 = this.LLILLJJLI;
            c735840Sti.getClass();
            C735840Sti.LIZIZ(aweme2, c2344009Gk);
            C1357130lQ7.LIZIZ(c2344009Gk, "favourite_video", C0SUC.LIZ(context).getInboxLogExtra());
            if (C1386360mBG.LJI(this.LLILLL)) {
                c2344009Gk.LJFF("play_mode", C1386360mBG.LJ());
            }
            C19651011uW.LIZIZ.LJIIIZ(this.LLILLJJLI, c2344009Gk);
            C1370890lmJ.LIZ.appendCreationParams(c2344009Gk, this.LLILLJJLI);
            C734780Ss0.LIZ(c2344009Gk, null, C0SUC.LIZ(context));
            C0SXF.LJIILJJIL(c2344009Gk, this.LLILLJJLI, context);
            c2344009Gk.LIZJ(this.LLILLJJLI.aigcInfo.getAIGCLabelType(), "aigc_theme_status");
            Aweme aweme3 = this.LLILLJJLI;
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            c1ee2.LJJLIL(aweme3, c2344009Gk);
            if (c1ee2.LIZLLL()) {
                c2344009Gk.LIZJ(i2, "is_enter_graphic_detail");
            }
            if (C735370Ssx.LJJIJL(this.LLILLL)) {
                c2344009Gk.LJFF("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(this.LLILLJJLI)));
                C20684815ws.LJIJ("favourite_video", C735370Ssx.LJJJ(c2344009Gk.LIZ));
            } else {
                C20684815ws.LJIILLIIL("favourite_video", c2344009Gk.LIZ);
            }
            C1514430pVp.LJFF(EnumC1584370rKd.SHARE);
        } else {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", this.LLILLL);
            c2344009Gk2.LJIIIIZZ("group_id", this.LLILLJJLI.getAid());
            c2344009Gk2.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(this.LLILLJJLI));
            c2344009Gk2.LJIIIIZZ("enter_method", "click_share_button");
            c2344009Gk2.LJIIIIZZ("panel_source", this.LLILZ);
            c2344009Gk2.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(this.LLILLJJLI)));
            c2344009Gk2.LIZJ(this.LLILLJJLI.getAwemeType(), "aweme_type");
            c2344009Gk2.LIZJ(C735370Ssx.LJIILL(this.LLILLJJLI), "pic_cnt");
            c2344009Gk2.LJII(C584760Mwc.LIZIZ(C0SUC.LIZ(context).getPreviousPage(), C0SUC.LIZ(context).getFromGroupId()));
            c2344009Gk2.LIZJ(this.LLILLJJLI.aigcInfo.getAIGCLabelType(), "aigc_theme_status");
            if (C1EE2.LIZIZ.LIZLLL()) {
                c2344009Gk2.LIZJ(i2, "is_enter_graphic_detail");
            }
            C20684815ws.LJIILLIIL("cancel_favourite_video", c2344009Gk2.LIZ);
        }
        if (C1017070cZd.LJJLIL(this.LLILLJJLI)) {
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZIZ(2131824739);
            c1233040iBy.LIZLLL();
        } else {
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                String aid = this.LLILLJJLI.getAid();
                Activity activityLJII = C1375500ltk.LJII(context);
                String str = this.LLILLL;
                C627150Oin c627150Oin = new C627150Oin();
                C786410Ut5.LJJJI("group_id", aid, c627150Oin.LIZ);
                C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(this.LLILLJJLI), c627150Oin.LIZ);
                C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid), c627150Oin.LIZ);
                C0XPD.LIZIZ(activityLJII, str, "click_favorite_video", c627150Oin.LIZ, new C738960Syk(this, context, 5));
                return;
            }
            LIZ(context);
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

    public C734790Ss1(Activity activity, Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6) {
        this.LL = activity;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
    }
}
