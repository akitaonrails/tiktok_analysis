package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lBC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347880lBC implements InterfaceC1353430lK9 {
    public final /* synthetic */ BaseCommentCell<C1340400kz8> LIZ;

    public C1347880lBC(BaseCommentCell<C1340400kz8> baseCommentCell) {
        this.LIZ = baseCommentCell;
    }

    @Override // X.InterfaceC1353430lK9
    public final void LIZ(View view, TextExtraStruct textExtraStruct) {
        String str;
        String cid;
        String str2;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        View view2 = view;
        C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
        CommentContextSource commentContextSourceI6 = this.LIZ.i6();
        if (view2 == null) {
            view2 = this.LIZ.itemView;
        }
        c1340510kzJ.getClass();
        if (!C1340510kzJ.LIZ(commentContextSourceI6, view2) && textExtraStruct != null && textExtraStruct.getType() == 9) {
            long groupId = textExtraStruct.getGroupId();
            C1231470i9R c1231470i9RLIZIZ = C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "comment", "comment_list");
            Context context = this.LIZ.itemView.getContext();
            EnumC1230500i7s enumC1230500i7s = EnumC1230500i7s.JOIN_CLICK_COMMENT_CELL;
            EnumC1229960i70 enumC1229960i70 = EnumC1229960i70.UNKNOWN;
            CommentContextSource commentContextSourceI62 = this.LIZ.i6();
            if (commentContextSourceI62 != null && (commonModel2 = commentContextSourceI62.getCommonModel()) != null) {
                str = commonModel2.enterFrom;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            C1229500i6G c1229500i6G = new C1229500i6G(2, 0, 112, str, "comment_panel_group_link", (String) null, false);
            String strValueOf = String.valueOf(groupId);
            Pair[] pairArr = new Pair[4];
            Comment commentQ6 = this.LIZ.q6();
            if (commentQ6 == null || (cid = commentQ6.getCid()) == null) {
                cid = "";
            }
            pairArr[0] = new Pair("comment_id", cid);
            CommentContextSource commentContextSourceI63 = this.LIZ.i6();
            if (commentContextSourceI63 == null || (commonModel = commentContextSourceI63.getCommonModel()) == null || (str2 = commonModel.enterFrom) == null) {
                str2 = "";
            }
            pairArr[1] = new Pair("invite_enter_from", str2);
            String groupScene = textExtraStruct.getGroupScene();
            if (groupScene != null) {
                str3 = groupScene;
            }
            pairArr[2] = new Pair("invite_enter_method", str3);
            pairArr[3] = new Pair("invite_event", "post_comment");
            c1231470i9RLIZIZ.LIZIZ(context, new C1230080i7C(enumC1230500i7s, enumC1229960i70, c1229500i6G, strValueOf, C2097608Jq.LJIIIIZZ(pairArr), false, null, false, null, 480), null);
        }
    }
}
