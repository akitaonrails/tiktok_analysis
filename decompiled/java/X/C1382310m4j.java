package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: X.0m4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1382310m4j<R> extends C2217421BqW implements Function1<InterfaceC1364105Vn<? super List<R>>, Object>, InterfaceC842703Qz {
    public C1382310m4j(AbstractC2250601D7a abstractC2250601D7a) {
        super(1, abstractC2250601D7a, AbstractC2250601D7a.class, "loadMoreDirectly", "loadMoreDirectly(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((AbstractC2250601D7a) this.receiver).LJFF((InterfaceC1364105Vn) obj);
    }
}
