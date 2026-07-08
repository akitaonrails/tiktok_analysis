package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0584, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService$tryShowLoginAfterCopyLinkWithDelay$1$1", f = "ProactiveTriggersService.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0584 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProactiveTriggersService LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0584(ProactiveTriggersService proactiveTriggersService, Activity activity, String str, String str2, InterfaceC1364105Vn<? super AnonymousClass0584> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = proactiveTriggersService;
        this.LLILLJJLI = activity;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0584(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProactiveTriggersService@d7fd.tryShowLoginAfterCopyLinkWithDelay$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILL(this.LLILLJJLI, this.LLILLL, this.LLILZ, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProactiveTriggersService@d7fd.tryShowLoginAfterCopyLinkWithDelay$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
