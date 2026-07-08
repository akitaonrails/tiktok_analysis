package X;

import Y.AgS207S0200000_21;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.SharePanelBulletinBoardViewHolder$bind$4", f = "SharePanelBulletinBoardViewHolder.kt", l = {251}, m = "invokeSuspend")
public final class C1364190lbV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1364170lbT LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364190lbV(C1364170lbT c1364170lbT, InterfaceC1364105Vn<? super C1364190lbV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1364170lbT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1364190lbV c1364190lbV = new C1364190lbV(this.LLILLL, interfaceC1364105Vn);
        c1364190lbV.LLILLJJLI = obj;
        return c1364190lbV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelBulletinBoardViewHolder@6bb.bind$4");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1364170lbT c1364170lbT = this.LLILLL;
            C414301jJ c414301jJ = c1364170lbT.LLJJIJIL;
            AgS207S0200000_21 agS207S0200000_21 = new AgS207S0200000_21(interfaceC497601wk, c1364170lbT, 4);
            this.LL = 1;
            if (c414301jJ.collect(agS207S0200000_21, this) == objLJFF) {
                C1C7U.LIZIZ("SharePanelBulletinBoardViewHolder@6bb.bind$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelBulletinBoardViewHolder@6bb.bind$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
