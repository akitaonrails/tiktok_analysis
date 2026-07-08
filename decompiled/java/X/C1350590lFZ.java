package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.component.CommonTopBarView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS94S0500000_21;

/* JADX INFO: renamed from: X.0lFZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350590lFZ {
    public static Set LIZ() {
        return C093Y.LJ(new C1342310l2D(), new C726140Se4(), new C1050480dRW(), new C1050490dRX(), new C1350630lFd(), new C735510StB(), new C1348480lCA(), new C1350780lFs(), new C1050530dRb(), new InterfaceC1350330lF9() { // from class: X.0lFX
            @Override // X.InterfaceC1350330lF9
            public final String H3() {
                return "explore_interest";
            }

            @Override // X.InterfaceC1350330lF9
            public final void LIZ() {
            }

            @Override // X.InterfaceC1350330lF9
            public final void LJ() {
            }

            @Override // X.InterfaceC1350330lF9
            public final void LJIIIZ(Aweme aweme) {
            }

            @Override // X.InterfaceC1350330lF9
            public final int zg() {
                return 16;
            }

            @Override // X.InterfaceC1350330lF9
            public final Map LJFF(Aweme aweme) {
                C1350580lFY.LIZ.getClass();
                return C1350580lFY.LIZ(aweme);
            }

            @Override // X.InterfaceC1350330lF9
            public final Map LJII(Aweme aweme) {
                C1350580lFY.LIZ.getClass();
                return C1350580lFY.LIZ(aweme);
            }

            @Override // X.InterfaceC1350330lF9
            public final Integer LJIIIIZZ(Aweme aweme) {
                return Integer.valueOf(R.layout.agv);
            }

            @Override // X.InterfaceC1350330lF9
            public final void LIZJ(CommentContextSource commentContextSource, Aweme aweme) {
                String str;
                CommentCommonModel commonModel;
                C1350340lFA.LIZ(this, aweme, commentContextSource);
                C1350580lFY c1350580lFY = C1350580lFY.LIZ;
                String str2 = null;
                if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
                    str = commonModel.eventType;
                } else {
                    str = null;
                }
                c1350580lFY.getClass();
                CommentTopBarComponent commentTopBarComponentLIZJ = C1350580lFY.LIZJ(aweme);
                if (commentTopBarComponentLIZJ != null) {
                    str2 = commentTopBarComponentLIZJ.tracerInfo;
                }
                C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                HashMap mapLIZIZ = C1350580lFY.LIZIZ(str2);
                c1350920lG6.getClass();
                C1350920lG6.LJLIIIL(aweme, "ttexp_comment_top_component_show", "explore_interest", str, mapLIZIZ);
            }

            @Override // X.InterfaceC1350330lF9
            public final boolean LJI(CommentContextSource commentContextSource, Aweme aweme) {
                C1350580lFY.LIZ.getClass();
                if (C1350580lFY.LIZJ(aweme) != null && C294800Bh0.LIZ()) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1350330lF9
            public final boolean LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
                return LJI(null, aweme);
            }

            @Override // X.InterfaceC1350330lF9
            public final View LJIIL(Context context, Aweme aweme, CommentContextSource commentContextSource) {
                C1350580lFY.LIZ.getClass();
                CommentTopBarComponent commentTopBarComponentLIZJ = C1350580lFY.LIZJ(aweme);
                if (commentTopBarComponentLIZJ == null || context == null) {
                    return null;
                }
                CommonTopBarView commonTopBarView = new CommonTopBarView(context, null, 6);
                C733302tf.LIZJ(commentTopBarComponentLIZJ);
                commonTopBarView.LIZ(commentTopBarComponentLIZJ, false, new AwS94S0500000_21(commentTopBarComponentLIZJ, context, this, aweme, commentContextSource, 0));
                return commonTopBarView;
            }
        });
    }
}
