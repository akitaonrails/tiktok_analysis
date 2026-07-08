package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0583, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService$tryShowLoginAfterCopyLinkWithDelay$1", f = "ProactiveTriggersService.kt", l = {208, 209}, m = "invokeSuspend")
public final class AnonymousClass0583 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProactiveTriggersService LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0583(ProactiveTriggersService proactiveTriggersService, Activity activity, String str, String str2, InterfaceC1364105Vn<? super AnonymousClass0583> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = proactiveTriggersService;
        this.LLILLL = activity;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0583(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProactiveTriggersService@d7fd.tryShowLoginAfterCopyLinkWithDelay$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProactiveTriggersService@d7fd.tryShowLoginAfterCopyLinkWithDelay$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("ProactiveTriggersService@d7fd.tryShowLoginAfterCopyLinkWithDelay$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        AnonymousClass0584 anonymousClass0584 = new AnonymousClass0584(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, anonymousClass0584) == objLJFF) {
            C1C7U.LIZIZ("ProactiveTriggersService@d7fd.tryShowLoginAfterCopyLinkWithDelay$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProactiveTriggersService@d7fd.tryShowLoginAfterCopyLinkWithDelay$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
