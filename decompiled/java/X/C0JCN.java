package X;

import android.text.Editable;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.chatroom.api.AtWithIndex;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import java.util.List;

/* JADX INFO: renamed from: X.0JCN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0JCN {
    void CN1(SpaceCommentItem spaceCommentItem, String str, List list);

    void FF1(String str, List<AtWithIndex> list, SpacePost spacePost);

    void Ga(Editable editable, List<AtWithIndex> list);

    void LJJLI();

    Editable Mq();

    void Rd(DialogFragment dialogFragment);

    String sp();
}
