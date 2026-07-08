package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.detail.panel.CommentRepostPanelCell;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0maQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ViewOnLongClickListenerC1401960maQ implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

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
            case 7:
                return onLongClick$7(this, view);
            case 8:
                return onLongClick$8(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC1401960maQ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1401960maQ viewOnLongClickListenerC1401960maQ, View view) {
        ((CommentRepostPanelCell) viewOnLongClickListenerC1401960maQ.l0).T5();
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1401960maQ viewOnLongClickListenerC1401960maQ, View view) {
        ((CommentRepostPanelCell) viewOnLongClickListenerC1401960maQ.l0).T5();
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC1401960maQ viewOnLongClickListenerC1401960maQ, View view) {
        UpvoteStruct upvoteStruct;
        C1358600lSU c1358600lSU = (C1358600lSU) viewOnLongClickListenerC1401960maQ.l0;
        C1358130lRj c1358130lRj = c1358600lSU.LJFF;
        Boolean boolInvoke = null;
        if (c1358130lRj != null && (upvoteStruct = c1358130lRj.LL) != null) {
            Function1<? super UpvoteStruct, Boolean> function1 = c1358600lSU.LJIIJJI;
            if (function1 != null) {
                boolInvoke = function1.invoke(upvoteStruct);
            }
            return Intrinsics.LJFF(boolInvoke, Boolean.TRUE);
        }
        return false;
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC1401960maQ viewOnLongClickListenerC1401960maQ, View view) {
        UpvoteStruct upvoteStruct;
        C1358130lRj item = ((UpvotePanelListCell) viewOnLongClickListenerC1401960maQ.l0).getItem();
        if (item == null || (upvoteStruct = item.LL) == null || !((UpvotePanelListCell) viewOnLongClickListenerC1401960maQ.l0).z6(upvoteStruct)) {
            return false;
        }
        return true;
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC1401960maQ viewOnLongClickListenerC1401960maQ, View view) {
        return ((BaseRepostCell) viewOnLongClickListenerC1401960maQ.l0).b6();
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC1401960maQ viewOnLongClickListenerC1401960maQ, View view) {
        ((PollCell) viewOnLongClickListenerC1401960maQ.l0).T5();
        PollCell pollCell = (PollCell) viewOnLongClickListenerC1401960maQ.l0;
        ConstraintLayout constraintLayout = pollCell.LL;
        if (constraintLayout != null) {
            constraintLayout.setBackground(pollCell.LLJL);
        }
        return ((PollCell) viewOnLongClickListenerC1401960maQ.l0).h6();
    }

    public static final boolean onLongClick$6(ViewOnLongClickListenerC1401960maQ viewOnLongClickListenerC1401960maQ, View view) {
        ((PollCell) viewOnLongClickListenerC1401960maQ.l0).T5();
        PollCell pollCell = (PollCell) viewOnLongClickListenerC1401960maQ.l0;
        ConstraintLayout constraintLayout = pollCell.LL;
        if (constraintLayout != null) {
            constraintLayout.setBackground(pollCell.LLJL);
        }
        return ((PollCell) viewOnLongClickListenerC1401960maQ.l0).h6();
    }

    public static final boolean onLongClick$7(ViewOnLongClickListenerC1401960maQ viewOnLongClickListenerC1401960maQ, View view) {
        float f;
        C1331070kk5 hierarchy;
        C1331100kk8 c1331100kk8;
        float[] fArr;
        C426320Gne c426320Gne = ((C1341150l0L) viewOnLongClickListenerC1401960maQ.l0).LJ;
        if (c426320Gne == null || c426320Gne.getVisibility() != 0) {
            C1341780l1M c1341780l1M = C1341780l1M.LIZ;
            C424580Gkq c424580Gkq = ((C1341150l0L) viewOnLongClickListenerC1401960maQ.l0).LIZJ;
            EnumC1341650l19 enumC1341650l19 = EnumC1341650l19.IMAGE;
            if (c424580Gkq != null && (hierarchy = c424580Gkq.getHierarchy()) != null && (c1331100kk8 = hierarchy.LIZJ) != null && (fArr = c1331100kk8.LIZJ) != null) {
                f = fArr[0];
            } else {
                f = 0.0f;
            }
            C1341780l1M.LIZIZ(c1341780l1M, c424580Gkq, enumC1341650l19, f, null, 8);
            Runnable runnable = ((C1341150l0L) viewOnLongClickListenerC1401960maQ.l0).LJIIL;
            if (runnable != null) {
                runnable.run();
                return true;
            }
        }
        return true;
    }

    public static final boolean onLongClick$8(ViewOnLongClickListenerC1401960maQ viewOnLongClickListenerC1401960maQ, View view) {
        float f;
        C1331070kk5 hierarchy;
        C1331100kk8 c1331100kk8;
        float[] fArr;
        C426320Gne c426320Gne = ((C1341150l0L) viewOnLongClickListenerC1401960maQ.l0).LJ;
        if (c426320Gne == null || c426320Gne.getVisibility() != 0) {
            C1341780l1M c1341780l1M = C1341780l1M.LIZ;
            C424580Gkq c424580Gkq = ((C1341150l0L) viewOnLongClickListenerC1401960maQ.l0).LIZJ;
            EnumC1341650l19 enumC1341650l19 = EnumC1341650l19.IMAGE;
            if (c424580Gkq != null && (hierarchy = c424580Gkq.getHierarchy()) != null && (c1331100kk8 = hierarchy.LIZJ) != null && (fArr = c1331100kk8.LIZJ) != null) {
                f = fArr[0];
            } else {
                f = 0.0f;
            }
            C1341780l1M.LIZIZ(c1341780l1M, c424580Gkq, enumC1341650l19, f, null, 8);
            Runnable runnable = ((C1341150l0L) viewOnLongClickListenerC1401960maQ.l0).LJIIL;
            if (runnable != null) {
                runnable.run();
                return true;
            }
        }
        return true;
    }
}
