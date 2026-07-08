package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561790qkD extends C09AY implements Function0<Fragment> {
    public final /* synthetic */ HomeFeedComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561790qkD(HomeFeedComponent homeFeedComponent) {
        super(0);
        this.LL = homeFeedComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Fragment invoke() {
        return this.LL.getPanelContext().LJ;
    }
}
