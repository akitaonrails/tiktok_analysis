package X;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS225S0300000_16;
import njp.a;

/* JADX INFO: renamed from: X.0TnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.AuthDialogHelper$newAuthDialogCenter$1", f = "AuthDialogHelper.kt", l = {45}, m = "invokeSuspend")
public final class C757480TnW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C0T0A LLILZ;
    public final /* synthetic */ Bundle LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757480TnW(Context context, C0T0A c0t0a, Bundle bundle, InterfaceC1364105Vn<? super C757480TnW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = c0t0a;
        this.LLILZIL = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757480TnW c757480TnW = new C757480TnW(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c757480TnW.LLILLJJLI = obj;
        return c757480TnW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C095D c095dLIZIZ;
        C1C7U.LIZ("AuthDialogHelper@208f.newAuthDialogCenter$1");
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
            InterfaceC1264610j0t interfaceC1264610j0tLIZ = C1072350e0n.LIZ(this.LLILLL, new AwS225S0300000_16((InterfaceC497601wk) this.LLILLJJLI, this.LLILZ, this.LLILZIL, 25));
            if (interfaceC1264610j0tLIZ != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZ).LIZIZ()) != null) {
                this.LL = 1;
                if (C09IC.LJI(c095dLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("AuthDialogHelper@208f.newAuthDialogCenter$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthDialogHelper@208f.newAuthDialogCenter$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
