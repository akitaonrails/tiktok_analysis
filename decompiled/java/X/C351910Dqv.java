package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.templatedownload.TemplateProducer$getProducedTemplateZip$job$1", f = "TemplateProducer.kt", l = {74}, m = "invokeSuspend")
public final class C351910Dqv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C352420Drk LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351910Dqv(C352420Drk c352420Drk, String str, Context context, boolean z, boolean z2, boolean z3, InterfaceC1364105Vn<? super C351910Dqv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c352420Drk;
        this.LLILLL = str;
        this.LLILZ = context;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351910Dqv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[PHI: r9
      0x00d1: PHI (r9v7 java.lang.String) = (r9v6 java.lang.String), (r9v12 java.lang.String) binds: [B:38:0x00cd, B:55:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a A[PHI: r9
      0x010a: PHI (r9v11 java.lang.String) = (r9v7 java.lang.String), (r9v7 java.lang.String), (r9v12 java.lang.String) binds: [B:40:0x00d5, B:42:0x00db, B:55:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351910Dqv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
