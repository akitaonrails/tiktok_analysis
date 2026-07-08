package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698600Rak extends C09AY implements Function0<C721850STf> {
    public final /* synthetic */ InteractAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698600Rak(InteractAreaComponent interactAreaComponent) {
        super(0);
        this.LL = interactAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C721850STf invoke() {
        return new C721850STf(this.LL.getLifecycle());
    }
}
