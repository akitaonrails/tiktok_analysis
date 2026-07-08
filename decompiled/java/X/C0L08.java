package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0L08, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.bytedance.iap.infra.legacy.utils.IAPLegacyRouter$openWebSchema$1", f = "IAPLegacyRouter.kt", l = {51}, m = "invokeSuspend")
public final class C0L08 extends C09AX implements Function2<C094D<? super C1882807Za>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L08(String str, Context context, InterfaceC1364105Vn<? super C0L08> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0L08 c0l08 = new C0L08(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0l08.LLILLJJLI = obj;
        return c0l08;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPLegacyRouter@8156.openWebSchema$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(C23250099c.LIZLLL(c094d, null, null, new C613470O4j(this.LLILLL, this.LLILZ, c094d, null), 3), 1104);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS552S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("IAPLegacyRouter@8156.openWebSchema$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IAPLegacyRouter@8156.openWebSchema$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C1882807Za> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
