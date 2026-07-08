package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451620HnM extends C09AY implements Function0<C724710Sbl> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451620HnM(Fragment fragment, boolean z) {
        super(0);
        this.LL = fragment;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C724710Sbl invoke() {
        return Assembler.BQ2(C0RPA.LIZ(this.LL.requireActivity()), this.LLILLJJLI ? this.LL.getActivity() : this.LL);
    }
}
