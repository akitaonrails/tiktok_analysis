package X;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647050PZn extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ Bundle LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C647050PZn(Bundle bundle) {
        super(1);
        this.LL = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        c062p.LIZ = new C0PDM(this.LL);
        return Unit.LIZ;
    }
}
