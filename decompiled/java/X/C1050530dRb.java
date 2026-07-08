package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS260S0300000_16;

/* JADX INFO: renamed from: X.0dRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050530dRb implements InterfaceC1350330lF9 {
    @Override // X.InterfaceC1350330lF9
    public final String H3() {
        return "TTCM";
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
        return 10;
    }

    @Override // X.InterfaceC1350330lF9
    public final Integer LJIIIIZZ(Aweme aweme) {
        return ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJIILJJIL();
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
        C1440005kM.LIZ(new C1050510dRZ(authorUid, str));
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LJI(CommentContextSource commentContextSource, Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        List<AnchorCommonStruct> anchors2;
        AnchorCommonStruct next;
        String keyword;
        String schema;
        if (aweme != null && commentContextSource != null && (anchors = aweme.getAnchors()) != null && !anchors.isEmpty() && (anchors2 = aweme.getAnchors()) != null) {
            Iterator<AnchorCommonStruct> it2 = anchors2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AnchorCommonStruct anchorCommonStruct = next;
                    if (anchorCommonStruct.getType() == 59 && anchorCommonStruct.getExtra().length() > 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = next;
            if (anchorCommonStruct2 != null && (keyword = anchorCommonStruct2.getKeyword()) != null && keyword.length() != 0 && (schema = anchorCommonStruct2.getSchema()) != null && schema.length() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
        List<AnchorCommonStruct> anchors;
        List<AnchorCommonStruct> anchors2;
        AnchorCommonStruct next;
        String keyword;
        String schema;
        if (aweme != null && (anchors = aweme.getAnchors()) != null && !anchors.isEmpty() && (anchors2 = aweme.getAnchors()) != null) {
            Iterator<AnchorCommonStruct> it2 = anchors2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AnchorCommonStruct anchorCommonStruct = next;
                    if (anchorCommonStruct.getType() == 59 && anchorCommonStruct.getExtra().length() > 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = next;
            if (anchorCommonStruct2 != null && (keyword = anchorCommonStruct2.getKeyword()) != null && keyword.length() != 0 && (schema = anchorCommonStruct2.getSchema()) != null && schema.length() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1350330lF9
    public final View LJIIL(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        CommentCommonModel commonModel;
        if (context == null) {
            return null;
        }
        ITcmService iTcmService = (ITcmService) ServiceManager.get().getService(ITcmService.class);
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.eventType) == null) {
            str = "";
        }
        return iTcmService.LJ(context, aweme, str, new AwS260S0300000_16(this, aweme, commentContextSource, 34));
    }
}
