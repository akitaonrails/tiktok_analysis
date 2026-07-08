package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.IdTabPowerCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HS3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.IdTabPowerCell$onBindItemView$4$1", f = "IdTabPowerCell.kt", l = {75}, m = "invokeSuspend")
public final class C0HS3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public final /* synthetic */ IdTabPowerCell LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HS3(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, IdTabPowerCell idTabPowerCell, InterfaceC1364105Vn<? super C0HS3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILLL = idTabPowerCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HS3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252331DDr c2252331DDr;
        C1C7U.LIZ("IdTabPowerCell@8d1e.onBindItemView$4$1");
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
            AbstractC21673619ry adapter = this.LLILLJJLI.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            this.LLILLJJLI.requestLayout();
            IdTabPowerCell idTabPowerCell = this.LLILLL;
            C441230HRx c441230HRx = (C441230HRx) idTabPowerCell.LLILLJJLI.getValue(idTabPowerCell, IdTabPowerCell.LLILZIL[0]);
            if (c441230HRx != null && (c2252331DDr = c441230HRx.LL) != null) {
                Unit unit = Unit.LIZ;
                this.LL = 1;
                if (c2252331DDr.emit(unit, this) == objLJFF) {
                    C1C7U.LIZIZ("IdTabPowerCell@8d1e.onBindItemView$4$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IdTabPowerCell@8d1e.onBindItemView$4$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
