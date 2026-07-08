package X;

import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.065i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.im.activestatus.ActivityStatusCompensationExternalDataSourceImpl$onGetModifyPropertyMsg$1", f = "ActivityStatusCompensationExternalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
public final class C15508065i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15511065l LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15508065i(C15511065l c15511065l, C869590Y9l c869590Y9l, Long l, Long l2, InterfaceC1364105Vn<? super C15508065i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15511065l;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = l;
        this.LLILZ = l2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15508065i(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusCompensationExternalDataSourceImpl@63fe.onGetModifyPropertyMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1231704rr c1231704rr = this.LL.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("msg sender ");
        sbLIZ.append(this.LLILLJJLI.getSender());
        sbLIZ.append(" updateTimestamp ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" sender ");
        sbLIZ.append(this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        C15511065l c15511065l = this.LL;
        long jLongValue = this.LLILZ.longValue();
        long jLongValue2 = this.LLILLL.longValue();
        C869590Y9l c869590Y9l = this.LLILLJJLI;
        c15511065l.getClass();
        if ((c869590Y9l == null || c869590Y9l.getConversationType() == AbstractC1711506n3.LIZIZ) && C15511065l.LIZJ(jLongValue)) {
            c15511065l.LIZLLL(Collections.singletonList(new C0NXK(String.valueOf(jLongValue), jLongValue2 / 1000, 0L)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusCompensationExternalDataSourceImpl@63fe.onGetModifyPropertyMsg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
