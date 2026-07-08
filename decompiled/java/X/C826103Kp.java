package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AuthorizationDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS210S0300000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.checker.us.UsAgeChecker$check$1", f = "UsAgeChecker.kt", l = {}, m = "invokeSuspend")
public final class C826103Kp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C03IA LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ AuthorizationDialog LLILLL;
    public final /* synthetic */ C03JV LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C826103Kp(C03IA c03ia, Context context, AuthorizationDialog authorizationDialog, C03JV c03jv, InterfaceC1364105Vn<? super C826103Kp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c03ia;
        this.LLILLJJLI = context;
        this.LLILLL = authorizationDialog;
        this.LLILZ = c03jv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C826103Kp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("UsAgeChecker@77f4.check$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ.LLZZZZ = true;
        C1397580mTM c1397580mTM = new C1397580mTM(this.LLILLJJLI);
        AuthorizationDialog authorizationDialog = this.LLILLL;
        if (authorizationDialog == null || (str = authorizationDialog.title) == null) {
            str = "Confirm Guardian's Approval";
        }
        c1397580mTM.LJI(str);
        AuthorizationDialog authorizationDialog2 = this.LLILLL;
        if (authorizationDialog2 == null || (str2 = authorizationDialog2.description) == null) {
            str2 = "When purchasing goods, you need to obtain the consent of your parent or guardian.";
        }
        c1397580mTM.LIZIZ(str2);
        C985403tE.LIZ(c1397580mTM, new AwS210S0300000_1(this.LLILLL, this.LL, this.LLILZ, 124));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C03O0.LJJLIIIJILLIZJL(C03O0.LIZ, "guardian_approval", null, null, null, null, true, 30);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsAgeChecker@77f4.check$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
