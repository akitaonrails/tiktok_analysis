package X;

import android.view.View;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;

/* JADX INFO: renamed from: X.0T0X, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T0X {
    public static final RootCellComponent LIZ(C0SZ8 c0sz8) {
        VideoViewCell videoViewCell;
        if (!(c0sz8 instanceof VideoViewCell) || (videoViewCell = (VideoViewCell) c0sz8) == null) {
            return null;
        }
        return videoViewCell.LLZZZZ;
    }

    public static final VerticalViewPager LIZIZ(IViewPagerAbility iViewPagerAbility) {
        View view = iViewPagerAbility.getView();
        if (view instanceof VerticalViewPager) {
            return (VerticalViewPager) view;
        }
        return null;
    }
}
