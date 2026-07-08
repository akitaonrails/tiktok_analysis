package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1829830xiX extends C09AY implements Function0<C451600HnK> {
    public final /* synthetic */ InterfaceC451590HnJ LL;
    public final /* synthetic */ Function0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1829830xiX(InterfaceC451590HnJ interfaceC451590HnJ, Function0 function0) {
        super(0);
        this.LL = interfaceC451590HnJ;
        this.LLILLJJLI = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C451600HnK invoke() {
        return this.LL.LIZ((LifecycleOwner) this.LLILLJJLI.invoke());
    }
}
