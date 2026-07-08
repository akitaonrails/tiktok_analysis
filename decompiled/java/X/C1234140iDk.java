package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.security.ChangeUnlinkDialogUtil$performSafeEnvCheck$1$1", f = "ChangeUnlinkDialogUtil.kt", l = {}, m = "invokeSuspend")
public final class C1234140iDk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1235080iFG LLILLJJLI;
    public final /* synthetic */ SafeEnvV2Response LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function2<SafeEnvData, Bundle, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1234140iDk(C1235080iFG c1235080iFG, SafeEnvV2Response safeEnvV2Response, Function0<Unit> function0, Function2<? super SafeEnvData, ? super Bundle, Unit> function2, InterfaceC1364105Vn<? super C1234140iDk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1235080iFG;
        this.LLILLL = safeEnvV2Response;
        this.LLILZ = function0;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1234140iDk c1234140iDk = new C1234140iDk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1234140iDk.LL = obj;
        return c1234140iDk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangeUnlinkDialogUtil@cdef.performSafeEnvCheck$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.LJ().hide();
        SafeEnvData safeEnvData = this.LLILLL.data;
        if (safeEnvData != null) {
            C1235080iFG c1235080iFG = this.LLILLJJLI;
            Function0<Unit> function0 = this.LLILZ;
            Function2<SafeEnvData, Bundle, Unit> function2 = this.LLILZIL;
            int i = safeEnvData.errorCode;
            if (i != 0 && i != 2029) {
                c1235080iFG.LJIIJ();
                function0.invoke();
            } else {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("enter_method", "normal", bundle);
                bundle.putBoolean("is_safe_env", safeEnvData.safe);
                C786410Ut5.LJJJI("passport_ticket", safeEnvData.passportTicket, bundle);
                C786410Ut5.LJJIZ(bundle, "eligible_verification_methods", new ArrayList(safeEnvData.LIZ()));
                function2.invoke(safeEnvData, bundle);
            }
        } else {
            C1235080iFG c1235080iFG2 = this.LLILLJJLI;
            Function0<Unit> function02 = this.LLILZ;
            c1235080iFG2.LJIIJ();
            function02.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangeUnlinkDialogUtil@cdef.performSafeEnvCheck$1$1");
        return unit;
    }
}
