package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.adapter.widget.LiveInfoContainerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999200c6o extends C09AY implements Function0<View> {
    public final /* synthetic */ LiveInfoContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C999200c6o(LiveInfoContainerWidget liveInfoContainerWidget) {
        super(0);
        this.LL = liveInfoContainerWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ View invoke() {
        return this.LL.P1().findViewById(R.id.zv4);
    }
}
