package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966260bFg extends C09AY implements Function1<Object, Unit> {
    public final /* synthetic */ C966240bFe LL;
    public final /* synthetic */ C966100bFQ<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966260bFg(C966240bFe c966240bFe, C966100bFQ<Object> c966100bFQ) {
        super(1);
        this.LL = c966240bFe;
        this.LLILLJJLI = c966100bFQ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        C966240bFe c966240bFe = this.LL;
        InterfaceC966890bGh<Object> interfaceC966890bGh = this.LLILLJJLI.LLILLL;
        c966240bFe.getClass();
        C500260Jjc.LJJLIIIJILLIZJL(new C966230bFd(obj, interfaceC966890bGh, c966240bFe.LL));
        return Unit.LIZ;
    }
}
