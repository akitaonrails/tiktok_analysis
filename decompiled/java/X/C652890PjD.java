package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0PjD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652890PjD extends AbstractC652910PjF implements InterfaceC656470Poz {
    public static final /* synthetic */ int LLJILLL = 0;
    public SearchSpot LLJI;
    public int LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    public final C656420Pou LJIIJJI() {
        return (C656420Pou) this.LLJILJILJ.getValue();
    }

    public final String LJIIL() {
        String docId;
        SearchSpot searchSpot = this.LLJI;
        return (searchSpot == null || (docId = searchSpot.getDocId()) == null) ? "" : docId;
    }

    @Override // X.InterfaceC656470Poz
    public final void LIZ(int i, Aweme aweme) {
        String alaSrc;
        C654760PmE c654760PmELIZIZ = C645940PVg.LIZIZ(C660870Pw5.LIZ(this.LL.itemView));
        SearchSpot searchSpot = this.LLJI;
        if (searchSpot == null || (alaSrc = searchSpot.getAlaSrc()) == null) {
            alaSrc = "";
        }
        c654760PmELIZIZ.LJIIZILJ("token_type", alaSrc);
        c654760PmELIZIZ.LJIIZILJ("list_result_type", "video");
        c654760PmELIZIZ.LJ("aladdin_words", aweme.getDesc());
        c654760PmELIZIZ.LJJIIZ(Integer.valueOf(this.LLJIJIL));
        c654760PmELIZIZ.LJJIJL(Integer.valueOf(i));
        c654760PmELIZIZ.LJIIZILJ("list_item_id", aweme.getAid());
        c654760PmELIZIZ.LJIJI("search_result_id", LJIIL());
        c654760PmELIZIZ.LJIILJJIL();
    }

    public C652890PjD(C652390PiP c652390PiP, InterfaceC641090PCp interfaceC641090PCp, InterfaceC652950PjJ interfaceC652950PjJ) {
        super(c652390PiP, interfaceC641090PCp, interfaceC652950PjJ);
        this.LLJIJIL = -1;
        this.LLJILJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(419));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS411S0200000_10(c652390PiP, this, 64));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILIIL(Context context, View view, Aweme aweme, List<? extends Aweme> list) {
        C1606420ruC c1606420ruCLIZ;
        C653660PkS c653660PkS = LJIIJJI().LLJI;
        String str = "general_search";
        if (!TextUtils.equals(c653660PkS.LJIIIIZZ, "general_search")) {
            str = "visual_search";
            if (!TextUtils.equals(c653660PkS.LJIIIIZZ, "visual_search")) {
                str = "smart_search_title";
                if (!TextUtils.equals(c653660PkS.LJIIIIZZ, "smart_search_title")) {
                    str = "search_result";
                }
            }
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
        C786410Ut5.LJJJI("video_from", "from_search_ad_no_request", bundle);
        bundle.putInt("search_detail", C301530Brr.LIZ());
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("search_keyword", c653660PkS.LJFF, bundle);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 70);
        C786410Ut5.LJJJI("search_id", c653660PkS.LJIIJ, bundle);
        C786410Ut5.LJJJI("key_search_type", c653660PkS.LJ, bundle);
        C786410Ut5.LJJJI("list_item_id", aweme.getAid(), bundle);
        C786410Ut5.LJJJI("search_result_id", AwemeExtKt.getAuthorUid(aweme), bundle);
        Bundle bundleLJFF = null;
        if (view != null) {
            c1606420ruCLIZ = C1607950rwf.LIZ(view, view.getWidth(), view.getHeight());
        } else {
            c1606420ruCLIZ = null;
        }
        C666390QBx.LIZIZ = list;
        C0PNL c0pnl = new C0PNL();
        c0pnl.LJIL(list);
        c0pnl.LLJJL = C643200PKs.LJ(aweme);
        C1603960rqE.LIZ = c0pnl;
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withParam(bundle);
        if (c1606420ruCLIZ != null) {
            bundleLJFF = c1606420ruCLIZ.LJFF();
        }
        smartRoute.withBundleAnimation(bundleLJFF);
        smartRoute.withParam("activity_has_activity_options", true);
        smartRoute.withUrl("//aweme/detail");
        smartRoute.open();
        C1483370ohj.LIZ(aweme);
        SearchSpot searchSpot = this.LLJI;
        if (searchSpot != null && searchSpot.getSearchSpotInfo() != null) {
            this.LLILLJJLI.LJJLI = new AwS589S0100000_10(this, 400);
            C666560QCo.LIZIZ(this.LLILLJJLI);
            InterfaceViewOnAttachStateChangeListenerC652360PiM interfaceViewOnAttachStateChangeListenerC652360PiM = LJIIIZ().LLJIJIL;
            if (interfaceViewOnAttachStateChangeListenerC652360PiM != null) {
                interfaceViewOnAttachStateChangeListenerC652360PiM.pk();
            }
        }
    }

    @Override // X.InterfaceC656470Poz
    public final void LJFF(int i, View view, Aweme aweme, List<? extends Aweme> list, boolean z) {
        String alaSrc;
        LJIILIIL(view.getContext(), view, aweme, list);
        C653660PkS c653660PkSLIZ = C660870Pw5.LIZ(this.LL.itemView);
        C654740PmC c654740PmCLIZ = C645940PVg.LIZ(c653660PkSLIZ);
        SearchSpot searchSpot = this.LLJI;
        if (searchSpot == null || (alaSrc = searchSpot.getAlaSrc()) == null) {
            alaSrc = "";
        }
        c654740PmCLIZ.LJIIZILJ("token_type", alaSrc);
        c654740PmCLIZ.LJIIZILJ("list_result_type", "video");
        c654740PmCLIZ.LJIIZILJ("aladdin_button_type", "click_video");
        c654740PmCLIZ.LJ("aladdin_words", aweme.getDesc());
        c654740PmCLIZ.LJJIIZ(Integer.valueOf(this.LLJIJIL));
        c654740PmCLIZ.LJJIJL(Integer.valueOf(i));
        c654740PmCLIZ.LJIIZILJ("list_item_id", aweme.getAid());
        c654740PmCLIZ.LJIJI("search_result_id", LJIIL());
        c654740PmCLIZ.LJIILJJIL();
        C663370Q0h.LIZLLL(view, "general_search", aweme, c653660PkSLIZ.LJFF, this.LLJIJIL, LJIIL(), aweme.getAid(), "aladdin_card", false, null);
    }
}
