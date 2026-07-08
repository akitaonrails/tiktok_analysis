package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XTabESportsHighlightCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XtabESportshighlightCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.partnership.EsportsHighlightVideosResponse;

/* JADX INFO: renamed from: X.0zAI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885480zAI extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ XTabESportsHighlightCard LL;
    public final /* synthetic */ C1104210eqB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885480zAI(C1104210eqB c1104210eqB, XTabESportsHighlightCard xTabESportsHighlightCard) {
        super(2);
        this.LL = xTabESportsHighlightCard;
        this.LLILLJJLI = c1104210eqB;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        String str2;
        EsportsHighlightVideosResponse.EsportsInfo esportsInfo;
        String str3;
        EsportsHighlightVideosResponse.EsportsInfo esportsInfo2;
        XTabESportsHighlightCard xTabESportsHighlightCard = this.LL;
        C1104220eqC c1104220eqC = this.LLILLJJLI.LL;
        xTabESportsHighlightCard.getClass();
        if (c1104220eqC != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_highlights_video_show");
            c474500IjALIZ.LJJII(c1104220eqC.LIZLLL, "item_id");
            String strLJFF = C1882380z5I.LJFF(C1882380z5I.LIZJ(xTabESportsHighlightCard.LLILLL), "room_id");
            String str4 = "";
            if (strLJFF == null) {
                strLJFF = "";
            }
            c474500IjALIZ.LJJII(strLJFF, "room_id");
            String strLJFF2 = C1882380z5I.LJFF(C1882380z5I.LIZJ(xTabESportsHighlightCard.LLILLL), "author_id");
            if (strLJFF2 == null) {
                strLJFF2 = "";
            }
            c474500IjALIZ.LJJII(strLJFF2, "anchor_id");
            XtabESportshighlightCardVM xtabESportshighlightCardVM = xTabESportsHighlightCard.LLJJJJLIIL;
            if (xtabESportshighlightCardVM == null || (esportsInfo2 = xtabESportshighlightCardVM.LLILZ) == null || (str2 = esportsInfo2.gameId) == null) {
                str2 = "";
            }
            c474500IjALIZ.LJJII(str2, "game_id");
            XtabESportshighlightCardVM xtabESportshighlightCardVM2 = xTabESportsHighlightCard.LLJJJJLIIL;
            if (xtabESportshighlightCardVM2 != null && (esportsInfo = xtabESportshighlightCardVM2.LLILZ) != null && (str3 = esportsInfo.gameName) != null) {
                str4 = str3;
            }
            c474500IjALIZ.LJJII(str4, "game_name");
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }
}
