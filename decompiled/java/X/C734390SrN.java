package X;

import android.content.Context;
import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.LikeEffectModel;
import com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734390SrN {
    public static final C734390SrN LIZ = new C734390SrN();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(286));

    public static ILikeEffectService LIZ() {
        return (ILikeEffectService) LIZIZ.getValue();
    }

    public static final void LIZIZ(Aweme aweme, String str) {
        String url;
        String str2;
        String authorUid;
        AwemeRawAd awemeRawAdLJJIIJZLJL;
        AdStyleActionModel adStyleActionModel;
        LikeEffectModel likeEffectModel;
        SimpleUriAndUrl simpleUriAndUrl;
        String aid = null;
        if (aweme != null && (awemeRawAdLJJIIJZLJL = C1017070cZd.LJJIIJZLJL(aweme)) != null && (adStyleActionModel = awemeRawAdLJJIIJZLJL.getAdStyleActionModel()) != null && (likeEffectModel = adStyleActionModel.likeEffect) != null && (simpleUriAndUrl = likeEffectModel.effectImgUrl) != null) {
            url = simpleUriAndUrl.getUrl();
        } else {
            url = null;
        }
        if (url != null && url.length() != 0) {
            str2 = "image_load_fail";
        } else {
            str2 = "no_data";
        }
        if (aweme != null && aweme.isAd()) {
            LIZ.getClass();
            ILikeEffectService iLikeEffectServiceLIZ = LIZ();
            if (iLikeEffectServiceLIZ != null) {
                iLikeEffectServiceLIZ.LJII(aweme, str2);
                return;
            }
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null) {
            aid = aweme.getAid();
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("fail_reason", str2);
        c2344009Gk.LIZJ(2, "nova_like_effect_type");
        C20684815ws.LJIILLIIL("nova_like_effect_view_fail", c2344009Gk.LIZ);
    }

    public static final void LIZJ(Aweme aweme, String str) {
        String aid;
        if (C1017070cZd.LJJLIIIIJ(aweme)) {
            LIZ.getClass();
            ILikeEffectService iLikeEffectServiceLIZ = LIZ();
            if (iLikeEffectServiceLIZ != null) {
                iLikeEffectServiceLIZ.LJFF(aweme);
                return;
            }
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("author_id", C1017070cZd.LJIJ(aweme));
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c0lab.LJ("group_id", aid);
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(1, "nova_like_button_effect");
        C20684815ws.LJIILLIIL("nova_like_button_effect_view", c0lab.LIZ);
    }

    public static final void LIZLLL(Aweme aweme, String str) {
        String authorUid;
        if (aweme != null && aweme.isAd()) {
            LIZ.getClass();
            ILikeEffectService iLikeEffectServiceLIZ = LIZ();
            if (iLikeEffectServiceLIZ != null) {
                iLikeEffectServiceLIZ.LIZLLL(aweme);
                return;
            }
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String aid = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null) {
            aid = aweme.getAid();
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(2, "nova_like_effect_type");
        C20684815ws.LJIILLIIL("nova_like_effect_view", c2344009Gk.LIZ);
    }

    public static void LJ(Context context, Aweme aweme, Function1 function1) {
        String url;
        C734390SrN c734390SrN = LIZ;
        c734390SrN.getClass();
        ILikeEffectService iLikeEffectServiceLIZ = LIZ();
        String uri = null;
        if (iLikeEffectServiceLIZ != null && iLikeEffectServiceLIZ.LJIIIZ(context, aweme) != null) {
            function1.invoke(Boolean.TRUE);
            return;
        }
        final AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(function1, (Function1<? super C0RTH, Unit>) 366);
        SimpleUriAndUrl simpleUriAndUrlLJJII = C1017070cZd.LJJII(aweme);
        if (simpleUriAndUrlLJJII != null) {
            url = simpleUriAndUrlLJJII.getUrl();
            uri = simpleUriAndUrlLJJII.getUri();
        } else {
            url = null;
        }
        if (context == null || url == null || url.length() == 0 || uri == null || uri.length() == 0) {
            return;
        }
        c734390SrN.getClass();
        ILikeEffectService iLikeEffectServiceLIZ2 = LIZ();
        if (iLikeEffectServiceLIZ2 == null) {
            return;
        }
        iLikeEffectServiceLIZ2.LJIIJ(context, url, uri, new InterfaceC1018470cbt() { // from class: X.0SrO
            @Override // X.InterfaceC1018470cbt
            public final void LIZ(boolean z) {
                Function1<Boolean, Unit> function12 = awS590S0100000_11;
                if (function12 != null) {
                    function12.invoke(Boolean.valueOf(z));
                }
            }
        });
    }
}
