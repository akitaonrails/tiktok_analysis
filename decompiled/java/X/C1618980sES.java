package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sES, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618980sES extends C09AY implements Function0<WeakReference<Runnable>> {
    public final /* synthetic */ C1619010sEV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618980sES(C1619010sEV c1619010sEV) {
        super(0);
        this.LL = c1619010sEV;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WeakReference<Runnable> invoke() {
        return new WeakReference<>(this.LL.LL);
    }
}
