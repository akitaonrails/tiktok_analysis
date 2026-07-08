package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo;
import com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS119S0400000_24;
import kotlin.jvm.internal.AwS38S0600000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r9H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577330r9H {
    public boolean LIZ = true;
    public C09AY LIZIZ;
    public InterfaceC1577340r9I LIZJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final void LIZLLL(boolean z) {
        ?? r0;
        this.LIZ = z;
        if (z && (r0 = this.LIZIZ) != 0) {
            r0.invoke();
            this.LIZIZ = null;
        }
    }

    public final void LIZ(Aweme aweme, Long l) {
        PaidContentInfo paidContentInfo;
        MiniDramaCardInfo miniDramaCardInfo;
        InterfaceC1577340r9I interfaceC1577340r9I = this.LIZJ;
        if (interfaceC1577340r9I != null) {
            interfaceC1577340r9I.LIZLLL();
        }
        C1573870r3h c1573870r3h = C1573870r3h.LIZ;
        Boolean bool = Boolean.TRUE;
        C1577310r9F.LIZ.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("series_enter_entrance", "fyf_special_shape_card"), new Pair("source_series_card_type", C1577310r9F.LIZ(aweme)), new Pair("source_series_card_id", C1577310r9F.LIZIZ(aweme)));
        if (aweme != null && aweme.getAwemeType() == 110 && (paidContentInfo = aweme.mPaidContentInfo) != null && (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) != null) {
            Integer num = miniDramaCardInfo.style;
            int value = MiniDramaFeedCardStyle.MINI_DRAMA_FEED_CARD_STYLE_HIGHLIGHT_VIDEO.getValue();
            if (num != null && num.intValue() == value) {
                mapLJIIJ.put("source_video_id", aweme.getAid());
            }
        }
        c1573870r3h.getClass();
        C1573870r3h.LIZ("homepage_hot", l, 1L, bool, mapLJIIJ, false, "", false);
    }

    public final void LIZIZ(Aweme aweme, Context context, HomeViewPagerAbility homeViewPagerAbility) {
        String str;
        MiniDramaCardInfo miniDramaCardInfo;
        C1577460r9U.LLILLJJLI.LJIIIZ(context, new C1577450r9T(context, aweme, new AwS119S0400000_24(this, context, aweme, homeViewPagerAbility, 2), true));
        PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
        if (paidContentInfo != null && (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) != null) {
            str = miniDramaCardInfo.cardType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "drama_guide")) {
            C20550115b9.LIZ.getClass();
            C20550115b9.LJIILIIL(92);
        }
        C1577310r9F.LIZ.getClass();
        C1577310r9F.LIZLLL(aweme, "click", "1", "explore_more", "");
    }

    public final void LIZJ(Context context, Aweme aweme, Long l, Long l2, HomeViewPagerAbility homeViewPagerAbility) {
        String str;
        String string;
        MiniDramaCardInfo miniDramaCardInfo;
        if (aweme == null) {
            return;
        }
        C1577460r9U.LLILLJJLI.LJIIIZ(context, new C1577450r9T(context, aweme, new AwS38S0600000_24(this, context, aweme, l2, homeViewPagerAbility, l, 0), true));
        PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
        if (paidContentInfo != null && (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) != null) {
            str = miniDramaCardInfo.cardType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "drama_guide")) {
            C20550115b9.LIZ.getClass();
            C20550115b9.LJIILIIL(92);
        }
        C1577310r9F c1577310r9F = C1577310r9F.LIZ;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        c1577310r9F.getClass();
        C1577310r9F.LIZLLL(aweme, "click", "1", "collection", string);
    }
}
