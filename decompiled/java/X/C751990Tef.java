package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Tef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.longpress.SharePanelHelper$showSharePanel$1", f = "SharePanelHelper.kt", l = {}, m = "invokeSuspend")
public final class C751990Tef extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C735210Ssh LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C0HTT<C737030Svd> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751990Tef(C735210Ssh c735210Ssh, Aweme aweme, C0HTT<C737030Svd> c0htt, InterfaceC1364105Vn<? super C751990Tef> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c735210Ssh;
        this.LLILLJJLI = aweme;
        this.LLILLL = c0htt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751990Tef(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelHelper@d34e.showSharePanel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZJ.isFinishing()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SharePanelHelper@d34e.showSharePanel$1");
            return unit;
        }
        C2189821An6 c2189821An6 = this.LL.LJ;
        String aid = this.LLILLJJLI.getAid();
        if (Intrinsics.LJFF("1", AwemeBizExtKt.isFromTrendingCard(this.LLILLJJLI))) {
            aid = c2189821An6.getSearchResultId();
        }
        C729160Siw c729160Siw = new C729160Siw();
        String tabName = c2189821An6.getTabName();
        if (tabName != null) {
            c729160Siw.LIZ.LIZ = tabName;
        }
        String str = c2189821An6.getmImprId();
        if (str != null) {
            c729160Siw.LIZ.LIZIZ = str;
        }
        String searchId = c2189821An6.getSearchId();
        C0T4J c0t4j = c729160Siw.LIZ;
        c0t4j.LIZJ = searchId;
        c0t4j.LIZLLL = aid;
        c729160Siw.LIZ.LJFF = c2189821An6.getChallengeId();
        c729160Siw.LIZ.LJI = c2189821An6.getParentTagId();
        c729160Siw.LIZ.LJII = Intrinsics.LJFF("discovery", c2189821An6.getEventType());
        int pageType = c2189821An6.getPageType();
        C0T4J c0t4j2 = c729160Siw.LIZ;
        c0t4j2.LJIILIIL = pageType;
        c0t4j2.LJIIIIZZ = "share_panel";
        boolean z = false;
        c0t4j2.LJIJJLI = false;
        c0t4j2.LJIIJJI = "share_panel";
        c0t4j2.LJIILLIIL = true;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        String eventType = c2189821An6.getEventType();
        String from = c2189821An6.getFrom();
        c735840Sti.getClass();
        c729160Siw.LIZ.LJIIL = C735840Sti.LJIIJ(null, eventType, from);
        String videoCollectionId = c2189821An6.getVideoCollectionId();
        String videoCollectionName = c2189821An6.getVideoCollectionName();
        C0T4J c0t4j3 = c729160Siw.LIZ;
        c0t4j3.LJIILJJIL = videoCollectionId;
        c0t4j3.LJIILL = videoCollectionName;
        c729160Siw.LIZ.LJJ = false;
        C0T4J c0t4j4 = c729160Siw.LIZ;
        c0t4j4.LJIL = Boolean.TRUE;
        C735280Sso c735280Sso = C735280Sso.LIZ;
        Aweme aweme = this.LLILLJJLI;
        c735280Sso.getClass();
        if (C735280Sso.LJFF(aweme) && this.LLILLJJLI.getAuthor() != null && C2093608Ic.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), this.LLILLJJLI.getAuthor().getUid())) {
            z = true;
        }
        String uniqueId = "";
        if (z) {
            C735210Ssh c735210Ssh = this.LL;
            C0HTT<C737030Svd> c0htt = this.LLILLL;
            Aweme aweme2 = this.LLILLJJLI;
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("play_list_type", "", bundle);
            C786410Ut5.LJJJI("play_list_id_key", "", bundle);
            C786410Ut5.LJJJI("play_list_id_value", "", bundle);
            C786410Ut5.LJJJI("play_list_id", "", bundle);
            C786410Ut5.LJJJI("play_list_type", "", bundle);
            C786410Ut5.LJJJI("play_list_id_key", "", bundle);
            C786410Ut5.LJJJI("tab_name", c0t4j4.LIZ, bundle);
            C786410Ut5.LJJJI("event_type", "profile_long_press", bundle);
            C786410Ut5.LJJJI("enter_method", c0t4j4.LJIIIIZZ, bundle);
            C786410Ut5.LJJJI("panel_source", c0t4j4.LJIIJJI, bundle);
            if (!c735210Ssh.LJIIIIZZ) {
                bundle.putBoolean("long_press_redesign", true);
                bundle.putBoolean("long_press_is_my_profile", c735210Ssh.LJFF);
                C786410Ut5.LJJJI("long_press_profile_tab_from", c735210Ssh.LJI.getValue(), bundle);
                bundle.putInt("long_press_profile_tab_sort_type", c735210Ssh.LJIIJ);
            } else {
                bundle.putBoolean("is_from_long_press_panel", true);
            }
            c0t4j4.LIZ(bundle);
            C621180OYa.LIZ.LJIIJJI(c735210Ssh.LIZJ, c735210Ssh.LIZLLL, aweme2, c0htt, bundle);
        } else {
            C735210Ssh c735210Ssh2 = this.LL;
            C0HTT<C737030Svd> c0htt2 = this.LLILLL;
            Aweme aweme3 = this.LLILLJJLI;
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("enter_position", c0t4j4.LJIIL, bundle2);
            C786410Ut5.LJJJI("play_list_type", "", bundle2);
            C786410Ut5.LJJJI("play_list_id_key", "", bundle2);
            C786410Ut5.LJJJI("play_list_id_value", "", bundle2);
            C786410Ut5.LJJJI("play_list_id", "", bundle2);
            C786410Ut5.LJJJI("play_list_type", "", bundle2);
            C786410Ut5.LJJJI("play_list_id_key", "", bundle2);
            C786410Ut5.LJJJI("tab_name", c0t4j4.LIZ, bundle2);
            C786410Ut5.LJJJI("event_type", "profile_long_press", bundle2);
            C786410Ut5.LJJJI("enter_method", c0t4j4.LJIIIIZZ, bundle2);
            C786410Ut5.LJJJI("panel_source", c0t4j4.LJIIJJI, bundle2);
            C1355680lNm.LIZIZ(bundle2, c0t4j4.LJIIJJI);
            bundle2.putInt("share_im_limit_tip_type", -1);
            if (aweme3.getAuthor() != null) {
                uniqueId = aweme3.getAuthor().getUniqueId();
            }
            C786410Ut5.LJJJI("author_user_name", uniqueId, bundle2);
            C786410Ut5.LJJJI("creation_id", c2189821An6.getCreationId(), bundle2);
            C786410Ut5.LJJJI("previousPage", c2189821An6.getPreviousPage(), bundle2);
            C786410Ut5.LJJJI("previousPagePosition", c2189821An6.getPreviousPagePosition(), bundle2);
            C786410Ut5.LJJJI("category_name", c2189821An6.getCategoryName(), bundle2);
            C786410Ut5.LJJJI("video_from", c2189821An6.getFrom(), bundle2);
            C786410Ut5.LJJJI("referral_enter_from", c2189821An6.getReferralEnterFrom(), bundle2);
            C786410Ut5.LJJJI("referral_page_enter_from", c2189821An6.getReferralPageEnterFrom(), bundle2);
            bundle2.putBoolean("is_referral", c2189821An6.getFromReferral());
            if (!c735210Ssh2.LJIIIIZZ) {
                bundle2.putBoolean("long_press_redesign", true);
                bundle2.putBoolean("long_press_is_my_profile", c735210Ssh2.LJFF);
                C786410Ut5.LJJJI("long_press_profile_tab_from", c735210Ssh2.LJI.getValue(), bundle2);
                bundle2.putInt("long_press_profile_tab_sort_type", c735210Ssh2.LJIIJ);
            } else {
                bundle2.putBoolean("is_from_long_press_panel", true);
            }
            c0t4j4.LIZ(bundle2);
            C621180OYa.LIZ.LJJIIJ(c735210Ssh2.LIZJ, c735210Ssh2.LIZLLL, aweme3, false, c0htt2, bundle2);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelHelper@d34e.showSharePanel$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
