package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.story.api.IStoryHorizontalImmersiveDataAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741350T6f extends C09AY implements Function0<IStoryHorizontalImmersiveDataAbility> {
    public final /* synthetic */ ViewPagerPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C741350T6f(ViewPagerPanelComponent viewPagerPanelComponent) {
        super(0);
        this.LL = viewPagerPanelComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.story.api.IStoryHorizontalImmersiveDataAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IStoryHorizontalImmersiveDataAbility invoke() {
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI != null) {
            return C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IStoryHorizontalImmersiveDataAbility.class, null);
        }
        return null;
    }
}
