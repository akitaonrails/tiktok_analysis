package X;

import com.bytedance.android.livesdk.comp.impl.subscription.SubscribeService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ER6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ER6 extends C09AY implements Function0<C0KBB> {
    public final /* synthetic */ SubscribeService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ER6(SubscribeService subscribeService) {
        super(0);
        this.LL = subscribeService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0KBB invoke() {
        return this.LL.Ae();
    }
}
