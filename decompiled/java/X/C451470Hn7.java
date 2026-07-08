package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hn7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451470Hn7 extends C09AY implements Function0<C0RTY> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AbstractC738140SxQ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451470Hn7(AbstractC738140SxQ abstractC738140SxQ, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0RTY invoke() {
        if (this.LL) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this.LLILLJJLI);
            if (c19egLIZ != null) {
                return C0RPA.LIZ(c19egLIZ).zQ2(c19egLIZ);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this.LLILLJJLI);
        if (fragmentLJI != null) {
            return C0RPA.LIZ(fragmentLJI.requireActivity()).zQ2(fragmentLJI);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
