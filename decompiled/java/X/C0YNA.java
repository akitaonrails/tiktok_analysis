package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0YNA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C0YNA extends C2217421BqW implements Function2<C0YL9, InterfaceC1364105Vn<? super Unit>, Object>, InterfaceC842703Qz {
    public C0YNA(Object obj) {
        super(2, obj, C0YN3.class, "processWorkItem", "processWorkItem(Lcom/bytedance/im/core/internal/messagegap/resolve/queue/ResolveMsgGapWorkItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0YL9 c0yl9, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((C0YN3) this.receiver).LJ(c0yl9, interfaceC1364105Vn);
    }
}
