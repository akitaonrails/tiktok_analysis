package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13Up, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {91, 93}, m = "invokeSuspend")
public final class C20019313Up extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Throwable, InterfaceC1364105Vn<? super Boolean>, Object> LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ InterfaceC220300t7 LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ C05P0<C20019913Uv> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20019313Up(InterfaceC1631620sYq<? super Integer, ? super Throwable, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> interfaceC1631620sYq, Context context, InterfaceC220300t7 interfaceC220300t7, String str, String str2, String str3, String str4, C05P0<C20019913Uv> c05p0, InterfaceC1364105Vn<? super C20019313Up> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = context;
        this.LLILZLL = interfaceC220300t7;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = str4;
        this.LLJIJIL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20019313Up(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(2:54|7)|50|31|13|(3:(1:16)(8:23|(1:27)|28|(1:30)|50|31|13|(0))|18|19)|34|(2:37|e5)|48|49) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r15 == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (((java.lang.Boolean) r15).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b0 -> B:50:0x00b3). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20019313Up.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
