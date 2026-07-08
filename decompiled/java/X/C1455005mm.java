package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1455005mm extends C2217421BqW implements Function0<Object> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C259800zU<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1455005mm(C013C c013c, C259800zU<Object> c259800zU) {
        super(0, C1449605lu.class, "getState", "createStore$getState(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Object;", 0);
        this.LL = c013c;
        this.LLILLJJLI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C013C c013c = this.LL;
        C259800zU<Object> c259800zU = this.LLILLJJLI;
        if (!c013c.element) {
            return c259800zU.element;
        }
        throw new IllegalStateException("Check failed.");
    }
}
