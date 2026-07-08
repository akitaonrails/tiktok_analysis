package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.ICollectAweme;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.CollectAwemeEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS191S1100000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Srs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734700Srs extends AbstractC736370SuZ implements InterfaceC616440OFu {
    public final C1379170lzf LLILZ;
    public final InterfaceC1374230lrh LLILZIL;
    public C616430OFt LLILZLL;

    @Override // X.AbstractC1376810lvr
    public final Integer LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC616440OFu
    public final void p30(Exception exc) {
    }

    public final void LJIIJJI() {
        Context context;
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            if (!AwemeExtKt.isCollected(aweme)) {
                String curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
                if ((!curSecUserId.equals(this.LLILLJJLI != null ? AwemeExtKt.getAuthorUid(r1) : null)) && !C1030680cva.LJIIJJI(this.LLILLJJLI) && ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIJ() && !Keva.getRepo("keva_favorite_notify_optimize_repo").getBoolean("keva_has_shown_favorite_notify_optimize_sheet", false) && ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIJJLI()) {
                    InterfaceC1374230lrh interfaceC1374230lrh = this.LLILZIL;
                    if (interfaceC1374230lrh == null) {
                        View view = this.LLILZ.LLIZ;
                        if (view != null) {
                            context = view.getContext();
                        }
                        LJIIJ();
                        return;
                    }
                    context = C1388190mED.LIZ(interfaceC1374230lrh.getContext());
                    if (context != null && (context instanceof C19EG)) {
                        C0OFO.LIZ((C19EG) context, this.LLILLL, this.LLILLJJLI);
                        return;
                    }
                    LJIIJ();
                    return;
                }
            }
            LJIIJ();
        }
    }

    @Override // X.InterfaceC616440OFu
    public final void ZX() {
        String aid;
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            aweme.setCollectStatus(!AwemeExtKt.isCollected(aweme) ? 1 : 0);
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Br(aweme.getCollectStatus(), aweme.getAid());
            String aid2 = aweme.getAid();
            String str = "";
            if (aid2 == null) {
                aid2 = "";
            }
            C1440005kM.LIZ(new CollectAwemeEvent(aid2, aweme.getCollectStatus(), aweme.getAwemeType()));
            Aweme aweme2 = this.LLILLJJLI;
            if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                str = aid;
            }
            C1440005kM.LIZ(new C731710Sn3(str, aweme.getCollectStatus(), false));
            C01GW<C740490T2x> c01gw = C740490T2x.LIZLLL;
            if (C739240SzC.LIZ(this.LLILLL)) {
                C01GW<C740370T2l> c01gw2 = C740370T2l.LJIIL;
                C582330Msh.LIZ().LJ(6);
            }
        }
    }

    public final void LJIIJ() {
        String aid;
        Map<String, ? extends Object> mapLJIIL;
        Long creativeId;
        Long adId;
        Map<String, ? extends Object> mapLJIIL2;
        Long creativeId2;
        Long adId2;
        if (!C298410Bmp.LIZ()) {
            if (this.LLILZLL == null) {
                this.LLILZLL = new C616430OFt();
            }
            C616430OFt c616430OFt = this.LLILZLL;
            if (c616430OFt != null) {
                c616430OFt.LLILZLL = this.LLILLL;
                c616430OFt.LLILLJJLI = this;
                Object[] objArr = new Object[4];
                objArr[0] = 2;
                Aweme aweme = this.LLILLJJLI;
                objArr[1] = aweme != null ? aweme.getAid() : null;
                Aweme aweme2 = this.LLILLJJLI;
                objArr[2] = Integer.valueOf(((aweme2 == null || !AwemeExtKt.isCollected(aweme2)) ? 0 : 1) ^ 1);
                Aweme aweme3 = this.LLILLJJLI;
                objArr[3] = Integer.valueOf(aweme3 != null ? aweme3.getAwemeType() : 0);
                c616430OFt.LIZJ(objArr);
                return;
            }
            return;
        }
        Boolean boolLIZ = ((IAwemeCollectionState) ServiceManager.get().getService(IAwemeCollectionState.class)).LIZ(this.LLILLJJLI);
        Aweme aweme4 = this.LLILLJJLI;
        if (aweme4 == null || (aid = aweme4.getAid()) == null) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        String string = C1BWL.LIZ().getString(Intrinsics.LJFF(boolLIZ, bool) ? 2131828351 : 2131828935);
        if (!Intrinsics.LJFF(boolLIZ, bool)) {
            ICollect iCollect = (ICollect) ServiceManager.get().getService(ICollectAweme.class);
            Aweme aweme5 = this.LLILLJJLI;
            if (aweme5 == null) {
                mapLJIIL2 = null;
            } else if (AwemeExtKt.isMonetizationTraffic(aweme5)) {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                Map<String, Object> mapLIZ = EngagementTraceImpl.LIZIZ().LIZ();
                Pair[] pairArr = new Pair[7];
                AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData(aweme5);
                pairArr[0] = new Pair("ad_id", (monetizationData == null || (adId2 = monetizationData.getAdId()) == null) ? null : adId2.toString());
                AwemeRawAd monetizationData2 = AwemeExtKt.getMonetizationData(aweme5);
                pairArr[1] = new Pair("creative_id", (monetizationData2 == null || (creativeId2 = monetizationData2.getCreativeId()) == null) ? null : creativeId2.toString());
                AwemeRawAd monetizationData3 = AwemeExtKt.getMonetizationData(aweme5);
                pairArr[2] = new Pair("log_extra", monetizationData3 != null ? monetizationData3.getLogExtra() : null);
                pairArr[3] = new Pair("user_agent", C1489110oqz.LIZ("other"));
                pairArr[4] = new Pair("access", C786410Ut5.b3(contextLIZ));
                pairArr[5] = new Pair("package", contextLIZ.getPackageName());
                android.util.Pair<String, Boolean> pairLIZ = C614430O8b.LIZ(contextLIZ);
                pairArr[6] = new Pair("google_aid", pairLIZ != null ? pairLIZ.first : null);
                mapLJIIL2 = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), mapLIZ);
            } else {
                mapLJIIL2 = C2097608Jq.LJ();
            }
            iCollect.collect(aid, mapLJIIL2, new AwS191S1100000_11(this, string, 1), new AwS625S0100000_11(this, 100));
            return;
        }
        C013C c013c = new C013C();
        ICollect iCollect2 = (ICollect) ServiceManager.get().getService(ICollectAweme.class);
        Aweme aweme6 = this.LLILLJJLI;
        if (aweme6 == null) {
            mapLJIIL = null;
        } else if (AwemeExtKt.isMonetizationTraffic(aweme6)) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ2 = C844470XAv.LIZ();
            Map<String, Object> mapLIZ2 = EngagementTraceImpl.LIZIZ().LIZ();
            Pair[] pairArr2 = new Pair[7];
            AwemeRawAd monetizationData4 = AwemeExtKt.getMonetizationData(aweme6);
            pairArr2[0] = new Pair("ad_id", (monetizationData4 == null || (adId = monetizationData4.getAdId()) == null) ? null : adId.toString());
            AwemeRawAd monetizationData5 = AwemeExtKt.getMonetizationData(aweme6);
            pairArr2[1] = new Pair("creative_id", (monetizationData5 == null || (creativeId = monetizationData5.getCreativeId()) == null) ? null : creativeId.toString());
            AwemeRawAd monetizationData6 = AwemeExtKt.getMonetizationData(aweme6);
            pairArr2[2] = new Pair("log_extra", monetizationData6 != null ? monetizationData6.getLogExtra() : null);
            pairArr2[3] = new Pair("user_agent", C1489110oqz.LIZ("other"));
            pairArr2[4] = new Pair("access", C786410Ut5.b3(contextLIZ2));
            pairArr2[5] = new Pair("package", contextLIZ2.getPackageName());
            android.util.Pair<String, Boolean> pairLIZ2 = C614430O8b.LIZ(contextLIZ2);
            pairArr2[6] = new Pair("google_aid", pairLIZ2 != null ? pairLIZ2.first : null);
            mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr2), mapLIZ2);
        } else {
            mapLJIIL = C2097608Jq.LJ();
        }
        iCollect2.unCollect(aid, mapLJIIL, new AwS191S1100000_11(this, string, 2), new AwS447S0200000_11(c013c, this, 13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1376810lvr
    public final void LIZIZ(View view) {
        String aid;
        boolean z;
        String aid2;
        String authorUid;
        User author;
        Integer numValueOf;
        Boolean boolValueOf;
        Integer numValueOf2;
        int aIGCLabelType;
        int i;
        String aid3;
        Dialog dialog;
        AIGCInfo aIGCInfo;
        Aweme aweme;
        int i2;
        PhotoModeImageInfo photoModeImageInfo;
        Object[] objArr = new Object[2];
        objArr[0] = "feed long press panel";
        Aweme aweme2 = this.LLILLJJLI;
        String authorUid2 = null;
        ownerActivity = null;
        Activity ownerActivity = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        objArr[1] = String.valueOf(aid);
        C1206780hVc.LIZ(C786410Ut5.j4("click favorite button in %s, aid is %s", Arrays.copyOf(objArr, 2)));
        C2344009Gk c2344009Gk = new C2344009Gk();
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            c2344009Gk.LJII(C584760Mwc.LIZIZ(C0SUC.LIZ(activityLJFF).getPreviousPage(), C0SUC.LIZ(activityLJFF).getFromGroupId()));
        }
        Aweme aweme3 = this.LLILLJJLI;
        if (aweme3 != null && C582980Mtk.LIZIZ(aweme3)) {
            z = true;
        } else {
            z = false;
        }
        if (z && (aweme = this.LLILLJJLI) != null && !AwemeExtKt.isAdTraffic(aweme)) {
            Aweme aweme4 = this.LLILLJJLI;
            if (aweme4 != null && (photoModeImageInfo = aweme4.getPhotoModeImageInfo()) != null && photoModeImageInfo.getTitle() != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "has_title");
            String string = this.LLILZ.LLJILJILJ.extras.getString("from_page");
            if (string != null) {
                c2344009Gk.LJFF("from_page", string);
            }
        }
        if (!Intrinsics.LJFF(this.LLILLL, "from_music")) {
            c2344009Gk.LIZJ(((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJI(view.getContext(), this.LLILLJJLI), "music_name");
        }
        Activity activityLJFF2 = C2214201BlK.LJFF();
        String str = "favourite_video";
        if (activityLJFF2 != null) {
            C1357130lQ7.LIZIZ(c2344009Gk, "favourite_video", C0SUC.LIZ(activityLJFF2).getInboxLogExtra());
        }
        C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
        Aweme aweme5 = this.LLILLJJLI;
        if (aweme5 != null) {
            aid2 = aweme5.getAid();
        } else {
            aid2 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid2);
        Aweme aweme6 = this.LLILLJJLI;
        if (aweme6 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme6);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        Aweme aweme7 = this.LLILLJJLI;
        if (aweme7 != null) {
            author = aweme7.getAuthor();
        } else {
            author = null;
        }
        c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(author));
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(this.LLILLJJLI)));
        String str2 = this.LLILZ.LLILLL;
        String str3 = "long_press";
        if (str2 == null) {
            str2 = "long_press";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        String str4 = this.LLILZ.LLILLL;
        if (str4 != null) {
            str3 = str4;
        }
        c2344009Gk.LJIIIIZZ("panel_source", str3);
        Aweme aweme8 = this.LLILLJJLI;
        if (aweme8 != null) {
            numValueOf = Integer.valueOf(aweme8.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        c2344009Gk.LIZJ(C735370Ssx.LJIILL(this.LLILLJJLI), "pic_cnt");
        Aweme aweme9 = this.LLILLJJLI;
        if (aweme9 != null) {
            boolValueOf = Boolean.valueOf(AwemeBizExtKt.isHighlighted(aweme9));
        } else {
            boolValueOf = null;
        }
        c2344009Gk.LJ(boolValueOf, "is_highlighted");
        Aweme aweme10 = this.LLILLJJLI;
        if (aweme10 != null) {
            numValueOf2 = Integer.valueOf(AwemeBizExtKt.getOriginalPos(aweme10));
        } else {
            numValueOf2 = null;
        }
        c2344009Gk.LJ(numValueOf2, "rank_index");
        Aweme aweme11 = this.LLILLJJLI;
        if (aweme11 == null || !AwemeExtKt.isCollected(aweme11)) {
            C1359610lU7.LJ(c2344009Gk, this.LLILLJJLI, null);
        }
        String str5 = this.LLILZ.LLILZ;
        if (str5 != null) {
            c2344009Gk.LJFF("from_page", str5);
        }
        Activity activityLJFF3 = C2214201BlK.LJFF();
        if (activityLJFF3 != null && (Intrinsics.LJFF("self_profile_search_result_feed", this.LLILLL) || Intrinsics.LJFF("other_profile_search_result_feed", this.LLILLL))) {
            c2344009Gk.LJFF("item_position", C0SUC.LIZ(activityLJFF3).getItemPosition());
            c2344009Gk.LJFF("profile_search_id", C0SUC.LIZ(activityLJFF3).getProfileSearchId());
        }
        String str6 = this.LLILLL;
        Aweme aweme12 = this.LLILLJJLI;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        Map<String, String> mapFetchSearchParams = c1er1.fetchSearchParams(str6, c1er1.LLZLLLL(str6));
        if (!mapFetchSearchParams.isEmpty()) {
            c2344009Gk.LJII(C0JBR.LIZ(aweme12, mapFetchSearchParams));
        }
        c1er1.j(aweme12, c2344009Gk);
        c1er1.LLILZ(this.LLILLJJLI, this.LLILLL, c2344009Gk);
        if (Intrinsics.LJFF(this.LLILLL, "homepage_nearby")) {
            C1606660rua.LIZIZ.LIZJ(this.LLILLL, (HashMap) c2344009Gk.LIZ, this.LLILLJJLI, true);
        }
        C1367960lha.LIZ.getClass();
        Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(this.LLILLJJLI, null);
        if (!mapLJIILJJIL.isEmpty()) {
            c2344009Gk.LJII(mapLJIILJJIL);
        }
        c1er1.LJJJJ().LIZ(c2344009Gk, this.LLILLJJLI);
        Object objLJIIIZ = c19651011uW.LJIIIZ(this.LLILLJJLI, c2344009Gk);
        Aweme aweme13 = this.LLILLJJLI;
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme13, objLJIIIZ);
        C2344009Gk c2344009Gk2 = (C2344009Gk) c1370890lmJ.appendCreationParams(objLJIIIZ, this.LLILLJJLI);
        C734780Ss0.LIZ(c2344009Gk2, null, C0SUC.LIZ(view.getContext()));
        Aweme aweme14 = this.LLILLJJLI;
        if (aweme14 != null && (aIGCInfo = aweme14.aigcInfo) != null) {
            aIGCLabelType = aIGCInfo.getAIGCLabelType();
        } else {
            aIGCLabelType = 0;
        }
        c2344009Gk2.LIZJ(aIGCLabelType, "aigc_theme_status");
        Aweme aweme15 = this.LLILLJJLI;
        if (aweme15 != null && aweme15.getIsCommentPostVideo()) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk2.LIZJ(i, "is_comment_post_video");
        c2344009Gk2.LIZJ(C1601690rmZ.LIZ(this.LLILLJJLI), "has_alternative_text");
        c2344009Gk2.LJ(Boolean.valueOf(C1601690rmZ.LIZJ()), "screen_reader_enabled");
        if (C1EE2.LIZIZ.LIZLLL()) {
            c2344009Gk2.LIZJ(this.LLILZ.LLJILJILJ.extras.getInt("is_enter_graphic_detail", 0), "is_enter_graphic_detail");
        }
        Map<String, String> map = c2344009Gk2.LIZ;
        Aweme aweme16 = this.LLILLJJLI;
        if (aweme16 != null && AwemeExtKt.isCollected(aweme16)) {
            str = "cancel_favourite_video";
        }
        C20684815ws.LJIILLIIL(str, map);
        Aweme aweme17 = this.LLILLJJLI;
        if (aweme17 != null && C1017070cZd.LJJLIL(aweme17)) {
            InterfaceC1374230lrh interfaceC1374230lrh = this.LLILZIL;
            if ((interfaceC1374230lrh instanceof Dialog) && (dialog = (Dialog) interfaceC1374230lrh) != null) {
                ownerActivity = dialog.getOwnerActivity();
            }
            if (ownerActivity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(ownerActivity);
                c1389890mGx.LJIIIZ(2131824739);
                c1389890mGx.LJIIJJI();
                return;
            } else {
                View view2 = this.LLILZ.LLIZ;
                if (view2 == null) {
                    return;
                }
                C1389890mGx c1389890mGx2 = new C1389890mGx(view2);
                c1389890mGx2.LJIIIZ(2131824739);
                c1389890mGx2.LJIIJJI();
                return;
            }
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            Aweme aweme18 = this.LLILLJJLI;
            if (aweme18 == null || (aid3 = aweme18.getAid()) == null) {
                aid3 = "";
            }
            Activity activityLJFF4 = C2214201BlK.LJFF();
            String str7 = this.LLILLL;
            C627150Oin c627150Oin = new C627150Oin();
            C786410Ut5.LJJJI("group_id", aid3, c627150Oin.LIZ);
            Aweme aweme19 = this.LLILLJJLI;
            if (aweme19 != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(aweme19);
            }
            C786410Ut5.LJJJI("author_id", authorUid2, c627150Oin.LIZ);
            C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid3), c627150Oin.LIZ);
            C0XPD.LIZIZ(activityLJFF4, str7, "click_favorite_video", c627150Oin.LIZ, new C738970Syl(this, 1));
            return;
        }
        LJIIJJI();
    }

    @Override // X.InterfaceC616440OFu
    public final void Me1(String str) {
        Dialog dialog;
        Object obj = this.LLILZIL;
        if (obj != null) {
            if ((obj instanceof Dialog) && (dialog = (Dialog) obj) != null && ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIJJI() <= 0) {
                C1389890mGx c1389890mGx = new C1389890mGx(dialog);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        View view = this.LLILZ.LLIZ;
        if (view == null || ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIJJI() > 0) {
            return;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx(view);
        c1389890mGx2.LJIIJ(str);
        c1389890mGx2.LJIIJJI();
    }

    public C734700Srs(C1379170lzf c1379170lzf, InterfaceC1374230lrh interfaceC1374230lrh) {
        super(c1379170lzf, interfaceC1374230lrh);
        this.LLILZ = c1379170lzf;
        this.LLILZIL = interfaceC1374230lrh;
    }
}
