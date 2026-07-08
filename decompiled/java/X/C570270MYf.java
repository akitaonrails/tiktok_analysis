package X;

import com.ss.android.ugc.aweme.draft.model.DraftDeleteResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftDeleteOpKt$delete$2", f = "DraftDeleteOp.kt", l = {53, 58, 63}, m = "invokeSuspend")
public final class C570270MYf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C545650Lad>, Object> {
    public long LL;
    public DraftDeleteResult LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C570330MYl LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C570270MYf(C570330MYl c570330MYl, String str, InterfaceC1364105Vn<? super C570270MYf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c570330MYl;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C570270MYf(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|2|(1:(1:(1:(18:7|8|9|(1:11)(1:33)|12|(1:14)(1:32)|15|(1:17)(1:31)|18|(1:20)|21|(4:23|(1:27)|(1:29)|30)|91|73|(1:77)|78|81|82)(2:83|84))(21:63|64|(1:66)(1:72)|67|(1:69)(1:8)|9|(0)(0)|12|(0)(0)|15|(0)(0)|18|(0)|21|(0)|91|73|(2:75|77)|78|81|82))(1:57))(20:34|1a1|51|(4:53|(0)|55|56)|9|(0)(0)|12|(0)(0)|15|(0)(0)|18|(0)|21|(0)|91|73|(0)|78|81|82)|58|(4:60|(4:64|(0)(0)|67|(0)(0))|55|56)(0)|9|(0)(0)|12|(0)(0)|15|(0)(0)|18|(0)|21|(0)|91|73|(0)|78|81|82) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0385, code lost:
    
        if (X.C23250099c.LJI(r32, r7, r5) == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03b1, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03b2, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ef A[PHI: r0 r10
      0x02ef: PHI (r0v6 long) = (r0v4 long), (r0v4 long), (r0v46 long) binds: [B:59:0x02d8, B:61:0x02e5, B:63:0x02e8] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r10v12 com.ss.android.ugc.aweme.draft.model.DraftDeleteResult) = 
      (r10v11 com.ss.android.ugc.aweme.draft.model.DraftDeleteResult)
      (r10v11 com.ss.android.ugc.aweme.draft.model.DraftDeleteResult)
      (r10v15 com.ss.android.ugc.aweme.draft.model.DraftDeleteResult)
     binds: [B:59:0x02d8, B:61:0x02e5, B:63:0x02e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a2 A[Catch: all -> 0x03b1, TryCatch #2 {all -> 0x03b1, blocks: (B:73:0x0390, B:75:0x03a2, B:77:0x03a8, B:78:0x03ad), top: B:91:0x0390 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020 A[PHI: r0 r8
      0x0020: PHI (r0v44 long) = (r0v6 long), (r0v48 long) binds: [B:68:0x036f, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0020: PHI (r8v5 com.ss.android.ugc.aweme.draft.model.DraftDeleteResult) = 
      (r8v3 com.ss.android.ugc.aweme.draft.model.DraftDeleteResult)
      (r8v6 com.ss.android.ugc.aweme.draft.model.DraftDeleteResult)
     binds: [B:68:0x036f, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C570270MYf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C545650Lad> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
