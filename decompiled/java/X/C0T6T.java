package X;

import Y.ARunnableS112S0100000_12;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T6T, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6T extends C09AY implements Function0<Runnable> {
    public final /* synthetic */ ViewPagerPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T6T(ViewPagerPanelComponent viewPagerPanelComponent) {
        super(0);
        this.LL = viewPagerPanelComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Runnable invoke() {
        return new ARunnableS112S0100000_12(this.LL, 224);
    }
}
