package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.LokiResourceHandler$downloadByPanelResourceBranch$1", f = "LokiResourceHandler.kt", l = {253, 291}, m = "invokeSuspend")
public final class C533210Kvf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public C259800zU LLIZ;
    public C013C LLIZLLLIL;
    public Object LLJ;
    public Object LLJI;
    public int LLJIJIL;
    public /* synthetic */ Object LLJILJIL;
    public final /* synthetic */ C533220Kvg LLJILJILJ;
    public final /* synthetic */ C533320Kvq LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ InterfaceC531800KtO LLJJI;
    public final /* synthetic */ EffectManager LLJJIII;
    public final /* synthetic */ ArrayList<String> LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533210Kvf(C533220Kvg c533220Kvg, C533320Kvq c533320Kvq, String str, InterfaceC531800KtO interfaceC531800KtO, EffectManager effectManager, ArrayList<String> arrayList, InterfaceC1364105Vn<? super C533210Kvf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJILJ = c533220Kvg;
        this.LLJILLL = c533320Kvq;
        this.LLJJ = str;
        this.LLJJI = interfaceC531800KtO;
        this.LLJJIII = effectManager;
        this.LLJJIJI = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533210Kvf c533210Kvf = new C533210Kvf(this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, interfaceC1364105Vn);
        c533210Kvf.LLJILJIL = obj;
        return c533210Kvf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:155:0x0133, B:37:0x0147], limit reached: 155 */
    /* JADX WARN: Path cross not found for [B:37:0x0147, B:155:0x0133], limit reached: 155 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00b7 A[EXC_TOP_SPLITTER, PHI: r3 r6 r7 r8 r9 r10 r11 r16 r17 r18
      0x00b7: PHI (r3v5 X.013C) = (r3v3 X.013C), (r3v10 X.013C) binds: [B:16:0x00a7, B:65:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r6v3 com.ss.android.ugc.effectmanager.EffectManager) = (r6v1 com.ss.android.ugc.effectmanager.EffectManager), (r6v5 com.ss.android.ugc.effectmanager.EffectManager) binds: [B:16:0x00a7, B:65:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r7v3 X.0Kvg) = (r7v1 X.0Kvg), (r7v12 X.0Kvg) binds: [B:16:0x00a7, B:65:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r8v3 X.0Kvq) = (r8v1 X.0Kvq), (r8v4 X.0Kvq) binds: [B:16:0x00a7, B:65:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r9v3 java.util.ArrayList<java.lang.String>) = (r9v1 java.util.ArrayList<java.lang.String>), (r9v4 java.util.ArrayList<java.lang.String>) binds: [B:16:0x00a7, B:65:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r10v3 java.lang.Object) = (r10v0 java.lang.Object), (r10v4 java.lang.Object) binds: [B:16:0x00a7, B:65:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r11v3 java.util.Iterator<java.lang.String>) = (r11v1 java.util.Iterator<java.lang.String>), (r11v4 java.util.Iterator<java.lang.String>) binds: [B:16:0x00a7, B:65:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r16v2 X.00zU) = (r16v0 X.00zU), (r16v3 X.00zU) binds: [B:16:0x00a7, B:65:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r17v2 java.lang.String) = (r17v0 java.lang.String), (r17v3 java.lang.String) binds: [B:16:0x00a7, B:65:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r18v2 X.0KtO) = (r18v0 X.0KtO), (r18v3 X.0KtO) binds: [B:16:0x00a7, B:65:0x01ca] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd A[Catch: all -> 0x01fd, TRY_LEAVE, TryCatch #18 {all -> 0x01fd, blocks: (B:17:0x00b7, B:19:0x00bd), top: B:159:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019d A[Catch: all -> 0x01d1, TRY_LEAVE, TryCatch #10 {all -> 0x01d1, blocks: (B:60:0x0197, B:62:0x019d), top: B:143:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0173 -> B:143:0x0197). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x018b -> B:147:0x018c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:49:0x0181
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
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C533210Kvf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
