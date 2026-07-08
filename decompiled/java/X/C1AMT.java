package X;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AMT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AMT extends C09AY implements Function0<C1AMR> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AMT(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1AMR invoke() {
        return new C1AMR(this.LL);
    }
}
