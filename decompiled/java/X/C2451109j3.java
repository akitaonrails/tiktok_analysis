package X;

import Y.AObserverS207S0100000_3;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.profile.business.message.HeaderCTAMessageComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09j3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.message.HeaderCTAMessageComponent$actionsBeforeUpdateUI$1", f = "HeaderCTAMessageComponent.kt", l = {183}, m = "invokeSuspend")
public final class C2451109j3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ HeaderCTAMessageComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2451109j3(HeaderCTAMessageComponent headerCTAMessageComponent, InterfaceC1364105Vn<? super C2451109j3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = headerCTAMessageComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2451109j3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("HeaderCTAMessageComponent@5ff2.actionsBeforeUpdateUI$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C2451009j2 c2451009j2 = new C2451009j2(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c2451009j2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("HeaderCTAMessageComponent@5ff2.actionsBeforeUpdateUI$1");
                return objLJFF;
            }
        }
        HeaderCTAMessageComponent headerCTAMessageComponent = this.LLILLJJLI;
        ((LiveData) obj).observe(headerCTAMessageComponent, new AObserverS207S0100000_3(headerCTAMessageComponent, 7));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HeaderCTAMessageComponent@5ff2.actionsBeforeUpdateUI$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
