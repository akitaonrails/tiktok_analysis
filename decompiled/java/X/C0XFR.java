package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XFR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.sdk.account.OneTapLoginTokenApi$Companion$getCachedTokenInfoHelper$1", f = "OneTapLoginTokenApi.kt", l = {104, 228, 234, 248}, m = "invokeSuspend")
public final class C0XFR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ Function1<C0XFZ, Unit> LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Boolean LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0XFR(Context context, String str, boolean z, boolean z2, long j, Function1<? super C0XFZ, Unit> function1, String str2, Boolean bool, InterfaceC1364105Vn<? super C0XFR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = context;
        this.LLIZ = str;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = j;
        this.LLJIJIL = function1;
        this.LLJILJIL = str2;
        this.LLJILJILJ = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XFR(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bf  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XFR.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
