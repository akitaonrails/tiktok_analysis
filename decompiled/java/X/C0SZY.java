package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SZY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SZY extends C09AY implements Function0<ReusedUIAssem<?>> {
    public final /* synthetic */ AssemReusedContainer<R, ITEM> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SZY(AssemReusedContainer<R, ITEM> assemReusedContainer) {
        super(0);
        this.LL = assemReusedContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReusedUIAssem<?> invoke() {
        return this.LL.LLILLJJLI();
    }
}
