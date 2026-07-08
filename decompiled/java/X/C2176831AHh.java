package X;

import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2176831AHh extends C2217421BqW implements Function0<Unit> {
    public C2176831AHh(ViewerWishesQueuePage viewerWishesQueuePage) {
        super(0, viewerWishesQueuePage, ViewerWishesQueuePage.class, "onOrdersChanged", "onOrdersChanged()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((ViewerWishesQueuePage) this.receiver).wS();
        return Unit.LIZ;
    }
}
