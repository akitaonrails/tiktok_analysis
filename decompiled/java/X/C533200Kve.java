package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.LokiResourceHandler$downloadEffectIdOnlyBranch$1", f = "LokiResourceHandler.kt", l = {184, 219}, m = "invokeSuspend")
public final class C533200Kve extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public C259800zU LLILZLL;
    public C013C LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public int LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ C533220Kvg LLJILJIL;
    public final /* synthetic */ C533320Kvq LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ InterfaceC531800KtO LLJJ;
    public final /* synthetic */ EffectManager LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533200Kve(C533220Kvg c533220Kvg, C533320Kvq c533320Kvq, String str, InterfaceC531800KtO interfaceC531800KtO, EffectManager effectManager, InterfaceC1364105Vn<? super C533200Kve> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJIL = c533220Kvg;
        this.LLJILJILJ = c533320Kvq;
        this.LLJILLL = str;
        this.LLJJ = interfaceC531800KtO;
        this.LLJJI = effectManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533200Kve c533200Kve = new C533200Kve(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
        c533200Kve.LLJIJIL = obj;
        return c533200Kve;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0098 A[EXC_TOP_SPLITTER, PHI: r2 r3 r4 r5 r8 r9 r10 r11 r12
      0x0098: PHI (r2v4 X.013C) = (r2v3 X.013C), (r2v6 X.013C) binds: [B:16:0x0088, B:66:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r3v5 X.00zU) = (r3v4 X.00zU), (r3v7 X.00zU) binds: [B:16:0x0088, B:66:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r4v3 X.0Kvq) = (r4v2 X.0Kvq), (r4v5 X.0Kvq) binds: [B:16:0x0088, B:66:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r5v3 com.ss.android.ugc.effectmanager.EffectManager) = (r5v2 com.ss.android.ugc.effectmanager.EffectManager), (r5v12 com.ss.android.ugc.effectmanager.EffectManager) binds: [B:16:0x0088, B:66:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r8v2 X.0Kvg) = (r8v1 X.0Kvg), (r8v3 X.0Kvg) binds: [B:16:0x0088, B:66:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v3 java.lang.String) binds: [B:16:0x0088, B:66:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r10v2 X.0KtO) = (r10v1 X.0KtO), (r10v3 X.0KtO) binds: [B:16:0x0088, B:66:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r11v2 java.lang.Object) = (r11v0 java.lang.Object), (r11v3 java.lang.Object) binds: [B:16:0x0088, B:66:0x017b] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r12v2 java.util.Iterator<java.lang.String>) = (r12v1 java.util.Iterator<java.lang.String>), (r12v3 java.util.Iterator<java.lang.String>) binds: [B:16:0x0088, B:66:0x017b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: all -> 0x019c, TRY_LEAVE, TryCatch #9 {all -> 0x019c, blocks: (B:17:0x0098, B:19:0x009e, B:61:0x0141, B:70:0x0182, B:72:0x0188, B:75:0x0190, B:76:0x0195), top: B:138:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[Catch: all -> 0x0133, TryCatch #3 {all -> 0x0133, blocks: (B:27:0x00e4, B:29:0x00e8, B:33:0x00f2, B:39:0x00fe), top: B:126:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #3 {all -> 0x0133, blocks: (B:27:0x00e4, B:29:0x00e8, B:33:0x00f2, B:39:0x00fe), top: B:126:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129 A[Catch: all -> 0x0131, TRY_ENTER, TryCatch #2 {all -> 0x0131, blocks: (B:41:0x011f, B:44:0x0129, B:45:0x0130), top: B:124:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152 A[Catch: all -> 0x025d, TryCatch #10 {all -> 0x025d, blocks: (B:62:0x014c, B:64:0x0152, B:65:0x0179), top: B:140:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182 A[Catch: all -> 0x019c, TRY_ENTER, TryCatch #9 {all -> 0x019c, blocks: (B:17:0x0098, B:19:0x009e, B:61:0x0141, B:70:0x0182, B:72:0x0188, B:75:0x0190, B:76:0x0195), top: B:138:0x0098 }] */
    /* JADX WARN: Type inference failed for: r15v0, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x011f -> B:140:0x014c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0140 -> B:61:0x0141). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:42:0x0127
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C533200Kve.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
