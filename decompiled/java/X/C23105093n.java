package X;

import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.093n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService$waitForOclData$1", f = "OneClickLoginService.kt", l = {254}, m = "invokeSuspend")
public final class C23105093n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OneClickLoginService LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function1<List<? extends BaseLoginMethod>, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23105093n(OneClickLoginService oneClickLoginService, long j, Function1<? super List<? extends BaseLoginMethod>, Unit> function1, Function0<Unit> function0, InterfaceC1364105Vn<? super C23105093n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = oneClickLoginService;
        this.LLILLL = j;
        this.LLILZ = function1;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23105093n(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneClickLoginService@601d.waitForOclData$1");
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
            if (this.LLILLJJLI.LJIIZILJ().getValue() == C0XHP.NOT_READY) {
                long j = this.LLILLL;
                C23104093m c23104093m = new C23104093m(this.LLILLJJLI, null);
                this.LL = 1;
                if (C099A.LIZJ(j, c23104093m, this) == objLJFF) {
                    C1C7U.LIZIZ("OneClickLoginService@601d.waitForOclData$1");
                    return objLJFF;
                }
            }
        }
        C0XUD.LIZ.getClass();
        if (C0XUD.LJI.getValue() == C0XHP.READY) {
            this.LLILZ.invoke(C0XUD.LJFF);
        } else {
            this.LLILZIL.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OneClickLoginService@601d.waitForOclData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
