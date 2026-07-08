package X;

import Y.AgS302S0100000_21;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.SharePanelBulletinBoardViewHolder$bind$3", f = "SharePanelBulletinBoardViewHolder.kt", l = {233}, m = "invokeSuspend")
public final class C1364200lbW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1364170lbT LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364200lbW(C1364170lbT c1364170lbT, InterfaceC1364105Vn<? super C1364200lbW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1364170lbT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1364200lbW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelBulletinBoardViewHolder@6bb.bind$3");
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
            C1364170lbT c1364170lbT = this.LLILLJJLI;
            C414301jJ c414301jJ = c1364170lbT.LLJJJIL;
            AgS302S0100000_21 agS302S0100000_21 = new AgS302S0100000_21(c1364170lbT, 8);
            this.LL = 1;
            if (c414301jJ.collect(agS302S0100000_21, this) == objLJFF) {
                C1C7U.LIZIZ("SharePanelBulletinBoardViewHolder@6bb.bind$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelBulletinBoardViewHolder@6bb.bind$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
