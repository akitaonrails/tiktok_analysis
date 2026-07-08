package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.187A, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.surpriseset.LotteryPollingView$startAnimationLoop$1", f = "LotteryPollingView.kt", l = {192}, m = "invokeSuspend")
public final class C187A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass1879 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C187A(AnonymousClass1879 anonymousClass1879, InterfaceC1364105Vn<? super C187A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass1879;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C187A(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x0159, TryCatch #0 {all -> 0x0159, blocks: (B:11:0x0027, B:13:0x002d, B:15:0x0040, B:16:0x0048, B:18:0x0068, B:19:0x006a, B:21:0x0085, B:22:0x0087, B:24:0x00a6, B:25:0x00a8, B:27:0x00b1, B:28:0x00b3, B:30:0x00d2, B:31:0x00d6, B:33:0x00df, B:34:0x00e1, B:36:0x0118, B:37:0x011c, B:41:0x0128, B:43:0x0130, B:45:0x0136, B:56:0x015a), top: B:59:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0122 -> B:40:0x0125). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187A.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
