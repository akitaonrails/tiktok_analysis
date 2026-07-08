package X;

import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: renamed from: X.0lFA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350340lFA {
    public static void LIZ(InterfaceC1350330lF9 interfaceC1350330lF9, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        CommentCommonModel commonModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnchorShow componentTag = ");
        sbLIZ.append(interfaceC1350330lF9.H3());
        C2188811AlT.LIZIZ(sbLIZ);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        String strH3 = interfaceC1350330lF9.H3();
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            str = commonModel.eventType;
        } else {
            str = null;
        }
        Map mapLJII = interfaceC1350330lF9.LJII(aweme);
        c1350920lG6.getClass();
        C1350920lG6.LJLIIIL(aweme, "comment_top_component_show", strH3, str, mapLJII);
    }

    public static void LIZIZ(InterfaceC1350330lF9 interfaceC1350330lF9, Aweme aweme, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnchorClicked componentTag = ");
        sbLIZ.append(interfaceC1350330lF9.H3());
        C2188811AlT.LIZIZ(sbLIZ);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        String strH3 = interfaceC1350330lF9.H3();
        Map mapLJFF = interfaceC1350330lF9.LJFF(aweme);
        c1350920lG6.getClass();
        C1350920lG6.LJLIIIL(aweme, "comment_top_component_click", strH3, str, mapLJFF);
    }
}
