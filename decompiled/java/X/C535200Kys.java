package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AiSelfContentDataSource$fetchAiContentList$1$1", f = "AiSelfContentDataSource.kt", l = {66, 79}, m = "invokeSuspend")
public final class C535200Kys extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C535210Kyt LLILZLL;
    public final /* synthetic */ C09AJ<List<C535020Kya>> LLIZ;
    public final /* synthetic */ C534900KyO LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535200Kys(C535210Kyt c535210Kyt, C09AJ<List<C535020Kya>> c09aj, C534900KyO c534900KyO, InterfaceC1364105Vn<? super C535200Kys> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c535210Kyt;
        this.LLIZ = c09aj;
        this.LLIZLLLIL = c534900KyO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535200Kys(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:13:0x0053, B:40:0x0131], limit reached: 101 */
    /* JADX WARN: Path cross not found for [B:9:0x0045, B:41:0x0134], limit reached: 101 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e2 A[PHI: r0 r2 r3 r4 r6
      0x01e2: PHI (r0v29 long) = (r0v7 long), (r0v31 long) binds: [B:62:0x01d3, B:64:0x01e0] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r2v12 int) = (r2v7 int), (r2v15 int) binds: [B:62:0x01d3, B:64:0x01e0] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r3v9 int) = (r3v5 int), (r3v11 int) binds: [B:62:0x01d3, B:64:0x01e0] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r4v12 java.util.HashSet) = (r4v11 java.util.HashSet), (r4v13 java.util.HashSet) binds: [B:62:0x01d3, B:64:0x01e0] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r6v1 int) = (r6v0 int), (r6v13 int) binds: [B:62:0x01d3, B:64:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0210 -> B:7:0x0028). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C535200Kys.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
