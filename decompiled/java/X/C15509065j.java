package X;

import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.065j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.im.activestatus.ActivityStatusCompensationExternalDataSourceImpl$onGetNewTypingEvent$1", f = "ActivityStatusCompensationExternalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
public final class C15509065j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15511065l LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ Long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15509065j(C15511065l c15511065l, Long l, Long l2, InterfaceC1364105Vn<? super C15509065j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15511065l;
        this.LLILLJJLI = l;
        this.LLILLL = l2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15509065j(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusCompensationExternalDataSourceImpl@63fe.onGetNewTypingEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1231704rr c1231704rr = this.LL.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiving typing event create time ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" sender ");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        this.LL.LIZLLL(Collections.singletonList(new C0NXK(this.LLILLL.toString(), this.LLILLJJLI.longValue() / 1000, 0L)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusCompensationExternalDataSourceImpl@63fe.onGetNewTypingEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
