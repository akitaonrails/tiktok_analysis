package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503860JpQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C502870Jnp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503860JpQ(C503870JpR c503870JpR, C502870Jnp c502870Jnp) {
        super(0);
        this.LL = c503870JpR;
        this.LLILLJJLI = c502870Jnp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke();
        this.LLILLJJLI.LIZIZ = false;
        return Unit.LIZ;
    }
}
