package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09O9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$initDmShare$1", f = "SystemShareActivity.kt", l = {1051}, m = "invokeSuspend")
public final class C09O9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SystemShareActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09O9(SystemShareActivity systemShareActivity, InterfaceC1364105Vn<? super C09O9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = systemShareActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09O9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemShareActivity@a089.initDmShare$1");
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
            SystemShareActivity systemShareActivity = this.LLILLJJLI;
            C1402840mbq c1402840mbq = systemShareActivity.LLILLJJLI;
            if (c1402840mbq == null) {
                c1402840mbq = null;
            }
            this.LL = 1;
            if (systemShareActivity.LLLZZIL(c1402840mbq, this) == objLJFF) {
                C1C7U.LIZIZ("SystemShareActivity@a089.initDmShare$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareActivity@a089.initDmShare$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
