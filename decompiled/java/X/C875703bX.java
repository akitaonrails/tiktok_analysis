package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS650S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03bX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup.BackupPaymentFlowCoordinator$handleEntryClick$2", f = "BackupPaymentFlowCoordinator.kt", l = {184}, m = "invokeSuspend")
public final class C875703bX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C876503bf LLILLJJLI;
    public final /* synthetic */ C875903bZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875703bX(C876503bf c876503bf, C875903bZ c875903bZ, InterfaceC1364105Vn<? super C875703bX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c876503bf;
        this.LLILLL = c875903bZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875703bX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BackupPaymentFlowCoordinator@88b3.handleEntryClick$2");
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
            this.LLILLJJLI.LIZJ.onShow();
            C875203bS c875203bS = C875203bS.LIZ;
            C876503bf c876503bf = this.LLILLJJLI;
            this.LL = 1;
            obj = c875203bS.LIZLLL(c876503bf, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BackupPaymentFlowCoordinator@88b3.handleEntryClick$2");
                return objLJFF;
            }
        }
        C876603bg c876603bg = (C876603bg) obj;
        if (c876603bg == null) {
            this.LLILLJJLI.LIZJ.onFailed(null);
            C875203bS c875203bS2 = C875203bS.LIZ;
            Context context = this.LLILLL.LIZ;
            c875203bS2.getClass();
            C875203bS.LJIIJ(context);
            this.LLILLJJLI.LIZJ.onDismiss();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BackupPaymentFlowCoordinator@88b3.handleEntryClick$2");
            return unit;
        }
        this.LLILLJJLI.LIZJ.onDismiss();
        C867003a8 c867003a8 = this.LLILLL.LIZIZ;
        String str = c876603bg.LIZIZ;
        if (str == null) {
            str = c867003a8.LJI;
        }
        C867003a8 c867003a8LIZ = C867003a8.LIZ(c867003a8, false, str, 63);
        C875203bS c875203bS3 = C875203bS.LIZ;
        C875903bZ c875903bZ = this.LLILLL;
        Context context2 = c875903bZ.LIZ;
        C877303bn c877303bn = c875903bZ.LIZLLL;
        Boolean bool = c875903bZ.LJFF;
        List<PaymentMethod> list = c876603bg.LIZ;
        Function1<Boolean, Unit> function1 = c875903bZ.LJI;
        Function1<List<PaymentMethod>, Unit> function12 = c875903bZ.LJII;
        Function1<List<PaymentMethod>, Unit> function13 = c875903bZ.LJIIIIZZ;
        AwS650S0100000_1 awS650S0100000_1 = new AwS650S0100000_1(c875903bZ, 12);
        c875203bS3.getClass();
        C875203bS.LJ(context2, c867003a8LIZ, c877303bn, bool, list, function1, function12, function13, awS650S0100000_1);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BackupPaymentFlowCoordinator@88b3.handleEntryClick$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
