package X;

import Y.AgS297S0100000_16;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS382S0200000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.controller.ContactsInvitePanelController$newAuthFlow$1", f = "ContactsInvitePanelController.kt", l = {149}, m = "invokeSuspend")
public final class C1070920dyU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1070930dyV LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070920dyU(C1070930dyV c1070930dyV, InterfaceC1364105Vn<? super C1070920dyU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1070930dyV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1070920dyU c1070920dyU = new C1070920dyU(this.LLILLL, interfaceC1364105Vn);
        c1070920dyU.LLILLJJLI = obj;
        return c1070920dyU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactsInvitePanelController@aa1b.newAuthFlow$1");
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
            C1070930dyV c1070930dyV = this.LLILLL;
            C095D c095dLIZ = ((C1071200dyw) C1070250dxP.LIZ(c1070930dyV.LIZ, new AwS382S0200000_16(interfaceC497601wk, c1070930dyV, 53))).LIZ();
            AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(this.LLILLL, 18);
            this.LL = 1;
            if (c095dLIZ.collect(agS297S0100000_16, this) == objLJFF) {
                C1C7U.LIZIZ("ContactsInvitePanelController@aa1b.newAuthFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactsInvitePanelController@aa1b.newAuthFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
