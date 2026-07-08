package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cFN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004510cFN extends C09AY implements Function0<AssemViewModel<C1358700lSe>> {
    public final /* synthetic */ QuickShareButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004510cFN(QuickShareButtonAssem quickShareButtonAssem) {
        super(0);
        this.LL = quickShareButtonAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AssemViewModel<C1358700lSe> invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            return C1360460lVU.LIZIZ.LJJIJ(c19egLIZ);
        }
        return null;
    }
}
