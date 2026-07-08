package X;

import Y.AgS302S0100000_21;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.SharePanelTakoViewHolder$bind$2", f = "SharePanelTakoViewHolder.kt", l = {191}, m = "invokeSuspend")
public final class C1363990lbB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1363970lb9 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363990lbB(C1363970lb9 c1363970lb9, InterfaceC1364105Vn<? super C1363990lbB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1363970lb9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1363990lbB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelTakoViewHolder@a66a.bind$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1363970lb9 c1363970lb9 = this.LLILLJJLI;
            C414301jJ c414301jJ = c1363970lb9.LLJILJIL;
            AgS302S0100000_21 agS302S0100000_21 = new AgS302S0100000_21(c1363970lb9, 9);
            this.LL = 1;
            if (c414301jJ.collect(agS302S0100000_21, this) == objLJFF) {
                C1C7U.LIZIZ("SharePanelTakoViewHolder@a66a.bind$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelTakoViewHolder@a66a.bind$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
