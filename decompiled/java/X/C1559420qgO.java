package X;

import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent;
import com.ss.android.ugc.feed.platform.tablet.ITabletExternalDeviceFeedScrollRecordAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559420qgO extends C09AY implements Function0<ITabletExternalDeviceFeedScrollRecordAbility> {
    public final /* synthetic */ ViewPagerPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559420qgO(ViewPagerPanelComponent viewPagerPanelComponent) {
        super(0);
        this.LL = viewPagerPanelComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.tablet.ITabletExternalDeviceFeedScrollRecordAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final ITabletExternalDeviceFeedScrollRecordAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), ITabletExternalDeviceFeedScrollRecordAbility.class, null);
    }
}
