package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.InteractionContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ABi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175281ABi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InteractionContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2175281ABi(InteractionContainerWidget interactionContainerWidget) {
        super(0);
        this.LL = interactionContainerWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        InteractionContainerWidget interactionContainerWidget = this.LL;
        interactionContainerWidget.subWidgetManager.createWidget(interactionContainerWidget.findViewById(R.id.i3m), new AdCardWidget());
        return Unit.LIZ;
    }
}
