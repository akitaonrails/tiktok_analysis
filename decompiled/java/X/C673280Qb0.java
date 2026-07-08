package X;

import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel$fetchGuessData$1", f = "SuggestAssemViewModel.kt", l = {318, 357, 374}, m = "invokeSuspend")
public final class C673280Qb0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public SuggestAssemViewModel LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ SuggestAssemViewModel LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ C0QCO LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673280Qb0(long j, C0QCO c0qco, SuggestAssemViewModel suggestAssemViewModel, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = suggestAssemViewModel;
        this.LLILZLL = map;
        this.LLIZ = j;
        this.LLIZLLLIL = c0qco;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673280Qb0(this.LLIZ, this.LLIZLLLIL, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:14|15|(1:20)(1:19)|21|(1:23)(1:40)|24|(6:26|(1:28)(1:39)|29|(3:31|(1:33)(1:38)|34)(0)|156|157)|35|(1:37)(1:41)|(1:43)(1:44)|45|(1:47)(1:59)|48|(1:50)(1:58)|51|(1:57)(1:55)|56|168|60|166|61|164|62|(2:64|65)) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0212, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0214, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0216, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f8 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:127:0x01f2, B:129:0x01f8, B:131:0x01fc, B:132:0x0201, B:133:0x0206, B:135:0x020a, B:103:0x01a3, B:105:0x01a9, B:110:0x01c3, B:112:0x01c7, B:116:0x01d6, B:117:0x01d9), top: B:162:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0206 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:127:0x01f2, B:129:0x01f8, B:131:0x01fc, B:132:0x0201, B:133:0x0206, B:135:0x020a, B:103:0x01a3, B:105:0x01a9, B:110:0x01c3, B:112:0x01c7, B:116:0x01d6, B:117:0x01d9), top: B:162:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0222 A[Catch: all -> 0x0268, TryCatch #5 {all -> 0x0268, blocks: (B:145:0x0219, B:147:0x0222, B:149:0x022e, B:150:0x0232, B:151:0x024c, B:153:0x0255), top: B:172:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0255 A[Catch: all -> 0x0268, TryCatch #5 {all -> 0x0268, blocks: (B:145:0x0219, B:147:0x0222, B:149:0x022e, B:150:0x0232, B:151:0x024c, B:153:0x0255), top: B:172:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C673280Qb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
