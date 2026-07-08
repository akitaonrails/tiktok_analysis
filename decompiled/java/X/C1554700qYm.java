package X;

import com.bytedance.provider.vm.ScopeViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554700qYm extends C09AY implements Function0<String> {
    public final /* synthetic */ C1555410qZv LL;
    public final /* synthetic */ ScopeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554700qYm(C1555410qZv c1555410qZv, ScopeViewModel scopeViewModel) {
        super(0);
        this.LL = c1555410qZv;
        this.LLILLJJLI = scopeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try get vscope, result: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", vm ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scope key: ");
        sbLIZ.append(this.LL.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
