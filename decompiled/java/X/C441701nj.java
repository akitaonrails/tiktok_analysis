package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C441701nj extends C09AY implements Function0<LifecycleOwner> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AbstractC738140SxQ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441701nj(AbstractC738140SxQ abstractC738140SxQ, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LifecycleOwner invoke() {
        LifecycleOwner lifecycleOwnerLJI;
        if (this.LL) {
            lifecycleOwnerLJI = C724240Sb0.LIZ(this.LLILLJJLI);
            if (lifecycleOwnerLJI == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            lifecycleOwnerLJI = C724240Sb0.LJI(this.LLILLJJLI);
            if (lifecycleOwnerLJI == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return lifecycleOwnerLJI;
    }
}
