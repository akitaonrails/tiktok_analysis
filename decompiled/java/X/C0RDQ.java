package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RDQ extends C09AY implements Function0<LifecycleOwner> {
    public final /* synthetic */ ReusedAssem<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RDQ(ReusedAssem<RECEIVER> reusedAssem) {
        super(0);
        this.LL = reusedAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LifecycleOwner invoke() {
        LifecycleOwner lifecycleOwnerLJI = C724240Sb0.LJI(this.LL);
        if (lifecycleOwnerLJI != null || (lifecycleOwnerLJI = C724240Sb0.LIZ(this.LL)) != null) {
            return lifecycleOwnerLJI;
        }
        "must attach to a fragment or activity".toString();
        throw new IllegalArgumentException("must attach to a fragment or activity");
    }
}
