package X;

import com.bytedance.im.core.proto.Request;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YI8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher$fetchByWs$2", f = "DefaultRemoteFetcher.kt", l = {}, m = "invokeSuspend")
public final class C0YI8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YI6 LL;
    public final /* synthetic */ Request LLILLJJLI;
    public final /* synthetic */ C871820YIa LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YI8(C0YI6 c0yi6, Request request, C871820YIa c871820YIa, InterfaceC1364105Vn<? super C0YI8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0yi6;
        this.LLILLJJLI = request;
        this.LLILLL = c871820YIa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YI8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultRemoteFetcher@8679.fetchByWs$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0YIC c0yicLIZ = this.LL.LL.LJ().LIZ();
        int iIntValue = this.LLILLJJLI.cmd.intValue();
        long jLongValue = this.LLILLJJLI.sequence_id.longValue();
        int bizId = this.LL.LL.getBizId();
        C871820YIa c871820YIa = this.LLILLL;
        String str = c871820YIa.LIZ;
        byte[] bArr = c871820YIa.LIZIZ;
        if (bArr == null) {
            bArr = new byte[0];
        }
        c0yicLIZ.LIZLLL(jLongValue, str, bArr, iIntValue, bizId);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultRemoteFetcher@8679.fetchByWs$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
