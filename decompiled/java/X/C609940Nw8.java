package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.awemepushlib.interaction.IntelligencePushHelper$doShowAllMessageFromDB$1$1", f = "IntelligencePushHelper.kt", l = {237, 245, 247}, m = "invokeSuspend")
public final class C609940Nw8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C609940Nw8(Context context, InterfaceC1364105Vn<? super C609940Nw8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C609940Nw8(this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
    
        if (X.AnonymousClass0958.LIZIZ(r0, r24) == r2) goto L17;
     */
    /* JADX WARN: Path cross not found for [B:130:0x023c, B:94:0x0294], limit reached: 162 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5 A[PHI: r6 r9 r10 r12 r14 r15
      0x00a5: PHI (r6v2 int) = (r6v3 int), (r6v3 int), (r6v4 int) binds: [B:14:0x0068, B:16:0x0088, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r9v9 java.util.Iterator) = (r9v10 java.util.Iterator), (r9v10 java.util.Iterator), (r9v13 java.util.Iterator) binds: [B:14:0x0068, B:16:0x0088, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r10v6 int) = (r10v7 int), (r10v7 int), (r10v8 int) binds: [B:14:0x0068, B:16:0x0088, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r12v5 long) = (r12v6 long), (r12v6 long), (r12v7 long) binds: [B:14:0x0068, B:16:0x0088, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r14v2 android.content.Context) = (r14v3 android.content.Context), (r14v3 android.content.Context), (r14v6 android.content.Context) binds: [B:14:0x0068, B:16:0x0088, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r15v1 java.lang.String) = (r15v3 java.lang.String), (r15v3 java.lang.String), (r15v5 java.lang.String) binds: [B:14:0x0068, B:16:0x0088, B:19:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c3 -> B:8:0x0026). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609940Nw8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
