package X;

import com.bytedance.ext_power_list.AssemReusedContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RC9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RC9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AssemReusedContainer<C0SMO<Object, Object>, InterfaceC1587906Jp> LL;
    public final /* synthetic */ InterfaceC1587906Jp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RC9(AssemReusedContainer<C0SMO<Object, Object>, InterfaceC1587906Jp> assemReusedContainer, InterfaceC1587906Jp interfaceC1587906Jp) {
        super(0);
        this.LL = assemReusedContainer;
        this.LLILLJJLI = interfaceC1587906Jp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJJLL().LIZ(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
