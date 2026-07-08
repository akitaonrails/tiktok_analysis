package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.security.ChangeUnlinkDialogUtil$performSafeEnvCheck$1", f = "ChangeUnlinkDialogUtil.kt", l = {261, 263}, m = "invokeSuspend")
public final class C1234130iDj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC852630Xcb LLILLJJLI;
    public final /* synthetic */ C1235080iFG LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function2<SafeEnvData, Bundle, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1234130iDj(EnumC852630Xcb enumC852630Xcb, C1235080iFG c1235080iFG, Function0<Unit> function0, Function2<? super SafeEnvData, ? super Bundle, Unit> function2, InterfaceC1364105Vn<? super C1234130iDj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC852630Xcb;
        this.LLILLL = c1235080iFG;
        this.LLILZ = function0;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234130iDj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ = obj;
        C1C7U.LIZ("ChangeUnlinkDialogUtil@cdef.performSafeEnvCheck$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ChangeUnlinkDialogUtil@cdef.performSafeEnvCheck$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZIZ);
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C852610XcZ c852610XcZ = InterfaceC852600XcY.LIZ;
            EnumC852630Xcb enumC852630Xcb = this.LLILLJJLI;
            this.LL = 1;
            objLIZIZ = c852610XcZ.LIZIZ(enumC852630Xcb, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("ChangeUnlinkDialogUtil@cdef.performSafeEnvCheck$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1234140iDk c1234140iDk = new C1234140iDk(this.LLILLL, (SafeEnvV2Response) objLIZIZ, this.LLILZ, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1234140iDk) == objLJFF) {
            C1C7U.LIZIZ("ChangeUnlinkDialogUtil@cdef.performSafeEnvCheck$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChangeUnlinkDialogUtil@cdef.performSafeEnvCheck$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
