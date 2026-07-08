package X;

import android.content.Context;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0W88, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W88 extends C09AY implements Function1<Context, Unit> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W88(Context context) {
        super(1);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Context context) {
        Context context2 = context;
        if (context2 == null) {
            context2 = this.LL;
        }
        a.LIZLLL(context2);
        return Unit.LIZ;
    }
}
