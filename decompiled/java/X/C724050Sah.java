package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724050Sah extends C09AY implements Function0<LifecycleOwner> {
    public final /* synthetic */ AssemSupervisor LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724050Sah(AssemSupervisor assemSupervisor) {
        super(0);
        this.LL = assemSupervisor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0SxQ] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.jvm.functions.Function0
    public final LifecycleOwner invoke() {
        AbstractC738140SxQ abstractC738140SxQ;
        ?? r1 = this.LL.LLJ;
        if ((r1 instanceof AbstractC738140SxQ) && (abstractC738140SxQ = (AbstractC738140SxQ) r1) != null) {
            r1 = abstractC738140SxQ;
            while (r1.getParent() instanceof AbstractC738140SxQ) {
                r1 = (AbstractC738140SxQ) r1.getParent();
            }
        }
        return r1;
    }
}
