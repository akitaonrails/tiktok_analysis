package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14sD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20401114sD extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C20399914s1 LL;
    public final /* synthetic */ C20390914qZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20401114sD(C20399914s1 c20399914s1, C20390914qZ c20390914qZ) {
        super(1);
        this.LL = c20399914s1;
        this.LLILLJJLI = c20390914qZ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        InterfaceC20405014sq interfaceC20405014sq = this.LL.LLILLJJLI;
        if (interfaceC20405014sq != null) {
            C20390914qZ c20390914qZ = this.LLILLJJLI;
            interfaceC20405014sq.nn(c20390914qZ.LIZ, true, c20390914qZ.LIZLLL);
        }
        return Unit.LIZ;
    }
}
