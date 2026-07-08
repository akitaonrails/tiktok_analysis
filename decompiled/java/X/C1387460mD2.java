package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mD2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387460mD2 extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C1387450mD1 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387460mD2(C1387450mD1 c1387450mD1) {
        super(1);
        this.LL = c1387450mD1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.LL.LL = str;
        return Unit.LIZ;
    }
}
