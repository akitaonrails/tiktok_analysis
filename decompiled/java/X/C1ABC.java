package X;

import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ABC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ABC extends C09AY implements Function0<RelativeLayout> {
    public final /* synthetic */ LabelContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ABC(LabelContainerWidget labelContainerWidget) {
        super(0);
        this.LL = labelContainerWidget;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.widget.RelativeLayout] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ RelativeLayout invoke() {
        return this.LL.findViewById(R.id.uhl);
    }
}
