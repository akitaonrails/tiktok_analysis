package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0OBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615310OBl<T> extends C09AY implements Function0<C13IQ<T>> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ C13IQ<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615310OBl(LifecycleOwner lifecycleOwner, C13IQ<T> c13iq) {
        super(0);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = c13iq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (((AbstractC738140SxQ) this.LL).vmMapping.isEmpty()) {
            return this.LLILLJJLI;
        }
        C13IQ<? extends AssemViewModel<?>> c13iq = ((AbstractC738140SxQ) this.LL).vmMapping.get(this.LLILLJJLI);
        return (!(c13iq instanceof C13IQ) || c13iq == null) ? this.LLILLJJLI : c13iq;
    }
}
