package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C865160Xwo extends C09AY implements Function1<InterfaceC863600XuI<C0Y8T>, Unit> {
    public final /* synthetic */ C866340Xyi LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865160Xwo(C866340Xyi c866340Xyi, int i, long j) {
        super(1);
        this.LL = c866340Xyi;
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        this.LL.LIZ.LJJJJIZL(this.LLILLJJLI, this.LLILLL, interfaceC863600XuI);
        return Unit.LIZ;
    }
}
