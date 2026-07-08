package X;

import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel$fetchGuessDataFix$1", f = "SuggestAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C673310Qb3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SuggestAssemViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ C0QCO LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673310Qb3(long j, C0QCO c0qco, SuggestAssemViewModel suggestAssemViewModel, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = suggestAssemViewModel;
        this.LLILLL = j;
        this.LLILZ = map;
        this.LLILZIL = c0qco;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        SuggestAssemViewModel suggestAssemViewModel = this.LLILLJJLI;
        C673310Qb3 c673310Qb3 = new C673310Qb3(this.LLILLL, this.LLILZIL, suggestAssemViewModel, this.LLILZ, interfaceC1364105Vn);
        c673310Qb3.LL = obj;
        return c673310Qb3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(6:50|3|(1:8)(1:7)|9|(1:11)(1:28)|12)|(6:14|(1:16)(1:27)|17|(3:19|(1:21)(1:26)|22)(0)|45|46)|23|(2:25|29)(1:30)|31|48|32|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5);
        r2 = r19.LLILLJJLI;
        r8 = r2.LLJIJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r8 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        r12 = !r2.LL;
        r1 = r2.LLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        r13 = r1.KF2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        r8.LJ("guess", "response_fail", false, r12, r13, null, X.C2286608xc.LJFF(java.lang.System.currentTimeMillis() - r19.LLILLL), false, false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        X.C1AF0.LJ(r5);
        r1 = r19.LLILLJJLI.LLJIJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        r1.LIZIZ("2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Type inference failed for: r1v21, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.String] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C673310Qb3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
