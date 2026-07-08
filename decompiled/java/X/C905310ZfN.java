package X;

import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import com.ss.android.ugc.aweme.im.streaming.sugar.internal.StreamingSugarImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.sugar.internal.StreamingSugarImpl$sendAndStream$1", f = "StreamingSugarImpl.kt", l = {78, 106, 138}, m = "invokeSuspend")
public final class C905310ZfN extends C09AX implements Function2<InterfaceC346701Wf<? super InterfaceC905820ZgC>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C259800zU LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C905340ZfQ LLILZLL;
    public final /* synthetic */ StreamingSugarImpl LLIZ;
    public final /* synthetic */ EnumC905800ZgA LLIZLLLIL;
    public final /* synthetic */ RetryInfoComponent LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C905310ZfN(C905340ZfQ c905340ZfQ, StreamingSugarImpl streamingSugarImpl, EnumC905800ZgA enumC905800ZgA, RetryInfoComponent retryInfoComponent, InterfaceC1364105Vn<? super C905310ZfN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c905340ZfQ;
        this.LLIZ = streamingSugarImpl;
        this.LLIZLLLIL = enumC905800ZgA;
        this.LLJ = retryInfoComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C905310ZfN c905310ZfN = new C905310ZfN(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c905310ZfN.LLILZIL = obj;
        return c905310ZfN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112 A[Catch: all -> 0x01cc, TryCatch #6 {all -> 0x01cc, blocks: (B:12:0x0037, B:37:0x00ea, B:38:0x00ec, B:40:0x0112, B:42:0x0143, B:43:0x014b, B:45:0x0154, B:48:0x0178, B:14:0x004a, B:29:0x00be, B:31:0x00c4, B:32:0x00c8), top: B:83:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154 A[Catch: all -> 0x01cc, TRY_LEAVE, TryCatch #6 {all -> 0x01cc, blocks: (B:12:0x0037, B:37:0x00ea, B:38:0x00ec, B:40:0x0112, B:42:0x0143, B:43:0x014b, B:45:0x0154, B:48:0x0178, B:14:0x004a, B:29:0x00be, B:31:0x00c4, B:32:0x00c8), top: B:83:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0178 A[Catch: all -> 0x01cc, TRY_ENTER, TryCatch #6 {all -> 0x01cc, blocks: (B:12:0x0037, B:37:0x00ea, B:38:0x00ec, B:40:0x0112, B:42:0x0143, B:43:0x014b, B:45:0x0154, B:48:0x0178, B:14:0x004a, B:29:0x00be, B:31:0x00c4, B:32:0x00c8), top: B:83:0x0012 }] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v22 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C905310ZfN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC905820ZgC> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
