package X;

import android.content.Context;
import android.util.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022930cj5 extends C09AY implements Function0<String> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022930cj5(Context context) {
        super(0);
        this.LL = context;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Pair<String, Boolean> pairLIZ = C614430O8b.LIZ(this.LL);
        if (pairLIZ != null) {
            return pairLIZ.first;
        }
        return null;
    }
}
