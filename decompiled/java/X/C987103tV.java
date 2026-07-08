package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03tV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C987103tV extends C09AY implements Function0<InterfaceC665370Q7z> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Fragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987103tV(Fragment fragment, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC665370Q7z invoke() {
        if (!this.LL) {
            return C1558360qeg.LJFF(this.LLILLJJLI, null);
        }
        C19EG activity = this.LLILLJJLI.getActivity();
        if (activity != null) {
            return C1558360qeg.LJI(activity, null);
        }
        return null;
    }
}
