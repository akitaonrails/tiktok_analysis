package X;

import android.view.View;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import com.ss.android.ugc.now.interaction.assem.CommentCell;
import com.ss.android.ugc.now.interaction.assem.CommentItem;

/* JADX INFO: renamed from: X.0maJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ViewOnLongClickListenerC1401890maJ implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1401890maJ viewOnLongClickListenerC1401890maJ, View view) {
        return ((UpvotePanelListCell) viewOnLongClickListenerC1401890maJ.l0).z6(((C1358130lRj) viewOnLongClickListenerC1401890maJ.l1).LL);
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1401890maJ viewOnLongClickListenerC1401890maJ, View view) {
        return ((UpvotePanelListCell) viewOnLongClickListenerC1401890maJ.l0).z6(((C1358130lRj) viewOnLongClickListenerC1401890maJ.l1).LL);
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC1401890maJ viewOnLongClickListenerC1401890maJ, View view) {
        return ((UpvotePanelListCell) viewOnLongClickListenerC1401890maJ.l0).z6(((C1358130lRj) viewOnLongClickListenerC1401890maJ.l1).LL);
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC1401890maJ viewOnLongClickListenerC1401890maJ, View view) {
        ((CommentCell) viewOnLongClickListenerC1401890maJ.l0).T5((CommentItem) viewOnLongClickListenerC1401890maJ.l1);
        return true;
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC1401890maJ viewOnLongClickListenerC1401890maJ, View view) {
        ((CommentCell) viewOnLongClickListenerC1401890maJ.l0).T5((CommentItem) viewOnLongClickListenerC1401890maJ.l1);
        return true;
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC1401890maJ viewOnLongClickListenerC1401890maJ, View view) {
        ((CommentCell) viewOnLongClickListenerC1401890maJ.l0).T5((CommentItem) viewOnLongClickListenerC1401890maJ.l1);
        return true;
    }

    public static final boolean onLongClick$6(ViewOnLongClickListenerC1401890maJ viewOnLongClickListenerC1401890maJ, View view) {
        ((CommentCell) viewOnLongClickListenerC1401890maJ.l0).T5((CommentItem) viewOnLongClickListenerC1401890maJ.l1);
        return true;
    }

    public ViewOnLongClickListenerC1401890maJ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
