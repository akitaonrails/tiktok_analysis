package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998990c6T extends C09AY implements Function0<C999410c79> {
    public final /* synthetic */ AdCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C998990c6T(AdCardWidget adCardWidget) {
        super(0);
        this.LL = adCardWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C999410c79 invoke() {
        return new C999410c79(this.LL.widgetCallback.getFragment());
    }
}
