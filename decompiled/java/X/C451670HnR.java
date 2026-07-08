package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [VM] */
/* JADX INFO: renamed from: X.0HnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451670HnR<VM> extends C09AY implements Function0<C13IQ<VM>> {
    public final /* synthetic */ AssemVMLazy<S, VM> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451670HnR(AssemVMLazy<S, VM> assemVMLazy) {
        super(0);
        this.LL = assemVMLazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.LL.LL.invoke();
    }
}
