package X;

import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarContainer;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIcon;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIconStyle;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarMargin;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarPadding;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarText;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarTextStyle;
import com.ss.android.ugc.aweme.feed.model.EllipsisType;

/* JADX INFO: renamed from: X.02tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C733402tg {
    public static final CommentTopBarComponent LIZ;

    static {
        int value = EnumC804003Cc.ANCHOR_TEMPLATE.getValue();
        CommentTopBarContainer commentTopBarContainer = new CommentTopBarContainer(56, new CommentTopBarPadding(0, 12, 12, 0), new CommentTopBarMargin(0, 0, 12, 0));
        CommentTopBarIcon commentTopBarIcon = new CommentTopBarIcon(null, new CommentTopBarIconStyle(24, 2), new CommentTopBarMargin(0, 6, 14, 0), new CommentTopBarPadding(0, 0, 0, 0), null, null, null);
        EllipsisType ellipsisType = EllipsisType.END;
        CommentTopBarText commentTopBarText = new CommentTopBarText(null, new CommentTopBarTextStyle(1, 150, 13, "UIText1", 0, Integer.valueOf(ellipsisType.ordinal()), "P2-Semibold"), null, new CommentTopBarMargin(0, 0, 4, 0));
        CommentTopBarText commentTopBarText2 = new CommentTopBarText(null, new CommentTopBarTextStyle(1, null, 13, "UIText1", 0, Integer.valueOf(ellipsisType.ordinal()), "P2-Semibold"), null, new CommentTopBarMargin(0, 0, 4, 0));
        LIZ = new CommentTopBarComponent(Integer.valueOf(value), null, null, null, commentTopBarIcon, commentTopBarText, new CommentTopBarText(null, new CommentTopBarTextStyle(1, null, 13, "UIText1", 0, Integer.valueOf(ellipsisType.ordinal()), "P2-Semibold"), null, new CommentTopBarMargin(0, 0, 0, 0)), commentTopBarText2, new CommentTopBarText(null, new CommentTopBarTextStyle(1, null, 12, "UIText2", 0, Integer.valueOf(ellipsisType.ordinal()), "P3-Regular"), null, new CommentTopBarMargin(1, 0, 0, 0)), new CommentTopBarText(null, new CommentTopBarTextStyle(1, null, 12, "UIText2", 0, Integer.valueOf(ellipsisType.ordinal()), "P3-Regular"), null, new CommentTopBarMargin(1, 0, 0, 0)), new CommentTopBarText(null, new CommentTopBarTextStyle(1, null, 12, "UIText2", 0, Integer.valueOf(ellipsisType.ordinal()), "P3-Regular"), null, new CommentTopBarMargin(1, 0, 0, 0)), null, null, commentTopBarContainer, null, null, null, null, null);
    }
}
