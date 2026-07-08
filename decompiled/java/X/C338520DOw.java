package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338520DOw extends C09AY implements Function0<InterfaceC665370Q7z> {
    public final /* synthetic */ boolean LL = false;
    public final /* synthetic */ Fragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338520DOw(Fragment fragment) {
        super(0);
        this.LLILLJJLI = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC665370Q7z invoke() {
        return this.LL ? C1558360qeg.LJI(this.LLILLJJLI.requireActivity(), null) : C1558360qeg.LJFF(this.LLILLJJLI, null);
    }
}
