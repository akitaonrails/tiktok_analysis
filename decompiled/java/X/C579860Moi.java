package X;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Moi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.component.ShootComponent$recordOnDown$1", f = "ShootComponent.kt", l = {138}, m = "invokeSuspend")
public final class C579860Moi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C579870Moj LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C579860Moi(C579870Moj c579870Moj, InterfaceC1364105Vn<? super C579860Moi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c579870Moj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C579860Moi(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShootComponent@ad43.recordOnDown$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("ShootComponent@ad43.recordOnDown$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LLJ.compareAndSet(-1L, System.currentTimeMillis())) {
            if (this.LLILLJJLI.W2()) {
                this.LLILLJJLI.LLJ.set(-1L);
                C2286608xc.LJ(Log.w("ShootComponent", "record onDown blocked due to business conflicts"));
            } else {
                C578890Mn9 c578890Mn9H2 = this.LLILLJJLI.H2();
                c578890Mn9H2.LIZIZ().l60(null);
                c578890Mn9H2.LLJ = true;
                C2288908xz.LIZIZ();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShootComponent@ad43.recordOnDown$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
