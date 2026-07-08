package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03x8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1009603x8 extends C09AY implements Function0<ViewModelStore> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AbstractC738140SxQ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1009603x8(AbstractC738140SxQ abstractC738140SxQ, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        if (this.LL) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this.LLILLJJLI);
            if (c19egLIZ != null) {
                return c19egLIZ.getViewModelStore();
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this.LLILLJJLI);
        if (fragmentLJI != null) {
            return fragmentLJI.getViewModelStore();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
