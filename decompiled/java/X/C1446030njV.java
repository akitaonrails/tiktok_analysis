package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.im.AIGroupShotMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0njV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.dm.service.DMGroupShotEditPageServiceImpl$goToEditPage$1$1", f = "DMGroupShotEditPageServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1446030njV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1390130mHL LL;
    public final /* synthetic */ AIGroupShotMediaModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Intent LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1446030njV(C1390130mHL c1390130mHL, AIGroupShotMediaModel aIGroupShotMediaModel, Context context, Intent intent, InterfaceC1364105Vn<? super C1446030njV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1390130mHL;
        this.LLILLJJLI = aIGroupShotMediaModel;
        this.LLILLL = context;
        this.LLILZ = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1446030njV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMGroupShotEditPageServiceImpl@96c6.goToEditPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C436180H8m.LIZIZ(this.LL);
        if (this.LLILLJJLI.results.size() == 1) {
            C1660680tJi.LIZ().LJIILIIL(this.LLILLL, this.LLILZ);
        } else {
            C1660680tJi.LIZ().LJIJI(this.LLILLL, this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMGroupShotEditPageServiceImpl@96c6.goToEditPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
