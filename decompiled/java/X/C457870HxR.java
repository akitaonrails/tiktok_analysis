package X;

import Y.AgS197S0200000_6;
import android.view.View;
import com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem$onViewCreated$1", f = "BasePanelContainerAssem.kt", l = {103}, m = "invokeSuspend")
public final class C457870HxR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BasePanelContainerAssem LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457870HxR(BasePanelContainerAssem basePanelContainerAssem, View view, InterfaceC1364105Vn<? super C457870HxR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = basePanelContainerAssem;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C457870HxR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasePanelContainerAssem@a68e.onViewCreated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.Jo().LLILZLL;
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLJJLI, this.LLILLL, 1);
            this.LL = 1;
            if (c2252321DDq.collect(agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("BasePanelContainerAssem@a68e.onViewCreated$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
