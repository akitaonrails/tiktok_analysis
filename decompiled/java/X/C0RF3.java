package X;

import com.bytedance.ext_power_list.AssemReusedContainer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RF3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RF3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AssemReusedContainer<C0SMO<Object, Object>, InterfaceC1587906Jp> LL;
    public final /* synthetic */ InterfaceC1587906Jp LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RF3(AssemReusedContainer<C0SMO<Object, Object>, InterfaceC1587906Jp> assemReusedContainer, InterfaceC1587906Jp interfaceC1587906Jp, int i, List<? extends Object> list) {
        super(0);
        this.LL = assemReusedContainer;
        this.LLILLJJLI = interfaceC1587906Jp;
        this.LLILLL = i;
        this.LLILZ = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AssemReusedContainer<C0SMO<Object, Object>, InterfaceC1587906Jp> assemReusedContainer = this.LL;
        assemReusedContainer.LL.LIZIZ(this.LLILLJJLI, (C0SMO) assemReusedContainer.LLJ, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
