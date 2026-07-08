package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AB8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AB8 extends C09AY implements Function0<TuxTextView> {
    public final /* synthetic */ LabelContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AB8(LabelContainerWidget labelContainerWidget) {
        super(0);
        this.LL = labelContainerWidget;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.bytedance.tux.input.TuxTextView] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ TuxTextView invoke() {
        return this.LL.findViewById(R.id.i0o);
    }
}
