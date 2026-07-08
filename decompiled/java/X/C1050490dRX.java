package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AwS260S0300000_16;

/* JADX INFO: renamed from: X.0dRX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050490dRX implements InterfaceC1350330lF9 {
    @Override // X.InterfaceC1350330lF9
    public final String H3() {
        return "TTBA";
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
    public final boolean LJI(CommentContextSource commentContextSource, Aweme aweme) {
        return (aweme == null || commentContextSource == null) ? false : true;
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
        return ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LIZLLL();
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZJ(CommentContextSource commentContextSource, Aweme aweme) {
        CommentCommonModel commonModel;
        String str;
        C1350340lFA.LIZ(this, aweme, commentContextSource);
        if (aweme != null && ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJFF(aweme) != null) {
            String aid = aweme.getAid();
            String str2 = "";
            if (aid == null) {
                aid = "";
            }
            if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null && (str = commonModel.eventType) != null) {
                str2 = str;
            }
            C1440005kM.LIZ(new C1050440dRS(aid, str2));
        }
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
        if (aweme == null || ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJFF(aweme) == null) {
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
        IBAAnchorService iBAAnchorService = (IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class);
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.eventType) == null) {
            str = "";
        }
        C1050430dRR c1050430dRRLJIIJ = iBAAnchorService.LJIIJ(context, aweme, str, new AwS260S0300000_16(this, aweme, commentContextSource, 33));
        if (c1050430dRRLJIIJ != null) {
            C786410Ut5.LJLLLLLL(0, c1050430dRRLJIIJ);
        }
        return c1050430dRRLJIIJ;
    }
}
