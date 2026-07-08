package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1622206Wu extends C09AY implements Function0<LifecycleOwner> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1622206Wu(LifecycleOwner lifecycleOwner, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LifecycleOwner invoke() {
        return this.LL ? ((Fragment) this.LLILLJJLI).requireActivity() : this.LLILLJJLI;
    }
}
