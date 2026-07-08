package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503820JpM extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ Function1<Throwable, Unit> LL;
    public final /* synthetic */ C502870Jnp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503820JpM(C503840JpO c503840JpO, C502870Jnp c502870Jnp) {
        super(1);
        this.LL = c503840JpO;
        this.LLILLJJLI = c502870Jnp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.invoke(th);
        this.LLILLJJLI.LIZIZ = false;
        return Unit.LIZ;
    }
}
