package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966330bFn extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966330bFn(int i, C966040bFK c966040bFK) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c966040bFK;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        interfaceC965990bFF.LJJJJJL(this.LL, new C965030bDh(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
