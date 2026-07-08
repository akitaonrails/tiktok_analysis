package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS614S0100000_35;
import njp.a;

/* JADX INFO: renamed from: X.0Tnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView$newAuthDialogCenter$1", f = "NoticeTemplateRightView.kt", l = {506}, m = "invokeSuspend")
public final class C757620Tnk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1907120zjC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757620Tnk(C1907120zjC c1907120zjC, InterfaceC1364105Vn<? super C757620Tnk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1907120zjC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757620Tnk c757620Tnk = new C757620Tnk(this.LLILLL, interfaceC1364105Vn);
        c757620Tnk.LLILLJJLI = obj;
        return c757620Tnk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C095D c095dLIZIZ;
        C1C7U.LIZ("NoticeTemplateRightView@96c2.newAuthDialogCenter$1");
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
            InterfaceC1264610j0t interfaceC1264610j0tLIZ = C1072350e0n.LIZ(this.LLILLL.getContext(), new AwS614S0100000_35((InterfaceC497601wk) this.LLILLJJLI, 239));
            if (interfaceC1264610j0tLIZ != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZ).LIZIZ()) != null) {
                this.LL = 1;
                if (C09IC.LJI(c095dLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("NoticeTemplateRightView@96c2.newAuthDialogCenter$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoticeTemplateRightView@96c2.newAuthDialogCenter$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
