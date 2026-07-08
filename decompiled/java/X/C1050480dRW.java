package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService;
import com.ss.android.ugc.aweme.commercialize.anchor.service.CommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS260S0300000_16;

/* JADX INFO: renamed from: X.0dRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050480dRW implements InterfaceC1350330lF9 {
    @Override // X.InterfaceC1350330lF9
    public final String H3() {
        return "commerce_comment_anchor";
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJFF(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJII(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJIIIZ(Aweme aweme) {
    }

    @Override // X.InterfaceC1350330lF9
    public final int zg() {
        return 9;
    }

    @Override // X.InterfaceC1350330lF9
    public final Integer LJIIIIZZ(Aweme aweme) {
        return CommerceAnchorService.LJIILL().LJIIL();
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZJ(CommentContextSource commentContextSource, Aweme aweme) {
        String str;
        CommentCommonModel commonModel;
        C1350340lFA.LIZ(this, aweme, commentContextSource);
        String authorUid = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.eventType) == null) {
            str = "";
        }
        C1440005kM.LIZ(new C1050160dR0(authorUid, str));
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LJI(CommentContextSource commentContextSource, Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null || commentContextSource == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty() || !CommerceAnchorService.LJIILL().LIZJ(anchors)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty() || !CommerceAnchorService.LJIILL().LIZJ(anchors)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1350330lF9
    public final View LJIIL(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        CommentCommonModel commonModel;
        if (context == null) {
            return null;
        }
        ICommerceAnchorService iCommerceAnchorServiceLJIILL = CommerceAnchorService.LJIILL();
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.eventType) == null) {
            str = "";
        }
        return iCommerceAnchorServiceLJIILL.LJIIJJI(context, aweme, str, new AwS260S0300000_16(this, aweme, commentContextSource, 35));
    }
}
