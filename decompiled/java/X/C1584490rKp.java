package X;

import android.content.Context;
import com.ss.android.ugc.aweme.explore.entrance.ExploreBottomTabProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584490rKp extends C09AY implements Function0<ViewOnClickListenerC1584630rL3> {
    public final /* synthetic */ ExploreBottomTabProtocol LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584490rKp(ExploreBottomTabProtocol exploreBottomTabProtocol) {
        super(0);
        this.LL = exploreBottomTabProtocol;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewOnClickListenerC1584630rL3 invoke() {
        Context context = this.LL.LLILZ;
        if (context != null) {
            return new ViewOnClickListenerC1584630rL3(context);
        }
        "context is null".toString();
        throw new IllegalArgumentException("context is null");
    }
}
