package X;

import android.content.Context;
import com.ss.android.ugc.aweme.newfollow.ui.DiscoverCompassTabProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rKG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584140rKG extends C09AY implements Function0<ViewOnClickListenerC1586300rNk> {
    public final /* synthetic */ DiscoverCompassTabProtocol LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584140rKG(DiscoverCompassTabProtocol discoverCompassTabProtocol) {
        super(0);
        this.LL = discoverCompassTabProtocol;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewOnClickListenerC1586300rNk invoke() {
        Context context = this.LL.LLILZ;
        if (context != null) {
            return new ViewOnClickListenerC1586300rNk(context);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
