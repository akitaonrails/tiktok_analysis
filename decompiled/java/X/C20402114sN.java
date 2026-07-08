package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14sN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20402114sN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C20399914s1 LL;
    public final /* synthetic */ C20390914qZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20402114sN(C20399914s1 c20399914s1, C20390914qZ c20390914qZ) {
        super(0);
        this.LL = c20399914s1;
        this.LLILLJJLI = c20390914qZ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C20399914s1 c20399914s1 = this.LL;
        C20390914qZ c20390914qZ = this.LLILLJJLI;
        String str = C20399914s1.LLJJIII;
        c20399914s1.L5(c20390914qZ, false);
        InterfaceC20405014sq interfaceC20405014sq = this.LL.LLILLJJLI;
        if (interfaceC20405014sq != null) {
            C20390914qZ c20390914qZ2 = this.LLILLJJLI;
            interfaceC20405014sq.nn(c20390914qZ2.LIZ, false, c20390914qZ2.LIZLLL);
        }
        return Unit.LIZ;
    }
}
