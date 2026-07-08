package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0c1Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995940c1Y extends C09AY implements Function1<C995910c1V, C995910c1V> {
    public final /* synthetic */ InterfaceC1817490xOd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C995940c1Y(InterfaceC1817490xOd interfaceC1817490xOd) {
        super(1);
        this.LL = interfaceC1817490xOd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C995910c1V invoke(C995910c1V c995910c1V) {
        C995910c1V c995910c1V2 = c995910c1V;
        C291001Au c291001Au = new C291001Au(this.LL);
        List<C435160H4o> list = c995910c1V2.LLILLJJLI;
        c995910c1V2.getClass();
        return new C995910c1V(c291001Au, list);
    }
}
