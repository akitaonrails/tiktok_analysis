package X;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0F0J, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0F0J extends C2217421BqW implements Function2<List<? extends String>, InterfaceC1364105Vn<? super List<? extends C378700Et2>>, Object>, InterfaceC842703Qz {
    public C0F0J(C382590EzJ c382590EzJ) {
        super(2, c382590EzJ, C382590EzJ.class, "fetchSuggestedPrompts", "fetchSuggestedPrompts(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, InterfaceC1364105Vn<? super List<? extends C378700Et2>> interfaceC1364105Vn) {
        return ((C382590EzJ) this.receiver).H4(list, interfaceC1364105Vn);
    }
}
