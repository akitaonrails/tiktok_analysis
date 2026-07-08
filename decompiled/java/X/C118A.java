package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.118A, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextMgr$getEffectTextDataFromNet$1", f = "EffectTextMgr.kt", l = {247, 249, 272}, m = "invokeSuspend")
public final class C118A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ AnonymousClass1231 LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118A(AnonymousClass1231 anonymousClass1231, String str, boolean z, String str2, Function0<Unit> function0, InterfaceC1364105Vn<? super C118A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = anonymousClass1231;
        this.LLILZLL = str;
        this.LLIZ = z;
        this.LLIZLLLIL = str2;
        this.LLJ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C118A(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0032, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168 A[PHI: r8 r9
      0x0168: PHI (r8v5 X.1231) = (r8v2 X.1231), (r8v6 X.1231) binds: [B:46:0x015e, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0168: PHI (r9v2 java.util.Iterator) = (r9v1 java.util.Iterator), (r9v3 java.util.Iterator) binds: [B:46:0x015e, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x018f -> B:8:0x0029). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118A.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
