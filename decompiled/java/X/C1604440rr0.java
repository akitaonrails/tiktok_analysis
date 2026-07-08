package X;

import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604440rr0 extends C09AY implements Function0<C1604450rr1> {
    public final /* synthetic */ ScreenAdaptionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1604440rr0(ScreenAdaptionComponent screenAdaptionComponent) {
        super(0);
        this.LL = screenAdaptionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1604450rr1 invoke() {
        return new C1604450rr1(this.LL.Ho(), this.LL.Go(), true);
    }
}
