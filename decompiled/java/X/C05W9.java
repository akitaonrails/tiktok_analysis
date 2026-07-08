package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05W9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05W9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1465410oEl LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05W9(C1465410oEl c1465410oEl, boolean z, String str) {
        super(0);
        this.LL = c1465410oEl;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC366450EYh interfaceC366450EYhLJIJJ = this.LL.LJIJJ();
        if (interfaceC366450EYhLJIJJ != null) {
            interfaceC366450EYhLJIJJ.jV(this.LLILLJJLI);
        }
        this.LL.LJIILJJIL.LJIIJ(new Pair<>(this.LLILLL, Boolean.valueOf(this.LLILLJJLI)));
        return Unit.LIZ;
    }
}
