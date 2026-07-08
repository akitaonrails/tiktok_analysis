package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487290J9b extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C487300J9c LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487290J9b(C487300J9c c487300J9c) {
        super(0);
        this.LL = c487300J9c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((ArrayList) C487280J9a.LIZ).add(this.LL);
        return Unit.LIZ;
    }
}
