package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0k9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308560k9m extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C1DEU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1308560k9m(C1DEU c1deu) {
        super(1);
        this.LL = c1deu;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.release();
        return Unit.LIZ;
    }
}
