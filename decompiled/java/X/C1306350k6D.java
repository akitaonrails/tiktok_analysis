package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0k6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306350k6D extends C09AY implements Function1<C1306250k63, C1306250k63> {
    public final /* synthetic */ Function1<C1306250k63, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306350k6D(C1306340k6C c1306340k6C) {
        super(1);
        this.LL = c1306340k6C;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1306250k63 invoke(C1306250k63 c1306250k63) {
        if (c1306250k63 == null) {
            C1306250k63 c1306250k632 = new C1306250k63(new C1307280k7i());
            this.LL.invoke(c1306250k632);
            return c1306250k632;
        }
        return c1306250k63;
    }
}
