package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.adapter.widget.videobottomblock.VideoBottomBarBlockWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.188S, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C188S extends C09AY implements Function0<View> {
    public final /* synthetic */ VideoBottomBarBlockWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C188S(VideoBottomBarBlockWidget videoBottomBarBlockWidget) {
        super(0);
        this.LL = videoBottomBarBlockWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ View invoke() {
        return this.LL.findViewById(R.id.video_bottom_bar_block);
    }
}
