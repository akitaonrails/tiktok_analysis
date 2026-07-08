package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rIW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583060rIW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1583090rIZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1583060rIW(InterfaceC1583090rIZ interfaceC1583090rIZ) {
        super(0);
        this.LL = interfaceC1583090rIZ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((ArrayList) C1583100rIa.LJ).add(new WeakReference(this.LL));
        C1583100rIa.LIZ.getClass();
        C1583100rIa.LIZ();
        return Unit.LIZ;
    }
}
