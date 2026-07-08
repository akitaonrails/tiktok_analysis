package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.feed.adapter.widget.InteractionContainerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ABj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175291ABj extends C09AY implements Function0<ConstraintLayout> {
    public final /* synthetic */ InteractionContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2175291ABj(InteractionContainerWidget interactionContainerWidget) {
        super(0);
        this.LL = interactionContainerWidget;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ConstraintLayout invoke() {
        return this.LL.findViewById(R.id.i3m);
    }
}
