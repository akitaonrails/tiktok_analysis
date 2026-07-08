package X;

import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604410rqx extends C09AY implements Function0<C1604390rqv> {
    public final /* synthetic */ ScreenAdaptionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1604410rqx(ScreenAdaptionComponent screenAdaptionComponent) {
        super(0);
        this.LL = screenAdaptionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1604390rqv invoke() {
        return new C1604390rqv(this.LL);
    }
}
