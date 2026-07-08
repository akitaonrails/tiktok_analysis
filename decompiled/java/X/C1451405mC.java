package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1451405mC extends C2217421BqW implements Function1<Function0<? extends Unit>, Function0<? extends Unit>> {
    public final /* synthetic */ C259800zU<List<Function0<Unit>>> LL;
    public final /* synthetic */ C259800zU<List<Function0<Unit>>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451405mC(C259800zU<List<Function0<Unit>>> c259800zU, C259800zU<List<Function0<Unit>>> c259800zU2) {
        super(1, C1449605lu.class, "subscribe", "createStore$subscribe(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", 0);
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Function0<? extends Unit> invoke(Function0<? extends Unit> function0) {
        Function0<? extends Unit> function02 = function0;
        C259800zU<List<Function0<Unit>>> c259800zU = this.LL;
        C259800zU<List<Function0<Unit>>> c259800zU2 = this.LLILLJJLI;
        List<Function0<Unit>> list = c259800zU.element;
        List<Function0<Unit>> list2 = c259800zU2.element;
        if (list == list2) {
            c259800zU.element = new ArrayList(list2);
        }
        c259800zU.element.add(function02);
        return new C257600z8(function02, c259800zU, c259800zU2);
    }
}
