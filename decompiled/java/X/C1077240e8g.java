package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077240e8g extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077240e8g(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1077240e8g c1077240e8g, View view) {
        if (view != null) {
            ((Function0) c1077240e8g.l0).invoke();
        }
    }

    public static final void LIZ$1(C1077240e8g c1077240e8g, View view) {
        PollCell pollCell;
        C1341920l1a item;
        CommentContextSource commentContextSourceA6;
        Aweme aweme;
        String aid;
        Long l;
        if (view != null && (item = (pollCell = (PollCell) c1077240e8g.l0).getItem()) != null && (commentContextSourceA6 = pollCell.a6()) != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceA6)) != null && (aid = aweme.getAid()) != null && (l = item.LLILLL) != null) {
            long jLongValue = l.longValue();
            CommentPollViewModel commentPollViewModelX5 = pollCell.X5();
            C1347140lA0 c1347140lA0 = (C1347140lA0) ((LinkedHashMap) commentPollViewModelX5.LLILLJJLI).get(Long.valueOf(jLongValue));
            if (c1347140lA0 != null && Intrinsics.LJFF(c1347140lA0.LIZ, aid)) {
                commentPollViewModelX5.setStateImmediate(new AwS600S0100000_21(new C1075920e6Y(aid, null, Long.valueOf(jLongValue), 2), 90));
                C23250099c.LIZLLL(pollCell.X5().getAssemVMScope(), null, null, new C1074350e41(pollCell, aid, jLongValue, null), 3);
            }
        }
    }
}
