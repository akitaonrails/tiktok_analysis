package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451460Hn6 extends C09AY implements Function0<C0RTY> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451460Hn6(Fragment fragment, boolean z) {
        super(0);
        this.LL = fragment;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0RTY invoke() {
        return C0RPA.LIZ(this.LL.requireActivity()).zQ2(this.LLILLJJLI ? this.LL.getActivity() : this.LL);
    }
}
