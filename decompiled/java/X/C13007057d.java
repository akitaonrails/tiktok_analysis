package X;

import android.content.Context;
import com.ss.android.ugc.aweme.signal.OutreachManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.057d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.signal.OutreachManagerImpl$asyncRegisterPSPOutreachCallback$1", f = "OutreachManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C13007057d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OutreachManagerImpl LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13007057d(OutreachManagerImpl outreachManagerImpl, Context context, InterfaceC1364105Vn<? super C13007057d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = outreachManagerImpl;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13007057d(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OutreachManagerImpl@5ef9.asyncRegisterPSPOutreachCallback$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILIIL(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OutreachManagerImpl@5ef9.asyncRegisterPSPOutreachCallback$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
