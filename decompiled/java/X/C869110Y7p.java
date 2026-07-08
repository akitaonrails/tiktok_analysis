package X;

import com.bytedance.im.core.proto.Request;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgaroundindex.GetMsgByConvAroundIndexUseCase$pull$resultList$1", f = "GetMsgByConvAroundIndexUseCase.kt", l = {112, 113, 121}, m = "invokeSuspend")
public final class C869110Y7p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0Y7T>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C869090Y7n LLILLL;
    public final /* synthetic */ C869200Y7y LLILZ;
    public final /* synthetic */ Request LLILZIL;
    public final /* synthetic */ Request LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C869110Y7p(C869090Y7n c869090Y7n, C869200Y7y c869200Y7y, Request request, Request request2, String str, int i, InterfaceC1364105Vn<? super C869110Y7p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c869090Y7n;
        this.LLILZ = c869200Y7y;
        this.LLILZIL = request;
        this.LLILZLL = request2;
        this.LLIZ = str;
        this.LLIZLLLIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C869110Y7p c869110Y7p = new C869110Y7p(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c869110Y7p.LLILLJJLI = obj;
        return c869110Y7p;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869110Y7p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0Y7T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
