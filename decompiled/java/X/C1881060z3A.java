package X;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z3A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881060z3A extends C09AY implements Function0<C1882060z4m> {
    public final /* synthetic */ C1881040z38 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881060z3A(C1881040z38 c1881040z38) {
        super(0);
        this.LL = c1881040z38;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1882060z4m invoke() {
        C1882060z4m c1882060z4m = new C1882060z4m(this.LL);
        c1882060z4m.LLILLL = Collections.singleton("game_info");
        return c1882060z4m;
    }
}
