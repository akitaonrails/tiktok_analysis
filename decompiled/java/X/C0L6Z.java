package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.service.AITheaterSocialServiceImpl$onClickAITheaterActionBar$1$4", f = "AITheaterSocialServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0L6Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L6Z(Context context, InterfaceC1364105Vn<? super C0L6Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L6Z(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterSocialServiceImpl@1024.onClickAITheaterActionBar$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C549150LgH c549150LgH = C549150LgH.LIZ;
        Context context = this.LL;
        c549150LgH.getClass();
        C549150LgH.LIZIZ(context);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterSocialServiceImpl@1024.onClickAITheaterActionBar$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
