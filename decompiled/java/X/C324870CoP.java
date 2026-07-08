package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CoP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324870CoP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TakoChatRootFragment LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C013C LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324870CoP(TakoChatRootFragment takoChatRootFragment, long j, C013C c013c, C013C c013c2) {
        super(0);
        this.LL = takoChatRootFragment;
        this.LLILLJJLI = j;
        this.LLILLL = c013c;
        this.LLILZ = c013c2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TakoEnterParams takoEnterParams = this.LL.LLJJ;
        C1863760ybG.LJ(takoEnterParams != null ? takoEnterParams.processId : null);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LL);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C324880CoQ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 2);
        return Unit.LIZ;
    }
}
