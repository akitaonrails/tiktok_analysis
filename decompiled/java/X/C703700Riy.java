package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Riy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703700Riy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC2217241BqE<Object, Object> LL;
    public final /* synthetic */ InterfaceC703670Riv<Object> LLILLJJLI;
    public final /* synthetic */ C259800zU<Object> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703700Riy(InterfaceC2217241BqE<Object, Object> interfaceC2217241BqE, InterfaceC703670Riv<Object> interfaceC703670Riv, C259800zU<Object> c259800zU, Function0<Unit> function0) {
        super(0);
        this.LL = interfaceC2217241BqE;
        this.LLILLJJLI = interfaceC703670Riv;
        this.LLILLL = c259800zU;
        this.LLILZ = function0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ?? r1 = this.LL.get(this.LLILLJJLI.getState());
        if (!Intrinsics.LJFF(r1, this.LLILLL.element)) {
            this.LLILLL.element = r1;
            this.LLILZ.invoke();
        }
        return Unit.LIZ;
    }
}
