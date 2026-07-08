package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KVC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0KVC extends C2217421BqW implements Function2<AbstractC509530JyZ, InterfaceC1364105Vn<? super Unit>, Object>, InterfaceC842703Qz {
    public C0KVC(Object obj) {
        super(2, obj, C1449605lu.class, "suspendConversion1", "collectIn$suspendConversion1(Lkotlin/jvm/functions/Function1;Lcom/bytedance/android/livesdk/comp/api/subscription/status/SubscriptionStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC509530JyZ abstractC509530JyZ, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        ((Function1) this.receiver).invoke(abstractC509530JyZ);
        return Unit.LIZ;
    }
}
