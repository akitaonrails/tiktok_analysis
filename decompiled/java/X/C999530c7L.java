package X;

import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999530c7L extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C999530c7L(View view) {
        super(0);
        this.LL = view;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.widget.FrameLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        return this.LL.findViewById(R.id.ad_feed_card_container);
    }
}
