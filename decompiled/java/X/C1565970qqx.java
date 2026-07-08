package X;

import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565970qqx extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ RootPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565970qqx(RootPanelComponent rootPanelComponent) {
        super(1);
        this.LL = rootPanelComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.LL.Go();
        return Unit.LIZ;
    }
}
