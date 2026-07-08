package X;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706800Rny extends C09AY implements Function0<Collection<? extends C0SR9<?, ?>>> {
    public final /* synthetic */ C0SR4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C706800Rny(C0SR4 c0sr4) {
        super(0);
        this.LL = c0sr4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Collection<? extends C0SR9<?, ?>> invoke() {
        return ((Map) this.LL.LLJJJIL.getValue()).values();
    }
}
