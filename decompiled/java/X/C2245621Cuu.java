package X;

import Y.ARunnableS134S0100000_34;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245621Cuu extends C09AY implements Function0<Runnable> {
    public final /* synthetic */ C2245331CuR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2245621Cuu(C2245331CuR c2245331CuR) {
        super(0);
        this.LL = c2245331CuR;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Runnable invoke() {
        return new ARunnableS134S0100000_34(this.LL, 56);
    }
}
