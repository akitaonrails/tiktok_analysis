package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0c1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995920c1W extends C09AY implements Function1<C995910c1V, C995910c1V> {
    public final /* synthetic */ List<C435160H4o> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C995920c1W(List<C435160H4o> list) {
        super(1);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C995910c1V invoke(C995910c1V c995910c1V) {
        C995910c1V c995910c1V2 = c995910c1V;
        List<C435160H4o> list = this.LL;
        C291001Au<InterfaceC1817490xOd> c291001Au = c995910c1V2.LL;
        c995910c1V2.getClass();
        return new C995910c1V(c291001Au, list);
    }
}
