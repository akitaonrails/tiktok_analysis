package X;

import android.content.Context;
import com.ss.android.ugc.aweme.notification.view.NotificationTabProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583950rJx extends C09AY implements Function0<ViewOnClickListenerC1600510rkf> {
    public final /* synthetic */ NotificationTabProtocol LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1583950rJx(NotificationTabProtocol notificationTabProtocol) {
        super(0);
        this.LL = notificationTabProtocol;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewOnClickListenerC1600510rkf invoke() {
        Context context = this.LL.LLILLL;
        if (context != null) {
            return new ViewOnClickListenerC1600510rkf(context);
        }
        "context is null".toString();
        throw new IllegalArgumentException("context is null");
    }
}
