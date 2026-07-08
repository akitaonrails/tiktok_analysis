package X;

import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel$startPollingMatchStateJobByCoroutine$1", f = "MultiTopLiveRandomMatchViewModel.kt", l = {245, 253, 255, 281, 289, 308}, m = "invokeSuspend")
public final class C481490IuR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ MultiTopLiveRandomMatchViewModel LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ long LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481490IuR(MultiTopLiveRandomMatchViewModel multiTopLiveRandomMatchViewModel, String str, long j, InterfaceC1364105Vn<? super C481490IuR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = multiTopLiveRandomMatchViewModel;
        this.LLJIJIL = str;
        this.LLJILJIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C481490IuR c481490IuR = new C481490IuR(this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c481490IuR.LLJ = obj;
        return c481490IuR;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:23|(1:25)(1:110)|26|137|27|135|28|133|29|131|30|(3:32|111|112)|127|33|125|34|123|35|(1:37)(1:38)|39|(3:41|113|114)|43|60|(7:62|(1:84)(1:66)|67|(1:83)(1:71)|72|(3:74|(1:76)(1:82)|(6:78|(2:80|81)|116|(1:118)|119|120))|(4:86|(2:88|89)|91|(1:93))(1:94))|95|(2:97|(4:101|(2:103|104)|106|(1:108)))|109|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0131, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0133, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0135, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0245  */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0124 -> B:43:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0140 -> B:60:0x014b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C481490IuR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
