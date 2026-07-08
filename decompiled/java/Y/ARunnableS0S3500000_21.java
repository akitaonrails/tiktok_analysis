package Y;

import X.C1357250lQJ;
import X.C1358130lRj;
import X.C1360500lVY;
import X.C1C7U;
import X.C430840Guw;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.upvote.detail.panel.CommentRepostPanelCell;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS0S3500000_21 implements Runnable {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;
    public String s1;
    public String s2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        UpvoteStruct upvoteStruct;
        C1357250lQJ item = ((CommentRepostPanelCell) this.l3).getItem();
        if (Intrinsics.LJFF((item == null || (upvoteStruct = item.LL) == null) ? null : upvoteStruct.upvoteId, this.s0)) {
            C1360500lVY c1360500lVYN5 = ((CommentRepostPanelCell) this.l3).N5(this.s1, this.s2, (Bitmap) this.l4, (List) this.l5, (List) this.l6);
            CommentRepostPanelCell commentRepostPanelCell = (CommentRepostPanelCell) this.l3;
            TuxTextView tuxTextView = (TuxTextView) this.l7;
            commentRepostPanelCell.getClass();
            C430840Guw c430840Guw = C430840Guw.LIZ;
            Context context = commentRepostPanelCell.itemView.getContext();
            c430840Guw.getClass();
            C430840Guw.LIZLLL(tuxTextView, c1360500lVYN5, context);
        }
    }

    public final void LIZ$1() {
        UpvoteStruct upvoteStruct;
        C1358130lRj item = ((UpvotePanelListCell) this.l3).getItem();
        if (Intrinsics.LJFF((item == null || (upvoteStruct = item.LL) == null) ? null : upvoteStruct.upvoteId, this.s0)) {
            C1360500lVY c1360500lVYS5 = ((UpvotePanelListCell) this.l3).S5(this.s1, this.s2, (Bitmap) this.l4, (List) this.l5, (List) this.l6);
            C430840Guw c430840Guw = C430840Guw.LIZ;
            TuxTextView tuxTextView = (TuxTextView) this.l7;
            Context context = ((UpvotePanelListCell) this.l3).itemView.getContext();
            c430840Guw.getClass();
            C430840Guw.LIZLLL(tuxTextView, c1360500lVYS5, context);
        }
    }

    public static final void run$0(ARunnableS0S3500000_21 aRunnableS0S3500000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentRepostPanelCell@ed95.loadAvatarIntoSpan$1$onCompleted$1");
        try {
            aRunnableS0S3500000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentRepostPanelCell@ed95.loadAvatarIntoSpan$1$onCompleted$1");
    }

    public static final void run$1(ARunnableS0S3500000_21 aRunnableS0S3500000_21) {
        boolean zLIZ;
        C1C7U.LIZ("UpvotePanelListCell@a4df.loadFusedAvatarIntoSpan$1$onCompleted$1");
        try {
            aRunnableS0S3500000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UpvotePanelListCell@a4df.loadFusedAvatarIntoSpan$1$onCompleted$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS0S3500000_21(Object obj, CommentRepostPanelCell commentRepostPanelCell, String str, String str2, String str3, Bitmap bitmap, List<String> list, List<? extends TextExtraStruct> list2, TuxTextView tuxTextView) {
        this.$t = tuxTextView;
        this.l3 = obj;
        this.s0 = commentRepostPanelCell;
        this.s1 = str;
        this.s2 = str2;
        this.l4 = str3;
        this.l5 = bitmap;
        this.l6 = list;
        this.l7 = list2;
    }
}
